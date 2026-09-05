/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltPitchXCorr;
import de.maxhenkel.voicechat.concentus.Inlines;

class Autocorrelation {
    private static final int QC = 10;
    private static final int QS = 14;

    Autocorrelation() {
    }

    static int _celt_autocorr(int[] nArray, int[] nArray2, int[] nArray3, int n, int n2, int n3) {
        int n4;
        int[] nArray4;
        int n5 = n3 - n2;
        int[] nArray5 = new int[n3];
        Inlines.OpusAssert(n3 > 0);
        Inlines.OpusAssert(n >= 0);
        if (n == 0) {
            nArray4 = nArray;
        } else {
            for (n4 = 0; n4 < n3; ++n4) {
                nArray5[n4] = nArray[n4];
            }
            for (n4 = 0; n4 < n; ++n4) {
                nArray5[n4] = Inlines.MULT16_16_Q15(nArray[n4], nArray3[n4]);
                nArray5[n3 - n4 - 1] = Inlines.MULT16_16_Q15(nArray[n3 - n4 - 1], nArray3[n4]);
            }
            nArray4 = nArray5;
        }
        int n6 = 0;
        int n7 = 1 + (n3 << 7);
        if ((n3 & 1) != 0) {
            n7 += Inlines.SHR32(Inlines.MULT16_16(nArray4[0], nArray4[0]), 9);
        }
        for (n4 = n3 & 1; n4 < n3; n4 += 2) {
            n7 += Inlines.SHR32(Inlines.MULT16_16(nArray4[n4], nArray4[n4]), 9);
            n7 += Inlines.SHR32(Inlines.MULT16_16(nArray4[n4 + 1], nArray4[n4 + 1]), 9);
        }
        n6 = Inlines.celt_ilog2(n7) - 30 + 10;
        if ((n6 /= 2) > 0) {
            for (n4 = 0; n4 < n3; ++n4) {
                nArray5[n4] = Inlines.PSHR32(nArray4[n4], n6);
            }
            nArray4 = nArray5;
        } else {
            n6 = 0;
        }
        CeltPitchXCorr.pitch_xcorr(nArray4, nArray4, nArray2, n5, n2 + 1);
        int n8 = 0;
        while (n8 <= n2) {
            int n9 = 0;
            for (n4 = n8 + n5; n4 < n3; ++n4) {
                n9 = Inlines.MAC16_16(n9, nArray4[n4], nArray4[n4 - n8]);
            }
            int n10 = n8++;
            nArray2[n10] = nArray2[n10] + n9;
        }
        if ((n6 = 2 * n6) <= 0) {
            nArray2[0] = nArray2[0] + Inlines.SHL32(1, -n6);
        }
        if (nArray2[0] < 0x10000000) {
            int n11 = 29 - Inlines.EC_ILOG(nArray2[0]);
            for (n4 = 0; n4 <= n2; ++n4) {
                nArray2[n4] = Inlines.SHL32(nArray2[n4], n11);
            }
            n6 -= n11;
        } else if (nArray2[0] >= 0x20000000) {
            int n12 = 1;
            if (nArray2[0] >= 0x40000000) {
                ++n12;
            }
            for (n4 = 0; n4 <= n2; ++n4) {
                nArray2[n4] = Inlines.SHR32(nArray2[n4], n12);
            }
            n6 += n12;
        }
        return n6;
    }

