/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01659
 *  minecraft.class01662
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class04176
 *  net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.networking.v1;

import java.util.Objects;
import java.util.Set;
import minecraft.class00381;
import minecraft.class01659;
import minecraft.class01662;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class04176;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking$ConfigurationPacketHandler;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import net.fabricmc.fabric.mixin.networking.accessor.ServerCommonPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;

public final class ServerConfigurationNetworking {
    private ServerConfigurationNetworking() {
    }

    public static void send(class04176 class041762, class01659 class016592) {
        Objects.requireNonNull(class041762, "Server configuration handler cannot be null");
        Objects.requireNonNull(class016592, "Payload cannot be null");
        Objects.requireNonNull(class016592.method_56479(), "CustomPayload#getId() cannot return null for payload class: " + String.valueOf(class016592.getClass()));
        class041762.method_14364(ServerConfigurationNetworking.createS2CPacket(class016592));
    }

    public static boolean canSend(class04176 class041762, class01894 class018942) {
        Objects.requireNonNull(class041762, "Server configuration network handler cannot be null");
        Objects.requireNonNull(class018942, "Channel name cannot be null");
        return ServerNetworkingImpl.getAddon((class04176)class041762).getSendableChannels().contains(class018942);
    }

    public static boolean canSend(class04176 class041762, class01666<?> class016662) {
        Objects.requireNonNull(class041762, "Server configuration network handler cannot be null");
        Objects.requireNonNull(class016662, "Payload id cannot be null");
        return ServerNetworkingImpl.getAddon((class04176)class041762).getSendableChannels().contains(class016662.N());
    }

    public static PacketSender getSender(class04176 class041762) {
        Objects.requireNonNull(class041762, "Server configuration network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class04176)class041762);
    }

    public static class02796 getServer(class04176 class041762) {
        Objects.requireNonNull(class041762, "Network handler cannot be null");
        return ((ServerCommonPacketListenerImplAccessor)class041762).getServer();
    }

    public static boolean isReconfiguring(class04176 class041762) {
        Objects.requireNonNull(class041762, "Server configuration network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class04176)class041762).isReconfiguring();
    }

    public static class00381<class01662> createS2CPacket(class01659 class016592) {
        Objects.requireNonNull(class016592, "Payload cannot be null");
        Objects.requireNonNull(class016592.method_56479(), "CustomPayload#getId() cannot return null for payload class: " + String.valueOf(class016592.getClass()));
        return ServerNetworkingImpl.createS2CPacket((class01659)class016592);
    }

    public static Set<class01894> getGlobalReceivers() {
        return ServerNetworkingImpl.CONFIGURATION.getChannels();
    }

    public static <T extends class01659> boolean registerReceiver(class04176 class041762, class01666<T> class016662, ServerConfigurationNetworking$ConfigurationPacketHandler<T> serverConfigurationNetworking$ConfigurationPacketHandler) {
        return ServerNetworkingImpl.getAddon((class04176)class041762).registerChannel(class016662.N(), serverConfigurationNetworking$ConfigurationPacketHandler);
    }

    public static Set<class01894> getSendable(class04176 class041762) {
        Objects.requireNonNull(class041762, "Server configuration network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class04176)class041762).getSendableChannels();
    }

    public static Set<class01894> getReceived(class04176 class041762) {
        Objects.requireNonNull(class041762, "Server configuration network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class04176)class041762).getReceivableChannels();
    }

    public static @Nullable ServerConfigurationNetworking$ConfigurationPacketHandler<?> unregisterReceiver(class04176 class041762, class01894 class018942) {
        return (ServerConfigurationNetworking$ConfigurationPacketHandler)ServerNetworkingImpl.getAddon((class04176)class041762).unregisterChannel(class018942);
    }

    public static @Nullable ServerConfigurationNetworking$ConfigurationPacketHandler<?> unregisterGlobalReceiver(class01894 class018942) {
        return (ServerConfigurationNetworking$ConfigurationPacketHandler)ServerNetworkingImpl.CONFIGURATION.unregisterGlobalReceiver(class018942);
    }

    public static <T extends class01659> boolean registerGlobalReceiver(class01666<T> class016662, ServerConfigurationNetworking$ConfigurationPacketHandler<T> serverConfigurationNetworking$ConfigurationPacketHandler) {
        return ServerNetworkingImpl.CONFIGURATION.registerGlobalReceiver(class016662.N(), serverConfigurationNetworking$ConfigurationPacketHandler);
    }
}

