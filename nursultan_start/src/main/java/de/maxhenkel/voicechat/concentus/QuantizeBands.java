/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.CeltMode
 *  de.maxhenkel.voicechat.concentus.CeltTables
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.CeltTables;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Laplace;

class QuantizeBands {
    private static final int[] pred_coef;
    private static final int[] beta_coef;
    private static final int beta_intra = 4915;
    private static short[] small_energy_icdf;

    QuantizeBands() {
    }

    static {
        int[] nArray = new int[4];
        nArray[0] = 29440;
        nArray[1] = 26112;
        nArray[2] = 21248;
        nArray[3] = 16384;
        pred_coef = nArray;
        int[] nArray2 = new int[4];
        nArray2[0] = 30147;
        nArray2[1] = 22282;
        nArray2[2] = 12124;
        nArray2[3] = 6554;
        beta_coef = nArray2;
        small_energy_icdf = new short[]{2, 1, 0};
    }

    static int quant_coarse_energy_impl(CeltMode celtMode, int n, int n2, int[][] nArray, int[][] nArray2, int n3, int n4, short[] sArray, int[][] nArray3, EntropyCoder entropyCoder, int n5, int n6, int n7, int n8, int n9) {
        int n10;
        int n11;
        int n12 = 0;
        int[] nArray4 = new int[]{0, 0};
        if (n4 + 3 <= n3) {
            entropyCoder.enc_bit_logp(n7, 3);
        }
        if (n7 != 0) {
            n11 = 0;
            n10 = 4915;
        } else {
            n10 = beta_coef[n6];
            n11 = pred_coef[n6];
        }
        for (int i = n; i < n2; ++i) {
            int n13 = 0;
            do {
                int n14 = nArray[n13][i];
                int n15 = Inlines.MAX16((int)-9216, (int)nArray2[n13][i]);
                int n16 = Inlines.SHL32((int)Inlines.EXTEND32((int)n14), (int)7) - Inlines.PSHR32((int)Inlines.MULT16_16((int)n11, (int)n15), (int)8) - nArray4[n13];
                int n17 = n16 + 65536 >> 17;
                short s = Inlines.EXTRACT16((int)Inlines.MAX32((int)-28672, (int)Inlines.SUB32((int)nArray2[n13][i], (int)n8)));
                if (n17 < 0 && n14 < s && (n17 += Inlines.SHR16((int)Inlines.SUB16((int)s, (int)n14), (int)10)) > 0) {
                    n17 = 0;
                }
                int n18 = n17;
                n4 = entropyCoder.tell();
                int n19 = n3 - n4 - 3 * n5 * (n2 - i);
                if (i != n && n19 < 30) {
                    if (n19 < 24) {
                        n17 = Inlines.IMIN((int)1, (int)n17);
                    }
                    if (n19 < 16) {
                        n17 = Inlines.IMAX((int)-1, (int)n17);
                    }
                }
                if (n9 != 0 && i >= 2) {
                    n17 = Inlines.IMIN((int)n17, (int)0);
                }
                if (n3 - n4 >= 15) {
                    int n20 = 2 * Inlines.IMIN((int)i, (int)20);
                    BoxedValueInt boxedValueInt = new BoxedValueInt(n17);
                    Laplace.ec_laplace_encode(entropyCoder, boxedValueInt, sArray[n20] << 7, sArray[n20 + 1] << 6);
                    n17 = boxedValueInt.Val;
                } else if (n3 - n4 >= 2) {
                    entropyCoder.enc_icdf(2 * n17 ^ 0 - ((n17 = Inlines.IMAX((int)-1, (int)Inlines.IMIN((int)n17, (int)1))) < 0 ? 1 : 0), small_energy_icdf, 2);
                } else if (n3 - n4 >= 1) {
                    n17 = Inlines.IMIN((int)0, (int)n17);
                    entropyCoder.enc_bit_logp(-n17, 1);
                } else {
                    n17 = -1;
                }
                nArray3[n13][i] = Inlines.PSHR32((int)n16, (int)7) - Inlines.SHL16((int)n17, (int)10);
                n12 += Inlines.abs((int)(n18 - n17));
                int n21 = Inlines.SHL32((int)n17, (int)10);
                int n22 = Inlines.PSHR32((int)Inlines.MULT16_16((int)n11, (int)n15), (int)8) + nArray4[n13] + Inlines.SHL32((int)n21, (int)7);
                n22 = Inlines.MAX32((int)-3670016, (int)n22);
                nArray2[n13][i] = Inlines.PSHR32((int)n22, (int)7);
                nArray4[n13] = nArray4[n13] + Inlines.SHL32((int)n21, (int)7) - Inlines.MULT16_16((int)n10, (int)Inlines.PSHR32((int)n21, (int)8));
            } while (++n13 < n5);
        }
        return n9 != 0 ? 0 : n12;
    }

