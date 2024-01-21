/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#pragma once

#include <functional>
#include <folly/Range.h>

#include <thrift/lib/py3/enums.h>
#include "gen-cpp2/foo_data.h"
#include "gen-cpp2/foo_types.h"
#include "gen-cpp2/foo_metadata.h"
namespace thrift {
namespace py3 {



template<>
inline void reset_field<::cpp2::Fields>(
    ::cpp2::Fields& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.injected_field_ref().copy_from(default_inst<::cpp2::Fields>().injected_field_ref());
      return;
    case 1:
      obj.injected_structured_annotation_field_ref().copy_from(default_inst<::cpp2::Fields>().injected_structured_annotation_field_ref());
      return;
    case 2:
      obj.injected_unstructured_annotation_field_ref().copy_from(default_inst<::cpp2::Fields>().injected_unstructured_annotation_field_ref());
      return;
  }
}

template<>
inline const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::cpp2::Fields>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}
} // namespace py3
} // namespace thrift
