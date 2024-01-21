/**
 * Autogenerated by Thrift
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */

#include <thrift/compiler/test/fixtures/exceptions/src/gen-py3/module/services_wrapper.h>
#include <thrift/compiler/test/fixtures/exceptions/src/gen-py3/module/services_api.h>
#include <thrift/lib/cpp2/async/AsyncProcessor.h>

namespace cpp2 {

RaiserWrapper::RaiserWrapper(PyObject *obj, folly::Executor* exc)
  : if_object(obj), executor(exc)
  {
    import_module__services();
  }


void RaiserWrapper::async_tm_doBland(
  std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) {
  auto ctx = callback->getRequestContext();
  folly::via(
    this->executor,
    [this, ctx,
     callback = std::move(callback)    ]() mutable {
        auto [promise, future] = folly::makePromiseContract<folly::Unit>();
        call_cy_Raiser_doBland(
            this->if_object,
            ctx,
            std::move(promise)        );
        std::move(future).via(this->executor).thenTry([callback = std::move(callback)](folly::Try<folly::Unit>&& t) {
          (void)t;
          callback->complete(std::move(t));
        });
    });
}
void RaiserWrapper::async_tm_doRaise(
  std::unique_ptr<apache::thrift::HandlerCallback<void>> callback) {
  auto ctx = callback->getRequestContext();
  folly::via(
    this->executor,
    [this, ctx,
     callback = std::move(callback)    ]() mutable {
        auto [promise, future] = folly::makePromiseContract<folly::Unit>();
        call_cy_Raiser_doRaise(
            this->if_object,
            ctx,
            std::move(promise)        );
        std::move(future).via(this->executor).thenTry([callback = std::move(callback)](folly::Try<folly::Unit>&& t) {
          (void)t;
          callback->complete(std::move(t));
        });
    });
}
void RaiserWrapper::async_tm_get200(
  std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::string>>> callback) {
  auto ctx = callback->getRequestContext();
  folly::via(
    this->executor,
    [this, ctx,
     callback = std::move(callback)    ]() mutable {
        auto [promise, future] = folly::makePromiseContract<std::unique_ptr<std::string>>();
        call_cy_Raiser_get200(
            this->if_object,
            ctx,
            std::move(promise)        );
        std::move(future).via(this->executor).thenTry([callback = std::move(callback)](folly::Try<std::unique_ptr<std::string>>&& t) {
          (void)t;
          callback->complete(std::move(t));
        });
    });
}
void RaiserWrapper::async_tm_get500(
  std::unique_ptr<apache::thrift::HandlerCallback<std::unique_ptr<std::string>>> callback) {
  auto ctx = callback->getRequestContext();
  folly::via(
    this->executor,
    [this, ctx,
     callback = std::move(callback)    ]() mutable {
        auto [promise, future] = folly::makePromiseContract<std::unique_ptr<std::string>>();
        call_cy_Raiser_get500(
            this->if_object,
            ctx,
            std::move(promise)        );
        std::move(future).via(this->executor).thenTry([callback = std::move(callback)](folly::Try<std::unique_ptr<std::string>>&& t) {
          (void)t;
          callback->complete(std::move(t));
        });
    });
}
std::shared_ptr<apache::thrift::ServerInterface> RaiserInterface(PyObject *if_object, folly::Executor *exc) {
  return std::make_shared<RaiserWrapper>(if_object, exc);
}
folly::SemiFuture<folly::Unit> RaiserWrapper::semifuture_onStartServing() {
  auto [promise, future] = folly::makePromiseContract<folly::Unit>();
  call_cy_Raiser_onStartServing(
      this->if_object,
      std::move(promise)
  );
  return std::move(future);
}
folly::SemiFuture<folly::Unit> RaiserWrapper::semifuture_onStopRequested() {
  auto [promise, future] = folly::makePromiseContract<folly::Unit>();
  call_cy_Raiser_onStopRequested(
      this->if_object,
      std::move(promise)
  );
  return std::move(future);
}
} // namespace cpp2