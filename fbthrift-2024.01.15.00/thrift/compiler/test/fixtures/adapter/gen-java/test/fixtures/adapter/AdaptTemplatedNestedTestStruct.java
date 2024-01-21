/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.adapter;

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
@com.facebook.swift.codec.ThriftStruct(value="AdaptTemplatedNestedTestStruct", builder=AdaptTemplatedNestedTestStruct.Builder.class)
public final class AdaptTemplatedNestedTestStruct implements com.facebook.thrift.payload.ThriftSerializable {
    @ThriftConstructor
    public AdaptTemplatedNestedTestStruct(
        @com.facebook.swift.codec.ThriftField(value=1, name="adaptedStruct", requiredness=Requiredness.NONE) final test.fixtures.adapter.AdaptTemplatedTestStruct adaptedStruct
    ) {
        this.adaptedStruct = adaptedStruct;
    }
    
    @ThriftConstructor
    protected AdaptTemplatedNestedTestStruct() {
      this.adaptedStruct = null;
    }
    
    public static class Builder {
        private test.fixtures.adapter.AdaptTemplatedTestStruct adaptedStruct = null;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="adaptedStruct", requiredness=Requiredness.NONE)
        public Builder setAdaptedStruct(test.fixtures.adapter.AdaptTemplatedTestStruct adaptedStruct) {
            this.adaptedStruct = adaptedStruct;
            return this;
        }
    
        public test.fixtures.adapter.AdaptTemplatedTestStruct getAdaptedStruct() { return adaptedStruct; }
    
        public Builder() { }
        public Builder(AdaptTemplatedNestedTestStruct other) {
            this.adaptedStruct = other.adaptedStruct;
        }
    
        @ThriftConstructor
        public AdaptTemplatedNestedTestStruct build() {
            AdaptTemplatedNestedTestStruct result = new AdaptTemplatedNestedTestStruct (
                this.adaptedStruct
            );
            return result;
        }
    }
        
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("AdaptTemplatedNestedTestStruct");
    private final test.fixtures.adapter.AdaptTemplatedTestStruct adaptedStruct;
    public static final int _ADAPTEDSTRUCT = 1;
    private static final TField ADAPTED_STRUCT_FIELD_DESC = new TField("adaptedStruct", TType.STRUCT, (short)1);
    static {
      NAMES_TO_IDS.put("adaptedStruct", 1);
      THRIFT_NAMES_TO_IDS.put("adaptedStruct", 1);
      FIELD_METADATA.put(1, ADAPTED_STRUCT_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("facebook.com/thrift/test/AdaptTemplatedNestedTestStruct"),
        AdaptTemplatedNestedTestStruct.class, AdaptTemplatedNestedTestStruct::read0));
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="adaptedStruct", requiredness=Requiredness.NONE)
    public test.fixtures.adapter.AdaptTemplatedTestStruct getAdaptedStruct() { return adaptedStruct; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("adaptedStruct", adaptedStruct);
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
    
        AdaptTemplatedNestedTestStruct other = (AdaptTemplatedNestedTestStruct)o;
    
        return
            Objects.equals(adaptedStruct, other.adaptedStruct) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            adaptedStruct
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<AdaptTemplatedNestedTestStruct> asReader() {
      return AdaptTemplatedNestedTestStruct::read0;
    }
    
    public static AdaptTemplatedNestedTestStruct read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(AdaptTemplatedNestedTestStruct.NAMES_TO_IDS, AdaptTemplatedNestedTestStruct.THRIFT_NAMES_TO_IDS, AdaptTemplatedNestedTestStruct.FIELD_METADATA);
      AdaptTemplatedNestedTestStruct.Builder builder = new AdaptTemplatedNestedTestStruct.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _ADAPTEDSTRUCT:
          if (__field.type == TType.STRUCT) {
            test.fixtures.adapter.AdaptTemplatedTestStruct adaptedStruct = test.fixtures.adapter.AdaptTemplatedTestStruct.read0(oprot);
            builder.setAdaptedStruct(adaptedStruct);
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
      if (adaptedStruct != null) {
        oprot.writeFieldBegin(ADAPTED_STRUCT_FIELD_DESC);
        this.adaptedStruct.write0(oprot);
        oprot.writeFieldEnd();
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _AdaptTemplatedNestedTestStructLazy {
        private static final AdaptTemplatedNestedTestStruct _DEFAULT = new AdaptTemplatedNestedTestStruct.Builder().build();
    }
    
    public static AdaptTemplatedNestedTestStruct defaultInstance() {
        return  _AdaptTemplatedNestedTestStructLazy._DEFAULT;
    }
}
