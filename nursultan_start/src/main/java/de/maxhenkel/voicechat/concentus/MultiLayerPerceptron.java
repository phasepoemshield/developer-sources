/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.MLPState;
import de.maxhenkel.voicechat.concentus.OpusTables;

class MultiLayerPerceptron {
    private static final int MAX_NEURONS = 100;

    MultiLayerPerceptron() {
    }

    static void mlp_process(MLPState mLPState, float[] fArray, float[] fArray2) {
        int n;
        float f;
        int n2;
        float[] fArray3 = new float[100];
        float[] fArray4 = mLPState.weights;
        int n3 = 0;
        for (n2 = 0; n2 < mLPState.topo[1]; ++n2) {
            f = fArray4[n3];
            ++n3;
            for (n = 0; n < mLPState.topo[0]; ++n) {
                f += fArray[n] * fArray4[n3];
                ++n3;
            }
            fArray3[n2] = MultiLayerPerceptron.tansig_approx(f);
        }
        for (n2 = 0; n2 < mLPState.topo[2]; ++n2) {
            f = fArray4[n3];
            ++n3;
            for (n = 0; n < mLPState.topo[1]; ++n) {
                f += fArray3[n] * fArray4[n3];
                ++n3;
            }
            fArray2[n2] = MultiLayerPerceptron.tansig_approx(f);
        }
    }

    static float tansig_approx(float f) {
        float f2 = 1.0f;
        if (!(f < 8.0f)) {
            return 1.0f;
        }
        if (!(f > -8.0f)) {
            return -1.0f;
        }
        if (f < 0.0f) {
            f = -f;
            f2 = -1.0f;
        }
        int n = (int)Math.floor(0.5f + 25.0f * f);
        float f3 = OpusTables.tansig_table[n];
        float f4 = 1.0f - f3 * f3;
        f3 += (f -= 0.04f * (float)n) * f4 * (1.0f - f3 * f);
        return f2 * f3;
    }
}

