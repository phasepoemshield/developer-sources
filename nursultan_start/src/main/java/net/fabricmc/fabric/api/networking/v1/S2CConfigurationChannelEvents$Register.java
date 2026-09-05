/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class04176
 */
package net.fabricmc.fabric.api.networking.v1;

import java.util.List;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class04176;
import net.fabricmc.fabric.api.networking.v1.PacketSender;

@FunctionalInterface
public interface S2CConfigurationChannelEvents$Register {
    public void onChannelRegister(class04176 var1, PacketSender var2, class02796 var3, List<class01894> var4);
}

