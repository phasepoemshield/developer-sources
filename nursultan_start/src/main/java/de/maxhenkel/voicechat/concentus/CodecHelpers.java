/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.OpusBandwidth
 *  de.maxhenkel.voicechat.concentus.OpusBandwidthHelpers
 *  de.maxhenkel.voicechat.concentus.OpusFramesize
 *  de.maxhenkel.voicechat.concentus.OpusFramesizeHelpers
 *  de.maxhenkel.voicechat.concentus.OpusMode
 *  de.maxhenkel.voicechat.concentus.StereoWidthState
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Downmix;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.OpusBandwidth;
import de.maxhenkel.voicechat.concentus.OpusBandwidthHelpers;
import de.maxhenkel.voicechat.concentus.OpusFramesize;
import de.maxhenkel.voicechat.concentus.OpusFramesizeHelpers;
import de.maxhenkel.voicechat.concentus.OpusMode;
import de.maxhenkel.voicechat.concentus.StereoWidthState;

public class CodecHelpers {
    private static final int MAX_DYNAMIC_FRAMESIZE = 24;

    static int compute_stereo_width(short[] sArray, int n, int n2, int n3, StereoWidthState stereoWidthState) {
        int n4 = n3 / n2;
        int n5 = Short.MAX_VALUE - 819175 / Inlines.IMAX(50, n4);
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        for (int i = 0; i < n2 - 3; i += 4) {
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            int n12 = n + 2 * i;
            short s = sArray[n12];
            short s2 = sArray[n12 + 1];
            n9 = Inlines.SHR32(Inlines.MULT16_16((int)s, (int)s), 2);
            n10 = Inlines.SHR32(Inlines.MULT16_16((int)s, (int)s2), 2);
            n11 = Inlines.SHR32(Inlines.MULT16_16((int)s2, (int)s2), 2);
            s = sArray[n12 + 2];
            s2 = sArray[n12 + 3];
            n9 += Inlines.SHR32(Inlines.MULT16_16((int)s, (int)s), 2);
            n10 += Inlines.SHR32(Inlines.MULT16_16((int)s, (int)s2), 2);
            n11 += Inlines.SHR32(Inlines.MULT16_16((int)s2, (int)s2), 2);
            s = sArray[n12 + 4];
            s2 = sArray[n12 + 5];
            n9 += Inlines.SHR32(Inlines.MULT16_16((int)s, (int)s), 2);
            n10 += Inlines.SHR32(Inlines.MULT16_16((int)s, (int)s2), 2);
            n11 += Inlines.SHR32(Inlines.MULT16_16((int)s2, (int)s2), 2);
            s = sArray[n12 + 6];
            s2 = sArray[n12 + 7];
            n8 += Inlines.SHR32(n9 += Inlines.SHR32(Inlines.MULT16_16((int)s, (int)s), 2), 10);
            n7 += Inlines.SHR32(n10 += Inlines.SHR32(Inlines.MULT16_16((int)s, (int)s2), 2), 10);
            n6 += Inlines.SHR32(n11 += Inlines.SHR32(Inlines.MULT16_16((int)s2, (int)s2), 2), 10);
        }
        stereoWidthState.XX += Inlines.MULT16_32_Q15(n5, n8 - stereoWidthState.XX);
        stereoWidthState.XY += Inlines.MULT16_32_Q15(n5, n7 - stereoWidthState.XY);
        stereoWidthState.YY += Inlines.MULT16_32_Q15(n5, n6 - stereoWidthState.YY);
        stereoWidthState.XX = Inlines.MAX32(0, stereoWidthState.XX);
        stereoWidthState.XY = Inlines.MAX32(0, stereoWidthState.XY);
        stereoWidthState.YY = Inlines.MAX32(0, stereoWidthState.YY);
        if (Inlines.MAX32(stereoWidthState.XX, stereoWidthState.YY) > 210) {
            int n13 = Inlines.celt_sqrt(stereoWidthState.XX);
            int n14 = Inlines.celt_sqrt(stereoWidthState.YY);
            int n15 = Inlines.celt_sqrt(n13);
            int n16 = Inlines.celt_sqrt(n14);
            stereoWidthState.XY = Inlines.MIN32(stereoWidthState.XY, n13 * n14);
            int n17 = Inlines.SHR32(Inlines.frac_div32(stereoWidthState.XY, 1 + Inlines.MULT16_16(n13, n14)), 16);
            int n18 = Short.MAX_VALUE * Inlines.ABS16(n15 - n16) / (1 + n15 + n16);
            int n19 = Inlines.MULT16_16_Q15(Inlines.celt_sqrt(0x40000000 - Inlines.MULT16_16(n17, n17)), n18);
            stereoWidthState.smoothed_width += (n19 - stereoWidthState.smoothed_width) / n4;
            stereoWidthState.max_follower = Inlines.MAX16(stereoWidthState.max_follower - 655 / n4, stereoWidthState.smoothed_width);
        } else {
            boolean bl = false;
            int n20 = Short.MAX_VALUE;
            boolean bl2 = false;
        }
        return Inlines.EXTRACT16(Inlines.MIN32(Short.MAX_VALUE, 20 * stereoWidthState.max_follower));
    }

