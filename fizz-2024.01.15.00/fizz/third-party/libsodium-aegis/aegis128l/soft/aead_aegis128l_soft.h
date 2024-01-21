#include <stdint.h>

#include <fizz/third-party/libsodium-aegis/aegis128l/aead_aegis128l.h>

extern struct crypto_aead_aegis128l_implementation
    fizz_crypto_aead_aegis128l_soft_implementation;
extern struct aegis128l_evp aegis128l_soft_evp;