    static int loss_distortion(int[][] nArray, int[][] nArray2, int n, int n2, int n3, int n4) {
        int n5 = 0;
        int n6 = 0;
        do {
            for (int i = n; i < n2; ++i) {
                int n7 = Inlines.SUB16((int)Inlines.SHR16((int)nArray[n6][i], (int)3), (int)Inlines.SHR16((int)nArray2[n6][i], (int)3));
                n5 = Inlines.MAC16_16((int)n5, (int)n7, (int)n7);
            }
        } while (++n6 < n4);
        return Inlines.MIN32((int)200, (int)Inlines.SHR32((int)n5, (int)14));
    }

    static void unquant_fine_energy(CeltMode celtMode, int n, int n2, int[] nArray, int[] nArray2, EntropyCoder entropyCoder, int n3) {
        for (int i = n; i < n2; ++i) {
            if (nArray2[i] <= 0) continue;
            int n4 = 0;
            do {
                int n5 = entropyCoder.dec_bits(nArray2[i]);
                int n6 = Inlines.SUB16((int)Inlines.SHR32((int)(Inlines.SHL32((int)n5, (int)10) + 512), (int)nArray2[i]), (int)512);
                int n7 = i + n4 * celtMode.nbEBands;
                nArray[n7] = nArray[n7] + n6;
            } while (++n4 < n3);
        }
    }

    static void quant_energy_finalise(CeltMode celtMode, int n, int n2, int[][] nArray, int[][] nArray2, int[] nArray3, int[] nArray4, int n3, EntropyCoder entropyCoder, int n4) {
        for (int i = 0; i < 2; ++i) {
            for (int j = n; j < n2 && n3 >= n4; ++j) {
                if (nArray3[j] >= 8 || nArray4[j] != i) continue;
                int n5 = 0;
                do {
                    int n6 = nArray2[n5][j] < 0 ? 0 : 1;
                    entropyCoder.enc_bits((long)n6, 1);
                    int n7 = Inlines.SHR16((int)(Inlines.SHL16((int)n6, (int)10) - 512), (int)(nArray3[j] + 1));
                    int[] nArray5 = nArray[n5];
                    int n8 = j;
                    nArray5[n8] = nArray5[n8] + n7;
                    --n3;
                } while (++n5 < n4);
            }
        }
    }

    static void unquant_energy_finalise(CeltMode celtMode, int n, int n2, int[] nArray, int[] nArray2, int[] nArray3, int n3, EntropyCoder entropyCoder, int n4) {
        for (int i = 0; i < 2; ++i) {
            for (int j = n; j < n2 && n3 >= n4; ++j) {
                if (nArray2[j] >= 8 || nArray3[j] != i) continue;
                int n5 = 0;
                do {
                    int n6 = entropyCoder.dec_bits(1);
                    int n7 = Inlines.SHR16((int)(Inlines.SHL16((int)n6, (int)10) - 512), (int)(nArray2[j] + 1));
                    int n8 = j + n5 * celtMode.nbEBands;
                    nArray[n8] = nArray[n8] + n7;
                    --n3;
                } while (++n5 < n4);
            }
        }
    }

