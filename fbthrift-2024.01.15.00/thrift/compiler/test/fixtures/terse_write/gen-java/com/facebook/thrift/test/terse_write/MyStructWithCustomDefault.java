/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package com.facebook.thrift.test.terse_write;

import com.facebook.swift.codec.*;
import com.facebook.swift.codec.ThriftField.Requiredness;
import com.facebook.swift.codec.ThriftField.Recursiveness;
import com.google.common.collect.*;
import java.util.*;
import javax.annotation.Nullable;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;
import static com.google.common.base.MoreObjects.toStringHelper;
import static com.google.common.base.MoreObjects.ToStringHelper;

@SwiftGenerated
@com.facebook.swift.codec.ThriftStruct(value="MyStructWithCustomDefault", builder=MyStructWithCustomDefault.Builder.class)
public final class MyStructWithCustomDefault implements com.facebook.thrift.payload.ThriftSerializable {
    @ThriftConstructor
    public MyStructWithCustomDefault(
        @com.facebook.swift.codec.ThriftField(value=1, name="field1", requiredness=Requiredness.NONE) final long field1
    ) {
        this.field1 = field1;
    }
    
    @ThriftConstructor
    protected MyStructWithCustomDefault() {
      this.field1 = 1L;
    }
    
    public static class Builder {
        private long field1 = 1L;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="field1", requiredness=Requiredness.NONE)
        public Builder setField1(long field1) {
            this.field1 = field1;
            return this;
        }
    
        public long getField1() { return field1; }
    
        public Builder() { }
        public Builder(MyStructWithCustomDefault other) {
            this.field1 = other.field1;
        }
    
        @ThriftConstructor
        public MyStructWithCustomDefault build() {
            MyStructWithCustomDefault result = new MyStructWithCustomDefault (
                this.field1
            );
            return result;
        }
    }
        
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("MyStructWithCustomDefault");
    private final long field1;
    public static final int _FIELD1 = 1;
    private static final TField FIELD1_FIELD_DESC = new TField("field1", TType.I64, (short)1);
    static {
      NAMES_TO_IDS.put("field1", 1);
      THRIFT_NAMES_TO_IDS.put("field1", 1);
      FIELD_METADATA.put(1, FIELD1_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("facebook.com/thrift/test/terse_write/MyStructWithCustomDefault"),
        MyStructWithCustomDefault.class, MyStructWithCustomDefault::read0));
    }
    
    
    @com.facebook.swift.codec.ThriftField(value=1, name="field1", requiredness=Requiredness.NONE)
    public long getField1() { return field1; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("field1", field1);
        return helper.toString();
    }
    
    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
    
        MyStructWithCustomDefault other = (MyStructWithCustomDefault)o;
    
        return
            Objects.equals(field1, other.field1) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            field1
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<MyStructWithCustomDefault> asReader() {
      return MyStructWithCustomDefault::read0;
    }
    
    public static MyStructWithCustomDefault read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(MyStructWithCustomDefault.NAMES_TO_IDS, MyStructWithCustomDefault.THRIFT_NAMES_TO_IDS, MyStructWithCustomDefault.FIELD_METADATA);
      MyStructWithCustomDefault.Builder builder = new MyStructWithCustomDefault.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _FIELD1:
          if (__field.type == TType.I64) {
            long field1 = oprot.readI64();
            builder.setField1(field1);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(oprot, __field.type);
          break;
        }
        oprot.readFieldEnd();
      }
      oprot.readStructEnd();
      return builder.build();
    }
    
    public void write0(TProtocol oprot) throws TException {
      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(FIELD1_FIELD_DESC);
      oprot.writeI64(this.field1);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _MyStructWithCustomDefaultLazy {
        private static final MyStructWithCustomDefault _DEFAULT = new MyStructWithCustomDefault.Builder().build();
    }
    
    public static MyStructWithCustomDefault defaultInstance() {
        return  _MyStructWithCustomDefaultLazy._DEFAULT;
    }
}
