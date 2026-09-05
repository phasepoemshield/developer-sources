/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltPitchXCorr;
import de.maxhenkel.voicechat.concentus.Inlines;

class BurgModified {
    private static final int MAX_FRAME_SIZE = 384;
    private static final int QA = 25;
    private static final int N_BITS_HEAD_ROOM = 2;
    private static final int MIN_RSHIFTS = -16;
    private static final int MAX_RSHIFTS = 7;

    BurgModified() {
    }

    static void silk_burg_modified(BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, int[] nArray, short[] sArray, int n, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int[] nArray2 = new int[16];
        int[] nArray3 = new int[16];
        int[] nArray4 = new int[16];
        int[] nArray5 = new int[17];
        int[] nArray6 = new int[17];
        int[] nArray7 = new int[16];
        Inlines.OpusAssert(n3 * n4 <= 384);
        long l = Inlines.silk_inner_prod16_aligned_64(sArray, n, sArray, n, n3 * n4);
        int n13 = Inlines.silk_CLZ64(l);
        int n14 = 35 - n13;
        if (n14 > 7) {
            n14 = 7;
        }
        if (n14 < -16) {
            n14 = -16;
        }
        int n15 = n14 > 0 ? (int)Inlines.silk_RSHIFT64(l, n14) : Inlines.silk_LSHIFT32((int)l, -n14);
        nArray6[0] = nArray5[0] = n15 + Inlines.silk_SMMUL(42950, n15) + 1;
        Arrays.MemSet(nArray2, 0, 16);
        if (n14 > 0) {
            for (n12 = 0; n12 < n4; ++n12) {
                n11 = n + n12 * n3;
                for (n10 = 1; n10 < n5 + 1; ++n10) {
                    int n16 = n10 - 1;
                    nArray2[n16] = nArray2[n16] + (int)Inlines.silk_RSHIFT64(Inlines.silk_inner_prod16_aligned_64(sArray, n11, sArray, n11 + n10, n3 - n10), n14);
                }
            }
        } else {
            for (n12 = 0; n12 < n4; ++n12) {
                n11 = n + n12 * n3;
                CeltPitchXCorr.pitch_xcorr(sArray, n11, sArray, n11 + 1, nArray7, n3 - n5, n5);
                for (n10 = 1; n10 < n5 + 1; ++n10) {
                    int n17 = 0;
                    for (int i = n10 + n3 - n5; i < n3; ++i) {
                        n17 = Inlines.MAC16_16(n17, sArray[n11 + i], sArray[n11 + i - n10]);
                    }
                    int n18 = n10 - 1;
                    nArray7[n18] = nArray7[n18] + n17;
                }
                for (n10 = 1; n10 < n5 + 1; ++n10) {
                    int n19 = n10 - 1;
                    nArray2[n19] = nArray2[n19] + Inlines.silk_LSHIFT32(nArray7[n10 - 1], -n14);
                }
            }
        }
        System.arraycopy(nArray2, 0, nArray3, 0, 16);
        nArray6[0] = nArray5[0] = n15 + Inlines.silk_SMMUL(42950, n15) + 1;
        int n20 = 0x40000000;
        boolean bl = false;
        for (n10 = 0; n10 < n5; ++n10) {
            int n21;
            int n22;
            int n23;
            int n24;
            if (n14 > -2) {
                for (n12 = 0; n12 < n4; ++n12) {
                    n11 = n + n12 * n3;
                    n24 = -Inlines.silk_LSHIFT32(sArray[n11 + n10], 16 - n14);
                    n23 = -Inlines.silk_LSHIFT32(sArray[n11 + n3 - n10 - 1], 16 - n14);
                    n9 = Inlines.silk_LSHIFT32(sArray[n11 + n10], 9);
                    n22 = Inlines.silk_LSHIFT32(sArray[n11 + n3 - n10 - 1], 9);
                    for (n8 = 0; n8 < n10; ++n8) {
                        nArray2[n8] = Inlines.silk_SMLAWB(nArray2[n8], n24, sArray[n11 + n10 - n8 - 1]);
                        nArray3[n8] = Inlines.silk_SMLAWB(nArray3[n8], n23, sArray[n11 + n3 - n10 + n8]);
                        n21 = nArray4[n8];
                        n9 = Inlines.silk_SMLAWB(n9, n21, sArray[n11 + n10 - n8 - 1]);
                        n22 = Inlines.silk_SMLAWB(n22, n21, sArray[n11 + n3 - n10 + n8]);
                    }
                    n9 = Inlines.silk_LSHIFT32(-n9, 7 - n14);
                    n22 = Inlines.silk_LSHIFT32(-n22, 7 - n14);
                    for (n8 = 0; n8 <= n10; ++n8) {
                        nArray5[n8] = Inlines.silk_SMLAWB(nArray5[n8], n9, sArray[n11 + n10 - n8]);
                        nArray6[n8] = Inlines.silk_SMLAWB(nArray6[n8], n22, sArray[n11 + n3 - n10 + n8 - 1]);
                    }
                }
            } else {
                for (n12 = 0; n12 < n4; ++n12) {
                    n11 = n + n12 * n3;
                    n24 = -Inlines.silk_LSHIFT32(sArray[n11 + n10], -n14);
                    n23 = -Inlines.silk_LSHIFT32(sArray[n11 + n3 - n10 - 1], -n14);
                    n9 = Inlines.silk_LSHIFT32(sArray[n11 + n10], 17);
                    n22 = Inlines.silk_LSHIFT32(sArray[n11 + n3 - n10 - 1], 17);
                    for (n8 = 0; n8 < n10; ++n8) {
                        nArray2[n8] = Inlines.silk_MLA(nArray2[n8], n24, sArray[n11 + n10 - n8 - 1]);
                        nArray3[n8] = Inlines.silk_MLA(nArray3[n8], n23, sArray[n11 + n3 - n10 + n8]);
                        n7 = Inlines.silk_RSHIFT_ROUND(nArray4[n8], 8);
                        n9 = Inlines.silk_MLA(n9, sArray[n11 + n10 - n8 - 1], n7);
                        n22 = Inlines.silk_MLA(n22, sArray[n11 + n3 - n10 + n8], n7);
                    }
                    n9 = -n9;
                    n22 = -n22;
                    for (n8 = 0; n8 <= n10; ++n8) {
                        nArray5[n8] = Inlines.silk_SMLAWW(nArray5[n8], n9, Inlines.silk_LSHIFT32(sArray[n11 + n10 - n8], -n14 - 1));
                        nArray6[n8] = Inlines.silk_SMLAWW(nArray6[n8], n22, Inlines.silk_LSHIFT32(sArray[n11 + n3 - n10 + n8 - 1], -n14 - 1));
                    }
                }
            }
            n9 = nArray2[n10];
            n22 = nArray3[n10];
            int n25 = 0;
            n6 = Inlines.silk_ADD32(nArray6[0], nArray5[0]);
            for (n8 = 0; n8 < n10; ++n8) {
                n21 = nArray4[n8];
                n13 = Inlines.silk_CLZ32(Inlines.silk_abs(n21)) - 1;
                n13 = Inlines.silk_min(7, n13);
                n7 = Inlines.silk_LSHIFT32(n21, n13);
                n9 = Inlines.silk_ADD_LSHIFT32(n9, Inlines.silk_SMMUL(nArray3[n10 - n8 - 1], n7), 7 - n13);
                n22 = Inlines.silk_ADD_LSHIFT32(n22, Inlines.silk_SMMUL(nArray2[n10 - n8 - 1], n7), 7 - n13);
                n25 = Inlines.silk_ADD_LSHIFT32(n25, Inlines.silk_SMMUL(nArray6[n10 - n8], n7), 7 - n13);
                n6 = Inlines.silk_ADD_LSHIFT32(n6, Inlines.silk_SMMUL(Inlines.silk_ADD32(nArray6[n8 + 1], nArray5[n8 + 1]), n7), 7 - n13);
            }
            nArray5[n10 + 1] = n9;
            nArray6[n10 + 1] = n22;
            n25 = Inlines.silk_ADD32(n25, n22);
            int n26 = Inlines.silk_abs(n25 = Inlines.silk_LSHIFT32(-n25, 1)) < n6 ? Inlines.silk_DIV32_varQ(n25, n6, 31) : (n25 > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE);
            n9 = 0x40000000 - Inlines.silk_SMMUL(n26, n26);
            if ((n9 = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(n20, n9), 2)) <= n2) {
                n22 = 0x40000000 - Inlines.silk_DIV32_varQ(n2, n20, 30);
                n26 = Inlines.silk_SQRT_APPROX(n22);
                n26 = Inlines.silk_RSHIFT32(n26 + Inlines.silk_DIV32(n22, n26), 1);
                n26 = Inlines.silk_LSHIFT32(n26, 16);
                if (n25 < 0) {
                    n26 = -n26;
                }
                n20 = n2;
                bl = true;
            } else {
                n20 = n9;
            }
            for (n8 = 0; n8 < n10 + 1 >> 1; ++n8) {
                n9 = nArray4[n8];
                n22 = nArray4[n10 - n8 - 1];
                nArray4[n8] = Inlines.silk_ADD_LSHIFT32(n9, Inlines.silk_SMMUL(n22, n26), 1);
                nArray4[n10 - n8 - 1] = Inlines.silk_ADD_LSHIFT32(n22, Inlines.silk_SMMUL(n9, n26), 1);
            }
            nArray4[n10] = Inlines.silk_RSHIFT32(n26, 6);
            if (bl) {
                for (n8 = n10 + 1; n8 < n5; ++n8) {
                    nArray4[n8] = 0;
                }
                break;
            }
            for (n8 = 0; n8 <= n10 + 1; ++n8) {
                n9 = nArray5[n8];
                n22 = nArray6[n10 - n8 + 1];
                nArray5[n8] = Inlines.silk_ADD_LSHIFT32(n9, Inlines.silk_SMMUL(n22, n26), 1);
                nArray6[n10 - n8 + 1] = Inlines.silk_ADD_LSHIFT32(n22, Inlines.silk_SMMUL(n9, n26), 1);
            }
        }
        if (bl) {
            for (n8 = 0; n8 < n5; ++n8) {
                nArray[n8] = -Inlines.silk_RSHIFT_ROUND(nArray4[n8], 9);
            }
            if (n14 > 0) {
                for (n12 = 0; n12 < n4; ++n12) {
                    n11 = n + n12 * n3;
                    n15 -= (int)Inlines.silk_RSHIFT64(Inlines.silk_inner_prod16_aligned_64(sArray, n11, sArray, n11, n5), n14);
                }
            } else {
                for (n12 = 0; n12 < n4; ++n12) {
                    n11 = n + n12 * n3;
                    n15 -= Inlines.silk_LSHIFT32(Inlines.silk_inner_prod_self(sArray, n11, n5), -n14);
                }
            }
            boxedValueInt.Val = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(n20, n15), 2);
            boxedValueInt2.Val = 0 - n14;
        } else {
            n6 = nArray5[0];
            n9 = 65536;
            for (n8 = 0; n8 < n5; ++n8) {
                n7 = Inlines.silk_RSHIFT_ROUND(nArray4[n8], 9);
                n6 = Inlines.silk_SMLAWW(n6, nArray5[n8 + 1], n7);
                n9 = Inlines.silk_SMLAWW(n9, n7, n7);
                nArray[n8] = -n7;
            }
            boxedValueInt.Val = Inlines.silk_SMLAWW(n6, Inlines.silk_SMMUL(42950, n15), -n9);
            boxedValueInt2.Val = -n14;
        }
    }
}

