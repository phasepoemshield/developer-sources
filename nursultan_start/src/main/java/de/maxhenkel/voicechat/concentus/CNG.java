/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.NLSF
 *  de.maxhenkel.voicechat.concentus.SilkChannelDecoder
 *  de.maxhenkel.voicechat.concentus.SilkDecoderControl
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CNGState;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.NLSF;
import de.maxhenkel.voicechat.concentus.SilkChannelDecoder;
import de.maxhenkel.voicechat.concentus.SilkDecoderControl;

class CNG {
    CNG() {
    }

    static void silk_CNG_Reset(SilkChannelDecoder silkChannelDecoder) {
        int n = Inlines.silk_DIV32_16(Short.MAX_VALUE, (short)(silkChannelDecoder.LPC_order + 1));
        int n2 = 0;
        for (int i = 0; i < silkChannelDecoder.LPC_order; ++i) {
            silkChannelDecoder.sCNG.CNG_smth_NLSF_Q15[i] = (short)(n2 += n);
        }
        silkChannelDecoder.sCNG.CNG_smth_Gain_Q16 = 0;
        silkChannelDecoder.sCNG.rand_seed = 3176576;
    }

    static void silk_CNG_exc(int[] nArray, int n, int[] nArray2, int n2, int n3, BoxedValueInt boxedValueInt) {
        int n4 = 255;
        while (n4 > n3) {
            n4 = Inlines.silk_RSHIFT(n4, 1);
        }
        int n5 = boxedValueInt.Val;
        for (int i = n; i < n + n3; ++i) {
            int n6 = Inlines.silk_RSHIFT(n5 = Inlines.silk_RAND(n5), 24) & n4;
            Inlines.OpusAssert(n6 >= 0);
            Inlines.OpusAssert(n6 <= 255);
            nArray[i] = (short)Inlines.silk_SAT16(Inlines.silk_SMULWW(nArray2[n6], n2 >> 4));
        }
        boxedValueInt.Val = n5;
    }

    static void silk_CNG(SilkChannelDecoder silkChannelDecoder, SilkDecoderControl silkDecoderControl, short[] sArray, int n, int n2) {
        int n3;
        short[] sArray2 = new short[silkChannelDecoder.LPC_order];
        CNGState cNGState = silkChannelDecoder.sCNG;
        if (silkChannelDecoder.fs_kHz != cNGState.fs_kHz) {
            CNG.silk_CNG_Reset(silkChannelDecoder);
            cNGState.fs_kHz = silkChannelDecoder.fs_kHz;
        }
        if (silkChannelDecoder.lossCnt == 0 && silkChannelDecoder.prevSignalType == 0) {
            for (n3 = 0; n3 < silkChannelDecoder.LPC_order; ++n3) {
                int n4 = n3;
                cNGState.CNG_smth_NLSF_Q15[n4] = (short)(cNGState.CNG_smth_NLSF_Q15[n4] + (short)Inlines.silk_SMULWB(silkChannelDecoder.prevNLSF_Q15[n3] - cNGState.CNG_smth_NLSF_Q15[n3], 16348));
            }
            int n5 = 0;
            int n6 = 0;
            for (n3 = 0; n3 < silkChannelDecoder.nb_subfr; ++n3) {
                if (silkDecoderControl.Gains_Q16[n3] <= n5) continue;
                n5 = silkDecoderControl.Gains_Q16[n3];
                n6 = n3;
            }
            Arrays.MemMove(cNGState.CNG_exc_buf_Q14, 0, silkChannelDecoder.subfr_length, (silkChannelDecoder.nb_subfr - 1) * silkChannelDecoder.subfr_length);
            for (n3 = 0; n3 < silkChannelDecoder.nb_subfr; ++n3) {
                cNGState.CNG_smth_Gain_Q16 += Inlines.silk_SMULWB(silkDecoderControl.Gains_Q16[n3] - cNGState.CNG_smth_Gain_Q16, 4634);
            }
        }
        if (silkChannelDecoder.lossCnt != 0) {
            int[] nArray = new int[n2 + 16];
            int n7 = Inlines.silk_SMULWW(silkChannelDecoder.sPLC.randScale_Q14, silkChannelDecoder.sPLC.prevGain_Q16[1]);
            if (n7 >= 0x200000 || cNGState.CNG_smth_Gain_Q16 > 0x800000) {
                n7 = Inlines.silk_SMULTT(n7, n7);
                n7 = Inlines.silk_SUB_LSHIFT32(Inlines.silk_SMULTT(cNGState.CNG_smth_Gain_Q16, cNGState.CNG_smth_Gain_Q16), n7, 5);
                n7 = Inlines.silk_LSHIFT32(Inlines.silk_SQRT_APPROX(n7), 16);
            } else {
                n7 = Inlines.silk_SMULWW(n7, n7);
                n7 = Inlines.silk_SUB_LSHIFT32(Inlines.silk_SMULWW(cNGState.CNG_smth_Gain_Q16, cNGState.CNG_smth_Gain_Q16), n7, 5);
                n7 = Inlines.silk_LSHIFT32(Inlines.silk_SQRT_APPROX(n7), 8);
            }
            BoxedValueInt boxedValueInt = new BoxedValueInt(cNGState.rand_seed);
            CNG.silk_CNG_exc(nArray, 16, cNGState.CNG_exc_buf_Q14, n7, n2, boxedValueInt);
            cNGState.rand_seed = boxedValueInt.Val;
            NLSF.silk_NLSF2A((short[])sArray2, (short[])cNGState.CNG_smth_NLSF_Q15, (int)silkChannelDecoder.LPC_order);
            System.arraycopy(cNGState.CNG_synth_state, 0, nArray, 0, 16);
            for (n3 = 0; n3 < n2; ++n3) {
                int n8 = 16 + n3;
                Inlines.OpusAssert(silkChannelDecoder.LPC_order == 10 || silkChannelDecoder.LPC_order == 16);
                int n9 = Inlines.silk_RSHIFT(silkChannelDecoder.LPC_order, 1);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 1], sArray2[0]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 2], sArray2[1]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 3], sArray2[2]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 4], sArray2[3]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 5], sArray2[4]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 6], sArray2[5]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 7], sArray2[6]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 8], sArray2[7]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 9], sArray2[8]);
                n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 10], sArray2[9]);
                if (silkChannelDecoder.LPC_order == 16) {
                    n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 11], sArray2[10]);
                    n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 12], sArray2[11]);
                    n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 13], sArray2[12]);
                    n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 14], sArray2[13]);
                    n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 15], sArray2[14]);
                    n9 = Inlines.silk_SMLAWB(n9, nArray[n8 - 16], sArray2[15]);
                }
                nArray[n8] = Inlines.silk_ADD_LSHIFT(nArray[n8], n9, 4);
                sArray[n + n3] = Inlines.silk_ADD_SAT16(sArray[n + n3], (short)Inlines.silk_RSHIFT_ROUND(nArray[n8], 10));
            }
            System.arraycopy(nArray, n2, cNGState.CNG_synth_state, 0, 16);
        } else {
            Arrays.MemSet(cNGState.CNG_synth_state, 0, silkChannelDecoder.LPC_order);
        }
    }
}

