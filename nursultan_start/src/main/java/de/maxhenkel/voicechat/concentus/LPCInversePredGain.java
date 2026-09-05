/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Inlines;

class LPCInversePredGain {
    private static final int QA = 24;
    private static final int A_LIMIT = 0xFFEF9E;

    LPCInversePredGain() {
    }

    static int silk_LPC_inverse_pred_gain(short[] sArray, int n) {
        int[][] nArray = Arrays.InitTwoDimensionalArrayInt(2, 16);
        int n2 = 0;
        int[] nArray2 = nArray[n & 1];
        for (int i = 0; i < n; ++i) {
            n2 += sArray[i];
            nArray2[i] = Inlines.silk_LSHIFT32(sArray[i], 12);
        }
        if (n2 >= 4096) {
            return 0;
        }
        return LPCInversePredGain.LPC_inverse_pred_gain_QA(nArray, n);
    }

    static int LPC_inverse_pred_gain_QA(int[][] nArray, int n) {
        int n2;
        int n3;
        int[] nArray2 = nArray[n & 1];
        int n4 = 0x40000000;
        for (int i = n - 1; i > 0; --i) {
            if (nArray2[i] > 0xFFEF9E || nArray2[i] < -16773022) {
                return 0;
            }
            n3 = 0 - Inlines.silk_LSHIFT(nArray2[i], 7);
            n2 = 0x40000000 - Inlines.silk_SMMUL(n3, n3);
            Inlines.OpusAssert(n2 > 32768);
            Inlines.OpusAssert(n2 <= 0x40000000);
            int n5 = 32 - Inlines.silk_CLZ32(Inlines.silk_abs(n2));
            int n6 = Inlines.silk_INVERSE32_varQ(n2, n5 + 30);
            n4 = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(n4, n2), 2);
            Inlines.OpusAssert(n4 >= 0);
            Inlines.OpusAssert(n4 <= 0x40000000);
            int[] nArray3 = nArray2;
            nArray2 = nArray[i & 1];
            for (int j = 0; j < i; ++j) {
                int n7 = nArray3[j] - Inlines.MUL32_FRAC_Q(nArray3[i - j - 1], n3, 31);
                nArray2[j] = Inlines.MUL32_FRAC_Q(n7, n6, n5);
            }
        }
        if (nArray2[0] > 0xFFEF9E || nArray2[0] < -16773022) {
            return 0;
        }
        n3 = 0 - Inlines.silk_LSHIFT(nArray2[0], 7);
        n2 = 0x40000000 - Inlines.silk_SMMUL(n3, n3);
        Inlines.OpusAssert((n4 = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(n4, n2), 2)) >= 0);
        Inlines.OpusAssert(n4 <= 0x40000000);
        return n4;
    }

    static int silk_LPC_inverse_pred_gain_Q24(int[] nArray, int n) {
        int[][] nArray2 = Arrays.InitTwoDimensionalArrayInt(2, 16);
        int[] nArray3 = nArray2[n & 1];
        for (int i = 0; i < n; ++i) {
            nArray3[i] = Inlines.silk_RSHIFT32(nArray[i], 0);
        }
        return LPCInversePredGain.LPC_inverse_pred_gain_QA(nArray2, n);
    }
}

