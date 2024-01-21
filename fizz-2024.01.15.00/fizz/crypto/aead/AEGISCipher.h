/*
 *  Copyright (c) Meta Platforms, Inc. and affiliates.
 *  All rights reserved.
 *
 *  This source code is licensed under the BSD-style license found in the
 *  LICENSE file in the root directory of this source tree.
 */

#pragma once
#include <fizz/fizz-config.h>

#if FIZZ_BUILD_AEGIS

#include <fizz/crypto/aead/Aead.h>
#include <fizz/crypto/aead/IOBufUtil.h>
#include <fizz/third-party/libsodium-aegis/aegis.h>
#include <folly/Conv.h>
#include <folly/Memory.h>
#include <folly/Range.h>
#include <folly/String.h>
#include <folly/lang/Bits.h>
#include <folly/ssl/OpenSSLPtrTypes.h>

namespace fizz {
class AEGISCipher : public Aead {
 public:
  using AegisEVPCtx = fizz_aegis_evp_ctx;
  using InitStateFn = int (*const)(
      const unsigned char* key,
      const unsigned char* nonce,
      AegisEVPCtx* ctx);
  using AadUpdateFn = int (*const)(
      const unsigned char* ad,
      unsigned long long adlen,
      AegisEVPCtx* ctx);
  using AadFinalFn = int (*const)(AegisEVPCtx* ctx);
  using EncryptUpdateFn = int (*const)(
      unsigned char* c,
      unsigned long long* clen_p,
      const unsigned char* m,
      unsigned long long mlen,
      AegisEVPCtx* ctx);
  using EncryptFinalFn = int (*const)(
      unsigned char* c,
      unsigned long long* c_writtenlen_p,
      unsigned char* mac,
      AegisEVPCtx* ctx);
  using DecryptUpdateFn = int (*const)(
      unsigned char* m,
      unsigned long long* outlen,
      const unsigned char* c,
      unsigned long long clen,
      AegisEVPCtx* ctx);
  using DecryptFinalFn = int (*const)(
      unsigned char* m,
      unsigned long long* outlen,
      const unsigned char* mac,
      AegisEVPCtx* ctx);

  static constexpr size_t kMaxIVLength = 32;
  static constexpr size_t kTagLength = 16;
  /* The Minimum Message Size (MMS), in bytes, that is required to perform one
  full internal AEGIS state update. */
  static constexpr size_t kAEGIS128LMMS = 2 * 16;
  static constexpr size_t kAEGIS256MMS = 16;

  static std::unique_ptr<Aead> make128L();
  static std::unique_ptr<Aead> make256();

  void setKey(TrafficKey trafficKey) override;
  folly::Optional<TrafficKey> getKey() const override;

  size_t keyLength() const override {
    return keyLength_;
  }

  size_t ivLength() const override {
    return ivLength_;
  }

  std::unique_ptr<folly::IOBuf> doEncrypt(
      std::unique_ptr<folly::IOBuf>&& plaintext,
      const folly::IOBuf* associatedData,
      folly::ByteRange iv,
      folly::ByteRange key,
      Aead::AeadOptions options) const;

  folly::Optional<std::unique_ptr<folly::IOBuf>> doDecrypt(
      std::unique_ptr<folly::IOBuf>&& ciphertext,
      const folly::IOBuf* associatedData,
      folly::ByteRange iv,
      folly::ByteRange key,
      folly::MutableByteRange tagOut,
      bool inPlace) const;

  std::unique_ptr<folly::IOBuf> encrypt(
      std::unique_ptr<folly::IOBuf>&& plaintext,
      const folly::IOBuf* associatedData,
      uint64_t seqNum,
      Aead::AeadOptions options) const override;

  std::unique_ptr<folly::IOBuf> encrypt(
      std::unique_ptr<folly::IOBuf>&& plaintext,
      const folly::IOBuf* associatedData,
      folly::ByteRange nonce,
      Aead::AeadOptions options) const override;

  // TODO: (T136805571) We will add implementation for inplace encryption later
  std::unique_ptr<folly::IOBuf> inplaceEncrypt(
      std::unique_ptr<folly::IOBuf>&& plaintext,
      const folly::IOBuf* associatedData,
      uint64_t seqNum) const override;

  folly::Optional<std::unique_ptr<folly::IOBuf>> tryDecrypt(
      std::unique_ptr<folly::IOBuf>&& ciphertext,
      const folly::IOBuf* associatedData,
      uint64_t seqNum,
      Aead::AeadOptions options) const override;

  folly::Optional<std::unique_ptr<folly::IOBuf>> tryDecrypt(
      std::unique_ptr<folly::IOBuf>&& ciphertext,
      const folly::IOBuf* associatedData,
      folly::ByteRange nonce,
      Aead::AeadOptions options) const override;

  size_t getCipherOverhead() const override;

  void setEncryptedBufferHeadroom(size_t headroom) override {
    headroom_ = headroom;
  }

  InitStateFn initstate_;
  AadUpdateFn aadUpdate_;
  AadFinalFn aadFinal_;
  EncryptUpdateFn encryptUpdate_;
  EncryptFinalFn encryptFinal_;
  DecryptUpdateFn decryptUpdate_;
  DecryptFinalFn decryptFinal_;

 private:
  AEGISCipher(
      InitStateFn init,
      AadUpdateFn aadUpdate,
      AadFinalFn aadFinal_,
      EncryptUpdateFn encryptUpdate,
      EncryptFinalFn encryptFinal,
      DecryptUpdateFn decryptUpdate,
      DecryptFinalFn decryptFinal,
      size_t keyLength,
      size_t ivLength,
      size_t mms);

  TrafficKey trafficKey_;
  folly::ByteRange trafficIvKey_;
  folly::ByteRange trafficKeyKey_;
  /* When allocating a new IOBUF for encryption, we need to save 5 bytes of
  headroom for TLS 1.3 record header. */
  size_t headroom_{5};

  // set by the ctor
  size_t keyLength_;
  size_t ivLength_;
  int mms_;
};
} // namespace fizz
#endif