    static byte gen_toc(OpusMode opusMode, int n, OpusBandwidth opusBandwidth, int n2) {
        int n3;
        int n4 = 0;
        while (n < 400) {
            n <<= 1;
            ++n4;
        }
        if (opusMode == OpusMode.MODE_SILK_ONLY) {
            n3 = (short)(OpusBandwidthHelpers.GetOrdinal((OpusBandwidth)opusBandwidth) - OpusBandwidthHelpers.GetOrdinal((OpusBandwidth)OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND) << 5);
            n3 = (short)(n3 | (short)(n4 - 2 << 3));
        } else if (opusMode == OpusMode.MODE_CELT_ONLY) {
            int n5 = OpusBandwidthHelpers.GetOrdinal((OpusBandwidth)opusBandwidth) - OpusBandwidthHelpers.GetOrdinal((OpusBandwidth)OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND);
            if (n5 < 0) {
                n5 = 0;
            }
            n3 = 128;
            n3 = (short)(n3 | (short)(n5 << 5));
            n3 = (short)(n3 | (short)(n4 << 3));
        } else {
            n3 = 96;
            n3 = (short)(n3 | (short)(OpusBandwidthHelpers.GetOrdinal((OpusBandwidth)opusBandwidth) - OpusBandwidthHelpers.GetOrdinal((OpusBandwidth)OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND) << 4));
            n3 = (short)(n3 | (short)(n4 - 2 << 3));
        }
        n3 = (short)(n3 | (short)((n2 == 2 ? 1 : 0) << 2));
        return (byte)(0xFF & n3);
    }

    static void hp_cutoff(short[] sArray, int n, int n2, short[] sArray2, int n3, int[] nArray, int n4, int n5, int n6) {
        int n7;
        int[] nArray2 = new int[3];
        int[] nArray3 = new int[2];
        Inlines.OpusAssert(n2 <= 869074);
        int n8 = Inlines.silk_DIV32_16(Inlines.silk_SMULBB(2471, n2), n6 / 1000);
        Inlines.OpusAssert(n8 > 0 && n8 < 32768);
        nArray2[0] = n7 = 0x10000000 - Inlines.silk_MUL(471, n8);
        nArray2[1] = Inlines.silk_LSHIFT(-n7, 1);
        nArray2[2] = n7;
        int n9 = Inlines.silk_RSHIFT(n7, 6);
        nArray3[0] = Inlines.silk_SMULWW(n9, Inlines.silk_SMULWW(n8, n8) - 0x800000);
        nArray3[1] = Inlines.silk_SMULWW(n9, n9);
        Filters.silk_biquad_alt(sArray, n, nArray2, nArray3, nArray, 0, sArray2, n3, n4, n5);
        if (n5 == 2) {
            Filters.silk_biquad_alt(sArray, n + 1, nArray2, nArray3, nArray, 2, sArray2, n3 + 1, n4, n5);
        }
    }

