/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Autocorrelation
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.CeltLPC
 *  de.maxhenkel.voicechat.concentus.CeltPitchXCorr
 *  de.maxhenkel.voicechat.concentus.Inlines
 *  de.maxhenkel.voicechat.concentus.Kernels
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Autocorrelation;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltLPC;
import de.maxhenkel.voicechat.concentus.CeltPitchXCorr;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Kernels;

class Pitch {
    private static final int[] second_check = new int[]{0, 0, 3, 2, 3, 2, 5, 2, 3, 2, 3, 2, 5, 2, 3, 2};

    Pitch() {
    }

    static void find_best_pitch(int[] nArray, int[] nArray2, int n, int n2, int[] nArray3, int n3, int n4) {
        int n5 = 1;
        int n6 = Inlines.celt_ilog2((int)n4) - 14;
        int n7 = -1;
        int n8 = -1;
        int n9 = 0;
        int n10 = 0;
        nArray3[0] = 0;
        nArray3[1] = 1;
        for (int i = 0; i < n; ++i) {
            n5 = Inlines.ADD32((int)n5, (int)Inlines.SHR32((int)Inlines.MULT16_16((int)nArray2[i], (int)nArray2[i]), (int)n3));
        }
        for (int i = 0; i < n2; ++i) {
            short s;
            int n11;
            if (nArray[i] > 0 && Inlines.MULT16_32_Q15((int)(n11 = Inlines.MULT16_16_Q15((int)(s = Inlines.EXTRACT16((int)Inlines.VSHR32((int)nArray[i], (int)n6))), (int)s)), (int)n10) > Inlines.MULT16_32_Q15((int)n8, (int)n5)) {
                if (Inlines.MULT16_32_Q15((int)n11, (int)n9) > Inlines.MULT16_32_Q15((int)n7, (int)n5)) {
                    n8 = n7;
                    n10 = n9;
                    nArray3[1] = nArray3[0];
                    n7 = n11;
                    n9 = n5;
                    nArray3[0] = i;
                } else {
                    n8 = n11;
                    n10 = n5;
                    nArray3[1] = i;
                }
            }
            n5 += Inlines.SHR32((int)Inlines.MULT16_16((int)nArray2[i + n], (int)nArray2[i + n]), (int)n3) - Inlines.SHR32((int)Inlines.MULT16_16((int)nArray2[i], (int)nArray2[i]), (int)n3);
            n5 = Inlines.MAX32((int)1, (int)n5);
        }
    }

