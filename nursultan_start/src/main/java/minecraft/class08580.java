/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.Hashing
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture
 *  com.mojang.authlib.minecraft.MinecraftProfileTexture$Type
 *  it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap
 *  java.lang.MatchException
 *  minecraft.class01894
 *  minecraft.class06955
 */
package minecraft;

import com.google.common.hash.Hashing;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import java.nio.file.Path;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import minecraft.class01894;
import minecraft.class06955;
import minecraft.class08555;

class class08580 {
    private final Path y;
    private final MinecraftProfileTexture.Type L;
    private final Map<String, CompletableFuture<class06955>> u = new Object2ObjectOpenHashMap();
    final /* synthetic */ class08555 N;

    class08580(class08555 class085552, Path path, MinecraftProfileTexture.Type type) {
        this.N = class085552;
        this.y = path;
        this.L = type;
    }

    private CompletableFuture<class06955> y(MinecraftProfileTexture minecraftProfileTexture) {
        String string = Hashing.sha1().hashUnencodedChars((CharSequence)minecraftProfileTexture.getHash()).toString();
        class01894 class018942 = this.N(string);
        Path path = this.y.resolve(string.length() > 2 ? string.substring(0, 2) : "xx").resolve(string);
        return this.N.y.N(class018942, path, minecraftProfileTexture.getUrl(), this.L == MinecraftProfileTexture.Type.SKIN);
    }

    public CompletableFuture<class06955> N(MinecraftProfileTexture minecraftProfileTexture) {
        CompletableFuture<class06955> var3;
        String string = minecraftProfileTexture.getHash();
        CompletableFuture<class06955> completableFuture = this.u.get(string);
        if (completableFuture == null) {
            var3 = this.y(minecraftProfileTexture);
            this.u.put(string, var3);
        }
        return var3;
    }

    private class01894 N(String string) {
        return class01894.y((String)((switch (this.L) {
            default -> throw new MatchException(null, null);
            case MinecraftProfileTexture.Type.SKIN -> "skins";
            case MinecraftProfileTexture.Type.CAPE -> "capes";
            case MinecraftProfileTexture.Type.ELYTRA -> "elytra";
        }) + "/" + string));
    }
}