    static int _celt_autocorr(short[] sArray, int[] nArray, int n, int n2) {
        int n3;
        int n4 = n2 - n;
        short[] sArray2 = new short[n2];
        Inlines.OpusAssert(n2 > 0);
        short[] sArray3 = sArray;
        int n5 = 0;
        int n6 = 1 + (n2 << 7);
        if ((n2 & 1) != 0) {
            n6 += Inlines.SHR32(Inlines.MULT16_16(sArray3[0], sArray3[0]), 9);
        }
        for (n3 = n2 & 1; n3 < n2; n3 += 2) {
            n6 += Inlines.SHR32(Inlines.MULT16_16(sArray3[n3], sArray3[n3]), 9);
            n6 += Inlines.SHR32(Inlines.MULT16_16(sArray3[n3 + 1], sArray3[n3 + 1]), 9);
        }
        n5 = Inlines.celt_ilog2(n6) - 30 + 10;
        if ((n5 /= 2) > 0) {
            for (n3 = 0; n3 < n2; ++n3) {
                sArray2[n3] = (short)Inlines.PSHR32(sArray3[n3], n5);
            }
            sArray3 = sArray2;
        } else {
            n5 = 0;
        }
        CeltPitchXCorr.pitch_xcorr(sArray3, sArray3, nArray, n4, n + 1);
        int n7 = 0;
        while (n7 <= n) {
            int n8 = 0;
            for (n3 = n7 + n4; n3 < n2; ++n3) {
                n8 = Inlines.MAC16_16(n8, sArray3[n3], sArray3[n3 - n7]);
            }
            int n9 = n7++;
            nArray[n9] = nArray[n9] + n8;
        }
        if ((n5 = 2 * n5) <= 0) {
            nArray[0] = nArray[0] + Inlines.SHL32(1, -n5);
        }
        if (nArray[0] < 0x10000000) {
            n6 = 29 - Inlines.EC_ILOG(nArray[0]);
            for (n3 = 0; n3 <= n; ++n3) {
                nArray[n3] = Inlines.SHL32(nArray[n3], n6);
            }
            n5 -= n6;
        } else if (nArray[0] >= 0x20000000) {
            n6 = 1;
            if (nArray[0] >= 0x40000000) {
                ++n6;
            }
            for (n3 = 0; n3 <= n; ++n3) {
                nArray[n3] = Inlines.SHR32(nArray[n3], n6);
            }
            n5 += n6;
        }
        return n5;
    }

    static void silk_autocorr(int[] nArray, BoxedValueInt boxedValueInt, short[] sArray, int n, int n2) {
        int n3 = Inlines.silk_min_int(n, n2);
        boxedValueInt.Val = Autocorrelation._celt_autocorr(sArray, nArray, n3 - 1, n);
    }

    static void silk_warped_autocorrelation(int[] nArray, BoxedValueInt boxedValueInt, short[] sArray, int n, int n2, int n3) {
        int n4;
        int[] nArray2 = new int[17];
        long[] lArray = new long[17];
        Inlines.OpusAssert((n3 & 1) == 0);
        Inlines.OpusAssert(true);
        for (int i = 0; i < n2; ++i) {
            int n5 = Inlines.silk_LSHIFT32(sArray[i], 14);
            for (n4 = 0; n4 < n3; n4 += 2) {
                int n6 = Inlines.silk_SMLAWB(nArray2[n4], nArray2[n4 + 1] - n5, n);
                nArray2[n4] = n5;
                int n7 = n4;
                lArray[n7] = lArray[n7] + Inlines.silk_RSHIFT64(Inlines.silk_SMULL(n5, nArray2[0]), 18);
                n5 = Inlines.silk_SMLAWB(nArray2[n4 + 1], nArray2[n4 + 2] - n6, n);
                nArray2[n4 + 1] = n6;
                int n8 = n4 + 1;
                lArray[n8] = lArray[n8] + Inlines.silk_RSHIFT64(Inlines.silk_SMULL(n6, nArray2[0]), 18);
            }
            nArray2[n3] = n5;
            int n9 = n3;
            lArray[n9] = lArray[n9] + Inlines.silk_RSHIFT64(Inlines.silk_SMULL(n5, nArray2[0]), 18);
        }
        int n10 = Inlines.silk_CLZ64(lArray[0]) - 35;
        n10 = Inlines.silk_LIMIT(n10, -22, 20);
        boxedValueInt.Val = -(10 + n10);
        Inlines.OpusAssert(boxedValueInt.Val >= -30 && boxedValueInt.Val <= 12);
        if (n10 >= 0) {
            for (n4 = 0; n4 < n3 + 1; ++n4) {
                nArray[n4] = (int)Inlines.silk_LSHIFT64(lArray[n4], n10);
            }
        } else {
            for (n4 = 0; n4 < n3 + 1; ++n4) {
                nArray[n4] = (int)Inlines.silk_RSHIFT64(lArray[n4], -n10);
            }
        }
        Inlines.OpusAssert(lArray[0] >= 0L);
    }
}