    static void pitch_search(int[] nArray, int n, int[] nArray2, int n2, int n3, BoxedValueInt boxedValueInt) {
        int n4;
        int n5;
        int n6;
        int n7;
        int[] nArray3 = new int[]{0, 0};
        int n8 = 0;
        Inlines.OpusAssert((n2 > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n3 > 0 ? 1 : 0) != 0);
        int n9 = n2 + n3;
        int[] nArray4 = new int[n2 >> 2];
        int[] nArray5 = new int[n9 >> 2];
        int[] nArray6 = new int[n3 >> 1];
        for (n7 = 0; n7 < n2 >> 2; ++n7) {
            nArray4[n7] = nArray[n + 2 * n7];
        }
        for (n7 = 0; n7 < n9 >> 2; ++n7) {
            nArray5[n7] = nArray2[2 * n7];
        }
        int n10 = Inlines.celt_maxabs32((int[])nArray4, (int)0, (int)(n2 >> 2));
        n8 = Inlines.celt_ilog2((int)Inlines.MAX32((int)1, (int)Inlines.MAX32((int)n10, (int)(n6 = Inlines.celt_maxabs32((int[])nArray5, (int)0, (int)(n9 >> 2)))))) - 11;
        if (n8 > 0) {
            for (n7 = 0; n7 < n2 >> 2; ++n7) {
                nArray4[n7] = Inlines.SHR16((int)nArray4[n7], (int)n8);
            }
            for (n7 = 0; n7 < n9 >> 2; ++n7) {
                nArray5[n7] = Inlines.SHR16((int)nArray5[n7], (int)n8);
            }
            n8 *= 2;
        } else {
            n8 = 0;
        }
        int n11 = CeltPitchXCorr.pitch_xcorr((int[])nArray4, (int[])nArray5, (int[])nArray6, (int)(n2 >> 2), (int)(n3 >> 2));
        Pitch.find_best_pitch(nArray6, nArray5, n2 >> 2, n3 >> 2, nArray3, 0, n11);
        n11 = 1;
        for (int i = 0; i < n3 >> 1; ++i) {
            nArray6[i] = 0;
            if (Inlines.abs((int)(i - 2 * nArray3[0])) > 2 && Inlines.abs((int)(i - 2 * nArray3[1])) > 2) continue;
            n5 = 0;
            for (n7 = 0; n7 < n2 >> 1; ++n7) {
                n5 += Inlines.SHR32((int)Inlines.MULT16_16((int)nArray[n + n7], (int)nArray2[i + n7]), (int)n8);
            }
            nArray6[i] = Inlines.MAX32((int)-1, (int)n5);
            n11 = Inlines.MAX32((int)n11, (int)n5);
        }
        Pitch.find_best_pitch(nArray6, nArray2, n2 >> 1, n3 >> 1, nArray3, n8 + 1, n11);
        if (nArray3[0] > 0 && nArray3[0] < (n3 >> 1) - 1) {
            n5 = nArray6[nArray3[0] - 1];
            int n12 = nArray6[nArray3[0]];
            int n13 = nArray6[nArray3[0] + 1];
            n4 = n13 - n5 > Inlines.MULT16_32_Q15((short)22938, (int)(n12 - n5)) ? 1 : (n5 - n13 > Inlines.MULT16_32_Q15((short)22938, (int)(n12 - n13)) ? -1 : 0);
        } else {
            n4 = 0;
        }
        boxedValueInt.Val = 2 * nArray3[0] - n4;
    }

    static void pitch_downsample(int[][] nArray, int[] nArray2, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int[] nArray3 = new int[5];
        int n6 = Short.MAX_VALUE;
        int[] nArray4 = new int[4];
        int[] nArray5 = new int[]{0, 0, 0, 0, 0};
        int[] nArray6 = new int[5];
        int n7 = 26214;
        int n8 = Inlines.celt_maxabs32((int[])nArray[0], (int)0, (int)n);
        if (n2 == 2) {
            n5 = Inlines.celt_maxabs32((int[])nArray[1], (int)0, (int)n);
            n8 = Inlines.MAX32((int)n8, (int)n5);
        }
        if (n8 < 1) {
            n8 = 1;
        }
        if ((n4 = Inlines.celt_ilog2((int)n8) - 10) < 0) {
            n4 = 0;
        }
        if (n2 == 2) {
            ++n4;
        }
        n5 = n >> 1;
        for (n3 = 1; n3 < n5; ++n3) {
            nArray2[n3] = Inlines.SHR32((int)Inlines.HALF32((int)(Inlines.HALF32((int)(nArray[0][2 * n3 - 1] + nArray[0][2 * n3 + 1])) + nArray[0][2 * n3])), (int)n4);
        }
        nArray2[0] = Inlines.SHR32((int)Inlines.HALF32((int)(Inlines.HALF32((int)nArray[0][1]) + nArray[0][0])), (int)n4);
        if (n2 == 2) {
            for (n3 = 1; n3 < n5; ++n3) {
                int n9 = n3;
                nArray2[n9] = nArray2[n9] + Inlines.SHR32((int)Inlines.HALF32((int)(Inlines.HALF32((int)(nArray[1][2 * n3 - 1] + nArray[1][2 * n3 + 1])) + nArray[1][2 * n3])), (int)n4);
            }
            nArray2[0] = nArray2[0] + Inlines.SHR32((int)Inlines.HALF32((int)(Inlines.HALF32((int)nArray[1][1]) + nArray[1][0])), (int)n4);
        }
        Autocorrelation._celt_autocorr((int[])nArray2, (int[])nArray3, null, (int)0, (int)4, (int)n5);
        nArray3[0] = nArray3[0] + Inlines.SHR32((int)nArray3[0], (int)13);
        for (n3 = 1; n3 <= 4; ++n3) {
            int n10 = n3;
            nArray3[n10] = nArray3[n10] - Inlines.MULT16_32_Q15((int)(2 * n3 * n3), (int)nArray3[n3]);
        }
        CeltLPC.celt_lpc((int[])nArray4, (int[])nArray3, (int)4);
        for (n3 = 0; n3 < 4; ++n3) {
            n6 = Inlines.MULT16_16_Q15((int)29491, (int)n6);
            nArray4[n3] = Inlines.MULT16_16_Q15((int)nArray4[n3], (int)n6);
        }
        nArray6[0] = nArray4[0] + 3277;
        nArray6[1] = nArray4[1] + Inlines.MULT16_16_Q15((int)n7, (int)nArray4[0]);
        nArray6[2] = nArray4[2] + Inlines.MULT16_16_Q15((int)n7, (int)nArray4[1]);
        nArray6[3] = nArray4[3] + Inlines.MULT16_16_Q15((int)n7, (int)nArray4[2]);
        nArray6[4] = Inlines.MULT16_16_Q15((int)n7, (int)nArray4[3]);
        Pitch.celt_fir5(nArray2, nArray6, nArray2, n5, nArray5);
    }

