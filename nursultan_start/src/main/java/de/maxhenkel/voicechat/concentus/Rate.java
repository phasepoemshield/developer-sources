/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.CeltMode
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;

class Rate {
    private static final byte[] LOG2_FRAC_TABLE = new byte[]{0, 8, 13, 16, 19, 21, 23, 24, 26, 27, 28, 29, 30, 31, 32, 32, 33, 34, 34, 35, 36, 36, 37, 37};
    private static final int ALLOC_STEPS = 6;

    Rate() {
    }

    static int interp_bits2pulses(CeltMode celtMode, int n, int n2, int n3, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int n4, BoxedValueInt boxedValueInt, int n5, BoxedValueInt boxedValueInt2, int n6, BoxedValueInt boxedValueInt3, int n7, int[] nArray5, int[] nArray6, int[] nArray7, int n8, int n9, EntropyCoder entropyCoder, int n10, int n11, int n12) {
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        boolean bl;
        int n18;
        int n19;
        int n20 = -1;
        int n21 = n8 << 3;
        int n22 = n8 > 1 ? 1 : 0;
        int n23 = n9 << 3;
        int n24 = 0;
        int n25 = 64;
        for (int i = 0; i < 6; ++i) {
            n19 = n24 + n25 >> 1;
            n18 = 0;
            bl = false;
            n17 = n2;
            while (n17-- > n) {
                n16 = nArray[n17] + (n19 * nArray2[n17] >> 6);
                if (n16 >= nArray3[n17] || bl) {
                    bl = true;
                    n18 += Inlines.IMIN((int)n16, (int)nArray4[n17]);
                    continue;
                }
                if (n16 < n21) continue;
                n18 += n21;
            }
            if (n18 > n4) {
                n25 = n19;
                continue;
            }
            n24 = n19;
        }
        n18 = 0;
        bl = false;
        n17 = n2;
        while (n17-- > n) {
            n19 = nArray[n17] + (n24 * nArray2[n17] >> 6);
            if (n19 < nArray3[n17] && !bl) {
                n19 = n19 >= n21 ? n21 : 0;
            } else {
                bl = true;
            }
            nArray5[n17] = n19 = Inlines.IMIN((int)n19, (int)nArray4[n17]);
            n18 += n19;
        }
        n20 = n2;
        while (true) {
            if ((n17 = n20 - 1) <= n3) {
                n4 += n5;
                break;
            }
            n15 = n4 - n18;
            n14 = Inlines.celt_udiv((int)n15, (int)(celtMode.eBands[n20] - celtMode.eBands[n]));
            n16 = nArray5[n17] + n14 * (n19 = celtMode.eBands[n20] - celtMode.eBands[n17]) + (n13 = Inlines.IMAX((int)((n15 -= (celtMode.eBands[n20] - celtMode.eBands[n]) * n14) - (celtMode.eBands[n17] - celtMode.eBands[n])), (int)0));
            if (n16 >= Inlines.IMAX((int)nArray3[n17], (int)(n21 + 8))) {
                if (n10 != 0) {
                    if (n20 <= n + 2 || n16 > (n17 < n11 ? 7 : 9) * n19 << n9 << 3 >> 4 && n17 <= n12) {
                        entropyCoder.enc_bit_logp(1, 1);
                        break;
                    }
                    entropyCoder.enc_bit_logp(0, 1);
                } else if (entropyCoder.dec_bit_logp(1L) != 0) break;
                n18 += 8;
                n16 -= 8;
            }
            n18 -= nArray5[n17] + n6;
            if (n6 > 0) {
                n6 = LOG2_FRAC_TABLE[n17 - n];
            }
            n18 += n6;
            if (n16 >= n21) {
                n18 += n21;
                nArray5[n17] = n21;
            } else {
                nArray5[n17] = 0;
            }
            --n20;
        }
        Inlines.OpusAssert((n20 > n ? 1 : 0) != 0);
        if (n6 > 0) {
            if (n10 != 0) {
                boxedValueInt2.Val = Inlines.IMIN((int)boxedValueInt2.Val, (int)n20);
                entropyCoder.enc_uint((long)(boxedValueInt2.Val - n), (long)(n20 + 1 - n));
            } else {
                boxedValueInt2.Val = n + (int)entropyCoder.dec_uint((long)(n20 + 1 - n));
            }
        } else {
            boxedValueInt2.Val = 0;
        }
        if (boxedValueInt2.Val <= n) {
            n4 += n7;
            n7 = 0;
        }
        if (n7 > 0) {
            if (n10 != 0) {
                entropyCoder.enc_bit_logp(boxedValueInt3.Val, 1);
            } else {
                boxedValueInt3.Val = entropyCoder.dec_bit_logp(1L);
            }
        } else {
            boxedValueInt3.Val = 0;
        }
        n15 = n4 - n18;
        n14 = Inlines.celt_udiv((int)n15, (int)(celtMode.eBands[n20] - celtMode.eBands[n]));
        n15 -= (celtMode.eBands[n20] - celtMode.eBands[n]) * n14;
        for (n17 = n; n17 < n20; ++n17) {
            int n26 = n17;
            nArray5[n26] = nArray5[n26] + n14 * (celtMode.eBands[n17 + 1] - celtMode.eBands[n17]);
        }
        n17 = n;
        while (n17 < n20) {
            n19 = Inlines.IMIN((int)n15, (int)(celtMode.eBands[n17 + 1] - celtMode.eBands[n17]));
            int n27 = n17++;
            nArray5[n27] = nArray5[n27] + n19;
            n15 -= n19;
        }
        int n28 = 0;
        for (n17 = n; n17 < n20; ++n17) {
            int n29;
            Inlines.OpusAssert((nArray5[n17] >= 0 ? 1 : 0) != 0);
            n19 = celtMode.eBands[n17 + 1] - celtMode.eBands[n17];
            n16 = n19 << n9;
            int n30 = nArray5[n17] + n28;
            if (n16 > 1) {
                n29 = Inlines.MAX32((int)(n30 - nArray4[n17]), (int)0);
                nArray5[n17] = n30 - n29;
                n13 = n8 * n16 + (n8 == 2 && n16 > 2 && boxedValueInt3.Val == 0 && n17 < boxedValueInt2.Val ? 1 : 0);
                int n31 = n13 * (celtMode.logN[n17] + n23);
                int n32 = (n31 >> 1) - n13 * 21;
                if (n16 == 2) {
                    n32 += n13 << 3 >> 2;
                }
                if (nArray5[n17] + n32 < n13 * 2 << 3) {
                    n32 += n31 >> 2;
                } else if (nArray5[n17] + n32 < n13 * 3 << 3) {
                    n32 += n31 >> 3;
                }
                nArray6[n17] = Inlines.IMAX((int)0, (int)(nArray5[n17] + n32 + (n13 << 2)));
                nArray6[n17] = Inlines.celt_udiv((int)nArray6[n17], (int)n13) >> 3;
                if (n8 * nArray6[n17] > nArray5[n17] >> 3) {
                    nArray6[n17] = nArray5[n17] >> n22 >> 3;
                }
                nArray6[n17] = Inlines.IMIN((int)nArray6[n17], (int)8);
                nArray7[n17] = nArray6[n17] * (n13 << 3) >= nArray5[n17] + n32 ? 1 : 0;
                int n33 = n17;
                nArray5[n33] = nArray5[n33] - (n8 * nArray6[n17] << 3);
            } else {
                n29 = Inlines.MAX32((int)0, (int)(n30 - (n8 << 3)));
                nArray5[n17] = n30 - n29;
                nArray6[n17] = 0;
                nArray7[n17] = 1;
            }
            if (n29 > 0) {
                int n34 = Inlines.IMIN((int)(n29 >> n22 + 3), (int)(8 - nArray6[n17]));
                int n35 = n17;
                nArray6[n35] = nArray6[n35] + n34;
                int n36 = n34 * n8 << 3;
                nArray7[n17] = n36 >= n29 - n28 ? 1 : 0;
                n29 -= n36;
            }
            n28 = n29;
            Inlines.OpusAssert((nArray5[n17] >= 0 ? 1 : 0) != 0);
            Inlines.OpusAssert((nArray6[n17] >= 0 ? 1 : 0) != 0);
        }
        boxedValueInt.Val = n28;
        while (n17 < n2) {
            nArray6[n17] = nArray5[n17] >> n22 >> 3;
            Inlines.OpusAssert((n8 * nArray6[n17] << 3 == nArray5[n17] ? 1 : 0) != 0);
            nArray5[n17] = 0;
            nArray7[n17] = nArray6[n17] < 1 ? 1 : 0;
            ++n17;
        }
        return n20;
    }

