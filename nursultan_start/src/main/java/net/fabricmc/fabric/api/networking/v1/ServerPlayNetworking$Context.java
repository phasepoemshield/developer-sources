/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02796
 *  minecraft.class04770
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class02796;
import minecraft.class04770;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

public interface ServerPlayNetworking$Context {
    public class02796 server();

    public class04770 player();

    public PacketSender responseSender();
}

