/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  com.mojang.blaze3d.pipeline.BlendFunction
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  com.mojang.blaze3d.platform.DepthTestFunction
 *  com.mojang.blaze3d.platform.DestFactor
 *  com.mojang.blaze3d.platform.SourceFactor
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class00734
 *  minecraft.class01384
 *  minecraft.class01421
 *  minecraft.class01423
 *  minecraft.class01894
 *  minecraft.class02609
 *  minecraft.class03575
 *  minecraft.class06202
 *  minecraft.class06828
 *  minecraft.class06851
 *  minecraft.class06889
 *  minecraft.class07311
 *  minecraft.class07331
 *  minecraft.class07536
 *  minecraft.class07835
 *  minecraft.class07849
 *  minecraft.class08394
 */
package baritone.utils;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.utils.accessor.IEntityRenderManager;
import baritone.utils.accessor.IRenderPipelines;
import baritone.utils.accessor.IRenderType;
import com.mojang.blaze3d.pipeline.BlendFunction;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import com.mojang.blaze3d.platform.DepthTestFunction;
import com.mojang.blaze3d.platform.DestFactor;
import com.mojang.blaze3d.platform.SourceFactor;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.awt.Color;
import java.util.function.BiFunction;
import minecraft.class00734;
import minecraft.class01384;
import minecraft.class01421;
import minecraft.class01423;
import minecraft.class01894;
import minecraft.class02609;
import minecraft.class03575;
import minecraft.class06202;
import minecraft.class06828;
import minecraft.class06851;
import minecraft.class06889;
import minecraft.class07311;
import minecraft.class07331;
import minecraft.class07536;
import minecraft.class07835;
import minecraft.class07849;
import minecraft.class08394;

