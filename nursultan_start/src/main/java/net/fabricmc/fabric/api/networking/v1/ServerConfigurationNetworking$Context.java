/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 *  minecraft.class04176
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class02796;
import minecraft.class04176;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

public interface ServerConfigurationNetworking$Context {
    public class02796 server();

    public PacketSender responseSender();

    public class04176 networkHandler();
}

