/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.CNG
 *  de.maxhenkel.voicechat.concentus.CNGState
 *  de.maxhenkel.voicechat.concentus.DecodeCore
 *  de.maxhenkel.voicechat.concentus.DecodeIndices
 *  de.maxhenkel.voicechat.concentus.DecodeParameters
 *  de.maxhenkel.voicechat.concentus.DecodePulses
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CNG;
import de.maxhenkel.voicechat.concentus.CNGState;
import de.maxhenkel.voicechat.concentus.DecodeCore;
import de.maxhenkel.voicechat.concentus.DecodeIndices;
import de.maxhenkel.voicechat.concentus.DecodeParameters;
import de.maxhenkel.voicechat.concentus.DecodePulses;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.NLSFCodebook;
import de.maxhenkel.voicechat.concentus.PLC;
import de.maxhenkel.voicechat.concentus.PLCStruct;
import de.maxhenkel.voicechat.concentus.Resampler;
import de.maxhenkel.voicechat.concentus.SideInfoIndices;
import de.maxhenkel.voicechat.concentus.SilkDecoderControl;
import de.maxhenkel.voicechat.concentus.SilkResamplerState;
import de.maxhenkel.voicechat.concentus.SilkTables;

class SilkChannelDecoder {
    int prev_gain_Q16 = 0;
    final int[] exc_Q14 = new int[320];
    final int[] sLPC_Q14_buf = new int[16];
    final short[] outBuf = new short[480];
    int lagPrev = 0;
    byte LastGainIndex = 0;
    int fs_kHz = 0;
    int fs_API_hz = 0;
    int nb_subfr = 0;
    int frame_length = 0;
    int subfr_length = 0;
    int ltp_mem_length = 0;
    int LPC_order = 0;
    final short[] prevNLSF_Q15 = new short[16];
    int first_frame_after_reset = 0;
    short[] pitch_lag_low_bits_iCDF;
    short[] pitch_contour_iCDF;
    int nFramesDecoded = 0;
    int nFramesPerPacket = 0;
    int ec_prevSignalType = 0;
    short ec_prevLagIndex = 0;
    final int[] VAD_flags = new int[3];
    int LBRR_flag = 0;
    final int[] LBRR_flags = new int[3];
    final SilkResamplerState resampler_state = new SilkResamplerState();
    NLSFCodebook psNLSF_CB = null;
    final SideInfoIndices indices = new SideInfoIndices();
    final CNGState sCNG = new CNGState();
    int lossCnt = 0;
    int prevSignalType = 0;
    final PLCStruct sPLC = new PLCStruct();

    SilkChannelDecoder() {
    }

    void Reset() {
        this.prev_gain_Q16 = 0;
        Arrays.MemSet((int[])this.exc_Q14, (int)0, (int)320);
        Arrays.MemSet((int[])this.sLPC_Q14_buf, (int)0, (int)16);
        Arrays.MemSet((short[])this.outBuf, (short)0, (int)480);
        this.lagPrev = 0;
        this.LastGainIndex = 0;
        this.fs_kHz = 0;
        this.fs_API_hz = 0;
        this.nb_subfr = 0;
        this.frame_length = 0;
        this.subfr_length = 0;
        this.ltp_mem_length = 0;
        this.LPC_order = 0;
        Arrays.MemSet((short[])this.prevNLSF_Q15, (short)0, (int)16);
        this.first_frame_after_reset = 0;
        this.pitch_lag_low_bits_iCDF = null;
        this.pitch_contour_iCDF = null;
        this.nFramesDecoded = 0;
        this.nFramesPerPacket = 0;
        this.ec_prevSignalType = 0;
        this.ec_prevLagIndex = 0;
        Arrays.MemSet((int[])this.VAD_flags, (int)0, (int)3);
        this.LBRR_flag = 0;
        Arrays.MemSet((int[])this.LBRR_flags, (int)0, (int)3);
        this.resampler_state.Reset();
        this.psNLSF_CB = null;
        this.indices.Reset();
        this.sCNG.Reset();
        this.lossCnt = 0;
        this.prevSignalType = 0;
        this.sPLC.Reset();
    }

    private void silk_PLC_Reset() {
        this.sPLC.pitchL_Q8 = Inlines.silk_LSHIFT((int)this.frame_length, (int)7);
        this.sPLC.prevGain_Q16[0] = 65536;
        this.sPLC.prevGain_Q16[1] = 65536;
        this.sPLC.subfr_length = 20;
        this.sPLC.nb_subfr = 2;
    }

    private void silk_CNG_Reset() {
        int n = Inlines.silk_DIV32_16((int)Short.MAX_VALUE, (int)(this.LPC_order + 1));
        int n2 = 0;
        for (int i = 0; i < this.LPC_order; ++i) {
            this.sCNG.CNG_smth_NLSF_Q15[i] = (short)(n2 += n);
        }
        this.sCNG.CNG_smth_Gain_Q16 = 0;
        this.sCNG.rand_seed = 3176576;
    }

