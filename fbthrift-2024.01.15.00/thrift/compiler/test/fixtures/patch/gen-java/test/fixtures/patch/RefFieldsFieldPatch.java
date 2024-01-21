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
@com.facebook.swift.codec.ThriftStruct(value="RefFieldsFieldPatch", builder=RefFieldsFieldPatch.Builder.class)
public final class RefFieldsFieldPatch implements com.facebook.thrift.payload.ThriftSerializable {
    @ThriftConstructor
    public RefFieldsFieldPatch(
        @com.facebook.swift.codec.ThriftField(value=1, name="unique", requiredness=Requiredness.TERSE) final test.fixtures.patch.RefFieldsField1Patch unique,
        @com.facebook.swift.codec.ThriftField(value=4, name="opt_unique", requiredness=Requiredness.TERSE) final test.fixtures.patch.RefFieldsField4Patch optUnique,
        @com.facebook.swift.codec.ThriftField(value=7, name="opt_box", requiredness=Requiredness.TERSE) final test.fixtures.patch.RefFieldsField7Patch optBox
    ) {
        this.unique = unique;
        this.optUnique = optUnique;
        this.optBox = optBox;
    }
    
    @ThriftConstructor
    protected RefFieldsFieldPatch() {
      this.unique = test.fixtures.patch.RefFieldsField1Patch.defaultInstance();
      this.optUnique = test.fixtures.patch.RefFieldsField4Patch.defaultInstance();
      this.optBox = test.fixtures.patch.RefFieldsField7Patch.defaultInstance();
    }
    
    public static class Builder {
        private test.fixtures.patch.RefFieldsField1Patch unique = test.fixtures.patch.RefFieldsField1Patch.defaultInstance();
        private test.fixtures.patch.RefFieldsField4Patch optUnique = test.fixtures.patch.RefFieldsField4Patch.defaultInstance();
        private test.fixtures.patch.RefFieldsField7Patch optBox = test.fixtures.patch.RefFieldsField7Patch.defaultInstance();
    
        @com.facebook.swift.codec.ThriftField(value=1, name="unique", requiredness=Requiredness.TERSE)
        public Builder setUnique(test.fixtures.patch.RefFieldsField1Patch unique) {
            this.unique = unique;
            return this;
        }
    
        public test.fixtures.patch.RefFieldsField1Patch getUnique() { return unique; }
    
            @com.facebook.swift.codec.ThriftField(value=4, name="opt_unique", requiredness=Requiredness.TERSE)
        public Builder setOptUnique(test.fixtures.patch.RefFieldsField4Patch optUnique) {
            this.optUnique = optUnique;
            return this;
        }
    
        public test.fixtures.patch.RefFieldsField4Patch getOptUnique() { return optUnique; }
    
            @com.facebook.swift.codec.ThriftField(value=7, name="opt_box", requiredness=Requiredness.TERSE)
        public Builder setOptBox(test.fixtures.patch.RefFieldsField7Patch optBox) {
            this.optBox = optBox;
            return this;
        }
    
        public test.fixtures.patch.RefFieldsField7Patch getOptBox() { return optBox; }
    
        public Builder() { }
        public Builder(RefFieldsFieldPatch other) {
            this.unique = other.unique;
            this.optUnique = other.optUnique;
            this.optBox = other.optBox;
        }
    
        @ThriftConstructor
        public RefFieldsFieldPatch build() {
            RefFieldsFieldPatch result = new RefFieldsFieldPatch (
                this.unique,
                this.optUnique,
                this.optBox
            );
            return result;
        }
    }
        
