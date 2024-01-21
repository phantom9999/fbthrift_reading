// @generated by Thrift for thrift/compiler/test/fixtures/optionals/src/module.thrift
// This file is probably not the place you want to edit!


#![recursion_limit = "100000000"]
#![allow(non_camel_case_types, non_snake_case, non_upper_case_globals, unused_crate_dependencies, clippy::redundant_closure, clippy::type_complexity)]

pub mod errors;

#[allow(unused_imports)]
pub(crate) use crate as types;

pub type PersonID = ::std::primitive::i64;

#[derive(Clone, PartialEq)]
pub struct Color {
    pub red: ::std::primitive::f64,
    pub green: ::std::primitive::f64,
    pub blue: ::std::primitive::f64,
    pub alpha: ::std::primitive::f64,
    // This field forces `..Default::default()` when instantiating this
    // struct, to make code future-proof against new fields added later to
    // the definition in Thrift. If you don't want this, add the annotation
    // `(rust.exhaustive)` to the Thrift struct to eliminate this field.
    #[doc(hidden)]
    pub _dot_dot_Default_default: self::dot_dot::OtherFields,
}

#[derive(Clone, PartialEq)]
pub struct Vehicle {
    pub color: crate::types::Color,
    pub licensePlate: ::std::option::Option<::std::string::String>,
    pub description: ::std::option::Option<::std::string::String>,
    pub name: ::std::option::Option<::std::string::String>,
    pub hasAC: ::std::option::Option<::std::primitive::bool>,
    // This field forces `..Default::default()` when instantiating this
    // struct, to make code future-proof against new fields added later to
    // the definition in Thrift. If you don't want this, add the annotation
    // `(rust.exhaustive)` to the Thrift struct to eliminate this field.
    #[doc(hidden)]
    pub _dot_dot_Default_default: self::dot_dot::OtherFields,
}

#[derive(Clone, PartialEq)]
pub struct Person {
    pub id: crate::types::PersonID,
    pub name: ::std::string::String,
    pub age: ::std::option::Option<::std::primitive::i16>,
    pub address: ::std::option::Option<::std::string::String>,
    pub favoriteColor: ::std::option::Option<crate::types::Color>,
    pub friends: ::std::option::Option<::std::collections::BTreeSet<crate::types::PersonID>>,
    pub bestFriend: ::std::option::Option<crate::types::PersonID>,
    pub petNames: ::std::option::Option<::std::collections::BTreeMap<crate::types::Animal, ::std::string::String>>,
    pub afraidOfAnimal: ::std::option::Option<crate::types::Animal>,
    pub vehicles: ::std::option::Option<::std::vec::Vec<crate::types::Vehicle>>,
    // This field forces `..Default::default()` when instantiating this
    // struct, to make code future-proof against new fields added later to
    // the definition in Thrift. If you don't want this, add the annotation
    // `(rust.exhaustive)` to the Thrift struct to eliminate this field.
    #[doc(hidden)]
    pub _dot_dot_Default_default: self::dot_dot::OtherFields,
}

#[derive(Copy, Clone, Eq, PartialEq, Ord, PartialOrd, Hash)]
pub struct Animal(pub ::std::primitive::i32);

impl Animal {
    pub const DOG: Self = Animal(1i32);
    pub const CAT: Self = Animal(2i32);
    pub const TARANTULA: Self = Animal(3i32);
}

impl ::fbthrift::ThriftEnum for Animal {
    fn enumerate() -> &'static [(Self, &'static str)] {
        &[
            (Self::DOG, "DOG"),
            (Self::CAT, "CAT"),
            (Self::TARANTULA, "TARANTULA"),
        ]
    }

    fn variants() -> &'static [&'static str] {
        &[
            "DOG",
            "CAT",
            "TARANTULA",
        ]
    }

    fn variant_values() -> &'static [Self] {
        &[
            Self::DOG,
            Self::CAT,
            Self::TARANTULA,
        ]
    }
}

