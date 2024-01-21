/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package "test.dev/namespace_from_package/module"

// namespace cpp2 test.namespace_from_package.module
// namespace py3 test.namespace_from_package
// namespace hack namespace_from_package.module
// namespace php namespace_from_package.module
// namespace java.swift dev.test.namespace_from_package.module
namespace java dev.test.namespace_from_package.module_deprecated
namespace py.asyncio test.namespace_from_package.module
namespace go namespace_from_package.module
namespace py namespace_from_package.module
namespace hs DefaultNamespace.module

struct Foo {
  1: i64 MyInt;
}

service TestService {
  i64 init(1: i64 int1);
}
