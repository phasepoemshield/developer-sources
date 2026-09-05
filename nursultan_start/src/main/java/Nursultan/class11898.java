/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DestFactor
 *  com.mojang.blaze3d.platform.SourceFactor
 *  minecraft.class08394
 */
package Nursultan;

import Nursultan.class11911;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import minecraft.class08394;

public class class11898 {
    public static Object N_0;

    private static void L() {
        N_0 = null;
    }

    private class11898() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11898.L();
        N_0 = class08394.N((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{class08394.v}).withLocation(class11911.N("pipeline/mojang_logo_shadows")).withBlend(new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE)).build());
    }
}

