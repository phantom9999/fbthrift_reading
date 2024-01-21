#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#
cimport cython as __cython
from cython.operator cimport dereference as deref
from libcpp.memory cimport make_unique, unique_ptr, shared_ptr
from thrift.py3.types cimport assign_unique_ptr, assign_shared_ptr, assign_shared_const_ptr

cimport thrift.py3.types
from thrift.py3.types cimport (
    reset_field as __reset_field,
    StructFieldsSetter as __StructFieldsSetter
)

from thrift.py3.types cimport const_pointer_cast, BadEnum as _fbthrift_BadEnum


@__cython.auto_pickle(False)
cdef class __Struct_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __Struct_FieldsSetter _fbthrift_create(_module2_types.cStruct* struct_cpp_obj):
        cdef __Struct_FieldsSetter __fbthrift_inst = __Struct_FieldsSetter.__new__(__Struct_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"first")] = __Struct_FieldsSetter._set_field_0
        __fbthrift_inst._setters[__cstring_view(<const char*>"second")] = __Struct_FieldsSetter._set_field_1
        return __fbthrift_inst

    cdef void set_field(__Struct_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __Struct_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, _fbthrift_value) except *:
        # for field first
        if _fbthrift_value is None:
            __reset_field[_module2_types.cStruct](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(_fbthrift_value, _module0_types.Struct):
            raise TypeError(f'first is not a { _module0_types.Struct !r}.')
        deref(self._struct_cpp_obj).first_ref().assign(deref((<_module0_types.Struct?> _fbthrift_value)._cpp_obj))

    cdef void _set_field_1(self, _fbthrift_value) except *:
        # for field second
        if _fbthrift_value is None:
            __reset_field[_module2_types.cStruct](deref(self._struct_cpp_obj), 1)
            return
        if not isinstance(_fbthrift_value, _module1_types.Struct):
            raise TypeError(f'second is not a { _module1_types.Struct !r}.')
        deref(self._struct_cpp_obj).second_ref().assign(deref((<_module1_types.Struct?> _fbthrift_value)._cpp_obj))


@__cython.auto_pickle(False)
cdef class __BigStruct_FieldsSetter(__StructFieldsSetter):

    @staticmethod
    cdef __BigStruct_FieldsSetter _fbthrift_create(_module2_types.cBigStruct* struct_cpp_obj):
        cdef __BigStruct_FieldsSetter __fbthrift_inst = __BigStruct_FieldsSetter.__new__(__BigStruct_FieldsSetter)
        __fbthrift_inst._struct_cpp_obj = struct_cpp_obj
        __fbthrift_inst._setters[__cstring_view(<const char*>"s")] = __BigStruct_FieldsSetter._set_field_0
        __fbthrift_inst._setters[__cstring_view(<const char*>"id")] = __BigStruct_FieldsSetter._set_field_1
        return __fbthrift_inst

    cdef void set_field(__BigStruct_FieldsSetter self, const char* name, object value) except *:
        cdef __cstring_view cname = __cstring_view(name)
        cdef cumap[__cstring_view, __BigStruct_FieldsSetterFunc].iterator found = self._setters.find(cname)
        if found == self._setters.end():
            raise TypeError(f"invalid field name {name.decode('utf-8')}")
        deref(found).second(self, value)

    cdef void _set_field_0(self, _fbthrift_value) except *:
        # for field s
        if _fbthrift_value is None:
            __reset_field[_module2_types.cBigStruct](deref(self._struct_cpp_obj), 0)
            return
        if not isinstance(_fbthrift_value, _module2_types.Struct):
            raise TypeError(f's is not a { _module2_types.Struct !r}.')
        deref(self._struct_cpp_obj).s_ref().assign(deref((<_module2_types.Struct?> _fbthrift_value)._cpp_obj))

    cdef void _set_field_1(self, _fbthrift_value) except *:
        # for field id
        if _fbthrift_value is None:
            __reset_field[_module2_types.cBigStruct](deref(self._struct_cpp_obj), 1)
            return
        if not isinstance(_fbthrift_value, int):
            raise TypeError(f'id is not a { int !r}.')
        _fbthrift_value = <cint32_t> _fbthrift_value
        deref(self._struct_cpp_obj).id_ref().assign(_fbthrift_value)
