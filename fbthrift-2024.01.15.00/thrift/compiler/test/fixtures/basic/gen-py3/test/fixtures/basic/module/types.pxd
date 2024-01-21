#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#

from libc.stdint cimport (
    int8_t as cint8_t,
    int16_t as cint16_t,
    int32_t as cint32_t,
    int64_t as cint64_t,
    uint32_t as cuint32_t,
)
from libcpp.string cimport string
from libcpp cimport bool as cbool, nullptr, nullptr_t
from cpython cimport bool as pbool
from libcpp.memory cimport shared_ptr, unique_ptr
from libcpp.utility cimport move as cmove
from libcpp.vector cimport vector
from libcpp.set cimport set as cset
from libcpp.map cimport map as cmap, pair as cpair
from thrift.py3.exceptions cimport cTException
cimport folly.iobuf as _fbthrift_iobuf
cimport thrift.py3.exceptions
cimport thrift.py3.types
from thrift.py3.types cimport (
    bstring,
    bytes_to_string,
    field_ref as __field_ref,
    optional_field_ref as __optional_field_ref,
    required_field_ref as __required_field_ref,
    terse_field_ref as __terse_field_ref,
    union_field_ref as __union_field_ref,
    get_union_field_value as __get_union_field_value,
)
from thrift.py3.common cimport (
    RpcOptions as __RpcOptions,
    Protocol as __Protocol,
    cThriftMetadata as __fbthrift_cThriftMetadata,
    MetadataBox as __MetadataBox,
)
from folly.optional cimport cOptional as __cOptional

cimport test.fixtures.basic.module.types_fields as _fbthrift_types_fields

cdef extern from "thrift/compiler/test/fixtures/basic/src/gen-py3/module/types.h":
  pass


cdef extern from "thrift/compiler/test/fixtures/basic/src/gen-cpp2/module_metadata.h" namespace "apache::thrift::detail::md":
    cdef cppclass EnumMetadata[T]:
        @staticmethod
        void gen(__fbthrift_cThriftMetadata &metadata)
cdef extern from "thrift/compiler/test/fixtures/basic/src/gen-cpp2/module_types.h" namespace "::test::fixtures::basic":
    cdef cppclass cMyEnum "::test::fixtures::basic::MyEnum":
        pass

    cdef cppclass cHackEnum "::test::fixtures::basic::HackEnum":
        pass





cdef class MyEnum(thrift.py3.types.CompiledEnum):
    pass


cdef class HackEnum(thrift.py3.types.CompiledEnum):
    pass

cdef extern from "thrift/compiler/test/fixtures/basic/src/gen-cpp2/module_metadata.h" namespace "apache::thrift::detail::md":
    cdef cppclass ExceptionMetadata[T]:
        @staticmethod
        void gen(__fbthrift_cThriftMetadata &metadata)
cdef extern from "thrift/compiler/test/fixtures/basic/src/gen-cpp2/module_metadata.h" namespace "apache::thrift::detail::md":
    cdef cppclass StructMetadata[T]:
        @staticmethod
        void gen(__fbthrift_cThriftMetadata &metadata)
