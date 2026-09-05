/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01874
 *  minecraft.class01894
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 */
package net.fabricmc.fabric.api.client.networking.v1;

import java.util.List;
import minecraft.class01874;
import minecraft.class01894;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface C2SConfigurationChannelEvents$Register {
    public void onChannelRegister(class01874 var1, PacketSender var2, class06202 var3, List<class01894> var4);
}

