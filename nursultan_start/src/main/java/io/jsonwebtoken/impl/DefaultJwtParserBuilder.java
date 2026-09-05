/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.jsonwebtoken.ClaimsBuilder
 *  io.jsonwebtoken.Clock
 *  io.jsonwebtoken.CompressionCodecResolver
 *  io.jsonwebtoken.JwtParser
 *  io.jsonwebtoken.Jwts
 *  io.jsonwebtoken.Jwts$ENC
 *  io.jsonwebtoken.Jwts$KEY
 *  io.jsonwebtoken.Jwts$SIG
 *  io.jsonwebtoken.Jwts$ZIP
 *  io.jsonwebtoken.Locator
 *  io.jsonwebtoken.SigningKeyResolver
 *  io.jsonwebtoken.gson.io.GsonDeserializer
 *  io.jsonwebtoken.impl.DefaultClaims
 *  io.jsonwebtoken.impl.DefaultClock
 *  io.jsonwebtoken.impl.DefaultJwtParser
 *  io.jsonwebtoken.impl.DefaultJwtParserBuilder$1
 *  io.jsonwebtoken.impl.DefaultJwtParserBuilder$2
 *  io.jsonwebtoken.impl.DefaultJwtParserBuilder$3
 *  io.jsonwebtoken.impl.DefaultJwtParserBuilder$4
 *  io.jsonwebtoken.impl.DefaultJwtParserBuilder$5
 *  io.jsonwebtoken.impl.io.DelegateStringDecoder
 *  io.jsonwebtoken.impl.security.ConstantKeyLocator
 *  io.jsonwebtoken.io.CompressionAlgorithm
 *  io.jsonwebtoken.io.Decoder
 *  io.jsonwebtoken.io.Decoders
 *  io.jsonwebtoken.io.Deserializer
 *  io.jsonwebtoken.lang.Assert
 *  io.jsonwebtoken.lang.Collections
 *  io.jsonwebtoken.lang.NestedCollection
 *  io.jsonwebtoken.lang.Registry
 *  io.jsonwebtoken.security.AeadAlgorithm
 *  io.jsonwebtoken.security.InvalidKeyException
 *  io.jsonwebtoken.security.KeyAlgorithm
 *  io.jsonwebtoken.security.Keys
 *  io.jsonwebtoken.security.SecureDigestAlgorithm
 */
package io.jsonwebtoken.impl;

import io.jsonwebtoken.ClaimsBuilder;
import io.jsonwebtoken.Clock;
import io.jsonwebtoken.CompressionCodecResolver;
import io.jsonwebtoken.JwtParser;
import io.jsonwebtoken.JwtParserBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.Locator;
import io.jsonwebtoken.SigningKeyResolver;
import io.jsonwebtoken.gson.io.GsonDeserializer;
import io.jsonwebtoken.impl.DefaultClaims;
import io.jsonwebtoken.impl.DefaultClock;
import io.jsonwebtoken.impl.DefaultJwtParser;
import io.jsonwebtoken.impl.DefaultJwtParserBuilder;
import io.jsonwebtoken.impl.io.DelegateStringDecoder;
import io.jsonwebtoken.impl.security.ConstantKeyLocator;
import io.jsonwebtoken.io.CompressionAlgorithm;
import io.jsonwebtoken.io.Decoder;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.io.Deserializer;
import io.jsonwebtoken.lang.Assert;
import io.jsonwebtoken.lang.Collections;
import io.jsonwebtoken.lang.NestedCollection;
import io.jsonwebtoken.lang.Registry;
import io.jsonwebtoken.security.AeadAlgorithm;
import io.jsonwebtoken.security.InvalidKeyException;
import io.jsonwebtoken.security.KeyAlgorithm;
import io.jsonwebtoken.security.Keys;
import io.jsonwebtoken.security.SecureDigestAlgorithm;
import java.io.InputStream;
import java.security.Key;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.util.Date;
import java.util.Map;
import java.util.Set;
import javax.crypto.SecretKey;

