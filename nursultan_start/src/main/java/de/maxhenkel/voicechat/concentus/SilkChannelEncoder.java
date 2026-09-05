/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.EncControlState
 *  de.maxhenkel.voicechat.concentus.EncodeIndices
 *  de.maxhenkel.voicechat.concentus.EncodePulses
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Filters
 *  de.maxhenkel.voicechat.concentus.FindPitchLags
 *  de.maxhenkel.voicechat.concentus.FindPredCoefs
 *  de.maxhenkel.voicechat.concentus.GainQuantization
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.EncControlState;
import de.maxhenkel.voicechat.concentus.EncodeIndices;
import de.maxhenkel.voicechat.concentus.EncodePulses;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.FindPitchLags;
import de.maxhenkel.voicechat.concentus.FindPredCoefs;
import de.maxhenkel.voicechat.concentus.GainQuantization;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.NLSFCodebook;
import de.maxhenkel.voicechat.concentus.NoiseShapeAnalysis;
import de.maxhenkel.voicechat.concentus.ProcessGains;
import de.maxhenkel.voicechat.concentus.Resampler;
import de.maxhenkel.voicechat.concentus.SideInfoIndices;
import de.maxhenkel.voicechat.concentus.SilkEncoderControl;
import de.maxhenkel.voicechat.concentus.SilkError;
import de.maxhenkel.voicechat.concentus.SilkLPState;
import de.maxhenkel.voicechat.concentus.SilkNSQState;
import de.maxhenkel.voicechat.concentus.SilkPrefilterState;
import de.maxhenkel.voicechat.concentus.SilkResamplerState;
import de.maxhenkel.voicechat.concentus.SilkShapeState;
import de.maxhenkel.voicechat.concentus.SilkTables;
import de.maxhenkel.voicechat.concentus.SilkVADState;
import de.maxhenkel.voicechat.concentus.VoiceActivityDetection;

class SilkChannelEncoder {
    final int[] In_HP_State = new int[2];
    int variable_HP_smth1_Q15 = 0;
    int variable_HP_smth2_Q15 = 0;
    final SilkLPState sLP = new SilkLPState();
    final SilkVADState sVAD = new SilkVADState();
    final SilkNSQState sNSQ = new SilkNSQState();
    final short[] prev_NLSFq_Q15 = new short[16];
    int speech_activity_Q8 = 0;
    int allow_bandwidth_switch = 0;
    byte LBRRprevLastGainIndex = 0;
    byte prevSignalType = 0;
    int prevLag = 0;
    int pitch_LPC_win_length = 0;
    int max_pitch_lag = 0;
    int API_fs_Hz = 0;
    int prev_API_fs_Hz = 0;
    int maxInternal_fs_Hz = 0;
    int minInternal_fs_Hz = 0;
    int desiredInternal_fs_Hz = 0;
    int fs_kHz = 0;
    int nb_subfr = 0;
    int frame_length = 0;
    int subfr_length = 0;
    int ltp_mem_length = 0;
    int la_pitch = 0;
    int la_shape = 0;
    int shapeWinLength = 0;
    int TargetRate_bps = 0;
    int PacketSize_ms = 0;
    int PacketLoss_perc = 0;
    int frameCounter = 0;
    int Complexity = 0;
    int nStatesDelayedDecision = 0;
    int useInterpolatedNLSFs = 0;
    int shapingLPCOrder = 0;
    int predictLPCOrder = 0;
    int pitchEstimationComplexity = 0;
    int pitchEstimationLPCOrder = 0;
    int pitchEstimationThreshold_Q16 = 0;
    int LTPQuantLowComplexity = 0;
    int mu_LTP_Q9 = 0;
    int sum_log_gain_Q7 = 0;
    int NLSF_MSVQ_Survivors = 0;
    int first_frame_after_reset = 0;
    int controlled_since_last_payload = 0;
    int warping_Q16 = 0;
    int useCBR = 0;
    int prefillFlag = 0;
    short[] pitch_lag_low_bits_iCDF = null;
    short[] pitch_contour_iCDF = null;
    NLSFCodebook psNLSF_CB = null;
    final int[] input_quality_bands_Q15 = new int[4];
    int input_tilt_Q15 = 0;
    int SNR_dB_Q7 = 0;
    final byte[] VAD_flags = new byte[3];
    byte LBRR_flag = 0;
    final int[] LBRR_flags = new int[3];
    final SideInfoIndices indices = new SideInfoIndices();
    final byte[] pulses = new byte[320];
    final short[] inputBuf = new short[322];
    int inputBufIx = 0;
    int nFramesPerPacket = 0;
    int nFramesEncoded = 0;
    int nChannelsAPI = 0;
    int nChannelsInternal = 0;
    int channelNb = 0;
    int frames_since_onset = 0;
    int ec_prevSignalType = 0;
    short ec_prevLagIndex = 0;
    final SilkResamplerState resampler_state = new SilkResamplerState();
    int useDTX = 0;
    int inDTX = 0;
    int noSpeechCounter = 0;
    int useInBandFEC = 0;
    int LBRR_enabled = 0;
    int LBRR_GainIncreases = 0;
    final SideInfoIndices[] indices_LBRR = new SideInfoIndices[3];
    final byte[][] pulses_LBRR = Arrays.InitTwoDimensionalArrayByte((int)3, (int)320);
    final SilkShapeState sShape = new SilkShapeState();
    final SilkPrefilterState sPrefilt = new SilkPrefilterState();
    final short[] x_buf = new short[720];
    int LTPCorr_Q15 = 0;

