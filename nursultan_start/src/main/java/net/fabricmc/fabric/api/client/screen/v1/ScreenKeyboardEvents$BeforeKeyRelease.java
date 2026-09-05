/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  minecraft.class06601
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.screen.v1;

import minecraft.class05096;
import minecraft.class06601;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ScreenKeyboardEvents$BeforeKeyRelease {
    public void beforeKeyRelease(class05096 var1, class06601 var2);
}

