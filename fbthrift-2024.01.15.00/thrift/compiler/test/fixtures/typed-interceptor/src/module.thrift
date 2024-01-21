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

include "thrift/annotation/cpp.thrift"

struct Request {
  1: i32 i;
}

@cpp.GenerateTypedInterceptor
interaction MyInteraction {
  i32 getId(i32 field);
  void echo();
  string getRandomData(Request req);
}

@cpp.GenerateTypedInterceptor
service MyService {
  MyInteraction, i32 initializeInteraction(i32 field);
  void echo();
  string getRandomData(Request req);
  i32 getId(i32 field);
  void ping_eb(Request req) (thread = 'eb');
}
