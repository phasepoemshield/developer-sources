/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Rate
 *  de.maxhenkel.voicechat.concentus.VQ
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Bands$band_ctx;
import de.maxhenkel.voicechat.concentus.Bands$split_ctx;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.CeltTables;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Kernels;
import de.maxhenkel.voicechat.concentus.Rate;
import de.maxhenkel.voicechat.concentus.VQ;

class Bands {
    private static final byte[] bit_interleave_table = new byte[]{0, 1, 1, 1, 2, 3, 3, 3, 2, 3, 3, 3, 2, 3, 3, 3};
    private static final short[] bit_deinterleave_table;

    Bands() {
    }

    static {
        short[] sArray = new short[16];
        sArray[0] = 0;
        sArray[1] = 3;
        sArray[2] = 12;
        sArray[3] = 15;
        sArray[4] = 48;
        sArray[5] = 51;
        sArray[6] = 60;
        sArray[7] = 63;
        sArray[8] = 192;
        sArray[9] = 195;
        sArray[10] = 204;
        sArray[11] = 207;
        sArray[12] = 240;
        sArray[13] = 243;
        sArray[14] = 252;
        sArray[15] = 255;
        bit_deinterleave_table = sArray;
    }

    static void denormalise_bands(CeltMode celtMode, int[] nArray, int[] nArray2, int n, int[] nArray3, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        short[] sArray = celtMode.eBands;
        int n9 = n5 * celtMode.shortMdctSize;
        int n10 = n5 * sArray[n4];
        if (n6 != 1) {
            n10 = Inlines.IMIN(n10, n9 / n6);
        }
        if (n7 != 0) {
            n10 = 0;
            n4 = 0;
            n3 = 0;
        }
        int n11 = n;
        int n12 = n5 * sArray[n3];
        for (n8 = 0; n8 < n5 * sArray[n3]; ++n8) {
            nArray2[n11++] = 0;
        }
        for (n8 = n3; n8 < n4; ++n8) {
            int n13;
            int n14 = n5 * sArray[n8];
            int n15 = n5 * sArray[n8 + 1];
            int n16 = Inlines.ADD16(nArray3[n2 + n8], (int)Inlines.SHL16(CeltTables.eMeans[n8], 6));
            int n17 = 16 - (n16 >> 10);
            if (n17 > 31) {
                n17 = 0;
                n13 = 0;
            } else {
                n13 = Inlines.celt_exp2_frac(n16 & 0x3FF);
            }
            if (n17 < 0) {
                if (n17 < -2) {
                    n13 = Short.MAX_VALUE;
                    n17 = -2;
                }
                do {
                    nArray2[n11] = Inlines.SHR32(Inlines.MULT16_16(nArray[n12], n13), -n17);
                } while (++n14 < n15);
                continue;
            }
            do {
                nArray2[n11++] = Inlines.SHR32(Inlines.MULT16_16(nArray[n12++], n13), n17);
            } while (++n14 < n15);
        }
        Inlines.OpusAssert(n3 <= n4);
        Arrays.MemSetWithOffset(nArray2, 0, n + n10, n9 - n10);
    }

    static void normalise_bands(CeltMode celtMode, int[][] nArray, int[][] nArray2, int[][] nArray3, int n, int n2, int n3) {
        short[] sArray = celtMode.eBands;
        int n4 = 0;
        do {
            int n5 = 0;
            do {
                int n6 = Inlines.celt_zlog2(nArray3[n4][n5]) - 13;
                int n7 = Inlines.VSHR32(nArray3[n4][n5], n6);
                short s = Inlines.EXTRACT16(Inlines.celt_rcp(Inlines.SHL32(n7, 3)));
                int n8 = n3 * sArray[n5];
                do {
                    nArray2[n4][n8] = Inlines.MULT16_16_Q15(Inlines.VSHR32(nArray[n4][n8], n6 - 1), (int)s);
                } while (++n8 < n3 * sArray[n5 + 1]);
            } while (++n5 < n);
        } while (++n4 < n2);
    }

    static void anti_collapse(CeltMode celtMode, int[][] nArray, short[] sArray, int n, int n2, int n3, int n4, int n5, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int n6) {
        for (int i = n4; i < n5; ++i) {
            int n7 = celtMode.eBands[i + 1] - celtMode.eBands[i];
            Inlines.OpusAssert(nArray5[i] >= 0);
            int n8 = Inlines.celt_udiv(1 + nArray5[i], celtMode.eBands[i + 1] - celtMode.eBands[i]) >> n;
            int n9 = Inlines.SHR32(Inlines.celt_exp2(0 - Inlines.SHL16(n8, 7)), 1);
            int n10 = Inlines.MULT16_32_Q15((short)16384, Inlines.MIN32(Short.MAX_VALUE, n9));
            int n11 = n7 << n;
            int n12 = Inlines.celt_ilog2(n11) >> 1;
            n11 = Inlines.SHL32(n11, 7 - n12 << 1);
            int n13 = Inlines.celt_rsqrt_norm(n11);
            int n14 = 0;
            do {
                int n15;
                int n16;
                boolean bl = false;
                int n17 = nArray3[n14 * celtMode.nbEBands + i];
                int n18 = nArray4[n14 * celtMode.nbEBands + i];
                if (n2 == 1) {
                    n17 = Inlines.MAX16(n17, nArray3[celtMode.nbEBands + i]);
                    n18 = Inlines.MAX16(n18, nArray4[celtMode.nbEBands + i]);
                }
                int n19 = Inlines.EXTEND32(nArray2[n14 * celtMode.nbEBands + i]) - Inlines.EXTEND32(Inlines.MIN16(n17, n18));
                n19 = Inlines.MAX32(0, n19);
                if (n19 < 16384) {
                    n16 = Inlines.SHR32(Inlines.celt_exp2((short)(0 - Inlines.EXTRACT16(n19))), 1);
                    n15 = 2 * Inlines.MIN16(16383, n16);
                } else {
                    n15 = 0;
                }
                if (n == 3) {
                    n15 = Inlines.MULT16_16_Q14(23170, Inlines.MIN32(23169, n15));
                }
                n15 = Inlines.SHR16(Inlines.MIN16(n10, n15), 1);
                n15 = Inlines.SHR32(Inlines.MULT16_16_Q15(n13, n15), n12);
                n11 = celtMode.eBands[i] << n;
                for (int j = 0; j < 1 << n; ++j) {
                    if ((sArray[i * n2 + n14] & 1 << j) != 0) continue;
                    n16 = n11 + j;
                    for (int k = 0; k < n7; ++k) {
                        n6 = Bands.celt_lcg_rand(n6);
                        nArray[n14][n16 + (k << n)] = (n6 & 0x8000) != 0 ? n15 : 0 - n15;
                    }
                    bl = true;
                }
                if (!bl) continue;
                VQ.renormalise_vector((int[])nArray[n14], (int)n11, (int)(n7 << n), (int)Short.MAX_VALUE);
            } while (++n14 < n2);
        }
    }

