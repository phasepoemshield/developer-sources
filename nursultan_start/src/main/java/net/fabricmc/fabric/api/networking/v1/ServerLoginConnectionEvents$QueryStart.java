/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01610
 *  minecraft.class02796
 */
package net.fabricmc.fabric.api.networking.v1;

import minecraft.class01610;
import minecraft.class02796;
import net.fabricmc.fabric.api.networking.v1.LoginPacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking$LoginSynchronizer;

@FunctionalInterface
public interface ServerLoginConnectionEvents$QueryStart {
    public void onLoginStart(class01610 var1, class02796 var2, LoginPacketSender var3, ServerLoginNetworking.LoginSynchronizer var4);
}

