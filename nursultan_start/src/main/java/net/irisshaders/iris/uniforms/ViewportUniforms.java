/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 */
package net.irisshaders.iris.uniforms;

import minecraft.class06202;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;

public final class ViewportUniforms {
    private ViewportUniforms() {
    }

    public static void addViewportUniforms(UniformHolder uniformHolder) {
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "viewHeight", () -> class06202.Nq().e().y).uniform1f(UniformUpdateFrequency.PER_FRAME, "viewWidth", () -> class06202.Nq().e().N).uniform1f(UniformUpdateFrequency.PER_FRAME, "aspectRatio", ViewportUniforms::getAspectRatio);
    }

    private static float getAspectRatio() {
        return (float)class06202.Nq().e().N / (float)class06202.Nq().e().y;
    }
}

