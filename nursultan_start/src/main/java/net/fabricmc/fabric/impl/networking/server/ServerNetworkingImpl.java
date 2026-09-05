/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00423
 *  minecraft.class00489
 *  minecraft.class00648
 *  minecraft.class01610
 *  minecraft.class01615
 *  minecraft.class01659
 *  minecraft.class01662
 *  minecraft.class04176
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking$ConfigurationPacketHandler
 *  net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking$LoginQueryResponseHandler
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking$PlayPayloadHandler
 *  net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl
 *  net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon
 *  net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon
 */
package net.fabricmc.fabric.impl.networking.server;

import java.util.Objects;
import minecraft.class00381;
import minecraft.class00423;
import minecraft.class00489;
import minecraft.class00648;
import minecraft.class01610;
import minecraft.class01615;
import minecraft.class01659;
import minecraft.class01662;
import minecraft.class04176;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.fabricmc.fabric.impl.networking.GlobalReceiverRegistry;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import net.fabricmc.fabric.impl.networking.server.ServerConfigurationNetworkAddon;
import net.fabricmc.fabric.impl.networking.server.ServerLoginNetworkAddon;
import net.fabricmc.fabric.impl.networking.server.ServerPlayNetworkAddon;

public final class ServerNetworkingImpl {
    public static final GlobalReceiverRegistry<ServerLoginNetworking.LoginQueryResponseHandler> LOGIN = new GlobalReceiverRegistry(class00423.field_11941, class00648.field_20593, null);
    public static final GlobalReceiverRegistry<ServerConfigurationNetworking.ConfigurationPacketHandler<?>> CONFIGURATION = new GlobalReceiverRegistry(class00423.field_11941, class00648.field_45671, PayloadTypeRegistryImpl.CONFIGURATION_C2S);
    public static final GlobalReceiverRegistry<ServerPlayNetworking.PlayPayloadHandler<?>> PLAY = new GlobalReceiverRegistry(class00423.field_11941, class00648.field_20591, PayloadTypeRegistryImpl.PLAY_C2S);

    public static ServerConfigurationNetworkAddon getAddon(class04176 class041762) {
        return (ServerConfigurationNetworkAddon)((NetworkHandlerExtensions)class041762).getAddon();
    }

    public static ServerPlayNetworkAddon getAddon(class01615 class016152) {
        return (ServerPlayNetworkAddon)((NetworkHandlerExtensions)class016152).getAddon();
    }

    public static ServerLoginNetworkAddon getAddon(class01610 class016102) {
        return (ServerLoginNetworkAddon)((NetworkHandlerExtensions)class016102).getAddon();
    }

    public static class00381<class01662> createS2CPacket(class01659 class016592) {
        Objects.requireNonNull(class016592, "Payload cannot be null");
        Objects.requireNonNull(class016592.method_56479(), "CustomPayload#getId() cannot return null for payload class: " + String.valueOf(class016592.getClass()));
        return new class00489(class016592);
    }
}

