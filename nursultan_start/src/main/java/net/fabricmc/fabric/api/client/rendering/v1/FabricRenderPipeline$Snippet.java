/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.api.client.rendering.v1;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Optional;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public interface FabricRenderPipeline$Snippet {
    public static RenderPipeline.Snippet withoutPipelineDrawModeForGui(RenderPipeline.Snippet snippet) {
        return RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{snippet}).withoutUsePipelineDrawModeForGui().buildSnippet();
    }

    public static RenderPipeline.Snippet withPipelineDrawModeForGui(RenderPipeline.Snippet snippet, boolean bl) {
        return RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{snippet}).withUsePipelineDrawModeForGui(bl).buildSnippet();
    }

    default public Optional<Boolean> usePipelineDrawModeForGui() {
        throw new AssertionError((Object)"Implemented in Mixin");
    }
}

