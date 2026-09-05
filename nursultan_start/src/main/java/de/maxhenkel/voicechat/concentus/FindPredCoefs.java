/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.LTPAnalysisFilter
 *  de.maxhenkel.voicechat.concentus.LTPScaleControl
 *  de.maxhenkel.voicechat.concentus.NLSF
 *  de.maxhenkel.voicechat.concentus.QuantizeLTPGains
 *  de.maxhenkel.voicechat.concentus.ResidualEnergy
 *  de.maxhenkel.voicechat.concentus.SilkChannelEncoder
 *  de.maxhenkel.voicechat.concentus.SilkEncoderControl
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.FindLPC;
import de.maxhenkel.voicechat.concentus.FindLTP;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.LTPAnalysisFilter;
import de.maxhenkel.voicechat.concentus.LTPScaleControl;
import de.maxhenkel.voicechat.concentus.NLSF;
import de.maxhenkel.voicechat.concentus.QuantizeLTPGains;
import de.maxhenkel.voicechat.concentus.ResidualEnergy;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkEncoderControl;

class FindPredCoefs {
    FindPredCoefs() {
    }

    static void silk_find_pred_coefs(SilkChannelEncoder silkChannelEncoder, SilkEncoderControl silkEncoderControl, short[] sArray, short[] sArray2, int n, int n2) {
        int n3;
        int n4;
        int[] nArray = new int[4];
        int[] nArray2 = new int[4];
        int[] nArray3 = new int[4];
        short[] sArray3 = new short[16];
        int[] nArray4 = new int[4];
        int n5 = 0x1FFFFFF;
        for (n4 = 0; n4 < silkChannelEncoder.nb_subfr; ++n4) {
            n5 = Inlines.silk_min(n5, silkEncoderControl.Gains_Q16[n4]);
        }
        for (n4 = 0; n4 < silkChannelEncoder.nb_subfr; ++n4) {
            Inlines.OpusAssert(silkEncoderControl.Gains_Q16[n4] > 0);
            nArray[n4] = Inlines.silk_DIV32_varQ(n5, silkEncoderControl.Gains_Q16[n4], 14);
            nArray[n4] = Inlines.silk_max(nArray[n4], 363);
            Inlines.OpusAssert(nArray[n4] == Inlines.silk_SAT16(nArray[n4]));
            int n6 = Inlines.silk_SMULWB(nArray[n4], nArray[n4]);
            nArray3[n4] = Inlines.silk_RSHIFT(n6, 1);
            nArray2[n4] = Inlines.silk_DIV32(65536, nArray[n4]);
        }
        short[] sArray4 = new short[silkChannelEncoder.nb_subfr * silkChannelEncoder.predictLPCOrder + silkChannelEncoder.frame_length];
        if (silkChannelEncoder.indices.signalType == 2) {
            Inlines.OpusAssert(silkChannelEncoder.ltp_mem_length - silkChannelEncoder.predictLPCOrder >= silkEncoderControl.pitchL[0] + 2);
            int[] nArray5 = new int[silkChannelEncoder.nb_subfr * 5 * 5];
            BoxedValueInt boxedValueInt = new BoxedValueInt(silkEncoderControl.LTPredCodGain_Q7);
            FindLTP.silk_find_LTP(silkEncoderControl.LTPCoef_Q14, nArray5, boxedValueInt, sArray, silkEncoderControl.pitchL, nArray3, silkChannelEncoder.subfr_length, silkChannelEncoder.nb_subfr, silkChannelEncoder.ltp_mem_length, nArray4);
            silkEncoderControl.LTPredCodGain_Q7 = boxedValueInt.Val;
            BoxedValueByte boxedValueByte = new BoxedValueByte(silkChannelEncoder.indices.PERIndex);
            BoxedValueInt boxedValueInt2 = new BoxedValueInt(silkChannelEncoder.sum_log_gain_Q7);
            QuantizeLTPGains.silk_quant_LTP_gains((short[])silkEncoderControl.LTPCoef_Q14, (byte[])silkChannelEncoder.indices.LTPIndex, (BoxedValueByte)boxedValueByte, (BoxedValueInt)boxedValueInt2, (int[])nArray5, (int)silkChannelEncoder.mu_LTP_Q9, (int)silkChannelEncoder.LTPQuantLowComplexity, (int)silkChannelEncoder.nb_subfr);
            silkChannelEncoder.indices.PERIndex = boxedValueByte.Val;
            silkChannelEncoder.sum_log_gain_Q7 = boxedValueInt2.Val;
            LTPScaleControl.silk_LTP_scale_ctrl((SilkChannelEncoder)silkChannelEncoder, (SilkEncoderControl)silkEncoderControl, (int)n2);
            LTPAnalysisFilter.silk_LTP_analysis_filter((short[])sArray4, (short[])sArray2, (int)(n - silkChannelEncoder.predictLPCOrder), (short[])silkEncoderControl.LTPCoef_Q14, (int[])silkEncoderControl.pitchL, (int[])nArray, (int)silkChannelEncoder.subfr_length, (int)silkChannelEncoder.nb_subfr, (int)silkChannelEncoder.predictLPCOrder);
        } else {
            int n7 = n - silkChannelEncoder.predictLPCOrder;
            int n8 = 0;
            for (n4 = 0; n4 < silkChannelEncoder.nb_subfr; ++n4) {
                Inlines.silk_scale_copy_vector16(sArray4, n8, sArray2, n7, nArray[n4], silkChannelEncoder.subfr_length + silkChannelEncoder.predictLPCOrder);
                n8 += silkChannelEncoder.subfr_length + silkChannelEncoder.predictLPCOrder;
                n7 += silkChannelEncoder.subfr_length;
            }
            Arrays.MemSet(silkEncoderControl.LTPCoef_Q14, (short)0, silkChannelEncoder.nb_subfr * 5);
            silkEncoderControl.LTPredCodGain_Q7 = 0;
            silkChannelEncoder.sum_log_gain_Q7 = 0;
        }
        if (silkChannelEncoder.first_frame_after_reset != 0) {
            n3 = 10737418;
        } else {
            n3 = Inlines.silk_log2lin(Inlines.silk_SMLAWB(2048, silkEncoderControl.LTPredCodGain_Q7, 21845));
            n3 = Inlines.silk_DIV32_varQ(n3, Inlines.silk_SMULWW(10000, Inlines.silk_SMLAWB(65536, 196608, silkEncoderControl.coding_quality_Q14)), 14);
        }
        FindLPC.silk_find_LPC(silkChannelEncoder, sArray3, sArray4, n3);
        NLSF.silk_process_NLSFs((SilkChannelEncoder)silkChannelEncoder, (short[][])silkEncoderControl.PredCoef_Q12, (short[])sArray3, (short[])silkChannelEncoder.prev_NLSFq_Q15);
        ResidualEnergy.silk_residual_energy((int[])silkEncoderControl.ResNrg, (int[])silkEncoderControl.ResNrgQ, (short[])sArray4, (short[][])silkEncoderControl.PredCoef_Q12, (int[])nArray2, (int)silkChannelEncoder.subfr_length, (int)silkChannelEncoder.nb_subfr, (int)silkChannelEncoder.predictLPCOrder);
        System.arraycopy(sArray3, 0, silkChannelEncoder.prev_NLSFq_Q15, 0, 16);
    }
}

