/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  minecraft.class02255
 */
package net.caffeinemc.mods.sodium.mixin.core;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import minecraft.class02255;

public interface GlCommandEncoderAccessor {
    public void sodium$applyPipelineState(RenderPipeline var1);

    public void sodium$setLastProgram(class02255 var1);
}

