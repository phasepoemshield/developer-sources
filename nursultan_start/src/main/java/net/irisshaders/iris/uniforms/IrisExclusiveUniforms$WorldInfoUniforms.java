/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00608
 *  minecraft.class03386
 *  minecraft.class03448
 *  minecraft.class06202
 *  net.irisshaders.iris.gl.uniform.UniformHolder
 *  net.irisshaders.iris.gl.uniform.UniformUpdateFrequency
 */
package net.irisshaders.iris.uniforms;

import minecraft.class00608;
import minecraft.class03386;
import minecraft.class03448;
import minecraft.class06202;
import net.irisshaders.iris.gl.uniform.UniformHolder;
import net.irisshaders.iris.gl.uniform.UniformUpdateFrequency;

public class IrisExclusiveUniforms$WorldInfoUniforms {
    public static void addWorldInfoUniforms(UniformHolder uniformHolder) {
        class03448 class034482 = (class03448)class06202.Nq().T_3;
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "bedrockLevel", () -> {
            if (class034482 != null) {
                return class034482.method_8597().B();
            }
            return 0;
        });
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "cloudHeight", () -> {
            if (class034482 != null) {
                return ((Float)((class03386)class06202.Nq().i_5).s().U().N(class00608.E, class06202.Nq().NK().N(false))).floatValue();
            }
            return 192.0;
        });
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "heightLimit", () -> {
            if (class034482 != null) {
                return class034482.method_8597().Z();
            }
            return 256;
        });
        uniformHolder.uniform1i(UniformUpdateFrequency.PER_FRAME, "logicalHeightLimit", () -> {
            if (class034482 != null) {
                return class034482.method_8597().z();
            }
            return 256;
        });
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_FRAME, "hasCeiling", () -> {
            if (class034482 != null) {
                return class034482.method_8597().R();
            }
            return false;
        });
        uniformHolder.uniform1b(UniformUpdateFrequency.PER_FRAME, "hasSkylight", () -> {
            if (class034482 != null) {
                return class034482.method_8597().i();
            }
            return true;
        });
        uniformHolder.uniform1f(UniformUpdateFrequency.PER_FRAME, "ambientLight", () -> {
            if (class034482 != null) {
                return class034482.method_8597().E();
            }
            return 0.0f;
        });
    }
}

