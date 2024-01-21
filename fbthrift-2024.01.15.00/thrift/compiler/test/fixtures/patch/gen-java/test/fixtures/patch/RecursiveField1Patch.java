/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.patch;

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
@com.facebook.swift.codec.ThriftStruct(value="RecursiveField1Patch", builder=RecursiveField1Patch.Builder.class)
public final class RecursiveField1Patch implements com.facebook.thrift.payload.ThriftSerializable {
    @ThriftConstructor
    public RecursiveField1Patch(
        @com.facebook.swift.codec.ThriftField(value=1, name="assign", requiredness=Requiredness.OPTIONAL) final Map<String, test.fixtures.patch.Recursive> assign,
        @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=Requiredness.TERSE) final boolean clear
    ) {
        this.assign = assign;
        this.clear = clear;
    }
    
    @ThriftConstructor
    protected RecursiveField1Patch() {
      this.assign = null;
      this.clear = false;
    }
    
    public static class Builder {
        private Map<String, test.fixtures.patch.Recursive> assign = null;
        private boolean clear = false;
    
        @com.facebook.swift.codec.ThriftField(value=1, name="assign", requiredness=Requiredness.OPTIONAL)
        public Builder setAssign(Map<String, test.fixtures.patch.Recursive> assign) {
            this.assign = assign;
            return this;
        }
    
        public Map<String, test.fixtures.patch.Recursive> getAssign() { return assign; }
    
            @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=Requiredness.TERSE)
        public Builder setClear(boolean clear) {
            this.clear = clear;
            return this;
        }
    
        public boolean isClear() { return clear; }
    
        public Builder() { }
        public Builder(RecursiveField1Patch other) {
            this.assign = other.assign;
            this.clear = other.clear;
        }
    
        @ThriftConstructor
        public RecursiveField1Patch build() {
            RecursiveField1Patch result = new RecursiveField1Patch (
                this.assign,
                this.clear
            );
            return result;
        }
    }
        
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("RecursiveField1Patch");
    private final Map<String, test.fixtures.patch.Recursive> assign;
    public static final int _ASSIGN = 1;
    private static final TField ASSIGN_FIELD_DESC = new TField("assign", TType.MAP, (short)1);
        private final boolean clear;
    public static final int _CLEAR = 2;
    private static final TField CLEAR_FIELD_DESC = new TField("clear", TType.BOOL, (short)2);
    static {
      NAMES_TO_IDS.put("assign", 1);
      THRIFT_NAMES_TO_IDS.put("assign", 1);
      FIELD_METADATA.put(1, ASSIGN_FIELD_DESC);
      NAMES_TO_IDS.put("clear", 2);
      THRIFT_NAMES_TO_IDS.put("clear", 2);
      FIELD_METADATA.put(2, CLEAR_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("test.dev/fixtures/patch/RecursiveField1Patch"),
        RecursiveField1Patch.class, RecursiveField1Patch::read0));
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="assign", requiredness=Requiredness.OPTIONAL)
    public Map<String, test.fixtures.patch.Recursive> getAssign() { return assign; }
    
    
    
    @com.facebook.swift.codec.ThriftField(value=2, name="clear", requiredness=Requiredness.TERSE)
    public boolean isClear() { return clear; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("assign", assign);
        helper.add("clear", clear);
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
    
        RecursiveField1Patch other = (RecursiveField1Patch)o;
    
        return
            Objects.equals(assign, other.assign) &&
            Objects.equals(clear, other.clear) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            assign,
            clear
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<RecursiveField1Patch> asReader() {
      return RecursiveField1Patch::read0;
    }
    
    public static RecursiveField1Patch read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(RecursiveField1Patch.NAMES_TO_IDS, RecursiveField1Patch.THRIFT_NAMES_TO_IDS, RecursiveField1Patch.FIELD_METADATA);
      RecursiveField1Patch.Builder builder = new RecursiveField1Patch.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _ASSIGN:
          if (__field.type == TType.MAP) {
            Map<String, test.fixtures.patch.Recursive> assign;
            {
            TMap _map = oprot.readMapBegin();
            assign = new HashMap<String, test.fixtures.patch.Recursive>(Math.max(0, _map.size));
            for (int _i = 0; (_map.size < 0) ? oprot.peekMap() : (_i < _map.size); _i++) {
                
                String _key1 = oprot.readString();
                test.fixtures.patch.Recursive _value1 = test.fixtures.patch.Recursive.read0(oprot);
                assign.put(_key1, _value1);
            }
            }
            oprot.readMapEnd();
            builder.setAssign(assign);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _CLEAR:
          if (__field.type == TType.BOOL) {
            boolean clear = oprot.readBool();
            builder.setClear(clear);
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
      int structStart = 0;
      int pos = 0;
      com.facebook.thrift.protocol.ByteBufTProtocol p = (com.facebook.thrift.protocol.ByteBufTProtocol) oprot;
      if (assign != null) {
        oprot.writeFieldBegin(ASSIGN_FIELD_DESC);
        Map<String, test.fixtures.patch.Recursive> _iter0 = assign;
        oprot.writeMapBegin(new TMap(TType.STRING, TType.STRUCT, _iter0.size()));
        for (Map.Entry<String, test.fixtures.patch.Recursive> _iter1 : _iter0.entrySet()) {
          oprot.writeString(_iter1.getKey());
          _iter1.getValue().write0(oprot);
        }
        oprot.writeMapEnd();
        oprot.writeFieldEnd();
      }
      if (!com.facebook.thrift.util.IntrinsicDefaults.isDefault(clear)) {
        oprot.writeFieldBegin(CLEAR_FIELD_DESC);
        oprot.writeBool(this.clear);
        oprot.writeFieldEnd();
      };
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _RecursiveField1PatchLazy {
        private static final RecursiveField1Patch _DEFAULT = new RecursiveField1Patch.Builder().build();
    }
    
    public static RecursiveField1Patch defaultInstance() {
        return  _RecursiveField1PatchLazy._DEFAULT;
    }
}
