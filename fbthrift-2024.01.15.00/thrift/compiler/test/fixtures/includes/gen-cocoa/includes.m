/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

/**
* @generated by Thrift
*/

#import <Foundation/Foundation.h>

#import <thrift/TProtocol.h>
#import <thrift/TApplicationException.h>
#import <thrift/TProtocolException.h>
#import <thrift/TProtocolUtil.h>
#import <thrift/TProcessor.h>
#import <thrift/TObjective-C.h>
#import <thrift/TBase.h>
#import <thrift/TBaseStruct.h>
#import <thrift/TBaseException.h>
#import "transitive.h"

#import "includes.h"

static Included * ExampleIncluded;
static int64_t IncludedConstant = 42;

@implementation includesConstants
+ (void) initialize {
  ExampleIncluded = [[Included alloc] init];
  [ExampleIncluded setMyIntField:2];
  Foo * tmp0 = [[[Foo alloc] init] autorelease_stub];
  [tmp0 setA:2];

  [ExampleIncluded setMyTransitiveField:tmp0];

;
}
+ (Included *) ExampleIncluded{
  return ExampleIncluded;
}
+ (int64_t) IncludedConstant{
  return IncludedConstant;
}
@end

@implementation Included

- (instancetype) init
{
  self = [super init];
  self.MyIntField = 0;

  self.MyTransitiveField = [[[Foo alloc] init] autorelease_stub];
  [self.MyTransitiveField setA:2];

  return self;
}

- (id) initWithMyIntField: (int64_t) MyIntField MyTransitiveField: (Foo *) MyTransitiveField
{
  self = [super init];
  __thrift_MyIntField = MyIntField;
  __thrift_MyIntField_set = YES;
  __thrift_MyTransitiveField = MyTransitiveField;
  __thrift_MyTransitiveField_set = YES;
  return self;
}

- (id) initWithCoder: (NSCoder *) decoder
{
  self = [super init];
  if ([decoder containsValueForKey: @"MyIntField"])
  {
    __thrift_MyIntField = [decoder decodeInt64ForKey: @"MyIntField"];
    __thrift_MyIntField_set = YES;
  }
  if ([decoder containsValueForKey: @"MyTransitiveField"])
  {
    __thrift_MyTransitiveField = [[decoder decodeObjectForKey: @"MyTransitiveField"] retain_stub];
    __thrift_MyTransitiveField_set = YES;
  }
  return self;
}

- (void) encodeWithCoder: (NSCoder *) encoder
{
  if (__thrift_MyIntField_set)
  {
    [encoder encodeInt64: __thrift_MyIntField forKey: @"MyIntField"];
  }
  if (__thrift_MyTransitiveField_set)
  {
    [encoder encodeObject: __thrift_MyTransitiveField forKey: @"MyTransitiveField"];
  }
}

- (int64_t) MyIntField {
  return __thrift_MyIntField;
}

- (void) setMyIntField: (int64_t) MyIntField {
  [self throwExceptionIfImmutable];
  __thrift_MyIntField = MyIntField;
  __thrift_MyIntField_set = YES;
}

- (BOOL) MyIntFieldIsSet {
  return __thrift_MyIntField_set;
}

- (void) unsetMyIntField {
  __thrift_MyIntField_set = NO;
}

- (Foo *) MyTransitiveField {
  return __thrift_MyTransitiveField;
}

- (void) setMyTransitiveField: (Foo *) MyTransitiveField {
  [self throwExceptionIfImmutable];
  __thrift_MyTransitiveField = MyTransitiveField;
  __thrift_MyTransitiveField_set = YES;
}

- (BOOL) MyTransitiveFieldIsSet {
  return __thrift_MyTransitiveField_set;
}

- (void) unsetMyTransitiveField {
  __thrift_MyTransitiveField = nil;
  __thrift_MyTransitiveField_set = NO;
}

- (void) read: (id <TProtocol>) inProtocol
{
  NSString * fieldName;
  int fieldType;
  int fieldID;

  [inProtocol readStructBeginReturningName: NULL];
  while (true)
  {
    [inProtocol readFieldBeginReturningName: &fieldName type: &fieldType fieldID: &fieldID];
    if (fieldType == TType_STOP) { 
      break;
    }
    switch (fieldID)
    {
      case 1:
        if (fieldType == TType_I64) {
          int64_t fieldValue = [inProtocol readI64];
          [self setMyIntField: fieldValue];
        } else {
          [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        }
        break;
      case 2:
        if (fieldType == TType_STRUCT) {
          Foo *fieldValue = [[Foo alloc] init];
          [fieldValue read: inProtocol];
          [self setMyTransitiveField: fieldValue];
          [fieldValue release_stub];
        } else {
          [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        }
        break;
      default:
        [TProtocolUtil skipType: fieldType onProtocol: inProtocol];
        break;
    }
    [inProtocol readFieldEnd];
  }
  [inProtocol readStructEnd];
}

- (void) write: (id <TProtocol>) outProtocol {
  [outProtocol writeStructBeginWithName: @"Included"];
  if (__thrift_MyIntField_set) {
    [outProtocol writeFieldBeginWithName: @"MyIntField" type: TType_I64 fieldID: 1];
    [outProtocol writeI64: __thrift_MyIntField];
    [outProtocol writeFieldEnd];
  }
  if (__thrift_MyTransitiveField_set) {
    if (__thrift_MyTransitiveField != nil) {
      [outProtocol writeFieldBeginWithName: @"MyTransitiveField" type: TType_STRUCT fieldID: 2];
      [__thrift_MyTransitiveField write: outProtocol];
      [outProtocol writeFieldEnd];
    }
  }
  [outProtocol writeFieldStop];
  [outProtocol writeStructEnd];
}

- (void) validate {
  // check for required fields
}

- (NSString *) description {
  return [[self toDict] description];
}

- (NSDictionary *) toDict {
  NSMutableDictionary *ret = [NSMutableDictionary dictionary];
  ret[@"__thrift_struct_name"] = @"Included";
  ret[@"MyIntField"] = @(__thrift_MyIntField);
  if (__thrift_MyTransitiveField) {
    ret[@"MyTransitiveField"] = [__thrift_MyTransitiveField toDict];
  }
  return [ret copy];
}

- (BOOL) makeImmutable {
  const BOOL wasImmutable = [self isImmutable];
  if (!wasImmutable) {
    if (__thrift_MyTransitiveField && ![__thrift_MyTransitiveField isImmutable]) {
      [__thrift_MyTransitiveField makeImmutable];
    }
    [super makeImmutable];
  }
  return YES;
}

- (id) mutableCopyWithZone:(NSZone *)zone {
  Included *newCopy = [[[self class] alloc] init];;
  newCopy->__thrift_MyIntField = self->__thrift_MyIntField;
  newCopy->__thrift_MyIntField_set = self->__thrift_MyIntField_set;
  if (__thrift_MyTransitiveField) {
    newCopy->__thrift_MyTransitiveField = [self->__thrift_MyTransitiveField mutableCopyWithZone:zone];
  }
  newCopy->__thrift_MyTransitiveField_set = self->__thrift_MyTransitiveField_set;
  return newCopy;
}

@end

