/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.PitchAnalysisCore
 *  de.maxhenkel.voicechat.concentus.Schur
 *  de.maxhenkel.voicechat.concentus.SilkChannelEncoder
 *  de.maxhenkel.voicechat.concentus.SilkEncoderControl
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.ApplySineWindow;
import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Autocorrelation;
import de.maxhenkel.voicechat.concentus.BWExpander;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.BoxedValueShort;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.K2A;
import de.maxhenkel.voicechat.concentus.PitchAnalysisCore;
import de.maxhenkel.voicechat.concentus.Schur;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkEncoderControl;

class FindPitchLags {
    FindPitchLags() {
    }

    static void silk_find_pitch_lags(SilkChannelEncoder silkChannelEncoder, SilkEncoderControl silkEncoderControl, short[] sArray, short[] sArray2, int n) {
        int[] nArray = new int[17];
        short[] sArray3 = new short[16];
        int[] nArray2 = new int[16];
        short[] sArray4 = new short[16];
        int n2 = silkChannelEncoder.la_pitch + silkChannelEncoder.frame_length + silkChannelEncoder.ltp_mem_length;
        Inlines.OpusAssert(n2 >= silkChannelEncoder.pitch_LPC_win_length);
        int n3 = n - silkChannelEncoder.ltp_mem_length;
        short[] sArray5 = new short[silkChannelEncoder.pitch_LPC_win_length];
        int n4 = n3 + n2 - silkChannelEncoder.pitch_LPC_win_length;
        int n5 = 0;
        ApplySineWindow.silk_apply_sine_window(sArray5, n5, sArray2, n4, 1, silkChannelEncoder.la_pitch);
        System.arraycopy(sArray2, n4 += silkChannelEncoder.la_pitch, sArray5, n5 += silkChannelEncoder.la_pitch, silkChannelEncoder.pitch_LPC_win_length - Inlines.silk_LSHIFT(silkChannelEncoder.la_pitch, 1));
        ApplySineWindow.silk_apply_sine_window(sArray5, n5 += silkChannelEncoder.pitch_LPC_win_length - Inlines.silk_LSHIFT(silkChannelEncoder.la_pitch, 1), sArray2, n4 += silkChannelEncoder.pitch_LPC_win_length - Inlines.silk_LSHIFT(silkChannelEncoder.la_pitch, 1), 2, silkChannelEncoder.la_pitch);
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        Autocorrelation.silk_autocorr(nArray, boxedValueInt, sArray5, silkChannelEncoder.pitch_LPC_win_length, silkChannelEncoder.pitchEstimationLPCOrder + 1);
        int n6 = boxedValueInt.Val;
        nArray[0] = Inlines.silk_SMLAWB(nArray[0], nArray[0], 66) + 1;
        int n7 = Schur.silk_schur((short[])sArray3, (int[])nArray, (int)silkChannelEncoder.pitchEstimationLPCOrder);
        silkEncoderControl.predGain_Q16 = Inlines.silk_DIV32_varQ(nArray[0], Inlines.silk_max_int(n7, 1), 16);
        K2A.silk_k2a(nArray2, sArray3, silkChannelEncoder.pitchEstimationLPCOrder);
        for (int i = 0; i < silkChannelEncoder.pitchEstimationLPCOrder; ++i) {
            sArray4[i] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT(nArray2[i], 12));
        }
        BWExpander.silk_bwexpander(sArray4, silkChannelEncoder.pitchEstimationLPCOrder, 64881);
        Filters.silk_LPC_analysis_filter(sArray, 0, sArray2, n3, sArray4, 0, n2, silkChannelEncoder.pitchEstimationLPCOrder);
        if (silkChannelEncoder.indices.signalType != 0 && silkChannelEncoder.first_frame_after_reset == 0) {
            int n8 = 4915;
            n8 = Inlines.silk_SMLABB(n8, -32, silkChannelEncoder.pitchEstimationLPCOrder);
            n8 = Inlines.silk_SMLAWB(n8, -209714, silkChannelEncoder.speech_activity_Q8);
            n8 = Inlines.silk_SMLABB(n8, -1228, Inlines.silk_RSHIFT(silkChannelEncoder.prevSignalType, 1));
            n8 = Inlines.silk_SMLAWB(n8, -1637, silkChannelEncoder.input_tilt_Q15);
            BoxedValueShort boxedValueShort = new BoxedValueShort(silkChannelEncoder.indices.lagIndex);
            BoxedValueByte boxedValueByte = new BoxedValueByte(silkChannelEncoder.indices.contourIndex);
            BoxedValueInt boxedValueInt2 = new BoxedValueInt(silkChannelEncoder.LTPCorr_Q15);
            silkChannelEncoder.indices.signalType = PitchAnalysisCore.silk_pitch_analysis_core((short[])sArray, (int[])silkEncoderControl.pitchL, (BoxedValueShort)boxedValueShort, (BoxedValueByte)boxedValueByte, (BoxedValueInt)boxedValueInt2, (int)silkChannelEncoder.prevLag, (int)silkChannelEncoder.pitchEstimationThreshold_Q16, (int)(n8 = Inlines.silk_SAT16(n8)), (int)silkChannelEncoder.fs_kHz, (int)silkChannelEncoder.pitchEstimationComplexity, (int)silkChannelEncoder.nb_subfr) == 0 ? (byte)2 : (byte)1;
            silkChannelEncoder.indices.lagIndex = boxedValueShort.Val;
            silkChannelEncoder.indices.contourIndex = boxedValueByte.Val;
            silkChannelEncoder.LTPCorr_Q15 = boxedValueInt2.Val;
        } else {
            Arrays.MemSet(silkEncoderControl.pitchL, 0, 4);
            silkChannelEncoder.indices.lagIndex = 0;
            silkChannelEncoder.indices.contourIndex = 0;
            silkChannelEncoder.LTPCorr_Q15 = 0;
        }
    }
}

