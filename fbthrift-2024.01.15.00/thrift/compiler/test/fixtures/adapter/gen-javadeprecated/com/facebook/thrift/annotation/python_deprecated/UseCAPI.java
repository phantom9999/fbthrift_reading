/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.thrift.annotation.python_deprecated;

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

/**
 * Controls cpp <-> python FFI for a struct or union
 * By default, struct uses marshal C API unless cpp.Type or cpp.Adapter is present
 * on a field or a type
 * Use this annotation to opt-in struct to marshal in spite of cpp.Type or cpp.Adapter
 * Alternatively, use this struct with serialize = false to use serialization for FFI.
 */
@SuppressWarnings({ "unused", "serial" })
public class UseCAPI implements TBase, java.io.Serializable, Cloneable, Comparable<UseCAPI> {
  private static final TStruct STRUCT_DESC = new TStruct("UseCAPI");
  private static final TField SERIALIZE_FIELD_DESC = new TField("serialize", TType.BOOL, (short)1);

  public boolean serialize;
  public static final int SERIALIZE = 1;

  // isset id assignments
  private static final int __SERIALIZE_ISSET_ID = 0;
  private BitSet __isset_bit_vector = new BitSet(1);

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(SERIALIZE, new FieldMetaData("serialize", TFieldRequirementType.DEFAULT, 
        new FieldValueMetaData(TType.BOOL)));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(UseCAPI.class, metaDataMap);
  }

  public UseCAPI() {
    this.serialize = false;

  }

  public UseCAPI(
      boolean serialize) {
    this();
    this.serialize = serialize;
    setSerializeIsSet(true);
  }

  public static class Builder {
    private boolean serialize;

    BitSet __optional_isset = new BitSet(1);

    public Builder() {
    }

    public Builder setSerialize(final boolean serialize) {
      this.serialize = serialize;
      __optional_isset.set(__SERIALIZE_ISSET_ID, true);
      return this;
    }

    public UseCAPI build() {
      UseCAPI result = new UseCAPI();
      if (__optional_isset.get(__SERIALIZE_ISSET_ID)) {
        result.setSerialize(this.serialize);
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
  public UseCAPI(UseCAPI other) {
    __isset_bit_vector.clear();
    __isset_bit_vector.or(other.__isset_bit_vector);
    this.serialize = TBaseHelper.deepCopy(other.serialize);
  }

  public UseCAPI deepCopy() {
    return new UseCAPI(this);
  }

  public boolean isSerialize() {
    return this.serialize;
  }

  public UseCAPI setSerialize(boolean serialize) {
    this.serialize = serialize;
    setSerializeIsSet(true);
    return this;
  }

  public void unsetSerialize() {
    __isset_bit_vector.clear(__SERIALIZE_ISSET_ID);
  }

  // Returns true if field serialize is set (has been assigned a value) and false otherwise
  public boolean isSetSerialize() {
    return __isset_bit_vector.get(__SERIALIZE_ISSET_ID);
  }

  public void setSerializeIsSet(boolean __value) {
    __isset_bit_vector.set(__SERIALIZE_ISSET_ID, __value);
  }

  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case SERIALIZE:
      if (__value == null) {
        unsetSerialize();
      } else {
        setSerialize((Boolean)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case SERIALIZE:
      return new Boolean(isSerialize());

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
    if (!(_that instanceof UseCAPI))
      return false;
    UseCAPI that = (UseCAPI)_that;

    if (!TBaseHelper.equalsNobinary(this.serialize, that.serialize)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {serialize});
  }

  @Override
  public int compareTo(UseCAPI other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetSerialize()).compareTo(other.isSetSerialize());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(serialize, other.serialize);
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
        case SERIALIZE:
          if (__field.type == TType.BOOL) {
            this.serialize = iprot.readBool();
            setSerializeIsSet(true);
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
    oprot.writeFieldBegin(SERIALIZE_FIELD_DESC);
    oprot.writeBool(this.serialize);
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
    StringBuilder sb = new StringBuilder("UseCAPI");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("serialize");
    sb.append(space);
    sb.append(":").append(space);
    sb.append(TBaseHelper.toString(this.isSerialize(), indent + 1, prettyPrint));
    first = false;
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

