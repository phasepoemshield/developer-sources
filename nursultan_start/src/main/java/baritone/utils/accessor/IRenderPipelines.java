/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 */
package baritone.utils.accessor;

import com.mojang.blaze3d.pipeline.RenderPipeline;

public interface IRenderPipelines {
    public RenderPipeline.Snippet getLinesSnippet();

    public RenderPipeline baritone$registerPipeline(RenderPipeline var1);

    public RenderPipeline.Snippet getMatricesFogSnippet();
}

