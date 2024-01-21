<?hh
/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

namespace test\fixtures\jsenum;

/**
 * Original thrift service:-
 * FooService1
 */
interface FooService1AsyncIf extends \IThriftAsyncIf {
  /**
   * Original thrift definition:-
   * i32
   *   ping(1: string str_arg);
   */
  public function ping(string $str_arg): Awaitable<int>;
}

/**
 * Original thrift service:-
 * FooService1
 */
interface FooService1If extends \IThriftSyncIf {
  /**
   * Original thrift definition:-
   * i32
   *   ping(1: string str_arg);
   */
  public function ping(string $str_arg): int;
}

/**
 * Original thrift service:-
 * FooService1
 */
interface FooService1AsyncClientIf extends FooService1AsyncIf {
}

/**
 * Original thrift service:-
 * FooService1
 */
interface FooService1ClientIf extends \IThriftSyncIf {
  /**
   * Original thrift definition:-
   * i32
   *   ping(1: string str_arg);
   */
  public function ping(string $str_arg): Awaitable<int>;
}

/**
 * Original thrift service:-
 * FooService1
 */
trait FooService1ClientBase {
  require extends \ThriftClientBase;

}

class FooService1AsyncClient extends \ThriftClientBase implements FooService1AsyncClientIf {
  use FooService1ClientBase;

  /**
   * Original thrift definition:-
   * i32
   *   ping(1: string str_arg);
   */
  public async function ping(string $str_arg): Awaitable<int> {
    $hh_frame_metadata = $this->getHHFrameMetadata();
    if ($hh_frame_metadata !== null) {
      \HH\set_frame_metadata($hh_frame_metadata);
    }
    $rpc_options = $this->getAndResetOptions() ?? \ThriftClientBase::defaultOptions();
    $args = \test\fixtures\jsenum\FooService1_ping_args::fromShape(shape(
      'str_arg' => $str_arg,
    ));
    await $this->asyncHandler_->genBefore("FooService1", "ping", $args);
    $currentseqid = $this->sendImplHelper($args, "ping", false);
    return await $this->genAwaitResponse(\test\fixtures\jsenum\FooService1_ping_result::class, "ping", false, $currentseqid, $rpc_options);
  }

}

class FooService1Client extends \ThriftClientBase implements FooService1ClientIf {
  use FooService1ClientBase;

  /**
   * Original thrift definition:-
   * i32
   *   ping(1: string str_arg);
   */
  public async function ping(string $str_arg): Awaitable<int> {
    $hh_frame_metadata = $this->getHHFrameMetadata();
    if ($hh_frame_metadata !== null) {
      \HH\set_frame_metadata($hh_frame_metadata);
    }
    $rpc_options = $this->getAndResetOptions() ?? \ThriftClientBase::defaultOptions();
    $args = \test\fixtures\jsenum\FooService1_ping_args::fromShape(shape(
      'str_arg' => $str_arg,
    ));
    await $this->asyncHandler_->genBefore("FooService1", "ping", $args);
    $currentseqid = $this->sendImplHelper($args, "ping", false);
    return await $this->genAwaitResponse(\test\fixtures\jsenum\FooService1_ping_result::class, "ping", false, $currentseqid, $rpc_options);
  }

  /* send and recv functions */
  public function send_ping(string $str_arg): int {
    $args = \test\fixtures\jsenum\FooService1_ping_args::fromShape(shape(
      'str_arg' => $str_arg,
    ));
    return $this->sendImplHelper($args, "ping", false);
  }
  public function recv_ping(?int $expectedsequenceid = null): int {
    return $this->recvImplHelper(\test\fixtures\jsenum\FooService1_ping_result::class, "ping", false, $expectedsequenceid);
  }
}

// HELPER FUNCTIONS AND STRUCTURES

