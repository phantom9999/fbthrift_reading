/*
 *  Copyright (c) 2018-present, Facebook, Inc.
 *  All rights reserved.
 *
 *  This source code is licensed under the BSD-style license found in the
 *  LICENSE file in the root directory of this source tree.
 */

#include <folly/portability/GTest.h>

#include <fizz/compression/ZlibCertificateCompressor.h>
#include <fizz/compression/ZlibCertificateDecompressor.h>
#include <fizz/protocol/test/Matchers.h>
#include <fizz/protocol/test/Utilities.h>
#include <fizz/record/Extensions.h>

using namespace folly;
using namespace testing;

namespace fizz {
namespace test {

static const std::string exampleCompressedCertificate =
    "000100042c0003eb789c636060d1606051366862913768626267e26498f93f39"
    "7e8f605ebf012f1ba7569b47db775e46466e56068360436e034e36e650163661"
    "a6d0604351036110879d87c725352db134a744c139b3a4d250c6400a24ccc523"
    "0c17cecf2d48ccab54f0294931e4071a0a9465e6614bcbcf4f4a2c329013e735"
    "b4303031303332323030348b02722d0d2c0c2da15c83002a58ca63c005b19439"
    "29b1caa0895109d9678cac0ccc4d8cfc0c40712ea626464686ad0725bf5ebfe9"
    "ea73f57070b2b8d0269302d9cf070d4c97337c9db7c286bdaa5dd1a5cb7c51e7"
    "dfbeb83b8f336c77aaadfe2ab76daea18bad81eac3c7f2066d754725b938b7f1"
    "4fbf9bf04c216f82b56fd62fe1da45afcba2b2f403a719bb097a2838ac57b14a"
    "7bdb646575eee1e48f9f2a35038c37d42dd22bf4894ff97afde59bc6b0b0b2e7"
    "3d126c31778fbf48fe16d23677c3f1e507c5a424984a6f3a36ee5cd45a74e161"
    "c19590a6f4a79b2b84f61c9bc8a82439a32c7a57aa5aceae2f96caf7967f68e7"
    "e44c0f2a5da3f8fef9de9947a7cffa1f94f5769f87a6b666fc8408a5067bf60f"
    "da7bd5b8a33ecc9e79de78fad7d58a8f7e6f5a70e9cf59cbbdced7add504bb82"
    "db5ed96eeb886762666460448b7be626264606d349c1b3b62edb93dd7babebda"
    "63e92d2e4eaa6e17b51eef2967e8abe4c8cf9870d9d35abfb7b3d88ec9741dbf"
    "c0535fe16975eaccebca5872b50c0355677bd5599f5c70746af204dbbff27b1e"
    "efd835ffebcafef7ecdb5e3489d4fc5c5a74c82dc14eabbea0d0db3db130f71c"
    "9b9c1ceb92b3bde61f0f0a54f855feaf9ba8c4f7f9a6b44de0bc76fdd01b7526"
    "27f2597244eb6e1e4a51fbf8efa6884c42e26cb139130d6f4c381054f5fad9df"
    "e22f37d8aab772db8b484c39e7d1313565c1bf747b3bf7927576295b1718d9f7"
    "5ede1477e9cbc323fb7eba7eeede10dbefd1fe8eb158c2eb7d74e776eb9a39e9"
    "73271cd0d4e9b8e97f6ac2a97d3f6fe932ca4ebeba7db14ed9f6d9afaee884b4"
    "cab9996d2aebbc72ef6f6394d3a7b6df223921ae513273cf7dea7b5ffb82fba8"
    "2bdb3481f86a69ebda34e987ab93184ae51f3b78b847ac2fe37e3bedfcde94f3"
    "8b8f31771d14b73349709badbddbc7dcc6c8343de6e2d73d9f9ff1bfbbb62fd0"
    "99b995a7777e7a641097c2939a392afff3ef46d847b95f3a3f215fabc4b23a67"
    "cb258f4e45075ff5fff78ea6e464aed2f8a598eed2e11522afed159a3529dc27"
    "3ae0fe5f0581f3f7e4f3fb9f5efc3d4f243b93e7c1e660bb45f6567f0fffeee5"
    "fb5e1729f6537b91c6a4e5b1b681a577b9ab4495b2367589da3d3bf5ab6555db"
    "8ef697afdf74f5cfd7e959909df6b765dfbf6f337ff64b593f0fb7086869d5d5"
    "bd6acc5ddbc6343df756f7060606001965b3f9";

static const std::string tooLargeCompressedCertificate =
    "0001400000000FF778daedc18100000000c320cff9831ce45501000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "0000000000000000000000000000000000000000000000000000000000000000"
    "000000000000000000000000000000000000000000000000007c1ba1975190";
class ZlibCertificateCompressorTest : public testing::Test {
 public:
  void SetUp() override {
    OpenSSL_add_all_algorithms();
    compressor_ = std::make_unique<ZlibCertificateCompressor>(9);
    decompressor_ = std::make_unique<ZlibCertificateDecompressor>();
  }

