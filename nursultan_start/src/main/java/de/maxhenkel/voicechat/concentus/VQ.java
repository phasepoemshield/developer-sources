/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.CWRS
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 *  de.maxhenkel.voicechat.concentus.Kernels
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.CWRS;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Kernels;

class VQ {
    private static int[] SPREAD_FACTOR = new int[]{15, 10, 5};

    VQ() {
    }

    static int extract_collapse_mask(int[] nArray, int n, int n2) {
        if (n2 <= 1) {
            return 1;
        }
        int n3 = Inlines.celt_udiv((int)n, (int)n2);
        int n4 = 0;
        int n5 = 0;
        do {
            int n6 = 0;
            int n7 = 0;
            do {
                n6 |= nArray[n5 * n3 + n7];
            } while (++n7 < n3);
            n4 |= (n6 != 0 ? 1 : 0) << n5;
        } while (++n5 < n2);
        return n4;
    }

    static void exp_rotation1(int[] nArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9 = n;
        int n10 = Inlines.NEG16((int)n5);
        for (n8 = 0; n8 < n2 - n3; ++n8) {
            n7 = nArray[n9];
            n6 = nArray[n9 + n3];
            nArray[n9 + n3] = Inlines.EXTRACT16((int)Inlines.PSHR32((int)Inlines.MAC16_16((int)Inlines.MULT16_16((int)n4, (int)n6), (int)n5, (int)n7), (int)15));
            nArray[n9] = Inlines.EXTRACT16((int)Inlines.PSHR32((int)Inlines.MAC16_16((int)Inlines.MULT16_16((int)n4, (int)n7), (int)n10, (int)n6), (int)15));
            ++n9;
        }
        n9 = n + (n2 - 2 * n3 - 1);
        for (n8 = n2 - 2 * n3 - 1; n8 >= 0; --n8) {
            n7 = nArray[n9];
            n6 = nArray[n9 + n3];
            nArray[n9 + n3] = Inlines.EXTRACT16((int)Inlines.PSHR32((int)Inlines.MAC16_16((int)Inlines.MULT16_16((int)n4, (int)n6), (int)n5, (int)n7), (int)15));
            nArray[n9] = Inlines.EXTRACT16((int)Inlines.PSHR32((int)Inlines.MAC16_16((int)Inlines.MULT16_16((int)n4, (int)n7), (int)n10, (int)n6), (int)15));
            --n9;
        }
    }

    static void normalise_residual(int[] nArray, int[] nArray2, int n, int n2, int n3, int n4) {
        int n5 = Inlines.celt_ilog2((int)n3) >> 1;
        int n6 = Inlines.VSHR32((int)n3, (int)(2 * (n5 - 7)));
        int n7 = Inlines.MULT16_16_P15((int)Inlines.celt_rsqrt_norm((int)n6), (int)n4);
        int n8 = 0;
        do {
            nArray2[n + n8] = Inlines.EXTRACT16((int)Inlines.PSHR32((int)Inlines.MULT16_16((int)n7, (int)nArray[n8]), (int)(n5 + 1)));
        } while (++n8 < n2);
    }

    static void exp_rotation(int[] nArray, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7 = 0;
        if (2 * n5 >= n2 || n6 == 0) {
            return;
        }
        int n8 = SPREAD_FACTOR[n6 - 1];
        int n9 = Inlines.celt_div((int)Inlines.MULT16_16((int)Short.MAX_VALUE, (int)n2), (int)(n2 + n8 * n5));
        int n10 = Inlines.HALF16((int)Inlines.MULT16_16_Q15((int)n9, (int)n9));
        int n11 = Inlines.celt_cos_norm((int)Inlines.EXTEND32((int)n10));
        int n12 = Inlines.celt_cos_norm((int)Inlines.EXTEND32((int)Inlines.SUB16((int)Short.MAX_VALUE, (int)n10)));
        if (n2 >= 8 * n4) {
            n7 = 1;
            while ((n7 * n7 + n7) * n4 + (n4 >> 2) < n2) {
                ++n7;
            }
        }
        n2 = Inlines.celt_udiv((int)n2, (int)n4);
        for (int i = 0; i < n4; ++i) {
            if (n3 < 0) {
                if (n7 != 0) {
                    VQ.exp_rotation1(nArray, n + i * n2, n2, n7, n12, n11);
                }
                VQ.exp_rotation1(nArray, n + i * n2, n2, 1, n11, n12);
                continue;
            }
            VQ.exp_rotation1(nArray, n + i * n2, n2, 1, n11, (short)(0 - n12));
            if (n7 == 0) continue;
            VQ.exp_rotation1(nArray, n + i * n2, n2, n7, n12, (short)(0 - n11));
        }
    }

