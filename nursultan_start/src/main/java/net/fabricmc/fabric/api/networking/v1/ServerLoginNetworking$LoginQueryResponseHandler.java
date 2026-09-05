/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  minecraft.class01610
 *  minecraft.class02796
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class00667;
import minecraft.class01610;
import minecraft.class02796;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking$LoginSynchronizer;

@FunctionalInterface
public interface ServerLoginNetworking$LoginQueryResponseHandler {
    public void receive(class02796 var1, class01610 var2, boolean var3, class00667 var4, ServerLoginNetworking$LoginSynchronizer var5, PacketSender var6);
}

