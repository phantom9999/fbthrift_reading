// @generated by Thrift for [[[ program path ]]]
// This file is probably not the place you want to edit!

package transitive // [[[ program thrift source path ]]]

import (
    thrift "github.com/facebook/fbthrift/thrift/lib/go/thrift"
)

// (needed to ensure safety because of naive import list construction)
var _ = thrift.ZERO

var GoUnusedProtection__ int

var ExampleFoo *Foo = NewFoo().
    SetANonCompat(2)
