/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.MLPState
 *  de.maxhenkel.voicechat.concentus.MultiLayerPerceptron
 *  de.maxhenkel.voicechat.concentus.OpusTables
 *  de.maxhenkel.voicechat.concentus.TonalityAnalysisState
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.AnalysisInfo;
import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.Downmix;
import de.maxhenkel.voicechat.concentus.FFTState;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.KissFFT;
import de.maxhenkel.voicechat.concentus.MLPState;
import de.maxhenkel.voicechat.concentus.MultiLayerPerceptron;
import de.maxhenkel.voicechat.concentus.OpusTables;
import de.maxhenkel.voicechat.concentus.TonalityAnalysisState;

class Analysis {
    private static final double M_PI = 3.141592653;
    private static final float cA = 0.43157974f;
    private static final float cB = 0.678484f;
    private static final float cC = 0.08595542f;
    private static final float cE = 1.5707964f;
    private static final int NB_TONAL_SKIP_BANDS = 9;

    Analysis() {
    }

    static float fast_atan2f(float f, float f2) {
        float f3;
        float f4;
        if (Inlines.ABS16(f2) + Inlines.ABS16(f) < 1.0E-9f) {
            f2 *= 1.0E12f;
            f *= 1.0E12f;
        }
        if ((f4 = f2 * f2) < (f3 = f * f)) {
            float f5 = (f3 + 0.678484f * f4) * (f3 + 0.08595542f * f4);
            if (f5 != 0.0f) {
                return -f2 * f * (f3 + 0.43157974f * f4) / f5 + (f < 0.0f ? -1.5707964f : 1.5707964f);
            }
            return f < 0.0f ? -1.5707964f : 1.5707964f;
        }
        float f6 = (f4 + 0.678484f * f3) * (f4 + 0.08595542f * f3);
        if (f6 != 0.0f) {
            return f2 * f * (f4 + 0.43157974f * f3) / f6 + (f < 0.0f ? -1.5707964f : 1.5707964f) - (f2 * f < 0.0f ? -1.5707964f : 1.5707964f);
        }
        return (f < 0.0f ? -1.5707964f : 1.5707964f) - (f2 * f < 0.0f ? -1.5707964f : 1.5707964f);
    }

