/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.google.common.cache.CacheLoader
 *  com.google.common.cache.LoadingCache
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  minecraft.class05018
 *  minecraft.class08957
 */
package minecraft;

import com.google.common.cache.CacheBuilder;
import com.google.common.cache.CacheLoader;
import com.google.common.cache.LoadingCache;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.time.Duration;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00909;
import minecraft.class00911;
import minecraft.class00925;
import minecraft.class05018;
import minecraft.class08957;

public class class00932
implements class00909 {
    private final LoadingCache<String, Optional<GameProfile>> y;
    final LoadingCache<UUID, Optional<GameProfile>> N;

    public class00932(MinecraftSessionService minecraftSessionService, class08957 class089572) {
        this.N = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofMinutes(10L)).maximumSize(256L).build((CacheLoader)new class00911(this, minecraftSessionService));
        this.y = CacheBuilder.newBuilder().expireAfterAccess(Duration.ofMinutes(10L)).maximumSize(256L).build((CacheLoader)new class00925(this, class089572));
    }

    @Override
    public Optional<GameProfile> N(String string) {
        if (class05018.R((String)string)) {
            return (Optional)this.y.getUnchecked((Object)string);
        }
        return Optional.empty();
    }

    @Override
    public Optional<GameProfile> N(UUID uUID) {
        return (Optional)this.N.getUnchecked((Object)uUID);
    }
}

