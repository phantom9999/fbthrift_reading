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
public class RefFields implements TBase, java.io.Serializable, Cloneable, Comparable<RefFields> {
  private static final TStruct STRUCT_DESC = new TStruct("RefFields");
  private static final TField UNIQUE_FIELD_DESC = new TField("unique", TType.LIST, (short)1);
  private static final TField SHARED_CONST_FIELD_DESC = new TField("shared_const", TType.LIST, (short)2);
  private static final TField SHARED_MUSTABLE_FIELD_DESC = new TField("shared_mustable", TType.LIST, (short)3);
  private static final TField OPT_UNIQUE_FIELD_DESC = new TField("opt_unique", TType.LIST, (short)4);
  private static final TField OPT_SHARED_CONST_FIELD_DESC = new TField("opt_shared_const", TType.LIST, (short)5);
  private static final TField OPT_SHARED_MUSTABLE_FIELD_DESC = new TField("opt_shared_mustable", TType.LIST, (short)6);
  private static final TField OPT_BOX_FIELD_DESC = new TField("opt_box", TType.LIST, (short)7);

  public List<Integer> unique;
  public List<Integer> shared_const;
  public List<Integer> shared_mustable;
  public List<Integer> opt_unique;
  public List<Integer> opt_shared_const;
  public List<Integer> opt_shared_mustable;
  public List<Integer> opt_box;
  public static final int UNIQUE = 1;
  public static final int SHARED_CONST = 2;
  public static final int SHARED_MUSTABLE = 3;
  public static final int OPT_UNIQUE = 4;
  public static final int OPT_SHARED_CONST = 5;
  public static final int OPT_SHARED_MUSTABLE = 6;
  public static final int OPT_BOX = 7;

  // isset id assignments

  public static final Map<Integer, FieldMetaData> metaDataMap;