cdef extern from "thrift/compiler/test/fixtures/basic/src/gen-cpp2/module_types_custom_protocol.h" namespace "::test::fixtures::basic":

    cdef cppclass cMyStruct "::test::fixtures::basic::MyStruct":
        cMyStruct() except +
        cMyStruct(const cMyStruct&) except +
        bint operator==(cMyStruct&)
        bint operator!=(cMyStruct&)
        bint operator<(cMyStruct&)
        bint operator>(cMyStruct&)
        bint operator<=(cMyStruct&)
        bint operator>=(cMyStruct&)
        __field_ref[cint64_t] MyIntField_ref "MyIntField_ref" ()
        __field_ref[string] MyStringField_ref "MyStringField_ref" ()
        __field_ref[cMyDataItem] MyDataField_ref "MyDataField_ref" ()
        __field_ref[cMyEnum] myEnum_ref "myEnum_ref" ()
        __field_ref[cbool] oneway_ref "oneway_ref" ()
        __field_ref[cbool] readonly_ref "readonly_ref" ()
        __field_ref[cbool] idempotent_ref "idempotent_ref" ()
        __field_ref[cset[float]] floatSet_ref "floatSet_ref" ()
        __field_ref[string] no_hack_codegen_field_ref "no_hack_codegen_field_ref" ()


    cdef cppclass cMyDataItem "::test::fixtures::basic::MyDataItem":
        cMyDataItem() except +
        cMyDataItem(const cMyDataItem&) except +
        bint operator==(cMyDataItem&)
        bint operator!=(cMyDataItem&)
        bint operator<(cMyDataItem&)
        bint operator>(cMyDataItem&)
        bint operator<=(cMyDataItem&)
        bint operator>=(cMyDataItem&)

    cdef enum cMyUnion__type "::test::fixtures::basic::MyUnion::Type":
        cMyUnion__type___EMPTY__ "::test::fixtures::basic::MyUnion::Type::__EMPTY__",
        cMyUnion__type_myEnum "::test::fixtures::basic::MyUnion::Type::myEnum",
        cMyUnion__type_myStruct "::test::fixtures::basic::MyUnion::Type::myStruct",
        cMyUnion__type_myDataItem "::test::fixtures::basic::MyUnion::Type::myDataItem",
        cMyUnion__type_floatSet "::test::fixtures::basic::MyUnion::Type::floatSet",

    cdef cppclass cMyUnion "::test::fixtures::basic::MyUnion":
        cMyUnion() except +
        cMyUnion(const cMyUnion&) except +
        bint operator==(cMyUnion&)
        bint operator!=(cMyUnion&)
        bint operator<(cMyUnion&)
        bint operator>(cMyUnion&)
        bint operator<=(cMyUnion&)
        bint operator>=(cMyUnion&)
        cMyUnion__type getType() const
        const cMyEnum& get_myEnum "get_myEnum" () const
        cMyEnum& set_myEnum "set_myEnum" (const cMyEnum&)
        const cMyStruct& get_myStruct "get_myStruct" () const
        cMyStruct& set_myStruct "set_myStruct" (const cMyStruct&)
        const cMyDataItem& get_myDataItem "get_myDataItem" () const
        cMyDataItem& set_myDataItem "set_myDataItem" (const cMyDataItem&)
        const cset[float]& get_floatSet "get_floatSet" () const
        cset[float]& set_floatSet "set_floatSet" (const cset[float]&)


    cdef cppclass cReservedKeyword "::test::fixtures::basic::ReservedKeyword":
        cReservedKeyword() except +
        cReservedKeyword(const cReservedKeyword&) except +
        bint operator==(cReservedKeyword&)
        bint operator!=(cReservedKeyword&)
        bint operator<(cReservedKeyword&)
        bint operator>(cReservedKeyword&)
        bint operator<=(cReservedKeyword&)
        bint operator>=(cReservedKeyword&)
        __field_ref[cint32_t] reserved_field_ref "reserved_field_ref" ()

    cdef enum cUnionToBeRenamed__type "::test::fixtures::basic::UnionToBeRenamed::Type":
        cUnionToBeRenamed__type___EMPTY__ "::test::fixtures::basic::UnionToBeRenamed::Type::__EMPTY__",
        cUnionToBeRenamed__type_reserved_field "::test::fixtures::basic::UnionToBeRenamed::Type::reserved_field",

    cdef cppclass cUnionToBeRenamed "::test::fixtures::basic::UnionToBeRenamed":
        cUnionToBeRenamed() except +
        cUnionToBeRenamed(const cUnionToBeRenamed&) except +
        bint operator==(cUnionToBeRenamed&)
        bint operator!=(cUnionToBeRenamed&)
        bint operator<(cUnionToBeRenamed&)
        bint operator>(cUnionToBeRenamed&)
        bint operator<=(cUnionToBeRenamed&)
        bint operator>=(cUnionToBeRenamed&)
        cUnionToBeRenamed__type getType() const
        const cint32_t& get_reserved_field "get_reserved_field" () const
        cint32_t& set_reserved_field "set_reserved_field" (const cint32_t&)




cdef class MyStruct(thrift.py3.types.Struct):
    cdef shared_ptr[cMyStruct] _cpp_obj
    cdef _fbthrift_types_fields.__MyStruct_FieldsSetter _fields_setter
    cdef inline object MyIntField_impl(self)
    cdef inline object MyStringField_impl(self)
    cdef inline object MyDataField_impl(self)
    cdef inline object myEnum_impl(self)
    cdef inline object oneway_impl(self)
    cdef inline object readonly_impl(self)
    cdef inline object idempotent_impl(self)
    cdef inline object floatSet_impl(self)
    cdef inline object no_hack_codegen_field_impl(self)
    cdef MyDataItem __fbthrift_cached_MyDataField
    cdef object __fbthrift_cached_myEnum
    cdef Set__float __fbthrift_cached_floatSet

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cMyStruct])



cdef class MyDataItem(thrift.py3.types.Struct):
    cdef shared_ptr[cMyDataItem] _cpp_obj
    cdef _fbthrift_types_fields.__MyDataItem_FieldsSetter _fields_setter

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cMyDataItem])

cdef class __MyUnionType(thrift.py3.types.CompiledEnum):
    pass




cdef class MyUnion(thrift.py3.types.Union):
    cdef shared_ptr[cMyUnion] _cpp_obj
    cdef readonly __MyUnionType type
    cdef readonly object value
    cdef _load_cache(MyUnion self)

    @staticmethod
    cdef unique_ptr[cMyUnion] _make_instance(
        cMyUnion* base_instance,
        MyEnum myEnum,
        MyStruct myStruct,
        MyDataItem myDataItem,
        object floatSet
    ) except *

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cMyUnion])



cdef class ReservedKeyword(thrift.py3.types.Struct):
    cdef shared_ptr[cReservedKeyword] _cpp_obj
    cdef _fbthrift_types_fields.__ReservedKeyword_FieldsSetter _fields_setter
    cdef inline object reserved_field_impl(self)

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cReservedKeyword])

cdef class __UnionToBeRenamedType(thrift.py3.types.CompiledEnum):
    pass




cdef class UnionToBeRenamed(thrift.py3.types.Union):
    cdef shared_ptr[cUnionToBeRenamed] _cpp_obj
    cdef readonly __UnionToBeRenamedType type
    cdef readonly object value
    cdef _load_cache(UnionToBeRenamed self)

    @staticmethod
    cdef unique_ptr[cUnionToBeRenamed] _make_instance(
        cUnionToBeRenamed* base_instance,
        object reserved_field
    ) except *

    @staticmethod
    cdef _fbthrift_create(shared_ptr[cUnionToBeRenamed])


cdef class Set__float(thrift.py3.types.Set):
    cdef shared_ptr[cset[float]] _cpp_obj
    @staticmethod
    cdef _fbthrift_create(shared_ptr[cset[float]])
    @staticmethod
    cdef shared_ptr[cset[float]] _make_instance(object items) except *

