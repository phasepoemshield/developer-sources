/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class08743
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.renderer.v1.render;

import minecraft.class01391;
import minecraft.class08743;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface BlockVertexConsumerProvider {
    public class01391 getBuffer(class08743 var1);
}