#[allow(clippy::derivable_impls)]
impl ::std::default::Default for Animal {
    fn default() -> Self {
        Self(::std::primitive::i32::MIN)
    }
}

impl<'a> ::std::convert::From<&'a Animal> for ::std::primitive::i32 {
    #[inline]
    fn from(x: &'a Animal) -> Self {
        x.0
    }
}

impl ::std::convert::From<Animal> for ::std::primitive::i32 {
    #[inline]
    fn from(x: Animal) -> Self {
        x.0
    }
}

impl ::std::convert::From<::std::primitive::i32> for Animal {
    #[inline]
    fn from(x: ::std::primitive::i32) -> Self {
        Self(x)
    }
}

impl ::std::fmt::Display for Animal {
    fn fmt(&self, fmt: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        static VARIANTS_BY_NUMBER: &[(&::std::primitive::str, ::std::primitive::i32)] = &[
            ("DOG", 1),
            ("CAT", 2),
            ("TARANTULA", 3),
        ];
        ::fbthrift::help::enum_display(VARIANTS_BY_NUMBER, fmt, self.0)
    }
}

impl ::std::fmt::Debug for Animal {
    fn fmt(&self, fmt: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        write!(fmt, "Animal::{}", self)
    }
}

impl ::std::str::FromStr for Animal {
    type Err = ::anyhow::Error;

    fn from_str(string: &::std::primitive::str) -> ::std::result::Result<Self, Self::Err> {
        static VARIANTS_BY_NAME: &[(&::std::primitive::str, ::std::primitive::i32)] = &[
            ("CAT", 2),
            ("DOG", 1),
            ("TARANTULA", 3),
        ];
        ::fbthrift::help::enum_from_str(VARIANTS_BY_NAME, string, "Animal").map(Self)
    }
}

impl ::fbthrift::GetTType for Animal {
    const TTYPE: ::fbthrift::TType = ::fbthrift::TType::I32;
}

impl<P> ::fbthrift::Serialize<P> for Animal
where
    P: ::fbthrift::ProtocolWriter,
{
    #[inline]
    fn write(&self, p: &mut P) {
        p.write_i32(self.into())
    }
}

impl<P> ::fbthrift::Deserialize<P> for Animal
where
    P: ::fbthrift::ProtocolReader,
{
    #[inline]
    fn read(p: &mut P) -> ::anyhow::Result<Self> {
        ::std::result::Result::Ok(Self::from(p.read_i32()?))
    }
}

#[allow(clippy::derivable_impls)]
impl ::std::default::Default for self::Color {
    fn default() -> Self {
        Self {
            red: ::std::default::Default::default(),
            green: ::std::default::Default::default(),
            blue: ::std::default::Default::default(),
            alpha: ::std::default::Default::default(),
            _dot_dot_Default_default: self::dot_dot::OtherFields(()),
        }
    }
}

impl ::std::fmt::Debug for self::Color {
    fn fmt(&self, formatter: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        formatter
            .debug_struct("Color")
            .field("red", &self.red)
            .field("green", &self.green)
            .field("blue", &self.blue)
            .field("alpha", &self.alpha)
            .finish()
    }
}

unsafe impl ::std::marker::Send for self::Color {}
unsafe impl ::std::marker::Sync for self::Color {}
impl ::std::marker::Unpin for self::Color {}

impl ::fbthrift::GetTType for self::Color {
    const TTYPE: ::fbthrift::TType = ::fbthrift::TType::Struct;
}

impl<P> ::fbthrift::Serialize<P> for self::Color
where
    P: ::fbthrift::ProtocolWriter,
{
    fn write(&self, p: &mut P) {
        p.write_struct_begin("Color");
        p.write_field_begin("red", ::fbthrift::TType::Double, 1);
        ::fbthrift::Serialize::write(&self.red, p);
        p.write_field_end();
        p.write_field_begin("green", ::fbthrift::TType::Double, 2);
        ::fbthrift::Serialize::write(&self.green, p);
        p.write_field_end();
        p.write_field_begin("blue", ::fbthrift::TType::Double, 3);
        ::fbthrift::Serialize::write(&self.blue, p);
        p.write_field_end();
        p.write_field_begin("alpha", ::fbthrift::TType::Double, 4);
        ::fbthrift::Serialize::write(&self.alpha, p);
        p.write_field_end();
        p.write_field_stop();
        p.write_struct_end();
    }
}

