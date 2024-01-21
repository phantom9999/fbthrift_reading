#include <stdint.h>

#include <fizz/third-party/libsodium-aegis/aegis256/aead_aegis256.h>

extern struct crypto_aead_aegis256_implementation
    fizz_crypto_aead_aegis256_soft_implementation;
extern struct aegis256_evp aegis256_soft_evp;