    static void quant_coarse_energy(CeltMode celtMode, int n, int n2, int n3, int[][] nArray, int[][] nArray2, int n4, int[][] nArray3, EntropyCoder entropyCoder, int n5, int n6, int n7, int n8, BoxedValueInt boxedValueInt, int n9, int n10, int n11) {
        EntropyCoder entropyCoder2 = new EntropyCoder();
        int n12 = 0;
        int n13 = n8 != 0 || n9 == 0 && boxedValueInt.Val > 2 * n5 * (n2 - n) && n7 > (n2 - n) * n5 ? 1 : 0;
        int n14 = n4 * boxedValueInt.Val * n10 / (n5 * 512);
        int n15 = QuantizeBands.loss_distortion(nArray, nArray2, n, n3, celtMode.nbEBands, n5);
        int n16 = entropyCoder.tell();
        if (n16 + 3 > n4) {
            n13 = 0;
            n9 = 0;
        }
        int n17 = 16384;
        if (n2 - n > 10) {
            n17 = Inlines.MIN32((int)n17, (int)Inlines.SHL32((int)n7, (int)7));
        }
        if (n11 != 0) {
            n17 = 3072;
        }
        entropyCoder2.Assign(entropyCoder);
        int[][] nArray4 = Arrays.InitTwoDimensionalArrayInt((int)n5, (int)celtMode.nbEBands);
        int[][] nArray5 = Arrays.InitTwoDimensionalArrayInt((int)n5, (int)celtMode.nbEBands);
        System.arraycopy(nArray2[0], 0, nArray4[0], 0, celtMode.nbEBands);
        if (n5 == 2) {
            System.arraycopy(nArray2[1], 0, nArray4[1], 0, celtMode.nbEBands);
        }
        if (n9 != 0 || n13 != 0) {
            n12 = QuantizeBands.quant_coarse_energy_impl(celtMode, n, n2, nArray, nArray4, n4, n16, CeltTables.e_prob_model[n6][1], nArray5, entropyCoder, n5, n6, 1, n17, n11);
        }
        if (n13 == 0) {
            EntropyCoder entropyCoder3 = new EntropyCoder();
            byte[] byArray = null;
            int n18 = entropyCoder.tell_frac();
            entropyCoder3.Assign(entropyCoder);
            int n19 = entropyCoder2.range_bytes();
            int n20 = entropyCoder3.range_bytes();
            int n21 = n19;
            int n22 = n20 - n19;
            if (n22 != 0) {
                byArray = new byte[n22];
                System.arraycopy(entropyCoder3.get_buffer(), n21, byArray, 0, n22);
            }
            entropyCoder.Assign(entropyCoder2);
            int n23 = QuantizeBands.quant_coarse_energy_impl(celtMode, n, n2, nArray, nArray2, n4, n16, CeltTables.e_prob_model[n6][n13], nArray3, entropyCoder, n5, n6, 0, n17, n11);
            if (n9 != 0 && (n12 < n23 || n12 == n23 && entropyCoder.tell_frac() + n14 > n18)) {
                entropyCoder.Assign(entropyCoder3);
                if (byArray != null) {
                    entropyCoder3.write_buffer(byArray, 0, n21, n20 - n19);
                }
                System.arraycopy(nArray4[0], 0, nArray2[0], 0, celtMode.nbEBands);
                System.arraycopy(nArray5[0], 0, nArray3[0], 0, celtMode.nbEBands);
                if (n5 == 2) {
                    System.arraycopy(nArray4[1], 0, nArray2[1], 0, celtMode.nbEBands);
                    System.arraycopy(nArray5[1], 0, nArray3[1], 0, celtMode.nbEBands);
                }
                n13 = 1;
            }
        } else {
            System.arraycopy(nArray4[0], 0, nArray2[0], 0, celtMode.nbEBands);
            System.arraycopy(nArray5[0], 0, nArray3[0], 0, celtMode.nbEBands);
            if (n5 == 2) {
                System.arraycopy(nArray4[1], 0, nArray2[1], 0, celtMode.nbEBands);
                System.arraycopy(nArray5[1], 0, nArray3[1], 0, celtMode.nbEBands);
            }
        }
        boxedValueInt.Val = n13 != 0 ? n15 : Inlines.ADD32((int)Inlines.MULT16_32_Q15((int)Inlines.MULT16_16_Q15((int)pred_coef[n6], (int)pred_coef[n6]), (int)boxedValueInt.Val), (int)n15);
    }

