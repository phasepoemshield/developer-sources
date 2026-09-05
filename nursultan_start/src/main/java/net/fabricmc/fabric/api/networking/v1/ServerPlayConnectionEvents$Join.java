/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01615
 *  minecraft.class02796
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class01615;
import minecraft.class02796;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

@FunctionalInterface
public interface ServerPlayConnectionEvents$Join {
    public void onPlayReady(class01615 var1, PacketSender var2, class02796 var3);
}

