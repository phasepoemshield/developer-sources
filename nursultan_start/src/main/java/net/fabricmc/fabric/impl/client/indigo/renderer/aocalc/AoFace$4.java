/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07211
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl
 */
package net.fabricmc.fabric.impl.client.indigo.renderer.aocalc;

import minecraft.class07211;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoFace;
import net.fabricmc.fabric.impl.client.indigo.renderer.aocalc.AoVertexClampFunction;
import net.fabricmc.fabric.impl.client.indigo.renderer.mesh.QuadViewImpl;

@Environment(value=EnvType.CLIENT)
final class AoFace$4
extends AoFace {
    AoFace$4(class07211[] class07211Array, int[] nArray) {
    }

    @Override
    void computeCornerWeights(QuadViewImpl quadViewImpl, int n, float[] fArray) {
        float f = AoVertexClampFunction.CLAMP_FUNC.clamp(quadViewImpl.y(n));
        float f2 = AoVertexClampFunction.CLAMP_FUNC.clamp(quadViewImpl.x(n));
        fArray[0] = f * (1.0f - f2);
        fArray[1] = (1.0f - f) * (1.0f - f2);
        fArray[2] = (1.0f - f) * f2;
        fArray[3] = f * f2;
    }

    @Override
    float computeDepth(QuadViewImpl quadViewImpl, int n) {
        return 1.0f - AoVertexClampFunction.CLAMP_FUNC.clamp(quadViewImpl.z(n));
    }
}

