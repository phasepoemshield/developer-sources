/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  ru.ocz.protection.annotation.Compile
 */
package oxxxde;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.io.InputStream;
import java.nio.file.AtomicMoveNotSupportedException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.nio.file.attribute.FileAttribute;
import java.nio.file.attribute.PosixFilePermission;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Base64;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import oxxxde.\u062c\u0643;
import ru.ocz.protection.annotation.Compile;

@Metadata(mv={2, 3, 0}, k=1, xi=48, d1={"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u00c6\u0002\u0018\u00002\u00020\u0001B\t\b\u0002\u00a2\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004\u00a2\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\nH\u0003\u00a2\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\nH\u0002\u00a2\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00158\u0002X\u0082T\u00a2\u0006\u0006\n\u0004\b\u0018\u0010\u0017R\u001c\u0010\u001b\u001a\n \u001a*\u0004\u0018\u00010\u00190\u00198\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\n \u001a*\u0004\u0018\u00010 0 8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b!\u0010\"R\u001c\u0010$\u001a\n \u001a*\u0004\u0018\u00010#0#8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b$\u0010%R\u001b\u0010)\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\f\u00a8\u0006*"}, d2={"Loxxxde/\u062c\u0632;", "", "<init>", "()V", "", "publicKeyBase64", "()Ljava/lang/String;", "payload", "signBase64", "(Ljava/lang/String;)Ljava/lang/String;", "Ljava/security/KeyPair;", "loadOrCreate", "()Ljava/security/KeyPair;", "load", "pair", "", "persist", "(Ljava/security/KeyPair;)V", "", "validKeyPair", "(Ljava/security/KeyPair;)Z", "", "MAX_IDENTITY_FILE_BYTES", "I", "MAX_ENCODED_KEY_BYTES", "Lorg/slf4j/Logger;", "kotlin.jvm.PlatformType", "logger", "Lorg/slf4j/Logger;", "Ljava/nio/file/Path;", "identityPath", "Ljava/nio/file/Path;", "Ljava/util/Base64$Encoder;", "encoder", "Ljava/util/Base64$Encoder;", "Ljava/util/Base64$Decoder;", "decoder", "Ljava/util/Base64$Decoder;", "keyPair$delegate", "Lkotlin/Lazy;", "getKeyPair", "keyPair", "rain-visuals"})
public final class \u062c\u0632 {
    @NotNull
    private static final Path identityPath;
    private static final Base64.Decoder decoder;
    private static final Base64.Encoder encoder;
    private static final Logger logger;
    private static final int MAX_IDENTITY_FILE_BYTES = 4096;
    @NotNull
    private static final Lazy keyPair$delegate;
    @NotNull
    public static final \u062c\u0632 INSTANCE;
    private static final int MAX_ENCODED_KEY_BYTES = 256;

    private \u062c\u0632() {
    }

    @NotNull
    public final String publicKeyBase64() {
        String string = encoder.encodeToString(this.getKeyPair().getPublic().getEncoded());
        Intrinsics.checkNotNullExpressionValue(string, "encodeToString(...)");
        return string;
    }

    /*
     * WARNING - void declaration
     */
    private final boolean validKeyPair(KeyPair pair) {
        void var4_4;
        byte[] challenge = new byte[32];
        new SecureRandom().nextBytes(challenge);
        Signature signer = Signature.getInstance("Ed25519");
        signer.initSign(pair.getPrivate());
        signer.update(challenge);
        byte[] signature = signer.sign();
        Signature verifier = Signature.getInstance("Ed25519");
        verifier.initVerify(pair.getPublic());
        verifier.update(challenge);
        return verifier.verify((byte[])var4_4);
    }

