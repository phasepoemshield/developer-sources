/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01615
 *  minecraft.class01659
 *  minecraft.class01662
 *  minecraft.class01666
 *  minecraft.class01894
 *  minecraft.class04770
 *  net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.networking.v1;

import java.util.Objects;
import java.util.Set;
import minecraft.class00381;
import minecraft.class01615;
import minecraft.class01659;
import minecraft.class01662;
import minecraft.class01666;
import minecraft.class01894;
import minecraft.class04770;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking$PlayPayloadHandler;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import org.jspecify.annotations.Nullable;

public final class ServerPlayNetworking {
    public static void reconfigure(class04770 class047702) {
        Objects.requireNonNull(class047702, "Server player entity cannot be null");
        ServerPlayNetworking.reconfigure(class047702.field_13987);
    }

    public static void reconfigure(class01615 class016152) {
        Objects.requireNonNull(class016152, "Server play network handler cannot be null");
        ServerNetworkingImpl.getAddon((class01615)class016152).reconfigure();
    }

    private ServerPlayNetworking() {
    }

    public static void send(class04770 class047702, class01659 class016592) {
        Objects.requireNonNull(class047702, "Server player entity cannot be null");
        Objects.requireNonNull(class016592, "Payload cannot be null");
        Objects.requireNonNull(class016592.method_56479(), "CustomPayload#getId() cannot return null for payload class: " + String.valueOf(class016592.getClass()));
        class047702.field_13987.method_14364(ServerPlayNetworking.createS2CPacket(class016592));
    }

    public static boolean canSend(class04770 class047702, class01894 class018942) {
        Objects.requireNonNull(class047702, "Server player entity cannot be null");
        return ServerPlayNetworking.canSend(class047702.field_13987, class018942);
    }

    public static boolean canSend(class04770 class047702, class01666<?> class016662) {
        Objects.requireNonNull(class047702, "Server player entity cannot be null");
        return ServerPlayNetworking.canSend(class047702.field_13987, class016662.N());
    }

    public static boolean canSend(class01615 class016152, class01894 class018942) {
        Objects.requireNonNull(class016152, "Server play network handler cannot be null");
        Objects.requireNonNull(class018942, "Channel name cannot be null");
        return ServerNetworkingImpl.getAddon((class01615)class016152).getSendableChannels().contains(class018942);
    }

    public static boolean canSend(class01615 class016152, class01666<?> class016662) {
        Objects.requireNonNull(class016152, "Server play network handler cannot be null");
        Objects.requireNonNull(class016662, "Packet type cannot be null");
        return ServerNetworkingImpl.getAddon((class01615)class016152).getSendableChannels().contains(class016662.N());
    }

    public static PacketSender getSender(class01615 class016152) {
        Objects.requireNonNull(class016152, "Server play network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class01615)class016152);
    }

    public static PacketSender getSender(class04770 class047702) {
        Objects.requireNonNull(class047702, "Server player entity cannot be null");
        return ServerPlayNetworking.getSender(class047702.field_13987);
    }

    public static <T extends class01659> class00381<class01662> createS2CPacket(T t) {
        return ServerNetworkingImpl.createS2CPacket(t);
    }

    public static Set<class01894> getGlobalReceivers() {
        return ServerNetworkingImpl.PLAY.getChannels();
    }

    public static <T extends class01659> boolean registerReceiver(class01615 class016152, class01666<T> class016662, ServerPlayNetworking$PlayPayloadHandler<T> serverPlayNetworking$PlayPayloadHandler) {
        return ServerNetworkingImpl.getAddon((class01615)class016152).registerChannel(class016662.N(), serverPlayNetworking$PlayPayloadHandler);
    }

    public static Set<class01894> getSendable(class01615 class016152) {
        Objects.requireNonNull(class016152, "Server play network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class01615)class016152).getSendableChannels();
    }

    public static Set<class01894> getSendable(class04770 class047702) {
        Objects.requireNonNull(class047702, "Server player entity cannot be null");
        return ServerPlayNetworking.getSendable(class047702.field_13987);
    }

    public static Set<class01894> getReceived(class01615 class016152) {
        Objects.requireNonNull(class016152, "Server play network handler cannot be null");
        return ServerNetworkingImpl.getAddon((class01615)class016152).getReceivableChannels();
    }

    public static Set<class01894> getReceived(class04770 class047702) {
        Objects.requireNonNull(class047702, "Server player entity cannot be null");
        return ServerPlayNetworking.getReceived(class047702.field_13987);
    }

    public static @Nullable ServerPlayNetworking$PlayPayloadHandler<?> unregisterReceiver(class01615 class016152, class01894 class018942) {
        return (ServerPlayNetworking$PlayPayloadHandler)ServerNetworkingImpl.getAddon((class01615)class016152).unregisterChannel(class018942);
    }

    public static @Nullable ServerPlayNetworking$PlayPayloadHandler<?> unregisterGlobalReceiver(class01894 class018942) {
        return (ServerPlayNetworking$PlayPayloadHandler)ServerNetworkingImpl.PLAY.unregisterGlobalReceiver(class018942);
    }

    public static <T extends class01659> boolean registerGlobalReceiver(class01666<T> class016662, ServerPlayNetworking$PlayPayloadHandler<T> serverPlayNetworking$PlayPayloadHandler) {
        return ServerNetworkingImpl.PLAY.registerGlobalReceiver(class016662.N(), serverPlayNetworking$PlayPayloadHandler);
    }
}

