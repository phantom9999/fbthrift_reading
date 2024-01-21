#
# Autogenerated by Thrift
#
# DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
#  @generated
#


import folly.iobuf as _fbthrift_iobuf

from thrift.py3.reflection cimport (
    NumberType as __NumberType,
    StructType as __StructType,
    Qualifier as __Qualifier,
)


cimport module.types as _module_types

from thrift.py3.types cimport (
    constant_shared_ptr,
    default_inst,
)


cdef __StructSpec get_reflection__Fiery():
    cdef _module_types.Fiery defaults = _module_types.Fiery._fbthrift_create(
        constant_shared_ptr[_module_types.cFiery](
            default_inst[_module_types.cFiery]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="Fiery",
        kind=__StructType.EXCEPTION,
        annotations={
            """message""": """message""",        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="message",
            py_name="message",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.REQUIRED,
            default=None,
            annotations={
            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__Serious():
    cdef _module_types.Serious defaults = _module_types.Serious._fbthrift_create(
        constant_shared_ptr[_module_types.cSerious](
            default_inst[_module_types.cSerious]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="Serious",
        kind=__StructType.EXCEPTION,
        annotations={
            """message""": """sonnet""",        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="sonnet",
            py_name="sonnet",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.OPTIONAL,
            default=None,
            annotations={
            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__ComplexFieldNames():
    cdef _module_types.ComplexFieldNames defaults = _module_types.ComplexFieldNames._fbthrift_create(
        constant_shared_ptr[_module_types.cComplexFieldNames](
            default_inst[_module_types.cComplexFieldNames]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="ComplexFieldNames",
        kind=__StructType.EXCEPTION,
        annotations={
            """message""": """internal_error_message""",        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="error_message",
            py_name="error_message",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="internal_error_message",
            py_name="internal_error_message",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__CustomFieldNames():
    cdef _module_types.CustomFieldNames defaults = _module_types.CustomFieldNames._fbthrift_create(
        constant_shared_ptr[_module_types.cCustomFieldNames](
            default_inst[_module_types.cCustomFieldNames]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="CustomFieldNames",
        kind=__StructType.EXCEPTION,
        annotations={
            """message""": """internal_error_message""",        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="error_message",
            py_name="error_message",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="internal_error_message",
            py_name="internal_error_message",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
                """java.swift.name""": """internalGreatMessage""",            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__ExceptionWithPrimitiveField():
    cdef _module_types.ExceptionWithPrimitiveField defaults = _module_types.ExceptionWithPrimitiveField._fbthrift_create(
        constant_shared_ptr[_module_types.cExceptionWithPrimitiveField](
            default_inst[_module_types.cExceptionWithPrimitiveField]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="ExceptionWithPrimitiveField",
        kind=__StructType.EXCEPTION,
        annotations={
            """message""": """message""",        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="message",
            py_name="message",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="error_code",
            py_name="error_code",
            type=int,
            kind=__NumberType.I32,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__ExceptionWithStructuredAnnotation():
    cdef _module_types.ExceptionWithStructuredAnnotation defaults = _module_types.ExceptionWithStructuredAnnotation._fbthrift_create(
        constant_shared_ptr[_module_types.cExceptionWithStructuredAnnotation](
            default_inst[_module_types.cExceptionWithStructuredAnnotation]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="ExceptionWithStructuredAnnotation",
        kind=__StructType.EXCEPTION,
        annotations={
        },
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=1,
            name="message_field",
            py_name="message_field",
            type=str,
            kind=__NumberType.NOT_A_NUMBER,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    spec.add_field(
        __FieldSpec._fbthrift_create(
            id=2,
            name="error_code",
            py_name="error_code",
            type=int,
            kind=__NumberType.I32,
            qualifier=__Qualifier.UNQUALIFIED,
            default=None,
            annotations={
            },
        ),
    )
    return spec
cdef __StructSpec get_reflection__Banal():
    cdef _module_types.Banal defaults = _module_types.Banal._fbthrift_create(
        constant_shared_ptr[_module_types.cBanal](
            default_inst[_module_types.cBanal]()
        )
    )
    cdef __StructSpec spec = __StructSpec._fbthrift_create(
        name="Banal",
        kind=__StructType.EXCEPTION,
        annotations={
        },
    )
    return spec
