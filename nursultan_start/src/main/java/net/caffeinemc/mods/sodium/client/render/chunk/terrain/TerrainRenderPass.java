/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class03063
 *  minecraft.class06202
 *  minecraft.class08066
 *  minecraft.class08626
 *  minecraft.class08743
 */
package net.caffeinemc.mods.sodium.client.render.chunk.terrain;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import minecraft.class03063;
import minecraft.class06202;
import minecraft.class08066;
import minecraft.class08626;
import minecraft.class08743;

public class TerrainRenderPass {
    @Deprecated(forRemoval=true)
    private final class08743 renderType;
    private final boolean isTranslucent;
    private final boolean fragmentDiscard;

    public class08066 getTarget() {
        return this.isTranslucent && class06202.C() ? ((class03063)class06202.Nq().B_2).P() : class06202.Nq().e();
    }

    public TerrainRenderPass(class08743 class087432, boolean bl, boolean bl2) {
        this.renderType = class087432;
        this.isTranslucent = bl;
        this.fragmentDiscard = bl2;
    }

    public RenderPipeline getPipeline() {
        return this.renderType.N();
    }

    public boolean isTranslucent() {
        return this.isTranslucent;
    }

    public boolean supportsFragmentDiscard() {
        return this.fragmentDiscard;
    }

    public GpuTextureView getAtlas() {
        return class06202.Nq().NO().y(class08626.N).method_71659();
    }
}

