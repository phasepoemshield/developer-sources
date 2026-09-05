/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01615
 *  minecraft.class02796
 *  minecraft.class04770
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking$Context
 */
package net.fabricmc.fabric.impl.networking.server;

import java.util.Objects;
import minecraft.class01615;
import minecraft.class02796;
import minecraft.class04770;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;

record ServerPlayNetworkAddon$ContextImpl(class02796 server, class01615 handler, PacketSender responseSender) implements ServerPlayNetworking.Context
{
    ServerPlayNetworkAddon$ContextImpl {
        Objects.requireNonNull(class027962, "server");
        Objects.requireNonNull(class016152, "handler");
        Objects.requireNonNull(packetSender, "responseSender");
    }

    public class04770 player() {
        return this.handler.method_32311();
    }
}