    static void dc_reject(short[] sArray, int n, int n2, short[] sArray2, int n3, int[] nArray, int n4, int n5, int n6) {
        int n7 = Inlines.celt_ilog2(n6 / (n2 * 3));
        for (int i = 0; i < n5; ++i) {
            for (int j = 0; j < n4; ++j) {
                int n8 = Inlines.SHL32(Inlines.EXTEND32(sArray[n5 * j + i + n]), 15);
                int n9 = n8 - nArray[2 * i];
                nArray[2 * i] = nArray[2 * i] + Inlines.PSHR32(n8 - nArray[2 * i], n7);
                int n10 = n9 - nArray[2 * i + 1];
                nArray[2 * i + 1] = nArray[2 * i + 1] + Inlines.PSHR32(n9 - nArray[2 * i + 1], n7);
                sArray2[n5 * j + i + n3] = Inlines.EXTRACT16(Inlines.SATURATE(Inlines.PSHR32(n10, 15), Short.MAX_VALUE));
            }
        }
    }

    static void gain_fade(short[] sArray, int n, int n2, int n3, int n4, int n5, int n6, int[] nArray, int n7) {
        int n8;
        int n9;
        int n10;
        int n11 = 48000 / n7;
        int n12 = n4 / n11;
        if (n6 == 1) {
            for (n10 = 0; n10 < n12; ++n10) {
                n9 = Inlines.MULT16_16_Q15(nArray[n10 * n11], nArray[n10 * n11]);
                n8 = Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(n9, n3), Short.MAX_VALUE - n9, n2), 15);
                sArray[n + n10] = (short)Inlines.MULT16_16_Q15(n8, (int)sArray[n + n10]);
            }
        } else {
            for (n10 = 0; n10 < n12; ++n10) {
                n9 = Inlines.MULT16_16_Q15(nArray[n10 * n11], nArray[n10 * n11]);
                n8 = Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(n9, n3), Short.MAX_VALUE - n9, n2), 15);
                sArray[n + n10 * 2] = (short)Inlines.MULT16_16_Q15(n8, (int)sArray[n + n10 * 2]);
                sArray[n + n10 * 2 + 1] = (short)Inlines.MULT16_16_Q15(n8, (int)sArray[n + n10 * 2 + 1]);
            }
        }
        int n13 = 0;
        do {
            for (n10 = n12; n10 < n5; ++n10) {
                sArray[n + n10 * n6 + n13] = (short)Inlines.MULT16_16_Q15(n3, (int)sArray[n + n10 * n6 + n13]);
            }
        } while (++n13 < n6);
    }

    static void smooth_fade(short[] sArray, int n, short[] sArray2, int n2, short[] sArray3, int n3, int n4, int n5, int[] nArray, int n6) {
        int n7 = 48000 / n6;
        for (int i = 0; i < n5; ++i) {
            for (int j = 0; j < n4; ++j) {
                int n8 = Inlines.MULT16_16_Q15(nArray[j * n7], nArray[j * n7]);
                sArray3[n3 + j * n5 + i] = (short)Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(n8, (int)sArray2[n2 + j * n5 + i]), Short.MAX_VALUE - n8, (int)sArray[n + j * n5 + i]), 15);
            }
        }
    }

    public static String opus_strerror(int n) {
        String[] stringArray = new String[]{"success", "invalid argument", "buffer too small", "error", "corrupted stream", "request not implemented", "invalid state", "memory allocation failed"};
        if (n > 0 || n < -7) {
            return "unknown error";
        }
        return stringArray[-n];
    }

    static int optimize_framesize(short[] sArray, int n, int n2, int n3, int n4, int n5, int n6, float[] fArray, int n7) {
        int n8;
        int n9;
        int n10;
        float[] fArray2 = new float[28];
        float[] fArray3 = new float[27];
        int n11 = 0;
        int n12 = n4 / 400;
        int[] nArray = new int[n12];
        fArray2[0] = fArray[0];
        fArray3[0] = 1.0f / (1.0f + fArray[0]);
        if (n7 != 0) {
            n10 = 2 * n12 - n7;
            Inlines.OpusAssert(n10 >= 0 && n10 <= n12);
            n2 -= n10;
            fArray2[1] = fArray[1];
            fArray3[1] = 1.0f / (1.0f + fArray[1]);
            fArray2[2] = fArray[2];
            fArray3[2] = 1.0f / (1.0f + fArray[2]);
            n9 = 3;
        } else {
            n9 = 1;
            n10 = 0;
        }
        int n13 = Inlines.IMIN(n2 / n12, 24);
        int n14 = 0;
        for (n8 = 0; n8 < n13; ++n8) {
            float f = 1.0f;
            Downmix.downmix_int(sArray, n, nArray, 0, n12, n8 * n12 + n10, 0, -2, n3);
            if (n8 == 0) {
                n14 = nArray[0];
            }
            for (int i = 0; i < n12; ++i) {
                int n15 = nArray[i];
                f += (float)(n15 - n14) * (float)(n15 - n14);
                n14 = n15;
            }
            fArray2[n8 + n9] = f;
            fArray3[n8 + n9] = 1.0f / f;
        }
        fArray2[n8 + n9] = fArray2[n8 + n9 - 1];
        if (n7 != 0) {
            n13 = Inlines.IMIN(24, n13 + 2);
        }
        n11 = CodecHelpers.transient_viterbi(fArray2, fArray3, n13, (int)((1.0f + 0.5f * (float)n6) * (float)(60 * n3 + 40)), n5 / 400);
        fArray[0] = fArray2[1 << n11];
        if (n7 != 0) {
            fArray[1] = fArray2[(1 << n11) + 1];
            fArray[2] = fArray2[(1 << n11) + 2];
        }
        return n11;
    }

    static int frame_size_select(int n, OpusFramesize opusFramesize, int n2) {
        int n3;
        if (n < n2 / 400) {
            return -1;
        }
        if (opusFramesize == OpusFramesize.OPUS_FRAMESIZE_ARG) {
            n3 = n;
        } else if (opusFramesize == OpusFramesize.OPUS_FRAMESIZE_VARIABLE) {
            n3 = n2 / 50;
        } else if (OpusFramesizeHelpers.GetOrdinal((OpusFramesize)opusFramesize) >= OpusFramesizeHelpers.GetOrdinal((OpusFramesize)OpusFramesize.OPUS_FRAMESIZE_2_5_MS) && OpusFramesizeHelpers.GetOrdinal((OpusFramesize)opusFramesize) <= OpusFramesizeHelpers.GetOrdinal((OpusFramesize)OpusFramesize.OPUS_FRAMESIZE_60_MS)) {
            n3 = Inlines.IMIN(3 * n2 / 50, n2 / 400 << OpusFramesizeHelpers.GetOrdinal((OpusFramesize)opusFramesize) - OpusFramesizeHelpers.GetOrdinal((OpusFramesize)OpusFramesize.OPUS_FRAMESIZE_2_5_MS));
        } else {
            return -1;
        }
        if (n3 > n) {
            return -1;
        }
        if (400 * n3 != n2) {
            if (200 * n3 != n2 && 100 * n3 != n2 && 50 * n3 != n2 && 25 * n3 != n2 && 50 * n3 != 3 * n2) {
                return -1;
            }
        }
        return n3;
    }

    /*
     * Unable to fully structure code
     */
    static int compute_frame_size(short[] var0, int var1_1, int var2_2, OpusFramesize var3_3, int var4_4, int var5_5, int var6_6, int var7_7, float[] var8_8, boolean var9_9) {
        if (!var9_9 || var3_3 != OpusFramesize.OPUS_FRAMESIZE_VARIABLE) ** GOTO lbl-1000
        if (var2_2 >= var5_5 / 200) {
            var10_10 = 3;
            var10_10 = CodecHelpers.optimize_framesize(var0, var1_1, var2_2, var4_4, var5_5, var6_6, 0, var8_8, var7_7);
            while (var5_5 / 400 << var10_10 > var2_2) {
                --var10_10;
            }
            var2_2 = var5_5 / 400 << var10_10;
        } else lbl-1000:
        // 2 sources

        {
            var2_2 = CodecHelpers.frame_size_select(var2_2, var3_3, var5_5);
        }
        if (var2_2 < 0) {
            return -1;
        }
        return var2_2;
    }

    static int transient_viterbi(float[] fArray, float[] fArray2, int n, int n2, int n3) {
        int n4;
        float[][] fArray3 = Arrays.InitTwoDimensionalArrayFloat(24, 16);
        int[][] nArray = Arrays.InitTwoDimensionalArrayInt(24, 16);
        float f = n3 < 80 ? 0.0f : (n3 > 160 ? 1.0f : ((float)n3 - 80.0f) / 80.0f);
        for (n4 = 0; n4 < 16; ++n4) {
            nArray[0][n4] = -1;
            fArray3[0][n4] = 1.0E10f;
        }
        for (n4 = 0; n4 < 4; ++n4) {
            fArray3[0][1 << n4] = (float)(n2 + n3 * (1 << n4)) * (1.0f + f * CodecHelpers.transient_boost(fArray, 0, fArray2, n4, n + 1));
            nArray[0][1 << n4] = n4;
        }
        for (n4 = 1; n4 < n; ++n4) {
            int n5;
            for (n5 = 2; n5 < 16; ++n5) {
                fArray3[n4][n5] = fArray3[n4 - 1][n5 - 1];
                nArray[n4][n5] = n5 - 1;
            }
            for (n5 = 0; n5 < 4; ++n5) {
                nArray[n4][1 << n5] = 1;
                float f2 = fArray3[n4 - 1][1];
                for (int i = 1; i < 4; ++i) {
                    float f3 = fArray3[n4 - 1][(1 << i + 1) - 1];
                    if (!(f3 < f2)) continue;
                    nArray[n4][1 << n5] = (1 << i + 1) - 1;
                    f2 = f3;
                }
                float f4 = (float)(n2 + n3 * (1 << n5)) * (1.0f + f * CodecHelpers.transient_boost(fArray, n4, fArray2, n5, n - n4 + 1));
                fArray3[n4][1 << n5] = f2;
                if (n - n4 < 1 << n5) {
                    float[] fArray4 = fArray3[n4];
                    int n6 = 1 << n5;
                    fArray4[n6] = fArray4[n6] + f4 * (float)(n - n4) / (float)(1 << n5);
                    continue;
                }
                float[] fArray5 = fArray3[n4];
                int n7 = 1 << n5;
                fArray5[n7] = fArray5[n7] + f4;
            }
        }
        int n8 = 1;
        float f5 = fArray3[n - 1][1];
        for (n4 = 2; n4 < 16; ++n4) {
            if (!(fArray3[n - 1][n4] < f5)) continue;
            f5 = fArray3[n - 1][n4];
            n8 = n4;
        }
        for (n4 = n - 1; n4 >= 0; --n4) {
            n8 = nArray[n4][n8];
        }
        return n8;
    }

    static void stereo_fade(short[] sArray, int n, int n2, int n3, int n4, int n5, int[] nArray, int n6) {
        int n7;
        int n8;
        int n9 = 48000 / n6;
        int n10 = n3 / n9;
        n = Short.MAX_VALUE - n;
        n2 = Short.MAX_VALUE - n2;
        for (n8 = 0; n8 < n10; ++n8) {
            int n11 = Inlines.MULT16_16_Q15(nArray[n8 * n9], nArray[n8 * n9]);
            int n12 = Inlines.SHR32(Inlines.MAC16_16(Inlines.MULT16_16(n11, n2), Short.MAX_VALUE - n11, n), 15);
            n7 = Inlines.EXTRACT16(Inlines.HALF32(sArray[n8 * n5] - sArray[n8 * n5 + 1]));
            n7 = Inlines.MULT16_16_Q15(n12, n7);
            sArray[n8 * n5] = (short)(sArray[n8 * n5] - n7);
            sArray[n8 * n5 + 1] = (short)(sArray[n8 * n5 + 1] + n7);
        }
        while (n8 < n4) {
            n7 = Inlines.EXTRACT16(Inlines.HALF32(sArray[n8 * n5] - sArray[n8 * n5 + 1]));
            n7 = Inlines.MULT16_16_Q15(n2, n7);
            sArray[n8 * n5] = (short)(sArray[n8 * n5] - n7);
            sArray[n8 * n5 + 1] = (short)(sArray[n8 * n5 + 1] + n7);
            ++n8;
        }
    }

    static float transient_boost(float[] fArray, int n, float[] fArray2, int n2, int n3) {
        float f = 0.0f;
        float f2 = 0.0f;
        int n4 = Inlines.IMIN(n3, (1 << n2) + 1);
        for (int i = n; i < n4 + n; ++i) {
            f += fArray[i];
            f2 += fArray2[i];
        }
        float f3 = f * f2 / (float)(n4 * n4);
        return Inlines.MIN16(1.0f, (float)Math.sqrt(Inlines.MAX16(0.0f, 0.05f * (f3 - 2.0f))));
    }

    public static String GetVersionString() {
        return "concentus 1.0a-java-fixed";
    }
}

