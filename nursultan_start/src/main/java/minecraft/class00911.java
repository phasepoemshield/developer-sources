/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheLoader
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.yggdrasil.ProfileResult
 */
package minecraft;

import com.google.common.cache.CacheLoader;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.yggdrasil.ProfileResult;
import java.util.Optional;
import java.util.UUID;
import minecraft.class00932;

class class00911
extends CacheLoader<UUID, Optional<GameProfile>> {
    final /* synthetic */ MinecraftSessionService N;

    class00911(class00932 class009322, MinecraftSessionService minecraftSessionService) {
        this.N = minecraftSessionService;
    }

    public Optional<GameProfile> load(UUID uUID) {
        return Optional.ofNullable(this.N.fetchProfile(uUID, true)).map(ProfileResult::profile);
    }
}

