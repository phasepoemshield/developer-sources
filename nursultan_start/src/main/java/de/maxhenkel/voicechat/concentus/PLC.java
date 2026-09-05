/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BWExpander
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.Filters
 *  de.maxhenkel.voicechat.concentus.Inlines
 *  de.maxhenkel.voicechat.concentus.LPCInversePredGain
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BWExpander;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.LPCInversePredGain;
import de.maxhenkel.voicechat.concentus.PLCStruct;
import de.maxhenkel.voicechat.concentus.SilkChannelDecoder;
import de.maxhenkel.voicechat.concentus.SilkDecoderControl;
import de.maxhenkel.voicechat.concentus.SumSqrShift;

class PLC {
    private static final int NB_ATT = 2;
    private static final short[] HARM_ATT_Q15;
    private static final short[] PLC_RAND_ATTENUATE_V_Q15;
    private static final short[] PLC_RAND_ATTENUATE_UV_Q15;

    PLC() {
    }

    static {
        short[] sArray = new short[2];
        sArray[0] = 32440;
        sArray[1] = 31130;
        HARM_ATT_Q15 = sArray;
        short[] sArray2 = new short[2];
        sArray2[0] = 31130;
        sArray2[1] = 26214;
        PLC_RAND_ATTENUATE_V_Q15 = sArray2;
        short[] sArray3 = new short[2];
        sArray3[0] = 32440;
        sArray3[1] = 29491;
        PLC_RAND_ATTENUATE_UV_Q15 = sArray3;
    }

    static void silk_PLC_glue_frames(SilkChannelDecoder silkChannelDecoder, short[] sArray, int n, int n2) {
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        PLCStruct pLCStruct = silkChannelDecoder.sPLC;
        if (silkChannelDecoder.lossCnt != 0) {
            BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
            BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
            SumSqrShift.silk_sum_sqr_shift(boxedValueInt3, boxedValueInt4, sArray, n, n2);
            pLCStruct.conc_energy = boxedValueInt3.Val;
            pLCStruct.conc_energy_shift = boxedValueInt4.Val;
            pLCStruct.last_frame_lost = 1;
        } else {
            if (silkChannelDecoder.sPLC.last_frame_lost != 0) {
                SumSqrShift.silk_sum_sqr_shift(boxedValueInt2, boxedValueInt, sArray, n, n2);
                if (boxedValueInt.Val > pLCStruct.conc_energy_shift) {
                    pLCStruct.conc_energy = Inlines.silk_RSHIFT((int)pLCStruct.conc_energy, (int)(boxedValueInt.Val - pLCStruct.conc_energy_shift));
                } else if (boxedValueInt.Val < pLCStruct.conc_energy_shift) {
                    boxedValueInt2.Val = Inlines.silk_RSHIFT((int)boxedValueInt2.Val, (int)(pLCStruct.conc_energy_shift - boxedValueInt.Val));
                }
                if (boxedValueInt2.Val > pLCStruct.conc_energy) {
                    int n3 = Inlines.silk_CLZ32((int)pLCStruct.conc_energy);
                    pLCStruct.conc_energy = Inlines.silk_LSHIFT((int)pLCStruct.conc_energy, (int)(--n3));
                    boxedValueInt2.Val = Inlines.silk_RSHIFT((int)boxedValueInt2.Val, (int)Inlines.silk_max_32((int)(24 - n3), (int)0));
                    int n4 = Inlines.silk_DIV32((int)pLCStruct.conc_energy, (int)Inlines.silk_max((int)boxedValueInt2.Val, (int)1));
                    int n5 = Inlines.silk_LSHIFT((int)Inlines.silk_SQRT_APPROX((int)n4), (int)4);
                    int n6 = Inlines.silk_DIV32_16((int)(65536 - n5), (int)n2);
                    n6 = Inlines.silk_LSHIFT((int)n6, (int)2);
                    for (int i = n; i < n + n2; ++i) {
                        sArray[i] = (short)Inlines.silk_SMULWB((int)n5, (int)sArray[i]);
                        if ((n5 += n6) > 65536) break;
                    }
                }
            }
            pLCStruct.last_frame_lost = 0;
        }
    }