impl<P> ::fbthrift::Deserialize<P> for self::Color
where
    P: ::fbthrift::ProtocolReader,
{
    fn read(p: &mut P) -> ::anyhow::Result<Self> {
        static FIELDS: &[::fbthrift::Field] = &[
            ::fbthrift::Field::new("alpha", ::fbthrift::TType::Double, 4),
            ::fbthrift::Field::new("blue", ::fbthrift::TType::Double, 3),
            ::fbthrift::Field::new("green", ::fbthrift::TType::Double, 2),
            ::fbthrift::Field::new("red", ::fbthrift::TType::Double, 1),
        ];
        let mut field_red = ::std::option::Option::None;
        let mut field_green = ::std::option::Option::None;
        let mut field_blue = ::std::option::Option::None;
        let mut field_alpha = ::std::option::Option::None;
        let _ = p.read_struct_begin(|_| ())?;
        loop {
            let (_, fty, fid) = p.read_field_begin(|_| (), FIELDS)?;
            match (fty, fid as ::std::primitive::i32) {
                (::fbthrift::TType::Stop, _) => break,
                (::fbthrift::TType::Double, 1) => field_red = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::Double, 2) => field_green = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::Double, 3) => field_blue = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::Double, 4) => field_alpha = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (fty, _) => p.skip(fty)?,
            }
            p.read_field_end()?;
        }
        p.read_struct_end()?;
        ::std::result::Result::Ok(Self {
            red: field_red.unwrap_or_default(),
            green: field_green.unwrap_or_default(),
            blue: field_blue.unwrap_or_default(),
            alpha: field_alpha.unwrap_or_default(),
            _dot_dot_Default_default: self::dot_dot::OtherFields(()),
        })
    }
}


impl ::fbthrift::metadata::ThriftAnnotations for Color {
    fn get_structured_annotation<T: Sized + 'static>() -> ::std::option::Option<T> {
        #[allow(unused_variables)]
        let type_id = ::std::any::TypeId::of::<T>();

        None
    }

    fn get_field_structured_annotation<T: Sized + 'static>(field_id: i16) -> ::std::option::Option<T> {
        #[allow(unused_variables)]
        let type_id = ::std::any::TypeId::of::<T>();

        #[allow(clippy::match_single_binding)]
        match field_id {
            1 => {
            },
            2 => {
            },
            3 => {
            },
            4 => {
            },
            _ => {}
        }

        None
    }
}


#[allow(clippy::derivable_impls)]
impl ::std::default::Default for self::Vehicle {
    fn default() -> Self {
        Self {
            color: ::std::default::Default::default(),
            licensePlate: ::std::option::Option::None,
            description: ::std::option::Option::None,
            name: ::std::option::Option::None,
            hasAC: ::std::option::Option::None,
            _dot_dot_Default_default: self::dot_dot::OtherFields(()),
        }
    }
}

impl ::std::fmt::Debug for self::Vehicle {
    fn fmt(&self, formatter: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        formatter
            .debug_struct("Vehicle")
            .field("color", &self.color)
            .field("licensePlate", &self.licensePlate)
            .field("description", &self.description)
            .field("name", &self.name)
            .field("hasAC", &self.hasAC)
            .finish()
    }
}

unsafe impl ::std::marker::Send for self::Vehicle {}
unsafe impl ::std::marker::Sync for self::Vehicle {}
impl ::std::marker::Unpin for self::Vehicle {}

impl ::fbthrift::GetTType for self::Vehicle {
    const TTYPE: ::fbthrift::TType = ::fbthrift::TType::Struct;
}

