/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00608
 *  minecraft.class00917
 *  minecraft.class02058
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class06202
 *  minecraft.class07299
 *  net.irisshaders.iris.Iris
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  net.irisshaders.iris.pipeline.WorldRenderingPipeline
 *  org.joml.Matrix4f
 *  org.joml.Quaternionfc
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.uniforms;

import java.util.Objects;
import minecraft.class00608;
import minecraft.class00917;
import minecraft.class02058;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class06202;
import minecraft.class07299;
import net.irisshaders.iris.Iris;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.pipeline.WorldRenderingPipeline;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Matrix4f;
import org.joml.Quaternionfc;
import org.joml.Vector4f;

public final class CelestialUniforms {
    private static final Vector4f ZERO = new Vector4f();
    private final float sunPathRotation;

    public CelestialUniforms(float f) {
        this.sunPathRotation = f;
    }

    private static class03448 getWorld() {
        return Objects.requireNonNull((class03448)class06202.Nq().T_3);
    }

    private Vector4f getEndFlashPosition() {
        class00917 class009172 = ((class03448)class06202.Nq().T_3).R();
        if (class009172 == null) {
            return ZERO;
        }
        float f = class009172.y();
        float f2 = class009172.N();
        Vector4f vector4f = new Vector4f(0.0f, 100.0f, 0.0f, 0.0f);
        Matrix4f matrix4f = new Matrix4f(CapturedRenderingState.INSTANCE.getGbufferModelView());
        matrix4f.rotate((Quaternionfc)class02058.u.N(180.0f - f));
        matrix4f.rotate((Quaternionfc)class02058.y.N(-90.0f - f2));
        return matrix4f.transform(vector4f);
    }

    public Vector4f getShadowLightPosition() {
        if (((class03448)class06202.Nq().T_3).method_27983() == class07299.field_25181 && Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::supportsEndFlash).orElse(false).booleanValue()) {
            return this.getEndFlashPosition();
        }
        return CelestialUniforms.isDay() ? this.getSunPosition() : this.getMoonPosition();
    }

    public void addCelestialUniforms(UniformHolder uniformHolder) {
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "sunAngle", () -> CelestialUniforms.getSunAngle(true) / 360.0f).uniformTruncated3f(UniformUpdateFrequency.PER_FRAME, "sunPosition", this::getSunPosition).uniformTruncated3f(UniformUpdateFrequency.PER_FRAME, "moonPosition", this::getMoonPosition).uniform1f(UniformUpdateFrequency.PER_FRAME, "shadowAngle", CelestialUniforms::getShadowAngle).uniformTruncated3f(UniformUpdateFrequency.PER_FRAME, "shadowLightPosition", this::getShadowLightPosition).uniformTruncated3f(UniformUpdateFrequency.PER_FRAME, "endFlashPosition", () -> {
            if (((class03448)class06202.Nq().T_3).method_27983() == class07299.field_25181) {
                return this.getEndFlashPosition();
            }
            return ZERO;
        }).uniformTruncated3f(UniformUpdateFrequency.PER_FRAME, "upPosition", CelestialUniforms::getUpPosition);
    }

    private Vector4f getCelestialPosition(boolean bl, float f) {
        Vector4f vector4f = new Vector4f(0.0f, 100.0f, 0.0f, 1.0f);
        Matrix4f matrix4f = new Matrix4f(CapturedRenderingState.INSTANCE.getGbufferModelView());
        matrix4f.rotate((Quaternionfc)class02058.u.N(-90.0f));
        matrix4f.rotate((Quaternionfc)class02058.R.N(this.sunPathRotation));
        float f2 = ((Float)((class03386)class06202.Nq().i_5).s().U().N(bl ? class00608.W : class00608.m, CapturedRenderingState.INSTANCE.getTickDelta())).floatValue();
        matrix4f.rotate((Quaternionfc)class02058.y.N(f2));
        vector4f = matrix4f.transform(vector4f);
        return vector4f;
    }

    private Vector4f getEndFlashPositionInWorldSpace() {
        class00917 class009172 = ((class03448)class06202.Nq().T_3).R();
        float f = class009172.y();
        float f2 = class009172.N();
        Vector4f vector4f = new Vector4f(0.0f, 100.0f, 0.0f, 0.0f);
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.identity();
        matrix4f.rotate((Quaternionfc)class02058.u.N(180.0f - f));
        matrix4f.rotate((Quaternionfc)class02058.y.N(-90.0f - f2));
        return matrix4f.transform(vector4f);
    }

    public Vector4f getShadowLightPositionInWorldSpace() {
        if (((class03448)class06202.Nq().T_3).method_27983() == class07299.field_25181 && Iris.getPipelineManager().getPipeline().map(WorldRenderingPipeline::supportsEndFlash).orElse(false).booleanValue()) {
            return this.getEndFlashPositionInWorldSpace();
        }
        return CelestialUniforms.isDay() ? this.getCelestialPositionInWorldSpace(true, 100.0f) : this.getCelestialPositionInWorldSpace(false, -100.0f);
    }

    private Vector4f getCelestialPositionInWorldSpace(boolean bl, float f) {
        Vector4f vector4f = new Vector4f(0.0f, 100.0f, 0.0f, 0.0f);
        Matrix4f matrix4f = new Matrix4f();
        matrix4f.identity();
        matrix4f.rotate((Quaternionfc)class02058.u.N(-90.0f));
        matrix4f.rotate((Quaternionfc)class02058.R.N(this.sunPathRotation));
        float f2 = ((Float)((class03386)class06202.Nq().i_5).s().U().N(bl ? class00608.W : class00608.m, CapturedRenderingState.INSTANCE.getTickDelta())).floatValue();
        matrix4f.rotate((Quaternionfc)class02058.y.N(f2));
        matrix4f.transform(vector4f);
        return vector4f;
    }

    public static float getSunAngle(boolean bl) {
        float f = ((Float)((class03386)class06202.Nq().i_5).s().U().N(bl ? class00608.W : class00608.m, CapturedRenderingState.INSTANCE.getTickDelta())).floatValue();
        float f2 = f + 90.0f;
        if (f2 < 0.0f) {
            f2 += 360.0f;
        } else if (f2 > 360.0f) {
            f2 -= 360.0f;
        }
        return f2;
    }

    private static float getShadowAngle() {
        float f = CelestialUniforms.getSunAngle(CelestialUniforms.isDay());
        return f / 360.0f;
    }

    private static Vector4f getUpPosition() {
        Vector4f vector4f = new Vector4f(0.0f, 100.0f, 0.0f, 0.0f);
        Matrix4f matrix4f = new Matrix4f(CapturedRenderingState.INSTANCE.getGbufferModelView());
        matrix4f.rotate((Quaternionfc)class02058.u.N(-90.0f));
        vector4f = matrix4f.transform(vector4f);
        return vector4f;
    }

    private Vector4f getMoonPosition() {
        return this.getCelestialPosition(false, -100.0f);
    }

    private Vector4f getSunPosition() {
        return this.getCelestialPosition(true, 100.0f);
    }

    public static boolean isDay() {
        float f = CelestialUniforms.getSunAngle(true);
        return f < 180.0f;
    }
}

