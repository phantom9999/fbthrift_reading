#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

import folly.iobuf as _fbthrift_iobuf
import typing as _typing
from thrift.py3.server import RequestContext, ServiceInterface
from abc import abstractmethod, ABCMeta

import module.types as _module_types

_SimpleServiceInterfaceT = _typing.TypeVar('_SimpleServiceInterfaceT', bound='SimpleServiceInterface')


class SimpleServiceInterface(
    ServiceInterface,
    metaclass=ABCMeta,
):


    @abstractmethod
    async def get_five(
        self
    ) -> int: ...


    @abstractmethod
    async def add_five(
        self,
        num: int
    ) -> int: ...


    @abstractmethod
    async def do_nothing(
        self
    ) -> None: ...


    @abstractmethod
    async def concat(
        self,
        first: str,
        second: str
    ) -> str: ...


    @abstractmethod
    async def get_value(
        self,
        simple_struct: _module_types.SimpleStruct
    ) -> int: ...


    @abstractmethod
    async def negate(
        self,
        input: bool
    ) -> bool: ...


    @abstractmethod
    async def tiny(
        self,
        input: int
    ) -> int: ...


    @abstractmethod
    async def small(
        self,
        input: int
    ) -> int: ...


    @abstractmethod
    async def big(
        self,
        input: int
    ) -> int: ...


    @abstractmethod
    async def two(
        self,
        input: float
    ) -> float: ...


    @abstractmethod
    async def expected_exception(
        self
    ) -> None: ...


    @abstractmethod
    async def unexpected_exception(
        self
    ) -> int: ...


    @abstractmethod
    async def sum_i16_list(
        self,
        numbers: _typing.Sequence[int]
    ) -> int: ...


    @abstractmethod
    async def sum_i32_list(
        self,
        numbers: _typing.Sequence[int]
    ) -> int: ...


    @abstractmethod
    async def sum_i64_list(
        self,
        numbers: _typing.Sequence[int]
    ) -> int: ...


    @abstractmethod
    async def concat_many(
        self,
        words: _typing.Sequence[str]
    ) -> str: ...


    @abstractmethod
    async def count_structs(
        self,
        items: _typing.Sequence[_module_types.SimpleStruct]
    ) -> int: ...


    @abstractmethod
    async def sum_set(
        self,
        numbers: _typing.AbstractSet[int]
    ) -> int: ...


    @abstractmethod
    async def contains_word(
        self,
        words: _typing.AbstractSet[str],
        word: str
    ) -> bool: ...


    @abstractmethod
    async def get_map_value(
        self,
        words: _typing.Mapping[str, str],
        key: str
    ) -> str: ...


    @abstractmethod
    async def map_length(
        self,
        items: _typing.Mapping[str, _module_types.SimpleStruct]
    ) -> int: ...


    @abstractmethod
    async def sum_map_values(
        self,
        items: _typing.Mapping[str, int]
    ) -> int: ...


    @abstractmethod
    async def complex_sum_i32(
        self,
        counter: _module_types.ComplexStruct
    ) -> int: ...


    @abstractmethod
    async def repeat_name(
        self,
        counter: _module_types.ComplexStruct
    ) -> str: ...


    @abstractmethod
    async def get_struct(
        self
    ) -> _module_types.SimpleStruct: ...


    @abstractmethod
    async def fib(
        self,
        n: int
    ) -> _typing.Sequence[int]: ...


    @abstractmethod
    async def unique_words(
        self,
        words: _typing.Sequence[str]
    ) -> _typing.AbstractSet[str]: ...


    @abstractmethod
    async def words_count(
        self,
        words: _typing.Sequence[str]
    ) -> _typing.Mapping[str, int]: ...


    @abstractmethod
    async def set_enum(
        self,
        in_enum: _module_types.AnEnum
    ) -> _module_types.AnEnum: ...


    @abstractmethod
    async def list_of_lists(
        self,
        num_lists: int,
        num_items: int
    ) -> _typing.Sequence[_typing.Sequence[int]]: ...


    @abstractmethod
    async def word_character_frequency(
        self,
        sentence: str
    ) -> _typing.Mapping[str, _typing.Mapping[str, int]]: ...


    @abstractmethod
    async def list_of_sets(
        self,
        some_words: str
    ) -> _typing.Sequence[_typing.AbstractSet[str]]: ...


    @abstractmethod
    async def nested_map_argument(
        self,
        struct_map: _typing.Mapping[str, _typing.Sequence[_module_types.SimpleStruct]]
    ) -> int: ...


    @abstractmethod
    async def make_sentence(
        self,
        word_chars: _typing.Sequence[_typing.Sequence[str]]
    ) -> str: ...


    @abstractmethod
    async def get_union(
        self,
        sets: _typing.Sequence[_typing.AbstractSet[int]]
    ) -> _typing.AbstractSet[int]: ...


    @abstractmethod
    async def get_keys(
        self,
        string_map: _typing.Sequence[_typing.Mapping[str, str]]
    ) -> _typing.AbstractSet[str]: ...


    @abstractmethod
    async def lookup_double(
        self,
        key: int
    ) -> float: ...


    @abstractmethod
    async def retrieve_binary(
        self,
        something: bytes
    ) -> bytes: ...


    @abstractmethod
    async def contain_binary(
        self,
        binaries: _typing.Sequence[bytes]
    ) -> _typing.AbstractSet[bytes]: ...


    @abstractmethod
    async def contain_enum(
        self,
        the_enum: _typing.Sequence[_module_types.AnEnum]
    ) -> _typing.Sequence[_module_types.AnEnum]: ...


    @abstractmethod
    async def get_binary_union_struct(
        self,
        u: _module_types.BinaryUnion
    ) -> _module_types.BinaryUnionStruct: ...
    pass


_DerivedServiceInterfaceT = _typing.TypeVar('_DerivedServiceInterfaceT', bound='DerivedServiceInterface')


class DerivedServiceInterface(
SimpleServiceInterface,
    metaclass=ABCMeta,
):


    @abstractmethod
    async def get_six(
        self
    ) -> int: ...
    pass


_RederivedServiceInterfaceT = _typing.TypeVar('_RederivedServiceInterfaceT', bound='RederivedServiceInterface')


class RederivedServiceInterface(
DerivedServiceInterface,
    metaclass=ABCMeta,
):


    @abstractmethod
    async def get_seven(
        self
    ) -> int: ...
    pass


