/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class01652
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01683
 *  minecraft.class01894
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl
 *  net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.networking.v1;

import java.util.Objects;
import java.util.Set;
import minecraft.class00381;
import minecraft.class01652;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01683;
import minecraft.class01894;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$PlayPayloadHandler;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class ClientPlayNetworking {
    private ClientPlayNetworking() {
    }

    public static void send(class01659 class016592) {
        Objects.requireNonNull(class016592, "Payload cannot be null");
        Objects.requireNonNull(class016592.method_56479(), "CustomPayload#getId() cannot return null for payload class: " + String.valueOf(class016592.getClass()));
        if (class06202.Nq().NE() != null) {
            class06202.Nq().NE().N(ClientPlayNetworking.createC2SPacket(class016592));
            return;
        }
        throw new IllegalStateException("Cannot send packets when not in game!");
    }

    public static boolean canSend(class01894 class018942) throws IllegalArgumentException {
        if (class06202.Nq().NE() != null) {
            return ClientNetworkingImpl.getAddon((class01683)class06202.Nq().NE()).getSendableChannels().contains(class018942);
        }
        return false;
    }

    public static boolean canSend(class01666<?> class016662) {
        return ClientPlayNetworking.canSend(class016662.N());
    }

    public static PacketSender getSender() throws IllegalStateException {
        if (class06202.Nq().NE() != null) {
            return ClientNetworkingImpl.getAddon((class01683)class06202.Nq().NE());
        }
        throw new IllegalStateException("Cannot get payload sender when not in game!");
    }

    public static Set<class01894> getGlobalReceivers() {
        return ClientNetworkingImpl.PLAY.getChannels();
    }

    public static <T extends class01659> boolean registerReceiver(class01666<T> class016662, ClientPlayNetworking$PlayPayloadHandler<T> clientPlayNetworking$PlayPayloadHandler) {
        ClientPlayNetworkAddon clientPlayNetworkAddon = ClientNetworkingImpl.getClientPlayAddon();
        if (clientPlayNetworkAddon != null) {
            return clientPlayNetworkAddon.registerChannel(class016662.N(), clientPlayNetworking$PlayPayloadHandler);
        }
        throw new IllegalStateException("Cannot register receiver while not in game!");
    }

    public static Set<class01894> getSendable() throws IllegalStateException {
        ClientPlayNetworkAddon clientPlayNetworkAddon = ClientNetworkingImpl.getClientPlayAddon();
        if (clientPlayNetworkAddon != null) {
            return clientPlayNetworkAddon.getSendableChannels();
        }
        throw new IllegalStateException("Cannot get a list of channels the server can receive packets on while not in game!");
    }

    public static Set<class01894> getReceived() throws IllegalStateException {
        ClientPlayNetworkAddon clientPlayNetworkAddon = ClientNetworkingImpl.getClientPlayAddon();
        if (clientPlayNetworkAddon != null) {
            return clientPlayNetworkAddon.getReceivableChannels();
        }
        throw new IllegalStateException("Cannot get a list of channels the client can receive packets on while not in game!");
    }

    public static @Nullable ClientPlayNetworking$PlayPayloadHandler<?> unregisterReceiver(class01894 class018942) {
        ClientPlayNetworkAddon clientPlayNetworkAddon = ClientNetworkingImpl.getClientPlayAddon();
        if (clientPlayNetworkAddon != null) {
            return (ClientPlayNetworking$PlayPayloadHandler)clientPlayNetworkAddon.unregisterChannel(class018942);
        }
        throw new IllegalStateException("Cannot unregister receiver while not in game!");
    }

    public static <T extends class01659> class00381<class01652> createC2SPacket(T t) {
        return ClientNetworkingImpl.createC2SPacket(t);
    }

    public static @Nullable ClientPlayNetworking$PlayPayloadHandler<?> unregisterGlobalReceiver(class01894 class018942) {
        return (ClientPlayNetworking$PlayPayloadHandler)ClientNetworkingImpl.PLAY.unregisterGlobalReceiver(class018942);
    }

    public static <T extends class01659> boolean registerGlobalReceiver(class01666<T> class016662, ClientPlayNetworking$PlayPayloadHandler<T> clientPlayNetworking$PlayPayloadHandler) {
        return ClientNetworkingImpl.PLAY.registerGlobalReceiver(class016662.N(), clientPlayNetworking$PlayPayloadHandler);
    }
}

