/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.Filters
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.NLSFCodebook;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkTables;
import de.maxhenkel.voicechat.concentus.Sort;

class NLSF {
    private static final int MAX_STABILIZE_LOOPS = 20;
    private static final int QA = 16;
    private static final int BIN_DIV_STEPS_A2NLSF = 3;
    private static final int MAX_ITERATIONS_A2NLSF = 30;
    private static final byte[] ordering16 = new byte[]{0, 15, 8, 7, 4, 11, 12, 3, 2, 13, 10, 5, 6, 9, 14, 1};
    private static final byte[] ordering10 = new byte[]{0, 9, 6, 3, 4, 5, 8, 1, 2, 7};

    NLSF() {
    }

    static void silk_NLSF2A(short[] sArray, short[] sArray2, int n) {
        int n2;
        int n3;
        int[] nArray = new int[n];
        int[] nArray2 = new int[n / 2 + 1];
        int[] nArray3 = new int[n / 2 + 1];
        int[] nArray4 = new int[n];
        int n4 = 0;
        Inlines.OpusAssert((boolean)true);
        Inlines.OpusAssert((n == 10 || n == 16 ? 1 : 0) != 0);
        byte[] byArray = n == 16 ? ordering16 : ordering10;
        for (n3 = 0; n3 < n; ++n3) {
            Inlines.OpusAssert((sArray2[n3] >= 0 ? 1 : 0) != 0);
            int n5 = Inlines.silk_RSHIFT((int)sArray2[n3], (int)8);
            int n6 = sArray2[n3] - Inlines.silk_LSHIFT((int)n5, (int)8);
            Inlines.OpusAssert((n5 >= 0 ? 1 : 0) != 0);
            Inlines.OpusAssert((n5 < 128 ? 1 : 0) != 0);
            short s = SilkTables.silk_LSFCosTab_Q12[n5];
            int n7 = SilkTables.silk_LSFCosTab_Q12[n5 + 1] - s;
            nArray[byArray[n3]] = Inlines.silk_RSHIFT_ROUND((int)(Inlines.silk_LSHIFT((int)s, (int)8) + Inlines.silk_MUL((int)n7, (int)n6)), (int)4);
        }
        int n8 = Inlines.silk_RSHIFT((int)n, (int)1);
        NLSF.silk_NLSF2A_find_poly(nArray2, nArray, 0, n8);
        NLSF.silk_NLSF2A_find_poly(nArray3, nArray, 1, n8);
        for (n3 = 0; n3 < n8; ++n3) {
            int n9 = nArray2[n3 + 1] + nArray2[n3];
            int n10 = nArray3[n3 + 1] - nArray3[n3];
            nArray4[n3] = -n10 - n9;
            nArray4[n - n3 - 1] = n10 - n9;
        }
        for (n2 = 0; n2 < 10; ++n2) {
            int n11 = 0;
            for (n3 = 0; n3 < n; ++n3) {
                int n12 = Inlines.silk_abs((int)nArray4[n3]);
                if (n12 <= n11) continue;
                n11 = n12;
                n4 = n3;
            }
            n11 = Inlines.silk_RSHIFT_ROUND((int)n11, (int)5);
            if (n11 <= Short.MAX_VALUE) break;
            n11 = Inlines.silk_min((int)n11, (int)163838);
            int n13 = 65470 - Inlines.silk_DIV32((int)Inlines.silk_LSHIFT((int)(n11 - Short.MAX_VALUE), (int)14), (int)Inlines.silk_RSHIFT32((int)Inlines.silk_MUL((int)n11, (int)(n4 + 1)), (int)2));
            Filters.silk_bwexpander_32((int[])nArray4, (int)n, (int)n13);
        }
        if (n2 == 10) {
            for (n3 = 0; n3 < n; ++n3) {
                sArray[n3] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)nArray4[n3], (int)5));
                nArray4[n3] = Inlines.silk_LSHIFT((int)sArray[n3], (int)5);
            }
        } else {
            for (n3 = 0; n3 < n; ++n3) {
                sArray[n3] = (short)Inlines.silk_RSHIFT_ROUND((int)nArray4[n3], (int)5);
            }
        }
        for (n2 = 0; n2 < 16 && Filters.silk_LPC_inverse_pred_gain((short[])sArray, (int)n) < 107374; ++n2) {
            Filters.silk_bwexpander_32((int[])nArray4, (int)n, (int)(65536 - Inlines.silk_LSHIFT((int)2, (int)n2)));
            for (n3 = 0; n3 < n; ++n3) {
                sArray[n3] = (short)Inlines.silk_RSHIFT_ROUND((int)nArray4[n3], (int)5);
            }
        }
    }

    static int silk_A2NLSF_eval_poly(int[] nArray, int n, int n2) {
        int n3 = nArray[n2];
        int n4 = Inlines.silk_LSHIFT((int)n, (int)4);
        if (8 == n2) {
            n3 = Inlines.silk_SMLAWW((int)nArray[7], (int)n3, (int)n4);
            n3 = Inlines.silk_SMLAWW((int)nArray[6], (int)n3, (int)n4);
            n3 = Inlines.silk_SMLAWW((int)nArray[5], (int)n3, (int)n4);
            n3 = Inlines.silk_SMLAWW((int)nArray[4], (int)n3, (int)n4);
            n3 = Inlines.silk_SMLAWW((int)nArray[3], (int)n3, (int)n4);
            n3 = Inlines.silk_SMLAWW((int)nArray[2], (int)n3, (int)n4);
            n3 = Inlines.silk_SMLAWW((int)nArray[1], (int)n3, (int)n4);
            n3 = Inlines.silk_SMLAWW((int)nArray[0], (int)n3, (int)n4);
        } else {
            for (int i = n2 - 1; i >= 0; --i) {
                n3 = Inlines.silk_SMLAWW((int)nArray[i], (int)n3, (int)n4);
            }
        }
        return n3;
    }

    static void silk_NLSF_residual_dequant(short[] sArray, byte[] byArray, int n, short[] sArray2, int n2, short s) {
        short s2 = 0;
        for (int i = s - 1; i >= 0; --i) {
            int n3 = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)s2, (int)sArray2[i]), (int)8);
            s2 = Inlines.silk_LSHIFT16((short)byArray[n + i], (int)10);
            if (s2 > 0) {
                s2 = Inlines.silk_SUB16((short)s2, (short)102);
            } else if (s2 < 0) {
                s2 = Inlines.silk_ADD16((short)s2, (short)102);
            }
            sArray[i] = s2 = (short)Inlines.silk_SMLAWB((int)n3, (int)s2, (int)n2);
        }
    }

    static int silk_NLSF_del_dec_quant(byte[] byArray, short[] sArray, short[] sArray2, short[] sArray3, short[] sArray4, short[] sArray5, int n, short s, int n2, short n3) {
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int[] nArray = new int[4];
        byte[][] byArrayArray = new byte[4][];
        for (n8 = 0; n8 < 4; ++n8) {
            byArrayArray[n8] = new byte[16];
        }
        short[] sArray6 = new short[8];
        int[] nArray2 = new int[8];
        int[] nArray3 = new int[4];
        int[] nArray4 = new int[4];
        int[] nArray5 = new int[20];
        int[] nArray6 = new int[20];
        for (n8 = -10; n8 <= 9; ++n8) {
            n7 = Inlines.silk_LSHIFT((int)n8, (int)10);
            n6 = Inlines.silk_ADD16((short)((short)n7), (short)1024);
            if (n8 > 0) {
                n7 = Inlines.silk_SUB16((short)((short)n7), (short)102);
                n6 = Inlines.silk_SUB16((short)((short)n6), (short)102);
            } else if (n8 == 0) {
                n6 = Inlines.silk_SUB16((short)((short)n6), (short)102);
            } else if (n8 == -1) {
                n7 = Inlines.silk_ADD16((short)((short)n7), (short)102);
            } else {
                n7 = Inlines.silk_ADD16((short)((short)n7), (short)102);
                n6 = Inlines.silk_ADD16((short)((short)n6), (short)102);
            }
            nArray5[n8 + 10] = Inlines.silk_SMULWB((int)n7, (int)n);
            nArray6[n8 + 10] = Inlines.silk_SMULWB((int)n6, (int)n);
        }
        Inlines.OpusAssert((boolean)true);
        int n9 = 1;
        nArray2[0] = 0;
        sArray6[0] = 0;
        n8 = n3 - 1;
        while (true) {
            int n10 = Inlines.silk_LSHIFT((int)sArray3[n8], (int)8);
            short s2 = sArray[n8];
            for (n5 = 0; n5 < n9; ++n5) {
                int n11;
                int n12;
                int n13 = Inlines.silk_SMULWB((int)n10, (int)sArray6[n5]);
                short s3 = Inlines.silk_SUB16((short)s2, (short)((short)n13));
                n4 = Inlines.silk_SMULWB((int)s, (int)s3);
                n4 = Inlines.silk_LIMIT((int)n4, (int)-10, (int)9);
                byArrayArray[n5][n8] = (byte)n4;
                int n14 = sArray4[n8] + n4;
                n7 = nArray5[n4 + 10];
                n6 = nArray6[n4 + 10];
                n7 = Inlines.silk_ADD16((short)((short)n7), (short)((short)n13));
                n6 = Inlines.silk_ADD16((short)((short)n6), (short)((short)n13));
                sArray6[n5] = (short)n7;
                sArray6[n5 + n9] = (short)n6;
                if (n4 + 1 >= 4) {
                    if (n4 + 1 == 4) {
                        n12 = sArray5[n14 + 4];
                        n11 = 280;
                    } else {
                        n12 = Inlines.silk_SMLABB((int)108, (int)43, (int)n4);
                        n11 = Inlines.silk_ADD16((short)((short)n12), (short)43);
                    }
                } else if (n4 <= -4) {
                    if (n4 == -4) {
                        n12 = 280;
                        n11 = sArray5[n14 + 1 + 4];
                    } else {
                        n12 = Inlines.silk_SMLABB((int)108, (int)-43, (int)n4);
                        n11 = Inlines.silk_SUB16((short)((short)n12), (short)43);
                    }
                } else {
                    n12 = sArray5[n14 + 4];
                    n11 = sArray5[n14 + 1 + 4];
                }
                int n15 = nArray2[n5];
                short s4 = Inlines.silk_SUB16((short)s2, (short)((short)n7));
                nArray2[n5] = Inlines.silk_SMLABB((int)Inlines.silk_MLA((int)n15, (int)Inlines.silk_SMULBB((int)s4, (int)s4), (int)sArray2[n8]), (int)n2, (int)n12);
                s4 = Inlines.silk_SUB16((short)s2, (short)((short)n6));
                nArray2[n5 + n9] = Inlines.silk_SMLABB((int)Inlines.silk_MLA((int)n15, (int)Inlines.silk_SMULBB((int)s4, (int)s4), (int)sArray2[n8]), (int)n2, (int)n11);
            }
            if (n9 <= 2) {
                for (n5 = 0; n5 < n9; ++n5) {
                    byArrayArray[n5 + n9][n8] = (byte)(byArrayArray[n5][n8] + 1);
                }
                for (n5 = n9 = Inlines.silk_LSHIFT((int)n9, (int)1); n5 < 4; ++n5) {
                    byArrayArray[n5][n8] = byArrayArray[n5 - n9][n8];
                }
            } else {
                if (n8 <= 0) break;
                for (n5 = 0; n5 < 4; ++n5) {
                    if (nArray2[n5] > nArray2[n5 + 4]) {
                        nArray4[n5] = nArray2[n5];
                        nArray3[n5] = nArray2[n5 + 4];
                        nArray2[n5] = nArray3[n5];
                        nArray2[n5 + 4] = nArray4[n5];
                        n7 = sArray6[n5];
                        sArray6[n5] = sArray6[n5 + 4];
                        sArray6[n5 + 4] = (short)n7;
                        nArray[n5] = n5 + 4;
                        continue;
                    }
                    nArray3[n5] = nArray2[n5];
                    nArray4[n5] = nArray2[n5 + 4];
                    nArray[n5] = n5;
                }
                while (true) {
                    int n16 = Integer.MAX_VALUE;
                    int n17 = 0;
                    int n18 = 0;
                    int n19 = 0;
                    for (n5 = 0; n5 < 4; ++n5) {
                        if (n16 > nArray4[n5]) {
                            n16 = nArray4[n5];
                            n18 = n5;
                        }
                        if (n17 >= nArray3[n5]) continue;
                        n17 = nArray3[n5];
                        n19 = n5;
                    }
                    if (n16 >= n17) break;
                    nArray[n19] = nArray[n18] ^ 4;
                    nArray2[n19] = nArray2[n18 + 4];
                    sArray6[n19] = sArray6[n18 + 4];
                    nArray3[n19] = 0;
                    nArray4[n18] = Integer.MAX_VALUE;
                    System.arraycopy(byArrayArray[n18], 0, byArrayArray[n19], 0, n3);
                }
                for (n5 = 0; n5 < 4; ++n5) {
                    byte by = (byte)Inlines.silk_RSHIFT((int)nArray[n5], (int)2);
                    byte[] byArray2 = byArrayArray[n5];
                    int n20 = n8;
                    byArray2[n20] = (byte)(byArray2[n20] + by);
                }
            }
            --n8;
        }
        n4 = 0;
        int n21 = Integer.MAX_VALUE;
        for (n5 = 0; n5 < 8; ++n5) {
            if (n21 <= nArray2[n5]) continue;
            n21 = nArray2[n5];
            n4 = n5;
        }
        for (n5 = 0; n5 < n3; ++n5) {
            byArray[n5] = byArrayArray[n4 & 3][n5];
            Inlines.OpusAssert((byArray[n5] >= -10 ? 1 : 0) != 0);
            Inlines.OpusAssert((byArray[n5] <= 10 ? 1 : 0) != 0);
        }
        byArray[0] = (byte)(byArray[0] + Inlines.silk_RSHIFT((int)n4, (int)2));
        Inlines.OpusAssert((byArray[0] <= 10 ? 1 : 0) != 0);
        Inlines.OpusAssert((n21 >= 0 ? 1 : 0) != 0);
        return n21;
    }

    static void silk_NLSF_stabilize(short[] sArray, short[] sArray2, int n) {
        int n2;
        int n3;
        int n4 = 0;
        Inlines.OpusAssert((sArray2[n] >= 1 ? 1 : 0) != 0);
        for (n3 = 0; n3 < 20; ++n3) {
            int n5;
            int n6;
            int n7 = sArray[0] - sArray2[0];
            n4 = 0;
            for (n2 = 1; n2 <= n - 1; ++n2) {
                n6 = sArray[n2] - (sArray[n2 - 1] + sArray2[n2]);
                if (n6 >= n7) continue;
                n7 = n6;
                n4 = n2;
            }
            n6 = 32768 - (sArray[n - 1] + sArray2[n]);
            if (n6 < n7) {
                n7 = n6;
                n4 = n;
            }
            if (n7 >= 0) {
                return;
            }
            if (n4 == 0) {
                sArray[0] = sArray2[0];
                continue;
            }
            if (n4 == n) {
                sArray[n - 1] = (short)(32768 - sArray2[n]);
                continue;
            }
            int n8 = 0;
            for (n5 = 0; n5 < n4; ++n5) {
                n8 += sArray2[n5];
            }
            n8 += Inlines.silk_RSHIFT((int)sArray2[n4], (int)1);
            int n9 = 32768;
            for (n5 = n; n5 > n4; --n5) {
                n9 -= sArray2[n5];
            }
            short s = (short)Inlines.silk_LIMIT_32((int)Inlines.silk_RSHIFT_ROUND((int)(sArray[n4 - 1] + sArray[n4]), (int)1), (int)n8, (int)(n9 -= Inlines.silk_RSHIFT((int)sArray2[n4], (int)1)));
            sArray[n4 - 1] = (short)(s - Inlines.silk_RSHIFT((int)sArray2[n4], (int)1));
            sArray[n4] = (short)(sArray[n4 - 1] + sArray2[n4]);
        }
        if (n3 == 20) {
            Sort.silk_insertion_sort_increasing_all_values_int16(sArray, n);
            sArray[0] = (short)Inlines.silk_max_int((int)sArray[0], (int)sArray2[0]);
            for (n2 = 1; n2 < n; ++n2) {
                sArray[n2] = (short)Inlines.silk_max_int((int)sArray[n2], (int)(sArray[n2 - 1] + sArray2[n2]));
            }
            sArray[n - 1] = (short)Inlines.silk_min_int((int)sArray[n - 1], (int)(32768 - sArray2[n]));
            for (n2 = n - 2; n2 >= 0; --n2) {
                sArray[n2] = (short)Inlines.silk_min_int((int)sArray[n2], (int)(sArray[n2 + 1] - sArray2[n2 + 1]));
            }
        }
    }

    static void silk_NLSF2A_find_poly(int[] nArray, int[] nArray2, int n, int n2) {
        nArray[0] = Inlines.silk_LSHIFT((int)1, (int)16);
        nArray[1] = 0 - nArray2[n];
        for (int i = 1; i < n2; ++i) {
            int n3 = nArray2[n + 2 * i];
            nArray[i + 1] = Inlines.silk_LSHIFT((int)nArray[i - 1], (int)1) - (int)Inlines.silk_RSHIFT_ROUND64((long)Inlines.silk_SMULL((int)n3, (int)nArray[i]), (int)16);
            for (int j = i; j > 1; --j) {
                int n4 = j;
                nArray[n4] = nArray[n4] + (nArray[j - 2] - (int)Inlines.silk_RSHIFT_ROUND64((long)Inlines.silk_SMULL((int)n3, (int)nArray[j - 1]), (int)16));
            }
            nArray[1] = nArray[1] - n3;
        }
    }

    static void silk_A2NLSF_trans_poly(int[] nArray, int n) {
        for (int i = 2; i <= n; ++i) {
            for (int j = n; j > i; --j) {
                int n2 = j - 2;
                nArray[n2] = nArray[n2] - nArray[j];
            }
            int n3 = i - 2;
            nArray[n3] = nArray[n3] - Inlines.silk_LSHIFT((int)nArray[i], (int)1);
        }
    }

    static void silk_NLSF_VQ_weights_laroia(short[] sArray, short[] sArray2, int n) {
        Inlines.OpusAssert((sArray != null ? 1 : 0) != 0);
        Inlines.OpusAssert((n > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert(((n & 1) == 0 ? 1 : 0) != 0);
        int n2 = Inlines.silk_max_int((int)sArray2[0], (int)1);
        n2 = Inlines.silk_DIV32((int)131072, (int)n2);
        int n3 = Inlines.silk_max_int((int)(sArray2[1] - sArray2[0]), (int)1);
        n3 = Inlines.silk_DIV32((int)131072, (int)n3);
        sArray[0] = (short)Inlines.silk_min_int((int)(n2 + n3), (int)Short.MAX_VALUE);
        Inlines.OpusAssert((sArray[0] > 0 ? 1 : 0) != 0);
        for (int i = 1; i < n - 1; i += 2) {
            n2 = Inlines.silk_max_int((int)(sArray2[i + 1] - sArray2[i]), (int)1);
            n2 = Inlines.silk_DIV32((int)131072, (int)n2);
            sArray[i] = (short)Inlines.silk_min_int((int)(n2 + n3), (int)Short.MAX_VALUE);
            Inlines.OpusAssert((sArray[i] > 0 ? 1 : 0) != 0);
            n3 = Inlines.silk_max_int((int)(sArray2[i + 2] - sArray2[i + 1]), (int)1);
            n3 = Inlines.silk_DIV32((int)131072, (int)n3);
            sArray[i + 1] = (short)Inlines.silk_min_int((int)(n2 + n3), (int)Short.MAX_VALUE);
            Inlines.OpusAssert((sArray[i + 1] > 0 ? 1 : 0) != 0);
        }
        n2 = Inlines.silk_max_int((int)(32768 - sArray2[n - 1]), (int)1);
        n2 = Inlines.silk_DIV32((int)131072, (int)n2);
        sArray[n - 1] = (short)Inlines.silk_min_int((int)(n2 + n3), (int)Short.MAX_VALUE);
        Inlines.OpusAssert((sArray[n - 1] > 0 ? 1 : 0) != 0);
    }

    static void silk_NLSF_unpack(short[] sArray, short[] sArray2, NLSFCodebook nLSFCodebook, int n) {
        short[] sArray3 = nLSFCodebook.ec_sel;
        int n2 = n * nLSFCodebook.order / 2;
        for (int i = 0; i < nLSFCodebook.order; i += 2) {
            short s = sArray3[n2];
            ++n2;
            sArray[i] = (short)Inlines.silk_SMULBB((int)(Inlines.silk_RSHIFT((int)s, (int)1) & 7), (int)9);
            sArray2[i] = nLSFCodebook.pred_Q8[i + (s & 1) * (nLSFCodebook.order - 1)];
            sArray[i + 1] = (short)Inlines.silk_SMULBB((int)(Inlines.silk_RSHIFT((int)s, (int)5) & 7), (int)9);
            sArray2[i + 1] = nLSFCodebook.pred_Q8[i + (Inlines.silk_RSHIFT((int)s, (int)4) & 1) * (nLSFCodebook.order - 1) + 1];
        }
    }

    static void silk_NLSF_decode(short[] sArray, byte[] byArray, NLSFCodebook nLSFCodebook) {
        int n;
        short[] sArray2 = new short[nLSFCodebook.order];
        short[] sArray3 = new short[nLSFCodebook.order];
        short[] sArray4 = new short[nLSFCodebook.order];
        short[] sArray5 = new short[nLSFCodebook.order];
        short[] sArray6 = nLSFCodebook.CB1_NLSF_Q8;
        int n2 = byArray[0] * nLSFCodebook.order;
        for (n = 0; n < nLSFCodebook.order; ++n) {
            sArray[n] = Inlines.silk_LSHIFT16((short)sArray6[n2 + n], (int)7);
        }
        NLSF.silk_NLSF_unpack(sArray3, sArray2, nLSFCodebook, byArray[0]);
        NLSF.silk_NLSF_residual_dequant(sArray4, byArray, 1, sArray2, nLSFCodebook.quantStepSize_Q16, nLSFCodebook.order);
        NLSF.silk_NLSF_VQ_weights_laroia(sArray5, sArray, nLSFCodebook.order);
        for (n = 0; n < nLSFCodebook.order; ++n) {
            int n3 = Inlines.silk_SQRT_APPROX((int)Inlines.silk_LSHIFT((int)sArray5[n], (int)16));
            int n4 = Inlines.silk_ADD32((int)sArray[n], (int)Inlines.silk_DIV32_16((int)Inlines.silk_LSHIFT((int)sArray4[n], (int)14), (int)((short)n3)));
            sArray[n] = (short)Inlines.silk_LIMIT((int)n4, (int)0, (int)Short.MAX_VALUE);
        }
        NLSF.silk_NLSF_stabilize(sArray, nLSFCodebook.deltaMin_Q15, nLSFCodebook.order);
    }

    static void silk_A2NLSF(short[] sArray, int[] nArray, int n) {
        int n2;
        int[] nArray2 = new int[9];
        int[] nArray3 = new int[9];
        int[][] nArrayArray = new int[][]{nArray2, nArray3};
        int n3 = Inlines.silk_RSHIFT((int)n, (int)1);
        NLSF.silk_A2NLSF_init(nArray, nArray2, nArray3, n3);
        int[] nArray4 = nArray2;
        int n4 = SilkTables.silk_LSFCosTab_Q12[0];
        int n5 = NLSF.silk_A2NLSF_eval_poly(nArray4, n4, n3);
        if (n5 < 0) {
            sArray[0] = 0;
            nArray4 = nArray3;
            n5 = NLSF.silk_A2NLSF_eval_poly(nArray4, n4, n3);
            n2 = 1;
        } else {
            n2 = 0;
        }
        int n6 = 1;
        int n7 = 0;
        int n8 = 0;
        while (true) {
            int n9 = SilkTables.silk_LSFCosTab_Q12[n6];
            int n10 = NLSF.silk_A2NLSF_eval_poly(nArray4, n9, n3);
            if (n5 <= 0 && n10 >= n8 || n5 >= 0 && n10 <= -n8) {
                n8 = n10 == 0 ? 1 : 0;
                int n11 = -256;
                for (int i = 0; i < 3; ++i) {
                    int n12 = Inlines.silk_RSHIFT_ROUND((int)(n4 + n9), (int)1);
                    int n13 = NLSF.silk_A2NLSF_eval_poly(nArray4, n12, n3);
                    if (n5 <= 0 && n13 >= 0 || n5 >= 0 && n13 <= 0) {
                        n9 = n12;
                        n10 = n13;
                        continue;
                    }
                    n4 = n12;
                    n5 = n13;
                    n11 = Inlines.silk_ADD_RSHIFT((int)n11, (int)128, (int)i);
                }
                if (Inlines.silk_abs((int)n5) < 65536) {
                    int n14 = n5 - n10;
                    int n15 = Inlines.silk_LSHIFT((int)n5, (int)5) + Inlines.silk_RSHIFT((int)n14, (int)1);
                    if (n14 != 0) {
                        n11 += Inlines.silk_DIV32((int)n15, (int)n14);
                    }
                } else {
                    n11 += Inlines.silk_DIV32((int)n5, (int)Inlines.silk_RSHIFT((int)(n5 - n10), (int)5));
                }
                sArray[n2] = (short)Inlines.silk_min_32((int)(Inlines.silk_LSHIFT((int)n6, (int)8) + n11), (int)Short.MAX_VALUE);
                Inlines.OpusAssert((sArray[n2] >= 0 ? 1 : 0) != 0);
                if (++n2 >= n) break;
                nArray4 = nArrayArray[n2 & 1];
                n4 = SilkTables.silk_LSFCosTab_Q12[n6 - 1];
                n5 = Inlines.silk_LSHIFT((int)(1 - (n2 & 2)), (int)12);
                continue;
            }
            ++n6;
            n4 = n9;
            n5 = n10;
            n8 = 0;
            if (n6 <= 128) continue;
            if (++n7 > 30) {
                sArray[0] = (short)Inlines.silk_DIV32_16((int)32768, (int)((short)(n + 1)));
                for (n6 = 1; n6 < n; ++n6) {
                    sArray[n6] = (short)Inlines.silk_SMULBB((int)(n6 + 1), (int)sArray[0]);
                }
                return;
            }
            Filters.silk_bwexpander_32((int[])nArray, (int)n, (int)(65536 - Inlines.silk_SMULBB((int)(10 + n7), (int)n7)));
            NLSF.silk_A2NLSF_init(nArray, nArray2, nArray3, n3);
            nArray4 = nArray2;
            n4 = SilkTables.silk_LSFCosTab_Q12[0];
            n5 = NLSF.silk_A2NLSF_eval_poly(nArray4, n4, n3);
            if (n5 < 0) {
                sArray[0] = 0;
                nArray4 = nArray3;
                n5 = NLSF.silk_A2NLSF_eval_poly(nArray4, n4, n3);
                n2 = 1;
            } else {
                n2 = 0;
            }
            n6 = 1;
        }
    }

    static void silk_process_NLSFs(SilkChannelEncoder silkChannelEncoder, short[][] sArray, short[] sArray2, short[] sArray3) {
        boolean bl;
        short[] sArray4 = new short[16];
        short[] sArray5 = new short[16];
        short[] sArray6 = new short[16];
        Inlines.OpusAssert((silkChannelEncoder.speech_activity_Q8 >= 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((silkChannelEncoder.speech_activity_Q8 <= 256 ? 1 : 0) != 0);
        Inlines.OpusAssert((silkChannelEncoder.useInterpolatedNLSFs == 1 || silkChannelEncoder.indices.NLSFInterpCoef_Q2 == 4 ? 1 : 0) != 0);
        int n = Inlines.silk_SMLAWB((int)3146, (int)-268434, (int)silkChannelEncoder.speech_activity_Q8);
        if (silkChannelEncoder.nb_subfr == 2) {
            n = Inlines.silk_ADD_RSHIFT((int)n, (int)n, (int)1);
        }
        Inlines.OpusAssert((n > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n <= 5243 ? 1 : 0) != 0);
        NLSF.silk_NLSF_VQ_weights_laroia(sArray5, sArray2, silkChannelEncoder.predictLPCOrder);
        boolean bl2 = bl = silkChannelEncoder.useInterpolatedNLSFs == 1 && silkChannelEncoder.indices.NLSFInterpCoef_Q2 < 4;
        if (bl) {
            Inlines.silk_interpolate((short[])sArray4, (short[])sArray3, (short[])sArray2, (int)silkChannelEncoder.indices.NLSFInterpCoef_Q2, (int)silkChannelEncoder.predictLPCOrder);
            NLSF.silk_NLSF_VQ_weights_laroia(sArray6, sArray4, silkChannelEncoder.predictLPCOrder);
            int n2 = Inlines.silk_LSHIFT((int)Inlines.silk_SMULBB((int)silkChannelEncoder.indices.NLSFInterpCoef_Q2, (int)silkChannelEncoder.indices.NLSFInterpCoef_Q2), (int)11);
            for (int i = 0; i < silkChannelEncoder.predictLPCOrder; ++i) {
                sArray5[i] = (short)Inlines.silk_SMLAWB((int)Inlines.silk_RSHIFT((int)sArray5[i], (int)1), (int)sArray6[i], (int)n2);
                Inlines.OpusAssert((sArray5[i] >= 1 ? 1 : 0) != 0);
            }
        }
        NLSF.silk_NLSF_encode(silkChannelEncoder.indices.NLSFIndices, sArray2, silkChannelEncoder.psNLSF_CB, sArray5, n, silkChannelEncoder.NLSF_MSVQ_Survivors, silkChannelEncoder.indices.signalType);
        NLSF.silk_NLSF2A(sArray[1], sArray2, silkChannelEncoder.predictLPCOrder);
        if (bl) {
            Inlines.silk_interpolate((short[])sArray4, (short[])sArray3, (short[])sArray2, (int)silkChannelEncoder.indices.NLSFInterpCoef_Q2, (int)silkChannelEncoder.predictLPCOrder);
            NLSF.silk_NLSF2A(sArray[0], sArray4, silkChannelEncoder.predictLPCOrder);
        } else {
            System.arraycopy(sArray[1], 0, sArray[0], 0, silkChannelEncoder.predictLPCOrder);
        }
    }

    static void silk_NLSF_VQ(int[] nArray, short[] sArray, short[] sArray2, int n, int n2) {
        int n3 = 0;
        Inlines.OpusAssert((nArray != null ? 1 : 0) != 0);
        Inlines.OpusAssert((n2 <= 16 ? 1 : 0) != 0);
        Inlines.OpusAssert(((n2 & 1) == 0 ? 1 : 0) != 0);
        for (int i = 0; i < n; ++i) {
            int n4 = 0;
            for (int j = 0; j < n2; j += 2) {
                int n5 = Inlines.silk_SUB_LSHIFT32((int)sArray[j], (int)sArray2[n3++], (int)7);
                int n6 = Inlines.silk_SMULBB((int)n5, (int)n5);
                Inlines.OpusAssert(((n4 = Inlines.silk_ADD_RSHIFT32((int)n4, (int)(n6 = Inlines.silk_SMLABB((int)n6, (int)(n5 = Inlines.silk_SUB_LSHIFT32((int)sArray[j + 1], (int)sArray2[n3++], (int)7)), (int)n5)), (int)4)) >= 0 ? 1 : 0) != 0);
                Inlines.OpusAssert((n6 >= 0 ? 1 : 0) != 0);
            }
            nArray[i] = n4;
        }
    }

    static int silk_NLSF_encode(byte[] byArray, short[] sArray, NLSFCodebook nLSFCodebook, short[] sArray2, int n, int n2, int n3) {
        short[] sArray3 = new short[nLSFCodebook.order];
        short[] sArray4 = new short[nLSFCodebook.order];
        short[] sArray5 = new short[nLSFCodebook.order];
        short[] sArray6 = new short[nLSFCodebook.order];
        short[] sArray7 = new short[nLSFCodebook.order];
        short[] sArray8 = new short[nLSFCodebook.order];
        short[] sArray9 = new short[nLSFCodebook.order];
        short[] sArray10 = nLSFCodebook.CB1_NLSF_Q8;
        Inlines.OpusAssert((n2 <= 32 ? 1 : 0) != 0);
        Inlines.OpusAssert((n3 >= 0 && n3 <= 2 ? 1 : 0) != 0);
        Inlines.OpusAssert((n <= Short.MAX_VALUE && n >= 0 ? 1 : 0) != 0);
        NLSF.silk_NLSF_stabilize(sArray, nLSFCodebook.deltaMin_Q15, nLSFCodebook.order);
        int[] nArray = new int[nLSFCodebook.nVectors];
        NLSF.silk_NLSF_VQ(nArray, sArray, nLSFCodebook.CB1_NLSF_Q8, nLSFCodebook.nVectors, nLSFCodebook.order);
        int[] nArray2 = new int[n2];
        Sort.silk_insertion_sort_increasing(nArray, nArray2, nLSFCodebook.nVectors, n2);
        int[] nArray3 = new int[n2];
        byte[][] byArray2 = Arrays.InitTwoDimensionalArrayByte((int)n2, (int)16);
        for (int i = 0; i < n2; ++i) {
            int n4;
            int n5 = nArray2[i];
            int n6 = n5 * nLSFCodebook.order;
            for (n4 = 0; n4 < nLSFCodebook.order; ++n4) {
                sArray5[n4] = Inlines.silk_LSHIFT16((short)sArray10[n6 + n4], (int)7);
                sArray3[n4] = (short)(sArray[n4] - sArray5[n4]);
            }
            NLSF.silk_NLSF_VQ_weights_laroia(sArray6, sArray5, nLSFCodebook.order);
            for (n4 = 0; n4 < nLSFCodebook.order; ++n4) {
                int n7 = Inlines.silk_SQRT_APPROX((int)Inlines.silk_LSHIFT((int)sArray6[n4], (int)16));
                sArray4[n4] = (short)Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)sArray3[n4], (int)n7), (int)14);
            }
            for (n4 = 0; n4 < nLSFCodebook.order; ++n4) {
                sArray7[n4] = (short)Inlines.silk_DIV32_16((int)Inlines.silk_LSHIFT((int)sArray2[n4], (int)5), (int)sArray6[n4]);
            }
            NLSF.silk_NLSF_unpack(sArray9, sArray8, nLSFCodebook, n5);
            nArray3[i] = NLSF.silk_NLSF_del_dec_quant(byArray2[i], sArray4, sArray7, sArray8, sArray9, nLSFCodebook.ec_Rates_Q5, nLSFCodebook.quantStepSize_Q16, nLSFCodebook.invQuantStepSize_Q6, n, nLSFCodebook.order);
            int n8 = (n3 >> 1) * nLSFCodebook.nVectors;
            int n9 = n5 == 0 ? 256 - nLSFCodebook.CB1_iCDF[n8 + n5] : nLSFCodebook.CB1_iCDF[n8 + n5 - 1] - nLSFCodebook.CB1_iCDF[n8 + n5];
            int n10 = 1024 - Inlines.silk_lin2log((int)n9);
            nArray3[i] = Inlines.silk_SMLABB((int)nArray3[i], (int)n10, (int)Inlines.silk_RSHIFT((int)n, (int)2));
        }
        int[] nArray4 = new int[1];
        Sort.silk_insertion_sort_increasing(nArray3, nArray4, n2, 1);
        byArray[0] = (byte)nArray2[nArray4[0]];
        System.arraycopy(byArray2[nArray4[0]], 0, byArray, 1, nLSFCodebook.order);
        NLSF.silk_NLSF_decode(sArray, byArray, nLSFCodebook);
        return nArray3[0];
    }

    static void silk_A2NLSF_init(int[] nArray, int[] nArray2, int[] nArray3, int n) {
        int n2;
        nArray2[n] = Inlines.silk_LSHIFT((int)1, (int)16);
        nArray3[n] = Inlines.silk_LSHIFT((int)1, (int)16);
        for (n2 = 0; n2 < n; ++n2) {
            nArray2[n2] = -nArray[n - n2 - 1] - nArray[n + n2];
            nArray3[n2] = -nArray[n - n2 - 1] + nArray[n + n2];
        }
        for (n2 = n; n2 > 0; --n2) {
            int n3 = n2 - 1;
            nArray2[n3] = nArray2[n3] - nArray2[n2];
            int n4 = n2 - 1;
            nArray3[n4] = nArray3[n4] + nArray3[n2];
        }
        NLSF.silk_A2NLSF_trans_poly(nArray2, n);
        NLSF.silk_A2NLSF_trans_poly(nArray3, n);
    }
}