    /*
     * Unable to fully structure code
     */
    int silk_decoder_set_fs(int var1_1, int var2_2) {
        block16: {
            block15: {
                var4_3 = 0;
                Inlines.OpusAssert((boolean)(var1_1 == 8 || var1_1 == 12 || var1_1 == 16));
                Inlines.OpusAssert((boolean)(this.nb_subfr == 4 || this.nb_subfr == 2));
                this.subfr_length = Inlines.silk_SMULBB((int)5, (int)var1_1);
                var3_4 = Inlines.silk_SMULBB((int)this.nb_subfr, (int)this.subfr_length);
                if (this.fs_kHz != var1_1) break block15;
                if (this.fs_API_hz == var2_2) break block16;
            }
            var4_3 += Resampler.silk_resampler_init(this.resampler_state, Inlines.silk_SMULBB((int)var1_1, (int)1000), var2_2, 0);
            this.fs_API_hz = var2_2;
        }
        if (this.fs_kHz != var1_1 || var3_4 != this.frame_length) {
            this.pitch_contour_iCDF = var1_1 == 8 ? (this.nb_subfr == 4 ? SilkTables.silk_pitch_contour_NB_iCDF : SilkTables.silk_pitch_contour_10_ms_NB_iCDF) : (this.nb_subfr == 4 ? SilkTables.silk_pitch_contour_iCDF : SilkTables.silk_pitch_contour_10_ms_iCDF);
            if (this.fs_kHz != var1_1) {
                this.ltp_mem_length = Inlines.silk_SMULBB((int)20, (int)var1_1);
                if (var1_1 == 8 || var1_1 == 12) {
                    this.LPC_order = 10;
                    this.psNLSF_CB = SilkTables.silk_NLSF_CB_NB_MB;
                } else {
                    this.LPC_order = 16;
                    this.psNLSF_CB = SilkTables.silk_NLSF_CB_WB;
                }
                if (var1_1 == 16) {
                    this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform8_iCDF;
                } else if (var1_1 == 12) {
                    this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform6_iCDF;
                } else if (var1_1 == 8) {
                    this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform4_iCDF;
                } else {
                    Inlines.OpusAssert((boolean)false);
                }
                this.first_frame_after_reset = 1;
                this.lagPrev = 100;
                this.LastGainIndex = (byte)10;
                this.prevSignalType = 0;
                Arrays.MemSet((short[])this.outBuf, (short)0, (int)480);
                Arrays.MemSet((int[])this.sLPC_Q14_buf, (int)0, (int)16);
            }
            this.fs_kHz = var1_1;
            this.frame_length = var3_4;
        }
        if (this.frame_length <= 0) ** GOTO lbl-1000
        if (this.frame_length <= 320) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        Inlines.OpusAssert((boolean)v0);
        return var4_3;
    }

    /*
     * Unable to fully structure code
     */
    int silk_decode_frame(EntropyCoder var1_1, short[] var2_2, int var3_3, BoxedValueInt var4_4, int var5_5, int var6_6) {
        var7_7 = new SilkDecoderControl();
        var10_8 = 0;
        var8_9 = this.frame_length;
        var7_7.LTP_scale_Q14 = 0;
        if (var8_9 <= 0) ** GOTO lbl-1000
        if (var8_9 <= 320) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        Inlines.OpusAssert((boolean)v0);
        if (var5_5 == 0 || var5_5 == 2 && this.LBRR_flags[this.nFramesDecoded] == 1) {
            var11_10 = new short[var8_9 + 16 - 1 & -16];
            DecodeIndices.silk_decode_indices((SilkChannelDecoder)this, (EntropyCoder)var1_1, (int)this.nFramesDecoded, (int)var5_5, (int)var6_6);
            DecodePulses.silk_decode_pulses((EntropyCoder)var1_1, (short[])var11_10, (int)this.indices.signalType, (int)this.indices.quantOffsetType, (int)this.frame_length);
            DecodeParameters.silk_decode_parameters((SilkChannelDecoder)this, (SilkDecoderControl)var7_7, (int)var6_6);
            DecodeCore.silk_decode_core((SilkChannelDecoder)this, (SilkDecoderControl)var7_7, (short[])var2_2, (int)var3_3, (short[])var11_10);
            PLC.silk_PLC(this, var7_7, var2_2, var3_3, 0);
            this.lossCnt = 0;
            this.prevSignalType = this.indices.signalType;
            Inlines.OpusAssert((boolean)(this.prevSignalType >= 0 && this.prevSignalType <= 2));
            this.first_frame_after_reset = 0;
        } else {
            PLC.silk_PLC(this, var7_7, var2_2, var3_3, 1);
        }
        Inlines.OpusAssert((boolean)(this.ltp_mem_length >= this.frame_length));
        var9_11 = this.ltp_mem_length - this.frame_length;
        Arrays.MemMove((short[])this.outBuf, (int)this.frame_length, (int)0, (int)var9_11);
        System.arraycopy(var2_2, var3_3, this.outBuf, var9_11, this.frame_length);
        CNG.silk_CNG((SilkChannelDecoder)this, (SilkDecoderControl)var7_7, (short[])var2_2, (int)var3_3, (int)var8_9);
        PLC.silk_PLC_glue_frames(this, var2_2, var3_3, var8_9);
        this.lagPrev = var7_7.pitchL[this.nb_subfr - 1];
        var4_4.Val = var8_9;
        return var10_8;
    }

    int silk_init_decoder() {
        this.Reset();
        this.first_frame_after_reset = 1;
        this.prev_gain_Q16 = 65536;
        this.silk_CNG_Reset();
        this.silk_PLC_Reset();
        return 0;
    }
}

