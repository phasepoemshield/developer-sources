/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.platform.DestFactor
 *  com.mojang.blaze3d.platform.SourceFactor
 *  net.minecraft.class_10799
 *  net.minecraft.class_12247
 *  net.minecraft.class_156
 *  net.minecraft.class_1921
 *  net.minecraft.class_2960
 */
package com.holdmylua.source.patricles.render;

import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import java.util.function.Function;
import net.minecraft.class_10799;
import net.minecraft.class_12247;
import net.minecraft.class_156;
import net.minecraft.class_1921;
import net.minecraft.class_2960;

public class ParticleRenderLayers {
    private static final Function<class_2960, class_1921> ADDITIVE_PARTICLE_LAYER;
    static BlendFunction ADDITIVE;
    static RenderPipeline ADDITIVE_PARTICLE;

    public static class_1921 additiveParticle(class_2960 texture) {
        return ADDITIVE_PARTICLE_LAYER.apply(texture);
    }

    static {
        ADDITIVE = new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE);
        ADDITIVE_PARTICLE = class_10799.method_67887((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class_10799.field_56864}).withLocation("pipeline/additive_particle_effect").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withDepthWrite(false).withBlend(ADDITIVE).build());
        ADDITIVE_PARTICLE_LAYER = class_156.method_34866(texture -> class_1921.method_75940((String)"fire_screen_effect", (class_12247)class_12247.method_75927((RenderPipeline)ADDITIVE_PARTICLE).method_75934("Sampler0", texture).method_75938()));
    }
}