    @Compile
    private final KeyPair load() {
        if (!Files.isRegularFile(identityPath, new LinkOption[0])) {
            return null;
        }
        try {
            PrivateKey privateKey;
            byte[] byArray;
            if (Files.size(identityPath) > 4096L) {
                throw new IllegalArgumentException("Cloud identity file exceeds 4096 bytes");
            }
            InputStream inputStream = Files.newInputStream(identityPath, new OpenOption[0]);
            try {
                byArray = inputStream.readNBytes(4097);
            }
            catch (Throwable throwable) {
                CloseableKt.closeFinally(inputStream, throwable);
                throw throwable;
            }
            CloseableKt.closeFinally(inputStream, null);
            if (byArray.length > 4096) {
                throw new IllegalArgumentException("Cloud identity file exceeds 4096 bytes");
            }
            JsonObject jsonObject = JsonParser.parseString(new String(byArray, Charsets.UTF_8)).getAsJsonObject();
            if (jsonObject.get("Version").getAsInt() != 1) {
                throw new IllegalArgumentException("Unsupported cloud identity version");
            }
            byte[] byArray2 = decoder.decode(jsonObject.get("PublicKey").getAsString());
            byte[] byArray3 = decoder.decode(jsonObject.get("PrivateKey").getAsString());
            if (byArray2.length != 44) {
                throw new IllegalArgumentException("Cloud identity public key has invalid length");
            }
            if (byArray3.length <= 0) {
                throw new IllegalArgumentException("Cloud identity private key is empty");
            }
            KeyFactory keyFactory = KeyFactory.getInstance("Ed25519");
            PublicKey publicKey = keyFactory.generatePublic(new X509EncodedKeySpec(byArray2));
            KeyPair keyPair = new KeyPair(publicKey, privateKey = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(byArray3)));
            if (!this.validKeyPair(keyPair)) {
                throw new IllegalArgumentException("Cloud identity key pair failed validation");
            }
            return keyPair;
        }
        catch (Throwable throwable) {
            logger.error("Cloud identity file is invalid", throwable);
            return null;
        }
    }

    private final KeyPair getKeyPair() {
        Lazy lazy = keyPair$delegate;
        return (KeyPair)lazy.getValue();
    }

    /*
     * WARNING - void declaration
     */
    private final KeyPair loadOrCreate() {
        void var1_8;
        Object object;
        KeyPair keyPair = this.load();
        if (keyPair != null) {
            KeyPair it = keyPair;
            boolean bl = false;
            return it;
        }
        KeyPair generated = KeyPairGenerator.getInstance("Ed25519").generateKeyPair();
        Object object2 = this;
        try {
            \u062c\u0632 $this$loadOrCreate_u24lambda_u241 = object2;
            boolean bl = false;
            Intrinsics.checkNotNull(generated);
            $this$loadOrCreate_u24lambda_u241.persist(generated);
            object = Result.constructor-impl(Unit.INSTANCE);
        }
        catch (Throwable bl) {
            object = Result.constructor-impl(ResultKt.createFailure(bl));
        }
        object2 = object;
        Throwable throwable = Result.exceptionOrNull-impl(object2);
        if (throwable != null) {
            void var4_7;
            object = throwable;
            Object it = object;
            boolean bl = false;
            logger.error("Failed to persist cloud identity", (Throwable)var4_7);
        }
        ResultKt.throwOnFailure(object2);
        Intrinsics.checkNotNull(var1_8);
        return var1_8;
    }

    @NotNull
    public final String signBase64(@NotNull String payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        Signature signature = Signature.getInstance("Ed25519");
        signature.initSign(this.getKeyPair().getPrivate());
        byte[] byArray = payload.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(byArray, "getBytes(...)");
        signature.update(byArray);
        String string = encoder.encodeToString(signature.sign());
        Intrinsics.checkNotNullExpressionValue(string, "encodeToString(...)");
        return string;
    }

    public static final /* synthetic */ KeyPair access$loadOrCreate(\u062c\u0632 $this) {
        return $this.loadOrCreate();
    }

    static {
        INSTANCE = new \u062c\u0632();
        logger = LoggerFactory.getLogger("Rain Cloud Identity");
        String[] stringArray = new String[3];
        stringArray[0] = "Rain";
        stringArray[1] = "other";
        stringArray[2] = "cloud_identity.json";
        Path path = Paths.get(System.getProperty("user.dir"), stringArray);
        Intrinsics.checkNotNullExpressionValue(path, "get(...)");
        identityPath = path;
        encoder = Base64.getEncoder();
        decoder = Base64.getDecoder();
        keyPair$delegate = LazyKt.lazy(new \u062c\u0643(INSTANCE));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private final void persist(KeyPair pair) {
        JsonObject jsonObject = new JsonObject();
        JsonObject $this$persist_u24lambda_u240 = jsonObject;
        boolean bl = false;
        $this$persist_u24lambda_u240.addProperty("Version", 1);
        $this$persist_u24lambda_u240.addProperty("PublicKey", encoder.encodeToString(pair.getPublic().getEncoded()));
        $this$persist_u24lambda_u240.addProperty("PrivateKey", encoder.encodeToString(pair.getPrivate().getEncoded()));
        JsonObject root = jsonObject;
        Files.createDirectories(identityPath.getParent(), new FileAttribute[0]);
        Path temporary = Files.createTempFile(identityPath.getParent(), "cloud-identity-", ".tmp", new FileAttribute[0]);
        try {
            Object object = new OpenOption[2];
            object[0] = StandardOpenOption.TRUNCATE_EXISTING;
            object[1] = StandardOpenOption.WRITE;
            Files.writeString(temporary, (CharSequence)root.toString(), object);
            object = this;
            try {
                Object $this$persist_u24lambda_u241 = (\u062c\u0632)object;
                boolean bl2 = false;
                PosixFilePermission[] posixFilePermissionArray = new PosixFilePermission[2];
                posixFilePermissionArray[0] = PosixFilePermission.OWNER_READ;
                posixFilePermissionArray[1] = PosixFilePermission.OWNER_WRITE;
                $this$persist_u24lambda_u241 = Result.constructor-impl(Files.setPosixFilePermissions(temporary, SetsKt.setOf(posixFilePermissionArray)));
            }
            catch (Throwable throwable) {
                Object $this$persist_u24lambda_u241 = Result.constructor-impl(ResultKt.createFailure(throwable));
            }
            try {
                object = new CopyOption[2];
                object[0] = StandardCopyOption.ATOMIC_MOVE;
                object[1] = StandardCopyOption.REPLACE_EXISTING;
                object = Files.move(temporary, identityPath, (CopyOption[])object);
            }
            catch (AtomicMoveNotSupportedException atomicMoveNotSupportedException) {
                CopyOption[] copyOptionArray = new CopyOption[1];
                copyOptionArray[0] = StandardCopyOption.REPLACE_EXISTING;
                object = Files.move(temporary, identityPath, copyOptionArray);
            }
        }
        catch (Throwable throwable) {
            Files.deleteIfExists((Path)((Object)jsonObject));
            throw throwable;
        }
        Files.deleteIfExists((Path)((Object)jsonObject));
    }
}