    SilkChannelEncoder() {
        for (int i = 0; i < 3; ++i) {
            this.indices_LBRR[i] = new SideInfoIndices();
        }
    }

    private int silk_setup_resamplers(int n) {
        int n2 = 0;
        if (this.fs_kHz != n || this.prev_API_fs_Hz != this.API_fs_Hz) {
            if (this.fs_kHz == 0) {
                n2 += Resampler.silk_resampler_init(this.resampler_state, this.API_fs_Hz, n * 1000, 1);
            } else {
                SilkResamplerState silkResamplerState = null;
                int n3 = Inlines.silk_LSHIFT((int)(this.nb_subfr * 5), (int)1) + 5;
                int n4 = n3 * this.fs_kHz;
                silkResamplerState = new SilkResamplerState();
                n2 += Resampler.silk_resampler_init(silkResamplerState, Inlines.silk_SMULBB((int)this.fs_kHz, (int)1000), this.API_fs_Hz, 0);
                int n5 = n3 * Inlines.silk_DIV32_16((int)this.API_fs_Hz, (int)1000);
                short[] sArray = new short[n5];
                n2 += Resampler.silk_resampler(silkResamplerState, sArray, 0, this.x_buf, 0, n4);
                n2 += Resampler.silk_resampler_init(this.resampler_state, this.API_fs_Hz, Inlines.silk_SMULBB((int)n, (int)1000), 1);
                n2 += Resampler.silk_resampler(this.resampler_state, this.x_buf, 0, sArray, 0, n5);
            }
        }
        this.prev_API_fs_Hz = this.API_fs_Hz;
        return n2;
    }

    private int silk_setup_complexity(int n) {
        int n2 = 0;
        Inlines.OpusAssert((n >= 0 && n <= 10 ? 1 : 0) != 0);
        if (n < 2) {
            this.pitchEstimationComplexity = 0;
            this.pitchEstimationThreshold_Q16 = 52429;
            this.pitchEstimationLPCOrder = 6;
            this.shapingLPCOrder = 8;
            this.la_shape = 3 * this.fs_kHz;
            this.nStatesDelayedDecision = 1;
            this.useInterpolatedNLSFs = 0;
            this.LTPQuantLowComplexity = 1;
            this.NLSF_MSVQ_Survivors = 2;
            this.warping_Q16 = 0;
        } else if (n < 4) {
            this.pitchEstimationComplexity = 1;
            this.pitchEstimationThreshold_Q16 = 49807;
            this.pitchEstimationLPCOrder = 8;
            this.shapingLPCOrder = 10;
            this.la_shape = 5 * this.fs_kHz;
            this.nStatesDelayedDecision = 1;
            this.useInterpolatedNLSFs = 0;
            this.LTPQuantLowComplexity = 0;
            this.NLSF_MSVQ_Survivors = 4;
            this.warping_Q16 = 0;
        } else if (n < 6) {
            this.pitchEstimationComplexity = 1;
            this.pitchEstimationThreshold_Q16 = 48497;
            this.pitchEstimationLPCOrder = 10;
            this.shapingLPCOrder = 12;
            this.la_shape = 5 * this.fs_kHz;
            this.nStatesDelayedDecision = 2;
            this.useInterpolatedNLSFs = 1;
            this.LTPQuantLowComplexity = 0;
            this.NLSF_MSVQ_Survivors = 8;
            this.warping_Q16 = this.fs_kHz * 983;
        } else if (n < 8) {
            this.pitchEstimationComplexity = 1;
            this.pitchEstimationThreshold_Q16 = 47186;
            this.pitchEstimationLPCOrder = 12;
            this.shapingLPCOrder = 14;
            this.la_shape = 5 * this.fs_kHz;
            this.nStatesDelayedDecision = 3;
            this.useInterpolatedNLSFs = 1;
            this.LTPQuantLowComplexity = 0;
            this.NLSF_MSVQ_Survivors = 16;
            this.warping_Q16 = this.fs_kHz * 983;
        } else {
            this.pitchEstimationComplexity = 2;
            this.pitchEstimationThreshold_Q16 = 45875;
            this.pitchEstimationLPCOrder = 16;
            this.shapingLPCOrder = 16;
            this.la_shape = 5 * this.fs_kHz;
            this.nStatesDelayedDecision = 4;
            this.useInterpolatedNLSFs = 1;
            this.LTPQuantLowComplexity = 0;
            this.NLSF_MSVQ_Survivors = 32;
            this.warping_Q16 = this.fs_kHz * 983;
        }
        this.pitchEstimationLPCOrder = Inlines.silk_min_int((int)this.pitchEstimationLPCOrder, (int)this.predictLPCOrder);
        this.shapeWinLength = 5 * this.fs_kHz + 2 * this.la_shape;
        this.Complexity = n;
        Inlines.OpusAssert((this.pitchEstimationLPCOrder <= 16 ? 1 : 0) != 0);
        Inlines.OpusAssert((this.shapingLPCOrder <= 16 ? 1 : 0) != 0);
        Inlines.OpusAssert((this.nStatesDelayedDecision <= 4 ? 1 : 0) != 0);
        Inlines.OpusAssert((this.warping_Q16 <= Short.MAX_VALUE ? 1 : 0) != 0);
        Inlines.OpusAssert((this.la_shape <= 80 ? 1 : 0) != 0);
        Inlines.OpusAssert((this.shapeWinLength <= 240 ? 1 : 0) != 0);
        Inlines.OpusAssert((this.NLSF_MSVQ_Survivors <= 32 ? 1 : 0) != 0);
        return n2;
    }

