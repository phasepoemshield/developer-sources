/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.SumSqrShift
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SumSqrShift;

class CorrelateMatrix {
    CorrelateMatrix() {
    }

    static void silk_corrMatrix(short[] sArray, int n, int n2, int n3, int n4, int[] nArray, int n5, BoxedValueInt boxedValueInt) {
        int n6;
        int n7;
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        SumSqrShift.silk_sum_sqr_shift((BoxedValueInt)boxedValueInt2, (BoxedValueInt)boxedValueInt3, (short[])sArray, (int)n, (int)(n2 + n3 - 1));
        int n8 = boxedValueInt2.Val;
        int n9 = boxedValueInt3.Val;
        int n10 = Inlines.silk_max(n4 - Inlines.silk_CLZ32(n8), 0);
        n8 = Inlines.silk_RSHIFT32(n8, n10);
        n9 += n10;
        for (n7 = n; n7 < n + n3 - 1; ++n7) {
            n8 -= Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(sArray[n7], sArray[n7]), n9);
        }
        if (n9 < boxedValueInt.Val) {
            n8 = Inlines.silk_RSHIFT32(n8, boxedValueInt.Val - n9);
            n9 = boxedValueInt.Val;
        }
        Inlines.MatrixSet(nArray, n5, 0, 0, n3, n8);
        int n11 = n + n3 - 1;
        for (n6 = 1; n6 < n3; ++n6) {
            n8 = Inlines.silk_SUB32(n8, Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(sArray[n11 + n2 - n6], sArray[n11 + n2 - n6]), n9));
            n8 = Inlines.silk_ADD32(n8, Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(sArray[n11 - n6], sArray[n11 - n6]), n9));
            Inlines.MatrixSet(nArray, n5, n6, n6, n3, n8);
        }
        int n12 = n + n3 - 2;
        if (n9 > 0) {
            for (int i = 1; i < n3; ++i) {
                n8 = 0;
                for (n7 = 0; n7 < n2; ++n7) {
                    n8 += Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(sArray[n11 + n7], sArray[n12 + n7]), n9);
                }
                Inlines.MatrixSet(nArray, n5, i, 0, n3, n8);
                Inlines.MatrixSet(nArray, n5, 0, i, n3, n8);
                for (n6 = 1; n6 < n3 - i; ++n6) {
                    n8 = Inlines.silk_SUB32(n8, Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(sArray[n11 + n2 - n6], sArray[n12 + n2 - n6]), n9));
                    n8 = Inlines.silk_ADD32(n8, Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(sArray[n11 - n6], sArray[n12 - n6]), n9));
                    Inlines.MatrixSet(nArray, n5, i + n6, n6, n3, n8);
                    Inlines.MatrixSet(nArray, n5, n6, i + n6, n3, n8);
                }
                --n12;
            }
        } else {
            for (int i = 1; i < n3; ++i) {
                n8 = Inlines.silk_inner_prod(sArray, n11, sArray, n12, n2);
                Inlines.MatrixSet(nArray, n5, i, 0, n3, n8);
                Inlines.MatrixSet(nArray, n5, 0, i, n3, n8);
                for (n6 = 1; n6 < n3 - i; ++n6) {
                    n8 = Inlines.silk_SUB32(n8, Inlines.silk_SMULBB(sArray[n11 + n2 - n6], sArray[n12 + n2 - n6]));
                    n8 = Inlines.silk_SMLABB(n8, sArray[n11 - n6], sArray[n12 - n6]);
                    Inlines.MatrixSet(nArray, n5, i + n6, n6, n3, n8);
                    Inlines.MatrixSet(nArray, n5, n6, i + n6, n3, n8);
                }
                --n12;
            }
        }
        boxedValueInt.Val = n9;
    }

    static void silk_corrVector(short[] sArray, int n, short[] sArray2, int n2, int n3, int n4, int[] nArray, int n5) {
        int n6 = n + n4 - 1;
        int n7 = n2;
        if (n5 > 0) {
            for (int i = 0; i < n4; ++i) {
                int n8 = 0;
                for (int j = 0; j < n3; ++j) {
                    n8 += Inlines.silk_RSHIFT32(Inlines.silk_SMULBB(sArray[n6 + j], sArray2[n7 + j]), n5);
                }
                nArray[i] = n8;
                --n6;
            }
        } else {
            Inlines.OpusAssert(n5 == 0);
            for (int i = 0; i < n4; ++i) {
                nArray[i] = Inlines.silk_inner_prod(sArray, n6, sArray2, n7, n3);
                --n6;
            }
        }
    }
}