impl<P> ::fbthrift::Serialize<P> for self::Vehicle
where
    P: ::fbthrift::ProtocolWriter,
{
    fn write(&self, p: &mut P) {
        p.write_struct_begin("Vehicle");
        p.write_field_begin("color", ::fbthrift::TType::Struct, 1);
        ::fbthrift::Serialize::write(&self.color, p);
        p.write_field_end();
        if let ::std::option::Option::Some(some) = &self.licensePlate {
            p.write_field_begin("licensePlate", ::fbthrift::TType::String, 2);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.description {
            p.write_field_begin("description", ::fbthrift::TType::String, 3);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.name {
            p.write_field_begin("name", ::fbthrift::TType::String, 4);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.hasAC {
            p.write_field_begin("hasAC", ::fbthrift::TType::Bool, 5);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        p.write_field_stop();
        p.write_struct_end();
    }
}

impl<P> ::fbthrift::Deserialize<P> for self::Vehicle
where
    P: ::fbthrift::ProtocolReader,
{
    fn read(p: &mut P) -> ::anyhow::Result<Self> {
        static FIELDS: &[::fbthrift::Field] = &[
            ::fbthrift::Field::new("color", ::fbthrift::TType::Struct, 1),
            ::fbthrift::Field::new("description", ::fbthrift::TType::String, 3),
            ::fbthrift::Field::new("hasAC", ::fbthrift::TType::Bool, 5),
            ::fbthrift::Field::new("licensePlate", ::fbthrift::TType::String, 2),
            ::fbthrift::Field::new("name", ::fbthrift::TType::String, 4),
        ];
        let mut field_color = ::std::option::Option::None;
        let mut field_licensePlate = ::std::option::Option::None;
        let mut field_description = ::std::option::Option::None;
        let mut field_name = ::std::option::Option::None;
        let mut field_hasAC = ::std::option::Option::None;
        let _ = p.read_struct_begin(|_| ())?;
        loop {
            let (_, fty, fid) = p.read_field_begin(|_| (), FIELDS)?;
            match (fty, fid as ::std::primitive::i32) {
                (::fbthrift::TType::Stop, _) => break,
                (::fbthrift::TType::Struct, 1) => field_color = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::String, 2) => field_licensePlate = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::String, 3) => field_description = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::String, 4) => field_name = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::Bool, 5) => field_hasAC = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (fty, _) => p.skip(fty)?,
            }
            p.read_field_end()?;
        }
        p.read_struct_end()?;
        ::std::result::Result::Ok(Self {
            color: field_color.unwrap_or_default(),
            licensePlate: field_licensePlate,
            description: field_description,
            name: field_name,
            hasAC: field_hasAC,
            _dot_dot_Default_default: self::dot_dot::OtherFields(()),
        })
    }
}


impl ::fbthrift::metadata::ThriftAnnotations for Vehicle {
    fn get_structured_annotation<T: Sized + 'static>() -> ::std::option::Option<T> {
        #[allow(unused_variables)]
        let type_id = ::std::any::TypeId::of::<T>();

        None
    }

    fn get_field_structured_annotation<T: Sized + 'static>(field_id: i16) -> ::std::option::Option<T> {
        #[allow(unused_variables)]
        let type_id = ::std::any::TypeId::of::<T>();

        #[allow(clippy::match_single_binding)]
        match field_id {
            1 => {
            },
            2 => {
            },
            3 => {
            },
            4 => {
            },
            5 => {
            },
            _ => {}
        }

        None
    }
}


#[allow(clippy::derivable_impls)]
impl ::std::default::Default for self::Person {
    fn default() -> Self {
        Self {
            id: ::std::default::Default::default(),
            name: ::std::default::Default::default(),
            age: ::std::option::Option::None,
            address: ::std::option::Option::None,
            favoriteColor: ::std::option::Option::None,
            friends: ::std::option::Option::None,
            bestFriend: ::std::option::Option::None,
            petNames: ::std::option::Option::None,
            afraidOfAnimal: ::std::option::Option::None,
            vehicles: ::std::option::Option::None,
            _dot_dot_Default_default: self::dot_dot::OtherFields(()),
        }
    }
}

