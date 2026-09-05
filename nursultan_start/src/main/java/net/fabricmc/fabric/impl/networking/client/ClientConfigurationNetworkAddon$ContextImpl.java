/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01874
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking$Context
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 */
package net.fabricmc.fabric.impl.networking.client;

import java.util.Objects;
import minecraft.class01874;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientConfigurationNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

@Environment(value=EnvType.CLIENT)
record ClientConfigurationNetworkAddon$ContextImpl(class06202 client, class01874 networkHandler, PacketSender responseSender) implements ClientConfigurationNetworking.Context
{
    ClientConfigurationNetworkAddon$ContextImpl {
        Objects.requireNonNull(class062022, "client");
        Objects.requireNonNull(class018742, "networkHandler");
        Objects.requireNonNull(packetSender, "responseSender");
    }
}

