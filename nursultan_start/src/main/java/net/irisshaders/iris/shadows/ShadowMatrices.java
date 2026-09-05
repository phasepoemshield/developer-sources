/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00917
 *  minecraft.class01421
 *  minecraft.class02058
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class07299
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  org.joml.Matrix4f
 *  org.joml.Quaternionfc
 */
package net.irisshaders.iris.shadows;

import minecraft.class00917;
import minecraft.class01421;
import minecraft.class02058;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class07299;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;

public class ShadowMatrices {
    public static final float NEAR = -100.05f;
    public static final float FAR = 156.0f;

    public static Matrix4f createOrthoMatrix(float f, float f2, float f3) {
        return new Matrix4f().setOrthoSymmetric(f * 2.0f, f * 2.0f, f2, f3);
    }

    public static void createModelViewMatrix(class01421 class014212, float f, float f2, float f3, double d, double d2, double d3, float f4, float f5) {
        ShadowMatrices.createBaselineModelViewMatrix(class014212, f, f3, f4, f5);
        ShadowMatrices.snapModelViewToGrid(class014212, f2, d, d2, d3);
    }

    public static void snapModelViewToGrid(class01421 class014212, float f, double d, double d2, double d3) {
        if (Math.abs(f) == 0.0f) {
            return;
        }
        float f2 = (float)d % f;
        float f3 = (float)d2 % f;
        float f4 = (float)d3 % f;
        float f5 = f / 2.0f;
        class014212.L().N().translate(f2 -= f5, f3 -= f5, f4 -= f5);
    }

    public static Matrix4f createPerspectiveMatrix(float f) {
        float f2 = (float)(1.0 / Math.tan(Math.toRadians(f) * 0.5));
        return new Matrix4f(f2, 0.0f, 0.0f, 0.0f, 0.0f, f2, 0.0f, 0.0f, 0.0f, 0.0f, -0.21851201f, -1.0f, 0.0f, 0.0f, 121.91214f, 1.0f);
    }

    public static void createBaselineModelViewMatrix(class01421 class014212, float f, float f2, float f3, float f4) {
        class014212.L().y().identity();
        class014212.L().N().identity();
        if (((class03448)class06202.Nq().T_3).method_27983() == class07299.field_25181 && Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::supportsEndFlash).orElse(false).booleanValue()) {
            class00917 class009172 = ((class03448)class06202.Nq().T_3).R();
            float f5 = class009172.N();
            float f6 = class009172.y();
            class014212.N((Quaternionfc)class02058.y.N(0.0f - f5));
            class014212.N((Quaternionfc)class02058.u.N(f6));
        } else {
            float f7 = f < 0.25f ? f + 0.75f : f - 0.25f;
            class014212.N((Quaternionfc)class02058.y.N(90.0f));
            class014212.N((Quaternionfc)class02058.R.N(f7 * -360.0f));
            class014212.N((Quaternionfc)class02058.y.N(f2));
        }
    }
}

