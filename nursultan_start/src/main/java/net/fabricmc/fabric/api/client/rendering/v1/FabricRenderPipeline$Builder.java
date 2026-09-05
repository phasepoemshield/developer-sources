/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Builder
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface FabricRenderPipeline$Builder {
    default public RenderPipeline.Builder withUsePipelineDrawModeForGui(boolean bl) {
        throw new AssertionError((Object)"Implemented in Mixin");
    }

    default public RenderPipeline.Builder withoutUsePipelineDrawModeForGui() {
        throw new AssertionError((Object)"Implemented in Mixin");
    }
}

