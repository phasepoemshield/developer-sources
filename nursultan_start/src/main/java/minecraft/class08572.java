/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11392
 *  Nursultan.class11938
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.SignatureState
 *  com.mojang.authlib.minecraft.MinecraftProfileTextures
 *  com.mojang.authlib.properties.Property
 *  minecraft.class01631
 *  minecraft.class03930
 *  minecraft.class07536
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class11392;
import Nursultan.class11938;
import com.google.common.cache.CacheLoader;
import com.mojang.authlib.SignatureState;
import com.mojang.authlib.minecraft.MinecraftProfileTextures;
import com.mojang.authlib.properties.Property;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionStage;
import java.util.concurrent.Executor;
import minecraft.class01631;
import minecraft.class03930;
import minecraft.class07536;
import minecraft.class08550;
import minecraft.class08555;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

class class08572
extends CacheLoader<class08550, CompletableFuture<Optional<class01631>>> {
    final /* synthetic */ class03930 N;
    final /* synthetic */ Executor y;
    final /* synthetic */ class08555 L;

    class08572(class08555 class085552, class03930 class039302, Executor executor) {
        this.L = class085552;
        this.N = class039302;
        this.y = executor;
    }

    private static void N(class08550 class085502, MinecraftProfileTextures minecraftProfileTextures, CallbackInfoReturnable callbackInfoReturnable) {
        Property property = class085502.y();
        if (property != null) {
            ((CompletionStage)callbackInfoReturnable.getReturnValue()).thenAccept(object -> class11938.L().L((Object)new class11392(property)));
        }
    }

    public CompletableFuture<Optional<class01631>> load(class08550 class085502) {
        return ((CompletableFuture)CompletableFuture.supplyAsync(() -> {
            Property property = class085502.y();
            if (property == null) {
                return MinecraftProfileTextures.EMPTY;
            }
            MinecraftProfileTextures minecraftProfileTextures = this.N.L().unpackTextures(property);
            if (minecraftProfileTextures.signatureState() == SignatureState.INVALID) {
                class08555.N.warn("Profile contained invalid signature for textures property (profile id: {})", (Object)class085502.N());
            }
            return minecraftProfileTextures;
        }, class07536.B().N("unpackSkinTextures")).thenComposeAsync(minecraftProfileTextures -> {
            CompletableFuture<class01631> var3 = this.L.N(class085502.N(), (MinecraftProfileTextures)minecraftProfileTextures);
            class08572.N(class085502, minecraftProfileTextures, new CallbackInfoReturnable("", false, var3));
            return var3;
        }, this.y)).handle((class016312, throwable) -> {
            if (throwable != null) {
                class08555.N.warn("Failed to load texture for profile {}", (Object)class085502.N(), throwable);
            }
            return Optional.ofNullable(class016312);
        });
    }
}

