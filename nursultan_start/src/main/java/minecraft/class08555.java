/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.SignatureState
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  com.mojang.authlib.minecraft.MinecraftProfileTextures
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  minecraft.class00189
 *  minecraft.class01631
 *  minecraft.class03930
 *  minecraft.class04208
 *  minecraft.class06202
 *  minecraft.class06955
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class08377
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.SignatureState;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTextures;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import java.nio.file.Path;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.function.Supplier;
import minecraft.class00189;
import minecraft.class01631;
import minecraft.class03930;
import minecraft.class04208;
import minecraft.class06202;
import minecraft.class06955;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class08377;
import minecraft.class08550;
import minecraft.class08572;
import minecraft.class08580;
import org.slf4j.Logger;

public class class08555 {
    static final Logger N = LogUtils.getLogger();
    private final class03930 L;
    final class08377 y;
    private final LoadingCache<class08550, CompletableFuture<Optional<class01631>>> u;
    private final class08580 i;
    private final class08580 R;
    private final class08580 M;

    public class08555(Path path, class03930 class039302, class08377 class083772, Executor executor) {
        this.L = class039302;
        this.y = class083772;
        this.i = new class08580(this, path, MinecraftProfileTexture.Type.SKIN);
        this.R = new class08580(this, path, MinecraftProfileTexture.Type.CAPE);
        this.M = new class08580(this, path, MinecraftProfileTexture.Type.ELYTRA);
        this.u = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofSeconds(15L)).build((CacheLoader)new class08572(this, class039302, executor));
    }

    public CompletableFuture<Optional<class01631>> N(GameProfile gameProfile) {
        if (class07529.NE) {
            class01631 class016312 = class00189.N((GameProfile)gameProfile);
            return CompletableFuture.completedFuture(Optional.of(class016312));
        }
        Property property = this.L.L().getPackedTextures(gameProfile);
        return (CompletableFuture)this.u.getUnchecked((Object)new class08550(gameProfile.id(), property));
    }

    public Supplier<class01631> N(GameProfile gameProfile, boolean bl) {
        CompletableFuture completableFuture = class08555.N(this, gameProfile);
        class01631 class016313 = class00189.N((GameProfile)gameProfile);
        if (class07529.NE) {
            return () -> class016313;
        }
        Optional optional = completableFuture.getNow(null);
        if (optional != null) {
            return () -> class08555.N(optional.filter(class016312 -> !bl || class016312.i()).orElse(class016313));
        }
        return () -> completableFuture.getNow(Optional.empty()).filter(class016312 -> !bl || class016312.i()).orElse(class016313);
    }

    private static CompletableFuture N(class08555 class085552, GameProfile gameProfile) {
        if (ProtocolTranslator.getTargetVersion().olderThanOrEqualTo(ProtocolVersion.v1_20) && !gameProfile.properties().containsKey((Object)"textures")) {
            return CompletableFuture.supplyAsync(() -> {
                ProfileResult profileResult = class06202.Nq().n().L().fetchProfile(gameProfile.id(), true);
                return profileResult == null ? gameProfile : profileResult.profile();
            }, (Executor)class07536.B()).thenCompose(class085552::N);
        }
        return class085552.N(gameProfile);
    }

    private static /* synthetic */ class01631 N(class01631 class016312) {
        return class016312;
    }

    CompletableFuture<class01631> N(UUID uUID, MinecraftProfileTextures minecraftProfileTextures) {
        CompletableFuture<class06955> completableFuture;
        class01631 class016312;
        class04208 class042082;
        MinecraftProfileTexture minecraftProfileTexture = minecraftProfileTextures.skin();
        if (minecraftProfileTexture != null) {
            CompletableFuture<class06955> var4 = this.i.N(minecraftProfileTexture);
            class042082 = class04208.N((String)minecraftProfileTexture.getMetadata("model"));
        } else {
            class016312 = class00189.N((UUID)uUID);
            completableFuture = CompletableFuture.completedFuture(class016312.N());
            class042082 = class016312.u();
        }
        class016312 = minecraftProfileTextures.cape();
        CompletableFuture<Object> completableFuture2 = class016312 != null ? this.R.N((MinecraftProfileTexture)class016312) : CompletableFuture.completedFuture(null);
        MinecraftProfileTexture minecraftProfileTexture2 = minecraftProfileTextures.elytra();
        CompletableFuture<Object> completableFuture3 = minecraftProfileTexture2 != null ? this.M.N(minecraftProfileTexture2) : CompletableFuture.completedFuture(null);
        return CompletableFuture.allOf(completableFuture, completableFuture2, completableFuture3).thenApply(void_ -> new class01631((class06955)completableFuture.join(), (class06955)completableFuture2.join(), (class06955)completableFuture3.join(), class042082, minecraftProfileTextures.signatureState() == SignatureState.SIGNED));
    }
}

