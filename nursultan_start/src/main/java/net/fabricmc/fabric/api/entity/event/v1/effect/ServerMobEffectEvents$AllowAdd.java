/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07055
 *  minecraft.class07438
 */
package net.fabricmc.fabric.api.entity.event.v1.effect;

import minecraft.class07055;
import minecraft.class07438;
import net.fabricmc.fabric.api.entity.event.v1.effect.EffectEventContext;

@FunctionalInterface
public interface ServerMobEffectEvents$AllowAdd {
    public boolean allowAdd(class07055 var1, class07438 var2, EffectEventContext var3);
}

