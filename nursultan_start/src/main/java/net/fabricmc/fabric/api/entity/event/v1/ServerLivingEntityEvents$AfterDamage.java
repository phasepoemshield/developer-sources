/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07072
 *  minecraft.class07438
 */
package net.fabricmc.fabric.api.entity.event.v1;

import minecraft.class07072;
import minecraft.class07438;

@FunctionalInterface
public interface ServerLivingEntityEvents$AfterDamage {
    public void afterDamage(class07438 var1, class07072 var2, float var3, float var4, boolean var5);
}

