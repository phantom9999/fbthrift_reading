
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

#include <thrift/compiler/test/fixtures/interactions/src/gen-python-capi/module/thrift_types_api.h>
#include <thrift/compiler/test/fixtures/interactions/src/gen-python-capi/module/thrift_types_capi.h>


namespace apache {
namespace thrift {
namespace python {
namespace capi {
namespace {
bool ensure_module_imported() {
  static ::folly::python::import_cache_nocapture import((
      ::import_test__fixtures__interactions__module__thrift_types_capi));
  return import();
}
  static constexpr std::int16_t _fbthrift__CustomException__tuple_pos[1] = {
    1
  };
} // namespace

ExtractorResult<::cpp2::CustomException>
Extractor<::cpp2::CustomException>::operator()(PyObject* obj) {
  int tCheckResult = typeCheck(obj);
  if (tCheckResult != 1) {
      if (tCheckResult == 0) {
        PyErr_SetString(PyExc_TypeError, "Not a CustomException");
      }
      return extractorError<::cpp2::CustomException>(
          "Marshal error: CustomException");
  }
  StrongRef fbThriftData(getExceptionThriftData(obj));
  return Extractor<::apache::thrift::python::capi::ComposedStruct<
      ::cpp2::CustomException>>{}(*fbThriftData);
}

ExtractorResult<::cpp2::CustomException>
Extractor<::apache::thrift::python::capi::ComposedStruct<
    ::cpp2::CustomException>>::operator()(PyObject* fbThriftData) {
  ::cpp2::CustomException cpp;
  std::optional<std::string_view> error;
  Extractor<Bytes>{}.extractInto(
      cpp.message_ref(),
      PyTuple_GET_ITEM(fbThriftData, _fbthrift__CustomException__tuple_pos[0]),
      error);
  if (error) {
    return folly::makeUnexpected(*error);
  }
  return cpp;
}


int Extractor<::cpp2::CustomException>::typeCheck(PyObject* obj) {
  if (!ensure_module_imported()) {
    ::folly::python::handlePythonError(
      "Module test.fixtures.interactions.module import error");
  }
  int result =
      can_extract__test__fixtures__interactions__module__CustomException(obj);
  if (result < 0) {
    ::folly::python::handlePythonError(
      "Unexpected type check error: CustomException");
  }
  return result;
}


PyObject* Constructor<::cpp2::CustomException>::operator()(
    const ::cpp2::CustomException& val) {
  if (!ensure_module_imported()) {
    DCHECK(PyErr_Occurred() != nullptr);
    return nullptr;
  }
  Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::CustomException>> ctor;
  StrongRef fbthrift_data(ctor(val));
  if (!fbthrift_data) {
    return nullptr;
  }
  return init__test__fixtures__interactions__module__CustomException(*fbthrift_data);
}

PyObject* Constructor<::apache::thrift::python::capi::ComposedStruct<
        ::cpp2::CustomException>>::operator()(
    FOLLY_MAYBE_UNUSED const ::cpp2::CustomException& val) {
  StrongRef fbthrift_data(createStructTuple(1));
  StrongRef _fbthrift__message(
    Constructor<Bytes>{}
    .constructFrom(val.message_ref()));
  if (!_fbthrift__message ||
      setStructField(
          *fbthrift_data,
          _fbthrift__CustomException__tuple_pos[0],
          *_fbthrift__message) == -1) {
    return nullptr;
  }
  return std::move(fbthrift_data).release();
}


} // namespace capi
} // namespace python
} // namespace thrift
} // namespace apache
