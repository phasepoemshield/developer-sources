/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.authlib.GameProfileRepository
 *  com.mojang.authlib.HttpAuthenticationService
 *  com.mojang.authlib.minecraft.MinecraftSessionService
 *  com.mojang.authlib.properties.Property
 *  com.mojang.authlib.yggdrasil.ProfileNotFoundException
 *  com.mojang.authlib.yggdrasil.ProfileResult
 *  com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService
 *  com.mojang.authlib.yggdrasil.response.NameAndId
 *  com.viaversion.viaversion.api.minecraft.GameProfile
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher
 */
package com.viaversion.viafabricplus.protocoltranslator.impl.provider.vialegacy;

import com.mojang.authlib.GameProfile;
import com.mojang.authlib.GameProfileRepository;
import com.mojang.authlib.HttpAuthenticationService;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.yggdrasil.ProfileNotFoundException;
import com.mojang.authlib.yggdrasil.ProfileResult;
import com.mojang.authlib.yggdrasil.YggdrasilAuthenticationService;
import com.mojang.authlib.yggdrasil.response.NameAndId;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import java.net.Proxy;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.provider.GameProfileFetcher;

public final class ViaFabricPlusGameProfileFetcher
extends GameProfileFetcher {
    private static final HttpAuthenticationService AUTHENTICATION_SERVICE = new YggdrasilAuthenticationService(Proxy.NO_PROXY);
    private static final MinecraftSessionService SESSION_SERVICE = AUTHENTICATION_SERVICE.createMinecraftSessionService();
    private static final GameProfileRepository GAME_PROFILE_REPOSITORY = AUTHENTICATION_SERVICE.createProfileRepository();

    public UUID loadMojangUuid(String playerName) {
        Optional nameAndId = GAME_PROFILE_REPOSITORY.findProfileByName(playerName);
        if (nameAndId.isEmpty()) {
            throw new ProfileNotFoundException();
        }
        return ((NameAndId)nameAndId.get()).id();
    }

    public com.viaversion.viaversion.api.minecraft.GameProfile loadGameProfile(UUID uuid) {
        ProfileResult result = SESSION_SERVICE.fetchProfile(uuid, true);
        if (result == null) {
            throw new ProfileNotFoundException();
        }
        GameProfile gameProfile = result.profile();
        GameProfile.Property[] properties = new GameProfile.Property[gameProfile.properties().size()];
        int i = 0;
        for (Map.Entry entry : gameProfile.properties().entries()) {
            properties[i++] = new GameProfile.Property(((Property)entry.getValue()).name(), ((Property)entry.getValue()).value(), ((Property)entry.getValue()).signature());
        }
        return new com.viaversion.viaversion.api.minecraft.GameProfile(gameProfile.name(), gameProfile.id(), properties);
    }
}

