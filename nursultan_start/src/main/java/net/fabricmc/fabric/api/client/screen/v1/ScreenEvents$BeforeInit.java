/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05096
 *  minecraft.class06202
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.screen.v1;

import minecraft.class05096;
import minecraft.class06202;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface ScreenEvents$BeforeInit {
    public void beforeInit(class06202 var1, class05096 var2, int var3, int var4);
}