    static void tonality_analysis(TonalityAnalysisState tonalityAnalysisState, CeltMode celtMode, short[] sArray, int n, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        int n9;
        int n10 = 480;
        int n11 = 240;
        float[] fArray = tonalityAnalysisState.angle;
        float[] fArray2 = tonalityAnalysisState.d_angle;
        float[] fArray3 = tonalityAnalysisState.d2_angle;
        float[] fArray4 = new float[18];
        float[] fArray5 = new float[18];
        float[] fArray6 = new float[8];
        float[] fArray7 = new float[25];
        float f12 = 97.40909f;
        float f13 = 0.0f;
        float[] fArray8 = new float[2];
        int n12 = 0;
        float f14 = 0.0f;
        ++tonalityAnalysisState.last_transition;
        float f15 = 1.0f / (float)Inlines.IMIN(20, 1 + tonalityAnalysisState.count);
        float f16 = 1.0f / (float)Inlines.IMIN(50, 1 + tonalityAnalysisState.count);
        float f17 = 1.0f / (float)Inlines.IMIN(1000, 1 + tonalityAnalysisState.count);
        if (tonalityAnalysisState.count < 4) {
            tonalityAnalysisState.music_prob = 0.5f;
        }
        FFTState fFTState = celtMode.mdct.kfft[0];
        if (tonalityAnalysisState.count == 0) {
            tonalityAnalysisState.mem_fill = 240;
        }
        Downmix.downmix_int(sArray, n, tonalityAnalysisState.inmem, tonalityAnalysisState.mem_fill, Inlines.IMIN(n2, 720 - tonalityAnalysisState.mem_fill), n3, n4, n5, n6);
        if (tonalityAnalysisState.mem_fill + n2 < 720) {
            tonalityAnalysisState.mem_fill += n2;
            return;
        }
        AnalysisInfo analysisInfo = tonalityAnalysisState.info[tonalityAnalysisState.write_pos++];
        if (tonalityAnalysisState.write_pos >= 200) {
            tonalityAnalysisState.write_pos -= 200;
        }
        int[] nArray = new int[960];
        int[] nArray2 = new int[960];
        float[] fArray9 = new float[240];
        float[] fArray10 = new float[240];
        for (n9 = 0; n9 < n11; ++n9) {
            f11 = OpusTables.analysis_window[n9];
            nArray[2 * n9] = (int)(f11 * (float)tonalityAnalysisState.inmem[n9]);
            nArray[2 * n9 + 1] = (int)(f11 * (float)tonalityAnalysisState.inmem[n11 + n9]);
            nArray[2 * (n10 - n9 - 1)] = (int)(f11 * (float)tonalityAnalysisState.inmem[n10 - n9 - 1]);
            nArray[2 * (n10 - n9 - 1) + 1] = (int)(f11 * (float)tonalityAnalysisState.inmem[n10 + n11 - n9 - 1]);
        }
        Arrays.MemMove(tonalityAnalysisState.inmem, 480, 0, 240);
        int n13 = n2 - (720 - tonalityAnalysisState.mem_fill);
        Downmix.downmix_int(sArray, n, tonalityAnalysisState.inmem, 240, n13, n3 + 720 - tonalityAnalysisState.mem_fill, n4, n5, n6);
        tonalityAnalysisState.mem_fill = 240 + n13;
        KissFFT.opus_fft(fFTState, nArray, nArray2);
        for (n9 = 1; n9 < n11; ++n9) {
            f11 = (float)nArray2[2 * n9] + (float)nArray2[2 * (n10 - n9)];
            f10 = (float)nArray2[2 * n9 + 1] - (float)nArray2[2 * (n10 - n9) + 1];
            f9 = (float)nArray2[2 * n9 + 1] + (float)nArray2[2 * (n10 - n9) + 1];
            f8 = (float)nArray2[2 * (n10 - n9)] - (float)nArray2[2 * n9];
            f7 = 0.15915494f * Analysis.fast_atan2f(f10, f11);
            f6 = f7 - fArray[n9];
            f5 = f6 - fArray2[n9];
            f4 = 0.15915494f * Analysis.fast_atan2f(f8, f9);
            f3 = f4 - f7;
            f2 = f3 - f6;
            f = f5 - (float)Math.floor(0.5f + f5);
            fArray10[n9] = Inlines.ABS16(f);
            f *= f;
            f *= f;
            float f18 = f2 - (float)Math.floor(0.5f + f2);
            int n14 = n9;
            fArray10[n14] = fArray10[n14] + Inlines.ABS16(f18);
            f18 *= f18;
            f18 *= f18;
            float f19 = 0.25f * (fArray3[n9] + 2.0f * f + f18);
            fArray9[n9] = 1.0f / (1.0f + 640.0f * f12 * f19) - 0.015f;
            fArray[n9] = f4;
            fArray2[n9] = f3;
            fArray3[n9] = f18;
        }
        float f20 = 0.0f;
        float f21 = 0.0f;
        analysisInfo.activity = 0.0f;
        float f22 = 0.0f;
        float f23 = 0.0f;
        if (tonalityAnalysisState.count == 0) {
            for (n8 = 0; n8 < 18; ++n8) {
                tonalityAnalysisState.lowE[n8] = 1.0E10f;
                tonalityAnalysisState.highE[n8] = -1.0E10f;
            }
        }
        float f24 = 0.0f;
        float f25 = 0.0f;
        for (n8 = 0; n8 < 18; ++n8) {
            f11 = 0.0f;
            f9 = 0.0f;
            f10 = 0.0f;
            for (n9 = OpusTables.tbands[n8]; n9 < OpusTables.tbands[n8 + 1]; ++n9) {
                f5 = (float)nArray2[2 * n9] * (float)nArray2[2 * n9] + (float)nArray2[2 * (n10 - n9)] * (float)nArray2[2 * (n10 - n9)] + (float)nArray2[2 * n9 + 1] * (float)nArray2[2 * n9 + 1] + (float)nArray2[2 * (n10 - n9) + 1] * (float)nArray2[2 * (n10 - n9) + 1];
                f11 += (f5 *= 5.55E-17f);
                f9 += f5 * fArray9[n9];
                f10 += f5 * 2.0f * (0.5f - fArray10[n9]);
            }
            tonalityAnalysisState.E[tonalityAnalysisState.E_count][n8] = f11;
            f22 += f10 / (1.0E-15f + f11);
            f25 += (float)Math.sqrt(f11 + 1.0E-10f);
            fArray5[n8] = (float)Math.log(f11 + 1.0E-10f);
            tonalityAnalysisState.lowE[n8] = Inlines.MIN32(fArray5[n8], tonalityAnalysisState.lowE[n8] + 0.01f);
            tonalityAnalysisState.highE[n8] = Inlines.MAX32(fArray5[n8], tonalityAnalysisState.highE[n8] - 0.1f);
            if (tonalityAnalysisState.highE[n8] < tonalityAnalysisState.lowE[n8] + 1.0f) {
                int n15 = n8;
                tonalityAnalysisState.highE[n15] = tonalityAnalysisState.highE[n15] + 0.5f;
                int n16 = n8;
                tonalityAnalysisState.lowE[n16] = tonalityAnalysisState.lowE[n16] - 0.5f;
            }
            f24 += (fArray5[n8] - tonalityAnalysisState.lowE[n8]) / (1.0E-15f + tonalityAnalysisState.highE[n8] - tonalityAnalysisState.lowE[n8]);
            f7 = 0.0f;
            f8 = 0.0f;
            for (n9 = 0; n9 < 8; ++n9) {
                f8 += (float)Math.sqrt(tonalityAnalysisState.E[n9][n8]);
                f7 += tonalityAnalysisState.E[n9][n8];
            }
            f6 = Inlines.MIN16(0.99f, f8 / (float)Math.sqrt(1.0E-15 + (double)(8.0f * f7)));
            f6 *= f6;
            f6 *= f6;
            f23 += f6;
            fArray4[n8] = Inlines.MAX16(f9 / (1.0E-15f + f11), f6 * tonalityAnalysisState.prev_band_tonality[n8]);
            f20 += fArray4[n8];
            if (n8 >= 9) {
                f20 -= fArray4[n8 - 18 + 9];
            }
            f21 = Inlines.MAX16(f21, (1.0f + 0.03f * (float)(n8 - 18)) * f20);
            f13 += fArray4[n8] * (float)(n8 - 8);
            tonalityAnalysisState.prev_band_tonality[n8] = fArray4[n8];
        }
        float f26 = 0.0f;
        n12 = 0;
        f14 = 0.0f;
        float f27 = 5.7E-4f / (float)(1 << Inlines.IMAX(0, n7 - 8));
        f27 *= 1.34217728E8f;
        f27 *= f27;
        for (n8 = 0; n8 < 21; ++n8) {
            f11 = 0.0f;
            int n17 = OpusTables.extra_bands[n8];
            int n18 = OpusTables.extra_bands[n8 + 1];
            for (n9 = n17; n9 < n18; ++n9) {
                f8 = (float)nArray2[2 * n9] * (float)nArray2[2 * n9] + (float)nArray2[2 * (n10 - n9)] * (float)nArray2[2 * (n10 - n9)] + (float)nArray2[2 * n9 + 1] * (float)nArray2[2 * n9 + 1] + (float)nArray2[2 * (n10 - n9) + 1] * (float)nArray2[2 * (n10 - n9) + 1];
                f11 += f8;
            }
            f14 = Inlines.MAX32(f14, f11);
            tonalityAnalysisState.meanE[n8] = Inlines.MAX32((1.0f - f17) * tonalityAnalysisState.meanE[n8], f11);
            if (!((double)(f11 = Inlines.MAX32(f11, tonalityAnalysisState.meanE[n8])) > 0.1 * (double)(f26 = Inlines.MAX32(0.05f * f26, f11))) || !(f11 * 1.0E9f > f14) || !(f11 > f27 * (float)(n18 - n17))) continue;
            n12 = n8;
        }
        if (tonalityAnalysisState.count <= 2) {
            n12 = 20;
        }
        f25 = 20.0f * (float)Math.log10(f25);
        tonalityAnalysisState.Etracker = Inlines.MAX32(tonalityAnalysisState.Etracker - 0.03f, f25);
        tonalityAnalysisState.lowECount *= 1.0f - f16;
        if (f25 < tonalityAnalysisState.Etracker - 30.0f) {
            tonalityAnalysisState.lowECount += f16;
        }
        for (n9 = 0; n9 < 8; ++n9) {
            f11 = 0.0f;
            for (n8 = 0; n8 < 16; ++n8) {
                f11 += OpusTables.dct_table[n9 * 16 + n8] * fArray5[n8];
            }
            fArray6[n9] = f11;
        }
        f23 /= 18.0f;
        f24 /= 18.0f;
        if (tonalityAnalysisState.count < 10) {
            f24 = 0.5f;
        }
        analysisInfo.activity = (f22 /= 18.0f) + (1.0f - f22) * f24;
        f20 = f21 / 9.0f;
        tonalityAnalysisState.prev_tonality = f20 = Inlines.MAX16(f20, tonalityAnalysisState.prev_tonality * 0.8f);
        analysisInfo.tonality_slope = f13 /= 64.0f;
        tonalityAnalysisState.E_count = (tonalityAnalysisState.E_count + 1) % 8;
        ++tonalityAnalysisState.count;
        analysisInfo.tonality = f20;
        for (n9 = 0; n9 < 4; ++n9) {
            fArray7[n9] = -0.12299f * (fArray6[n9] + tonalityAnalysisState.mem[n9 + 24]) + 0.49195f * (tonalityAnalysisState.mem[n9] + tonalityAnalysisState.mem[n9 + 16]) + 0.69693f * tonalityAnalysisState.mem[n9 + 8] - 1.4349f * tonalityAnalysisState.cmean[n9];
        }
        for (n9 = 0; n9 < 4; ++n9) {
            tonalityAnalysisState.cmean[n9] = (1.0f - f15) * tonalityAnalysisState.cmean[n9] + f15 * fArray6[n9];
        }
        for (n9 = 0; n9 < 4; ++n9) {
            fArray7[4 + n9] = 0.63246f * (fArray6[n9] - tonalityAnalysisState.mem[n9 + 24]) + 0.31623f * (tonalityAnalysisState.mem[n9] - tonalityAnalysisState.mem[n9 + 16]);
        }
        for (n9 = 0; n9 < 3; ++n9) {
            fArray7[8 + n9] = 0.53452f * (fArray6[n9] + tonalityAnalysisState.mem[n9 + 24]) - 0.26726f * (tonalityAnalysisState.mem[n9] + tonalityAnalysisState.mem[n9 + 16]) - 0.53452f * tonalityAnalysisState.mem[n9 + 8];
        }
        if (tonalityAnalysisState.count > 5) {
            for (n9 = 0; n9 < 9; ++n9) {
                tonalityAnalysisState.std[n9] = (1.0f - f15) * tonalityAnalysisState.std[n9] + f15 * fArray7[n9] * fArray7[n9];
            }
        }
        for (n9 = 0; n9 < 8; ++n9) {
            tonalityAnalysisState.mem[n9 + 24] = tonalityAnalysisState.mem[n9 + 16];
            tonalityAnalysisState.mem[n9 + 16] = tonalityAnalysisState.mem[n9 + 8];
            tonalityAnalysisState.mem[n9 + 8] = tonalityAnalysisState.mem[n9];
            tonalityAnalysisState.mem[n9] = fArray6[n9];
        }
        for (n9 = 0; n9 < 9; ++n9) {
            fArray7[11 + n9] = (float)Math.sqrt(tonalityAnalysisState.std[n9]);
        }
        fArray7[20] = analysisInfo.tonality;
        fArray7[21] = analysisInfo.activity;
        fArray7[22] = f23;
        fArray7[23] = analysisInfo.tonality_slope;
        fArray7[24] = tonalityAnalysisState.lowECount;
        if (analysisInfo.enabled) {
            MultiLayerPerceptron.mlp_process((MLPState)OpusTables.net, (float[])fArray7, (float[])fArray8);
            fArray8[0] = 0.5f * (fArray8[0] + 1.0f);
            fArray8[0] = 0.01f + 1.21f * fArray8[0] * fArray8[0] - 0.23f * (float)Math.pow(fArray8[0], 10.0);
            fArray8[1] = 0.5f * fArray8[1] + 0.5f;
            fArray8[0] = fArray8[1] * fArray8[0] + (1.0f - fArray8[1]) * 0.5f;
            f11 = 5.0E-5f * fArray8[1];
            float f28 = 0.05f;
            f2 = Inlines.MAX16(0.05f, Inlines.MIN16(0.95f, fArray8[0]));
            f = Inlines.MAX16(0.05f, Inlines.MIN16(0.95f, tonalityAnalysisState.music_prob));
            f28 = 0.01f + 0.05f * Inlines.ABS16(f2 - f) / (f2 * (1.0f - f) + f * (1.0f - f2));
            float f29 = (1.0f - tonalityAnalysisState.music_prob) * (1.0f - f11) + tonalityAnalysisState.music_prob * f11;
            f8 = tonalityAnalysisState.music_prob * (1.0f - f11) + (1.0f - tonalityAnalysisState.music_prob) * f11;
            analysisInfo.music_prob = tonalityAnalysisState.music_prob = (f8 *= (float)Math.pow(fArray8[0], f28)) / ((f29 *= (float)Math.pow(1.0f - fArray8[0], f28)) + f8);
            f5 = 1.0E-20f;
            f4 = (float)Math.pow(1.0f - fArray8[0], f28);
            f3 = (float)Math.pow(fArray8[0], f28);
            if (tonalityAnalysisState.count == 1) {
                tonalityAnalysisState.pspeech[0] = 0.5f;
                tonalityAnalysisState.pmusic[0] = 0.5f;
            }
            f7 = tonalityAnalysisState.pspeech[0] + tonalityAnalysisState.pspeech[1];
            f6 = tonalityAnalysisState.pmusic[0] + tonalityAnalysisState.pmusic[1];
            tonalityAnalysisState.pspeech[0] = f7 * (1.0f - f11) * f4;
            tonalityAnalysisState.pmusic[0] = f6 * (1.0f - f11) * f3;
            for (n9 = 1; n9 < 199; ++n9) {
                tonalityAnalysisState.pspeech[n9] = tonalityAnalysisState.pspeech[n9 + 1] * f4;
                tonalityAnalysisState.pmusic[n9] = tonalityAnalysisState.pmusic[n9 + 1] * f3;
            }
            tonalityAnalysisState.pspeech[199] = f6 * f11 * f4;
            tonalityAnalysisState.pmusic[199] = f7 * f11 * f3;
            for (n9 = 0; n9 < 200; ++n9) {
                f5 += tonalityAnalysisState.pspeech[n9] + tonalityAnalysisState.pmusic[n9];
            }
            f5 = 1.0f / f5;
            n9 = 0;
            while (n9 < 200) {
                int n19 = n9;
                tonalityAnalysisState.pspeech[n19] = tonalityAnalysisState.pspeech[n19] * f5;
                int n20 = n9++;
                tonalityAnalysisState.pmusic[n20] = tonalityAnalysisState.pmusic[n20] * f5;
            }
            f5 = tonalityAnalysisState.pmusic[0];
            for (n9 = 1; n9 < 200; ++n9) {
                f5 += tonalityAnalysisState.pspeech[n9];
            }
            if ((double)fArray8[1] > 0.75) {
                if ((double)tonalityAnalysisState.music_prob > 0.9) {
                    f2 = 1.0f / (float)(++tonalityAnalysisState.music_confidence_count);
                    tonalityAnalysisState.music_confidence_count = Inlines.IMIN(tonalityAnalysisState.music_confidence_count, 500);
                    tonalityAnalysisState.music_confidence += f2 * Inlines.MAX16(-0.2f, fArray8[0] - tonalityAnalysisState.music_confidence);
                }
                if ((double)tonalityAnalysisState.music_prob < 0.1) {
                    f2 = 1.0f / (float)(++tonalityAnalysisState.speech_confidence_count);
                    tonalityAnalysisState.speech_confidence_count = Inlines.IMIN(tonalityAnalysisState.speech_confidence_count, 500);
                    tonalityAnalysisState.speech_confidence += f2 * Inlines.MIN16(0.2f, fArray8[0] - tonalityAnalysisState.speech_confidence);
                }
            } else {
                if (tonalityAnalysisState.music_confidence_count == 0) {
                    tonalityAnalysisState.music_confidence = 0.9f;
                }
                if (tonalityAnalysisState.speech_confidence_count == 0) {
                    tonalityAnalysisState.speech_confidence = 0.1f;
                }
            }
            if (tonalityAnalysisState.last_music != (tonalityAnalysisState.music_prob > 0.5f ? 1 : 0)) {
                tonalityAnalysisState.last_transition = 0;
            }
            tonalityAnalysisState.last_music = tonalityAnalysisState.music_prob > 0.5f ? 1 : 0;
        } else {
            analysisInfo.music_prob = 0.0f;
        }
        analysisInfo.bandwidth = n12;
        analysisInfo.noisiness = f22;
        analysisInfo.valid = 1;
    }

