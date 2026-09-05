/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.Filters
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SumSqrShift;

class ResidualEnergy {
    ResidualEnergy() {
    }

    static void silk_residual_energy(int[] nArray, int[] nArray2, short[] sArray, short[][] sArray2, int[] nArray3, int n, int n2, int n3) {
        int n4;
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        int n5 = 0;
        int n6 = n3 + n;
        short[] sArray3 = new short[2 * n6];
        Inlines.OpusAssert(((n2 >> 1) * 2 == n2 ? 1 : 0) != 0);
        for (n4 = 0; n4 < n2 >> 1; ++n4) {
            Filters.silk_LPC_analysis_filter((short[])sArray3, (int)0, (short[])sArray, (int)n5, (short[])sArray2[n4], (int)0, (int)(2 * n6), (int)n3);
            int n7 = n3;
            for (int i = 0; i < 2; ++i) {
                SumSqrShift.silk_sum_sqr_shift(boxedValueInt2, boxedValueInt, sArray3, n7, n);
                nArray[n4 * 2 + i] = boxedValueInt2.Val;
                nArray2[n4 * 2 + i] = 0 - boxedValueInt.Val;
                n7 += n6;
            }
            n5 += 2 * n6;
        }
        n4 = 0;
        while (n4 < n2) {
            int n8 = Inlines.silk_CLZ32((int)nArray[n4]) - 1;
            int n9 = Inlines.silk_CLZ32((int)nArray3[n4]) - 1;
            int n10 = Inlines.silk_LSHIFT32((int)nArray3[n4], (int)n9);
            n10 = Inlines.silk_SMMUL((int)n10, (int)n10);
            nArray[n4] = Inlines.silk_SMMUL((int)n10, (int)Inlines.silk_LSHIFT32((int)nArray[n4], (int)n8));
            int n11 = n4++;
            nArray2[n11] = nArray2[n11] + (n8 + 2 * n9 - 32 - 32);
        }
    }

    static int silk_residual_energy16_covar(short[] sArray, int n, int[] nArray, int n2, int[] nArray2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int[] nArray3 = new int[n4];
        Inlines.OpusAssert((n4 >= 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n4 <= 16 ? 1 : 0) != 0);
        Inlines.OpusAssert((n5 > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n5 < 16 ? 1 : 0) != 0);
        int n8 = n7 = 16 - n5;
        int n9 = 0;
        for (n6 = n; n6 < n + n4; ++n6) {
            n9 = Inlines.silk_max_32((int)n9, (int)Inlines.silk_abs((int)sArray[n6]));
        }
        n8 = Inlines.silk_min_int((int)n8, (int)(Inlines.silk_CLZ32((int)n9) - 17));
        int n10 = Inlines.silk_max_32((int)nArray[n2], (int)nArray[n2 + n4 * n4 - 1]);
        n8 = Inlines.silk_min_int((int)n8, (int)(Inlines.silk_CLZ32((int)Inlines.silk_MUL((int)n4, (int)Inlines.silk_RSHIFT((int)Inlines.silk_SMULWB((int)n10, (int)n9), (int)4))) - 5));
        n8 = Inlines.silk_max_int((int)n8, (int)0);
        for (n6 = 0; n6 < n4; ++n6) {
            nArray3[n6] = Inlines.silk_LSHIFT((int)sArray[n + n6], (int)n8);
            Inlines.OpusAssert((Inlines.silk_abs((int)nArray3[n6]) <= 32768 ? 1 : 0) != 0);
        }
        n7 -= n8;
        int n11 = 0;
        for (n6 = 0; n6 < n4; ++n6) {
            n11 = Inlines.silk_SMLAWB((int)n11, (int)nArray2[n6], (int)nArray3[n6]);
        }
        int n12 = Inlines.silk_RSHIFT((int)n3, (int)(1 + n7)) - n11;
        int n13 = 0;
        for (n6 = 0; n6 < n4; ++n6) {
            n11 = 0;
            int n14 = n2 + n6 * n4;
            for (int i = n6 + 1; i < n4; ++i) {
                n11 = Inlines.silk_SMLAWB((int)n11, (int)nArray[n14 + i], (int)nArray3[i]);
            }
            n11 = Inlines.silk_SMLAWB((int)n11, (int)Inlines.silk_RSHIFT((int)nArray[n14 + n6], (int)1), (int)nArray3[n6]);
            n13 = Inlines.silk_SMLAWB((int)n13, (int)n11, (int)nArray3[n6]);
        }
        n12 = (n12 = Inlines.silk_ADD_LSHIFT32((int)n12, (int)n13, (int)n7)) < 1 ? 1 : (n12 > Inlines.silk_RSHIFT((int)Integer.MAX_VALUE, (int)(n7 + 2)) ? 0x3FFFFFFF : Inlines.silk_LSHIFT((int)n12, (int)(n7 + 1)));
        return n12;
    }
}