class FooService1_ping_args implements \IThriftSyncStruct, \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const \ThriftStructTypes::TSpec SPEC = dict[
    1 => shape(
      'var' => 'str_arg',
      'type' => \TType::STRING,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'str_arg' => 1,
  ];

  const type TConstructorShape = shape(
    ?'str_arg' => ?string,
  );

  const int STRUCTURAL_ID = 5542358918184482101;
  public string $str_arg;

  public function __construct(?string $str_arg = null)[] {
    $this->str_arg = $str_arg ?? '';
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'str_arg'),
    );
  }

  public function getName()[]: string {
    return 'FooService1_ping_args';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return \tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module1.ping_args",
        "fields" => vec[
          \tmeta_ThriftField::fromShape(
            shape(
              "id" => 1,
              "type" => \tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => \tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                )
              ),
              "name" => "str_arg",
            )
          ),
        ],
        "is_union" => false,
      )
    );
  }

  public static function getAllStructuredAnnotations()[write_props]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

  public function getInstanceKey()[write_props]: string {
    return \TCompactSerializer::serialize($this);
  }

}

class FooService1_ping_result extends \ThriftSyncStructWithResult implements \IThriftStructMetadata {
  use \ThriftSerializationTrait;

  const type TResult = int;

  const \ThriftStructTypes::TSpec SPEC = dict[
    0 => shape(
      'var' => 'success',
      'type' => \TType::I32,
    ),
  ];
  const dict<string, int> FIELDMAP = dict[
    'success' => 0,
  ];

  const type TConstructorShape = shape(
    ?'success' => ?this::TResult,
  );

  const int STRUCTURAL_ID = 3865318819874171525;
  public ?this::TResult $success;

  public function __construct(?this::TResult $success = null)[] {
    $this->success = $success;
  }

  public static function withDefaultValues()[]: this {
    return new static();
  }

  public static function fromShape(self::TConstructorShape $shape)[]: this {
    return new static(
      Shapes::idx($shape, 'success'),
    );
  }

  public function getName()[]: string {
    return 'FooService1_ping_result';
  }

  public function clearTerseFields()[write_props]: void {
  }

  public static function getStructMetadata()[]: \tmeta_ThriftStruct {
    return \tmeta_ThriftStruct::fromShape(
      shape(
        "name" => "module1.FooService1_ping_result",
        "fields" => vec[
          \tmeta_ThriftField::fromShape(
            shape(
              "id" => 0,
              "type" => \tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => \tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "name" => "success",
            )
          ),
        ],
        "is_union" => false,
      )
    );
  }

  public static function getAllStructuredAnnotations()[write_props]: \TStructAnnotations {
    return shape(
      'struct' => dict[],
      'fields' => dict[
      ],
    );
  }

  public function getInstanceKey()[write_props]: string {
    return \TCompactSerializer::serialize($this);
  }

}

class FooService1StaticMetadata implements \IThriftServiceStaticMetadata {
  public static function getServiceMetadata()[]: \tmeta_ThriftService {
    return \tmeta_ThriftService::fromShape(
      shape(
        "name" => "module1.FooService1",
        "functions" => vec[
          \tmeta_ThriftFunction::fromShape(
            shape(
              "name" => "ping",
              "return_type" => \tmeta_ThriftType::fromShape(
                shape(
                  "t_primitive" => \tmeta_ThriftPrimitiveType::THRIFT_I32_TYPE,
                )
              ),
              "arguments" => vec[
                \tmeta_ThriftField::fromShape(
                  shape(
                    "id" => 1,
                    "type" => \tmeta_ThriftType::fromShape(
                      shape(
                        "t_primitive" => \tmeta_ThriftPrimitiveType::THRIFT_STRING_TYPE,
                      )
                    ),
                    "name" => "str_arg",
                  )
                ),
              ],
            )
          ),
        ],
      )
    );
  }

  public static function getServiceMetadataResponse()[]: \tmeta_ThriftServiceMetadataResponse {
    return \tmeta_ThriftServiceMetadataResponse::fromShape(
      shape(
        'context' => \tmeta_ThriftServiceContext::fromShape(
          shape(
            'service_info' => self::getServiceMetadata(),
            'module' => \tmeta_ThriftModuleContext::fromShape(
              shape(
                'name' => 'module1',
              )
            ),
          )
        ),
        'metadata' => \tmeta_ThriftMetadata::fromShape(
          shape(
            'enums' => dict[
            ],
            'structs' => dict[
            ],
            'exceptions' => dict[
            ],
            'services' => dict[
            ],
          )
        ),
      )
    );
  }

  public static function getAllStructuredAnnotations()[write_props]: \TServiceAnnotations {
    return shape(
      'service' => dict[],
      'functions' => dict[
      ],
    );
  }
}

