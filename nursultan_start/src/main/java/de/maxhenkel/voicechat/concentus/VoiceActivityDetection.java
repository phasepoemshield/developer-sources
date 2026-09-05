/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Filters
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Sigmoid;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkVADState;

class VoiceActivityDetection {
    private static final int[] tiltWeights;

    VoiceActivityDetection() {
    }

    static {
        int[] nArray = new int[4];
        nArray[0] = 30000;
        nArray[1] = 6000;
        nArray[2] = -12000;
        nArray[3] = -12000;
        tiltWeights = nArray;
    }

    static void silk_VAD_GetNoiseLevels(int[] nArray, SilkVADState silkVADState) {
        int n = silkVADState.counter < 1000 ? Inlines.silk_DIV32_16((int)Short.MAX_VALUE, (int)((short)(Inlines.silk_RSHIFT((int)silkVADState.counter, (int)4) + 1))) : 0;
        for (int i = 0; i < 4; ++i) {
            int n2 = silkVADState.NL[i];
            Inlines.OpusAssert((n2 >= 0 ? 1 : 0) != 0);
            int n3 = Inlines.silk_ADD_POS_SAT32((int)nArray[i], (int)silkVADState.NoiseLevelBias[i]);
            Inlines.OpusAssert((n3 > 0 ? 1 : 0) != 0);
            int n4 = Inlines.silk_DIV32((int)Integer.MAX_VALUE, (int)n3);
            Inlines.OpusAssert((n4 >= 0 ? 1 : 0) != 0);
            int n5 = n3 > Inlines.silk_LSHIFT((int)n2, (int)3) ? 128 : (n3 < n2 ? 1024 : Inlines.silk_SMULWB((int)Inlines.silk_SMULWW((int)n4, (int)n2), (int)2048));
            n5 = Inlines.silk_max_int((int)n5, (int)n);
            silkVADState.inv_NL[i] = Inlines.silk_SMLAWB((int)silkVADState.inv_NL[i], (int)(n4 - silkVADState.inv_NL[i]), (int)n5);
            Inlines.OpusAssert((silkVADState.inv_NL[i] >= 0 ? 1 : 0) != 0);
            n2 = Inlines.silk_DIV32((int)Integer.MAX_VALUE, (int)silkVADState.inv_NL[i]);
            Inlines.OpusAssert((n2 >= 0 ? 1 : 0) != 0);
            silkVADState.NL[i] = n2 = Inlines.silk_min((int)n2, (int)0xFFFFFF);
        }
        ++silkVADState.counter;
    }