    void Reset() {
        Arrays.MemSet((int[])this.In_HP_State, (int)0, (int)2);
        this.variable_HP_smth1_Q15 = 0;
        this.variable_HP_smth2_Q15 = 0;
        this.sLP.Reset();
        this.sVAD.Reset();
        this.sNSQ.Reset();
        Arrays.MemSet((short[])this.prev_NLSFq_Q15, (short)0, (int)16);
        this.speech_activity_Q8 = 0;
        this.allow_bandwidth_switch = 0;
        this.LBRRprevLastGainIndex = 0;
        this.prevSignalType = 0;
        this.prevLag = 0;
        this.pitch_LPC_win_length = 0;
        this.max_pitch_lag = 0;
        this.API_fs_Hz = 0;
        this.prev_API_fs_Hz = 0;
        this.maxInternal_fs_Hz = 0;
        this.minInternal_fs_Hz = 0;
        this.desiredInternal_fs_Hz = 0;
        this.fs_kHz = 0;
        this.nb_subfr = 0;
        this.frame_length = 0;
        this.subfr_length = 0;
        this.ltp_mem_length = 0;
        this.la_pitch = 0;
        this.la_shape = 0;
        this.shapeWinLength = 0;
        this.TargetRate_bps = 0;
        this.PacketSize_ms = 0;
        this.PacketLoss_perc = 0;
        this.frameCounter = 0;
        this.Complexity = 0;
        this.nStatesDelayedDecision = 0;
        this.useInterpolatedNLSFs = 0;
        this.shapingLPCOrder = 0;
        this.predictLPCOrder = 0;
        this.pitchEstimationComplexity = 0;
        this.pitchEstimationLPCOrder = 0;
        this.pitchEstimationThreshold_Q16 = 0;
        this.LTPQuantLowComplexity = 0;
        this.mu_LTP_Q9 = 0;
        this.sum_log_gain_Q7 = 0;
        this.NLSF_MSVQ_Survivors = 0;
        this.first_frame_after_reset = 0;
        this.controlled_since_last_payload = 0;
        this.warping_Q16 = 0;
        this.useCBR = 0;
        this.prefillFlag = 0;
        this.pitch_lag_low_bits_iCDF = null;
        this.pitch_contour_iCDF = null;
        this.psNLSF_CB = null;
        Arrays.MemSet((int[])this.input_quality_bands_Q15, (int)0, (int)4);
        this.input_tilt_Q15 = 0;
        this.SNR_dB_Q7 = 0;
        Arrays.MemSet((byte[])this.VAD_flags, (byte)0, (int)3);
        this.LBRR_flag = 0;
        Arrays.MemSet((int[])this.LBRR_flags, (int)0, (int)3);
        this.indices.Reset();
        Arrays.MemSet((byte[])this.pulses, (byte)0, (int)320);
        Arrays.MemSet((short[])this.inputBuf, (short)0, (int)322);
        this.inputBufIx = 0;
        this.nFramesPerPacket = 0;
        this.nFramesEncoded = 0;
        this.nChannelsAPI = 0;
        this.nChannelsInternal = 0;
        this.channelNb = 0;
        this.frames_since_onset = 0;
        this.ec_prevSignalType = 0;
        this.ec_prevLagIndex = 0;
        this.resampler_state.Reset();
        this.useDTX = 0;
        this.inDTX = 0;
        this.noSpeechCounter = 0;
        this.useInBandFEC = 0;
        this.LBRR_enabled = 0;
        this.LBRR_GainIncreases = 0;
        for (int i = 0; i < 3; ++i) {
            this.indices_LBRR[i].Reset();
            Arrays.MemSet((byte[])this.pulses_LBRR[i], (byte)0, (int)320);
        }
        this.sShape.Reset();
        this.sPrefilt.Reset();
        Arrays.MemSet((short[])this.x_buf, (short)0, (int)720);
        this.LTPCorr_Q15 = 0;
    }