    static int remove_doubling(int[] nArray, int n, int n2, int n3, BoxedValueInt boxedValueInt, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int[] nArray2 = new int[3];
        int n10 = n2;
        n2 /= 2;
        boxedValueInt.Val /= 2;
        n4 /= 2;
        n3 /= 2;
        int n11 = n /= 2;
        if (boxedValueInt.Val >= n) {
            boxedValueInt.Val = n - 1;
        }
        int n12 = n9 = boxedValueInt.Val;
        int[] nArray3 = new int[n + 1];
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        Kernels.dual_inner_prod((int[])nArray, (int)n11, (int[])nArray, (int)n11, (int[])nArray, (int)(n11 - n9), (int)n3, (BoxedValueInt)boxedValueInt2, (BoxedValueInt)boxedValueInt3);
        int n13 = boxedValueInt2.Val;
        int n14 = boxedValueInt3.Val;
        nArray3[0] = n13;
        int n15 = n13;
        for (int i = 1; i <= n; ++i) {
            n8 = n11 - i;
            n15 = n15 + Inlines.MULT16_16((int)nArray[n8], (int)nArray[n8]) - Inlines.MULT16_16((int)nArray[n8 + n3], (int)nArray[n8 + n3]);
            nArray3[i] = Inlines.MAX32((int)0, (int)n15);
        }
        n15 = nArray3[n9];
        int n16 = n14;
        int n17 = n15;
        n8 = 1 + Inlines.HALF32((int)Inlines.MULT32_32_Q31((int)n13, (int)n15));
        int n18 = Inlines.celt_ilog2((int)n8) >> 1;
        int n19 = Inlines.VSHR32((int)n8, (int)(2 * (n18 - 7)));
        int n20 = n7 = Inlines.VSHR32((int)Inlines.MULT16_32_Q15((int)Inlines.celt_rsqrt_norm((int)n19), (int)n14), (int)(n18 + 1));
        for (n6 = 2; n6 <= 15; ++n6) {
            int n21 = 0;
            n8 = Inlines.celt_udiv((int)(2 * n9 + n6), (int)(2 * n6));
            if (n8 < n2) break;
            n18 = n6 == 2 ? (n8 + n9 > n ? n9 : n9 + n8) : Inlines.celt_udiv((int)(2 * second_check[n6] * n9 + n6), (int)(2 * n6));
            Kernels.dual_inner_prod((int[])nArray, (int)n11, (int[])nArray, (int)(n11 - n8), (int[])nArray, (int)(n11 - n18), (int)n3, (BoxedValueInt)boxedValueInt3, (BoxedValueInt)boxedValueInt4);
            n14 = boxedValueInt3.Val;
            int n22 = boxedValueInt4.Val;
            n15 = nArray3[n8] + nArray3[n18];
            int n23 = 1 + Inlines.MULT32_32_Q31((int)n13, (int)n15);
            int n24 = Inlines.celt_ilog2((int)n23) >> 1;
            int n25 = Inlines.VSHR32((int)n23, (int)(2 * (n24 - 7)));
            n19 = Inlines.VSHR32((int)Inlines.MULT16_32_Q15((int)Inlines.celt_rsqrt_norm((int)n25), (int)(n14 += n22)), (int)(n24 + 1));
            n21 = Inlines.abs((int)(n8 - n4)) <= 1 ? n5 : (Inlines.abs((int)(n8 - n4)) <= 2 && 5 * n6 * n6 < n9 ? Inlines.HALF16((int)n5) : 0);
            int n26 = Inlines.MAX16((int)9830, (int)(Inlines.MULT16_16_Q15((int)22938, (int)n20) - n21));
            if (n8 < 3 * n2) {
                n26 = Inlines.MAX16((int)13107, (int)(Inlines.MULT16_16_Q15((int)27853, (int)n20) - n21));
            } else if (n8 < 2 * n2) {
                n26 = Inlines.MAX16((int)16384, (int)(Inlines.MULT16_16_Q15((int)29491, (int)n20) - n21));
            }
            if (n19 <= n26) continue;
            n16 = n14;
            n17 = n15;
            n12 = n8;
            n7 = n19;
        }
        int n27 = n17 <= (n16 = Inlines.MAX32((int)0, (int)n16)) ? Short.MAX_VALUE : Inlines.SHR32((int)Inlines.frac_div32((int)n16, (int)(n17 + 1)), (int)16);
        for (n6 = 0; n6 < 3; ++n6) {
            nArray2[n6] = Kernels.celt_inner_prod((int[])nArray, (int)n11, (int[])nArray, (int)(n11 - (n12 + n6 - 1)), (int)n3);
        }
        int n28 = nArray2[2] - nArray2[0] > Inlines.MULT16_32_Q15((short)22938, (int)(nArray2[1] - nArray2[0])) ? 1 : (nArray2[0] - nArray2[2] > Inlines.MULT16_32_Q15((short)22938, (int)(nArray2[1] - nArray2[2])) ? -1 : 0);
        if (n27 > n7) {
            n27 = n7;
        }
        boxedValueInt.Val = 2 * n12 + n28;
        if (boxedValueInt.Val < n10) {
            boxedValueInt.Val = n10;
        }
        return n27;
    }

