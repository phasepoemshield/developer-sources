/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class07209
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.event.client.player;

import minecraft.class00500;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class07209;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ClientPlayerBlockBreakEvents$After {
    public void afterBlockBreak(class03448 var1, class04453 var2, class07209 var3, class00500 var4);
}

