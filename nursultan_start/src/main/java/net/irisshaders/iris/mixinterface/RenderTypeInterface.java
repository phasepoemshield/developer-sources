/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  minecraft.class08066
 */
package net.irisshaders.iris.mixinterface;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import minecraft.class08066;

public interface RenderTypeInterface {
    default public RenderPipeline iris$getPipeline() {
        throw new AssertionError((Object)"No accessible");
    }

    default public class08066 iris$getRenderTarget() {
        throw new AssertionError((Object)"No accessible");
    }
}

