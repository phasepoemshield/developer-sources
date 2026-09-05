/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.NLSF
 *  de.maxhenkel.voicechat.concentus.NLSFCodebook
 *  de.maxhenkel.voicechat.concentus.SilkChannelDecoder
 *  de.maxhenkel.voicechat.concentus.SilkDecoderControl
 *  de.maxhenkel.voicechat.concentus.SilkTables
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BWExpander;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.DecodePitch;
import de.maxhenkel.voicechat.concentus.GainQuantization;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.NLSF;
import de.maxhenkel.voicechat.concentus.NLSFCodebook;
import de.maxhenkel.voicechat.concentus.SilkChannelDecoder;
import de.maxhenkel.voicechat.concentus.SilkDecoderControl;
import de.maxhenkel.voicechat.concentus.SilkTables;

class DecodeParameters {
    DecodeParameters() {
    }

    static void silk_decode_parameters(SilkChannelDecoder silkChannelDecoder, SilkDecoderControl silkDecoderControl, int n) {
        int n2;
        short[] sArray = new short[silkChannelDecoder.LPC_order];
        short[] sArray2 = new short[silkChannelDecoder.LPC_order];
        BoxedValueByte boxedValueByte = new BoxedValueByte(silkChannelDecoder.LastGainIndex);
        GainQuantization.silk_gains_dequant(silkDecoderControl.Gains_Q16, silkChannelDecoder.indices.GainsIndices, boxedValueByte, n == 2 ? 1 : 0, silkChannelDecoder.nb_subfr);
        silkChannelDecoder.LastGainIndex = boxedValueByte.Val;
        NLSF.silk_NLSF_decode((short[])sArray, (byte[])silkChannelDecoder.indices.NLSFIndices, (NLSFCodebook)silkChannelDecoder.psNLSF_CB);
        NLSF.silk_NLSF2A((short[])silkDecoderControl.PredCoef_Q12[1], (short[])sArray, (int)silkChannelDecoder.LPC_order);
        if (silkChannelDecoder.first_frame_after_reset == 1) {
            silkChannelDecoder.indices.NLSFInterpCoef_Q2 = (byte)4;
        }
        if (silkChannelDecoder.indices.NLSFInterpCoef_Q2 < 4) {
            for (n2 = 0; n2 < silkChannelDecoder.LPC_order; ++n2) {
                sArray2[n2] = (short)(silkChannelDecoder.prevNLSF_Q15[n2] + Inlines.silk_RSHIFT(Inlines.silk_MUL(silkChannelDecoder.indices.NLSFInterpCoef_Q2, sArray[n2] - silkChannelDecoder.prevNLSF_Q15[n2]), 2));
            }
            NLSF.silk_NLSF2A((short[])silkDecoderControl.PredCoef_Q12[0], (short[])sArray2, (int)silkChannelDecoder.LPC_order);
        } else {
            System.arraycopy(silkDecoderControl.PredCoef_Q12[1], 0, silkDecoderControl.PredCoef_Q12[0], 0, silkChannelDecoder.LPC_order);
        }
        System.arraycopy(sArray, 0, silkChannelDecoder.prevNLSF_Q15, 0, silkChannelDecoder.LPC_order);
        if (silkChannelDecoder.lossCnt != 0) {
            BWExpander.silk_bwexpander(silkDecoderControl.PredCoef_Q12[0], silkChannelDecoder.LPC_order, 63570);
            BWExpander.silk_bwexpander(silkDecoderControl.PredCoef_Q12[1], silkChannelDecoder.LPC_order, 63570);
        }
        if (silkChannelDecoder.indices.signalType == 2) {
            byte by;
            DecodePitch.silk_decode_pitch(silkChannelDecoder.indices.lagIndex, silkChannelDecoder.indices.contourIndex, silkDecoderControl.pitchL, silkChannelDecoder.fs_kHz, silkChannelDecoder.nb_subfr);
            byte[][] byArray = SilkTables.silk_LTP_vq_ptrs_Q7[silkChannelDecoder.indices.PERIndex];
            for (int i = 0; i < silkChannelDecoder.nb_subfr; ++i) {
                by = silkChannelDecoder.indices.LTPIndex[i];
                for (n2 = 0; n2 < 5; ++n2) {
                    silkDecoderControl.LTPCoef_Q14[i * 5 + n2] = (short)Inlines.silk_LSHIFT(byArray[by][n2], 7);
                }
            }
            by = silkChannelDecoder.indices.LTP_scaleIndex;
            silkDecoderControl.LTP_scale_Q14 = SilkTables.silk_LTPScales_table_Q14[by];
        } else {
            Arrays.MemSet(silkDecoderControl.pitchL, 0, silkChannelDecoder.nb_subfr);
            Arrays.MemSet(silkDecoderControl.LTPCoef_Q14, (short)0, 5 * silkChannelDecoder.nb_subfr);
            silkChannelDecoder.indices.PERIndex = 0;
            silkDecoderControl.LTP_scale_Q14 = 0;
        }
    }
}