    private int silk_setup_fs(int n, int n2) {
        int n3 = SilkError.SILK_NO_ERROR;
        if (n2 != this.PacketSize_ms) {
            if (n2 != 10 && n2 != 20 && n2 != 40 && n2 != 60) {
                n3 = SilkError.SILK_ENC_PACKET_SIZE_NOT_SUPPORTED;
            }
            if (n2 <= 10) {
                this.nFramesPerPacket = 1;
                this.nb_subfr = n2 == 10 ? 2 : 1;
                this.frame_length = Inlines.silk_SMULBB((int)n2, (int)n);
                this.pitch_LPC_win_length = Inlines.silk_SMULBB((int)14, (int)n);
                this.pitch_contour_iCDF = this.fs_kHz == 8 ? SilkTables.silk_pitch_contour_10_ms_NB_iCDF : SilkTables.silk_pitch_contour_10_ms_iCDF;
            } else {
                this.nFramesPerPacket = Inlines.silk_DIV32_16((int)n2, (int)20);
                this.nb_subfr = 4;
                this.frame_length = Inlines.silk_SMULBB((int)20, (int)n);
                this.pitch_LPC_win_length = Inlines.silk_SMULBB((int)24, (int)n);
                this.pitch_contour_iCDF = this.fs_kHz == 8 ? SilkTables.silk_pitch_contour_NB_iCDF : SilkTables.silk_pitch_contour_iCDF;
            }
            this.PacketSize_ms = n2;
            this.TargetRate_bps = 0;
        }
        Inlines.OpusAssert((n == 8 || n == 12 || n == 16 ? 1 : 0) != 0);
        Inlines.OpusAssert((this.nb_subfr == 2 || this.nb_subfr == 4 ? 1 : 0) != 0);
        if (this.fs_kHz != n) {
            this.sShape.Reset();
            this.sPrefilt.Reset();
            this.sNSQ.Reset();
            Arrays.MemSet((short[])this.prev_NLSFq_Q15, (short)0, (int)16);
            Arrays.MemSet((int[])this.sLP.In_LP_State, (int)0, (int)2);
            this.inputBufIx = 0;
            this.nFramesEncoded = 0;
            this.TargetRate_bps = 0;
            this.prevLag = 100;
            this.first_frame_after_reset = 1;
            this.sPrefilt.lagPrev = 100;
            this.sShape.LastGainIndex = (byte)10;
            this.sNSQ.lagPrev = 100;
            this.sNSQ.prev_gain_Q16 = 65536;
            this.prevSignalType = 0;
            this.fs_kHz = n;
            this.pitch_contour_iCDF = this.fs_kHz == 8 ? (this.nb_subfr == 4 ? SilkTables.silk_pitch_contour_NB_iCDF : SilkTables.silk_pitch_contour_10_ms_NB_iCDF) : (this.nb_subfr == 4 ? SilkTables.silk_pitch_contour_iCDF : SilkTables.silk_pitch_contour_10_ms_iCDF);
            if (this.fs_kHz == 8 || this.fs_kHz == 12) {
                this.predictLPCOrder = 10;
                this.psNLSF_CB = SilkTables.silk_NLSF_CB_NB_MB;
            } else {
                this.predictLPCOrder = 16;
                this.psNLSF_CB = SilkTables.silk_NLSF_CB_WB;
            }
            this.subfr_length = 5 * n;
            this.frame_length = Inlines.silk_SMULBB((int)this.subfr_length, (int)this.nb_subfr);
            this.ltp_mem_length = Inlines.silk_SMULBB((int)20, (int)n);
            this.la_pitch = Inlines.silk_SMULBB((int)2, (int)n);
            this.max_pitch_lag = Inlines.silk_SMULBB((int)18, (int)n);
            this.pitch_LPC_win_length = this.nb_subfr == 4 ? Inlines.silk_SMULBB((int)24, (int)n) : Inlines.silk_SMULBB((int)14, (int)n);
            if (this.fs_kHz == 16) {
                this.mu_LTP_Q9 = 10;
                this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform8_iCDF;
            } else if (this.fs_kHz == 12) {
                this.mu_LTP_Q9 = 13;
                this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform6_iCDF;
            } else {
                this.mu_LTP_Q9 = 15;
                this.pitch_lag_low_bits_iCDF = SilkTables.silk_uniform4_iCDF;
            }
        }
        Inlines.OpusAssert((this.subfr_length * this.nb_subfr == this.frame_length ? 1 : 0) != 0);
        return n3;
    }

