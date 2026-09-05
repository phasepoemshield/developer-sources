/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01615
 *  minecraft.class01894
 *  minecraft.class02796
 */
package net.fabricmc.fabric.api.networking.v1;

import java.util.List;
import minecraft.class01615;
import minecraft.class01894;
import minecraft.class02796;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

@FunctionalInterface
public interface S2CPlayChannelEvents$Unregister {
    public void onChannelUnregister(class01615 var1, PacketSender var2, class02796 var3, List<class01894> var4);
}

