/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

package test.fixtures.optionals;

import com.facebook.thrift.type.TypeList;
import java.util.ArrayList;
import java.util.List;

public class __fbthrift_TypeList_d9659dbd implements TypeList {

  private static List<TypeMapping> list = new ArrayList<>();

  private static void add(String uri, String className) {
    list.add(new TypeList.TypeMapping(uri, className));
  }



  @java.lang.Override
  public List<TypeList.TypeMapping> getTypes() {
    return list;
  }
}
