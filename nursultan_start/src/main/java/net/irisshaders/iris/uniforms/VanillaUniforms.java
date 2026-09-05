/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06202
 *  net.irisshaders.iris.gl.uniform.DynamicUniformHolder
 *  org.joml.Vector2f
 */
package net.irisshaders.iris.uniforms;

import minecraft.class06202;
import net.irisshaders.iris.gl.uniform.DynamicUniformHolder;
import org.joml.Vector2f;

public class VanillaUniforms {
    public static void addVanillaUniforms(DynamicUniformHolder dynamicUniformHolder) {
        Vector2f vector2f = new Vector2f();
        dynamicUniformHolder.uniform2f("iris_ScreenSize", () -> vector2f.set((float)class06202.Nq().e().N, (float)class06202.Nq().e().y), runnable -> {});
    }
}

