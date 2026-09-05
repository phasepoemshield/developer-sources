/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class05096
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.screen.v1;

import minecraft.class01054;
import minecraft.class05096;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ScreenEvents$AfterBackground {
    public void afterBackground(class05096 var1, class01054 var2, int var3, int var4, float var5);
}

