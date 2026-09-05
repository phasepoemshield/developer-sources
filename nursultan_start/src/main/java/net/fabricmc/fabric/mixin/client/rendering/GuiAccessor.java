/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07438
 *  minecraft.class08036
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.client.rendering;

import minecraft.class07438;
import minecraft.class08036;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface GuiAccessor {
    public int fabric$getRenderHealthValue();

    public class08036 fabric$callGetCameraPlayer();

    public int fabric$callGetHeartCount(class07438 var1);

    public int fabric$callGetHeartRows(int var1);

    public class07438 fabric$callGetRiddenEntity();
}