    static void tonality_get_info(TonalityAnalysisState tonalityAnalysisState, AnalysisInfo analysisInfo, int n) {
        int n2;
        int n3 = tonalityAnalysisState.read_pos;
        int n4 = tonalityAnalysisState.write_pos - tonalityAnalysisState.read_pos;
        if (n4 < 0) {
            n4 += 200;
        }
        if (n > 480 && n3 != tonalityAnalysisState.write_pos) {
            if (++n3 == 200) {
                n3 = 0;
            }
        }
        if (n3 == tonalityAnalysisState.write_pos) {
            --n3;
        }
        if (n3 < 0) {
            n3 = 199;
        }
        analysisInfo.Assign(tonalityAnalysisState.info[n3]);
        tonalityAnalysisState.read_subframe += n / 120;
        while (tonalityAnalysisState.read_subframe >= 4) {
            tonalityAnalysisState.read_subframe -= 4;
            ++tonalityAnalysisState.read_pos;
        }
        if (tonalityAnalysisState.read_pos >= 200) {
            tonalityAnalysisState.read_pos -= 200;
        }
        n4 = Inlines.IMAX(n4 - 10, 0);
        float f = 0.0f;
        for (n2 = 0; n2 < 200 - n4; ++n2) {
            f += tonalityAnalysisState.pmusic[n2];
        }
        while (n2 < 200) {
            f += tonalityAnalysisState.pspeech[n2];
            ++n2;
        }
        analysisInfo.music_prob = f = f * tonalityAnalysisState.music_confidence + (1.0f - f) * tonalityAnalysisState.speech_confidence;
    }

    static void run_analysis(TonalityAnalysisState tonalityAnalysisState, CeltMode celtMode, short[] sArray, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, AnalysisInfo analysisInfo) {
        if (sArray != null) {
            n2 = Inlines.IMIN(195 * n7 / 100, n2);
            int n9 = n2 - tonalityAnalysisState.analysis_offset;
            int n10 = tonalityAnalysisState.analysis_offset;
            do {
                Analysis.tonality_analysis(tonalityAnalysisState, celtMode, sArray, n, Inlines.IMIN(480, n9), n10, n4, n5, n6, n8);
                n10 += 480;
            } while ((n9 -= 480) > 0);
            tonalityAnalysisState.analysis_offset = n2;
            tonalityAnalysisState.analysis_offset -= n3;
        }
        analysisInfo.valid = 0;
        Analysis.tonality_get_info(tonalityAnalysisState, analysisInfo, n3);
    }

    static void tonality_analysis_init(TonalityAnalysisState tonalityAnalysisState) {
        tonalityAnalysisState.Reset();
    }
}

