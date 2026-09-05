/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01610
 *  minecraft.class01894
 *  minecraft.class02796
 *  net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.networking.v1;

import java.util.Objects;
import java.util.Set;
import minecraft.class01610;
import minecraft.class01894;
import minecraft.class02796;
import net.fabricmc.fabric.api.networking.v1.LoginPacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking$LoginQueryResponseHandler;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;

public final class ServerLoginNetworking {
    private ServerLoginNetworking() {
    }

    public static LoginPacketSender getSender(class01610 class016102) {
        Objects.requireNonNull(class016102, "Network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class01610)class016102);
    }

    public static class02796 getServer(class01610 class016102) {
        Objects.requireNonNull(class016102, "Network handler cannot be null");
        return ((ServerLoginPacketListenerImplAccessor)class016102).getServer();
    }

    public static Set<class01894> getGlobalReceivers() {
        return ServerNetworkingImpl.LOGIN.getChannels();
    }

    public static boolean registerReceiver(class01610 class016102, class01894 class018942, ServerLoginNetworking$LoginQueryResponseHandler serverLoginNetworking$LoginQueryResponseHandler) {
        Objects.requireNonNull(class016102, "Network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class01610)class016102).registerChannel(class018942, (Object)serverLoginNetworking$LoginQueryResponseHandler);
    }

    public static @Nullable ServerLoginNetworking$LoginQueryResponseHandler unregisterReceiver(class01610 class016102, class01894 class018942) {
        Objects.requireNonNull(class016102, "Network handler cannot be null");
        return (ServerLoginNetworking$LoginQueryResponseHandler)ServerNetworkingImpl.getAddon((class01610)class016102).unregisterChannel(class018942);
    }

    public static @Nullable ServerLoginNetworking$LoginQueryResponseHandler unregisterGlobalReceiver(class01894 class018942) {
        return (ServerLoginNetworking$LoginQueryResponseHandler)ServerNetworkingImpl.LOGIN.unregisterGlobalReceiver(class018942);
    }

    public static boolean registerGlobalReceiver(class01894 class018942, ServerLoginNetworking$LoginQueryResponseHandler serverLoginNetworking$LoginQueryResponseHandler) {
        return ServerNetworkingImpl.LOGIN.registerGlobalReceiver(class018942, (Object)serverLoginNetworking$LoginQueryResponseHandler);
    }
}

