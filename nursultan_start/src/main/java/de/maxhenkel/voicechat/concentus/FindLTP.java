/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.LinearAlgebra
 *  de.maxhenkel.voicechat.concentus.RegularizeCorrelations
 *  de.maxhenkel.voicechat.concentus.ResidualEnergy
 *  de.maxhenkel.voicechat.concentus.SumSqrShift
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CorrelateMatrix;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.LinearAlgebra;
import de.maxhenkel.voicechat.concentus.RegularizeCorrelations;
import de.maxhenkel.voicechat.concentus.ResidualEnergy;
import de.maxhenkel.voicechat.concentus.SumSqrShift;

class FindLTP {
    private static final int LTP_CORRS_HEAD_ROOM = 2;

    FindLTP() {
    }

    static void silk_fit_LTP(int[] nArray, short[] sArray, int n) {
        for (int i = 0; i < 5; ++i) {
            sArray[n + i] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(nArray[i], 2));
        }
    }

    static void silk_find_LTP(short[] sArray, int[] nArray, BoxedValueInt boxedValueInt, short[] sArray2, int[] nArray2, int[] nArray3, int n, int n2, int n3, int[] nArray4) {
        int n4;
        int n5;
        int n6;
        int n7;
        int[] nArray5 = new int[5];
        int[] nArray6 = new int[5];
        int[] nArray7 = new int[4];
        int[] nArray8 = new int[4];
        int[] nArray9 = new int[4];
        int[] nArray10 = new int[5];
        int[] nArray11 = new int[4];
        int n8 = 0;
        int n9 = 0;
        int n10 = n3;
        for (n7 = 0; n7 < n2; ++n7) {
            int n11 = n10 - (nArray2[n7] + 2);
            BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
            BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
            SumSqrShift.silk_sum_sqr_shift((BoxedValueInt)boxedValueInt2, (BoxedValueInt)boxedValueInt3, (short[])sArray2, (int)n10, (int)n);
            nArray11[n7] = boxedValueInt2.Val;
            int n12 = boxedValueInt3.Val;
            int n13 = Inlines.silk_CLZ32(nArray11[n7]);
            if (n13 < 2) {
                nArray11[n7] = Inlines.silk_RSHIFT_ROUND(nArray11[n7], 2 - n13);
                n12 += 2 - n13;
            }
            nArray4[n7] = n12;
            BoxedValueInt boxedValueInt4 = new BoxedValueInt(nArray4[n7]);
            CorrelateMatrix.silk_corrMatrix(sArray2, n11, n, 5, 2, nArray, n9, boxedValueInt4);
            nArray4[n7] = boxedValueInt4.Val;
            CorrelateMatrix.silk_corrVector(sArray2, n11, sArray2, n10, n, 5, nArray10, nArray4[n7]);
            if (nArray4[n7] > n12) {
                nArray11[n7] = Inlines.silk_RSHIFT(nArray11[n7], nArray4[n7] - n12);
            }
            Inlines.OpusAssert(nArray11[n7] >= 0);
            int n14 = 1;
            n14 = Inlines.silk_SMLAWB(n14, nArray11[n7], 1092);
            n14 = Inlines.silk_SMLAWB(n14, Inlines.MatrixGet(nArray, n9, 0, 0, 5), 1092);
            n14 = Inlines.silk_SMLAWB(n14, Inlines.MatrixGet(nArray, n9, 4, 4, 5), 1092);
            RegularizeCorrelations.silk_regularize_correlations((int[])nArray, (int)n9, (int[])nArray11, (int)n7, (int)n14, (int)5);
            LinearAlgebra.silk_solve_LDL((int[])nArray, (int)n9, (int)5, (int[])nArray10, (int[])nArray5);
            FindLTP.silk_fit_LTP(nArray5, sArray, n8);
            nArray8[n7] = ResidualEnergy.silk_residual_energy16_covar((short[])sArray, (int)n8, (int[])nArray, (int)n9, (int[])nArray10, (int)nArray11[n7], (int)5, (int)14);
            n6 = Inlines.silk_min_int(nArray4[n7], 2);
            int n15 = Inlines.silk_LSHIFT_SAT32(Inlines.silk_SMULWB(nArray8[n7], nArray3[n7]), 1 + n6) + Inlines.silk_RSHIFT(Inlines.silk_SMULWB(n, 655), nArray4[n7] - n6);
            n15 = Inlines.silk_max(n15, 1);
            Inlines.OpusAssert((long)nArray3[n7] << 16 < Integer.MAX_VALUE);
            n5 = Inlines.silk_DIV32(Inlines.silk_LSHIFT(nArray3[n7], 16), n15);
            n5 = Inlines.silk_RSHIFT(n5, 31 + nArray4[n7] - n6 - 26);
            int n16 = 0;
            for (n4 = n9; n4 < n9 + 25; ++n4) {
                n16 = Inlines.silk_max(nArray[n4], n16);
            }
            int n17 = Inlines.silk_CLZ32(n16) - 1 - 3;
            Inlines.OpusAssert(8 + n17 >= 0);
            if (8 + n17 < 31) {
                n5 = Inlines.silk_min_32(n5, Inlines.silk_LSHIFT(1, 8 + n17));
            }
            Inlines.silk_scale_vector32_Q26_lshift_18(nArray, n9, n5, 25);
            nArray9[n7] = Inlines.MatrixGet(nArray, n9, 2, 2, 5);
            Inlines.OpusAssert(nArray9[n7] >= 0);
            n10 += n;
            n8 += 5;
            n9 += 25;
        }
        int n18 = 0;
        for (n7 = 0; n7 < n2; ++n7) {
            n18 = Inlines.silk_max_int(nArray4[n7], n18);
        }
        if (boxedValueInt != null) {
            int n19 = 0;
            int n20 = 0;
            Inlines.OpusAssert(true);
            for (n7 = 0; n7 < n2; ++n7) {
                n20 = Inlines.silk_ADD32(n20, Inlines.silk_RSHIFT(Inlines.silk_ADD32(Inlines.silk_SMULWB(nArray11[n7], nArray3[n7]), 1), 1 + (n18 - nArray4[n7])));
                n19 = Inlines.silk_ADD32(n19, Inlines.silk_RSHIFT(Inlines.silk_ADD32(Inlines.silk_SMULWB(nArray8[n7], nArray3[n7]), 1), 1 + (n18 - nArray4[n7])));
            }
            n19 = Inlines.silk_max(n19, 1);
            int n21 = Inlines.silk_DIV32_varQ(n20, n19, 16);
            boxedValueInt.Val = Inlines.silk_SMULBB(3, Inlines.silk_lin2log(n21) - 2048);
            Inlines.OpusAssert(boxedValueInt.Val == Inlines.silk_SAT16(Inlines.silk_MUL(3, Inlines.silk_lin2log(n21) - 2048)));
        }
        n8 = 0;
        for (n7 = 0; n7 < n2; ++n7) {
            nArray7[n7] = 0;
            for (n4 = n8; n4 < n8 + 5; ++n4) {
                int n22 = n7;
                nArray7[n22] = nArray7[n22] + sArray[n4];
            }
            n8 += 5;
        }
        int n23 = 0;
        int n24 = 0;
        for (n7 = 0; n7 < n2; ++n7) {
            n23 = Inlines.silk_max_32(n23, Inlines.silk_abs(nArray7[n7]));
            n24 = Inlines.silk_max_32(n24, 32 - Inlines.silk_CLZ32(nArray9[n7]) + nArray4[n7] - n18);
        }
        Inlines.OpusAssert(n23 <= 163840);
        n6 = n24 + 32 - Inlines.silk_CLZ32(n23) - 14;
        n6 -= 29 + n18;
        n6 = Inlines.silk_max_int(n6, 0);
        int n25 = n18 + n6;
        n5 = Inlines.silk_RSHIFT(262, n18 + n6) + 1;
        int n26 = 0;
        for (n7 = 0; n7 < n2; ++n7) {
            n5 = Inlines.silk_ADD32(n5, Inlines.silk_RSHIFT(nArray9[n7], n25 - nArray4[n7]));
            n26 = Inlines.silk_ADD32(n26, Inlines.silk_LSHIFT(Inlines.silk_SMULWW(Inlines.silk_RSHIFT(nArray9[n7], n25 - nArray4[n7]), nArray7[n7]), 2));
        }
        int n27 = Inlines.silk_DIV32_varQ(n26, n5, 12);
        n8 = 0;
        for (n7 = 0; n7 < n2; ++n7) {
            n5 = 2 - nArray4[n7] > 0 ? Inlines.silk_RSHIFT(nArray9[n7], 2 - nArray4[n7]) : Inlines.silk_LSHIFT_SAT32(nArray9[n7], nArray4[n7] - 2);
            int n28 = Inlines.silk_MUL(Inlines.silk_DIV32(0x666667, Inlines.silk_RSHIFT(0x666667, 10) + n5), Inlines.silk_LSHIFT_SAT32(Inlines.silk_SUB_SAT32(n27, Inlines.silk_RSHIFT(nArray7[n7], 2)), 4));
            n5 = 0;
            for (n4 = 0; n4 < 5; ++n4) {
                nArray6[n4] = Inlines.silk_max_16(sArray[n8 + n4], (short)1638);
                n5 += nArray6[n4];
            }
            n5 = Inlines.silk_DIV32(n28, n5);
            for (n4 = 0; n4 < 5; ++n4) {
                sArray[n8 + n4] = (short)Inlines.silk_LIMIT_32(sArray[n8 + n4] + Inlines.silk_SMULWB(Inlines.silk_LSHIFT_SAT32(n5, 4), nArray6[n4]), -16000, 28000);
            }
            n8 += 5;
        }
    }
}

