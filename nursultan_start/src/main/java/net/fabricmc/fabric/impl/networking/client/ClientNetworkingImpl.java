/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00423
 *  minecraft.class00559
 *  minecraft.class00642
 *  minecraft.class00648
 *  minecraft.class01652
 *  minecraft.class01659
 *  minecraft.class01683
 *  minecraft.class01874
 *  minecraft.class03464
 *  minecraft.class05096
 *  minecraft.class05763
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$ConfigurationPayloadHandler
 *  net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking$LoginQueryRequestHandler
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$PlayPayloadHandler
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.mixin.networking.client.accessor.ConnectScreenAccessor
 *  net.fabricmc.fabric.mixin.networking.client.accessor.MinecraftAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.networking.client;

import java.util.Objects;
import minecraft.class00381;
import minecraft.class00423;
import minecraft.class00559;
import minecraft.class00642;
import minecraft.class00648;
import minecraft.class01652;
import minecraft.class01659;
import minecraft.class01683;
import minecraft.class01874;
import minecraft.class03464;
import minecraft.class05096;
import minecraft.class05763;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientLoginNetworking;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayConnectionEvents;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.impl.networking.CommonPacketsImpl;
import net.fabricmc.fabric.impl.networking.CommonRegisterPayload;
import net.fabricmc.fabric.impl.networking.CommonVersionPayload;
import net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.NetworkingImpl;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import net.fabricmc.fabric.impl.networking.client.ClientConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientLoginNetworkAddon;
import net.fabricmc.fabric.impl.networking.client.ClientPlayNetworkAddon;
import net.fabricmc.fabric.mixin.networking.client.accessor.ConnectScreenAccessor;
import net.fabricmc.fabric.mixin.networking.client.accessor.MinecraftAccessor;
import org.jspecify.annotations.Nullable;

@Environment(value=EnvType.CLIENT)
public final class ClientNetworkingImpl {
    public static final GlobalReceiverRegistry<ClientLoginNetworking.LoginQueryRequestHandler> LOGIN = new GlobalReceiverRegistry(class00423.field_11942, class00648.field_20593, null);
    public static final GlobalReceiverRegistry<ClientConfigurationNetworking.ConfigurationPayloadHandler<?>> CONFIGURATION = new GlobalReceiverRegistry(class00423.field_11942, class00648.field_45671, PayloadTypeRegistryImpl.CONFIGURATION_S2C);
    public static final GlobalReceiverRegistry<ClientPlayNetworking.PlayPayloadHandler<?>> PLAY = new GlobalReceiverRegistry(class00423.field_11942, class00648.field_20591, PayloadTypeRegistryImpl.PLAY_S2C);
    private static ClientPlayNetworkAddon currentPlayAddon;
    private static ClientConfigurationNetworkAddon currentConfigurationAddon;

    public static ClientPlayNetworkAddon getAddon(class01683 class016832) {
        return (ClientPlayNetworkAddon)((NetworkHandlerExtensions)class016832).getAddon();
    }

    public static ClientLoginNetworkAddon getAddon(class03464 class034642) {
        return (ClientLoginNetworkAddon)((NetworkHandlerExtensions)class034642).getAddon();
    }

    public static ClientConfigurationNetworkAddon getAddon(class01874 class018742) {
        return (ClientConfigurationNetworkAddon)((NetworkHandlerExtensions)class018742).getAddon();
    }

    private static int handleVersionPacket(CommonVersionPayload commonVersionPayload, PacketSender packetSender) {
        int n = CommonPacketsImpl.getHighestCommonVersion(commonVersionPayload.versions(), CommonPacketsImpl.SUPPORTED_COMMON_PACKET_VERSIONS);
        if (n <= 0) {
            throw new UnsupportedOperationException("Client does not support any requested versions from server");
        }
        packetSender.sendPacket((class01659)new CommonVersionPayload(new int[]{n}));
        return n;
    }

    public static @Nullable ClientConfigurationNetworkAddon getClientConfigurationAddon() {
        return currentConfigurationAddon;
    }

    public static void setClientConfigurationAddon(ClientConfigurationNetworkAddon clientConfigurationNetworkAddon) {
        currentConfigurationAddon = clientConfigurationNetworkAddon;
    }

    public static @Nullable ClientPlayNetworkAddon getClientPlayAddon() {
        if (class06202.Nq().NE() != null) {
            currentPlayAddon = null;
            return ClientNetworkingImpl.getAddon(class06202.Nq().NE());
        }
        if (currentPlayAddon != null) {
            return currentPlayAddon;
        }
        return null;
    }

    public static class00381<class01652> createC2SPacket(class01659 class016592) {
        Objects.requireNonNull(class016592, "Payload cannot be null");
        Objects.requireNonNull(class016592.method_56479(), "CustomPayload#getId() cannot return null for payload class: " + String.valueOf(class016592.getClass()));
        return new class00559(class016592);
    }

    public static @Nullable class00642 getLoginConnection() {
        class00642 class006422 = ((MinecraftAccessor)class06202.Nq()).getConnection();
        if (class006422 != null) {
            return class006422;
        }
        if ((class05096)class06202.Nq().v_3 instanceof class05763) {
            return ((ConnectScreenAccessor)((class05096)class06202.Nq().v_3)).getConnection();
        }
        return null;
    }

    public static void setClientPlayAddon(ClientPlayNetworkAddon clientPlayNetworkAddon) {
        if (clientPlayNetworkAddon != null && currentConfigurationAddon != null) {
            throw new IllegalStateException();
        }
        currentPlayAddon = clientPlayNetworkAddon;
    }

    public static void clientInit() {
        ClientPlayConnectionEvents.DISCONNECT.register((class016832, class062022) -> {
            currentPlayAddon = null;
        });
        ClientConfigurationConnectionEvents.DISCONNECT.register((class018742, class062022) -> {
            currentConfigurationAddon = null;
        });
        ClientConfigurationNetworking.registerGlobalReceiver(CommonVersionPayload.ID, (commonVersionPayload, context) -> {
            int n = ClientNetworkingImpl.handleVersionPacket(commonVersionPayload, context.responseSender());
            ClientNetworkingImpl.getClientConfigurationAddon().onCommonVersionPacket(n);
        });
        ClientConfigurationNetworking.registerGlobalReceiver(CommonRegisterPayload.ID, (commonRegisterPayload, context) -> {
            ClientConfigurationNetworkAddon clientConfigurationNetworkAddon = ClientNetworkingImpl.getClientConfigurationAddon();
            if ("play".equals(commonRegisterPayload.phase())) {
                if (commonRegisterPayload.version() != clientConfigurationNetworkAddon.getNegotiatedVersion()) {
                    throw new IllegalStateException("Negotiated common packet version: %d but received packet with version: %d".formatted(new Object[]{clientConfigurationNetworkAddon.getNegotiatedVersion(), commonRegisterPayload.version()}));
                }
                clientConfigurationNetworkAddon.getChannelInfoHolder().fabric_getPendingChannelsNames(class00648.field_20591).addAll(commonRegisterPayload.channels());
                NetworkingImpl.LOGGER.debug("Received accepted channels from the server");
                context.responseSender().sendPacket((class01659)new CommonRegisterPayload(clientConfigurationNetworkAddon.getNegotiatedVersion(), "play", ClientPlayNetworking.getGlobalReceivers()));
            } else {
                clientConfigurationNetworkAddon.onCommonRegisterPacket((CommonRegisterPayload)commonRegisterPayload);
                context.responseSender().sendPacket((class01659)clientConfigurationNetworkAddon.createRegisterPayload());
            }
        });
    }
}

