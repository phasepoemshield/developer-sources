/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  minecraft.class01054
 *  minecraft.class01391
 *  minecraft.class03255
 *  minecraft.class08669
 *  minecraft.class08679
 *  org.joml.Matrix3x2fc
 */
package dev.isxander.yacl3.gui.render;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import dev.isxander.yacl3.gui.render.BaseRenderState;
import dev.isxander.yacl3.gui.render.GuiRenderStateSink;
import minecraft.class01054;
import minecraft.class01391;
import minecraft.class03255;
import minecraft.class08669;
import minecraft.class08679;
import org.joml.Matrix3x2fc;

public interface YACLGuiElementRenderState
extends class08669 {
    default public void submit(class01054 class010542) {
        GuiRenderStateSink.submit(class010542, this);
    }

    default public class03255 comp_4274() {
        return this.baseState().bounds();
    }

    default public void method_70917(class01391 class013912) {
        this.buildVertices(class013912, 0.0f);
    }

    public BaseRenderState baseState();

    default public RenderPipeline comp_4055() {
        return this.baseState().pipeline();
    }

    default public class08679 comp_4056() {
        return this.baseState().textureSetup();
    }

    default public class03255 comp_4069() {
        return this.baseState().scissorArea();
    }

    default public class01391 add2DVertex(class01391 class013912, float f, float f2, float f3) {
        return class013912.N((Matrix3x2fc)this.baseState().pose(), f, f2);
    }

    public void buildVertices(class01391 var1, float var2);
}