public class DefaultJwtParserBuilder
implements JwtParserBuilder {
    private static final int MILLISECONDS_PER_SECOND = 1000;
    static final long MAX_CLOCK_SKEW_MILLIS = 9223372036854775L;
    static final String MAX_CLOCK_SKEW_ILLEGAL_MSG = "Illegal allowedClockSkewMillis value: multiplying this value by 1000 to obtain the number of milliseconds would cause a numeric overflow.";
    private Provider provider;
    private boolean unsecured = false;
    private boolean unsecuredDecompression = false;
    private Locator<? extends Key> keyLocator;
    private SigningKeyResolver signingKeyResolver = null;
    private Registry<String, AeadAlgorithm> encAlgs = Jwts.ENC.get();
    private Registry<String, KeyAlgorithm<?, ?>> keyAlgs = Jwts.KEY.get();
    private Registry<String, SecureDigestAlgorithm<?, ?>> sigAlgs = Jwts.SIG.get();
    private Registry<String, CompressionAlgorithm> zipAlgs = Jwts.ZIP.get();
    private CompressionCodecResolver compressionCodecResolver;
    private Decoder<InputStream, InputStream> decoder = new DelegateStringDecoder(Decoders.BASE64URL);
    private Deserializer<Map<String, ?>> deserializer;
    private final ClaimsBuilder expectedClaims = Jwts.claims();
    private Clock clock = DefaultClock.INSTANCE;
    private Set<String> critical = Collections.emptySet();
    private long allowedClockSkewMillis = 0L;
    private Key signatureVerificationKey;
    private Key decryptionKey;

    static /* synthetic */ Registry access$102(DefaultJwtParserBuilder defaultJwtParserBuilder, Registry registry) {
        defaultJwtParserBuilder.zipAlgs = registry;
        return defaultJwtParserBuilder.zipAlgs;
    }

    static /* synthetic */ Registry access$402(DefaultJwtParserBuilder defaultJwtParserBuilder, Registry registry) {
        defaultJwtParserBuilder.keyAlgs = registry;
        return defaultJwtParserBuilder.keyAlgs;
    }

    @Override
    public NestedCollection<SecureDigestAlgorithm<?, ?>, JwtParserBuilder> sig() {
        return new 4(this, (JwtParserBuilder)this, this.sigAlgs);
    }

    @Override
    public JwtParserBuilder provider(Provider provider) {
        this.provider = provider;
        return this;
    }

    @Override
    public NestedCollection<KeyAlgorithm<?, ?>, JwtParserBuilder> key() {
        return new 5(this, (JwtParserBuilder)this, this.keyAlgs);
    }

    @Override
    public NestedCollection<AeadAlgorithm, JwtParserBuilder> enc() {
        return new 3(this, (JwtParserBuilder)this, this.encAlgs);
    }

    @Override
    public JwtParserBuilder clock(Clock clock) {
        Assert.notNull((Object)clock, (String)"Clock instance cannot be null.");
        this.clock = clock;
        return this;
    }

    @Override
    public JwtParser build() {
        ConstantKeyLocator constantKeyLocator;
        if (this.deserializer == null) {
            Class<Deserializer> clazz = Deserializer.class;
            this.json((Deserializer)this.redirect$dbf000$viafabricplus$removeServicesSupport(clazz));
        }
        if (this.signingKeyResolver != null && this.signatureVerificationKey != null) {
            String string = "Both a 'signingKeyResolver and a 'verifyWith' key cannot be configured. Choose either, or prefer `keyLocator` when possible.";
            throw new IllegalStateException(string);
        }
        if (this.keyLocator != null) {
            if (this.signatureVerificationKey != null) {
                String string = "Both 'keyLocator' and a 'verifyWith' key cannot be configured. Prefer 'keyLocator' if possible.";
                throw new IllegalStateException(string);
            }
            if (this.decryptionKey != null) {
                String string = "Both 'keyLocator' and a 'decryptWith' key cannot be configured. Prefer 'keyLocator' if possible.";
                throw new IllegalStateException(string);
            }
        }
        if ((constantKeyLocator = this.keyLocator) == null) {
            constantKeyLocator = new ConstantKeyLocator(this.signatureVerificationKey, this.decryptionKey);
        }
        if (!this.unsecured && this.unsecuredDecompression) {
            String string = "'unsecuredDecompression' is only relevant if 'unsecured' is also configured. Please read the JavaDoc of both features before enabling either due to their security implications.";
            throw new IllegalStateException(string);
        }
        if (this.compressionCodecResolver != null && !Jwts.ZIP.get().equals(this.zipAlgs)) {
            String string = "Both 'zip()' and 'compressionCodecResolver' cannot be configured. Choose either.";
            throw new IllegalStateException(string);
        }
        Assert.stateNotNull((Object)constantKeyLocator, (String)"Key locator should never be null.");
        DefaultClaims defaultClaims = (DefaultClaims)this.expectedClaims.build();
        return new DefaultJwtParser(this.provider, this.signingKeyResolver, this.unsecured, this.unsecuredDecompression, (Locator)constantKeyLocator, this.clock, this.critical, this.allowedClockSkewMillis, defaultClaims, this.decoder, this.deserializer, this.compressionCodecResolver, this.zipAlgs, this.sigAlgs, this.keyAlgs, this.encAlgs);
    }

    @Override
    public NestedCollection<CompressionAlgorithm, JwtParserBuilder> zip() {
        return new 2(this, (JwtParserBuilder)this, this.zipAlgs);
    }

    @Override
    public JwtParserBuilder json(Deserializer<Map<String, ?>> deserializer) {
        this.deserializer = (Deserializer)Assert.notNull(deserializer, (String)"JSON Deserializer cannot be null.");
        return this;
    }

    @Override
    public NestedCollection<String, JwtParserBuilder> critical() {
        return new 1(this, (JwtParserBuilder)this, this.critical);
    }

    static /* synthetic */ Registry access$302(DefaultJwtParserBuilder defaultJwtParserBuilder, Registry registry) {
        defaultJwtParserBuilder.sigAlgs = registry;
        return defaultJwtParserBuilder.sigAlgs;
    }

    static /* synthetic */ Set access$002(DefaultJwtParserBuilder defaultJwtParserBuilder, Set set) {
        defaultJwtParserBuilder.critical = set;
        return defaultJwtParserBuilder.critical;
    }

    static /* synthetic */ Registry access$202(DefaultJwtParserBuilder defaultJwtParserBuilder, Registry registry) {
        defaultJwtParserBuilder.encAlgs = registry;
        return defaultJwtParserBuilder.encAlgs;
    }

    @Override
    public JwtParserBuilder require(String string, Object object) {
        Assert.hasText((CharSequence)string, (String)"claim name cannot be null or empty.");
        Assert.notNull((Object)object, (String)("The value cannot be null for claim name: " + string));
        this.expectedClaims.add((Object)string, object);
        return this;
    }

    @Override
    public JwtParserBuilder verifyWith(PublicKey publicKey) {
        return this.verifyWith((Key)publicKey);
    }

    private JwtParserBuilder verifyWith(Key key) {
        if (key instanceof PrivateKey) {
            throw new IllegalArgumentException("PrivateKeys may not be used to verify digital signatures. PrivateKeys are used to sign, and PublicKeys are used to verify.");
        }
        this.signatureVerificationKey = (Key)Assert.notNull((Object)key, (String)"signature verification key cannot be null.");
        return this;
    }

    @Override
    public JwtParserBuilder verifyWith(SecretKey secretKey) {
        return this.verifyWith((Key)secretKey);
    }

    @Override
    public JwtParserBuilder keyLocator(Locator<Key> locator) {
        this.keyLocator = (Locator)Assert.notNull(locator, (String)"Key locator cannot be null.");
        return this;
    }

    @Override
    public JwtParserBuilder base64UrlDecodeWith(Decoder<CharSequence, byte[]> decoder) {
        Assert.notNull(decoder, (String)"decoder cannot be null.");
        return this.b64Url((Decoder<InputStream, InputStream>)new DelegateStringDecoder(decoder));
    }

    @Override
    public JwtParserBuilder setAllowedClockSkewSeconds(long l) throws IllegalArgumentException {
        return this.clockSkewSeconds(l);
    }

    @Override
    public JwtParserBuilder deserializeJsonWith(Deserializer<Map<String, ?>> deserializer) {
        return this.json(deserializer);
    }

    @Override
    public JwtParserBuilder unsecuredDecompression() {
        this.unsecuredDecompression = true;
        return this;
    }

    @Override
    public JwtParserBuilder setSigningKeyResolver(SigningKeyResolver signingKeyResolver) {
        Assert.notNull((Object)signingKeyResolver, (String)"SigningKeyResolver cannot be null.");
        this.signingKeyResolver = signingKeyResolver;
        return this;
    }

    @Override
    public JwtParserBuilder b64Url(Decoder<InputStream, InputStream> decoder) {
        Assert.notNull(decoder, (String)"decoder cannot be null.");
        this.decoder = decoder;
        return this;
    }

    @Override
    public JwtParserBuilder setClock(Clock clock) {
        return this.clock(clock);
    }

    @Override
    public JwtParserBuilder unsecured() {
        this.unsecured = true;
        return this;
    }

    @Override
    public JwtParserBuilder requireId(String string) {
        this.expectedClaims.setId(string);
        return this;
    }

    @Override
    public JwtParserBuilder setCompressionCodecResolver(CompressionCodecResolver compressionCodecResolver) {
        this.compressionCodecResolver = (CompressionCodecResolver)Assert.notNull((Object)compressionCodecResolver, (String)"CompressionCodecResolver cannot be null.");
        return this;
    }

    @Override
    public JwtParserBuilder setSigningKey(Key key) {
        if (key instanceof SecretKey) {
            return this.verifyWith((SecretKey)key);
        }
        if (key instanceof PublicKey) {
            return this.verifyWith((PublicKey)key);
        }
        String string = "JWS verification key must be either a SecretKey (for MAC algorithms) or a PublicKey (for Signature algorithms).";
        throw new InvalidKeyException(string);
    }

    @Override
    public JwtParserBuilder setSigningKey(String string) {
        Assert.hasText((CharSequence)string, (String)"signature verification key cannot be null or empty.");
        byte[] byArray = (byte[])Decoders.BASE64.decode((Object)string);
        return this.setSigningKey(byArray);
    }

    @Override
    public JwtParserBuilder setSigningKey(byte[] byArray) {
        Assert.notEmpty((byte[])byArray, (String)"signature verification key cannot be null or empty.");
        return this.setSigningKey(Keys.hmacShaKeyFor((byte[])byArray));
    }

    private JwtParserBuilder decryptWith(Key key) {
        if (key instanceof PublicKey) {
            throw new IllegalArgumentException("PublicKeys may not be used to decrypt data. PublicKeys are used to encrypt, and PrivateKeys are used to decrypt.");
        }
        this.decryptionKey = (Key)Assert.notNull((Object)key, (String)"decryption key cannot be null.");
        return this;
    }

    @Override
    public JwtParserBuilder decryptWith(SecretKey secretKey) {
        return this.decryptWith((Key)secretKey);
    }

    @Override
    public JwtParserBuilder decryptWith(PrivateKey privateKey) {
        return this.decryptWith((Key)privateKey);
    }

    @Override
    public JwtParserBuilder requireIssuer(String string) {
        this.expectedClaims.setIssuer(string);
        return this;
    }

    @Override
    public JwtParserBuilder requireExpiration(Date date) {
        this.expectedClaims.setExpiration(date);
        return this;
    }

    @Override
    public JwtParserBuilder requireAudience(String string) {
        ((NestedCollection)this.expectedClaims.audience().add((Object)string)).and();
        return this;
    }

    @Override
    public JwtParserBuilder requireSubject(String string) {
        this.expectedClaims.setSubject(string);
        return this;
    }

    @Override
    public JwtParserBuilder requireNotBefore(Date date) {
        this.expectedClaims.setNotBefore(date);
        return this;
    }

    @Override
    public JwtParserBuilder requireIssuedAt(Date date) {
        this.expectedClaims.setIssuedAt(date);
        return this;
    }

    public Object redirect$dbf000$viafabricplus$removeServicesSupport(Class clazz) {
        return new GsonDeserializer();
    }

    @Override
    public JwtParserBuilder clockSkewSeconds(long l) throws IllegalArgumentException {
        Assert.isTrue((l <= 9223372036854775L ? 1 : 0) != 0, (String)MAX_CLOCK_SKEW_ILLEGAL_MSG);
        this.allowedClockSkewMillis = Math.max(0L, l * 1000L);
        return this;
    }
}

