/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  minecraft.class06613
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.screen.v1;

import minecraft.class05096;
import minecraft.class06613;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ScreenMouseEvents$AfterMouseDrag {
    public boolean afterMouseDrag(class05096 var1, class06613 var2, double var3, double var5, boolean var7);
}