    void silk_LBRR_encode(SilkEncoderControl silkEncoderControl, int[] nArray, int n) {
        int[] nArray2 = new int[this.nb_subfr];
        SideInfoIndices sideInfoIndices = this.indices_LBRR[this.nFramesEncoded];
        SilkNSQState silkNSQState = new SilkNSQState();
        if (this.LBRR_enabled != 0 && this.speech_activity_Q8 > 77) {
            this.LBRR_flags[this.nFramesEncoded] = 1;
            silkNSQState.Assign(this.sNSQ);
            sideInfoIndices.Assign(this.indices);
            System.arraycopy(silkEncoderControl.Gains_Q16, 0, nArray2, 0, this.nb_subfr);
            if (this.nFramesEncoded == 0 || this.LBRR_flags[this.nFramesEncoded - 1] == 0) {
                this.LBRRprevLastGainIndex = this.sShape.LastGainIndex;
                sideInfoIndices.GainsIndices[0] = (byte)(sideInfoIndices.GainsIndices[0] + this.LBRR_GainIncreases);
                sideInfoIndices.GainsIndices[0] = (byte)Inlines.silk_min_int((int)sideInfoIndices.GainsIndices[0], (int)63);
            }
            BoxedValueByte boxedValueByte = new BoxedValueByte(this.LBRRprevLastGainIndex);
            GainQuantization.silk_gains_dequant((int[])silkEncoderControl.Gains_Q16, (byte[])sideInfoIndices.GainsIndices, (BoxedValueByte)boxedValueByte, (int)(n == 2 ? 1 : 0), (int)this.nb_subfr);
            this.LBRRprevLastGainIndex = boxedValueByte.Val;
            if (this.nStatesDelayedDecision > 1 || this.warping_Q16 > 0) {
                silkNSQState.silk_NSQ_del_dec(this, sideInfoIndices, nArray, this.pulses_LBRR[this.nFramesEncoded], silkEncoderControl.PredCoef_Q12, silkEncoderControl.LTPCoef_Q14, silkEncoderControl.AR2_Q13, silkEncoderControl.HarmShapeGain_Q14, silkEncoderControl.Tilt_Q14, silkEncoderControl.LF_shp_Q14, silkEncoderControl.Gains_Q16, silkEncoderControl.pitchL, silkEncoderControl.Lambda_Q10, silkEncoderControl.LTP_scale_Q14);
            } else {
                silkNSQState.silk_NSQ(this, sideInfoIndices, nArray, this.pulses_LBRR[this.nFramesEncoded], silkEncoderControl.PredCoef_Q12, silkEncoderControl.LTPCoef_Q14, silkEncoderControl.AR2_Q13, silkEncoderControl.HarmShapeGain_Q14, silkEncoderControl.Tilt_Q14, silkEncoderControl.LF_shp_Q14, silkEncoderControl.Gains_Q16, silkEncoderControl.pitchL, silkEncoderControl.Lambda_Q10, silkEncoderControl.LTP_scale_Q14);
            }
            System.arraycopy(nArray2, 0, silkEncoderControl.Gains_Q16, 0, this.nb_subfr);
        }
    }

    private int silk_setup_LBRR(int n) {
        int n2 = SilkError.SILK_NO_ERROR;
        int n3 = this.LBRR_enabled;
        this.LBRR_enabled = 0;
        if (this.useInBandFEC != 0 && this.PacketLoss_perc > 0) {
            int n4 = this.fs_kHz == 8 ? 12000 : (this.fs_kHz == 12 ? 14000 : 16000);
            if (n > (n4 = Inlines.silk_SMULWB((int)Inlines.silk_MUL((int)n4, (int)(125 - Inlines.silk_min((int)this.PacketLoss_perc, (int)25))), (int)655))) {
                this.LBRR_GainIncreases = n3 == 0 ? 7 : Inlines.silk_max_int((int)(7 - Inlines.silk_SMULWB((int)this.PacketLoss_perc, (int)26214)), (int)2);
                this.LBRR_enabled = 1;
            }
        }
        return n2;
    }

    int silk_control_encoder(EncControlState encControlState, int n, int n2, int n3, int n4) {
        int n5 = SilkError.SILK_NO_ERROR;
        this.useDTX = encControlState.useDTX;
        this.useCBR = encControlState.useCBR;
        this.API_fs_Hz = encControlState.API_sampleRate;
        this.maxInternal_fs_Hz = encControlState.maxInternalSampleRate;
        this.minInternal_fs_Hz = encControlState.minInternalSampleRate;
        this.desiredInternal_fs_Hz = encControlState.desiredInternalSampleRate;
        this.useInBandFEC = encControlState.useInBandFEC;
        this.nChannelsAPI = encControlState.nChannelsAPI;
        this.nChannelsInternal = encControlState.nChannelsInternal;
        this.allow_bandwidth_switch = n2;
        this.channelNb = n3;
        if (this.controlled_since_last_payload != 0 && this.prefillFlag == 0) {
            if (this.API_fs_Hz != this.prev_API_fs_Hz && this.fs_kHz > 0) {
                n5 = this.silk_setup_resamplers(this.fs_kHz);
            }
            return n5;
        }
        int n6 = this.silk_control_audio_bandwidth(encControlState);
        if (n4 != 0) {
            n6 = n4;
        }
        n5 = this.silk_setup_resamplers(n6);
        n5 = this.silk_setup_fs(n6, encControlState.payloadSize_ms);
        n5 = this.silk_setup_complexity(encControlState.complexity);
        this.PacketLoss_perc = encControlState.packetLossPercentage;
        n5 = this.silk_setup_LBRR(n);
        this.controlled_since_last_payload = 1;
        return n5;
    }

