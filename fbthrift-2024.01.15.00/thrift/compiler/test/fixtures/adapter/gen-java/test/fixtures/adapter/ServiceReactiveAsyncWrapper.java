/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.adapter;

import java.util.*;

public class ServiceReactiveAsyncWrapper 
  implements Service.Async {
  private Service.Reactive _delegate;

  public ServiceReactiveAsyncWrapper(Service.Reactive _delegate) {
    
    this._delegate = _delegate;
  }

  public ServiceReactiveAsyncWrapper(org.apache.thrift.ProtocolId _protocolId, reactor.core.publisher.Mono<? extends com.facebook.thrift.client.RpcClient> _rpcClient, Map<String, String> _headers, Map<String, String> _persistentHeaders) {
    this(new ServiceReactiveClient(_protocolId, _rpcClient, _headers, _persistentHeaders));
  }

  @java.lang.Override
  public void close() {
    _delegate.dispose();
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<Integer> func(final String arg1, final String arg2, final test.fixtures.adapter.Foo arg3) {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.func(arg1, arg2, arg3));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<Integer> func(
    final String arg1,
    final String arg2,
    final test.fixtures.adapter.Foo arg3,
    com.facebook.thrift.client.RpcOptions rpcOptions) {
      return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.func(arg1,arg2,arg3, rpcOptions));
  }

  @java.lang.Override
  public com.google.common.util.concurrent.ListenableFuture<com.facebook.thrift.client.ResponseWrapper<Integer>> funcWrapper(
    final String arg1,
    final String arg2,
    final test.fixtures.adapter.Foo arg3,
    com.facebook.thrift.client.RpcOptions rpcOptions) {
    return com.facebook.thrift.util.FutureUtil.toListenableFuture(_delegate.funcWrapper(arg1,arg2,arg3, rpcOptions));
  }

}
