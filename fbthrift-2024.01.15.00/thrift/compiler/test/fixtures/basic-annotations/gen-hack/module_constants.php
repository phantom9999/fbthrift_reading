<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

class module_CONSTANTS implements \IThriftConstants {
  /**
   * Original thrift constant:-
   * module.MyStruct myStruct
   */
  <<__Memoize>>
  public static function myStruct()[write_props]: MyStruct{
    return MyStruct::fromShape(
      shape(
        "major" => 42,
        "abstract" => "abstract",
        "my_enum" => MyEnum::DOMAIN,
      )
    );
  }


  public static function getAllStructuredAnnotations()[write_props]: dict<string, dict<string, \IThriftStruct>> {
    return dict[
    ];
  }
}

