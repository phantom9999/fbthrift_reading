/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.patch;

import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Collections;
import java.util.BitSet;
import java.util.Arrays;
import com.facebook.thrift.*;
import com.facebook.thrift.annotations.*;
import com.facebook.thrift.async.*;
import com.facebook.thrift.meta_data.*;
import com.facebook.thrift.server.*;
import com.facebook.thrift.transport.*;
import com.facebook.thrift.protocol.*;

@SuppressWarnings({ "unused", "serial" })
public class MyStructField10Patch implements TBase, java.io.Serializable, Cloneable, Comparable<MyStructField10Patch> {
  private static final TStruct STRUCT_DESC = new TStruct("MyStructField10Patch");
  private static final TField ASSIGN_FIELD_DESC = new TField("assign", TType.I32, (short)1);
  private static final TField CLEAR_FIELD_DESC = new TField("clear", TType.BOOL, (short)2);

  /**
   * Assigns to a (set) value.
   * 
   * If set, all other operations are ignored.
   * 
   * Note: Optional and union fields must be set before assigned.
   * 
   * 
   * @see MyEnum
   */
  public MyEnum assign;
  /**
   * Clears a value. Applies first.
   */
  public boolean clear;
  public static final int ASSIGN = 1;
  public static final int CLEAR = 2;