  void TearDown() override {}

 protected:
  template <class T>
  T decodeHex(const std::string& hex) {
    auto data = unhexlify(hex);
    auto buf = IOBuf::copyBuffer(data.data(), data.size());
    return decode<T>(std::move(buf));
  }

  template <class T>
  std::string encodeHex(T&& msg) {
    auto buf = encode(std::forward<T>(msg));
    auto str = buf->moveToFbString().toStdString();
    return hexlify(str);
  }
  std::unique_ptr<ZlibCertificateCompressor> compressor_;
  std::unique_ptr<ZlibCertificateDecompressor> decompressor_;
};

TEST_F(ZlibCertificateCompressorTest, TestCompressDecompress) {
  auto certAndKey = createCert("fizz-selfsigned", false, nullptr);
  std::vector<folly::ssl::X509UniquePtr> certs;
  certs.push_back(std::move(certAndKey.cert));
  auto cert =
      CertUtils::makeSelfCert(std::move(certs), std::move(certAndKey.key));
  auto certMsg = cert->getCertMessage();

  // Add extension
  CertificateAuthorities auth;
  DistinguishedName dn;
  dn.encoded_name = IOBuf::copyBuffer("DistinguishedName");
  auth.authorities.push_back(std::move(dn));
  certMsg.certificate_list[0].extensions.push_back(encodeExtension(auth));

  auto compressedCertMsg = compressor_->compress(certMsg);
  EXPECT_EQ(compressedCertMsg.algorithm, CertificateCompressionAlgorithm::zlib);

  auto decompressedCertMsg = decompressor_->decompress(compressedCertMsg);
  EXPECT_TRUE(decompressedCertMsg.certificate_request_context->empty());
  EXPECT_EQ(decompressedCertMsg.certificate_list.size(), 1);
  auto& certEntry = decompressedCertMsg.certificate_list.at(0);
  EXPECT_EQ(certEntry.extensions.size(), 1);
  auto decompressedPeer = CertUtils::makePeerCert(certEntry.cert_data->clone());
  EXPECT_EQ(decompressedPeer->getIdentity(), cert->getIdentity());

  EXPECT_TRUE(IOBufEqualTo()(encode(certMsg), encode(decompressedCertMsg)));
}

TEST_F(ZlibCertificateCompressorTest, TestHugeCompressedCert) {
  auto cc = decodeHex<CompressedCertificate>(tooLargeCompressedCertificate);

  try {
    decompressor_->decompress(cc);
    FAIL() << "Decompressor decompressed excessively large cert";
  } catch (const std::exception& e) {
    EXPECT_THAT(
        e.what(), HasSubstr("exceeds maximum certificate message size"));
  }

  // Lie about size, should still error.
  cc.uncompressed_length = 64;

  try {
    decompressor_->decompress(cc);
    FAIL() << "Decompressor decompressed cert erroneously";
  } catch (const std::exception& e) {
    EXPECT_THAT(e.what(), HasSubstr("uncompressed length given is too small"));
  }
}

TEST_F(ZlibCertificateCompressorTest, TestBadMessages) {
  auto compressedCert =
      decodeHex<CompressedCertificate>(exampleCompressedCertificate);
  auto actual = compressedCert.uncompressed_length;

  // Lie about having a larger cert.
  compressedCert.uncompressed_length = actual + 1;
  try {
    decompressor_->decompress(compressedCert);
    FAIL() << "Decompressor decompressed cert erroneously";
  } catch (const std::exception& e) {
    EXPECT_THAT(e.what(), HasSubstr("Uncompressed length incorrect"));
  }

  // Truncate length
  compressedCert.uncompressed_length = actual - 1;
  try {
    decompressor_->decompress(compressedCert);
    FAIL() << "Decompressor decompressed cert erroneously";
  } catch (const std::exception& e) {
    EXPECT_THAT(e.what(), HasSubstr("uncompressed length given is too small"));
  }

  // Bad algorithm value
  compressedCert.uncompressed_length = actual;
  compressedCert.algorithm = (CertificateCompressionAlgorithm)0xdead;
  try {
    decompressor_->decompress(compressedCert);
    FAIL() << "Decompressor decompressed cert erroneously";
  } catch (const std::exception& e) {
    EXPECT_THAT(e.what(), HasSubstr("non-zlib algorithm"));
  }
}

} // namespace test
} // namespace fizz