    static void unquant_coarse_energy(CeltMode celtMode, int n, int n2, int[] nArray, int n3, EntropyCoder entropyCoder, int n4, int n5) {
        int n6;
        int n7;
        short[] sArray = CeltTables.e_prob_model[n5][n3];
        int[] nArray2 = new int[]{0, 0};
        if (n3 != 0) {
            n7 = 0;
            n6 = 4915;
        } else {
            n6 = beta_coef[n5];
            n7 = pred_coef[n5];
        }
        int n8 = entropyCoder.storage * 8;
        for (int i = n; i < n2; ++i) {
            int n9 = 0;
            do {
                int n10;
                Inlines.OpusAssert((n9 < 2 ? 1 : 0) != 0);
                int n11 = entropyCoder.tell();
                if (n8 - n11 >= 15) {
                    int n12 = 2 * Inlines.IMIN((int)i, (int)20);
                    n10 = Laplace.ec_laplace_decode(entropyCoder, sArray[n12] << 7, sArray[n12 + 1] << 6);
                } else if (n8 - n11 >= 2) {
                    n10 = entropyCoder.dec_icdf(small_energy_icdf, 2);
                    n10 = n10 >> 1 ^ -(n10 & 1);
                } else {
                    n10 = n8 - n11 >= 1 ? 0 - entropyCoder.dec_bit_logp(1L) : -1;
                }
                int n13 = Inlines.SHL32((int)n10, (int)10);
                nArray[i + n9 * celtMode.nbEBands] = Inlines.MAX16((int)-9216, (int)nArray[i + n9 * celtMode.nbEBands]);
                int n14 = Inlines.PSHR32((int)Inlines.MULT16_16((int)n7, (int)nArray[i + n9 * celtMode.nbEBands]), (int)8) + nArray2[n9] + Inlines.SHL32((int)n13, (int)7);
                n14 = Inlines.MAX32((int)-3670016, (int)n14);
                nArray[i + n9 * celtMode.nbEBands] = Inlines.PSHR32((int)n14, (int)7);
                nArray2[n9] = nArray2[n9] + Inlines.SHL32((int)n13, (int)7) - Inlines.MULT16_16((int)n6, (int)Inlines.PSHR32((int)n13, (int)8));
            } while (++n9 < n4);
        }
    }

    static void amp2Log2(CeltMode celtMode, int n, int n2, int[] nArray, int[] nArray2, int n3, int n4) {
        int n5 = 0;
        do {
            int n6;
            for (n6 = 0; n6 < n; ++n6) {
                nArray2[n3 + n5 * celtMode.nbEBands + n6] = Inlines.celt_log2((int)Inlines.SHL32((int)nArray[n6 + n5 * celtMode.nbEBands], (int)2)) - Inlines.SHL16((int)CeltTables.eMeans[n6], (int)6);
            }
            for (n6 = n; n6 < n2; ++n6) {
                nArray2[n3 + n5 * celtMode.nbEBands + n6] = -14336;
            }
        } while (++n5 < n4);
    }

    static void amp2Log2(CeltMode celtMode, int n, int n2, int[][] nArray, int[][] nArray2, int n3) {
        int n4 = 0;
        do {
            int n5;
            for (n5 = 0; n5 < n; ++n5) {
                nArray2[n4][n5] = Inlines.celt_log2((int)Inlines.SHL32((int)nArray[n4][n5], (int)2)) - Inlines.SHL16((int)CeltTables.eMeans[n5], (int)6);
            }
            for (n5 = n; n5 < n2; ++n5) {
                nArray2[n4][n5] = -14336;
            }
        } while (++n4 < n3);
    }

    static void quant_fine_energy(CeltMode celtMode, int n, int n2, int[][] nArray, int[][] nArray2, int[] nArray3, EntropyCoder entropyCoder, int n3) {
        for (int i = n; i < n2; ++i) {
            int n4 = 1 << nArray3[i];
            if (nArray3[i] <= 0) continue;
            int n5 = 0;
            do {
                int n6;
                if ((n6 = nArray2[n5][i] + 512 >> 10 - nArray3[i]) > n4 - 1) {
                    n6 = n4 - 1;
                }
                if (n6 < 0) {
                    n6 = 0;
                }
                entropyCoder.enc_bits((long)n6, nArray3[i]);
                int n7 = Inlines.SUB16((int)Inlines.SHR32((int)(Inlines.SHL32((int)n6, (int)10) + 512), (int)nArray3[i]), (int)512);
                int[] nArray4 = nArray[n5];
                int n8 = i;
                nArray4[n8] = nArray4[n8] + n7;
                int[] nArray5 = nArray2[n5];
                int n9 = i;
                nArray5[n9] = nArray5[n9] - n7;
            } while (++n5 < n3);
        }
    }
}