    public static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    public static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final TStruct STRUCT_DESC = new TStruct("RefFieldsFieldPatch");
    private final test.fixtures.patch.RefFieldsField1Patch unique;
    public static final int _UNIQUE = 1;
    private static final TField UNIQUE_FIELD_DESC = new TField("unique", TType.STRUCT, (short)1);
        private final test.fixtures.patch.RefFieldsField4Patch optUnique;
    public static final int _OPT_UNIQUE = 4;
    private static final TField OPT_UNIQUE_FIELD_DESC = new TField("opt_unique", TType.STRUCT, (short)4);
        private final test.fixtures.patch.RefFieldsField7Patch optBox;
    public static final int _OPT_BOX = 7;
    private static final TField OPT_BOX_FIELD_DESC = new TField("opt_box", TType.STRUCT, (short)7);
    static {
      NAMES_TO_IDS.put("unique", 1);
      THRIFT_NAMES_TO_IDS.put("unique", 1);
      FIELD_METADATA.put(1, UNIQUE_FIELD_DESC);
      NAMES_TO_IDS.put("optUnique", 4);
      THRIFT_NAMES_TO_IDS.put("opt_unique", 4);
      FIELD_METADATA.put(4, OPT_UNIQUE_FIELD_DESC);
      NAMES_TO_IDS.put("optBox", 7);
      THRIFT_NAMES_TO_IDS.put("opt_box", 7);
      FIELD_METADATA.put(7, OPT_BOX_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("test.dev/fixtures/patch/RefFieldsFieldPatch"),
        RefFieldsFieldPatch.class, RefFieldsFieldPatch::read0));
    }
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=1, name="unique", requiredness=Requiredness.TERSE)
    public test.fixtures.patch.RefFieldsField1Patch getUnique() { return unique; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=4, name="opt_unique", requiredness=Requiredness.TERSE)
    public test.fixtures.patch.RefFieldsField4Patch getOptUnique() { return optUnique; }
    
    
    @Nullable
    @com.facebook.swift.codec.ThriftField(value=7, name="opt_box", requiredness=Requiredness.TERSE)
    public test.fixtures.patch.RefFieldsField7Patch getOptBox() { return optBox; }
    
    @java.lang.Override
    public String toString() {
        ToStringHelper helper = toStringHelper(this);
        helper.add("unique", unique);
        helper.add("optUnique", optUnique);
        helper.add("optBox", optBox);
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
    
        RefFieldsFieldPatch other = (RefFieldsFieldPatch)o;
    
        return
            Objects.equals(unique, other.unique) &&
            Objects.equals(optUnique, other.optUnique) &&
            Objects.equals(optBox, other.optBox) &&
            true;
    }
    
    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            unique,
            optUnique,
            optBox
        });
    }
    
    
    public static com.facebook.thrift.payload.Reader<RefFieldsFieldPatch> asReader() {
      return RefFieldsFieldPatch::read0;
    }
    
    public static RefFieldsFieldPatch read0(TProtocol oprot) throws TException {
      TField __field;
      oprot.readStructBegin(RefFieldsFieldPatch.NAMES_TO_IDS, RefFieldsFieldPatch.THRIFT_NAMES_TO_IDS, RefFieldsFieldPatch.FIELD_METADATA);
      RefFieldsFieldPatch.Builder builder = new RefFieldsFieldPatch.Builder();
      while (true) {
        __field = oprot.readFieldBegin();
        if (__field.type == TType.STOP) { break; }
        switch (__field.id) {
        case _UNIQUE:
          if (__field.type == TType.STRUCT) {
            test.fixtures.patch.RefFieldsField1Patch unique = test.fixtures.patch.RefFieldsField1Patch.read0(oprot);
            builder.setUnique(unique);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _OPT_UNIQUE:
          if (__field.type == TType.STRUCT) {
            test.fixtures.patch.RefFieldsField4Patch optUnique = test.fixtures.patch.RefFieldsField4Patch.read0(oprot);
            builder.setOptUnique(optUnique);
          } else {
            TProtocolUtil.skip(oprot, __field.type);
          }
          break;
        case _OPT_BOX:
          if (__field.type == TType.STRUCT) {
            test.fixtures.patch.RefFieldsField7Patch optBox = test.fixtures.patch.RefFieldsField7Patch.read0(oprot);
            builder.setOptBox(optBox);
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
      java.util.Objects.requireNonNull(unique, "unique must not be null");
      structStart = p.mark();
        oprot.writeFieldBegin(UNIQUE_FIELD_DESC);
        pos = p.mark();
        this.unique.write0(oprot);
        if (p.mark() - pos > p.getEmptyStructSize()) {
          p.writeFieldEnd();    
        } else {
          p.rollback(structStart);
        }    
      java.util.Objects.requireNonNull(optUnique, "optUnique must not be null");
      structStart = p.mark();
        oprot.writeFieldBegin(OPT_UNIQUE_FIELD_DESC);
        pos = p.mark();
        this.optUnique.write0(oprot);
        if (p.mark() - pos > p.getEmptyStructSize()) {
          p.writeFieldEnd();    
        } else {
          p.rollback(structStart);
        }    
      java.util.Objects.requireNonNull(optBox, "optBox must not be null");
      structStart = p.mark();
        oprot.writeFieldBegin(OPT_BOX_FIELD_DESC);
        pos = p.mark();
        this.optBox.write0(oprot);
        if (p.mark() - pos > p.getEmptyStructSize()) {
          p.writeFieldEnd();    
        } else {
          p.rollback(structStart);
        }    
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    private static class _RefFieldsFieldPatchLazy {
        private static final RefFieldsFieldPatch _DEFAULT = new RefFieldsFieldPatch.Builder().build();
    }
    
    public static RefFieldsFieldPatch defaultInstance() {
        return  _RefFieldsFieldPatchLazy._DEFAULT;
    }
}
