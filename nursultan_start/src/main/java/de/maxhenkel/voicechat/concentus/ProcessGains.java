/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.GainQuantization
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.GainQuantization;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Sigmoid;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkEncoderControl;
import de.maxhenkel.voicechat.concentus.SilkShapeState;
import de.maxhenkel.voicechat.concentus.SilkTables;

class ProcessGains {
    ProcessGains() {
    }

    static void silk_process_gains(SilkChannelEncoder silkChannelEncoder, SilkEncoderControl silkEncoderControl, int n) {
        int n2;
        SilkShapeState silkShapeState = silkChannelEncoder.sShape;
        if (silkChannelEncoder.indices.signalType == 2) {
            int n3 = 0 - Sigmoid.silk_sigm_Q15(Inlines.silk_RSHIFT_ROUND((int)(silkEncoderControl.LTPredCodGain_Q7 - 1536), (int)4));
            for (n2 = 0; n2 < silkChannelEncoder.nb_subfr; ++n2) {
                silkEncoderControl.Gains_Q16[n2] = Inlines.silk_SMLAWB((int)silkEncoderControl.Gains_Q16[n2], (int)silkEncoderControl.Gains_Q16[n2], (int)n3);
            }
        }
        int n4 = Inlines.silk_DIV32_16((int)Inlines.silk_log2lin((int)Inlines.silk_SMULWB((int)(8894 - silkChannelEncoder.SNR_dB_Q7), (int)21627)), (int)silkChannelEncoder.subfr_length);
        for (n2 = 0; n2 < silkChannelEncoder.nb_subfr; ++n2) {
            int n5 = silkEncoderControl.ResNrg[n2];
            int n6 = Inlines.silk_SMULWW((int)n5, (int)n4);
            n6 = silkEncoderControl.ResNrgQ[n2] > 0 ? Inlines.silk_RSHIFT_ROUND((int)n6, (int)silkEncoderControl.ResNrgQ[n2]) : (n6 >= Inlines.silk_RSHIFT((int)Integer.MAX_VALUE, (int)(-silkEncoderControl.ResNrgQ[n2])) ? Integer.MAX_VALUE : Inlines.silk_LSHIFT((int)n6, (int)(-silkEncoderControl.ResNrgQ[n2])));
            int n7 = silkEncoderControl.Gains_Q16[n2];
            int n8 = Inlines.silk_ADD_SAT32((int)n6, (int)Inlines.silk_SMMUL((int)n7, (int)n7));
            if (n8 < Short.MAX_VALUE) {
                n8 = Inlines.silk_SMLAWW((int)Inlines.silk_LSHIFT((int)n6, (int)16), (int)n7, (int)n7);
                Inlines.OpusAssert((n8 > 0 ? 1 : 0) != 0);
                n7 = Inlines.silk_SQRT_APPROX((int)n8);
                n7 = Inlines.silk_min((int)n7, (int)0x7FFFFF);
                silkEncoderControl.Gains_Q16[n2] = Inlines.silk_LSHIFT_SAT32((int)n7, (int)8);
                continue;
            }
            n7 = Inlines.silk_SQRT_APPROX((int)n8);
            n7 = Inlines.silk_min((int)n7, (int)Short.MAX_VALUE);
            silkEncoderControl.Gains_Q16[n2] = Inlines.silk_LSHIFT_SAT32((int)n7, (int)16);
        }
        System.arraycopy(silkEncoderControl.Gains_Q16, 0, silkEncoderControl.GainsUnq_Q16, 0, silkChannelEncoder.nb_subfr);
        silkEncoderControl.lastGainIndexPrev = silkShapeState.LastGainIndex;
        BoxedValueByte boxedValueByte = new BoxedValueByte(silkShapeState.LastGainIndex);
        GainQuantization.silk_gains_quant((byte[])silkChannelEncoder.indices.GainsIndices, (int[])silkEncoderControl.Gains_Q16, (BoxedValueByte)boxedValueByte, (int)(n == 2 ? 1 : 0), (int)silkChannelEncoder.nb_subfr);
        silkShapeState.LastGainIndex = boxedValueByte.Val;
        if (silkChannelEncoder.indices.signalType == 2) {
            silkChannelEncoder.indices.quantOffsetType = silkEncoderControl.LTPredCodGain_Q7 + Inlines.silk_RSHIFT((int)silkChannelEncoder.input_tilt_Q15, (int)8) > 128 ? (byte)0 : 1;
        }
        short s = SilkTables.silk_Quantization_Offsets_Q10[silkChannelEncoder.indices.signalType >> 1][silkChannelEncoder.indices.quantOffsetType];
        silkEncoderControl.Lambda_Q10 = 1229 + Inlines.silk_SMULBB((int)-50, (int)silkChannelEncoder.nStatesDelayedDecision) + Inlines.silk_SMULWB((int)-52428, (int)silkChannelEncoder.speech_activity_Q8) + Inlines.silk_SMULWB((int)-409, (int)silkEncoderControl.input_quality_Q14) + Inlines.silk_SMULWB((int)-818, (int)silkEncoderControl.coding_quality_Q14) + Inlines.silk_SMULWB((int)52429, (int)s);
        Inlines.OpusAssert((silkEncoderControl.Lambda_Q10 > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((silkEncoderControl.Lambda_Q10 < 2048 ? 1 : 0) != 0);
    }
}

