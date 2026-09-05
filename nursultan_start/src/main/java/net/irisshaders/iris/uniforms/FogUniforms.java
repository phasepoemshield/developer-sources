/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03386
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.client.util.FogStorage
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.gl.state.StateUpdateNotifiers
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 *  org.joml.Vector3f
 */
package net.irisshaders.iris.uniforms;

import minecraft.class03386;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.client.util.FogStorage;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.state.StateUpdateNotifiers;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Vector3f;

public class FogUniforms {
    private FogUniforms() {
    }

    public static void addFogUniforms(DynamicUniformHolder dynamicUniformHolder, FogMode fogMode) {
        if (fogMode == FogMode.OFF) {
            dynamicUniformHolder.uniform1i(UniformUpdateFrequency.ONCE, "fogMode", () -> 0);
            dynamicUniformHolder.uniform1i(UniformUpdateFrequency.ONCE, "fogShape", () -> -1);
        } else if (fogMode == FogMode.PER_VERTEX || fogMode == FogMode.PER_FRAGMENT) {
            dynamicUniformHolder.uniform1i("fogMode", () -> {
                float f = CapturedRenderingState.INSTANCE.getFogDensity();
                if (f < 0.0f) {
                    return 9729;
                }
                return 2049;
            }, runnable -> {});
            dynamicUniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "fogShape", () -> 1);
        }
        dynamicUniformHolder.uniform1f("fogDensity", () -> Math.max(0.0f, CapturedRenderingState.INSTANCE.getFogDensity()), runnable -> {});
        dynamicUniformHolder.uniform1f("fogStart", () -> ((FogStorage)((class03386)class06202.Nq().i_5)).sodium$getFogParameters().environmentalStart(), runnable -> StateUpdateNotifiers.fogStartNotifier.setListener(runnable));
        dynamicUniformHolder.uniform1f("fogEnd", () -> ((FogStorage)((class03386)class06202.Nq().i_5)).sodium$getFogParameters().environmentalEnd(), runnable -> StateUpdateNotifiers.fogEndNotifier.setListener(runnable));
        dynamicUniformHolder.uniform3f(UniformUpdateFrequency.PER_FRAME, "fogColor", () -> new Vector3f((float)CapturedRenderingState.INSTANCE.getFogColor().x, (float)CapturedRenderingState.INSTANCE.getFogColor().y, (float)CapturedRenderingState.INSTANCE.getFogColor().z));
    }
}

