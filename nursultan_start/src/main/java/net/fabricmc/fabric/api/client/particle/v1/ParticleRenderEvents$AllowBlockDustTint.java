/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03448
 *  minecraft.class07209
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.particle.v1;

import minecraft.class00500;
import minecraft.class03448;
import minecraft.class07209;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ParticleRenderEvents$AllowBlockDustTint {
    public boolean allowBlockDustTint(class00500 var1, class03448 var2, class07209 var3);
}

