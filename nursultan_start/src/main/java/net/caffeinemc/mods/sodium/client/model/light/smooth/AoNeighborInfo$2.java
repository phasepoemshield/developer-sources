/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07211
 */
package net.caffeinemc.mods.sodium.client.model.light.smooth;

import minecraft.class04995;
import minecraft.class07211;
import net.caffeinemc.mods.sodium.client.model.light.smooth.AoNeighborInfo;

final class AoNeighborInfo$2
extends AoNeighborInfo {
    AoNeighborInfo$2(class07211[] class07211Array, float f) {
    }

    @Override
    public float getDepth(float f, float f2, float f3) {
        return 1.0f - class04995.N((float)f2, (float)0.0f, (float)1.0f);
    }

    @Override
    public void calculateCornerWeights(float f, float f2, float f3, float[] fArray) {
        float f4 = class04995.N((float)f3, (float)0.0f, (float)1.0f);
        float f5 = class04995.N((float)f, (float)0.0f, (float)1.0f);
        fArray[0] = f5 * f4;
        fArray[1] = f5 * (1.0f - f4);
        fArray[2] = (1.0f - f5) * (1.0f - f4);
        fArray[3] = (1.0f - f5) * f4;
    }

    @Override
    public void mapCorners(int[] nArray, float[] fArray, int[] nArray2, float[] fArray2) {
        nArray2[2] = nArray[0];
        nArray2[3] = nArray[1];
        nArray2[0] = nArray[2];
        nArray2[1] = nArray[3];
        fArray2[2] = fArray[0];
        fArray2[3] = fArray[1];
        fArray2[0] = fArray[2];
        fArray2[1] = fArray[3];
    }
}

