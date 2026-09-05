/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.model.quad.properties;

import net.caffeinemc.mods.sodium.client.model.quad.ModelQuadView;

public enum ModelQuadOrientation {
    NORMAL(new int[]{0, 1, 2, 3}),
    FLIP(new int[]{1, 2, 3, 0});

    private final int[] indices;

    private ModelQuadOrientation(int[] nArray) {
        this.indices = nArray;
    }

    public int getVertexIndex(int n) {
        return this.indices[n];
    }

    public static ModelQuadOrientation orientByBrightness(float[] fArray, int[] nArray) {
        float f = fArray[0] + fArray[2];
        float f2 = fArray[1] + fArray[3];
        if (f > f2) {
            return NORMAL;
        }
        if (f < f2) {
            return FLIP;
        }
        int n = nArray[0] + nArray[2];
        int n2 = nArray[1] + nArray[3];
        if (n <= n2) {
            return NORMAL;
        }
        return FLIP;
    }

    public static ModelQuadOrientation orientByBrightness(float[] fArray, ModelQuadView modelQuadView) {
        int n;
        float f = fArray[0] + fArray[2];
        float f2 = fArray[1] + fArray[3];
        if (f > f2) {
            return NORMAL;
        }
        if (f < f2) {
            return FLIP;
        }
        int n2 = modelQuadView.getLight(0) + modelQuadView.getLight(2);
        if (n2 <= (n = modelQuadView.getLight(1) + modelQuadView.getLight(3))) {
            return NORMAL;
        }
        return FLIP;
    }
}

