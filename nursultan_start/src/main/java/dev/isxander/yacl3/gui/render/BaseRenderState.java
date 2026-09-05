/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.textures.GpuTextureView
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class03255
 *  minecraft.class06202
 *  minecraft.class08188
 *  minecraft.class08394
 *  minecraft.class08679
 *  minecraft.class08918
 *  org.joml.Matrix3x2f
 *  org.joml.Matrix3x2fc
 */
package dev.isxander.yacl3.gui.render;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.textures.GpuTextureView;
import dev.isxander.yacl3.gui.render.GuiRenderStateSink;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class03255;
import minecraft.class06202;
import minecraft.class08188;
import minecraft.class08394;
import minecraft.class08679;
import minecraft.class08918;
import org.joml.Matrix3x2f;
import org.joml.Matrix3x2fc;

public record BaseRenderState(RenderPipeline pipeline, class08679 textureSetup, Matrix3x2f pose, class03255 bounds, class03255 scissorArea) {
    public static BaseRenderState create(class01054 class010542, class01894 class018942) {
        return new BaseRenderState(class018942 != null ? class08394.Na : class08394.NH, BaseRenderState.textureSetup(class018942), new Matrix3x2f((Matrix3x2fc)class010542.i()), null, GuiRenderStateSink.peekScissorStack(class010542));
    }

    public static BaseRenderState create(class01054 class010542, class01894 class018942, int n, int n2, int n3, int n4) {
        class03255 class032552 = GuiRenderStateSink.peekScissorStack(class010542);
        class03255 class032553 = BaseRenderState.boundsFromMaxPoints(n, n2, n3, n4, (Matrix3x2f)class010542.i(), class032552);
        return new BaseRenderState(class018942 != null ? class08394.Na : class08394.NH, BaseRenderState.textureSetup(class018942), new Matrix3x2f((Matrix3x2fc)class010542.i()), class032553, class032552);
    }

    private static class03255 boundsFromMaxPoints(int n, int n2, int n3, int n4, Matrix3x2f matrix3x2f, class03255 class032552) {
        class03255 class032553 = new class03255(n, n2, n3 - n, n4 - n2).y((Matrix3x2fc)matrix3x2f);
        return class032552 != null ? class032552.y(class032553) : class032553;
    }

    private static class08679 textureSetup(class01894 class018942) {
        if (class018942 != null) {
            class08918 class089182 = class06202.Nq().NO().y(class018942);
            return class08679.N((GpuTextureView)class089182.method_71659(), (class08188)class089182.method_75484());
        }
        return class08679.N();
    }
}

