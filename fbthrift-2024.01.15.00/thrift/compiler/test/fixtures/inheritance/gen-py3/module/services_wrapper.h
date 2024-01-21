/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#pragma once
#if __has_include(<thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/MyRoot.h>)
#include <thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/MyRoot.h>
#else
#include <thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/module_handlers.h>
#endif
#if __has_include(<thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/MyNode.h>)
#include <thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/MyNode.h>
#else
#include <thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/module_handlers.h>
#endif
#if __has_include(<thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/MyLeaf.h>)
#include <thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/MyLeaf.h>
#else
#include <thrift/compiler/test/fixtures/inheritance/src/gen-cpp2/module_handlers.h>
#endif
#include <folly/python/futures.h>
#include <Python.h>

#include <memory>

namespace cpp2 {

class MyRootWrapper : virtual public MyRootSvIf {
  protected:
    PyObject *if_object;
    folly::Executor *executor;
  public:
    explicit MyRootWrapper(PyObject *if_object, folly::Executor *exc);
    void async_tm_do_root(std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) override;
folly::SemiFuture<folly::Unit> semifuture_onStartServing() override;
folly::SemiFuture<folly::Unit> semifuture_onStopRequested() override;
};

std::shared_ptr<apache::thrift::ServerInterface> MyRootInterface(PyObject *if_object, folly::Executor *exc);


class MyNodeWrapper : public ::cpp2::MyRootWrapper, virtual public MyNodeSvIf {
  public:
    explicit MyNodeWrapper(PyObject *if_object, folly::Executor *exc);
    void async_tm_do_mid(std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) override;
folly::SemiFuture<folly::Unit> semifuture_onStartServing() override;
folly::SemiFuture<folly::Unit> semifuture_onStopRequested() override;
};

std::shared_ptr<apache::thrift::ServerInterface> MyNodeInterface(PyObject *if_object, folly::Executor *exc);


class MyLeafWrapper : public ::cpp2::MyNodeWrapper, virtual public MyLeafSvIf {
  public:
    explicit MyLeafWrapper(PyObject *if_object, folly::Executor *exc);
    void async_tm_do_leaf(std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) override;
folly::SemiFuture<folly::Unit> semifuture_onStartServing() override;
folly::SemiFuture<folly::Unit> semifuture_onStopRequested() override;
};

std::shared_ptr<apache::thrift::ServerInterface> MyLeafInterface(PyObject *if_object, folly::Executor *exc);
} // namespace cpp2