    static int bitexact_log2tan(int n, int n2) {
        int n3 = Inlines.EC_ILOG(n2);
        int n4 = Inlines.EC_ILOG(n);
        n2 <<= 15 - n3;
        n <<= 15 - n4;
        return (n4 - n3) * 2048 + Inlines.FRAC_MUL16(n, Inlines.FRAC_MUL16(n, -2597) + 7932) - Inlines.FRAC_MUL16(n2, Inlines.FRAC_MUL16(n2, -2597) + 7932);
    }

    static int bitexact_cos(int n) {
        int n2 = 4096 + n * n >> 13;
        Inlines.OpusAssert(n2 <= Short.MAX_VALUE);
        int n3 = n2;
        n3 = Short.MAX_VALUE - n3 + Inlines.FRAC_MUL16(n3, -7651 + Inlines.FRAC_MUL16(n3, 8277 + Inlines.FRAC_MUL16(-626, n3)));
        Inlines.OpusAssert(n3 <= 32766);
        return 1 + n3;
    }

    static int celt_lcg_rand(int n) {
        return 1664525 * n + 1013904223;
    }

    static void quant_all_bands(int n, CeltMode celtMode, int n2, int n3, int[] nArray, int[] nArray2, short[] sArray, int[][] nArray3, int[] nArray4, int n4, int n5, int n6, int n7, int[] nArray5, int n8, int n9, EntropyCoder entropyCoder, int n10, int n11, BoxedValueInt boxedValueInt) {
        short[] sArray2 = celtMode.eBands;
        boolean bl = true;
        int n12 = nArray2 != null ? 2 : 1;
        boolean bl2 = n == 0;
        Bands$band_ctx bands$band_ctx = new Bands$band_ctx();
        int n13 = 1 << n10;
        int n14 = n4 != 0 ? n13 : 1;
        int n15 = n13 * sArray2[n2];
        int[] nArray6 = new int[n12 * (n13 * sArray2[celtMode.nbEBands - 1] - n15)];
        int n16 = n13 * sArray2[celtMode.nbEBands - 1] - n15;
        int[] nArray7 = nArray;
        int n17 = n13 * sArray2[celtMode.nbEBands - 1];
        int n18 = 0;
        bands$band_ctx.bandE = nArray3;
        bands$band_ctx.ec = entropyCoder;
        bands$band_ctx.encode = n;
        bands$band_ctx.intensity = n7;
        bands$band_ctx.m = celtMode;
        bands$band_ctx.seed = boxedValueInt.Val;
        bands$band_ctx.spread = n5;
        for (int i = n2; i < n3; ++i) {
            long l;
            long l2;
            int n19;
            int n20;
            int n21;
            int[] nArray8;
            int n22 = -1;
            int n23 = 0;
            int n24 = 0;
            bands$band_ctx.i = i;
            boolean bl3 = i == n3 - 1;
            int[] nArray9 = nArray;
            int n25 = n13 * sArray2[i];
            if (nArray2 != null) {
                nArray8 = nArray2;
                n23 = n13 * sArray2[i];
            } else {
                nArray8 = null;
            }
            int n26 = n13 * sArray2[i + 1] - n13 * sArray2[i];
            int n27 = entropyCoder.tell_frac();
            if (i != n2) {
                n9 -= n27;
            }
            bands$band_ctx.remaining_bits = n21 = n8 - n27 - 1;
            if (i <= n11 - 1) {
                int n28 = Inlines.celt_sudiv(n9, Inlines.IMIN(3, n11 - i));
                n20 = Inlines.IMAX(0, Inlines.IMIN(16383, Inlines.IMIN(n21 + 1, nArray4[i] + n28)));
            } else {
                n20 = 0;
            }
            if (bl2 && n13 * sArray2[i] - n26 >= n13 * sArray2[n2] && (bl || n18 == 0)) {
                n18 = i;
            }
            bands$band_ctx.tf_change = n24 = nArray5[i];
            if (i >= celtMode.effEBands) {
                nArray9 = nArray6;
                n25 = 0;
                if (nArray2 != null) {
                    nArray8 = nArray6;
                    n23 = 0;
                }
                nArray7 = null;
            }
            if (i == n3 - 1) {
                nArray7 = null;
            }
            if (n18 != 0 && (n5 != 3 || n14 > 1 || n24 < 0)) {
                n22 = Inlines.IMAX(0, n13 * sArray2[n18] - n15 - n26);
                n19 = n18;
                while (n13 * sArray2[--n19] > n22 + n15) {
                }
                int n29 = n18 - 1;
                while (n13 * sArray2[++n29] < n22 + n15 + n26) {
                }
                l2 = 0L;
                l = 0L;
                int n30 = n19;
                do {
                    l |= (long)sArray[n30 * n12 + 0];
                    l2 |= (long)sArray[n30 * n12 + n12 - 1];
                } while (++n30 < n29);
            } else {
                l = l2 = (long)((1 << n14) - 1);
            }
            if (n6 != 0 && i == n7) {
                n6 = 0;
                if (bl2) {
                    for (n19 = 0; n19 < n13 * sArray2[i] - n15; ++n19) {
                        nArray6[n19] = Inlines.HALF32(nArray6[n19] + nArray6[n16 + n19]);
                    }
                }
            }
            if (n6 != 0) {
                l = Bands.quant_band(bands$band_ctx, nArray9, n25, n26, n20 / 2, n14, (int[])(n22 != -1 ? nArray6 : null), n22, n10, bl3 ? null : nArray6, n13 * sArray2[i] - n15, Short.MAX_VALUE, nArray7, n17, (int)l);
                l2 = Bands.quant_band(bands$band_ctx, nArray8, n23, n26, n20 / 2, n14, (int[])(n22 != -1 ? nArray6 : null), n16 + n22, n10, bl3 ? null : nArray6, n16 + (n13 * sArray2[i] - n15), Short.MAX_VALUE, nArray7, n17, (int)l2);
            } else {
                l = nArray8 != null ? (long)Bands.quant_band_stereo(bands$band_ctx, nArray9, n25, nArray8, n23, n26, n20, n14, (int[])(n22 != -1 ? nArray6 : null), n22, n10, bl3 ? null : nArray6, n13 * sArray2[i] - n15, nArray7, n17, (int)(l | l2)) : (long)Bands.quant_band(bands$band_ctx, nArray9, n25, n26, n20, n14, (int[])(n22 != -1 ? nArray6 : null), n22, n10, bl3 ? null : nArray6, n13 * sArray2[i] - n15, Short.MAX_VALUE, nArray7, n17, (int)(l | l2));
                l2 = l;
            }
            sArray[i * n12 + 0] = (short)(l & 0xFFL);
            sArray[i * n12 + n12 - 1] = (short)(l2 & 0xFFL);
            n9 += nArray4[i] + n27;
            bl = n20 > n26 << 3;
        }
        boxedValueInt.Val = bands$band_ctx.seed;
    }

