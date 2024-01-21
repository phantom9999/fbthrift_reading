#
# Autogenerated by Thrift
#
# DO NOT EDIT
#  @generated
#

from __future__ import annotations

from abc import ABCMeta
import typing as _typing

import folly.iobuf as _fbthrift_iobuf

import apache.thrift.metadata.thrift_types as _fbthrift_metadata
from thrift.python.serializer import serialize_iobuf, deserialize, Protocol
from thrift.python.server import ServiceInterface, RpcKind, PythonUserException

import module.thrift_types
import module.thrift_metadata

class PubSubStreamingServiceInterface(
    ServiceInterface,
    metaclass=ABCMeta
):

    @staticmethod
    def service_name() -> bytes:
        return b"PubSubStreamingService"

    # pyre-ignore[3]: it can return anything
    def getFunctionTable(self) -> _typing.Mapping[bytes, _typing.Callable[..., _typing.Any]]:
        functionTable = {
            b"returnstream": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_returnstream),
            b"streamthrows": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_streamthrows),
            b"servicethrows": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_servicethrows),
            b"servicethrows2": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_servicethrows2),
            b"boththrows": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_boththrows),
            b"responseandstreamstreamthrows": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_responseandstreamstreamthrows),
            b"responseandstreamservicethrows": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_responseandstreamservicethrows),
            b"responseandstreamboththrows": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_responseandstreamboththrows),
            b"returnstreamFast": (RpcKind.SINGLE_REQUEST_STREAMING_RESPONSE, self._fbthrift__handler_returnstreamFast),
        }
        return {**super().getFunctionTable(), **functionTable}

    @staticmethod
    def __get_thrift_name__() -> str:
        return "module.PubSubStreamingService"

    @staticmethod
    def __get_metadata__() -> _fbthrift_metadata.ThriftMetadata:
        return module.thrift_metadata.gen_metadata_service_PubSubStreamingService()

    @staticmethod
    def __get_metadata_service_response__() -> _fbthrift_metadata.ThriftServiceMetadataResponse:
        return module.thrift_metadata._fbthrift_metadata_service_response_PubSubStreamingService()



    def returnstream(
            self,
            i32_from: int,
            i32_to: int
        ) -> _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]:
        raise NotImplementedError("async def returnstream is not implemented")

    async def _fbthrift__stream_wrapper_returnstream(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        async for item in stream_generator:
            yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_returnstream_result_stream(success=item), protocol)

    async def _fbthrift__handler_returnstream(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_returnstream_args, args, protocol)
        value = self.returnstream(args_struct.i32_from,args_struct.i32_to,)
        stream = value
        if not isinstance(stream, _typing.AsyncIterator):
            stream = await stream
        return_struct = module.thrift_types._fbthrift_PubSubStreamingService_returnstream_result()
        return_stream = self._fbthrift__stream_wrapper_returnstream(stream, protocol)
        

        return (serialize_iobuf(return_struct, protocol), return_stream)


    def streamthrows(
            self,
            foo: int
        ) -> _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]:
        raise NotImplementedError("async def streamthrows is not implemented")

    async def _fbthrift__stream_wrapper_streamthrows(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        try:
            async for item in stream_generator:
                yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_streamthrows_result_stream(success=item), protocol)
        except module.thrift_types.FooStreamEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_streamthrows_result_stream(e=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooStreamEx', str(e), buf)
            raise exp

    async def _fbthrift__handler_streamthrows(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_streamthrows_args, args, protocol)
        value = self.streamthrows(args_struct.foo,)
        stream = value
        if not isinstance(stream, _typing.AsyncIterator):
            stream = await stream
        return_struct = module.thrift_types._fbthrift_PubSubStreamingService_streamthrows_result()
        return_stream = self._fbthrift__stream_wrapper_streamthrows(stream, protocol)
        

        return (serialize_iobuf(return_struct, protocol), return_stream)


    def servicethrows(
            self,
            foo: int
        ) -> _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]:
        raise NotImplementedError("async def servicethrows is not implemented")

    async def _fbthrift__stream_wrapper_servicethrows(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        async for item in stream_generator:
            yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_servicethrows_result_stream(success=item), protocol)

    async def _fbthrift__handler_servicethrows(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_servicethrows_args, args, protocol)
        try:
            value = self.servicethrows(args_struct.foo,)
            stream = value
            if not isinstance(stream, _typing.AsyncIterator):
                stream = await stream
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_servicethrows_result()
            return_stream = self._fbthrift__stream_wrapper_servicethrows(stream, protocol)
            
        except module.thrift_types.FooEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_servicethrows_result(e=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooEx', str(e), buf)
            raise exp


        return (serialize_iobuf(return_struct, protocol), return_stream)


    def servicethrows2(
            self,
            foo: int
        ) -> _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]:
        raise NotImplementedError("async def servicethrows2 is not implemented")

    async def _fbthrift__stream_wrapper_servicethrows2(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        async for item in stream_generator:
            yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_servicethrows2_result_stream(success=item), protocol)

    async def _fbthrift__handler_servicethrows2(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_servicethrows2_args, args, protocol)
        try:
            value = self.servicethrows2(args_struct.foo,)
            stream = value
            if not isinstance(stream, _typing.AsyncIterator):
                stream = await stream
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_servicethrows2_result()
            return_stream = self._fbthrift__stream_wrapper_servicethrows2(stream, protocol)
            
        except module.thrift_types.FooEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_servicethrows2_result(e1=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooEx', str(e), buf)
            raise exp

        except module.thrift_types.FooEx2 as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_servicethrows2_result(e2=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooEx2', str(e), buf)
            raise exp


        return (serialize_iobuf(return_struct, protocol), return_stream)


    def boththrows(
            self,
            foo: int
        ) -> _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]:
        raise NotImplementedError("async def boththrows is not implemented")

    async def _fbthrift__stream_wrapper_boththrows(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        try:
            async for item in stream_generator:
                yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_boththrows_result_stream(success=item), protocol)
        except module.thrift_types.FooStreamEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_boththrows_result_stream(e=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooStreamEx', str(e), buf)
            raise exp

    async def _fbthrift__handler_boththrows(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_boththrows_args, args, protocol)
        try:
            value = self.boththrows(args_struct.foo,)
            stream = value
            if not isinstance(stream, _typing.AsyncIterator):
                stream = await stream
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_boththrows_result()
            return_stream = self._fbthrift__stream_wrapper_boththrows(stream, protocol)
            
        except module.thrift_types.FooEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_boththrows_result(e=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooEx', str(e), buf)
            raise exp


        return (serialize_iobuf(return_struct, protocol), return_stream)


    async def responseandstreamstreamthrows(
            self,
            foo: int
        ) -> _typing.Tuple[int, _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]]:
        raise NotImplementedError("async def responseandstreamstreamthrows is not implemented")

    async def _fbthrift__stream_wrapper_responseandstreamstreamthrows(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        try:
            async for item in stream_generator:
                yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamstreamthrows_result_stream(success=item), protocol)
        except module.thrift_types.FooStreamEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamstreamthrows_result_stream(e=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooStreamEx', str(e), buf)
            raise exp

    async def _fbthrift__handler_responseandstreamstreamthrows(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamstreamthrows_args, args, protocol)
        value = self.responseandstreamstreamthrows(args_struct.foo,)
        value, stream = await value
        if not isinstance(stream, _typing.AsyncIterator):
            stream = await stream
        return_struct = module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamstreamthrows_result(success=value)
        return_stream = self._fbthrift__stream_wrapper_responseandstreamstreamthrows(stream, protocol)
        

        return (serialize_iobuf(return_struct, protocol), return_stream)


    async def responseandstreamservicethrows(
            self,
            foo: int
        ) -> _typing.Tuple[int, _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]]:
        raise NotImplementedError("async def responseandstreamservicethrows is not implemented")

    async def _fbthrift__stream_wrapper_responseandstreamservicethrows(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        async for item in stream_generator:
            yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamservicethrows_result_stream(success=item), protocol)

    async def _fbthrift__handler_responseandstreamservicethrows(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamservicethrows_args, args, protocol)
        try:
            value = self.responseandstreamservicethrows(args_struct.foo,)
            value, stream = await value
            if not isinstance(stream, _typing.AsyncIterator):
                stream = await stream
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamservicethrows_result(success=value)
            return_stream = self._fbthrift__stream_wrapper_responseandstreamservicethrows(stream, protocol)
            
        except module.thrift_types.FooEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamservicethrows_result(e=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooEx', str(e), buf)
            raise exp


        return (serialize_iobuf(return_struct, protocol), return_stream)


    async def responseandstreamboththrows(
            self,
            foo: int
        ) -> _typing.Tuple[int, _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]]:
        raise NotImplementedError("async def responseandstreamboththrows is not implemented")

    async def _fbthrift__stream_wrapper_responseandstreamboththrows(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        try:
            async for item in stream_generator:
                yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamboththrows_result_stream(success=item), protocol)
        except module.thrift_types.FooStreamEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamboththrows_result_stream(e=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooStreamEx', str(e), buf)
            raise exp

    async def _fbthrift__handler_responseandstreamboththrows(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamboththrows_args, args, protocol)
        try:
            value = self.responseandstreamboththrows(args_struct.foo,)
            value, stream = await value
            if not isinstance(stream, _typing.AsyncIterator):
                stream = await stream
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamboththrows_result(success=value)
            return_stream = self._fbthrift__stream_wrapper_responseandstreamboththrows(stream, protocol)
            
        except module.thrift_types.FooEx as e:
            return_struct = module.thrift_types._fbthrift_PubSubStreamingService_responseandstreamboththrows_result(e=e)
            buf = serialize_iobuf(return_struct, protocol)
            exp = PythonUserException('FooEx', str(e), buf)
            raise exp


        return (serialize_iobuf(return_struct, protocol), return_stream)


    def returnstreamFast(
            self,
            i32_from: int,
            i32_to: int
        ) -> _typing.Awaitable[_typing.AsyncIterator[int]] | _typing.AsyncIterator[int]:
        raise NotImplementedError("async def returnstreamFast is not implemented")

    async def _fbthrift__stream_wrapper_returnstreamFast(self, stream_generator: _typing.AsyncIterator[int], protocol: Protocol) -> _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]:
        async for item in stream_generator:
            yield serialize_iobuf(module.thrift_types._fbthrift_PubSubStreamingService_returnstreamFast_result_stream(success=item), protocol)

    async def _fbthrift__handler_returnstreamFast(self, args: _fbthrift_iobuf.IOBuf, protocol: Protocol) -> _typing.Tuple[_fbthrift_iobuf.IOBuf, _typing.AsyncIterator[_fbthrift_iobuf.IOBuf]]:
        args_struct = deserialize(module.thrift_types._fbthrift_PubSubStreamingService_returnstreamFast_args, args, protocol)
        value = self.returnstreamFast(args_struct.i32_from,args_struct.i32_to,)
        stream = value
        if not isinstance(stream, _typing.AsyncIterator):
            stream = await stream
        return_struct = module.thrift_types._fbthrift_PubSubStreamingService_returnstreamFast_result()
        return_stream = self._fbthrift__stream_wrapper_returnstreamFast(stream, protocol)
        

        return (serialize_iobuf(return_struct, protocol), return_stream)
