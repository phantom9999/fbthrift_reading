
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT
 *  @generated
 *
 */

#include <folly/python/import.h>
#include <thrift/lib/python/capi/iobuf.h>
#include <thrift/lib/python/types.h>

#include <thrift/compiler/test/fixtures/mixin/src/gen-python-capi/module/thrift_types_api.h>
#include <thrift/compiler/test/fixtures/mixin/src/gen-python-capi/module/thrift_types_capi.h>


namespace apache {
namespace thrift {
namespace python {
namespace capi {
namespace {
bool ensure_module_imported() {
  static ::folly::python::import_cache_nocapture import((
      ::import_module__thrift_types_capi));
  return import();
}
  static constexpr std::int16_t _fbthrift__Mixin1__tuple_pos[1] = {
    1
  };
  static constexpr std::int16_t _fbthrift__Mixin2__tuple_pos[2] = {
    1, 2
  };
  static constexpr std::int16_t _fbthrift__Mixin3Base__tuple_pos[1] = {
    1
  };
  static constexpr std::int16_t _fbthrift__Foo__tuple_pos[3] = {
    1, 2, 3
  };
} // namespace

ExtractorResult<::cpp2::Mixin1>
Extractor<::cpp2::Mixin1>::operator()(PyObject* obj) {
  int tCheckResult = typeCheck(obj);
  if (tCheckResult != 1) {
      if (tCheckResult == 0) {
        PyErr_SetString(PyExc_TypeError, "Not a Mixin1");
      }
      return extractorError<::cpp2::Mixin1>(
          "Marshal error: Mixin1");
  }
  StrongRef fbThriftData(getThriftData(obj));
  return Extractor<::apache::thrift::python::capi::ComposedStruct<
      ::cpp2::Mixin1>>{}(*fbThriftData);
}

ExtractorResult<::cpp2::Mixin1>
Extractor<::apache::thrift::python::capi::ComposedStruct<
    ::cpp2::Mixin1>>::operator()(PyObject* fbThriftData) {
  ::cpp2::Mixin1 cpp;
  std::optional<std::string_view> error;
  Extractor<Bytes>{}.extractInto(
      cpp.field1_ref(),
      PyTuple_GET_ITEM(fbThriftData, _fbthrift__Mixin1__tuple_pos[0]),
      error);
  if (error) {
    return folly::makeUnexpected(*error);
  }
  return cpp;
}


int Extractor<::cpp2::Mixin1>::typeCheck(PyObject* obj) {
  if (!ensure_module_imported()) {
    ::folly::python::handlePythonError(
      "Module module import error");
  }
  int result =
      can_extract__module__Mixin1(obj);
  if (result < 0) {
    ::folly::python::handlePythonError(
      "Unexpected type check error: Mixin1");
  }
  return result;
}


PyObject* Constructor<::cpp2::Mixin1>::operator()(
    const ::cpp2::Mixin1& val) {
  if (!ensure_module_imported()) {
    DCHECK(PyErr_Occurred() != nullptr);
    return nullptr;
  }
  Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::Mixin1>> ctor;
  StrongRef fbthrift_data(ctor(val));
  if (!fbthrift_data) {
    return nullptr;
  }
  return init__module__Mixin1(*fbthrift_data);
}

PyObject* Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::Mixin1>>::operator()(
    FOLLY_MAYBE_UNUSED const ::cpp2::Mixin1& val) {
  StrongRef fbthrift_data(createStructTuple(1));
  StrongRef _fbthrift__field1(
    Constructor<Bytes>{}
    .constructFrom(val.field1_ref()));
  if (!_fbthrift__field1 ||
      setStructField(
          *fbthrift_data,
          _fbthrift__Mixin1__tuple_pos[0],
          *_fbthrift__field1) == -1) {
    return nullptr;
  }
  return std::move(fbthrift_data).release();
}


ExtractorResult<::cpp2::Mixin2>
Extractor<::cpp2::Mixin2>::operator()(PyObject* obj) {
  int tCheckResult = typeCheck(obj);
  if (tCheckResult != 1) {
      if (tCheckResult == 0) {
        PyErr_SetString(PyExc_TypeError, "Not a Mixin2");
      }
      return extractorError<::cpp2::Mixin2>(
          "Marshal error: Mixin2");
  }
  StrongRef fbThriftData(getThriftData(obj));
  return Extractor<::apache::thrift::python::capi::ComposedStruct<
      ::cpp2::Mixin2>>{}(*fbThriftData);
}

ExtractorResult<::cpp2::Mixin2>
Extractor<::apache::thrift::python::capi::ComposedStruct<
    ::cpp2::Mixin2>>::operator()(PyObject* fbThriftData) {
  ::cpp2::Mixin2 cpp;
  std::optional<std::string_view> error;
  Extractor<::apache::thrift::python::capi::ComposedStruct<::cpp2::Mixin1>>{}.extractInto(
      cpp.m1_ref(),
      PyTuple_GET_ITEM(fbThriftData, _fbthrift__Mixin2__tuple_pos[0]),
      error);
  Extractor<Bytes>{}.extractInto(
      cpp.field2_ref(),
      PyTuple_GET_ITEM(fbThriftData, _fbthrift__Mixin2__tuple_pos[1]),
      error);
  if (error) {
    return folly::makeUnexpected(*error);
  }
  return cpp;
}


int Extractor<::cpp2::Mixin2>::typeCheck(PyObject* obj) {
  if (!ensure_module_imported()) {
    ::folly::python::handlePythonError(
      "Module module import error");
  }
  int result =
      can_extract__module__Mixin2(obj);
  if (result < 0) {
    ::folly::python::handlePythonError(
      "Unexpected type check error: Mixin2");
  }
  return result;
}


PyObject* Constructor<::cpp2::Mixin2>::operator()(
    const ::cpp2::Mixin2& val) {
  if (!ensure_module_imported()) {
    DCHECK(PyErr_Occurred() != nullptr);
    return nullptr;
  }
  Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::Mixin2>> ctor;
  StrongRef fbthrift_data(ctor(val));
  if (!fbthrift_data) {
    return nullptr;
  }
  return init__module__Mixin2(*fbthrift_data);
}

PyObject* Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::Mixin2>>::operator()(
    FOLLY_MAYBE_UNUSED const ::cpp2::Mixin2& val) {
  StrongRef fbthrift_data(createStructTuple(2));
  StrongRef _fbthrift__m1(
    Constructor<::apache::thrift::python::capi::ComposedStruct<::cpp2::Mixin1>>{}
    .constructFrom(val.m1_ref()));
  if (!_fbthrift__m1 ||
      setStructField(
          *fbthrift_data,
          _fbthrift__Mixin2__tuple_pos[0],
          *_fbthrift__m1) == -1) {
    return nullptr;
  }
  StrongRef _fbthrift__field2(
    Constructor<Bytes>{}
    .constructFrom(val.field2_ref()));
  if (!_fbthrift__field2 ||
      setStructField(
          *fbthrift_data,
          _fbthrift__Mixin2__tuple_pos[1],
          *_fbthrift__field2) == -1) {
    return nullptr;
  }
  return std::move(fbthrift_data).release();
}


ExtractorResult<::cpp2::Mixin3Base>
Extractor<::cpp2::Mixin3Base>::operator()(PyObject* obj) {
  int tCheckResult = typeCheck(obj);
  if (tCheckResult != 1) {
      if (tCheckResult == 0) {
        PyErr_SetString(PyExc_TypeError, "Not a Mixin3Base");
      }
      return extractorError<::cpp2::Mixin3Base>(
          "Marshal error: Mixin3Base");
  }
  StrongRef fbThriftData(getThriftData(obj));
  return Extractor<::apache::thrift::python::capi::ComposedStruct<
      ::cpp2::Mixin3Base>>{}(*fbThriftData);
}

ExtractorResult<::cpp2::Mixin3Base>
Extractor<::apache::thrift::python::capi::ComposedStruct<
    ::cpp2::Mixin3Base>>::operator()(PyObject* fbThriftData) {
  ::cpp2::Mixin3Base cpp;
  std::optional<std::string_view> error;
  Extractor<Bytes>{}.extractInto(
      cpp.field3_ref(),
      PyTuple_GET_ITEM(fbThriftData, _fbthrift__Mixin3Base__tuple_pos[0]),
      error);
  if (error) {
    return folly::makeUnexpected(*error);
  }
  return cpp;
}


int Extractor<::cpp2::Mixin3Base>::typeCheck(PyObject* obj) {
  if (!ensure_module_imported()) {
    ::folly::python::handlePythonError(
      "Module module import error");
  }
  int result =
      can_extract__module__Mixin3Base(obj);
  if (result < 0) {
    ::folly::python::handlePythonError(
      "Unexpected type check error: Mixin3Base");
  }
  return result;
}


PyObject* Constructor<::cpp2::Mixin3Base>::operator()(
    const ::cpp2::Mixin3Base& val) {
  if (!ensure_module_imported()) {
    DCHECK(PyErr_Occurred() != nullptr);
    return nullptr;
  }
  Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::Mixin3Base>> ctor;
  StrongRef fbthrift_data(ctor(val));
  if (!fbthrift_data) {
    return nullptr;
  }
  return init__module__Mixin3Base(*fbthrift_data);
}

PyObject* Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::Mixin3Base>>::operator()(
    FOLLY_MAYBE_UNUSED const ::cpp2::Mixin3Base& val) {
  StrongRef fbthrift_data(createStructTuple(1));
  StrongRef _fbthrift__field3(
    Constructor<Bytes>{}
    .constructFrom(val.field3_ref()));
  if (!_fbthrift__field3 ||
      setStructField(
          *fbthrift_data,
          _fbthrift__Mixin3Base__tuple_pos[0],
          *_fbthrift__field3) == -1) {
    return nullptr;
  }
  return std::move(fbthrift_data).release();
}


ExtractorResult<::cpp2::Foo>
Extractor<::cpp2::Foo>::operator()(PyObject* obj) {
  int tCheckResult = typeCheck(obj);
  if (tCheckResult != 1) {
      if (tCheckResult == 0) {
        PyErr_SetString(PyExc_TypeError, "Not a Foo");
      }
      return extractorError<::cpp2::Foo>(
          "Marshal error: Foo");
  }
  StrongRef fbThriftData(getThriftData(obj));
  return Extractor<::apache::thrift::python::capi::ComposedStruct<
      ::cpp2::Foo>>{}(*fbThriftData);
}

ExtractorResult<::cpp2::Foo>
Extractor<::apache::thrift::python::capi::ComposedStruct<
    ::cpp2::Foo>>::operator()(PyObject* fbThriftData) {
  ::cpp2::Foo cpp;
  std::optional<std::string_view> error;
  Extractor<Bytes>{}.extractInto(
      cpp.field4_ref(),
      PyTuple_GET_ITEM(fbThriftData, _fbthrift__Foo__tuple_pos[0]),
      error);
  Extractor<::apache::thrift::python::capi::ComposedStruct<::cpp2::Mixin2>>{}.extractInto(
      cpp.m2_ref(),
      PyTuple_GET_ITEM(fbThriftData, _fbthrift__Foo__tuple_pos[1]),
      error);
  Extractor<::apache::thrift::python::capi::ComposedStruct<::cpp2::Mixin3Base>>{}.extractInto(
      cpp.m3_ref(),
      PyTuple_GET_ITEM(fbThriftData, _fbthrift__Foo__tuple_pos[2]),
      error);
  if (error) {
    return folly::makeUnexpected(*error);
  }
  return cpp;
}


int Extractor<::cpp2::Foo>::typeCheck(PyObject* obj) {
  if (!ensure_module_imported()) {
    ::folly::python::handlePythonError(
      "Module module import error");
  }
  int result =
      can_extract__module__Foo(obj);
  if (result < 0) {
    ::folly::python::handlePythonError(
      "Unexpected type check error: Foo");
  }
  return result;
}


PyObject* Constructor<::cpp2::Foo>::operator()(
    const ::cpp2::Foo& val) {
  if (!ensure_module_imported()) {
    DCHECK(PyErr_Occurred() != nullptr);
    return nullptr;
  }
  Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::Foo>> ctor;
  StrongRef fbthrift_data(ctor(val));
  if (!fbthrift_data) {
    return nullptr;
  }
  return init__module__Foo(*fbthrift_data);
}

PyObject* Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::Foo>>::operator()(
    FOLLY_MAYBE_UNUSED const ::cpp2::Foo& val) {
  StrongRef fbthrift_data(createStructTuple(3));
  StrongRef _fbthrift__field4(
    Constructor<Bytes>{}
    .constructFrom(val.field4_ref()));
  if (!_fbthrift__field4 ||
      setStructField(
          *fbthrift_data,
          _fbthrift__Foo__tuple_pos[0],
          *_fbthrift__field4) == -1) {
    return nullptr;
  }
  StrongRef _fbthrift__m2(
    Constructor<::apache::thrift::python::capi::ComposedStruct<::cpp2::Mixin2>>{}
    .constructFrom(val.m2_ref()));
  if (!_fbthrift__m2 ||
      setStructField(
          *fbthrift_data,
          _fbthrift__Foo__tuple_pos[1],
          *_fbthrift__m2) == -1) {
    return nullptr;
  }
  StrongRef _fbthrift__m3(
    Constructor<::apache::thrift::python::capi::ComposedStruct<::cpp2::Mixin3Base>>{}
    .constructFrom(val.m3_ref()));
  if (!_fbthrift__m3 ||
      setStructField(
          *fbthrift_data,
          _fbthrift__Foo__tuple_pos[2],
          *_fbthrift__m3) == -1) {
    return nullptr;
  }
  return std::move(fbthrift_data).release();
}


} // namespace capi
} // namespace python
} // namespace thrift
} // namespace apache
