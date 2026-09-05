/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Strings
 *  com.mojang.authlib.exceptions.MinecraftClientException
 *  com.mojang.authlib.minecraft.InsecurePublicKeyException$MissingException
 *  com.mojang.authlib.minecraft.UserApiService
 *  com.mojang.authlib.yggdrasil.response.KeyPairResponse
 *  com.mojang.authlib.yggdrasil.response.KeyPairResponse$KeyPair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.JsonOps
 *  com.viaversion.viafabricplus.injection.access.networking.legacy_chat_signature.IProfilePublicKey_Data
 *  minecraft.class01222
 *  minecraft.class02051
 *  minecraft.class04450
 *  minecraft.class04454
 *  minecraft.class05449
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08326
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import com.google.common.base.Strings;
import com.mojang.authlib.exceptions.MinecraftClientException;
import com.mojang.authlib.minecraft.InsecurePublicKeyException;
import com.mojang.authlib.minecraft.UserApiService;
import com.mojang.authlib.yggdrasil.response.KeyPairResponse;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.JsonOps;
import com.viaversion.viafabricplus.injection.access.networking.legacy_chat_signature.IProfilePublicKey_Data;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.PublicKey;
import java.time.DateTimeException;
import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import minecraft.class01222;
import minecraft.class02051;
import minecraft.class04450;
import minecraft.class04454;
import minecraft.class04470;
import minecraft.class05449;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08326;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class04471
implements class02051 {
    private static final Logger y = LogUtils.getLogger();
    private static final Duration L = Duration.ofHours(1L);
    private static final Path u = Path.of("profilekeys", new String[0]);
    private final UserApiService i;
    private final Path R;
    private CompletableFuture<Optional<class04450>> M = CompletableFuture.completedFuture(Optional.empty());
    private Instant B = Instant.EPOCH;

    private Optional<class04450> L() {
        Optional var2;
        block9: {
            if (Files.notExists(this.R, new LinkOption[0])) {
                return Optional.empty();
            }
            BufferedReader bufferedReader = Files.newBufferedReader(this.R);
            try {
                var2 = class04450.N.parse((DynamicOps)JsonOps.INSTANCE, (Object)class08326.N((Reader)bufferedReader)).result();
                if (bufferedReader == null) break block9;
            }
            catch (Throwable throwable) {
                try {
                    if (bufferedReader != null) {
                        try {
                            bufferedReader.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (Exception exception) {
                    y.error("Failed to read profile key pair file {}", (Object)this.R, (Object)exception);
                    return Optional.empty();
                }
            }
            bufferedReader.close();
        }
        return var2;
    }

    public class04471(UserApiService userApiService, UUID uUID, Path path) {
        this.i = userApiService;
        this.R = path.resolve(u).resolve(String.valueOf(uUID) + ".json");
    }

    public boolean y() {
        if (this.M.isDone() && Instant.now().isAfter(this.B)) {
            return this.M.join().map(class04450::N).orElse(true);
        }
        return false;
    }

    private static class04454 N(KeyPairResponse keyPairResponse) throws class05449 {
        class04454 class044542;
        class04454 class044543;
        KeyPairResponse.KeyPair keyPair = keyPairResponse.keyPair();
        if (keyPair == null || Strings.isNullOrEmpty((String)keyPair.publicKey()) || keyPairResponse.publicKeySignature() == null || keyPairResponse.publicKeySignature().array().length == 0) {
            throw new class05449((Throwable)new InsecurePublicKeyException.MissingException("Missing public key"));
        }
        try {
            Instant instant = Instant.parse(keyPairResponse.expiresAt());
            PublicKey publicKey = class01222.y((String)keyPair.publicKey());
            ByteBuffer byteBuffer = keyPairResponse.publicKeySignature();
            class044542 = class044543 = new class04454(instant, publicKey, byteBuffer.array());
        }
        catch (IllegalArgumentException | DateTimeException runtimeException) {
            throw new class05449((Throwable)runtimeException);
        }
        class04471.N(keyPairResponse, new CallbackInfoReturnable("", false, (Object)class044543));
        return class044542;
    }

    private static void N(KeyPairResponse keyPairResponse, CallbackInfoReturnable callbackInfoReturnable) {
        ((IProfilePublicKey_Data)callbackInfoReturnable.getReturnValue()).viafabricplus$setLegacyPublicKeySignature(((IProfilePublicKey_Data)keyPairResponse).viafabricplus$getLegacyPublicKeySignature());
    }

    public CompletableFuture<Optional<class04450>> N() {
        this.B = Instant.now().plus(L);
        this.M = this.M.thenCompose(this::N);
        return this.M;
    }

    private CompletableFuture<Optional<class04450>> N(Optional<class04450> optional) {
        return CompletableFuture.supplyAsync(() -> {
            if (optional.isPresent() && !((class04450)optional.get()).N()) {
                if (!class07529.ND) {
                    this.N((class04450)null);
                }
                return optional;
            }
            try {
                class04450 class044502 = this.N(this.i);
                this.N(class044502);
                return Optional.ofNullable(class044502);
            }
            catch (MinecraftClientException | IOException | class05449 throwable) {
                y.error("Failed to retrieve profile key pair", throwable);
                this.N((class04450)null);
                return optional;
            }
        }, (Executor)class07536.z());
    }

    private void N(@Nullable class04450 class044502) {
        try {
            Files.deleteIfExists(this.R);
        }
        catch (IOException iOException) {
            y.error("Failed to delete profile key pair file {}", (Object)this.R, (Object)iOException);
        }
        if (class044502 == null) {
            return;
        }
        if (!class07529.ND) {
            return;
        }
        class04450.N.encodeStart((DynamicOps)JsonOps.INSTANCE, (Object)class044502).ifSuccess(jsonElement -> {
            try {
                Files.createDirectories(this.R.getParent(), new FileAttribute[0]);
                Files.writeString(this.R, (CharSequence)jsonElement.toString(), new OpenOption[0]);
            }
            catch (Exception exception) {
                y.error("Failed to write profile key pair file {}", (Object)this.R, (Object)exception);
            }
        });
    }

    private @Nullable class04450 N(UserApiService userApiService) throws class05449, IOException {
        KeyPairResponse keyPairResponse = userApiService.getKeyPair();
        if (keyPairResponse != null) {
            class04454 class044542 = class04471.N(keyPairResponse);
            return new class04450(class01222.N((String)keyPairResponse.keyPair().privateKey()), new class04470(class044542), Instant.parse(keyPairResponse.refreshedAfter()));
        }
        return null;
    }
}

