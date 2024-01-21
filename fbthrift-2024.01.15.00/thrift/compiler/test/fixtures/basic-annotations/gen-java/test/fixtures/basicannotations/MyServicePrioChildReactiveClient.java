/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basicannotations;

import static com.facebook.swift.service.SwiftConstants.STICKY_HASH_KEY;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;
import org.apache.thrift.protocol.*;
import org.apache.thrift.ClientPushMetadata;
import org.apache.thrift.InteractionCreate;
import org.apache.thrift.InteractionTerminate;
import com.facebook.thrift.client.ResponseWrapper;
import com.facebook.thrift.client.RpcOptions;
import com.facebook.thrift.util.Readers;

public class MyServicePrioChildReactiveClient extends test.fixtures.basicannotations.MyServicePrioParentReactiveClient
  implements MyServicePrioChild.Reactive {
  private static final AtomicLong _interactionCounter = new AtomicLong(0);

  private static final java.util.Map<Short, com.facebook.thrift.payload.Reader> _pang_EXCEPTION_READERS = java.util.Collections.emptyMap();

  static {
  }

  public MyServicePrioChildReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient) {
    super(_protocolId, _rpcClient);
  }

  public MyServicePrioChildReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(_protocolId, _rpcClient, reactor.core.publisher.Mono.just(_headers != null ? _headers : java.util.Collections.emptyMap()), reactor.core.publisher.Mono.just(_persistentHeaders != null ? _persistentHeaders : java.util.Collections.emptyMap()), new AtomicLong(), ConcurrentHashMap.newKeySet());
  }

  public MyServicePrioChildReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, reactor.core.publisher.Mono<Map<String, String>> _headersMono, reactor.core.publisher.Mono<Map<String, String>> _persistentHeadersMono) {
    this(_protocolId, _rpcClient, _headersMono, _persistentHeadersMono, new AtomicLong(), ConcurrentHashMap.newKeySet());
  }

  public MyServicePrioChildReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders, AtomicLong interactionCounter, Set<Long> activeInteractions) {
    this(_protocolId,_rpcClient, reactor.core.publisher.Mono.just(_headers != null ? _headers : java.util.Collections.emptyMap()), reactor.core.publisher.Mono.just(_persistentHeaders != null ? _persistentHeaders : java.util.Collections.emptyMap()), interactionCounter, activeInteractions);
  }

  public MyServicePrioChildReactiveClient(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, reactor.core.publisher.Mono<Map<String, String>> _headersMono, reactor.core.publisher.Mono<Map<String, String>> _persistentHeadersMono, AtomicLong interactionCounter, Set<Long> activeInteractions) {
    super(_protocolId, _rpcClient, _headersMono, _persistentHeadersMono, interactionCounter, activeInteractions);
  }

  @java.lang.Override
  public void dispose() {}

  private com.facebook.thrift.payload.Writer _createpangWriter() {
    return oprot -> {
      try {

      } catch (Throwable _e) {
        com.facebook.thrift.util.NettyUtil.releaseIfByteBufTProtocol(oprot);
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }

  private static final com.facebook.thrift.payload.Reader _pang_READER = Readers.voidReader();

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.client.ResponseWrapper<Void>> pangWrapper( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return _rpcClient
      .flatMap(_rpc -> getHeaders(rpcOptions).flatMap(headers -> {
        org.apache.thrift.RequestRpcMetadata _metadata = new org.apache.thrift.RequestRpcMetadata.Builder()
                .setName("pang")
                .setKind(org.apache.thrift.RpcKind.SINGLE_REQUEST_SINGLE_RESPONSE)
                .setOtherMetadata(headers)
                .setProtocol(_protocolId)
                .build();

            com.facebook.thrift.payload.ClientRequestPayload<Void> _crp =
                com.facebook.thrift.payload.ClientRequestPayload.create(
                    "MyServicePrioChild",
                    _createpangWriter(),
                    _pang_READER,
                    _pang_EXCEPTION_READERS,
                    _metadata,
                    java.util.Collections.emptyMap());

            return _rpc
                .singleRequestSingleResponse(_crp, rpcOptions).doOnNext(_p -> {if(_p.getException() != null) throw com.facebook.thrift.util.ExceptionUtil.propagate(_p);});
      }));
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> pang( final com.facebook.thrift.client.RpcOptions rpcOptions) {
    return pangWrapper( rpcOptions).then();
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> pang() {
    return pang( com.facebook.thrift.client.RpcOptions.EMPTY);
  }



  private reactor.core.publisher.Mono<Map<String, String>> getHeaders(com.facebook.thrift.client.RpcOptions rpcOptions) {
      Map<String, String> requestHeaders = new HashMap<>();
      if (rpcOptions.getRequestHeaders() != null && !rpcOptions.getRequestHeaders().isEmpty()) {
          requestHeaders.putAll(rpcOptions.getRequestHeaders());
      }

      return _headersMono.defaultIfEmpty(java.util.Collections.emptyMap()).zipWith(_persistentHeadersMono.defaultIfEmpty(java.util.Collections.emptyMap()), (headers, persistentHeaders) -> {
          Map<String, String> result = new HashMap<>();
          result.putAll(requestHeaders);
          result.putAll(headers);
          result.putAll(persistentHeaders);
          return result;
      });
  }
}