    static int silk_VAD_GetSA_Q8(SilkChannelEncoder silkChannelEncoder, short[] sArray, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = 0;
        int[] nArray = new int[4];
        int[] nArray2 = new int[4];
        int[] nArray3 = new int[4];
        int n7 = 0;
        SilkVADState silkVADState = silkChannelEncoder.sVAD;
        Inlines.OpusAssert((boolean)true);
        Inlines.OpusAssert((320 >= silkChannelEncoder.frame_length ? 1 : 0) != 0);
        Inlines.OpusAssert((silkChannelEncoder.frame_length <= 512 ? 1 : 0) != 0);
        Inlines.OpusAssert((silkChannelEncoder.frame_length == 8 * Inlines.silk_RSHIFT((int)silkChannelEncoder.frame_length, (int)3) ? 1 : 0) != 0);
        int n8 = Inlines.silk_RSHIFT((int)silkChannelEncoder.frame_length, (int)1);
        int n9 = Inlines.silk_RSHIFT((int)silkChannelEncoder.frame_length, (int)2);
        int n10 = Inlines.silk_RSHIFT((int)silkChannelEncoder.frame_length, (int)3);
        nArray3[0] = 0;
        nArray3[1] = n10 + n9;
        nArray3[2] = nArray3[1] + n10;
        nArray3[3] = nArray3[2] + n9;
        short[] sArray2 = new short[nArray3[3] + n8];
        Filters.silk_ana_filt_bank_1((short[])sArray, (int)n, (int[])silkVADState.AnaState, (short[])sArray2, (short[])sArray2, (int)nArray3[3], (int)silkChannelEncoder.frame_length);
        Filters.silk_ana_filt_bank_1((short[])sArray2, (int)0, (int[])silkVADState.AnaState1, (short[])sArray2, (short[])sArray2, (int)nArray3[2], (int)n8);
        Filters.silk_ana_filt_bank_1((short[])sArray2, (int)0, (int[])silkVADState.AnaState2, (short[])sArray2, (short[])sArray2, (int)nArray3[1], (int)n9);
        sArray2[n10 - 1] = (short)Inlines.silk_RSHIFT((int)sArray2[n10 - 1], (int)1);
        short s = sArray2[n10 - 1];
        for (n5 = n10 - 1; n5 > 0; --n5) {
            sArray2[n5 - 1] = (short)Inlines.silk_RSHIFT((int)sArray2[n5 - 1], (int)1);
            int n11 = n5;
            sArray2[n11] = (short)(sArray2[n11] - sArray2[n5 - 1]);
        }
        sArray2[0] = (short)(sArray2[0] - silkVADState.HPstate);
        silkVADState.HPstate = s;
        for (n4 = 0; n4 < 4; ++n4) {
            n10 = Inlines.silk_RSHIFT((int)silkChannelEncoder.frame_length, (int)Inlines.silk_min_int((int)(4 - n4), (int)3));
            int n12 = Inlines.silk_RSHIFT((int)n10, (int)2);
            int n13 = 0;
            nArray[n4] = silkVADState.XnrgSubfr[n4];
            for (int i = 0; i < 4; ++i) {
                n6 = 0;
                for (n5 = 0; n5 < n12; ++n5) {
                    int n14 = Inlines.silk_RSHIFT((int)sArray2[nArray3[n4] + n5 + n13], (int)3);
                    Inlines.OpusAssert(((n6 = Inlines.silk_SMLABB((int)n6, (int)n14, (int)n14)) >= 0 ? 1 : 0) != 0);
                }
                nArray[n4] = i < 3 ? Inlines.silk_ADD_POS_SAT32((int)nArray[n4], (int)n6) : Inlines.silk_ADD_POS_SAT32((int)nArray[n4], (int)Inlines.silk_RSHIFT((int)n6, (int)1));
                n13 += n12;
            }
            silkVADState.XnrgSubfr[n4] = n6;
        }
        VoiceActivityDetection.silk_VAD_GetNoiseLevels(nArray, silkVADState);
        n6 = 0;
        int n15 = 0;
        for (n4 = 0; n4 < 4; ++n4) {
            n3 = nArray[n4] - silkVADState.NL[n4];
            if (n3 > 0) {
                nArray2[n4] = (nArray[n4] & 0xFF800000) == 0 ? Inlines.silk_DIV32((int)Inlines.silk_LSHIFT((int)nArray[n4], (int)8), (int)(silkVADState.NL[n4] + 1)) : Inlines.silk_DIV32((int)nArray[n4], (int)(Inlines.silk_RSHIFT((int)silkVADState.NL[n4], (int)8) + 1));
                n2 = Inlines.silk_lin2log((int)nArray2[n4]) - 1024;
                n6 = Inlines.silk_SMLABB((int)n6, (int)n2, (int)n2);
                if (n3 < 0x100000) {
                    n2 = Inlines.silk_SMULWB((int)Inlines.silk_LSHIFT((int)Inlines.silk_SQRT_APPROX((int)n3), (int)6), (int)n2);
                }
                n15 = Inlines.silk_SMLAWB((int)n15, (int)tiltWeights[n4], (int)n2);
                continue;
            }
            nArray2[n4] = 256;
        }
        n6 = Inlines.silk_DIV32_16((int)n6, (int)4);
        short s2 = (short)(3 * Inlines.silk_SQRT_APPROX((int)n6));
        int n16 = Sigmoid.silk_sigm_Q15(Inlines.silk_SMULWB((int)45000, (int)s2) - 128);
        silkChannelEncoder.input_tilt_Q15 = Inlines.silk_LSHIFT((int)(Sigmoid.silk_sigm_Q15(n15) - 16384), (int)1);
        n3 = 0;
        for (n4 = 0; n4 < 4; ++n4) {
            n3 += (n4 + 1) * Inlines.silk_RSHIFT((int)(nArray[n4] - silkVADState.NL[n4]), (int)4);
        }
        if (n3 <= 0) {
            n16 = Inlines.silk_RSHIFT((int)n16, (int)1);
        } else if (n3 < 32768) {
            n3 = silkChannelEncoder.frame_length == 10 * silkChannelEncoder.fs_kHz ? Inlines.silk_LSHIFT_SAT32((int)n3, (int)16) : Inlines.silk_LSHIFT_SAT32((int)n3, (int)15);
            n3 = Inlines.silk_SQRT_APPROX((int)n3);
            n16 = Inlines.silk_SMULWB((int)(32768 + n3), (int)n16);
        }
        silkChannelEncoder.speech_activity_Q8 = Inlines.silk_min_int((int)Inlines.silk_RSHIFT((int)n16, (int)7), (int)255);
        int n17 = Inlines.silk_SMULWB((int)4096, (int)Inlines.silk_SMULWB((int)n16, (int)n16));
        if (silkChannelEncoder.frame_length == 10 * silkChannelEncoder.fs_kHz) {
            n17 >>= 1;
        }
        for (n4 = 0; n4 < 4; ++n4) {
            silkVADState.NrgRatioSmth_Q8[n4] = Inlines.silk_SMLAWB((int)silkVADState.NrgRatioSmth_Q8[n4], (int)(nArray2[n4] - silkVADState.NrgRatioSmth_Q8[n4]), (int)n17);
            n2 = 3 * (Inlines.silk_lin2log((int)silkVADState.NrgRatioSmth_Q8[n4]) - 1024);
            silkChannelEncoder.input_quality_bands_Q15[n4] = Sigmoid.silk_sigm_Q15(Inlines.silk_RSHIFT((int)(n2 - 2048), (int)4));
        }
        return n7;
    }

    static int silk_VAD_Init(SilkVADState silkVADState) {
        int n;
        int n2 = 0;
        silkVADState.Reset();
        for (n = 0; n < 4; ++n) {
            silkVADState.NoiseLevelBias[n] = Inlines.silk_max_32((int)Inlines.silk_DIV32_16((int)50, (int)((short)(n + 1))), (int)1);
        }
        for (n = 0; n < 4; ++n) {
            silkVADState.NL[n] = Inlines.silk_MUL((int)100, (int)silkVADState.NoiseLevelBias[n]);
            silkVADState.inv_NL[n] = Inlines.silk_DIV32((int)Integer.MAX_VALUE, (int)silkVADState.NL[n]);
        }
        silkVADState.counter = 15;
        for (n = 0; n < 4; ++n) {
            silkVADState.NrgRatioSmth_Q8[n] = 25600;
        }
        return n2;
    }
}

