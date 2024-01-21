/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package test.fixtures.adapter;


import com.facebook.thrift.IntRangeSet;
import java.util.Map;
import java.util.HashMap;

@SuppressWarnings({ "unused" })
public enum ThriftAdaptedEnum implements com.facebook.thrift.TEnum {
  Zero(0),
  One(1);

  private final int value;

  private ThriftAdaptedEnum(int value) {
    this.value = value;
  }

  /**
   * Get the integer value of this enum value, as defined in the Thrift IDL.
   */
  public int getValue() {
    return value;
  }

  /**
   * Find a the enum type by its integer value, as defined in the Thrift IDL.
   * @return null if the value is not found.
   */
  public static ThriftAdaptedEnum findByValue(int value) { 
    switch (value) {
      case 0:
        return Zero;
      case 1:
        return One;
      default:
        return null;
    }
  }
}