    static void celt_fir5(int[] nArray, int[] nArray2, int[] nArray3, int n, int[] nArray4) {
        int n2 = nArray2[0];
        int n3 = nArray2[1];
        int n4 = nArray2[2];
        int n5 = nArray2[3];
        int n6 = nArray2[4];
        int n7 = nArray4[0];
        int n8 = nArray4[1];
        int n9 = nArray4[2];
        int n10 = nArray4[3];
        int n11 = nArray4[4];
        for (int i = 0; i < n; ++i) {
            int n12 = Inlines.SHL32((int)Inlines.EXTEND32((int)nArray[i]), (int)12);
            n12 = Inlines.MAC16_16((int)n12, (int)n2, (int)n7);
            n12 = Inlines.MAC16_16((int)n12, (int)n3, (int)n8);
            n12 = Inlines.MAC16_16((int)n12, (int)n4, (int)n9);
            n12 = Inlines.MAC16_16((int)n12, (int)n5, (int)n10);
            n12 = Inlines.MAC16_16((int)n12, (int)n6, (int)n11);
            n11 = n10;
            n10 = n9;
            n9 = n8;
            n8 = n7;
            n7 = nArray[i];
            nArray3[i] = Inlines.ROUND16((int)n12, (int)12);
        }
        nArray4[0] = n7;
        nArray4[1] = n8;
        nArray4[2] = n9;
        nArray4[3] = n10;
        nArray4[4] = n11;
    }
}