    static int bits2pulses(CeltMode celtMode, int n, int n2, int n3) {
        short[] sArray = celtMode.cache.bits;
        short s = celtMode.cache.index[++n2 * celtMode.nbEBands + n];
        int n4 = 0;
        int n5 = sArray[s];
        --n3;
        for (int i = 0; i < 6; ++i) {
            int n6 = n4 + n5 + 1 >> 1;
            if (sArray[s + n6] >= n3) {
                n5 = n6;
                continue;
            }
            n4 = n6;
        }
        if (n3 - (n4 == 0 ? -1 : sArray[s + n4]) <= sArray[s + n5] - n3) {
            return n4;
        }
        return n5;
    }

    static int pulses2bits(CeltMode celtMode, int n, int n2, int n3) {
        return n3 == 0 ? 0 : celtMode.cache.bits[celtMode.cache.index[++n2 * celtMode.nbEBands + n] + n3] + 1;
    }

    static int get_pulses(int n) {
        return n < 8 ? n : 8 + (n & 7) << (n >> 3) - 1;
    }

    static int compute_allocation(CeltMode celtMode, int n, int n2, int[] nArray, int[] nArray2, int n3, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, int n4, BoxedValueInt boxedValueInt3, int[] nArray3, int[] nArray4, int[] nArray5, int n5, int n6, EntropyCoder entropyCoder, int n7, int n8, int n9) {
        int n10;
        int n11;
        int n12;
        int n13;
        n4 = Inlines.IMAX((int)n4, (int)0);
        int n14 = celtMode.nbEBands;
        int n15 = n;
        int n16 = n4 >= 8 ? 8 : 0;
        n4 -= n16;
        int n17 = 0;
        int n18 = 0;
        if (n5 == 2) {
            n18 = LOG2_FRAC_TABLE[n2 - n];
            if (n18 > n4) {
                n18 = 0;
            } else {
                n17 = (n4 -= n18) >= 8 ? 8 : 0;
                n4 -= n17;
            }
        }
        int[] nArray6 = new int[n14];
        int[] nArray7 = new int[n14];
        int[] nArray8 = new int[n14];
        int[] nArray9 = new int[n14];
        for (n13 = n; n13 < n2; ++n13) {
            nArray8[n13] = Inlines.IMAX((int)(n5 << 3), (int)(3 * (celtMode.eBands[n13 + 1] - celtMode.eBands[n13]) << n6 << 3 >> 4));
            nArray9[n13] = n5 * (celtMode.eBands[n13 + 1] - celtMode.eBands[n13]) * (n3 - 5 - n6) * (n2 - n13 - 1) * (1 << n6 + 3) >> 6;
            if (celtMode.eBands[n13 + 1] - celtMode.eBands[n13] << n6 != 1) continue;
            int n19 = n13;
            nArray9[n19] = nArray9[n19] - (n5 << 3);
        }
        int n20 = 1;
        int n21 = celtMode.nbAllocVectors - 1;
        do {
            n12 = 0;
            n11 = 0;
            n10 = n20 + n21 >> 1;
            n13 = n2;
            while (n13-- > n) {
                int n22 = celtMode.eBands[n13 + 1] - celtMode.eBands[n13];
                int n23 = n5 * n22 * celtMode.allocVectors[n10 * n14 + n13] << n6 >> 2;
                if (n23 > 0) {
                    n23 = Inlines.IMAX((int)0, (int)(n23 + nArray9[n13]));
                }
                if ((n23 += nArray[n13]) >= nArray8[n13] || n12 != 0) {
                    n12 = 1;
                    n11 += Inlines.IMIN((int)n23, (int)nArray2[n13]);
                    continue;
                }
                if (n23 < n5 << 3) continue;
                n11 += n5 << 3;
            }
            if (n11 > n4) {
                n21 = n10 - 1;
                continue;
            }
            n20 = n10 + 1;
        } while (n20 <= n21);
        n21 = n20--;
        for (n13 = n; n13 < n2; ++n13) {
            n10 = celtMode.eBands[n13 + 1] - celtMode.eBands[n13];
            n12 = n5 * n10 * celtMode.allocVectors[n20 * n14 + n13] << n6 >> 2;
            int n24 = n11 = n21 >= celtMode.nbAllocVectors ? nArray2[n13] : n5 * n10 * celtMode.allocVectors[n21 * n14 + n13] << n6 >> 2;
            if (n12 > 0) {
                n12 = Inlines.IMAX((int)0, (int)(n12 + nArray9[n13]));
            }
            if (n11 > 0) {
                n11 = Inlines.IMAX((int)0, (int)(n11 + nArray9[n13]));
            }
            if (n20 > 0) {
                n12 += nArray[n13];
            }
            n11 += nArray[n13];
            if (nArray[n13] > 0) {
                n15 = n13;
            }
            n11 = Inlines.IMAX((int)0, (int)(n11 - n12));
            nArray6[n13] = n12;
            nArray7[n13] = n11;
        }
        int n25 = Rate.interp_bits2pulses(celtMode, n, n2, n15, nArray6, nArray7, nArray8, nArray2, n4, boxedValueInt3, n16, boxedValueInt, n18, boxedValueInt2, n17, nArray3, nArray4, nArray5, n5, n6, entropyCoder, n7, n8, n9);
        return n25;
    }
}