    static void silk_PLC_conceal(SilkChannelDecoder silkChannelDecoder, SilkDecoderControl silkDecoderControl, short[] sArray, int n) {
        int n2;
        int n3;
        int n4;
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        short[] sArray2 = new short[silkChannelDecoder.ltp_mem_length];
        int[] nArray = new int[silkChannelDecoder.ltp_mem_length + silkChannelDecoder.frame_length];
        PLCStruct pLCStruct = silkChannelDecoder.sPLC;
        int[] nArray2 = new int[]{Inlines.silk_RSHIFT((int)pLCStruct.prevGain_Q16[0], (int)6), Inlines.silk_RSHIFT((int)pLCStruct.prevGain_Q16[1], (int)6)};
        if (silkChannelDecoder.first_frame_after_reset != 0) {
            Arrays.MemSet((short[])pLCStruct.prevLPC_Q12, (short)0, (int)16);
        }
        PLC.silk_PLC_energy(boxedValueInt, boxedValueInt3, boxedValueInt2, boxedValueInt4, silkChannelDecoder.exc_Q14, nArray2, silkChannelDecoder.subfr_length, silkChannelDecoder.nb_subfr);
        int n5 = Inlines.silk_RSHIFT((int)boxedValueInt.Val, (int)boxedValueInt4.Val) < Inlines.silk_RSHIFT((int)boxedValueInt2.Val, (int)boxedValueInt3.Val) ? Inlines.silk_max_int((int)0, (int)((pLCStruct.nb_subfr - 1) * pLCStruct.subfr_length - 128)) : Inlines.silk_max_int((int)0, (int)(pLCStruct.nb_subfr * pLCStruct.subfr_length - 128));
        short[] sArray3 = pLCStruct.LTPCoef_Q14;
        short s = pLCStruct.randScale_Q14;
        short s2 = HARM_ATT_Q15[Inlines.silk_min_int((int)1, (int)silkChannelDecoder.lossCnt)];
        int n6 = silkChannelDecoder.prevSignalType == 2 ? PLC_RAND_ATTENUATE_V_Q15[Inlines.silk_min_int((int)1, (int)silkChannelDecoder.lossCnt)] : PLC_RAND_ATTENUATE_UV_Q15[Inlines.silk_min_int((int)1, (int)silkChannelDecoder.lossCnt)];
        BWExpander.silk_bwexpander((short[])pLCStruct.prevLPC_Q12, (int)silkChannelDecoder.LPC_order, (int)64881);
        if (silkChannelDecoder.lossCnt == 0) {
            s = 16384;
            if (silkChannelDecoder.prevSignalType == 2) {
                for (n4 = 0; n4 < 5; ++n4) {
                    s = (short)(s - sArray3[n4]);
                }
                s = Inlines.silk_max_16((short)3277, (short)s);
                s = (short)Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)s, (int)pLCStruct.prevLTP_scale_Q14), (int)14);
            } else {
                n3 = LPCInversePredGain.silk_LPC_inverse_pred_gain((short[])pLCStruct.prevLPC_Q12, (int)silkChannelDecoder.LPC_order);
                int n7 = Inlines.silk_min_32((int)Inlines.silk_RSHIFT((int)0x40000000, (int)3), (int)n3);
                n7 = Inlines.silk_max_32((int)Inlines.silk_RSHIFT((int)0x40000000, (int)8), (int)n7);
                n7 = Inlines.silk_LSHIFT((int)n7, (int)3);
                n6 = Inlines.silk_RSHIFT((int)Inlines.silk_SMULWB((int)n7, (int)n6), (int)14);
            }
        }
        int n8 = pLCStruct.rand_seed;
        int n9 = Inlines.silk_RSHIFT_ROUND((int)pLCStruct.pitchL_Q8, (int)8);
        int n10 = silkChannelDecoder.ltp_mem_length;
        int n11 = silkChannelDecoder.ltp_mem_length - n9 - silkChannelDecoder.LPC_order - 2;
        Inlines.OpusAssert((n11 > 0 ? 1 : 0) != 0);
        Filters.silk_LPC_analysis_filter((short[])sArray2, (int)n11, (short[])silkChannelDecoder.outBuf, (int)n11, (short[])pLCStruct.prevLPC_Q12, (int)0, (int)(silkChannelDecoder.ltp_mem_length - n11), (int)silkChannelDecoder.LPC_order);
        int n12 = Inlines.silk_INVERSE32_varQ((int)pLCStruct.prevGain_Q16[1], (int)46);
        n12 = Inlines.silk_min((int)n12, (int)0x3FFFFFFF);
        for (n4 = n11 + silkChannelDecoder.LPC_order; n4 < silkChannelDecoder.ltp_mem_length; ++n4) {
            nArray[n4] = Inlines.silk_SMULWB((int)n12, (int)sArray2[n4]);
        }
        for (int i = 0; i < silkChannelDecoder.nb_subfr; ++i) {
            int n13 = n10 - n9 + 2;
            for (n4 = 0; n4 < silkChannelDecoder.subfr_length; ++n4) {
                int n14 = 2;
                n14 = Inlines.silk_SMLAWB((int)n14, (int)nArray[n13], (int)sArray3[0]);
                n14 = Inlines.silk_SMLAWB((int)n14, (int)nArray[n13 - 1], (int)sArray3[1]);
                n14 = Inlines.silk_SMLAWB((int)n14, (int)nArray[n13 - 2], (int)sArray3[2]);
                n14 = Inlines.silk_SMLAWB((int)n14, (int)nArray[n13 - 3], (int)sArray3[3]);
                n14 = Inlines.silk_SMLAWB((int)n14, (int)nArray[n13 - 4], (int)sArray3[4]);
                ++n13;
                n8 = Inlines.silk_RAND((int)n8);
                n11 = Inlines.silk_RSHIFT((int)n8, (int)25) & 0x7F;
                nArray[n10] = Inlines.silk_LSHIFT32((int)Inlines.silk_SMLAWB((int)n14, (int)silkChannelDecoder.exc_Q14[n5 + n11], (int)s), (int)2);
                ++n10;
            }
            for (n2 = 0; n2 < 5; ++n2) {
                sArray3[n2] = (short)Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)s2, (int)sArray3[n2]), (int)15);
            }
            s = (short)Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)s, (int)n6), (int)15);
            pLCStruct.pitchL_Q8 = Inlines.silk_SMLAWB((int)pLCStruct.pitchL_Q8, (int)pLCStruct.pitchL_Q8, (int)655);
            pLCStruct.pitchL_Q8 = Inlines.silk_min_32((int)pLCStruct.pitchL_Q8, (int)Inlines.silk_LSHIFT((int)Inlines.silk_SMULBB((int)18, (int)silkChannelDecoder.fs_kHz), (int)8));
            n9 = Inlines.silk_RSHIFT_ROUND((int)pLCStruct.pitchL_Q8, (int)8);
        }
        int n15 = silkChannelDecoder.ltp_mem_length - 16;
        System.arraycopy(silkChannelDecoder.sLPC_Q14_buf, 0, nArray, n15, 16);
        Inlines.OpusAssert((silkChannelDecoder.LPC_order >= 10 ? 1 : 0) != 0);
        for (n4 = 0; n4 < silkChannelDecoder.frame_length; ++n4) {
            n3 = n15 + 16 + n4;
            int n16 = Inlines.silk_RSHIFT((int)silkChannelDecoder.LPC_order, (int)1);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 1], (int)pLCStruct.prevLPC_Q12[0]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 2], (int)pLCStruct.prevLPC_Q12[1]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 3], (int)pLCStruct.prevLPC_Q12[2]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 4], (int)pLCStruct.prevLPC_Q12[3]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 5], (int)pLCStruct.prevLPC_Q12[4]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 6], (int)pLCStruct.prevLPC_Q12[5]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 7], (int)pLCStruct.prevLPC_Q12[6]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 8], (int)pLCStruct.prevLPC_Q12[7]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 9], (int)pLCStruct.prevLPC_Q12[8]);
            n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - 10], (int)pLCStruct.prevLPC_Q12[9]);
            for (n2 = 10; n2 < silkChannelDecoder.LPC_order; ++n2) {
                n16 = Inlines.silk_SMLAWB((int)n16, (int)nArray[n3 - n2 - 1], (int)pLCStruct.prevLPC_Q12[n2]);
            }
            nArray[n3] = Inlines.silk_ADD_LSHIFT32((int)nArray[n3], (int)n16, (int)4);
            sArray[n + n4] = (short)Inlines.silk_SAT16((int)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULWW((int)nArray[n3], (int)nArray2[1]), (int)8)));
        }
        System.arraycopy(nArray, n15 + silkChannelDecoder.frame_length, silkChannelDecoder.sLPC_Q14_buf, 0, 16);
        pLCStruct.rand_seed = n8;
        pLCStruct.randScale_Q14 = s;
        for (n4 = 0; n4 < 4; ++n4) {
            silkDecoderControl.pitchL[n4] = n9;
        }
    }

    static void silk_PLC_energy(BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, BoxedValueInt boxedValueInt3, BoxedValueInt boxedValueInt4, int[] nArray, int[] nArray2, int n, int n2) {
        int n3 = 0;
        short[] sArray = new short[2 * n];
        for (int i = 0; i < 2; ++i) {
            for (int j = 0; j < n; ++j) {
                sArray[n3 + j] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT((int)Inlines.silk_SMULWW((int)nArray[j + (i + n2 - 2) * n], (int)nArray2[i]), (int)8));
            }
            n3 += n;
        }
        SumSqrShift.silk_sum_sqr_shift(boxedValueInt, boxedValueInt2, sArray, n);
        SumSqrShift.silk_sum_sqr_shift(boxedValueInt3, boxedValueInt4, sArray, n, n);
    }

    static void silk_PLC_update(SilkChannelDecoder silkChannelDecoder, SilkDecoderControl silkDecoderControl) {
        PLCStruct pLCStruct = silkChannelDecoder.sPLC;
        silkChannelDecoder.prevSignalType = silkChannelDecoder.indices.signalType;
        int n = 0;
        if (silkChannelDecoder.indices.signalType == 2) {
            int n2;
            for (int i = 0; i * silkChannelDecoder.subfr_length < silkDecoderControl.pitchL[silkChannelDecoder.nb_subfr - 1] && i != silkChannelDecoder.nb_subfr; ++i) {
                int n3 = 0;
                for (n2 = 0; n2 < 5; ++n2) {
                    n3 += silkDecoderControl.LTPCoef_Q14[(silkChannelDecoder.nb_subfr - 1 - i) * 5 + n2];
                }
                if (n3 <= n) continue;
                n = n3;
                System.arraycopy(silkDecoderControl.LTPCoef_Q14, Inlines.silk_SMULBB((int)(silkChannelDecoder.nb_subfr - 1 - i), (int)5), pLCStruct.LTPCoef_Q14, 0, 5);
                pLCStruct.pitchL_Q8 = Inlines.silk_LSHIFT((int)silkDecoderControl.pitchL[silkChannelDecoder.nb_subfr - 1 - i], (int)8);
            }
            Arrays.MemSet((short[])pLCStruct.LTPCoef_Q14, (short)0, (int)5);
            pLCStruct.LTPCoef_Q14[2] = (short)n;
            if (n < 11469) {
                int n4 = Inlines.silk_LSHIFT((int)11469, (int)10);
                int n5 = Inlines.silk_DIV32((int)n4, (int)Inlines.silk_max((int)n, (int)1));
                for (n2 = 0; n2 < 5; ++n2) {
                    pLCStruct.LTPCoef_Q14[n2] = (short)Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)pLCStruct.LTPCoef_Q14[n2], (int)n5), (int)10);
                }
            } else if (n > 15565) {
                int n6 = Inlines.silk_LSHIFT((int)15565, (int)14);
                int n7 = Inlines.silk_DIV32((int)n6, (int)Inlines.silk_max((int)n, (int)1));
                for (n2 = 0; n2 < 5; ++n2) {
                    pLCStruct.LTPCoef_Q14[n2] = (short)Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)pLCStruct.LTPCoef_Q14[n2], (int)n7), (int)14);
                }
            }
        } else {
            pLCStruct.pitchL_Q8 = Inlines.silk_LSHIFT((int)Inlines.silk_SMULBB((int)silkChannelDecoder.fs_kHz, (int)18), (int)8);
            Arrays.MemSet((short[])pLCStruct.LTPCoef_Q14, (short)0, (int)5);
        }
        System.arraycopy(silkDecoderControl.PredCoef_Q12[1], 0, pLCStruct.prevLPC_Q12, 0, silkChannelDecoder.LPC_order);
        pLCStruct.prevLTP_scale_Q14 = (short)silkDecoderControl.LTP_scale_Q14;
        System.arraycopy(silkDecoderControl.Gains_Q16, silkChannelDecoder.nb_subfr - 2, pLCStruct.prevGain_Q16, 0, 2);
        pLCStruct.subfr_length = silkChannelDecoder.subfr_length;
        pLCStruct.nb_subfr = silkChannelDecoder.nb_subfr;
    }

    static void silk_PLC_Reset(SilkChannelDecoder silkChannelDecoder) {
        silkChannelDecoder.sPLC.pitchL_Q8 = Inlines.silk_LSHIFT((int)silkChannelDecoder.frame_length, (int)7);
        silkChannelDecoder.sPLC.prevGain_Q16[0] = 65536;
        silkChannelDecoder.sPLC.prevGain_Q16[1] = 65536;
        silkChannelDecoder.sPLC.subfr_length = 20;
        silkChannelDecoder.sPLC.nb_subfr = 2;
    }

    static void silk_PLC(SilkChannelDecoder silkChannelDecoder, SilkDecoderControl silkDecoderControl, short[] sArray, int n, int n2) {
        if (silkChannelDecoder.fs_kHz != silkChannelDecoder.sPLC.fs_kHz) {
            PLC.silk_PLC_Reset(silkChannelDecoder);
            silkChannelDecoder.sPLC.fs_kHz = silkChannelDecoder.fs_kHz;
        }
        if (n2 != 0) {
            PLC.silk_PLC_conceal(silkChannelDecoder, silkDecoderControl, sArray, n);
            ++silkChannelDecoder.lossCnt;
        } else {
            PLC.silk_PLC_update(silkChannelDecoder, silkDecoderControl);
        }
    }
}