public interface IRenderer {
    public static final class07849 tessellator = class07849.y();
    public static final IEntityRenderManager renderManager = (IEntityRenderManager)class06202.Nq().Ng();
    public static final Settings settings = BaritoneAPI.getSettings();
    public static final RenderPipeline.Snippet BARITONE_LINES_SNIPPET = RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{((IRenderPipelines)new class08394()).getLinesSnippet()}).withBlend(new BlendFunction(SourceFactor.SRC_ALPHA, DestFactor.ONE_MINUS_SRC_ALPHA, SourceFactor.ONE, DestFactor.ZERO)).withDepthWrite(false).withCull(false).buildSnippet();
    public static final RenderPipeline.Snippet BARITONE_BEACON_BEAM_SNIPPET = RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{((IRenderPipelines)new class08394()).getMatricesFogSnippet()}).withVertexShader("core/rendertype_beacon_beam").withFragmentShader("core/rendertype_beacon_beam").withSampler("Sampler0").withVertexFormat(class07835.y, VertexFormat.class_5596.field_27382).buildSnippet();
    public static final RenderPipeline BEACON_BEAM_OPAQUE = ((IRenderPipelines)new class08394()).baritone$registerPipeline(RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{BARITONE_BEACON_BEAM_SNIPPET}).withLocation("pipeline/baritone_beacon_beam_opaque").withDepthWrite(false).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withCull(true).build());
    public static final RenderPipeline BEACON_BEAM_TRANSLUCENT = ((IRenderPipelines)new class08394()).baritone$registerPipeline(RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{BARITONE_BEACON_BEAM_SNIPPET}).withLocation("pipeline/baritone_beacon_beam_translucent").withDepthWrite(false).withBlend(BlendFunction.TRANSLUCENT).withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).withCull(true).build());
    public static final class07311 linesWithDepthRenderType = ((IRenderType)class06851.b()).createRenderType("renderType/baritone_lines_with_depth", class06828.N((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{BARITONE_LINES_SNIPPET}).withLocation("pipelines/baritone_lines_with_depth").withDepthTestFunction(DepthTestFunction.LEQUAL_DEPTH_TEST).build()).N(256).i());
    public static final class07311 linesNoDepthRenderType = ((IRenderType)class06851.b()).createRenderType("renderType/baritone_lines_no_depth", class06828.N((RenderPipeline)RenderPipeline.builder((RenderPipeline.Snippet[])new RenderPipeline.Snippet[]{BARITONE_LINES_SNIPPET}).withLocation("pipelines/baritone_lines_no_depth").withDepthTestFunction(DepthTestFunction.NO_DEPTH_TEST).build()).N(256).i());
    public static final BiFunction<class01894, Boolean, class07311> BEACON_BEAM = class07536.N((class018942, bl) -> ((IRenderType)class06851.i((class01894)class03575.N, (boolean)bl)).createRenderType(bl != false ? "renderType/baritone_beacon_beam_translucent" : "renderType/baritone_beacon_beam_opaque", class06828.N((RenderPipeline)(bl != false ? BEACON_BEAM_TRANSLUCENT : BEACON_BEAM_OPAQUE)).N("Sampler0", class018942).u().i()));
    public static final float[] color = new float[]{1.0f, 1.0f, 1.0f, 255.0f};

    public static class07311 beaconBeam(class01894 class018942, boolean bl) {
        return BEACON_BEAM.apply(class018942, bl);
    }

    public static class07311 beaconBeam(class01894 class018942, boolean bl, boolean bl2) {
        return bl2 ? IRenderer.beaconBeam(class018942, bl) : class06851.i((class01894)class018942, (boolean)bl);
    }

    public static class07331 startLines(Color color, float f) {
        IRenderer.glColor(color, f);
        return tessellator.N(VertexFormat.class_5596.field_27377, class07835.P);
    }

    public static class07331 startLines(Color color) {
        return IRenderer.startLines(color, 0.4f);
    }

    public static void emitAABB(class07331 class073312, class01421 class014212, class00734 class007342, double d, float f) {
        IRenderer.emitAABB(class073312, class014212, class007342.L(d, d, d), f);
    }

    public static void emitAABB(class07331 class073312, class01421 class014212, class00734 class007342, float f) {
        class00734 class007343 = class007342.u(-renderManager.renderPosX(), -renderManager.renderPosY(), -renderManager.renderPosZ());
        IRenderer.emitLine(class073312, class014212, class007343.N, class007343.y, class007343.L, class007343.u, class007343.y, class007343.L, 1.0, 0.0, 0.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.u, class007343.y, class007343.L, class007343.u, class007343.y, class007343.R, 0.0, 0.0, 1.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.u, class007343.y, class007343.R, class007343.N, class007343.y, class007343.R, -1.0, 0.0, 0.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.N, class007343.y, class007343.R, class007343.N, class007343.y, class007343.L, 0.0, 0.0, -1.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.N, class007343.i, class007343.L, class007343.u, class007343.i, class007343.L, 1.0, 0.0, 0.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.u, class007343.i, class007343.L, class007343.u, class007343.i, class007343.R, 0.0, 0.0, 1.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.u, class007343.i, class007343.R, class007343.N, class007343.i, class007343.R, -1.0, 0.0, 0.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.N, class007343.i, class007343.R, class007343.N, class007343.i, class007343.L, 0.0, 0.0, -1.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.N, class007343.y, class007343.L, class007343.N, class007343.i, class007343.L, 0.0, 1.0, 0.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.u, class007343.y, class007343.L, class007343.u, class007343.i, class007343.L, 0.0, 1.0, 0.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.u, class007343.y, class007343.R, class007343.u, class007343.i, class007343.R, 0.0, 1.0, 0.0, f);
        IRenderer.emitLine(class073312, class014212, class007343.N, class007343.y, class007343.R, class007343.N, class007343.i, class007343.R, 0.0, 1.0, 0.0, f);
    }

    public static void endLines(class07331 class073312, boolean bl) {
        class02609 class026092 = class073312.N();
        if (class026092 != null) {
            if (bl) {
                linesNoDepthRenderType.method_60895(class026092);
            } else {
                linesWithDepthRenderType.method_60895(class026092);
            }
        }
    }

    public static void emitLine(class07331 class073312, class01421 class014212, class06889 class068892, class06889 class068893, float f) {
        double d = renderManager.renderPosX();
        double d2 = renderManager.renderPosY();
        double d3 = renderManager.renderPosZ();
        IRenderer.emitLine(class073312, class014212, class068892.M - d, class068892.B - d2, class068892.Z - d3, class068893.M - d, class068893.B - d2, class068893.Z - d3, f);
    }

    public static void emitLine(class07331 class073312, class01421 class014212, double d, double d2, double d3, double d4, double d5, double d6, float f) {
        double d7 = d4 - d;
        double d8 = d5 - d2;
        double d9 = d6 - d3;
        double d10 = 1.0 / Math.sqrt(d7 * d7 + d8 * d8 + d9 * d9);
        float f2 = (float)(d7 * d10);
        float f3 = (float)(d8 * d10);
        float f4 = (float)(d9 * d10);
        IRenderer.emitLine(class073312, class014212, d, d2, d3, d4, d5, d6, (double)f2, (double)f3, (double)f4, f);
    }

    public static void emitLine(class07331 class073312, class01421 class014212, double d, double d2, double d3, double d4, double d5, double d6, double d7, double d8, double d9, float f) {
        IRenderer.emitLine(class073312, class014212, (float)d, (float)d2, (float)d3, (float)d4, (float)d5, (float)d6, (float)d7, (float)d8, (float)d9, f);
    }

    public static void emitLine(class07331 class073312, class01421 class014212, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10) {
        class01423 class014232 = class014212.L();
        class073312.N(class014232, f, f2, f3).method_22915(color[0], color[1], color[2], color[3]).y(class014232, f7, f8, f9).method_75298(f10);
        class073312.N(class014232, f4, f5, f6).method_22915(color[0], color[1], color[2], color[3]).y(class014232, f7, f8, f9).method_75298(f10);
    }

    public static void endBuffer(class07331 class073312, class07311 class073112) {
        class02609 class026092 = class073312.N();
        if (class026092 != null) {
            class073112.method_60895(class026092);
        }
    }

    public static void glColor(Color color, float f) {
        float[] fArray = color.getColorComponents(null);
        IRenderer.color[0] = fArray[0];
        IRenderer.color[1] = fArray[1];
        IRenderer.color[2] = fArray[2];
        IRenderer.color[3] = f;
    }

    public static class07331 startBlockQuads() {
        return tessellator.N(VertexFormat.class_5596.field_27382, class07835.y);
    }

    public static void emitTexturedVertex(class07331 class073312, class01423 class014232, float f, float f2, float f3, int n, float f4, float f5, float f6, float f7, float f8) {
        class073312.N(class014232, f, f2, f3).method_39415(n).method_22913(f4, f5).method_22922(class01384.u).method_60803(0xF000F0).y(class014232, f6, f7, f8);
    }
}