    static void renormalise_vector(int[] nArray, int n, int n2, int n3) {
        int n4 = 1 + Kernels.celt_inner_prod((int[])nArray, (int)n, (int[])nArray, (int)n, (int)n2);
        int n5 = Inlines.celt_ilog2((int)n4) >> 1;
        int n6 = Inlines.VSHR32((int)n4, (int)(2 * (n5 - 7)));
        int n7 = Inlines.MULT16_16_P15((int)Inlines.celt_rsqrt_norm((int)n6), (int)n3);
        int n8 = n;
        for (int i = 0; i < n2; ++i) {
            nArray[n8] = Inlines.EXTRACT16((int)Inlines.PSHR32((int)Inlines.MULT16_16((int)n7, (int)nArray[n8]), (int)(n5 + 1)));
            ++n8;
        }
    }

    static int alg_unquant(int[] nArray, int n, int n2, int n3, int n4, int n5, EntropyCoder entropyCoder, int n6) {
        int[] nArray2 = new int[n2];
        Inlines.OpusAssert((n3 > 0 ? 1 : 0) != 0, (String)"alg_unquant() needs at least one pulse");
        Inlines.OpusAssert((n2 > 1 ? 1 : 0) != 0, (String)"alg_unquant() needs at least two dimensions");
        int n7 = CWRS.decode_pulses((int[])nArray2, (int)n2, (int)n3, (EntropyCoder)entropyCoder);
        VQ.normalise_residual(nArray2, nArray, n, n2, n7, n6);
        VQ.exp_rotation(nArray, n, n2, -1, n5, n3, n4);
        int n8 = VQ.extract_collapse_mask(nArray2, n2, n5);
        return n8;
    }

    static int stereo_itheta(int[] nArray, int n, int[] nArray2, int n2, int n3, int n4) {
        int n5 = 1;
        int n6 = 1;
        if (n3 != 0) {
            for (int i = 0; i < n4; ++i) {
                int n7 = Inlines.ADD16((int)Inlines.SHR16((int)nArray[n + i], (int)1), (int)Inlines.SHR16((int)nArray2[n2 + i], (int)1));
                int n8 = Inlines.SUB16((int)Inlines.SHR16((int)nArray[n + i], (int)1), (int)Inlines.SHR16((int)nArray2[n2 + i], (int)1));
                n6 = Inlines.MAC16_16((int)n6, (int)n7, (int)n7);
                n5 = Inlines.MAC16_16((int)n5, (int)n8, (int)n8);
            }
        } else {
            n6 += Kernels.celt_inner_prod((int[])nArray, (int)n, (int[])nArray, (int)n, (int)n4);
            n5 += Kernels.celt_inner_prod((int[])nArray2, (int)n2, (int[])nArray2, (int)n2, (int)n4);
        }
        int n9 = Inlines.celt_sqrt((int)n6);
        int n10 = Inlines.celt_sqrt((int)n5);
        int n11 = Inlines.MULT16_16_Q15((int)20861, (int)Inlines.celt_atan2p((int)n10, (int)n9));
        return n11;
    }