impl ::std::fmt::Debug for self::Person {
    fn fmt(&self, formatter: &mut ::std::fmt::Formatter) -> ::std::fmt::Result {
        formatter
            .debug_struct("Person")
            .field("id", &self.id)
            .field("name", &self.name)
            .field("age", &self.age)
            .field("address", &self.address)
            .field("favoriteColor", &self.favoriteColor)
            .field("friends", &self.friends)
            .field("bestFriend", &self.bestFriend)
            .field("petNames", &self.petNames)
            .field("afraidOfAnimal", &self.afraidOfAnimal)
            .field("vehicles", &self.vehicles)
            .finish()
    }
}

unsafe impl ::std::marker::Send for self::Person {}
unsafe impl ::std::marker::Sync for self::Person {}
impl ::std::marker::Unpin for self::Person {}

impl ::fbthrift::GetTType for self::Person {
    const TTYPE: ::fbthrift::TType = ::fbthrift::TType::Struct;
}

impl<P> ::fbthrift::Serialize<P> for self::Person
where
    P: ::fbthrift::ProtocolWriter,
{
    fn write(&self, p: &mut P) {
        p.write_struct_begin("Person");
        p.write_field_begin("id", ::fbthrift::TType::I64, 1);
        ::fbthrift::Serialize::write(&self.id, p);
        p.write_field_end();
        p.write_field_begin("name", ::fbthrift::TType::String, 2);
        ::fbthrift::Serialize::write(&self.name, p);
        p.write_field_end();
        if let ::std::option::Option::Some(some) = &self.age {
            p.write_field_begin("age", ::fbthrift::TType::I16, 3);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.address {
            p.write_field_begin("address", ::fbthrift::TType::String, 4);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.favoriteColor {
            p.write_field_begin("favoriteColor", ::fbthrift::TType::Struct, 5);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.friends {
            p.write_field_begin("friends", ::fbthrift::TType::Set, 6);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.bestFriend {
            p.write_field_begin("bestFriend", ::fbthrift::TType::I64, 7);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.petNames {
            p.write_field_begin("petNames", ::fbthrift::TType::Map, 8);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.afraidOfAnimal {
            p.write_field_begin("afraidOfAnimal", ::fbthrift::TType::I32, 9);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        if let ::std::option::Option::Some(some) = &self.vehicles {
            p.write_field_begin("vehicles", ::fbthrift::TType::List, 10);
            ::fbthrift::Serialize::write(some, p);
            p.write_field_end();
        }
        p.write_field_stop();
        p.write_struct_end();
    }
}

impl<P> ::fbthrift::Deserialize<P> for self::Person
where
    P: ::fbthrift::ProtocolReader,
{
    fn read(p: &mut P) -> ::anyhow::Result<Self> {
        static FIELDS: &[::fbthrift::Field] = &[
            ::fbthrift::Field::new("address", ::fbthrift::TType::String, 4),
            ::fbthrift::Field::new("afraidOfAnimal", ::fbthrift::TType::I32, 9),
            ::fbthrift::Field::new("age", ::fbthrift::TType::I16, 3),
            ::fbthrift::Field::new("bestFriend", ::fbthrift::TType::I64, 7),
            ::fbthrift::Field::new("favoriteColor", ::fbthrift::TType::Struct, 5),
            ::fbthrift::Field::new("friends", ::fbthrift::TType::Set, 6),
            ::fbthrift::Field::new("id", ::fbthrift::TType::I64, 1),
            ::fbthrift::Field::new("name", ::fbthrift::TType::String, 2),
            ::fbthrift::Field::new("petNames", ::fbthrift::TType::Map, 8),
            ::fbthrift::Field::new("vehicles", ::fbthrift::TType::List, 10),
        ];
        let mut field_id = ::std::option::Option::None;
        let mut field_name = ::std::option::Option::None;
        let mut field_age = ::std::option::Option::None;
        let mut field_address = ::std::option::Option::None;
        let mut field_favoriteColor = ::std::option::Option::None;
        let mut field_friends = ::std::option::Option::None;
        let mut field_bestFriend = ::std::option::Option::None;
        let mut field_petNames = ::std::option::Option::None;
        let mut field_afraidOfAnimal = ::std::option::Option::None;
        let mut field_vehicles = ::std::option::Option::None;
        let _ = p.read_struct_begin(|_| ())?;
        loop {
            let (_, fty, fid) = p.read_field_begin(|_| (), FIELDS)?;
            match (fty, fid as ::std::primitive::i32) {
                (::fbthrift::TType::Stop, _) => break,
                (::fbthrift::TType::I64, 1) => field_id = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::String, 2) => field_name = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::I16, 3) => field_age = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::String, 4) => field_address = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::Struct, 5) => field_favoriteColor = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::Set, 6) => field_friends = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::I64, 7) => field_bestFriend = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::Map, 8) => field_petNames = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::I32, 9) => field_afraidOfAnimal = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (::fbthrift::TType::List, 10) => field_vehicles = ::std::option::Option::Some(::fbthrift::Deserialize::read(p)?),
                (fty, _) => p.skip(fty)?,
            }
            p.read_field_end()?;
        }
        p.read_struct_end()?;
        ::std::result::Result::Ok(Self {
            id: field_id.unwrap_or_default(),
            name: field_name.unwrap_or_default(),
            age: field_age,
            address: field_address,
            favoriteColor: field_favoriteColor,
            friends: field_friends,
            bestFriend: field_bestFriend,
            petNames: field_petNames,
            afraidOfAnimal: field_afraidOfAnimal,
            vehicles: field_vehicles,
            _dot_dot_Default_default: self::dot_dot::OtherFields(()),
        })
    }
}


