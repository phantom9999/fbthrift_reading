/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include "thrift/compiler/test/fixtures/refs/src/gen-py3/module/metadata.h"

namespace cpp2 {
::apache::thrift::metadata::ThriftMetadata module_getThriftModuleMetadata() {
  ::apache::thrift::metadata::ThriftServiceMetadataResponse response;
  ::apache::thrift::metadata::ThriftMetadata& metadata = *response.metadata_ref();
  ::apache::thrift::detail::md::EnumMetadata<MyEnum>::gen(metadata);
  ::apache::thrift::detail::md::EnumMetadata<TypedEnum>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyUnion>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<NonTriviallyDestructibleUnion>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyField>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<MyStruct>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithUnion>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<RecursiveStruct>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithContainers>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithSharedConst>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<Empty>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithRef>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithBox>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithInternBox>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithTerseInternBox>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<AdaptedStructWithInternBox>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<AdaptedStructWithTerseInternBox>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithRefTypeUnique>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithRefTypeShared>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithRefTypeSharedConst>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithRefAndAnnotCppNoexceptMoveCtor>::gen(metadata);
  ::apache::thrift::detail::md::StructMetadata<StructWithString>::gen(metadata);
  return metadata;
}
} // namespace cpp2
