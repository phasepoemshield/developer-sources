/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 *  minecraft.class01631
 *  minecraft.class02689
 *  minecraft.class07949
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import java.util.Optional;
import java.util.concurrent.CompletableFuture;
import minecraft.class01631;
import minecraft.class02689;
import minecraft.class07923;
import minecraft.class07949;

class class07922
extends CacheLoader<class02689, CompletableFuture<Optional<class07923>>> {
    final /* synthetic */ class07949 N;

    class07922(class07949 class079492) {
        this.N = class079492;
    }

    public CompletableFuture<Optional<class07923>> load(class02689 class026892) {
        return class026892.N(this.N.i).thenCompose(gameProfile -> this.N.u.N(gameProfile).thenApply(optional -> optional.map(class016312 -> new class07923(this.N, (GameProfile)gameProfile, (class01631)class016312, class026892.L()))));
    }
}

