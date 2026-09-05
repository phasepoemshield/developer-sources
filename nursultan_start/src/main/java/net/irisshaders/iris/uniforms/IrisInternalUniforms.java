/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03386
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 *  net.caffeinemc.mods.sodium.client.util.FogStorage
 *  net.irisshaders.iris.gl.state.FogMode
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  org.joml.Vector4f
 */
package net.irisshaders.iris.uniforms;

import minecraft.class03386;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.client.util.FogParameters;
import net.caffeinemc.mods.sodium.client.util.FogStorage;
import net.irisshaders.iris.gl.state.FogMode;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import net.irisshaders.iris.uniforms.CapturedRenderingState;
import org.joml.Vector4f;

public class IrisInternalUniforms {
    private static final Vector4f ONE = new Vector4f(1.0f, 1.0f, 1.0f, 1.0f);

    private IrisInternalUniforms() {
    }

    public static void addFogUniforms(DynamicUniformHolder dynamicUniformHolder, FogMode fogMode) {
        dynamicUniformHolder.uniform4f("iris_FogColor", () -> {
            FogParameters fogParameters = ((FogStorage)((class03386)class06202.Nq().i_5)).sodium$getFogParameters();
            if (fogParameters == FogParameters.NONE) {
                return ONE;
            }
            return new Vector4f(fogParameters.red(), fogParameters.green(), fogParameters.blue(), fogParameters.alpha());
        }, runnable -> {});
        dynamicUniformHolder.uniform1f("iris_FogStart", () -> ((FogStorage)((class03386)class06202.Nq().i_5)).sodium$getFogParameters().environmentalStart(), runnable -> {}).uniform1f("iris_FogEnd", () -> ((FogStorage)((class03386)class06202.Nq().i_5)).sodium$getFogParameters().environmentalEnd(), runnable -> {});
        dynamicUniformHolder.uniform1f("iris_FogDensity", () -> Math.max(0.0f, CapturedRenderingState.INSTANCE.getFogDensity()), runnable -> {});
        dynamicUniformHolder.uniform1f("iris_currentAlphaTest", CapturedRenderingState.INSTANCE::getCurrentAlphaTest, runnable -> {});
        dynamicUniformHolder.uniform1f("alphaTestRef", CapturedRenderingState.INSTANCE::getCurrentAlphaTest, runnable -> {});
    }
}

