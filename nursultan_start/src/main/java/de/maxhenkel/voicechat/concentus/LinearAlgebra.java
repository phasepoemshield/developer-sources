/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;

class LinearAlgebra {
    LinearAlgebra() {
    }

    static void silk_solve_LDL(int[] nArray, int n, int n2, int[] nArray2, int[] nArray3) {
        Inlines.OpusAssert((n2 <= 16 ? 1 : 0) != 0);
        int[] nArray4 = new int[n2 * n2];
        int[] nArray5 = new int[16];
        int[] nArray6 = new int[32];
        LinearAlgebra.silk_LDL_factorize(nArray, n, n2, nArray4, nArray6);
        LinearAlgebra.silk_LS_SolveFirst(nArray4, n2, nArray2, nArray5);
        LinearAlgebra.silk_LS_divide_Q16(nArray5, nArray6, n2);
        LinearAlgebra.silk_LS_SolveLast(nArray4, n2, nArray5, nArray3);
    }

    private static void silk_LS_SolveFirst(int[] nArray, int n, int[] nArray2, int[] nArray3) {
        for (int i = 0; i < n; ++i) {
            int n2 = Inlines.MatrixGetPointer((int)i, (int)0, (int)n);
            int n3 = 0;
            for (int j = 0; j < i; ++j) {
                n3 = Inlines.silk_SMLAWW((int)n3, (int)nArray[n2 + j], (int)nArray3[j]);
            }
            nArray3[i] = Inlines.silk_SUB32((int)nArray2[i], (int)n3);
        }
    }

    private static void silk_LDL_factorize(int[] nArray, int n, int n2, int[] nArray2, int[] nArray3) {
        int[] nArray4 = new int[n2];
        int[] nArray5 = new int[n2];
        Inlines.OpusAssert((n2 <= 16 ? 1 : 0) != 0);
        boolean bl = true;
        int n3 = Inlines.silk_max_32((int)Inlines.silk_SMMUL((int)Inlines.silk_ADD_SAT32((int)nArray[n], (int)nArray[n + Inlines.silk_SMULBB((int)n2, (int)n2) - 1]), (int)21475), (int)512);
        block0: for (int i = 0; i < n2 && bl; ++i) {
            bl = false;
            for (int j = 0; j < n2; ++j) {
                int n4;
                int[] nArray6 = nArray2;
                int n5 = Inlines.MatrixGetPointer((int)j, (int)0, (int)n2);
                int n6 = 0;
                for (n4 = 0; n4 < j; ++n4) {
                    nArray4[n4] = Inlines.silk_SMULWW((int)nArray5[n4], (int)nArray6[n5 + n4]);
                    n6 = Inlines.silk_SMLAWW((int)n6, (int)nArray4[n4], (int)nArray6[n5 + n4]);
                }
                n6 = Inlines.silk_SUB32((int)Inlines.MatrixGet((int[])nArray, (int)n, (int)j, (int)j, (int)n2), (int)n6);
                if (n6 < n3) {
                    n6 = Inlines.silk_SUB32((int)Inlines.silk_SMULBB((int)(i + 1), (int)n3), (int)n6);
                    for (n4 = 0; n4 < n2; ++n4) {
                        Inlines.MatrixSet((int[])nArray, (int)n, (int)n4, (int)n4, (int)n2, (int)Inlines.silk_ADD32((int)Inlines.MatrixGet((int[])nArray, (int)n, (int)n4, (int)n4, (int)n2), (int)n6));
                    }
                    bl = true;
                    continue block0;
                }
                nArray5[j] = n6;
                int n7 = Inlines.silk_INVERSE32_varQ((int)n6, (int)36);
                int n8 = Inlines.silk_LSHIFT((int)n7, (int)4);
                int n9 = Inlines.silk_SUB32((int)0x1000000, (int)Inlines.silk_SMULWW((int)n6, (int)n8));
                int n10 = Inlines.silk_SMULWW((int)n9, (int)n8);
                nArray3[j * 2 + 0] = n7;
                nArray3[j * 2 + 1] = n10;
                Inlines.MatrixSet((int[])nArray2, (int)j, (int)j, (int)n2, (int)65536);
                nArray6 = nArray;
                n5 = Inlines.MatrixGetPointer((int)j, (int)0, (int)n2) + n;
                int[] nArray7 = nArray2;
                int n11 = Inlines.MatrixGetPointer((int)(j + 1), (int)0, (int)n2);
                for (n4 = j + 1; n4 < n2; ++n4) {
                    n6 = 0;
                    for (int k = 0; k < j; ++k) {
                        n6 = Inlines.silk_SMLAWW((int)n6, (int)nArray4[k], (int)nArray7[n11 + k]);
                    }
                    n6 = Inlines.silk_SUB32((int)nArray6[n5 + n4], (int)n6);
                    Inlines.MatrixSet((int[])nArray2, (int)n4, (int)j, (int)n2, (int)Inlines.silk_ADD32((int)Inlines.silk_SMMUL((int)n6, (int)n10), (int)Inlines.silk_RSHIFT((int)Inlines.silk_SMULWW((int)n6, (int)n7), (int)4)));
                    n11 += n2;
                }
            }
        }
        Inlines.OpusAssert((!bl ? 1 : 0) != 0);
    }

    private static void silk_LS_SolveLast(int[] nArray, int n, int[] nArray2, int[] nArray3) {
        for (int i = n - 1; i >= 0; --i) {
            int n2 = Inlines.MatrixGetPointer((int)0, (int)i, (int)n);
            int n3 = 0;
            for (int j = n - 1; j > i; --j) {
                n3 = Inlines.silk_SMLAWW((int)n3, (int)nArray[n2 + Inlines.silk_SMULBB((int)j, (int)n)], (int)nArray3[j]);
            }
            nArray3[i] = Inlines.silk_SUB32((int)nArray2[i], (int)n3);
        }
    }

    private static void silk_LS_divide_Q16(int[] nArray, int[] nArray2, int n) {
        for (int i = 0; i < n; ++i) {
            int n2 = nArray2[i * 2 + 0];
            int n3 = nArray2[i * 2 + 1];
            int n4 = nArray[i];
            nArray[i] = Inlines.silk_ADD32((int)Inlines.silk_SMMUL((int)n4, (int)n3), (int)Inlines.silk_RSHIFT((int)Inlines.silk_SMULWW((int)n4, (int)n2), (int)4));
        }
    }
}