    static void stereo_split(int[] nArray, int n, int[] nArray2, int n2, int n3) {
        for (int i = 0; i < n3; ++i) {
            int n4 = Inlines.MULT16_16(23170, nArray[n + i]);
            int n5 = Inlines.MULT16_16(23170, nArray2[n2 + i]);
            nArray[n + i] = Inlines.EXTRACT16(Inlines.SHR32(Inlines.ADD32(n4, n5), 15));
            nArray2[n2 + i] = Inlines.EXTRACT16(Inlines.SHR32(Inlines.SUB32(n5, n4), 15));
        }
    }

    static void compute_theta(Bands$band_ctx bands$band_ctx, Bands$split_ctx bands$split_ctx, int[] nArray, int n, int[] nArray2, int n2, int n3, BoxedValueInt boxedValueInt, int n4, int n5, int n6, int n7, BoxedValueInt boxedValueInt2) {
        int n8;
        int n9;
        int n10;
        int n11 = 0;
        int n12 = 0;
        int n13 = bands$band_ctx.encode;
        CeltMode celtMode = bands$band_ctx.m;
        int n14 = bands$band_ctx.i;
        int n15 = bands$band_ctx.intensity;
        EntropyCoder entropyCoder = bands$band_ctx.ec;
        int[][] nArray3 = bands$band_ctx.bandE;
        int n16 = celtMode.logN[n14] + n6 * 8;
        int n17 = (n16 >> 1) - (n7 != 0 && n3 == 2 ? 16 : 4);
        int n18 = Bands.compute_qn(n3, boxedValueInt.Val, n17, n16, n7);
        if (n7 != 0 && n14 >= n15) {
            n18 = 1;
        }
        if (n13 != 0) {
            n11 = VQ.stereo_itheta((int[])nArray, (int)n, (int[])nArray2, (int)n2, (int)n7, (int)n3);
        }
        int n19 = entropyCoder.tell_frac();
        if (n18 != 1) {
            if (n13 != 0) {
                n11 = n11 * n18 + 8192 >> 14;
            }
            if (n7 != 0 && n3 > 2) {
                int n20 = 3;
                int n21 = n11;
                int n22 = n18 / 2;
                long l = Inlines.CapToUInt32(n20 * (n22 + 1) + n22);
                if (n13 != 0) {
                    entropyCoder.encode(n21 <= n22 ? n20 * n21 : n21 - 1 - n22 + (n22 + 1) * n20, n21 <= n22 ? n20 * (n21 + 1) : n21 - n22 + (n22 + 1) * n20, l);
                } else {
                    int n23 = (int)entropyCoder.decode(l);
                    n21 = n23 < (n22 + 1) * n20 ? n23 / n20 : n22 + 1 + (n23 - (n22 + 1) * n20);
                    entropyCoder.dec_update(n21 <= n22 ? n20 * n21 : n21 - 1 - n22 + (n22 + 1) * n20, n21 <= n22 ? n20 * (n21 + 1) : n21 - n22 + (n22 + 1) * n20, l);
                    n11 = n21;
                }
            } else if (n5 > 1 || n7 != 0) {
                if (n13 != 0) {
                    entropyCoder.enc_uint(n11, n18 + 1);
                } else {
                    n11 = (int)entropyCoder.dec_uint(n18 + 1);
                }
            } else {
                int n24 = 1;
                int n25 = ((n18 >> 1) + 1) * ((n18 >> 1) + 1);
                if (n13 != 0) {
                    n24 = n11 <= n18 >> 1 ? n11 + 1 : n18 + 1 - n11;
                    int n26 = n11 <= n18 >> 1 ? n11 * (n11 + 1) >> 1 : n25 - ((n18 + 1 - n11) * (n18 + 2 - n11) >> 1);
                    entropyCoder.encode(n26, n26 + n24, n25);
                } else {
                    int n27 = 0;
                    int n28 = (int)entropyCoder.decode(n25);
                    if (n28 < (n18 >> 1) * ((n18 >> 1) + 1) >> 1) {
                        n11 = Inlines.isqrt32(8 * n28 + 1) - 1 >> 1;
                        n24 = n11 + 1;
                        n27 = n11 * (n11 + 1) >> 1;
                    } else {
                        n11 = 2 * (n18 + 1) - Inlines.isqrt32(8 * (n25 - n28 - 1) + 1) >> 1;
                        n24 = n18 + 1 - n11;
                        n27 = n25 - ((n18 + 1 - n11) * (n18 + 2 - n11) >> 1);
                    }
                    entropyCoder.dec_update(n27, n27 + n24, n25);
                }
            }
            Inlines.OpusAssert(n11 >= 0);
            n11 = Inlines.celt_udiv(n11 * 16384, n18);
            if (n13 != 0 && n7 != 0) {
                if (n11 == 0) {
                    Bands.intensity_stereo(celtMode, nArray, n, nArray2, n2, nArray3, n14, n3);
                } else {
                    Bands.stereo_split(nArray, n, nArray2, n2, n3);
                }
            }
        } else if (n7 != 0) {
            if (n13 != 0) {
                int n29 = n12 = n11 > 8192 ? 1 : 0;
                if (n12 != 0) {
                    for (int i = 0; i < n3; ++i) {
                        nArray2[n2 + i] = 0 - nArray2[n2 + i];
                    }
                }
                Bands.intensity_stereo(celtMode, nArray, n, nArray2, n2, nArray3, n14, n3);
            }
            if (boxedValueInt.Val > 16 && bands$band_ctx.remaining_bits > 16) {
                if (n13 != 0) {
                    entropyCoder.enc_bit_logp(n12, 2);
                } else {
                    n12 = entropyCoder.dec_bit_logp(2L);
                }
            } else {
                n12 = 0;
            }
            n11 = 0;
        }
        int n30 = entropyCoder.tell_frac() - n19;
        boxedValueInt.Val -= n30;
        if (n11 == 0) {
            n10 = Short.MAX_VALUE;
            n9 = 0;
            boxedValueInt2.Val &= (1 << n4) - 1;
            n8 = -16384;
        } else if (n11 == 16384) {
            n10 = 0;
            n9 = Short.MAX_VALUE;
            boxedValueInt2.Val &= (1 << n4) - 1 << n4;
            n8 = 16384;
        } else {
            n10 = Bands.bitexact_cos((short)n11);
            n9 = Bands.bitexact_cos((short)(16384 - n11));
            n8 = Inlines.FRAC_MUL16(n3 - 1 << 7, Bands.bitexact_log2tan(n9, n10));
        }
        bands$split_ctx.inv = n12;
        bands$split_ctx.imid = n10;
        bands$split_ctx.iside = n9;
        bands$split_ctx.delta = n8;
        bands$split_ctx.itheta = n11;
        bands$split_ctx.qalloc = n30;
    }

