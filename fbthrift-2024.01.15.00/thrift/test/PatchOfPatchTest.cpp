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

#include <folly/portability/GTest.h>
#include <thrift/test/gen-cpp2/PatchOfPatch_types.h>

namespace apache::thrift::test::patch {
TEST(PatchOfPatchTest, Example) {
  StructWithPatch structWithPatch;
  structWithPatch.foo()->patch<apache::thrift::ident::data1>() = "10";

  MyData myData;
  structWithPatch.foo()->apply(myData);
  EXPECT_EQ(myData.data1(), "10");

  MyDataPatch myDataPatch;
  myDataPatch.patch<apache::thrift::ident::data1>() = "20";

  StructWithPatchPatch structWithPatchPatch;
  structWithPatchPatch.patch<apache::thrift::ident::foo>() = myDataPatch;

  structWithPatchPatch.apply(structWithPatch);

  structWithPatch.foo()->apply(myData);
  EXPECT_EQ(myData.data1(), "20");
}
} // namespace apache::thrift::test::patch
