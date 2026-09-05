/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01683
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 */
package net.fabricmc.fabric.api.client.networking.v1;

import minecraft.class01683;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientPlayConnectionEvents$Join {
    public void onPlayReady(class01683 var1, PacketSender var2, class06202 var3);
}

