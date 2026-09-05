/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 *  minecraft.class04176
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking$Context
 */
package net.fabricmc.fabric.impl.networking.server;

import java.util.Objects;
import minecraft.class02796;
import minecraft.class04176;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerConfigurationNetworking;

record ServerConfigurationNetworkAddon$ContextImpl(class02796 server, class04176 networkHandler, PacketSender responseSender) implements ServerConfigurationNetworking.Context
{
    ServerConfigurationNetworkAddon$ContextImpl {
        Objects.requireNonNull(class027962, "server");
        Objects.requireNonNull(class041762, "networkHandler");
        Objects.requireNonNull(packetSender, "responseSender");
    }
}

