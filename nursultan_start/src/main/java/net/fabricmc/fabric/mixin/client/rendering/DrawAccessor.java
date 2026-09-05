/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.mixin.client.rendering;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface DrawAccessor {
    public RenderPipeline fabric$pipeline();

    public int fabric$indexCount();
}

