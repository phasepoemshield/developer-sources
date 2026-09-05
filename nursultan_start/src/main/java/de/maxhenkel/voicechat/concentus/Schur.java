/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Inlines;

class Schur {
    Schur() {
    }

    static int silk_schur(short[] sArray, int[] nArray, int n) {
        int n2;
        int[][] nArray2 = Arrays.InitTwoDimensionalArrayInt((int)17, (int)2);
        Inlines.OpusAssert((n == 6 || n == 8 || n == 10 || n == 12 || n == 14 || n == 16 ? 1 : 0) != 0);
        int n3 = Inlines.silk_CLZ32((int)nArray[0]);
        if (n3 < 2) {
            for (n2 = 0; n2 < n + 1; ++n2) {
                int n4 = Inlines.silk_RSHIFT((int)nArray[n2], (int)1);
                nArray2[n2][1] = n4;
                nArray2[n2][0] = n4;
            }
        } else if (n3 > 2) {
            n3 -= 2;
            for (n2 = 0; n2 < n + 1; ++n2) {
                int n5 = Inlines.silk_LSHIFT((int)nArray[n2], (int)n3);
                nArray2[n2][1] = n5;
                nArray2[n2][0] = n5;
            }
        } else {
            for (n2 = 0; n2 < n + 1; ++n2) {
                int n6 = nArray[n2];
                nArray2[n2][1] = n6;
                nArray2[n2][0] = n6;
            }
        }
        for (n2 = 0; n2 < n; ++n2) {
            if (Inlines.silk_abs_int32((int)nArray2[n2 + 1][0]) >= nArray2[0][1]) {
                sArray[n2] = nArray2[n2 + 1][0] > 0 ? -32440 : 32440;
                ++n2;
                break;
            }
            int n7 = 0 - Inlines.silk_DIV32_16((int)nArray2[n2 + 1][0], (int)Inlines.silk_max_32((int)Inlines.silk_RSHIFT((int)nArray2[0][1], (int)15), (int)1));
            n7 = Inlines.silk_SAT16((int)n7);
            sArray[n2] = (short)n7;
            for (int i = 0; i < n - n2; ++i) {
                int n8 = nArray2[i + n2 + 1][0];
                int n9 = nArray2[i][1];
                nArray2[i + n2 + 1][0] = Inlines.silk_SMLAWB((int)n8, (int)Inlines.silk_LSHIFT((int)n9, (int)1), (int)n7);
                nArray2[i][1] = Inlines.silk_SMLAWB((int)n9, (int)Inlines.silk_LSHIFT((int)n8, (int)1), (int)n7);
            }
        }
        while (n2 < n) {
            sArray[n2] = 0;
            ++n2;
        }
        return Inlines.silk_max_32((int)1, (int)nArray2[0][1]);
    }

    static int silk_schur64(int[] nArray, int[] nArray2, int n) {
        int n2;
        int[][] nArray3 = Arrays.InitTwoDimensionalArrayInt((int)17, (int)2);
        Inlines.OpusAssert((n == 6 || n == 8 || n == 10 || n == 12 || n == 14 || n == 16 ? 1 : 0) != 0);
        if (nArray2[0] <= 0) {
            Arrays.MemSet((int[])nArray, (int)0, (int)n);
            return 0;
        }
        for (n2 = 0; n2 < n + 1; ++n2) {
            int n3 = nArray2[n2];
            nArray3[n2][1] = n3;
            nArray3[n2][0] = n3;
        }
        for (n2 = 0; n2 < n; ++n2) {
            if (Inlines.silk_abs_int32((int)nArray3[n2 + 1][0]) >= nArray3[0][1]) {
                nArray[n2] = nArray3[n2 + 1][0] > 0 ? -64881 : 64881;
                ++n2;
                break;
            }
            int n4 = Inlines.silk_DIV32_varQ((int)(-nArray3[n2 + 1][0]), (int)nArray3[0][1], (int)31);
            nArray[n2] = Inlines.silk_RSHIFT_ROUND((int)n4, (int)15);
            for (int i = 0; i < n - n2; ++i) {
                int n5 = nArray3[i + n2 + 1][0];
                int n6 = nArray3[i][1];
                nArray3[i + n2 + 1][0] = n5 + Inlines.silk_SMMUL((int)Inlines.silk_LSHIFT((int)n6, (int)1), (int)n4);
                nArray3[i][1] = n6 + Inlines.silk_SMMUL((int)Inlines.silk_LSHIFT((int)n5, (int)1), (int)n4);
            }
        }
        while (n2 < n) {
            nArray[n2] = 0;
            ++n2;
        }
        return Inlines.silk_max_32((int)1, (int)nArray3[0][1]);
    }
}

