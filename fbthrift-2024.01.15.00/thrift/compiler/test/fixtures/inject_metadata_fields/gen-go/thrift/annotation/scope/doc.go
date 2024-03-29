// Annotations that indicate which IDL definition a structured annotation can
// be placed on.
// 
// For example:
//   include "thrift/annotation/scope.thrift"
// 
//   @scope.Struct
//   struct MyStructAnnotation {...}
// 
//   @MyStructAnnotation // Good.
//   struct Foo{
//     @MyStructAnnotation // Compile-time failure. MyStructAnnotation is not
//                         // allowed on fields.
//     1: i32 my_field;
//   }

// @generated by Thrift for [[[ program path ]]]
// This file is probably not the place you want to edit!

package scope // [[[ program thrift source path ]]]