    static int alg_quant(int[] nArray, int n, int n2, int n3, int n4, int n5, EntropyCoder entropyCoder) {
        int n6;
        int[] nArray2 = new int[n2];
        int[] nArray3 = new int[n2];
        int[] nArray4 = new int[n2];
        Inlines.OpusAssert((n3 > 0 ? 1 : 0) != 0, (String)"alg_quant() needs at least one pulse");
        Inlines.OpusAssert((n2 > 1 ? 1 : 0) != 0, (String)"alg_quant() needs at least two dimensions");
        VQ.exp_rotation(nArray, n, n2, 1, n5, n3, n4);
        int n7 = 0;
        int n8 = 0;
        do {
            if (nArray[n + n8] > 0) {
                nArray4[n8] = 1;
            } else {
                nArray4[n8] = -1;
                nArray[n + n8] = 0 - nArray[n + n8];
            }
            nArray3[n8] = 0;
            nArray2[n8] = 0;
        } while (++n8 < n2);
        int n9 = 0;
        int n10 = 0;
        int n11 = n3;
        if (n3 > n2 >> 1) {
            n8 = 0;
            do {
                n7 += nArray[n + n8];
            } while (++n8 < n2);
            if (n7 <= n3) {
                nArray[n] = 16384;
                n8 = n + 1;
                do {
                    nArray[n8] = 0;
                } while (++n8 < n2 + n);
                n7 = 16384;
            }
            n6 = Inlines.EXTRACT16((int)Inlines.MULT16_32_Q16((int)(n3 - 1), (int)Inlines.celt_rcp((int)n7)));
            n8 = 0;
            do {
                nArray3[n8] = Inlines.MULT16_16_Q15((int)nArray[n + n8], (int)n6);
                nArray2[n8] = nArray3[n8];
                n9 = Inlines.MAC16_16((int)n9, (int)nArray2[n8], (int)nArray2[n8]);
                n10 = Inlines.MAC16_16((int)n10, (int)nArray[n + n8], (int)nArray2[n8]);
                int n12 = n8;
                nArray2[n12] = nArray2[n12] * 2;
                n11 -= nArray3[n8];
            } while (++n8 < n2);
        }
        Inlines.OpusAssert((n11 >= 1 ? 1 : 0) != 0, (String)"Allocated too many pulses in the quick pass");
        if (n11 > n2 + 3) {
            n6 = n11;
            n9 = Inlines.MAC16_16((int)n9, (int)n6, (int)n6);
            n9 = Inlines.MAC16_16((int)n9, (int)n6, (int)nArray2[0]);
            nArray3[0] = nArray3[0] + n11;
            n11 = 0;
        }
        int n13 = 1;
        for (int i = 0; i < n11; ++i) {
            int n14 = -32767;
            int n15 = 0;
            int n16 = 1 + Inlines.celt_ilog2((int)(n3 - n11 + i + 1));
            n6 = 0;
            n9 = Inlines.ADD16((int)n9, (int)1);
            n8 = 0;
            do {
                int n17 = Inlines.EXTRACT16((int)Inlines.SHR32((int)Inlines.ADD32((int)n10, (int)Inlines.EXTEND32((int)nArray[n + n8])), (int)n16));
                int n18 = Inlines.ADD16((int)n9, (int)nArray2[n8]);
                if (Inlines.MULT16_16((int)n15, (int)(n17 = Inlines.MULT16_16_Q15((int)n17, (int)n17))) <= Inlines.MULT16_16((int)n18, (int)n14)) continue;
                n15 = n18;
                n14 = n17;
                n6 = n8;
            } while (++n8 < n2);
            n10 = Inlines.ADD32((int)n10, (int)Inlines.EXTEND32((int)nArray[n + n6]));
            n9 = Inlines.ADD16((int)n9, (int)nArray2[n6]);
            nArray2[n6] = nArray2[n6] + 2 * n13;
            int n19 = n6;
            nArray3[n19] = nArray3[n19] + 1;
        }
        n8 = 0;
        do {
            nArray[n + n8] = Inlines.MULT16_16((int)nArray4[n8], (int)nArray[n + n8]);
            if (nArray4[n8] >= 0) continue;
            nArray3[n8] = -nArray3[n8];
        } while (++n8 < n2);
        CWRS.encode_pulses((int[])nArray3, (int)n2, (int)n3, (EntropyCoder)entropyCoder);
        int n20 = VQ.extract_collapse_mask(nArray3, n2, n5);
        return n20;
    }
}