  // isset id assignments
  private static final int __CLEAR_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(ASSIGN, new FieldMetaData("assign", TFieldRequirementType.OPTIONAL, 
        new FieldValueMetaData(TType.I32)));
    tmpMetaDataMap.put(CLEAR, new FieldMetaData("clear", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(MyStructField10Patch.class, metaDataMap);
  }

  public MyStructField10Patch() {
  }

  public MyStructField10Patch(
      boolean clear) {
    this();
    this.clear = clear;
    setClearIsSet(true);
  }

  public MyStructField10Patch(
      MyEnum assign,
      boolean clear) {
    this();
    this.assign = assign;
    this.clear = clear;
    setClearIsSet(true);
  }

  public static class Builder {
    private MyEnum assign;
    private boolean clear;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setAssign(final MyEnum assign) {
      this.assign = assign;
      return this;
    }

    public Builder setClear(final boolean clear) {
      this.clear = clear;
      __optional_isset.set(__CLEAR_ISSET_ID, true);
      return this;
    }

    public MyStructField10Patch build() {
      MyStructField10Patch result = new MyStructField10Patch();
      result.setAssign(this.assign);
      if (__optional_isset.get(__CLEAR_ISSET_ID)) {
        result.setClear(this.clear);
      }
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public MyStructField10Patch(MyStructField10Patch other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    if (other.isSetAssign()) {
      this.assign = TBaseHelper.deepCopy(other.assign);
    }
    this.clear = TBaseHelper.deepCopy(other.clear);
  }

  public MyStructField10Patch deepCopy() {
    return new MyStructField10Patch(this);
  }

  /**
   * Assigns to a (set) value.
   * 
   * If set, all other operations are ignored.
   * 
   * Note: Optional and union fields must be set before assigned.
   * 
   * 
   * @see MyEnum
   */
  public MyEnum getAssign() {
    return this.assign;
  }

  /**
   * Assigns to a (set) value.
   * 
   * If set, all other operations are ignored.
   * 
   * Note: Optional and union fields must be set before assigned.
   * 
   * 
   * @see MyEnum
   */
  public MyStructField10Patch setAssign(MyEnum assign) {
    this.assign = assign;
    return this;
  }

  public void unsetAssign() {
    this.assign = null;
  }

  // Returns true if field assign is set (has been assigned a value) and false otherwise
  public boolean isSetAssign() {
    return this.assign != null;
  }

  public void setAssignIsSet(boolean __value) {
    if (!__value) {
      this.assign = null;
    }
  }

  /**
   * Clears a value. Applies first.
   */
  public boolean isClear() {
    return this.clear;
  }

  /**
   * Clears a value. Applies first.
   */
  public MyStructField10Patch setClear(boolean clear) {
    this.clear = clear;
    setClearIsSet(true);
    return this;
  }

  public void unsetClear() {
    __isset_bit_vector.clear(__CLEAR_ISSET_ID);
  }

  // Returns true if field clear is set (has been assigned a value) and false otherwise
  public boolean isSetClear() {
    return __isset_bit_vector.get(__CLEAR_ISSET_ID);
  }

  public void setClearIsSet(boolean __value) {
    __isset_bit_vector.set(__CLEAR_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case ASSIGN:
      if (__value == null) {
        unsetAssign();
      } else {
        setAssign((MyEnum)__value);
      }
      break;

    case CLEAR:
      if (__value == null) {
        unsetClear();
      } else {
        setClear((Boolean)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case ASSIGN:
      return getAssign();

    case CLEAR:
      return new Boolean(isClear());

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  @Override
  public boolean equals(Object _that) {
    if (_that == null)
      return false;
    if (this == _that)
      return true;
    if (!(_that instanceof MyStructField10Patch))
      return false;
    MyStructField10Patch that = (MyStructField10Patch)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetAssign(), that.isSetAssign(), this.assign, that.assign)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.clear, that.clear)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {assign, clear});
  }

  @Override
  public int compareTo(MyStructField10Patch other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetAssign()).compareTo(other.isSetAssign());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(assign, other.assign);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetClear()).compareTo(other.isSetClear());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(clear, other.clear);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    return 0;
  }

  public void read(TProtocol iprot) throws TException {
    TField __field;
    iprot.readStructBegin(metaDataMap);
    while (true)
    {
      __field = iprot.readFieldBegin();
      if (__field.type == TType.STOP) {
        break;
      }
      switch (__field.id)
      {
        case ASSIGN:
          if (__field.type == TType.I32) {
            this.assign = MyEnum.findByValue(iprot.readI32());
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case CLEAR:
          if (__field.type == TType.BOOL) {
            this.clear = iprot.readBool();
            setClearIsSet(true);
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        default:
          TProtocolUtil.skip(iprot, __field.type);
          break;
      }
      iprot.readFieldEnd();
    }
    iprot.readStructEnd();


    // check for required fields of primitive type, which can't be checked in the validate method
    validate();
  }

  public void write(TProtocol oprot) throws TException {
    validate();

    oprot.writeStructBegin(STRUCT_DESC);
    if (this.assign != null) {
      if (isSetAssign()) {
        oprot.writeFieldBegin(ASSIGN_FIELD_DESC);
        oprot.writeI32(this.assign == null ? 0 : this.assign.getValue());
        oprot.writeFieldEnd();
      }
    }
    oprot.writeFieldBegin(CLEAR_FIELD_DESC);
    oprot.writeBool(this.clear);
    oprot.writeFieldEnd();
    oprot.writeFieldStop();
    oprot.writeStructEnd();
  }

  @Override
  public String toString() {
    return toString(1, true);
  }

  @Override
  public String toString(int indent, boolean prettyPrint) {
    String indentStr = prettyPrint ? TBaseHelper.getIndentedString(indent) : "";
    String newLine = prettyPrint ? "\n" : "";
    String space = prettyPrint ? " " : "";
    StringBuilder sb = new StringBuilder("MyStructField10Patch");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    if (isSetAssign())
    {
      sb.append(indentStr);
      sb.append("assign");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getAssign() == null) {
        sb.append("null");
      } else {
        String assign_name = this.getAssign() == null ? "null" : this.getAssign().name();
        if (assign_name != null) {
          sb.append(assign_name);
          sb.append(" (");
        }
        sb.append(this.getAssign());
        if (assign_name != null) {
          sb.append(")");
        }
      }
      first = false;
    }
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("clear");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isClear(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

