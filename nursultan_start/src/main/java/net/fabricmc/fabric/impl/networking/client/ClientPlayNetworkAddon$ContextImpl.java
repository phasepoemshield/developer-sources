/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04453
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking$Context
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 */
package net.fabricmc.fabric.impl.networking.client;

import java.util.Objects;
import minecraft.class04453;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.networking.v1.ClientPlayNetworking;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

@Environment(value=EnvType.CLIENT)
record ClientPlayNetworkAddon$ContextImpl(class06202 client, PacketSender responseSender) implements ClientPlayNetworking.Context
{
    ClientPlayNetworkAddon$ContextImpl {
        Objects.requireNonNull(class062022, "client");
        Objects.requireNonNull(packetSender, "responseSender");
    }

    public class04453 player() {
        return Objects.requireNonNull((class04453)this.client.T_4, "player");
    }
}

