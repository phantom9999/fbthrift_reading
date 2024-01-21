/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.basic_swift_bean;

import java.util.*;
import org.apache.thrift.protocol.*;
import com.facebook.thrift.util.Readers;

public class LegacyServiceRpcServerHandler 
  implements com.facebook.thrift.server.RpcServerHandler {

  private final java.util.Map<String, com.facebook.thrift.server.RpcServerHandler> _methodMap;

  private final LegacyService.Reactive _delegate;

  private final java.util.List<com.facebook.thrift.payload.Reader> _getPointsReaders;

  private final java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers;

  public LegacyServiceRpcServerHandler(LegacyService _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    this(new LegacyServiceBlockingReactiveWrapper(_delegate), _eventHandlers);
  }

  public LegacyServiceRpcServerHandler(LegacyService.Async _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    this(new LegacyServiceAsyncReactiveWrapper(_delegate), _eventHandlers);
  }

  public LegacyServiceRpcServerHandler(LegacyService.Reactive _delegate,
                                    java.util.List<com.facebook.swift.service.ThriftEventHandler> _eventHandlers) {
    
    this._methodMap = new java.util.HashMap<>();
    this._delegate = _delegate;
    this._eventHandlers = _eventHandlers;

    _methodMap.put("getPoints", this);
    _getPointsReaders = _create_getPoints_request_readers();


  }


  private static java.util.List<com.facebook.thrift.payload.Reader> _create_getPoints_request_readers() {
    java.util.List<com.facebook.thrift.payload.Reader> _readerList = new java.util.ArrayList<>();

    
    _readerList.add(Readers.setReader(Readers.stringReader()));
    
    _readerList.add(Readers.i64Reader());

    return _readerList;
  }

  private static com.facebook.thrift.payload.Writer _create_getPoints_response_writer(
      final java.lang.Object _r,
      final com.facebook.swift.service.ContextChain _chain,
      final int _seqId) {
      return oprot -> {
      try {
        oprot.writeStructBegin(com.facebook.thrift.util.RpcPayloadUtil.TSTRUCT);

        
        Map<String, List<Integer>> _iter0 = (Map<String, List<Integer>>)_r;
        oprot.writeFieldBegin(com.facebook.thrift.util.RpcPayloadUtil.MAP_FIELD);
oprot.writeMapBegin(new TMap(TType.STRING, TType.LIST, _iter0.size()));
        for (Map.Entry<String, List<Integer>> _iter1 : _iter0.entrySet()) {
          oprot.writeString(_iter1.getKey());
          
          
oprot.writeListBegin(new TList(TType.I32, _iter1.getValue().size()));
        for (int _iter2 : _iter1.getValue()) {
          oprot.writeI32(_iter2);
        }
        oprot.writeListEnd();
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();

        oprot.writeFieldStop();
        oprot.writeStructEnd();

        _chain.postWrite(_r);
      } catch (Throwable _e) {
        com.facebook.thrift.util.NettyUtil.releaseIfByteBufTProtocol(oprot);
        throw reactor.core.Exceptions.propagate(_e);
      }
    };
  }


  private static reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload>
    _dogetPoints(
    LegacyService.Reactive _delegate,
    com.facebook.thrift.payload.ServerRequestPayload _payload,
    java.util.List<com.facebook.thrift.payload.Reader> _readers,
    com.facebook.swift.service.ContextChain _chain) {
          _chain.preRead();
          java.util.List<java.lang.Object>_data = _payload.getData(_readers);
          java.util.Iterator<java.lang.Object> _iterator = _data.iterator();

          Set<String> key = (Set<String>) _iterator.next();
          long legacyStuff = (long) _iterator.next();

          _chain.postRead(_data);

          reactor.core.publisher.Mono<Map<String, List<Integer>>> _delegateResponse =
            _delegate
              .getPoints(key, legacyStuff)
              .doFirst(() -> com.facebook.nifty.core.RequestContexts.setCurrentContext(_payload.getRequestContext()));

          reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _internalResponse =
            _delegateResponse.map(_response -> {
              _chain.preWrite(_response);
              com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                com.facebook.thrift.util.RpcPayloadUtil.createServerResponsePayload(
                  _payload,
                  _create_getPoints_response_writer(_response, _chain, _payload.getMessageSeqId()));

                return _serverResponsePayload;
            })
            .switchIfEmpty(
              reactor.core.publisher.Mono.fromSupplier(
                () -> {
                  org.apache.thrift.TApplicationException _tApplicationException =
                    new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "method getPoints returned null");
                  return com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
                }
              )
            )
            .<com.facebook.thrift.payload.ServerResponsePayload>onErrorResume(_t -> {
                _chain.preWriteException(_t);
                // exception is not of user declared type
                String _errorMessage = String.format("Internal error processing getPoints: %s", _t.getMessage() == null ? "<null>" : _t.getMessage());
                org.apache.thrift.TApplicationException _tApplicationException =
                    new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.INTERNAL_ERROR, _errorMessage);
                _tApplicationException.initCause(_t);
                com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload =
                    com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(),  _chain);

                return reactor.core.publisher.Mono.just(_serverResponsePayload);
            })
            .doFinally(__ -> {
              _chain.done();
            });

          return _internalResponse;
  }


  @java.lang.Override
  public reactor.core.publisher.Flux<com.facebook.thrift.payload.ServerResponsePayload> singleRequestStreamingResponse(com.facebook.thrift.payload.ServerRequestPayload _payload) {
    final String _name = _payload.getRequestRpcMetadata().getName();
    reactor.core.publisher.Flux<com.facebook.thrift.payload.ServerResponsePayload> _retVal = reactor.core.publisher.Flux.defer(() -> {
    com.facebook.swift.service.ContextChain _chain;
    try {
      _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
    } catch (Throwable _t) {
      org.apache.thrift.TApplicationException _tApplicationException = new org.apache.thrift.TApplicationException(_t.getMessage());
      com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), null);
      return reactor.core.publisher.Flux.just(_serverResponsePayload);
    }

    reactor.core.publisher.Flux<com.facebook.thrift.payload.ServerResponsePayload> _result;
    try {
      switch(_name) {
        default: {
            _chain.preRead();
            org.apache.thrift.TApplicationException _tApplicationException = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.UNKNOWN_METHOD, "no method found with name " + _name);
            com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
            return reactor.core.publisher.Flux.just(_serverResponsePayload);
        }
      }
    } catch (org.apache.thrift.TApplicationException _tApplicationException) {
      com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
      return reactor.core.publisher.Flux.just(_serverResponsePayload);
    } catch (Throwable _t) {
      _result = reactor.core.publisher.Flux.error(_t);
    }
    return _result;
    });
    if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
      _retVal = _retVal.subscribeOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
    }
    return _retVal;
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> singleRequestSingleResponse(com.facebook.thrift.payload.ServerRequestPayload _payload) {
    final String _name = _payload.getRequestRpcMetadata().getName();
    reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _retVal = reactor.core.publisher.Mono.defer(() -> {
    com.facebook.swift.service.ContextChain _chain;
    try {
      _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
    } catch (Throwable _t) {
      org.apache.thrift.TApplicationException _tApplicationException = new org.apache.thrift.TApplicationException(_t.getMessage());
      com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), null);
      return reactor.core.publisher.Mono.just(_serverResponsePayload);
    }

    reactor.core.publisher.Mono<com.facebook.thrift.payload.ServerResponsePayload> _result;
    try {
      switch (_name) {
        case "getPoints":
          _result = _dogetPoints(_delegate, _payload, _getPointsReaders, _chain);
        break;
        default: {
            _chain.preRead();
            org.apache.thrift.TApplicationException _tApplicationException = new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.UNKNOWN_METHOD, "no method found with name " + _name);
            com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
            return reactor.core.publisher.Mono.just(_serverResponsePayload);
        }
      }
    } catch (org.apache.thrift.TApplicationException _tApplicationException) {
      com.facebook.thrift.payload.ServerResponsePayload _serverResponsePayload = com.facebook.thrift.util.RpcPayloadUtil.fromTApplicationException(_tApplicationException, _payload.getRequestRpcMetadata(), _chain);
      return reactor.core.publisher.Mono.just(_serverResponsePayload);
    } catch (Throwable _t) {
      _result = reactor.core.publisher.Mono.error(_t);
    }

    return _result;
    });

    if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
      _retVal = _retVal.subscribeOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
    }
    return _retVal;
  }

  @java.lang.Override
  public reactor.core.publisher.Mono<Void> singleRequestNoResponse(com.facebook.thrift.payload.ServerRequestPayload _payload) {
    final String _name = _payload.getRequestRpcMetadata().getName();

    reactor.core.publisher.Mono<Void> _retVal = reactor.core.publisher.Mono.defer(() -> {
    com.facebook.swift.service.ContextChain _chain;
    try {
      _chain = new com.facebook.swift.service.ContextChain(_eventHandlers, _name, _payload.getRequestContext());
    } catch (Throwable _t) {
      return reactor.core.publisher.Mono.error(_t);
    }

    reactor.core.publisher.Mono<Void> _result;
    try {
      switch (_name) {
        default: {
          _result = reactor.core.publisher.Mono.error(new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.UNKNOWN_METHOD, "no method found with name " + _name));
        }
      }
    } catch (Throwable _t) {
      _result = reactor.core.publisher.Mono.error(_t);
    }

    return _result;
    });

    if (com.facebook.thrift.util.resources.RpcResources.isForceExecutionOffEventLoop()) {
      _retVal = _retVal.subscribeOn(com.facebook.thrift.util.resources.RpcResources.getOffLoopScheduler());
    }
    return _retVal;
  }

  public java.util.Map<String, com.facebook.thrift.server.RpcServerHandler> getMethodMap() {
      return _methodMap;
  }

}