impl ::fbthrift::metadata::ThriftAnnotations for Person {
    fn get_structured_annotation<T: Sized + 'static>() -> ::std::option::Option<T> {
        #[allow(unused_variables)]
        let type_id = ::std::any::TypeId::of::<T>();

        None
    }

    fn get_field_structured_annotation<T: Sized + 'static>(field_id: i16) -> ::std::option::Option<T> {
        #[allow(unused_variables)]
        let type_id = ::std::any::TypeId::of::<T>();

        #[allow(clippy::match_single_binding)]
        match field_id {
            1 => {
            },
            2 => {
            },
            3 => {
            },
            4 => {
            },
            5 => {
            },
            6 => {
            },
            7 => {
            },
            8 => {
            },
            9 => {
            },
            10 => {
            },
            _ => {}
        }

        None
    }
}


mod dot_dot {
    #[derive(Copy, Clone, PartialEq, Eq, PartialOrd, Ord, Hash)]
    pub struct OtherFields(pub(crate) ());

    #[allow(dead_code)] // if serde isn't being used
    pub(super) fn default_for_serde_deserialize() -> OtherFields {
        OtherFields(())
    }
}

pub(crate) mod r#impl {
    use ref_cast::RefCast;

    #[derive(RefCast)]
    #[repr(transparent)]
    pub(crate) struct LocalImpl<T>(T);

    #[allow(unused)]
    pub(crate) fn write<T, P>(value: &T, p: &mut P)
    where
        LocalImpl<T>: ::fbthrift::Serialize<P>,
        P: ::fbthrift::ProtocolWriter,
    {
        ::fbthrift::Serialize::write(LocalImpl::ref_cast(value), p);
    }

    #[allow(unused)]
    pub(crate) fn read<T, P>(p: &mut P) -> ::anyhow::Result<T>
    where
        LocalImpl<T>: ::fbthrift::Deserialize<P>,
        P: ::fbthrift::ProtocolReader,
    {
        let value: LocalImpl<T> = ::fbthrift::Deserialize::read(p)?;
        ::std::result::Result::Ok(value.0)
    }
}