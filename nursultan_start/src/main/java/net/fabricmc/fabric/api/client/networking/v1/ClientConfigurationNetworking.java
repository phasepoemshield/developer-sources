/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01659
 *  minecraft.class01666
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon
 *  net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.api.client.networking.v1;

import java.util.Objects;
import java.util.Set;
import minecraft.class01659;
import minecraft.class01666;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$ConfigurationPayloadHandler;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientNetworkingImpl;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class ClientConfigurationNetworking {
    private ClientConfigurationNetworking() {
    }

    public static void send(class01659 class016592) {
        Objects.requireNonNull(class016592, "Payload cannot be null");
        Objects.requireNonNull(class016592.method_56479(), "CustomPayload#getId() cannot return null for payload class: " + String.valueOf(class016592.getClass()));
        ClientConfigurationNetworkAddon clientConfigurationNetworkAddon = ClientNetworkingImpl.getClientConfigurationAddon();
        if (clientConfigurationNetworkAddon != null) {
            clientConfigurationNetworkAddon.sendPacket(class016592);
            return;
        }
        throw new IllegalStateException("Cannot send packet while not configuring!");
    }

    public static boolean canSend(class01894 class018942) throws IllegalArgumentException {
        ClientConfigurationNetworkAddon clientConfigurationNetworkAddon = ClientNetworkingImpl.getClientConfigurationAddon();
        if (clientConfigurationNetworkAddon != null) {
            return clientConfigurationNetworkAddon.getSendableChannels().contains(class018942);
        }
        throw new IllegalStateException("Cannot get a list of channels the server can receive packets on while not configuring!");
    }

    public static boolean canSend(class01666<?> class016662) {
        return ClientConfigurationNetworking.canSend(class016662.N());
    }

    public static PacketSender getSender() throws IllegalStateException {
        ClientConfigurationNetworkAddon clientConfigurationNetworkAddon = ClientNetworkingImpl.getClientConfigurationAddon();
        if (clientConfigurationNetworkAddon != null) {
            return clientConfigurationNetworkAddon;
        }
        throw new IllegalStateException("Cannot get PacketSender while not configuring!");
    }

    public static Set<class01894> getGlobalReceivers() {
        return ClientNetworkingImpl.CONFIGURATION.getChannels();
    }

    public static <T extends class01659> boolean registerReceiver(class01666<T> class016662, ClientConfigurationNetworking$ConfigurationPayloadHandler<T> clientConfigurationNetworking$ConfigurationPayloadHandler) {
        ClientConfigurationNetworkAddon clientConfigurationNetworkAddon = ClientNetworkingImpl.getClientConfigurationAddon();
        if (clientConfigurationNetworkAddon != null) {
            return clientConfigurationNetworkAddon.registerChannel(class016662.N(), clientConfigurationNetworking$ConfigurationPayloadHandler);
        }
        throw new IllegalStateException("Cannot register receiver while not configuring!");
    }

    public static Set<class01894> getSendable() throws IllegalStateException {
        ClientConfigurationNetworkAddon clientConfigurationNetworkAddon = ClientNetworkingImpl.getClientConfigurationAddon();
        if (clientConfigurationNetworkAddon != null) {
            return clientConfigurationNetworkAddon.getSendableChannels();
        }
        throw new IllegalStateException("Cannot get a list of channels the server can receive packets on while not configuring!");
    }

    public static Set<class01894> getReceived() throws IllegalStateException {
        ClientConfigurationNetworkAddon clientConfigurationNetworkAddon = ClientNetworkingImpl.getClientConfigurationAddon();
        if (clientConfigurationNetworkAddon != null) {
            return clientConfigurationNetworkAddon.getReceivableChannels();
        }
        throw new IllegalStateException("Cannot get a list of channels the client can receive packets on while not configuring!");
    }

    public static @Nullable ClientConfigurationNetworking$ConfigurationPayloadHandler<?> unregisterReceiver(class01894 class018942) {
        ClientConfigurationNetworkAddon clientConfigurationNetworkAddon = ClientNetworkingImpl.getClientConfigurationAddon();
        if (clientConfigurationNetworkAddon != null) {
            return (ClientConfigurationNetworking$ConfigurationPayloadHandler)clientConfigurationNetworkAddon.unregisterChannel(class018942);
        }
        throw new IllegalStateException("Cannot unregister receiver while not configuring!");
    }

    public static @Nullable ClientConfigurationNetworking$ConfigurationPayloadHandler<?> unregisterGlobalReceiver(class01666<?> class016662) {
        return (ClientConfigurationNetworking$ConfigurationPayloadHandler)ClientNetworkingImpl.CONFIGURATION.unregisterGlobalReceiver(class016662.N());
    }

    public static <T extends class01659> boolean registerGlobalReceiver(class01666<T> class016662, ClientConfigurationNetworking$ConfigurationPayloadHandler<T> clientConfigurationNetworking$ConfigurationPayloadHandler) {
        return ClientNetworkingImpl.CONFIGURATION.registerGlobalReceiver(class016662.N(), clientConfigurationNetworking$ConfigurationPayloadHandler);
    }
}

