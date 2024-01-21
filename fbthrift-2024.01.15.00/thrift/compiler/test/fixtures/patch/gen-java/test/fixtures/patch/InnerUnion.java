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
import java.util.*;
import org.apache.thrift.*;
import org.apache.thrift.transport.*;
import org.apache.thrift.protocol.*;

import static com.google.common.base.MoreObjects.toStringHelper;

@SwiftGenerated
@ThriftUnion("InnerUnion")
public final class InnerUnion implements com.facebook.thrift.payload.ThriftSerializable {
    
    private static final boolean allowNullFieldValues =
        System.getProperty("thrift.union.allow-null-field-values", "false").equalsIgnoreCase("true");

    private static final TStruct STRUCT_DESC = new TStruct("InnerUnion");
    private static final Map<String, Integer> NAMES_TO_IDS = new HashMap();
    public static final Map<String, Integer> THRIFT_NAMES_TO_IDS = new HashMap();
    private static final Map<Integer, TField> FIELD_METADATA = new HashMap<>();
    private static final InnerUnion _DEFAULT = new InnerUnion();

    public static final int _INNEROPTION = 1;
    private static final TField INNER_OPTION_FIELD_DESC = new TField("innerOption", TType.STRING, (short)1);

    static {
      NAMES_TO_IDS.put("innerOption", 1);
      THRIFT_NAMES_TO_IDS.put("innerOption", 1);
      FIELD_METADATA.put(1, INNER_OPTION_FIELD_DESC);
      com.facebook.thrift.type.TypeRegistry.add(new com.facebook.thrift.type.Type(
        new com.facebook.thrift.type.UniversalName("test.dev/fixtures/patch/InnerUnion"),
        InnerUnion.class, InnerUnion::read0));
    }

    private java.lang.Object value;
    private short id;

    public static InnerUnion from(int _id, java.lang.Object _field) {
        return from((short) _id, _field);
    }

    public static InnerUnion from(short _id, java.lang.Object _field) {
        java.util.Objects.requireNonNull(_field);
        if (!FIELD_METADATA.containsKey(Integer.valueOf(_id))) {
            throw new java.lang.IllegalArgumentException("unknown field " + _id);
        }

        InnerUnion _u = new  InnerUnion();

        try {
            switch(_id) {
                case 1:
                    _u.id = _id;
                    _u.value = (byte[]) _field;
                    return _u;
                default:
                throw new IllegalArgumentException("invalid type " + _field.getClass().getName() + " for field " + _id);
            }
        } catch (java.lang.Exception t) {
            throw new IllegalArgumentException("invalid type " + _field.getClass().getName() + " for field " + _id);
        }
    }

    @ThriftConstructor
    public InnerUnion() {
    }
    
    @ThriftConstructor
    @Deprecated
    public InnerUnion(final byte[] innerOption) {
        if (!InnerUnion.allowNullFieldValues && innerOption == null) {
            throw new TProtocolException("Cannot initialize Union field 'InnerUnion.innerOption' with null value!");
        }
        this.value = innerOption;
        this.id = 1;
    }
    
    public static InnerUnion fromInnerOption(final byte[] innerOption) {
        InnerUnion res = new InnerUnion();
        if (!InnerUnion.allowNullFieldValues && innerOption == null) {
            throw new TProtocolException("Cannot initialize Union field 'InnerUnion.innerOption' with null value!");
        }
        res.value = innerOption;
        res.id = 1;
        return res;
    }
    

    @com.facebook.swift.codec.ThriftField(value=1, name="innerOption", requiredness=Requiredness.NONE)
    public byte[] getInnerOption() {
        if (this.id != 1) {
            throw new IllegalStateException("Not a innerOption element!");
        }
        return (byte[]) value;
    }

    public boolean isSetInnerOption() {
        return this.id == 1;
    }

    @ThriftUnionId
    public short getThriftId() {
        return this.id;
    }

    public String getThriftName() {
        TField tField = (TField) FIELD_METADATA.get((int) this.id);
        if (tField == null) {
            return "null";
        } else {
            return tField.name;
        }
    }

    public void accept(Visitor visitor) {
        if (isSetInnerOption()) {
            visitor.visitInnerOption(getInnerOption());
            return;
        }
    }

    @java.lang.Override
    public String toString() {
        return toStringHelper(this)
            .add("value", value)
            .add("id", id)
            .add("name", getThriftName())
            .add("type", value == null ? "<null>" : value.getClass().getSimpleName())
            .toString();
    }

    @java.lang.Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        InnerUnion other = (InnerUnion)o;

        return Objects.equals(this.id, other.id)
                && Objects.deepEquals(this.value, other.value);
    }

    @java.lang.Override
    public int hashCode() {
        return Arrays.deepHashCode(new java.lang.Object[] {
            id,
            value,
        });
    }

    public interface Visitor {
        void visitInnerOption(byte[] innerOption);
    }

    public void write0(TProtocol oprot) throws TException {
      if (this.id != 0 && this.value == null ){
        if(allowNullFieldValues) {
          // Warning: this path will generate corrupt serialized data!
          return;
        } else {
          throw new TProtocolException("Cannot write a Union with marked-as-set but null value!");
        }
      }
      oprot.writeStructBegin(STRUCT_DESC);
      switch (this.id) {
      case _INNEROPTION: {
        oprot.writeFieldBegin(INNER_OPTION_FIELD_DESC);
        byte[] innerOption = (byte[])this.value;
        oprot.writeBinary(java.nio.ByteBuffer.wrap(innerOption));
        oprot.writeFieldEnd();
        break;
      }
      default:
          // ignore unknown field
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }
    
    
    public static com.facebook.thrift.payload.Reader<InnerUnion> asReader() {
      return InnerUnion::read0;
    }
    
    public static InnerUnion read0(TProtocol oprot) throws TException {
      InnerUnion res = new InnerUnion();
      res.value = null;
      res.id = (short) 0;
      oprot.readStructBegin(InnerUnion.NAMES_TO_IDS, InnerUnion.THRIFT_NAMES_TO_IDS, InnerUnion.FIELD_METADATA);
      TField __field = oprot.readFieldBegin();
      if (__field.type != TType.STOP) {
          switch (__field.id) {
          case _INNEROPTION:
            if (__field.type == INNER_OPTION_FIELD_DESC.type) {
              byte[] innerOption = oprot.readBinary().array();
              res.value = innerOption;
            }
            break;
          default:
            TProtocolUtil.skip(oprot, __field.type);
          }
        if (res.value != null) {
          res.id = __field.id;
        }
        oprot.readFieldEnd();
        TField __stopField = oprot.readFieldBegin(); // Consume the STOP byte
        if (__stopField.type != TType.STOP) {
          throw new TProtocolException(TProtocolException.INVALID_DATA, "Union 'InnerUnion' is missing a STOP byte");
        }
      }
      oprot.readStructEnd();
      return res;
    }
    public static InnerUnion defaultInstance() {
        return _DEFAULT;
    }

}
