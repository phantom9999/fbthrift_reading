/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

#include <folly/io/async/fdsock/AsyncFdSocket.h>
#include <thrift/lib/cpp2/transport/rocket/RocketException.h>

#include "FdSocket.h"

namespace apache {
namespace thrift {
namespace rocket {

using TryFds = folly::Try<folly::SocketFds>;

TryFds popReceivedFdsFromSocket(
    folly::AsyncTransport* transport,
    size_t expectedNumFds,
    folly::SocketFds::SeqNum expectedFdSeqNum) {
  if (expectedNumFds == 0) {
    return TryFds{folly::SocketFds{}};
  }
  if (auto fdSock = transport->getUnderlyingTransport<folly::AsyncFdSocket>()) {
    auto fds = fdSock->popNextReceivedFds();
    const auto numFds = fds.size();
    const auto fdSeqNum = fds.getFdSocketSeqNum(); // DFATALs if `fds.empty()`
    if (numFds != expectedNumFds || fdSeqNum != expectedFdSeqNum) {
      auto error = fmt::format(
          "`{}` got {} FDs with seq num {}, but expected {} / {}",
          __func__,
          numFds,
          fdSeqNum,
          expectedNumFds,
          expectedFdSeqNum);
      LOG(DFATAL) << error;
      return TryFds{folly::make_exception_wrapper<RocketException>(
          ErrorCode::INVALID, error)};
    }
    return TryFds{std::move(fds)};
  }
  const char* error =
      ("`populatePayloadReceivedFds` called when the underlying "
       "socket was not a `AsyncFdSocket`");
  LOG(DFATAL) << error;
  return TryFds{folly::make_exception_wrapper<RocketException>(
      ErrorCode::INVALID, error)};
}

void writeChainWithFds(
    folly::AsyncTransport* transport,
    folly::AsyncTransport::WriteCallback* callback,
    std::unique_ptr<folly::IOBuf> buf,
    folly::SocketFds fds) {
  auto fdSocket = transport->getUnderlyingTransport<folly::AsyncFdSocket>();
  if (!fdSocket) {
    LOG(DFATAL) << "`writeChainWithFds` called when the underlying socket "
                << "was not a `AsyncFdSocket`: " << transport;
    // Fail back to sending data without FDs, and discard the FDs right
    // away.  The recipient will see a request that needs FDs without the
    // corresponding FDs on the wire, and fail out.
    transport->writeChain(callback, std::move(buf));
    return;
  }
  fdSocket->writeChainWithFds(callback, std::move(buf), std::move(fds));
}

folly::SocketFds::SeqNum injectFdSocketSeqNumIntoFdsToSend(
    folly::AsyncTransport* transport, folly::SocketFds* fds) {
  auto fdSocket = transport->getUnderlyingTransport<folly::AsyncFdSocket>();
  if (!fdSocket) {
    LOG(DFATAL) << "`injectFdSocketSeqNumIntoFdsToSend` called when the "
                << "socket is not an `AsyncFdSocket`: " << transport;
    // Since `AsyncFdSocket` sequence numbers are guaranteed non-negative (even
    // with overflow), this will cause the receiving side to treat the request
    // as an error.
    //
    // NB: Even with 2's complement overflow, reaching -1 at 1M QPS with
    // 253 FDs per request would take require a socket to live ~2000 years.
    return -1;
  }
  return fdSocket->injectSocketSeqNumIntoFdsToSend(fds);
}

} // namespace rocket
} // namespace thrift
} // namespace apache
