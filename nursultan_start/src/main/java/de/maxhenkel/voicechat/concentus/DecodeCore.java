/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.SilkChannelDecoder
 *  de.maxhenkel.voicechat.concentus.SilkDecoderControl
 *  de.maxhenkel.voicechat.concentus.SilkTables
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkChannelDecoder;
import de.maxhenkel.voicechat.concentus.SilkDecoderControl;
import de.maxhenkel.voicechat.concentus.SilkTables;

class DecodeCore {
    DecodeCore() {
    }

    static void silk_decode_core(SilkChannelDecoder silkChannelDecoder, SilkDecoderControl silkDecoderControl, short[] sArray, int n, short[] sArray2) {
        int n2;
        int n3 = 0;
        short[] sArray3 = silkDecoderControl.LTPCoef_Q14;
        Inlines.OpusAssert(silkChannelDecoder.prev_gain_Q16 != 0);
        short[] sArray4 = new short[silkChannelDecoder.ltp_mem_length];
        int[] nArray = new int[silkChannelDecoder.ltp_mem_length + silkChannelDecoder.frame_length];
        int[] nArray2 = new int[silkChannelDecoder.subfr_length];
        int[] nArray3 = new int[silkChannelDecoder.subfr_length + 16];
        short s = SilkTables.silk_Quantization_Offsets_Q10[silkChannelDecoder.indices.signalType >> 1][silkChannelDecoder.indices.quantOffsetType];
        boolean bl = silkChannelDecoder.indices.NLSFInterpCoef_Q2 < 4;
        int n4 = silkChannelDecoder.indices.Seed;
        for (n2 = 0; n2 < silkChannelDecoder.frame_length; ++n2) {
            n4 = Inlines.silk_RAND(n4);
            silkChannelDecoder.exc_Q14[n2] = Inlines.silk_LSHIFT(sArray2[n2], 14);
            if (silkChannelDecoder.exc_Q14[n2] > 0) {
                int n5 = n2;
                silkChannelDecoder.exc_Q14[n5] = silkChannelDecoder.exc_Q14[n5] - 1280;
            } else if (silkChannelDecoder.exc_Q14[n2] < 0) {
                int n6 = n2;
                silkChannelDecoder.exc_Q14[n6] = silkChannelDecoder.exc_Q14[n6] + 1280;
            }
            int n7 = n2;
            silkChannelDecoder.exc_Q14[n7] = silkChannelDecoder.exc_Q14[n7] + (s << 4);
            if (n4 < 0) {
                silkChannelDecoder.exc_Q14[n2] = -silkChannelDecoder.exc_Q14[n2];
            }
            n4 = Inlines.silk_ADD32_ovflw(n4, sArray2[n2]);
        }
        System.arraycopy(silkChannelDecoder.sLPC_Q14_buf, 0, nArray3, 0, 16);
        int n8 = 0;
        int n9 = n;
        int n10 = silkChannelDecoder.ltp_mem_length;
        for (int i = 0; i < silkChannelDecoder.nb_subfr; ++i) {
            int n11;
            int[] nArray4 = nArray2;
            int n12 = 0;
            short[] sArray5 = silkDecoderControl.PredCoef_Q12[i >> 1];
            int n13 = i * 5;
            int n14 = silkChannelDecoder.indices.signalType;
            int n15 = Inlines.silk_RSHIFT(silkDecoderControl.Gains_Q16[i], 6);
            int n16 = Inlines.silk_INVERSE32_varQ(silkDecoderControl.Gains_Q16[i], 47);
            if (silkDecoderControl.Gains_Q16[i] != silkChannelDecoder.prev_gain_Q16) {
                n11 = Inlines.silk_DIV32_varQ(silkChannelDecoder.prev_gain_Q16, silkDecoderControl.Gains_Q16[i], 16);
                for (n2 = 0; n2 < 16; ++n2) {
                    nArray3[n2] = Inlines.silk_SMULWW(n11, nArray3[n2]);
                }
            } else {
                n11 = 65536;
            }
            Inlines.OpusAssert(n16 != 0);
            silkChannelDecoder.prev_gain_Q16 = silkDecoderControl.Gains_Q16[i];
            if (silkChannelDecoder.lossCnt != 0 && silkChannelDecoder.prevSignalType == 2 && silkChannelDecoder.indices.signalType != 2 && i < 2) {
                Arrays.MemSetWithOffset(sArray3, (short)0, n13, 5);
                sArray3[n13 + 2] = 4096;
                n14 = 2;
                silkDecoderControl.pitchL[i] = silkChannelDecoder.lagPrev;
            }
            if (n14 == 2) {
                n3 = silkDecoderControl.pitchL[i];
                if (i == 0 || i == 2 && bl) {
                    int n17 = silkChannelDecoder.ltp_mem_length - n3 - silkChannelDecoder.LPC_order - 2;
                    Inlines.OpusAssert(n17 > 0);
                    if (i == 2) {
                        System.arraycopy(sArray, n, silkChannelDecoder.outBuf, silkChannelDecoder.ltp_mem_length, 2 * silkChannelDecoder.subfr_length);
                    }
                    Filters.silk_LPC_analysis_filter(sArray4, n17, silkChannelDecoder.outBuf, n17 + i * silkChannelDecoder.subfr_length, sArray5, 0, silkChannelDecoder.ltp_mem_length - n17, silkChannelDecoder.LPC_order);
                    if (i == 0) {
                        n16 = Inlines.silk_LSHIFT(Inlines.silk_SMULWB(n16, silkDecoderControl.LTP_scale_Q14), 2);
                    }
                    for (n2 = 0; n2 < n3 + 2; ++n2) {
                        nArray[n10 - n2 - 1] = Inlines.silk_SMULWB(n16, sArray4[silkChannelDecoder.ltp_mem_length - n2 - 1]);
                    }
                } else if (n11 != 65536) {
                    for (n2 = 0; n2 < n3 + 2; ++n2) {
                        nArray[n10 - n2 - 1] = Inlines.silk_SMULWW(n11, nArray[n10 - n2 - 1]);
                    }
                }
            }
            if (n14 == 2) {
                int n18 = n10 - n3 + 2;
                for (n2 = 0; n2 < silkChannelDecoder.subfr_length; ++n2) {
                    int n19 = 2;
                    n19 = Inlines.silk_SMLAWB(n19, nArray[n18], sArray3[n13]);
                    n19 = Inlines.silk_SMLAWB(n19, nArray[n18 - 1], sArray3[n13 + 1]);
                    n19 = Inlines.silk_SMLAWB(n19, nArray[n18 - 2], sArray3[n13 + 2]);
                    n19 = Inlines.silk_SMLAWB(n19, nArray[n18 - 3], sArray3[n13 + 3]);
                    n19 = Inlines.silk_SMLAWB(n19, nArray[n18 - 4], sArray3[n13 + 4]);
                    ++n18;
                    nArray4[n12 + n2] = Inlines.silk_ADD_LSHIFT32(silkChannelDecoder.exc_Q14[n8 + n2], n19, 1);
                    nArray[n10] = Inlines.silk_LSHIFT(nArray4[n12 + n2], 1);
                    ++n10;
                }
            } else {
                nArray4 = silkChannelDecoder.exc_Q14;
                n12 = n8;
            }
            for (n2 = 0; n2 < silkChannelDecoder.subfr_length; ++n2) {
                Inlines.OpusAssert(silkChannelDecoder.LPC_order == 10 || silkChannelDecoder.LPC_order == 16);
                int n20 = Inlines.silk_RSHIFT(silkChannelDecoder.LPC_order, 1);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 1], sArray5[0]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 2], sArray5[1]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 3], sArray5[2]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 4], sArray5[3]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 5], sArray5[4]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 6], sArray5[5]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 7], sArray5[6]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 8], sArray5[7]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 9], sArray5[8]);
                n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 10], sArray5[9]);
                if (silkChannelDecoder.LPC_order == 16) {
                    n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 11], sArray5[10]);
                    n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 12], sArray5[11]);
                    n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 13], sArray5[12]);
                    n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 14], sArray5[13]);
                    n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 15], sArray5[14]);
                    n20 = Inlines.silk_SMLAWB(n20, nArray3[16 + n2 - 16], sArray5[15]);
                }
                nArray3[16 + n2] = Inlines.silk_ADD_LSHIFT32(nArray4[n12 + n2], n20, 4);
                sArray[n9 + n2] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWW(nArray3[16 + n2], n15), 8));
            }
            System.arraycopy(nArray3, silkChannelDecoder.subfr_length, nArray3, 0, 16);
            n8 += silkChannelDecoder.subfr_length;
            n9 += silkChannelDecoder.subfr_length;
        }
        System.arraycopy(nArray3, 0, silkChannelDecoder.sLPC_Q14_buf, 0, 16);
    }
}