    int silk_control_SNR(int n) {
        int n2 = SilkError.SILK_NO_ERROR;
        if ((n = Inlines.silk_LIMIT((int)n, (int)5000, (int)80000)) != this.TargetRate_bps) {
            this.TargetRate_bps = n;
            int[] nArray = this.fs_kHz == 8 ? SilkTables.silk_TargetRate_table_NB : (this.fs_kHz == 12 ? SilkTables.silk_TargetRate_table_MB : SilkTables.silk_TargetRate_table_WB);
            if (this.nb_subfr == 2) {
                n -= 2200;
            }
            for (int i = 1; i < 8; ++i) {
                if (n > nArray[i]) continue;
                int n3 = Inlines.silk_DIV32((int)Inlines.silk_LSHIFT((int)(n - nArray[i - 1]), (int)6), (int)(nArray[i] - nArray[i - 1]));
                this.SNR_dB_Q7 = Inlines.silk_LSHIFT((int)SilkTables.silk_SNR_table_Q1[i - 1], (int)6) + Inlines.silk_MUL((int)n3, (int)(SilkTables.silk_SNR_table_Q1[i] - SilkTables.silk_SNR_table_Q1[i - 1]));
                break;
            }
        }
        return n2;
    }

    int silk_encode_frame(BoxedValueInt boxedValueInt, EntropyCoder entropyCoder, int n, int n2, int n3) {
        SilkEncoderControl silkEncoderControl = new SilkEncoderControl();
        int n4 = 0;
        EntropyCoder entropyCoder2 = new EntropyCoder();
        EntropyCoder entropyCoder3 = new EntropyCoder();
        SilkNSQState silkNSQState = new SilkNSQState();
        SilkNSQState silkNSQState2 = new SilkNSQState();
        byte by = 0;
        int n5 = 0;
        int n6 = 0;
        int n7 = 0;
        int n8 = 0;
        this.indices.Seed = (byte)(this.frameCounter++ & 3);
        int n9 = this.ltp_mem_length;
        this.sLP.silk_LP_variable_cutoff(this.inputBuf, 1, this.frame_length);
        System.arraycopy(this.inputBuf, 1, this.x_buf, n9 + 5 * this.fs_kHz, this.frame_length);
        if (this.prefillFlag == 0) {
            short[] sArray = new short[this.la_pitch + this.frame_length + this.ltp_mem_length];
            int n10 = this.ltp_mem_length;
            FindPitchLags.silk_find_pitch_lags((SilkChannelEncoder)this, (SilkEncoderControl)silkEncoderControl, (short[])sArray, (short[])this.x_buf, (int)n9);
            NoiseShapeAnalysis.silk_noise_shape_analysis(this, silkEncoderControl, sArray, n10, this.x_buf, n9);
            FindPredCoefs.silk_find_pred_coefs((SilkChannelEncoder)this, (SilkEncoderControl)silkEncoderControl, (short[])sArray, (short[])this.x_buf, (int)n9, (int)n);
            ProcessGains.silk_process_gains(this, silkEncoderControl, n);
            int[] nArray = new int[this.frame_length];
            Filters.silk_prefilter((SilkChannelEncoder)this, (SilkEncoderControl)silkEncoderControl, (int[])nArray, (short[])this.x_buf, (int)n9);
            this.silk_LBRR_encode(silkEncoderControl, nArray, n);
            int n11 = 6;
            int n12 = 256;
            boolean bl = false;
            boolean bl2 = false;
            int n13 = GainQuantization.silk_gains_ID((byte[])this.indices.GainsIndices, (int)this.nb_subfr);
            int n14 = -1;
            int n15 = -1;
            entropyCoder2.Assign(entropyCoder);
            silkNSQState.Assign(this.sNSQ);
            byte by2 = this.indices.Seed;
            short s = this.ec_prevLagIndex;
            int n16 = this.ec_prevSignalType;
            byte[] byArray = new byte[1275];
            int n17 = 0;
            while (true) {
                int n18;
                if (n13 == n14) {
                    n18 = n8;
                } else if (n13 == n15) {
                    n18 = n7;
                } else {
                    if (n17 > 0) {
                        entropyCoder.Assign(entropyCoder2);
                        this.sNSQ.Assign(silkNSQState);
                        this.indices.Seed = by2;
                        this.ec_prevLagIndex = s;
                        this.ec_prevSignalType = n16;
                    }
                    if (this.nStatesDelayedDecision > 1 || this.warping_Q16 > 0) {
                        this.sNSQ.silk_NSQ_del_dec(this, this.indices, nArray, this.pulses, silkEncoderControl.PredCoef_Q12, silkEncoderControl.LTPCoef_Q14, silkEncoderControl.AR2_Q13, silkEncoderControl.HarmShapeGain_Q14, silkEncoderControl.Tilt_Q14, silkEncoderControl.LF_shp_Q14, silkEncoderControl.Gains_Q16, silkEncoderControl.pitchL, silkEncoderControl.Lambda_Q10, silkEncoderControl.LTP_scale_Q14);
                    } else {
                        this.sNSQ.silk_NSQ(this, this.indices, nArray, this.pulses, silkEncoderControl.PredCoef_Q12, silkEncoderControl.LTPCoef_Q14, silkEncoderControl.AR2_Q13, silkEncoderControl.HarmShapeGain_Q14, silkEncoderControl.Tilt_Q14, silkEncoderControl.LF_shp_Q14, silkEncoderControl.Gains_Q16, silkEncoderControl.pitchL, silkEncoderControl.Lambda_Q10, silkEncoderControl.LTP_scale_Q14);
                    }
                    EncodeIndices.silk_encode_indices((SilkChannelEncoder)this, (EntropyCoder)entropyCoder, (int)this.nFramesEncoded, (int)0, (int)n);
                    EncodePulses.silk_encode_pulses((EntropyCoder)entropyCoder, (int)this.indices.signalType, (int)this.indices.quantOffsetType, (byte[])this.pulses, (int)this.frame_length);
                    n18 = entropyCoder.tell();
                    if (n3 == 0 && n17 == 0 && n18 <= n2) break;
                }
                if (n17 == n11) {
                    if (!bl || n13 != n14 && n18 <= n2) break;
                    entropyCoder.Assign(entropyCoder3);
                    Inlines.OpusAssert((entropyCoder3.offs <= 1275 ? 1 : 0) != 0);
                    entropyCoder.write_buffer(byArray, 0, 0, entropyCoder3.offs);
                    this.sNSQ.Assign(silkNSQState2);
                    this.sShape.LastGainIndex = by;
                    break;
                }
                if (n18 > n2) {
                    if (!bl && n17 >= 2) {
                        silkEncoderControl.Lambda_Q10 = Inlines.silk_ADD_RSHIFT32((int)silkEncoderControl.Lambda_Q10, (int)silkEncoderControl.Lambda_Q10, (int)1);
                        bl2 = false;
                        n15 = -1;
                    } else {
                        bl2 = true;
                        n7 = n18;
                        n5 = n12;
                        n15 = n13;
                    }
                } else {
                    if (n18 >= n2 - 5) break;
                    bl = true;
                    n8 = n18;
                    n6 = n12;
                    if (n13 != n14) {
                        n14 = n13;
                        entropyCoder3.Assign(entropyCoder);
                        Inlines.OpusAssert((entropyCoder.offs <= 1275 ? 1 : 0) != 0);
                        System.arraycopy(entropyCoder.get_buffer(), 0, byArray, 0, entropyCoder.offs);
                        silkNSQState2.Assign(this.sNSQ);
                        by = this.sShape.LastGainIndex;
                    }
                }
                if (!(bl & bl2)) {
                    int n19 = Inlines.silk_log2lin((int)(Inlines.silk_LSHIFT((int)(n18 - n2), (int)7) / this.frame_length + 2048));
                    n19 = Inlines.silk_min_32((int)n19, (int)131072);
                    if (n18 > n2) {
                        n19 = Inlines.silk_max_32((int)n19, (int)85197);
                    }
                    n12 = (short)Inlines.silk_SMULWB((int)n19, (int)n12);
                } else {
                    n12 = (short)(n6 + Inlines.silk_DIV32_16((int)Inlines.silk_MUL((int)(n5 - n6), (int)(n2 - n8)), (int)(n7 - n8)));
                    if (n12 > Inlines.silk_ADD_RSHIFT32((int)n6, (int)(n5 - n6), (int)2)) {
                        n12 = (short)Inlines.silk_ADD_RSHIFT32((int)n6, (int)(n5 - n6), (int)2);
                    } else if (n12 < Inlines.silk_SUB_RSHIFT32((int)n5, (int)(n5 - n6), (int)2)) {
                        n12 = (short)Inlines.silk_SUB_RSHIFT32((int)n5, (int)(n5 - n6), (int)2);
                    }
                }
                for (int i = 0; i < this.nb_subfr; ++i) {
                    silkEncoderControl.Gains_Q16[i] = Inlines.silk_LSHIFT_SAT32((int)Inlines.silk_SMULWB((int)silkEncoderControl.GainsUnq_Q16[i], (int)n12), (int)8);
                }
                this.sShape.LastGainIndex = silkEncoderControl.lastGainIndexPrev;
                BoxedValueByte boxedValueByte = new BoxedValueByte(this.sShape.LastGainIndex);
                GainQuantization.silk_gains_quant((byte[])this.indices.GainsIndices, (int[])silkEncoderControl.Gains_Q16, (BoxedValueByte)boxedValueByte, (int)(n == 2 ? 1 : 0), (int)this.nb_subfr);
                this.sShape.LastGainIndex = boxedValueByte.Val;
                n13 = GainQuantization.silk_gains_ID((byte[])this.indices.GainsIndices, (int)this.nb_subfr);
                ++n17;
            }
        }
        Arrays.MemMove((short[])this.x_buf, (int)this.frame_length, (int)0, (int)(this.ltp_mem_length + 5 * this.fs_kHz));
        if (this.prefillFlag != 0) {
            boxedValueInt.Val = 0;
            return n4;
        }
        this.prevLag = silkEncoderControl.pitchL[this.nb_subfr - 1];
        this.prevSignalType = this.indices.signalType;
        this.first_frame_after_reset = 0;
        boxedValueInt.Val = Inlines.silk_RSHIFT((int)(entropyCoder.tell() + 7), (int)3);
        return n4;
    }