    static void haar1ZeroOffset(int[] nArray, int n, int n2) {
        n >>= 1;
        for (int i = 0; i < n2; ++i) {
            for (int j = 0; j < n; ++j) {
                int n3 = i + n2 * 2 * j;
                int n4 = Inlines.MULT16_16(23170, nArray[n3]);
                int n5 = Inlines.MULT16_16(23170, nArray[n3 + n2]);
                nArray[n3] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.ADD32(n4, n5), 15));
                nArray[n3 + n2] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.SUB32(n4, n5), 15));
            }
        }
    }

    static int quant_partition(Bands$band_ctx bands$band_ctx, int[] nArray, int n, int n2, int n3, int n4, int[] nArray2, int n5, int n6, int n7, int n8) {
        int n9 = 0;
        int n10 = 0;
        int n11 = n4;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        boolean bl = bands$band_ctx.encode == 0;
        int n15 = 0;
        int n16 = bands$band_ctx.encode;
        CeltMode celtMode = bands$band_ctx.m;
        int n17 = bands$band_ctx.i;
        int n18 = bands$band_ctx.spread;
        EntropyCoder entropyCoder = bands$band_ctx.ec;
        short[] sArray = celtMode.cache.bits;
        short s = celtMode.cache.index[(n6 + 1) * celtMode.nbEBands + n17];
        if (n6 != -1 && n3 > sArray[s + sArray[s]] + 12 && n2 > 2) {
            Bands$split_ctx bands$split_ctx = new Bands$split_ctx();
            int n19 = 0;
            n15 = n + (n2 >>= 1);
            --n6;
            if (n4 == 1) {
                n8 = n8 & 1 | n8 << 1;
            }
            n4 = n4 + 1 >> 1;
            BoxedValueInt boxedValueInt = new BoxedValueInt(n3);
            BoxedValueInt boxedValueInt2 = new BoxedValueInt(n8);
            Bands.compute_theta(bands$band_ctx, bands$split_ctx, nArray, n, nArray, n15, n2, boxedValueInt, n4, n11, n6, 0, boxedValueInt2);
            n3 = boxedValueInt.Val;
            n8 = boxedValueInt2.Val;
            n9 = bands$split_ctx.imid;
            n10 = bands$split_ctx.iside;
            int n20 = bands$split_ctx.delta;
            int n21 = bands$split_ctx.itheta;
            int n22 = bands$split_ctx.qalloc;
            n12 = n9;
            n13 = n10;
            if (n11 > 1) {
                if ((n21 & 0x3FFF) != 0) {
                    n20 = n21 > 8192 ? (n20 -= n20 >> 4 - n6) : Inlines.IMIN(0, n20 + (n2 << 3 >> 5 - n6));
                }
            }
            int n23 = Inlines.IMAX(0, Inlines.IMIN(n3, (n3 - n20) / 2));
            int n24 = n3 - n23;
            bands$band_ctx.remaining_bits -= n22;
            if (nArray2 != null) {
                n19 = n5 + n2;
            }
            int n25 = bands$band_ctx.remaining_bits;
            if (n23 >= n24) {
                n14 = Bands.quant_partition(bands$band_ctx, nArray, n, n2, n23, n4, nArray2, n5, n6, Inlines.MULT16_16_P15(n7, n12), n8);
                if ((n25 = n23 - (n25 - bands$band_ctx.remaining_bits)) > 24 && n21 != 0) {
                    n24 += n25 - 24;
                }
                n14 |= Bands.quant_partition(bands$band_ctx, nArray, n15, n2, n24, n4, nArray2, n19, n6, Inlines.MULT16_16_P15(n7, n13), n8 >> n4) << (n11 >> 1);
            } else {
                n14 = Bands.quant_partition(bands$band_ctx, nArray, n15, n2, n24, n4, nArray2, n19, n6, Inlines.MULT16_16_P15(n7, n13), n8 >> n4) << (n11 >> 1);
                if ((n25 = n24 - (n25 - bands$band_ctx.remaining_bits)) > 24) {
                    if (n21 != 16384) {
                        n23 += n25 - 24;
                    }
                }
                n14 |= Bands.quant_partition(bands$band_ctx, nArray, n, n2, n23, n4, nArray2, n5, n6, Inlines.MULT16_16_P15(n7, n12), n8);
            }
        } else {
            int n26 = Rate.bits2pulses((CeltMode)celtMode, (int)n17, (int)n6, (int)n3);
            int n27 = Rate.pulses2bits((CeltMode)celtMode, (int)n17, (int)n6, (int)n26);
            bands$band_ctx.remaining_bits -= n27;
            while (bands$band_ctx.remaining_bits < 0 && n26 > 0) {
                bands$band_ctx.remaining_bits += n27;
                n27 = Rate.pulses2bits((CeltMode)celtMode, (int)n17, (int)n6, (int)(--n26));
                bands$band_ctx.remaining_bits -= n27;
            }
            if (n26 != 0) {
                int n28 = Rate.get_pulses((int)n26);
                n14 = n16 != 0 ? VQ.alg_quant((int[])nArray, (int)n, (int)n2, (int)n28, (int)n18, (int)n4, (EntropyCoder)entropyCoder) : VQ.alg_unquant((int[])nArray, (int)n, (int)n2, (int)n28, (int)n18, (int)n4, (EntropyCoder)entropyCoder, (int)n7);
            } else if (bl) {
                int n29 = (1 << n4) - 1;
                if ((n8 &= n29) == 0) {
                    Arrays.MemSetWithOffset(nArray, 0, n, n2);
                } else {
                    if (nArray2 == null) {
                        for (int i = 0; i < n2; ++i) {
                            bands$band_ctx.seed = Bands.celt_lcg_rand(bands$band_ctx.seed);
                            nArray[n + i] = bands$band_ctx.seed >> 20;
                        }
                        n14 = n29;
                    } else {
                        for (int i = 0; i < n2; ++i) {
                            bands$band_ctx.seed = Bands.celt_lcg_rand(bands$band_ctx.seed);
                            int n30 = 4;
                            n30 = (bands$band_ctx.seed & 0x8000) != 0 ? n30 : 0 - n30;
                            nArray[n + i] = nArray2[n5 + i] + n30;
                        }
                        n14 = n8;
                    }
                    VQ.renormalise_vector((int[])nArray, (int)n, (int)n2, (int)n7);
                }
            }
        }
        return n14;
    }

    static int quant_band_n1(Bands$band_ctx bands$band_ctx, int[] nArray, int n, int[] nArray2, int n2, int n3, int[] nArray3, int n4) {
        boolean bl = bands$band_ctx.encode == 0;
        int[] nArray4 = nArray;
        int n5 = n;
        int n6 = bands$band_ctx.encode;
        EntropyCoder entropyCoder = bands$band_ctx.ec;
        int n7 = nArray2 != null ? 1 : 0;
        int n8 = 0;
        do {
            int n9 = 0;
            if (bands$band_ctx.remaining_bits >= 8) {
                if (n6 != 0) {
                    n9 = nArray4[n5] < 0 ? 1 : 0;
                    entropyCoder.enc_bits(n9, 1);
                } else {
                    n9 = entropyCoder.dec_bits(1);
                }
                bands$band_ctx.remaining_bits -= 8;
                n3 -= 8;
            }
            if (bl) {
                nArray4[n5] = n9 != 0 ? -16384 : 16384;
            }
            nArray4 = nArray2;
            n5 = n2;
        } while (++n8 < 1 + n7);
        if (nArray3 != null) {
            nArray3[n4] = Inlines.SHR16(nArray[n], 4);
        }
        return 1;
    }

    static void intensity_stereo(CeltMode celtMode, int[] nArray, int n, int[] nArray2, int n2, int[][] nArray3, int n3, int n4) {
        int n5 = n3;
        int n6 = Inlines.celt_zlog2(Inlines.MAX32(nArray3[0][n5], nArray3[1][n5])) - 13;
        int n7 = Inlines.VSHR32(nArray3[0][n5], n6);
        int n8 = Inlines.VSHR32(nArray3[1][n5], n6);
        int n9 = 1 + Inlines.celt_sqrt(1 + Inlines.MULT16_16(n7, n7) + Inlines.MULT16_16(n8, n8));
        int n10 = Inlines.DIV32_16(Inlines.SHL32(n7, 14), n9);
        int n11 = Inlines.DIV32_16(Inlines.SHL32(n8, 14), n9);
        for (int i = 0; i < n4; ++i) {
            int n12 = nArray[n + i];
            int n13 = nArray2[n2 + i];
            nArray[n + i] = Inlines.EXTRACT16(Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(n10, n12), n11, n13), 14));
        }
    }

    static int quant_band_stereo(Bands$band_ctx bands$band_ctx, int[] nArray, int n, int[] nArray2, int n2, int n3, int n4, int n5, int[] nArray3, int n6, int n7, int[] nArray4, int n8, int[] nArray5, int n9, int n10) {
        int n11;
        int n12;
        int n13;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        boolean bl = bands$band_ctx.encode == 0;
        Bands$split_ctx bands$split_ctx = new Bands$split_ctx();
        int n20 = bands$band_ctx.encode;
        EntropyCoder entropyCoder = bands$band_ctx.ec;
        if (n3 == 1) {
            return Bands.quant_band_n1(bands$band_ctx, nArray, n, nArray2, n2, n4, nArray4, n8);
        }
        int n21 = n10;
        BoxedValueInt boxedValueInt = new BoxedValueInt(n4);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(n10);
        Bands.compute_theta(bands$band_ctx, bands$split_ctx, nArray, n, nArray2, n2, n3, boxedValueInt, n5, n5, n7, 1, boxedValueInt2);
        n4 = boxedValueInt.Val;
        n10 = boxedValueInt2.Val;
        n16 = bands$split_ctx.inv;
        n14 = bands$split_ctx.imid;
        n15 = bands$split_ctx.iside;
        int n22 = bands$split_ctx.delta;
        int n23 = bands$split_ctx.itheta;
        int n24 = bands$split_ctx.qalloc;
        n17 = n14;
        n18 = n15;
        if (n3 == 2) {
            int n25;
            int[] nArray6;
            int n26;
            int[] nArray7;
            int n27 = 0;
            n13 = n4;
            n12 = 0;
            if (n23 != 0) {
                if (n23 != 16384) {
                    n12 = 8;
                }
            }
            n13 -= n12;
            n11 = n23 > 8192 ? 1 : 0;
            bands$band_ctx.remaining_bits -= n24 + n12;
            if (n11 != 0) {
                nArray7 = nArray2;
                n26 = n2;
                nArray6 = nArray;
                n25 = n;
            } else {
                nArray7 = nArray;
                n26 = n;
                nArray6 = nArray2;
                n25 = n2;
            }
            if (n12 != 0) {
                if (n20 != 0) {
                    n27 = nArray7[n26] * nArray6[n2 + 1] - nArray7[n26 + 1] * nArray6[n2] < 0 ? 1 : 0;
                    entropyCoder.enc_bits(n27, 1);
                } else {
                    n27 = entropyCoder.dec_bits(1);
                }
            }
            n27 = 1 - 2 * n27;
            n19 = Bands.quant_band(bands$band_ctx, nArray7, n26, n3, n13, n5, nArray3, n6, n7, nArray4, n8, Short.MAX_VALUE, nArray5, n9, n21);
            nArray6[n2] = (0 - n27) * nArray7[n26 + 1];
            nArray6[n2 + 1] = n27 * nArray7[n26];
            if (bl) {
                nArray[n] = Inlines.MULT16_16_Q15(n17, nArray[n]);
                nArray[n + 1] = Inlines.MULT16_16_Q15(n17, nArray[n + 1]);
                nArray2[n2] = Inlines.MULT16_16_Q15(n18, nArray2[n2]);
                nArray2[n2 + 1] = Inlines.MULT16_16_Q15(n18, nArray2[n2 + 1]);
                int n28 = nArray[n];
                nArray[n] = Inlines.SUB16(n28, nArray2[n2]);
                nArray2[n2] = Inlines.ADD16(n28, nArray2[n2]);
                n28 = nArray[n + 1];
                nArray[n + 1] = Inlines.SUB16(n28, nArray2[n2 + 1]);
                nArray2[n2 + 1] = Inlines.ADD16(n28, nArray2[n2 + 1]);
            }
        } else {
            n13 = Inlines.IMAX(0, Inlines.IMIN(n4, (n4 - n22) / 2));
            n12 = n4 - n13;
            bands$band_ctx.remaining_bits -= n24;
            n11 = bands$band_ctx.remaining_bits;
            if (n13 >= n12) {
                n19 = Bands.quant_band(bands$band_ctx, nArray, n, n3, n13, n5, nArray3, n6, n7, nArray4, n8, Short.MAX_VALUE, nArray5, n9, n10);
                if ((n11 = n13 - (n11 - bands$band_ctx.remaining_bits)) > 24 && n23 != 0) {
                    n12 += n11 - 24;
                }
                n19 |= Bands.quant_band(bands$band_ctx, nArray2, n2, n3, n12, n5, null, 0, n7, null, 0, n18, null, 0, n10 >> n5);
            } else {
                n19 = Bands.quant_band(bands$band_ctx, nArray2, n2, n3, n12, n5, null, 0, n7, null, 0, n18, null, 0, n10 >> n5);
                if ((n11 = n12 - (n11 - bands$band_ctx.remaining_bits)) > 24) {
                    if (n23 != 16384) {
                        n13 += n11 - 24;
                    }
                }
                n19 |= Bands.quant_band(bands$band_ctx, nArray, n, n3, n13, n5, nArray3, n6, n7, nArray4, n8, Short.MAX_VALUE, nArray5, n9, n10);
            }
        }
        if (bl) {
            if (n3 != 2) {
                Bands.stereo_merge(nArray, n, nArray2, n2, n17, n3);
            }
            if (n16 != 0) {
                for (n11 = n2; n11 < n3 + n2; ++n11) {
                    nArray2[n11] = (short)(0 - nArray2[n11]);
                }
            }
        }
        return n19;
    }

    static int spreading_decision(CeltMode celtMode, int[][] nArray, BoxedValueInt boxedValueInt, int n, BoxedValueInt boxedValueInt2, BoxedValueInt boxedValueInt3, int n2, int n3, int n4, int n5) {
        int n6 = 0;
        int n7 = 0;
        short[] sArray = celtMode.eBands;
        int n8 = 0;
        Inlines.OpusAssert(n3 > 0);
        if (n5 * (sArray[n3] - sArray[n3 - 1]) <= 8) {
            return 0;
        }
        int n9 = 0;
        do {
            for (int i = 0; i < n3; ++i) {
                int n10 = 0;
                int[] nArray2 = new int[]{0, 0, 0};
                int[] nArray3 = nArray[n9];
                int n11 = n5 * sArray[i];
                int n12 = n5 * (sArray[i + 1] - sArray[i]);
                if (n12 <= 8) continue;
                for (int j = n11; j < n12 + n11; ++j) {
                    int n13 = Inlines.MULT16_16(Inlines.MULT16_16_Q15(nArray3[j], nArray3[j]), n12);
                    if (n13 < 2048) {
                        nArray2[0] = nArray2[0] + 1;
                    }
                    if (n13 < 512) {
                        nArray2[1] = nArray2[1] + 1;
                    }
                    if (n13 >= 128) continue;
                    nArray2[2] = nArray2[2] + 1;
                }
                if (i > celtMode.nbEBands - 4) {
                    n8 += Inlines.celt_udiv(32 * (nArray2[1] + nArray2[0]), n12);
                }
                n10 = (2 * nArray2[2] >= n12 ? 1 : 0) + (2 * nArray2[1] >= n12 ? 1 : 0) + (2 * nArray2[0] >= n12 ? 1 : 0);
                n6 += n10 * 256;
                ++n7;
            }
        } while (++n9 < n4);
        if (n2 != 0) {
            if (n8 != 0) {
                n8 = Inlines.celt_udiv(n8, n4 * (4 - celtMode.nbEBands + n3));
            }
            n8 = boxedValueInt2.Val = boxedValueInt2.Val + n8 >> 1;
            if (boxedValueInt3.Val == 2) {
                n8 += 4;
            } else if (boxedValueInt3.Val == 0) {
                n8 -= 4;
            }
            boxedValueInt3.Val = n8 > 22 ? 2 : (n8 > 18 ? 1 : 0);
        }
        Inlines.OpusAssert(n7 > 0);
        Inlines.OpusAssert(n6 >= 0);
        n6 = Inlines.celt_udiv(n6, n7);
        boxedValueInt.Val = n6 = n6 + boxedValueInt.Val >> 1;
        n6 = 3 * n6 + ((3 - n << 7) + 64) + 2 >> 2;
        int n14 = n6 < 80 ? 3 : (n6 < 256 ? 2 : (n6 < 384 ? 1 : 0));
        return n14;
    }

    static void stereo_merge(int[] nArray, int n, int[] nArray2, int n2, int n3, int n4) {
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        Kernels.dual_inner_prod(nArray2, n2, nArray, n, nArray2, n2, n4, boxedValueInt, boxedValueInt2);
        boxedValueInt.Val = Inlines.MULT16_32_Q15(n3, boxedValueInt.Val);
        int n5 = Inlines.SHR16(n3, 1);
        int n6 = Inlines.MULT16_16(n5, n5) + boxedValueInt2.Val - 2 * boxedValueInt.Val;
        int n7 = Inlines.MULT16_16(n5, n5) + boxedValueInt2.Val + 2 * boxedValueInt.Val;
        if (n7 < 161061 || n6 < 161061) {
            System.arraycopy(nArray, n, nArray2, n2, n4);
            return;
        }
        int n8 = Inlines.celt_ilog2(n6) >> 1;
        int n9 = Inlines.celt_ilog2(n7) >> 1;
        int n10 = Inlines.VSHR32(n6, n8 - 7 << 1);
        int n11 = Inlines.celt_rsqrt_norm(n10);
        n10 = Inlines.VSHR32(n7, n9 - 7 << 1);
        int n12 = Inlines.celt_rsqrt_norm(n10);
        if (n8 < 7) {
            n8 = 7;
        }
        if (n9 < 7) {
            n9 = 7;
        }
        for (int i = 0; i < n4; ++i) {
            int n13 = Inlines.MULT16_16_P15(n3, nArray[n + i]);
            int n14 = nArray2[n2 + i];
            nArray[n + i] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MULT16_16(n11, Inlines.SUB16(n13, n14)), n8 + 1));
            nArray2[n2 + i] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.MULT16_16(n12, Inlines.ADD16(n13, n14)), n9 + 1));
        }
    }

    static void deinterleave_hadamard(int[] nArray, int n, int n2, int n3, int n4) {
        int n5 = n2 * n3;
        int[] nArray2 = new int[n5];
        Inlines.OpusAssert(n3 > 0);
        if (n4 != 0) {
            int n6 = n3 - 2;
            for (int i = 0; i < n3; ++i) {
                for (int j = 0; j < n2; ++j) {
                    nArray2[CeltTables.ordery_table[n6 + i] * n2 + j] = nArray[j * n3 + i + n];
                }
            }
        } else {
            for (int i = 0; i < n3; ++i) {
                for (int j = 0; j < n2; ++j) {
                    nArray2[i * n2 + j] = nArray[j * n3 + i + n];
                }
            }
        }
        System.arraycopy(nArray2, 0, nArray, n, n5);
    }

    static int hysteresis_decision(int n, int[] nArray, int[] nArray2, int n2, int n3) {
        int n4;
        for (n4 = 0; n4 < n2 && n >= nArray[n4]; ++n4) {
        }
        if (n4 > n3 && n < nArray[n3] + nArray2[n3]) {
            n4 = n3;
        }
        if (n4 < n3 && n > nArray[n3 - 1] - nArray2[n3 - 1]) {
            n4 = n3;
        }
        return n4;
    }

    static void compute_band_energies(CeltMode celtMode, int[][] nArray, int[][] nArray2, int n, int n2, int n3) {
        short[] sArray = celtMode.eBands;
        int n4 = celtMode.shortMdctSize << n3;
        int n5 = 0;
        do {
            for (int i = 0; i < n; ++i) {
                int n6 = 0;
                int n7 = 0;
                n6 = Inlines.celt_maxabs32(nArray[n5], sArray[i] << n3, sArray[i + 1] - sArray[i] << n3);
                if (n6 > 0) {
                    int n8 = Inlines.celt_ilog2(n6) - 14 + ((celtMode.logN[i] >> 3) + n3 + 1 >> 1);
                    int n9 = sArray[i] << n3;
                    if (n8 > 0) {
                        do {
                            n7 = Inlines.MAC16_16(n7, Inlines.EXTRACT16(Inlines.SHR32(nArray[n5][n9], n8)), Inlines.EXTRACT16(Inlines.SHR32(nArray[n5][n9], n8)));
                        } while (++n9 < sArray[i + 1] << n3);
                    } else {
                        do {
                            n7 = Inlines.MAC16_16(n7, Inlines.EXTRACT16(Inlines.SHL32(nArray[n5][n9], -n8)), Inlines.EXTRACT16(Inlines.SHL32(nArray[n5][n9], -n8)));
                        } while (++n9 < sArray[i + 1] << n3);
                    }
                    nArray2[n5][i] = 1 + Inlines.VSHR32(Inlines.celt_sqrt(n7), -n8);
                    continue;
                }
                nArray2[n5][i] = 1;
            }
        } while (++n5 < n2);
    }

    static void interleave_hadamard(int[] nArray, int n, int n2, int n3, int n4) {
        int n5 = n2 * n3;
        int[] nArray2 = new int[n5];
        if (n4 != 0) {
            int n6 = n3 - 2;
            for (int i = 0; i < n3; ++i) {
                for (int j = 0; j < n2; ++j) {
                    nArray2[j * n3 + i] = nArray[CeltTables.ordery_table[n6 + i] * n2 + j + n];
                }
            }
        } else {
            for (int i = 0; i < n3; ++i) {
                for (int j = 0; j < n2; ++j) {
                    nArray2[j * n3 + i] = nArray[i * n2 + j + n];
                }
            }
        }
        System.arraycopy(nArray2, 0, nArray, n, n5);
    }

    static void haar1(int[] nArray, int n, int n2, int n3) {
        n2 >>= 1;
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n2; ++j) {
                int n4 = n + i + n3 * 2 * j;
                int n5 = Inlines.MULT16_16(23170, nArray[n4]);
                int n6 = Inlines.MULT16_16(23170, nArray[n4 + n3]);
                nArray[n4] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.ADD32(n5, n6), 15));
                nArray[n4 + n3] = Inlines.EXTRACT16(Inlines.PSHR32(Inlines.SUB32(n5, n6), 15));
            }
        }
    }

    static int compute_qn(int n, int n2, int n3, int n4, int n5) {
        int n6;
        short[] sArray = new short[8];
        sArray[0] = 16384;
        sArray[1] = 17866;
        sArray[2] = 19483;
        sArray[3] = 21247;
        sArray[4] = 23170;
        sArray[5] = 25267;
        sArray[6] = 27554;
        sArray[7] = 30048;
        short[] sArray2 = sArray;
        int n7 = 2 * n - 1;
        if (n5 != 0 && n == 2) {
            --n7;
        }
        int n8 = Inlines.celt_sudiv(n2 + n7 * n3, n7);
        n8 = Inlines.IMIN(n2 - n4 - 32, n8);
        if ((n8 = Inlines.IMIN(64, n8)) < 4) {
            n6 = 1;
        } else {
            n6 = sArray2[n8 & 7] >> 14 - (n8 >> 3);
            n6 = n6 + 1 >> 1 << 1;
        }
        Inlines.OpusAssert(n6 <= 256);
        return n6;
    }

    static int quant_band(Bands$band_ctx bands$band_ctx, int[] nArray, int n, int n2, int n3, int n4, int[] nArray2, int n5, int n6, int[] nArray3, int n7, int n8, int[] nArray4, int n9, int n10) {
        int n11;
        int n12;
        int n13;
        int n14 = n2;
        int n15 = n2;
        int n16 = n4;
        int n17 = 0;
        int n18 = 0;
        int n19 = 0;
        boolean bl = bands$band_ctx.encode == 0;
        int n20 = bands$band_ctx.encode;
        int n21 = bands$band_ctx.tf_change;
        int n22 = n16 == 1 ? 1 : 0;
        n15 = Inlines.celt_udiv(n15, n4);
        if (n2 == 1) {
            return Bands.quant_band_n1(bands$band_ctx, nArray, n, null, 0, n3, nArray3, n7);
        }
        if (n21 > 0) {
            n18 = n21;
        }
        if (nArray4 != null && nArray2 != null && (n18 != 0 || (n15 & 1) == 0 && n21 < 0 || n16 > 1)) {
            System.arraycopy(nArray2, n5, nArray4, n9, n2);
            nArray2 = nArray4;
            n5 = n9;
        }
        for (n13 = 0; n13 < n18; ++n13) {
            if (n20 != 0) {
                Bands.haar1(nArray, n, n2 >> n13, 1 << n13);
            }
            if (nArray2 != null) {
                Bands.haar1(nArray2, n5, n2 >> n13, 1 << n13);
            }
            n12 = n10 & 0xF;
            n11 = n10 >> 4;
            if (n12 < 0) {
                System.out.println("e");
            }
            if (n11 < 0) {
                System.out.println("e");
            }
            n10 = bit_interleave_table[n10 & 0xF] | bit_interleave_table[n10 >> 4] << 2;
        }
        n4 >>= n18;
        n15 <<= n18;
        while ((n15 & 1) == 0 && n21 < 0) {
            if (n20 != 0) {
                Bands.haar1(nArray, n, n15, n4);
            }
            if (nArray2 != null) {
                Bands.haar1(nArray2, n5, n15, n4);
            }
            n10 |= n10 << n4;
            n4 <<= 1;
            n15 >>= 1;
            ++n17;
            ++n21;
        }
        n16 = n4;
        int n23 = n15;
        if (n16 > 1) {
            if (n20 != 0) {
                Bands.deinterleave_hadamard(nArray, n, n15 >> n18, n16 << n18, n22);
            }
            if (nArray2 != null) {
                Bands.deinterleave_hadamard(nArray2, n5, n15 >> n18, n16 << n18, n22);
            }
        }
        n19 = Bands.quant_partition(bands$band_ctx, nArray, n, n2, n3, n4, nArray2, n5, n6, n8, n10);
        if (bl) {
            if (n16 > 1) {
                Bands.interleave_hadamard(nArray, n, n15 >> n18, n16 << n18, n22);
            }
            n15 = n23;
            n4 = n16;
            for (n13 = 0; n13 < n17; ++n13) {
                n19 |= n19 >> (n4 >>= 1);
                Bands.haar1(nArray, n, n15 <<= 1, n4);
            }
            for (n13 = 0; n13 < n18; ++n13) {
                n19 = bit_deinterleave_table[n19];
                Bands.haar1(nArray, n, n14 >> n13, 1 << n13);
            }
            n4 <<= n18;
            if (nArray3 != null) {
                n11 = Inlines.celt_sqrt(Inlines.SHL32(n14, 22));
                for (n12 = 0; n12 < n14; ++n12) {
                    nArray3[n7 + n12] = Inlines.MULT16_16_Q15(n11, nArray[n + n12]);
                }
            }
            n19 &= (1 << n4) - 1;
        }
        return n19;
    }
}