  static {
    Map<Integer, FieldMetaData> tmpMetaDataMap = new HashMap<Integer, FieldMetaData>();
    tmpMetaDataMap.put(UNIQUE, new FieldMetaData("unique", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(SHARED_CONST, new FieldMetaData("shared_const", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(SHARED_MUSTABLE, new FieldMetaData("shared_mustable", TFieldRequirementType.DEFAULT, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(OPT_UNIQUE, new FieldMetaData("opt_unique", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(OPT_SHARED_CONST, new FieldMetaData("opt_shared_const", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(OPT_SHARED_MUSTABLE, new FieldMetaData("opt_shared_mustable", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    tmpMetaDataMap.put(OPT_BOX, new FieldMetaData("opt_box", TFieldRequirementType.OPTIONAL, 
        new ListMetaData(TType.LIST, 
            new FieldValueMetaData(TType.I32))));
    metaDataMap = Collections.unmodifiableMap(tmpMetaDataMap);
  }

  static {
    FieldMetaData.addStructMetaDataMap(RefFields.class, metaDataMap);
  }

  public RefFields() {
  }

  public RefFields(
      List<Integer> unique,
      List<Integer> shared_const,
      List<Integer> shared_mustable) {
    this();
    this.unique = unique;
    this.shared_const = shared_const;
    this.shared_mustable = shared_mustable;
  }

  public RefFields(
      List<Integer> unique,
      List<Integer> shared_const,
      List<Integer> shared_mustable,
      List<Integer> opt_unique,
      List<Integer> opt_shared_const,
      List<Integer> opt_shared_mustable,
      List<Integer> opt_box) {
    this();
    this.unique = unique;
    this.shared_const = shared_const;
    this.shared_mustable = shared_mustable;
    this.opt_unique = opt_unique;
    this.opt_shared_const = opt_shared_const;
    this.opt_shared_mustable = opt_shared_mustable;
    this.opt_box = opt_box;
  }

  public static class Builder {
    private List<Integer> unique;
    private List<Integer> shared_const;
    private List<Integer> shared_mustable;
    private List<Integer> opt_unique;
    private List<Integer> opt_shared_const;
    private List<Integer> opt_shared_mustable;
    private List<Integer> opt_box;

    public Builder() {
    }

    public Builder setUnique(final List<Integer> unique) {
      this.unique = unique;
      return this;
    }

    public Builder setShared_const(final List<Integer> shared_const) {
      this.shared_const = shared_const;
      return this;
    }

    public Builder setShared_mustable(final List<Integer> shared_mustable) {
      this.shared_mustable = shared_mustable;
      return this;
    }

    public Builder setOpt_unique(final List<Integer> opt_unique) {
      this.opt_unique = opt_unique;
      return this;
    }

    public Builder setOpt_shared_const(final List<Integer> opt_shared_const) {
      this.opt_shared_const = opt_shared_const;
      return this;
    }

    public Builder setOpt_shared_mustable(final List<Integer> opt_shared_mustable) {
      this.opt_shared_mustable = opt_shared_mustable;
      return this;
    }

    public Builder setOpt_box(final List<Integer> opt_box) {
      this.opt_box = opt_box;
      return this;
    }

    public RefFields build() {
      RefFields result = new RefFields();
      result.setUnique(this.unique);
      result.setShared_const(this.shared_const);
      result.setShared_mustable(this.shared_mustable);
      result.setOpt_unique(this.opt_unique);
      result.setOpt_shared_const(this.opt_shared_const);
      result.setOpt_shared_mustable(this.opt_shared_mustable);
      result.setOpt_box(this.opt_box);
      return result;
    }
  }

  public static Builder builder() {
    return new Builder();
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public RefFields(RefFields other) {
    if (other.isSetUnique()) {
      this.unique = TBaseHelper.deepCopy(other.unique);
    }
    if (other.isSetShared_const()) {
      this.shared_const = TBaseHelper.deepCopy(other.shared_const);
    }
    if (other.isSetShared_mustable()) {
      this.shared_mustable = TBaseHelper.deepCopy(other.shared_mustable);
    }
    if (other.isSetOpt_unique()) {
      this.opt_unique = TBaseHelper.deepCopy(other.opt_unique);
    }
    if (other.isSetOpt_shared_const()) {
      this.opt_shared_const = TBaseHelper.deepCopy(other.opt_shared_const);
    }
    if (other.isSetOpt_shared_mustable()) {
      this.opt_shared_mustable = TBaseHelper.deepCopy(other.opt_shared_mustable);
    }
    if (other.isSetOpt_box()) {
      this.opt_box = TBaseHelper.deepCopy(other.opt_box);
    }
  }

  public RefFields deepCopy() {
    return new RefFields(this);
  }

  public List<Integer> getUnique() {
    return this.unique;
  }

  public RefFields setUnique(List<Integer> unique) {
    this.unique = unique;
    return this;
  }

  public void unsetUnique() {
    this.unique = null;
  }

  // Returns true if field unique is set (has been assigned a value) and false otherwise
  public boolean isSetUnique() {
    return this.unique != null;
  }

  public void setUniqueIsSet(boolean __value) {
    if (!__value) {
      this.unique = null;
    }
  }

  public List<Integer> getShared_const() {
    return this.shared_const;
  }

  public RefFields setShared_const(List<Integer> shared_const) {
    this.shared_const = shared_const;
    return this;
  }

  public void unsetShared_const() {
    this.shared_const = null;
  }

  // Returns true if field shared_const is set (has been assigned a value) and false otherwise
  public boolean isSetShared_const() {
    return this.shared_const != null;
  }

  public void setShared_constIsSet(boolean __value) {
    if (!__value) {
      this.shared_const = null;
    }
  }

  public List<Integer> getShared_mustable() {
    return this.shared_mustable;
  }

  public RefFields setShared_mustable(List<Integer> shared_mustable) {
    this.shared_mustable = shared_mustable;
    return this;
  }

  public void unsetShared_mustable() {
    this.shared_mustable = null;
  }

  // Returns true if field shared_mustable is set (has been assigned a value) and false otherwise
  public boolean isSetShared_mustable() {
    return this.shared_mustable != null;
  }

  public void setShared_mustableIsSet(boolean __value) {
    if (!__value) {
      this.shared_mustable = null;
    }
  }

  public List<Integer> getOpt_unique() {
    return this.opt_unique;
  }

  public RefFields setOpt_unique(List<Integer> opt_unique) {
    this.opt_unique = opt_unique;
    return this;
  }

  public void unsetOpt_unique() {
    this.opt_unique = null;
  }

  // Returns true if field opt_unique is set (has been assigned a value) and false otherwise
  public boolean isSetOpt_unique() {
    return this.opt_unique != null;
  }

  public void setOpt_uniqueIsSet(boolean __value) {
    if (!__value) {
      this.opt_unique = null;
    }
  }

  public List<Integer> getOpt_shared_const() {
    return this.opt_shared_const;
  }

  public RefFields setOpt_shared_const(List<Integer> opt_shared_const) {
    this.opt_shared_const = opt_shared_const;
    return this;
  }

  public void unsetOpt_shared_const() {
    this.opt_shared_const = null;
  }

  // Returns true if field opt_shared_const is set (has been assigned a value) and false otherwise
  public boolean isSetOpt_shared_const() {
    return this.opt_shared_const != null;
  }

  public void setOpt_shared_constIsSet(boolean __value) {
    if (!__value) {
      this.opt_shared_const = null;
    }
  }

  public List<Integer> getOpt_shared_mustable() {
    return this.opt_shared_mustable;
  }

  public RefFields setOpt_shared_mustable(List<Integer> opt_shared_mustable) {
    this.opt_shared_mustable = opt_shared_mustable;
    return this;
  }

  public void unsetOpt_shared_mustable() {
    this.opt_shared_mustable = null;
  }

  // Returns true if field opt_shared_mustable is set (has been assigned a value) and false otherwise
  public boolean isSetOpt_shared_mustable() {
    return this.opt_shared_mustable != null;
  }

  public void setOpt_shared_mustableIsSet(boolean __value) {
    if (!__value) {
      this.opt_shared_mustable = null;
    }
  }

  public List<Integer> getOpt_box() {
    return this.opt_box;
  }

  public RefFields setOpt_box(List<Integer> opt_box) {
    this.opt_box = opt_box;
    return this;
  }

  public void unsetOpt_box() {
    this.opt_box = null;
  }

  // Returns true if field opt_box is set (has been assigned a value) and false otherwise
  public boolean isSetOpt_box() {
    return this.opt_box != null;
  }

  public void setOpt_boxIsSet(boolean __value) {
    if (!__value) {
      this.opt_box = null;
    }
  }

  @SuppressWarnings("unchecked")
  public void setFieldValue(int fieldID, Object __value) {
    switch (fieldID) {
    case UNIQUE:
      if (__value == null) {
        unsetUnique();
      } else {
        setUnique((List<Integer>)__value);
      }
      break;

    case SHARED_CONST:
      if (__value == null) {
        unsetShared_const();
      } else {
        setShared_const((List<Integer>)__value);
      }
      break;

    case SHARED_MUSTABLE:
      if (__value == null) {
        unsetShared_mustable();
      } else {
        setShared_mustable((List<Integer>)__value);
      }
      break;

    case OPT_UNIQUE:
      if (__value == null) {
        unsetOpt_unique();
      } else {
        setOpt_unique((List<Integer>)__value);
      }
      break;

    case OPT_SHARED_CONST:
      if (__value == null) {
        unsetOpt_shared_const();
      } else {
        setOpt_shared_const((List<Integer>)__value);
      }
      break;

    case OPT_SHARED_MUSTABLE:
      if (__value == null) {
        unsetOpt_shared_mustable();
      } else {
        setOpt_shared_mustable((List<Integer>)__value);
      }
      break;

    case OPT_BOX:
      if (__value == null) {
        unsetOpt_box();
      } else {
        setOpt_box((List<Integer>)__value);
      }
      break;

    default:
      throw new IllegalArgumentException("Field " + fieldID + " doesn't exist!");
    }
  }

  public Object getFieldValue(int fieldID) {
    switch (fieldID) {
    case UNIQUE:
      return getUnique();

    case SHARED_CONST:
      return getShared_const();

    case SHARED_MUSTABLE:
      return getShared_mustable();

    case OPT_UNIQUE:
      return getOpt_unique();

    case OPT_SHARED_CONST:
      return getOpt_shared_const();

    case OPT_SHARED_MUSTABLE:
      return getOpt_shared_mustable();

    case OPT_BOX:
      return getOpt_box();

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
    if (!(_that instanceof RefFields))
      return false;
    RefFields that = (RefFields)_that;

    if (!TBaseHelper.equalsNobinary(this.isSetUnique(), that.isSetUnique(), this.unique, that.unique)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetShared_const(), that.isSetShared_const(), this.shared_const, that.shared_const)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetShared_mustable(), that.isSetShared_mustable(), this.shared_mustable, that.shared_mustable)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOpt_unique(), that.isSetOpt_unique(), this.opt_unique, that.opt_unique)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOpt_shared_const(), that.isSetOpt_shared_const(), this.opt_shared_const, that.opt_shared_const)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOpt_shared_mustable(), that.isSetOpt_shared_mustable(), this.opt_shared_mustable, that.opt_shared_mustable)) { return false; }

    if (!TBaseHelper.equalsNobinary(this.isSetOpt_box(), that.isSetOpt_box(), this.opt_box, that.opt_box)) { return false; }

    return true;
  }

  @Override
  public int hashCode() {
    return Arrays.deepHashCode(new Object[] {unique, shared_const, shared_mustable, opt_unique, opt_shared_const, opt_shared_mustable, opt_box});
  }

  @Override
  public int compareTo(RefFields other) {
    if (other == null) {
      // See java.lang.Comparable docs
      throw new NullPointerException();
    }

    if (other == this) {
      return 0;
    }
    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetUnique()).compareTo(other.isSetUnique());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(unique, other.unique);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetShared_const()).compareTo(other.isSetShared_const());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(shared_const, other.shared_const);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetShared_mustable()).compareTo(other.isSetShared_mustable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(shared_mustable, other.shared_mustable);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOpt_unique()).compareTo(other.isSetOpt_unique());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(opt_unique, other.opt_unique);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOpt_shared_const()).compareTo(other.isSetOpt_shared_const());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(opt_shared_const, other.opt_shared_const);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOpt_shared_mustable()).compareTo(other.isSetOpt_shared_mustable());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(opt_shared_mustable, other.opt_shared_mustable);
    if (lastComparison != 0) { 
      return lastComparison;
    }
    lastComparison = Boolean.valueOf(isSetOpt_box()).compareTo(other.isSetOpt_box());
    if (lastComparison != 0) {
      return lastComparison;
    }
    lastComparison = TBaseHelper.compareTo(opt_box, other.opt_box);
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
        case UNIQUE:
          if (__field.type == TType.LIST) {
            {
              TList _list37 = iprot.readListBegin();
              this.unique = new ArrayList<Integer>(Math.max(0, _list37.size));
              for (int _i38 = 0; 
                   (_list37.size < 0) ? iprot.peekList() : (_i38 < _list37.size); 
                   ++_i38)
              {
                int _elem39;
                _elem39 = iprot.readI32();
                this.unique.add(_elem39);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SHARED_CONST:
          if (__field.type == TType.LIST) {
            {
              TList _list40 = iprot.readListBegin();
              this.shared_const = new ArrayList<Integer>(Math.max(0, _list40.size));
              for (int _i41 = 0; 
                   (_list40.size < 0) ? iprot.peekList() : (_i41 < _list40.size); 
                   ++_i41)
              {
                int _elem42;
                _elem42 = iprot.readI32();
                this.shared_const.add(_elem42);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case SHARED_MUSTABLE:
          if (__field.type == TType.LIST) {
            {
              TList _list43 = iprot.readListBegin();
              this.shared_mustable = new ArrayList<Integer>(Math.max(0, _list43.size));
              for (int _i44 = 0; 
                   (_list43.size < 0) ? iprot.peekList() : (_i44 < _list43.size); 
                   ++_i44)
              {
                int _elem45;
                _elem45 = iprot.readI32();
                this.shared_mustable.add(_elem45);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPT_UNIQUE:
          if (__field.type == TType.LIST) {
            {
              TList _list46 = iprot.readListBegin();
              this.opt_unique = new ArrayList<Integer>(Math.max(0, _list46.size));
              for (int _i47 = 0; 
                   (_list46.size < 0) ? iprot.peekList() : (_i47 < _list46.size); 
                   ++_i47)
              {
                int _elem48;
                _elem48 = iprot.readI32();
                this.opt_unique.add(_elem48);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPT_SHARED_CONST:
          if (__field.type == TType.LIST) {
            {
              TList _list49 = iprot.readListBegin();
              this.opt_shared_const = new ArrayList<Integer>(Math.max(0, _list49.size));
              for (int _i50 = 0; 
                   (_list49.size < 0) ? iprot.peekList() : (_i50 < _list49.size); 
                   ++_i50)
              {
                int _elem51;
                _elem51 = iprot.readI32();
                this.opt_shared_const.add(_elem51);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPT_SHARED_MUSTABLE:
          if (__field.type == TType.LIST) {
            {
              TList _list52 = iprot.readListBegin();
              this.opt_shared_mustable = new ArrayList<Integer>(Math.max(0, _list52.size));
              for (int _i53 = 0; 
                   (_list52.size < 0) ? iprot.peekList() : (_i53 < _list52.size); 
                   ++_i53)
              {
                int _elem54;
                _elem54 = iprot.readI32();
                this.opt_shared_mustable.add(_elem54);
              }
              iprot.readListEnd();
            }
          } else {
            TProtocolUtil.skip(iprot, __field.type);
          }
          break;
        case OPT_BOX:
          if (__field.type == TType.LIST) {
            {
              TList _list55 = iprot.readListBegin();
              this.opt_box = new ArrayList<Integer>(Math.max(0, _list55.size));
              for (int _i56 = 0; 
                   (_list55.size < 0) ? iprot.peekList() : (_i56 < _list55.size); 
                   ++_i56)
              {
                int _elem57;
                _elem57 = iprot.readI32();
                this.opt_box.add(_elem57);
              }
              iprot.readListEnd();
            }
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
    if (this.unique != null) {
      oprot.writeFieldBegin(UNIQUE_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.unique.size()));
        for (int _iter58 : this.unique)        {
          oprot.writeI32(_iter58);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.shared_const != null) {
      oprot.writeFieldBegin(SHARED_CONST_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.shared_const.size()));
        for (int _iter59 : this.shared_const)        {
          oprot.writeI32(_iter59);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.shared_mustable != null) {
      oprot.writeFieldBegin(SHARED_MUSTABLE_FIELD_DESC);
      {
        oprot.writeListBegin(new TList(TType.I32, this.shared_mustable.size()));
        for (int _iter60 : this.shared_mustable)        {
          oprot.writeI32(_iter60);
        }
        oprot.writeListEnd();
      }
      oprot.writeFieldEnd();
    }
    if (this.opt_unique != null) {
      if (isSetOpt_unique()) {
        oprot.writeFieldBegin(OPT_UNIQUE_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.opt_unique.size()));
          for (int _iter61 : this.opt_unique)          {
            oprot.writeI32(_iter61);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.opt_shared_const != null) {
      if (isSetOpt_shared_const()) {
        oprot.writeFieldBegin(OPT_SHARED_CONST_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.opt_shared_const.size()));
          for (int _iter62 : this.opt_shared_const)          {
            oprot.writeI32(_iter62);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.opt_shared_mustable != null) {
      if (isSetOpt_shared_mustable()) {
        oprot.writeFieldBegin(OPT_SHARED_MUSTABLE_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.opt_shared_mustable.size()));
          for (int _iter63 : this.opt_shared_mustable)          {
            oprot.writeI32(_iter63);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
    if (this.opt_box != null) {
      if (isSetOpt_box()) {
        oprot.writeFieldBegin(OPT_BOX_FIELD_DESC);
        {
          oprot.writeListBegin(new TList(TType.I32, this.opt_box.size()));
          for (int _iter64 : this.opt_box)          {
            oprot.writeI32(_iter64);
          }
          oprot.writeListEnd();
        }
        oprot.writeFieldEnd();
      }
    }
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
    StringBuilder sb = new StringBuilder("RefFields");
    sb.append(space);
    sb.append("(");
    sb.append(newLine);
    boolean first = true;

    sb.append(indentStr);
    sb.append("unique");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getUnique() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getUnique(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("shared_const");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getShared_const() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getShared_const(), indent + 1, prettyPrint));
    }
    first = false;
    if (!first) sb.append("," + newLine);
    sb.append(indentStr);
    sb.append("shared_mustable");
    sb.append(space);
    sb.append(":").append(space);
    if (this.getShared_mustable() == null) {
      sb.append("null");
    } else {
      sb.append(TBaseHelper.toString(this.getShared_mustable(), indent + 1, prettyPrint));
    }
    first = false;
    if (isSetOpt_unique())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("opt_unique");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getOpt_unique() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getOpt_unique(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetOpt_shared_const())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("opt_shared_const");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getOpt_shared_const() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getOpt_shared_const(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetOpt_shared_mustable())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("opt_shared_mustable");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getOpt_shared_mustable() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getOpt_shared_mustable(), indent + 1, prettyPrint));
      }
      first = false;
    }
    if (isSetOpt_box())
    {
      if (!first) sb.append("," + newLine);
      sb.append(indentStr);
      sb.append("opt_box");
      sb.append(space);
      sb.append(":").append(space);
      if (this.getOpt_box() == null) {
        sb.append("null");
      } else {
        sb.append(TBaseHelper.toString(this.getOpt_box(), indent + 1, prettyPrint));
      }
      first = false;
    }
    sb.append(newLine + TBaseHelper.reduceIndent(indentStr));
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws TException {
    // check for required fields
  }

}

