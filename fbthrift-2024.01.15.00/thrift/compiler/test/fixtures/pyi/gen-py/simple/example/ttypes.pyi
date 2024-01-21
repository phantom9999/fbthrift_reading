#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

# pyre-unsafe

import typing as __T  # sometimes `t` is used as a field name

from thrift import Thrift
from thrift.protocol.TProtocol import TProtocolBase

__property__ = property  # sometimes `property` is used as a field name

import simple.dependent.ttypes

UTF8STRINGS: bool


class AnEnum(int):
    ONE: __T.ClassVar[AnEnum]
    TWO: __T.ClassVar[AnEnum]
    THREE: __T.ClassVar[AnEnum]
    FOUR: __T.ClassVar[AnEnum]

    _VALUES_TO_NAMES: __T.ClassVar[__T.Dict[AnEnum, str]]
    _NAMES_TO_VALUES: __T.ClassVar[__T.Dict[str, AnEnum]]


class SimpleException(Thrift.TException):
    thrift_spec: __T.Tuple[__T.Optional[__T.Tuple[int, int, str, __T.Any, __T.Optional[int], int]]]
    thrift_field_annotations: __T.Dict[int, __T.Dict[str, str]]
    thrift_struct_annotations: __T.Dict[str, str]

    def __init__(
        self,
        err_code: __T.Optional[int] = ...
    ) -> None:
        ...

    @__property__
    def err_code(self) -> int: ...
    @err_code.setter
    def err_code(self, value: __T.Optional[int]) -> None: ...


    def isUnion(self) -> bool: ...
    def checkRequired(self) -> None: ...
    def read(self, iprot: TProtocolBase) -> None: ...
    @__T.overload
    def readFromJson(self, json: __T.Dict[str, __T.Any], is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    @__T.overload
    def readFromJson(self, json: str, is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    def write(self, oprot: TProtocolBase) -> None: ...
    def __eq__(self, other: __T.Any) -> bool: ...
    def __ne__(self, other: __T.Any) -> bool: ...
    def __dir__(self) -> __T.Sequence[str]: ...
    def _to_python(self) -> "simple.example.shared.thrift_types.SimpleException": ...   # type: ignore
    def _to_py3(self) -> "simple.example.shared.types.SimpleException": ...   # type: ignore
    def _to_py_deprecated(self) -> SimpleException: ...


class MessageException(Thrift.TException):
    thrift_spec: __T.Tuple[__T.Optional[__T.Tuple[int, int, str, __T.Any, __T.Optional[int], int]]]
    thrift_field_annotations: __T.Dict[int, __T.Dict[str, str]]
    thrift_struct_annotations: __T.Dict[str, str]

    def __init__(
        self,
        message: __T.Optional[str] = ...,
        err_code: __T.Optional[int] = ...
    ) -> None:
        ...

    @__property__
    def message(self) -> str: ...
    @message.setter
    def message(self, value: __T.Optional[str]) -> None: ...
    @__property__
    def err_code(self) -> int: ...
    @err_code.setter
    def err_code(self, value: __T.Optional[int]) -> None: ...


    def isUnion(self) -> bool: ...
    def checkRequired(self) -> None: ...
    def read(self, iprot: TProtocolBase) -> None: ...
    @__T.overload
    def readFromJson(self, json: __T.Dict[str, __T.Any], is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    @__T.overload
    def readFromJson(self, json: str, is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    def write(self, oprot: TProtocolBase) -> None: ...
    def __eq__(self, other: __T.Any) -> bool: ...
    def __ne__(self, other: __T.Any) -> bool: ...
    def __dir__(self) -> __T.Sequence[str]: ...
    def _to_python(self) -> "simple.example.shared.thrift_types.MessageException": ...   # type: ignore
    def _to_py3(self) -> "simple.example.shared.types.MessageException": ...   # type: ignore
    def _to_py_deprecated(self) -> MessageException: ...


class SimpleStruct:
    thrift_spec: __T.Tuple[__T.Optional[__T.Tuple[int, int, str, __T.Any, __T.Optional[int], int]]]
    thrift_field_annotations: __T.Dict[int, __T.Dict[str, str]]
    thrift_struct_annotations: __T.Dict[str, str]

    def __init__(
        self,
        is_on: __T.Optional[bool] = ...,
        tiny_int: int = ...,
        small_int: __T.Optional[int] = ...,
        nice_sized_int: __T.Optional[int] = ...,
        big_int: __T.Optional[int] = ...,
        coarse_real: float = ...,
        precise_real: __T.Optional[float] = ...,
        a_str: __T.Optional[str] = ...,
        a_bytes: __T.Optional[bytes] = ...
    ) -> None:
        ...

    @__property__
    def is_on(self) -> bool: ...
    @is_on.setter
    def is_on(self, value: __T.Optional[bool]) -> None: ...
    @__property__
    def tiny_int(self) -> int: ...
    @tiny_int.setter
    def tiny_int(self, value: int) -> None: ...
    @__property__
    def small_int(self) -> __T.Optional[int]: ...
    @small_int.setter
    def small_int(self, value: __T.Optional[int]) -> None: ...
    @__property__
    def nice_sized_int(self) -> __T.Optional[int]: ...
    @nice_sized_int.setter
    def nice_sized_int(self, value: __T.Optional[int]) -> None: ...
    @__property__
    def big_int(self) -> int: ...
    @big_int.setter
    def big_int(self, value: __T.Optional[int]) -> None: ...
    @__property__
    def coarse_real(self) -> float: ...
    @coarse_real.setter
    def coarse_real(self, value: float) -> None: ...
    @__property__
    def precise_real(self) -> float: ...
    @precise_real.setter
    def precise_real(self, value: __T.Optional[float]) -> None: ...
    @__property__
    def a_str(self) -> str: ...
    @a_str.setter
    def a_str(self, value: __T.Optional[str]) -> None: ...
    @__property__
    def a_bytes(self) -> __T.Optional[bytes]: ...
    @a_bytes.setter
    def a_bytes(self, value: __T.Optional[bytes]) -> None: ...


    def isUnion(self) -> bool: ...
    def checkRequired(self) -> None: ...
    def read(self, iprot: TProtocolBase) -> None: ...
    @__T.overload
    def readFromJson(self, json: __T.Dict[str, __T.Any], is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    @__T.overload
    def readFromJson(self, json: str, is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    def write(self, oprot: TProtocolBase) -> None: ...
    def __eq__(self, other: __T.Any) -> bool: ...
    def __ne__(self, other: __T.Any) -> bool: ...
    def __dir__(self) -> __T.Sequence[str]: ...
    def _to_python(self) -> "simple.example.shared.thrift_types.SimpleStruct": ...   # type: ignore
    def _to_py3(self) -> "simple.example.shared.types.SimpleStruct": ...   # type: ignore
    def _to_py_deprecated(self) -> SimpleStruct: ...


class ComplexStruct:
    thrift_spec: __T.Tuple[__T.Optional[__T.Tuple[int, int, str, __T.Any, __T.Optional[int], int]]]
    thrift_field_annotations: __T.Dict[int, __T.Dict[str, str]]
    thrift_struct_annotations: __T.Dict[str, str]

    def __init__(
        self,
        structOne: __T.Optional[SimpleStruct] = ...,
        structTwo: __T.Optional[SimpleStruct] = ...,
        an_integer: __T.Optional[int] = ...,
        name: __T.Optional[str] = ...,
        an_enum: __T.Optional[AnEnum] = ...,
        values: __T.Optional[__T.List[int]] = ...,
        structs: __T.Optional[__T.List[SimpleStruct]] = ...,
        amap: __T.Optional[__T.Dict[str, str]] = ...,
        aset: __T.Optional[__T.Set[str]] = ...,
        item: __T.Optional[simple.dependent.ttypes.Item] = ...,
        from_PY_RESERVED_KEYWORD: __T.Optional[int] = ...
    ) -> None:
        ...

    @__property__
    def structOne(self) -> SimpleStruct: ...
    @structOne.setter
    def structOne(self, value: __T.Optional[SimpleStruct]) -> None: ...
    @__property__
    def structTwo(self) -> __T.Optional[SimpleStruct]: ...
    @structTwo.setter
    def structTwo(self, value: __T.Optional[SimpleStruct]) -> None: ...
    @__property__
    def an_integer(self) -> int: ...
    @an_integer.setter
    def an_integer(self, value: __T.Optional[int]) -> None: ...
    @__property__
    def name(self) -> str: ...
    @name.setter
    def name(self, value: __T.Optional[str]) -> None: ...
    @__property__
    def an_enum(self) -> AnEnum: ...
    @an_enum.setter
    def an_enum(self, value: __T.Optional[AnEnum]) -> None: ...
    @__property__
    def values(self) -> __T.List[int]: ...
    @values.setter
    def values(self, value: __T.Optional[__T.List[int]]) -> None: ...
    @__property__
    def structs(self) -> __T.List[SimpleStruct]: ...
    @structs.setter
    def structs(self, value: __T.Optional[__T.List[SimpleStruct]]) -> None: ...
    @__property__
    def amap(self) -> __T.Dict[str, str]: ...
    @amap.setter
    def amap(self, value: __T.Optional[__T.Dict[str, str]]) -> None: ...
    @__property__
    def aset(self) -> __T.Set[str]: ...
    @aset.setter
    def aset(self, value: __T.Optional[__T.Set[str]]) -> None: ...
    @__property__
    def item(self) -> simple.dependent.ttypes.Item: ...
    @item.setter
    def item(self, value: __T.Optional[simple.dependent.ttypes.Item]) -> None: ...
    @__property__
    def from_PY_RESERVED_KEYWORD(self) -> int: ...
    @from_PY_RESERVED_KEYWORD.setter
    def from_PY_RESERVED_KEYWORD(self, value: __T.Optional[int]) -> None: ...


    def isUnion(self) -> bool: ...
    def checkRequired(self) -> None: ...
    def read(self, iprot: TProtocolBase) -> None: ...
    @__T.overload
    def readFromJson(self, json: __T.Dict[str, __T.Any], is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    @__T.overload
    def readFromJson(self, json: str, is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    def write(self, oprot: TProtocolBase) -> None: ...
    def __eq__(self, other: __T.Any) -> bool: ...
    def __ne__(self, other: __T.Any) -> bool: ...
    def __dir__(self) -> __T.Sequence[str]: ...
    def _to_python(self) -> "simple.example.shared.thrift_types.ComplexStruct": ...   # type: ignore
    def _to_py3(self) -> "simple.example.shared.types.ComplexStruct": ...   # type: ignore
    def _to_py_deprecated(self) -> ComplexStruct: ...


class UnionStruct:
    thrift_spec: __T.Tuple[__T.Optional[__T.Tuple[int, int, str, __T.Any, __T.Optional[int], int]]]
    thrift_field_annotations: __T.Dict[int, __T.Dict[str, str]]
    thrift_struct_annotations: __T.Dict[str, str]

    def __init__(
        self,
        is_a_bool: __T.Optional[bool] = ...,
        some_string_goes_here: __T.Optional[str] = ...,
        perhaps_a_big_int: __T.Optional[int] = ...
    ) -> None:
        ...

    @__property__
    def is_a_bool(self) -> bool: ...
    @is_a_bool.setter
    def is_a_bool(self, value: __T.Optional[bool]) -> None: ...
    @__property__
    def some_string_goes_here(self) -> str: ...
    @some_string_goes_here.setter
    def some_string_goes_here(self, value: __T.Optional[str]) -> None: ...
    @__property__
    def perhaps_a_big_int(self) -> int: ...
    @perhaps_a_big_int.setter
    def perhaps_a_big_int(self, value: __T.Optional[int]) -> None: ...

    def getType(self) -> int: ...

    def get_is_a_bool(self) -> bool: ...
    def set_is_a_bool(self, value: bool) -> None: ...
    def get_some_string_goes_here(self) -> str: ...
    def set_some_string_goes_here(self, value: str) -> None: ...
    def get_perhaps_a_big_int(self) -> int: ...
    def set_perhaps_a_big_int(self, value: int) -> None: ...

    __EMPTY__: int = ...
    IS_A_BOOL: int = ...
    SOME_STRING_GOES_HERE: int = ...
    PERHAPS_A_BIG_INT: int = ...

    def isUnion(self) -> bool: ...
    def checkRequired(self) -> None: ...
    def read(self, iprot: TProtocolBase) -> None: ...
    @__T.overload
    def readFromJson(self, json: __T.Dict[str, __T.Any], is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    @__T.overload
    def readFromJson(self, json: str, is_text: bool = ..., **kwargs: __T.Any) -> None: ...
    def write(self, oprot: TProtocolBase) -> None: ...
    def __eq__(self, other: __T.Any) -> bool: ...
    def __ne__(self, other: __T.Any) -> bool: ...
    def __dir__(self) -> __T.Sequence[str]: ...
    def _to_python(self) -> "simple.example.shared.thrift_types.UnionStruct": ...   # type: ignore
    def _to_py3(self) -> "simple.example.shared.types.UnionStruct": ...   # type: ignore
    def _to_py_deprecated(self) -> UnionStruct: ...


ListOfSimpleStructs = __T.List[SimpleStruct]