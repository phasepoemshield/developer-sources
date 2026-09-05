/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06973
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1.world;

import minecraft.class06973;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.rendering.v1.world.WorldRenderContext;

@FunctionalInterface
@Environment(value=EnvType.CLIENT)
public interface WorldRenderEvents$BeforeBlockOutline {
    public boolean beforeBlockOutline(WorldRenderContext var1, class06973 var2);
}

