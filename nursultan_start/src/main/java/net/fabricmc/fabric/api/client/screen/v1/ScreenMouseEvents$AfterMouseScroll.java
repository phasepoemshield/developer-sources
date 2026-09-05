/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.screen.v1;

import minecraft.class05096;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ScreenMouseEvents$AfterMouseScroll {
    public boolean afterMouseScroll(class05096 var1, double var2, double var4, double var6, double var8, boolean var10);
}

