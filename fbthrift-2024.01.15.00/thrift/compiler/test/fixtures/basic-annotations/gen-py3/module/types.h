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
#include "thrift/compiler/test/fixtures/basic-annotations/src/gen-cpp2/module_data.h"
#include "thrift/compiler/test/fixtures/basic-annotations/src/gen-cpp2/module_types.h"
#include "thrift/compiler/test/fixtures/basic-annotations/src/gen-cpp2/module_metadata.h"
namespace thrift {
namespace py3 {


template<>
inline const std::vector<std::pair<std::string_view, std::string_view>>& PyEnumTraits<
    ::cpp2::YourEnum>::namesmap() {
  static const folly::Indestructible<NamesMap> pairs {
    {
    }
  };
  return *pairs;
}



template<>
inline void reset_field<::cpp2::MyStructNestedAnnotation>(
    ::cpp2::MyStructNestedAnnotation& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.name_ref().copy_from(default_inst<::cpp2::MyStructNestedAnnotation>().name_ref());
      return;
  }
}

template<>
inline void reset_field<::cpp2::SecretStruct>(
    ::cpp2::SecretStruct& obj, uint16_t index) {
  switch (index) {
    case 0:
      obj.id_ref().copy_from(default_inst<::cpp2::SecretStruct>().id_ref());
      return;
    case 1:
      obj.password_ref().copy_from(default_inst<::cpp2::SecretStruct>().password_ref());
      return;
  }
}

template<>
inline const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::cpp2::MyStructNestedAnnotation>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}

template<>
inline const std::unordered_map<std::string_view, std::string_view>& PyStructTraits<
    ::cpp2::SecretStruct>::namesmap() {
  static const folly::Indestructible<NamesMap> map {
    {
    }
  };
  return *map;
}
} // namespace py3
} // namespace thrift
