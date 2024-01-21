// @generated by Thrift for thrift/compiler/test/fixtures/inheritance/src/module.thrift
// This file is probably not the place you want to edit!

//! Thrift error definitions for `module`.

/// Error definitions for `MyRoot`.
pub mod my_root {

    pub type DoRootError = ::fbthrift::NonthrowingFunctionError;

    impl ::std::convert::From<crate::services::my_root::DoRootExn> for
        ::std::result::Result<(), DoRootError>
    {
        fn from(e: crate::services::my_root::DoRootExn) -> Self {
            match e {
                crate::services::my_root::DoRootExn::Success(res) => {
                    ::std::result::Result::Ok(res)
                }
                crate::services::my_root::DoRootExn::ApplicationException(aexn) =>
                    ::std::result::Result::Err(DoRootError::ApplicationException(aexn)),
            }
        }
    }

}

/// Error definitions for `MyNode`.
pub mod my_node {

    pub type DoMidError = ::fbthrift::NonthrowingFunctionError;

    impl ::std::convert::From<crate::services::my_node::DoMidExn> for
        ::std::result::Result<(), DoMidError>
    {
        fn from(e: crate::services::my_node::DoMidExn) -> Self {
            match e {
                crate::services::my_node::DoMidExn::Success(res) => {
                    ::std::result::Result::Ok(res)
                }
                crate::services::my_node::DoMidExn::ApplicationException(aexn) =>
                    ::std::result::Result::Err(DoMidError::ApplicationException(aexn)),
            }
        }
    }

}

/// Error definitions for `MyLeaf`.
pub mod my_leaf {

    pub type DoLeafError = ::fbthrift::NonthrowingFunctionError;

    impl ::std::convert::From<crate::services::my_leaf::DoLeafExn> for
        ::std::result::Result<(), DoLeafError>
    {
        fn from(e: crate::services::my_leaf::DoLeafExn) -> Self {
            match e {
                crate::services::my_leaf::DoLeafExn::Success(res) => {
                    ::std::result::Result::Ok(res)
                }
                crate::services::my_leaf::DoLeafExn::ApplicationException(aexn) =>
                    ::std::result::Result::Err(DoLeafError::ApplicationException(aexn)),
            }
        }
    }

}