    void silk_encode_do_VAD() {
        VoiceActivityDetection.silk_VAD_GetSA_Q8(this, this.inputBuf, 1);
        if (this.speech_activity_Q8 < 13) {
            this.indices.signalType = 0;
            ++this.noSpeechCounter;
            if (this.noSpeechCounter < 10) {
                this.inDTX = 0;
            } else if (this.noSpeechCounter > 30) {
                this.noSpeechCounter = 10;
                this.inDTX = 0;
            }
            this.VAD_flags[this.nFramesEncoded] = 0;
        } else {
            this.noSpeechCounter = 0;
            this.inDTX = 0;
            this.indices.signalType = 1;
            this.VAD_flags[this.nFramesEncoded] = 1;
        }
    }

    int silk_control_audio_bandwidth(EncControlState encControlState) {
        int n;
        block19: {
            block21: {
                block20: {
                    int n2;
                    block18: {
                        n = this.fs_kHz;
                        n2 = Inlines.silk_SMULBB((int)n, (int)1000);
                        if (n2 != 0) break block18;
                        n2 = Inlines.silk_min((int)this.desiredInternal_fs_Hz, (int)this.API_fs_Hz);
                        n = Inlines.silk_DIV32_16((int)n2, (int)1000);
                        break block19;
                    }
                    if (n2 <= this.API_fs_Hz && n2 <= this.maxInternal_fs_Hz && n2 >= this.minInternal_fs_Hz) break block20;
                    n2 = this.API_fs_Hz;
                    n2 = Inlines.silk_min((int)n2, (int)this.maxInternal_fs_Hz);
                    n2 = Inlines.silk_max((int)n2, (int)this.minInternal_fs_Hz);
                    n = Inlines.silk_DIV32_16((int)n2, (int)1000);
                    break block19;
                }
                if (this.sLP.transition_frame_no >= 256) {
                    this.sLP.mode = 0;
                }
                if (this.allow_bandwidth_switch != 0) break block21;
                if (encControlState.opusCanSwitch == 0) break block19;
            }
            if (Inlines.silk_SMULBB((int)this.fs_kHz, (int)1000) > this.desiredInternal_fs_Hz) {
                if (this.sLP.mode == 0) {
                    this.sLP.transition_frame_no = 256;
                    Arrays.MemSet((int[])this.sLP.In_LP_State, (int)0, (int)2);
                }
                if (encControlState.opusCanSwitch != 0) {
                    this.sLP.mode = 0;
                    n = this.fs_kHz == 16 ? 12 : 8;
                } else if (this.sLP.transition_frame_no <= 0) {
                    encControlState.switchReady = 1;
                    encControlState.maxBits -= encControlState.maxBits * 5 / (encControlState.payloadSize_ms + 5);
                } else {
                    this.sLP.mode = -2;
                }
            } else if (Inlines.silk_SMULBB((int)this.fs_kHz, (int)1000) < this.desiredInternal_fs_Hz) {
                if (encControlState.opusCanSwitch != 0) {
                    n = this.fs_kHz == 8 ? 12 : 16;
                    this.sLP.transition_frame_no = 0;
                    Arrays.MemSet((int[])this.sLP.In_LP_State, (int)0, (int)2);
                    this.sLP.mode = 1;
                } else if (this.sLP.mode == 0) {
                    encControlState.switchReady = 1;
                    encControlState.maxBits -= encControlState.maxBits * 5 / (encControlState.payloadSize_ms + 5);
                } else {
                    this.sLP.mode = 1;
                }
            } else if (this.sLP.mode < 0) {
                this.sLP.mode = 1;
            }
        }
        return n;
    }
}

