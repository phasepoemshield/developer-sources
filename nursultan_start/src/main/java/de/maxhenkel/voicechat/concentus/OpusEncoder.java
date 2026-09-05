/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Analysis
 *  de.maxhenkel.voicechat.concentus.AnalysisInfo
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.CeltEncoder
 *  de.maxhenkel.voicechat.concentus.CeltMode
 *  de.maxhenkel.voicechat.concentus.CodecHelpers
 *  de.maxhenkel.voicechat.concentus.EncControlState
 *  de.maxhenkel.voicechat.concentus.EncodeAPI
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Analysis;
import de.maxhenkel.voicechat.concentus.AnalysisInfo;
import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltEncoder;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.CodecHelpers;
import de.maxhenkel.voicechat.concentus.EncControlState;
import de.maxhenkel.voicechat.concentus.EncodeAPI;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.OpusApplication;
import de.maxhenkel.voicechat.concentus.OpusBandwidth;
import de.maxhenkel.voicechat.concentus.OpusBandwidthHelpers;
import de.maxhenkel.voicechat.concentus.OpusError;
import de.maxhenkel.voicechat.concentus.OpusException;
import de.maxhenkel.voicechat.concentus.OpusFramesize;
import de.maxhenkel.voicechat.concentus.OpusMode;
import de.maxhenkel.voicechat.concentus.OpusRepacketizer;
import de.maxhenkel.voicechat.concentus.OpusSignal;
import de.maxhenkel.voicechat.concentus.OpusTables;
import de.maxhenkel.voicechat.concentus.SilkEncoder;
import de.maxhenkel.voicechat.concentus.StereoWidthState;
import de.maxhenkel.voicechat.concentus.TonalityAnalysisState;

public class OpusEncoder {
    final EncControlState silk_mode = new EncControlState();
    OpusApplication application;
    int channels;
    int delay_compensation;
    int force_channels;
    OpusSignal signal_type;
    OpusBandwidth user_bandwidth;
    OpusBandwidth max_bandwidth;
    OpusMode user_forced_mode;
    int voice_ratio;
    int Fs;
    int use_vbr;
    int vbr_constraint;
    OpusFramesize variable_duration;
    int bitrate_bps;
    int user_bitrate_bps;
    int lsb_depth;
    int encoder_buffer;
    int lfe;
    final TonalityAnalysisState analysis = new TonalityAnalysisState();
    int stream_channels;
    short hybrid_stereo_width_Q14;
    int variable_HP_smth2_Q15;
    int prev_HB_gain;
    final int[] hp_mem = new int[4];
    OpusMode mode;
    OpusMode prev_mode;
    int prev_channels;
    int prev_framesize;
    OpusBandwidth bandwidth;
    int silk_bw_switch;
    int first;
    int[] energy_masking;
    final StereoWidthState width_mem = new StereoWidthState();
    final short[] delay_buffer = new short[960];
    OpusBandwidth detected_bandwidth;
    int rangeFinal;
    final SilkEncoder SilkEncoder = new SilkEncoder();
    final CeltEncoder Celt_Encoder = new CeltEncoder();

    public OpusEncoder(int n, int n2, OpusApplication opusApplication) throws OpusException {
        if (n != 48000) {
            if (n != 24000) {
                if (n != 16000) {
                    if (n != 12000) {
                        if (n != 8000) {
                            throw new IllegalArgumentException("Sample rate is invalid (must be 8/12/16/24/48 Khz)");
                        }
                    }
                }
            }
        }
        if (n2 != 1 && n2 != 2) {
            throw new IllegalArgumentException("Number of channels must be 1 or 2");
        }
        int n3 = this.opus_init_encoder(n, n2, opusApplication);
        if (n3 != OpusError.OPUS_OK) {
            if (n3 == OpusError.OPUS_BAD_ARG) {
                throw new IllegalArgumentException("OPUS_BAD_ARG when creating encoder");
            }
            throw new OpusException("Error while initializing encoder", n3);
        }
    }

    OpusEncoder() {
    }

    void reset() {
        this.silk_mode.Reset();
        this.application = OpusApplication.OPUS_APPLICATION_UNIMPLEMENTED;
        this.channels = 0;
        this.delay_compensation = 0;
        this.force_channels = 0;
        this.signal_type = OpusSignal.OPUS_SIGNAL_UNKNOWN;
        this.user_bandwidth = OpusBandwidth.OPUS_BANDWIDTH_UNKNOWN;
        this.max_bandwidth = OpusBandwidth.OPUS_BANDWIDTH_UNKNOWN;
        this.user_forced_mode = OpusMode.MODE_UNKNOWN;
        this.voice_ratio = 0;
        this.Fs = 0;
        this.use_vbr = 0;
        this.vbr_constraint = 0;
        this.variable_duration = OpusFramesize.OPUS_FRAMESIZE_UNKNOWN;
        this.bitrate_bps = 0;
        this.user_bitrate_bps = 0;
        this.lsb_depth = 0;
        this.encoder_buffer = 0;
        this.lfe = 0;
        this.analysis.Reset();
        this.PartialReset();
    }

    public int encode(byte[] byArray, int n, int n2, byte[] byArray2, int n3, int n4) throws OpusException {
        short[] sArray = new short[n2 * this.channels];
        int n5 = n;
        for (int i = 0; i < sArray.length; ++i) {
            sArray[i] = (short)((byArray[n5] & 0xFF | byArray[n5 + 1] << 8) & 0xFFFF);
            n5 += 2;
        }
        return this.encode(sArray, 0, n2, byArray2, n3, n4);
    }

    public int encode(short[] sArray, int n, int n2, byte[] byArray, int n3, int n4) throws OpusException {
        if (n3 + n4 > byArray.length) {
            throw new IllegalArgumentException("Output buffer is too small: Stated size is " + n4 + " bytes, actual size is " + (byArray.length - n3) + " bytes");
        }
        int n5 = this.application == OpusApplication.OPUS_APPLICATION_RESTRICTED_LOWDELAY ? 0 : this.delay_compensation;
        int n6 = CodecHelpers.compute_frame_size((short[])sArray, (int)n, (int)n2, (OpusFramesize)this.variable_duration, (int)this.channels, (int)this.Fs, (int)this.bitrate_bps, (int)n5, (float[])this.analysis.subframe_mem, (boolean)this.analysis.enabled);
        if (n + n6 > sArray.length) {
            throw new IllegalArgumentException("Not enough samples provided in input signal: Expected " + n6 + " samples, found " + (sArray.length - n));
        }
        try {
            int n7 = this.opus_encode_native(sArray, n, n6, byArray, n3, n4, 16, sArray, n, n2, 0, -2, this.channels, 0);
            if (n7 < 0) {
                if (n7 == OpusError.OPUS_BAD_ARG) {
                    throw new IllegalArgumentException("OPUS_BAD_ARG while encoding");
                }
                throw new OpusException("An error occurred during encoding", n7);
            }
            return n7;
        }
        catch (ArithmeticException arithmeticException) {
            throw new OpusException("Internal error during encoding: " + arithmeticException.getMessage());
        }
    }

    public void resetState() {
        EncControlState encControlState = new EncControlState();
        this.analysis.Reset();
        this.PartialReset();
        this.Celt_Encoder.ResetState();
        EncodeAPI.silk_InitEncoder((SilkEncoder)this.SilkEncoder, (EncControlState)encControlState);
        this.stream_channels = this.channels;
        this.hybrid_stereo_width_Q14 = (short)16384;
        this.prev_HB_gain = Short.MAX_VALUE;
        this.first = 1;
        this.mode = OpusMode.MODE_HYBRID;
        this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_FULLBAND;
        this.variable_HP_smth2_Q15 = Inlines.silk_LSHIFT((int)Inlines.silk_lin2log((int)60), (int)8);
    }

    public void setPacketLossPercent(int n) {
        if (n < 0 || n > 100) {
            throw new IllegalArgumentException("Packet loss must be between 0 and 100");
        }
        this.silk_mode.packetLossPercentage = n;
        this.Celt_Encoder.SetPacketLossPercent(n);
    }

    public OpusFramesize getExpertFrameDuration() {
        return this.variable_duration;
    }

    public boolean getUseConstrainedVBR() {
        return this.vbr_constraint != 0;
    }

    public boolean getPredictionDisabled() {
        return this.silk_mode.reducedDependency != 0;
    }

    public int getPacketLossPercent() {
        return this.silk_mode.packetLossPercentage;
    }

    public void setExpertFrameDuration(OpusFramesize opusFramesize) {
        this.variable_duration = opusFramesize;
        this.Celt_Encoder.SetExpertFrameDuration(opusFramesize);
    }

    int user_bitrate_to_bitrate(int n, int n2) {
        if (n == 0) {
            n = this.Fs / 400;
        }
        if (this.user_bitrate_bps == -1000) {
            return 60 * this.Fs / n + this.Fs * this.channels;
        }
        if (this.user_bitrate_bps == -1) {
            return n2 * 8 * this.Fs / n;
        }
        return this.user_bitrate_bps;
    }

    public void setUseConstrainedVBR(boolean bl) {
        this.vbr_constraint = bl ? 1 : 0;
    }

    public void setPredictionDisabled(boolean bl) {
        this.silk_mode.reducedDependency = bl ? 1 : 0;
    }

    public int getSampleRate() {
        return this.Fs;
    }

    public void setBandwidth(OpusBandwidth opusBandwidth) {
        this.user_bandwidth = opusBandwidth;
        this.silk_mode.maxInternalSampleRate = this.user_bandwidth == OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND ? 8000 : (this.user_bandwidth == OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND ? 12000 : 16000);
    }

    public OpusBandwidth getBandwidth() {
        return this.bandwidth;
    }

    public OpusApplication getApplication() {
        return this.application;
    }

    public int getBitrate() {
        return this.user_bitrate_to_bitrate(this.prev_framesize, 1276);
    }

    void PartialReset() {
        this.stream_channels = 0;
        this.hybrid_stereo_width_Q14 = 0;
        this.variable_HP_smth2_Q15 = 0;
        this.prev_HB_gain = 0;
        Arrays.MemSet((int[])this.hp_mem, (int)0, (int)4);
        this.mode = OpusMode.MODE_UNKNOWN;
        this.prev_mode = OpusMode.MODE_UNKNOWN;
        this.prev_channels = 0;
        this.prev_framesize = 0;
        this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_UNKNOWN;
        this.silk_bw_switch = 0;
        this.first = 0;
        this.energy_masking = null;
        this.width_mem.Reset();
        Arrays.MemSet((short[])this.delay_buffer, (short)0, (int)960);
        this.detected_bandwidth = OpusBandwidth.OPUS_BANDWIDTH_UNKNOWN;
        this.rangeFinal = 0;
    }

    void SetEnergyMask(int[] nArray) {
        this.energy_masking = nArray;
        this.Celt_Encoder.SetEnergyMask(nArray);
    }

    public void setComplexity(int n) {
        if (n < 0 || n > 10) {
            throw new IllegalArgumentException("Complexity must be between 0 and 10");
        }
        this.silk_mode.complexity = n;
        this.Celt_Encoder.SetComplexity(n);
    }

    public void setUseInbandFEC(boolean bl) {
        this.silk_mode.useInBandFEC = bl ? 1 : 0;
    }

    public void setSignalType(OpusSignal opusSignal) {
        this.signal_type = opusSignal;
    }

    public int getLookahead() {
        int n = this.Fs / 400;
        if (this.application != OpusApplication.OPUS_APPLICATION_RESTRICTED_LOWDELAY) {
            n += this.delay_compensation;
        }
        return n;
    }

    public OpusSignal getSignalType() {
        return this.signal_type;
    }

    public int getLSBDepth() {
        return this.lsb_depth;
    }

    public void setLSBDepth(int n) {
        if (n < 8 || n > 24) {
            throw new IllegalArgumentException("LSB depth must be between 8 and 24");
        }
        this.lsb_depth = n;
    }

    public OpusMode getForceMode() {
        return this.user_forced_mode;
    }

    public void setForceMode(OpusMode opusMode) {
        this.user_forced_mode = opusMode;
    }

    public boolean getUseInbandFEC() {
        return this.silk_mode.useInBandFEC != 0;
    }

    public boolean getEnableAnalysis() {
        return this.analysis.enabled;
    }

    public void setEnableAnalysis(boolean bl) {
        this.analysis.enabled = bl;
    }

    CeltMode GetCeltMode() {
        return this.Celt_Encoder.GetMode();
    }

    int opus_init_encoder(int n, int n2, OpusApplication opusApplication) {
        block7: {
            block6: {
                block5: {
                    if (n == 48000) break block5;
                    if (n == 24000) break block5;
                    if (n == 16000) break block5;
                    if (n == 12000) break block5;
                    if (n != 8000) break block6;
                }
                if ((n2 == 1 || n2 == 2) && opusApplication != OpusApplication.OPUS_APPLICATION_UNIMPLEMENTED) break block7;
            }
            return OpusError.OPUS_BAD_ARG;
        }
        this.reset();
        SilkEncoder silkEncoder = this.SilkEncoder;
        CeltEncoder celtEncoder = this.Celt_Encoder;
        this.stream_channels = this.channels = n2;
        this.Fs = n;
        int n3 = EncodeAPI.silk_InitEncoder((SilkEncoder)silkEncoder, (EncControlState)this.silk_mode);
        if (n3 != 0) {
            return OpusError.OPUS_INTERNAL_ERROR;
        }
        this.silk_mode.nChannelsAPI = n2;
        this.silk_mode.nChannelsInternal = n2;
        this.silk_mode.API_sampleRate = this.Fs;
        this.silk_mode.maxInternalSampleRate = 16000;
        this.silk_mode.minInternalSampleRate = 8000;
        this.silk_mode.desiredInternalSampleRate = 16000;
        this.silk_mode.payloadSize_ms = 20;
        this.silk_mode.bitRate = 25000;
        this.silk_mode.packetLossPercentage = 0;
        this.silk_mode.complexity = 9;
        this.silk_mode.useInBandFEC = 0;
        this.silk_mode.useDTX = 0;
        this.silk_mode.useCBR = 0;
        this.silk_mode.reducedDependency = 0;
        int n4 = celtEncoder.celt_encoder_init(n, n2);
        if (n4 != OpusError.OPUS_OK) {
            return OpusError.OPUS_INTERNAL_ERROR;
        }
        celtEncoder.SetSignalling(0);
        celtEncoder.SetComplexity(this.silk_mode.complexity);
        this.use_vbr = 1;
        this.vbr_constraint = 1;
        this.user_bitrate_bps = -1000;
        this.bitrate_bps = 3000 + n * n2;
        this.application = opusApplication;
        this.signal_type = OpusSignal.OPUS_SIGNAL_AUTO;
        this.user_bandwidth = OpusBandwidth.OPUS_BANDWIDTH_AUTO;
        this.max_bandwidth = OpusBandwidth.OPUS_BANDWIDTH_FULLBAND;
        this.force_channels = -1000;
        this.user_forced_mode = OpusMode.MODE_AUTO;
        this.voice_ratio = -1;
        this.encoder_buffer = this.Fs / 100;
        this.lsb_depth = 24;
        this.variable_duration = OpusFramesize.OPUS_FRAMESIZE_ARG;
        this.delay_compensation = this.Fs / 250;
        this.hybrid_stereo_width_Q14 = (short)16384;
        this.prev_HB_gain = Short.MAX_VALUE;
        this.variable_HP_smth2_Q15 = Inlines.silk_LSHIFT((int)Inlines.silk_lin2log((int)60), (int)8);
        this.first = 1;
        this.mode = OpusMode.MODE_HYBRID;
        this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_FULLBAND;
        Analysis.tonality_analysis_init((TonalityAnalysisState)this.analysis);
        return OpusError.OPUS_OK;
    }

    int opus_encode_native(short[] sArray, int n, int n2, byte[] byArray, int n3, int n4, int n5, short[] sArray2, int n6, int n7, int n8, int n9, int n10, int n11) {
        short[] sArray3;
        int n12;
        int n13;
        short[] sArray4;
        OpusBandwidth opusBandwidth;
        CeltEncoder celtEncoder;
        int n14;
        AnalysisInfo analysisInfo;
        int n15;
        boolean bl;
        int n16;
        int n17;
        int n18;
        int n19;
        EntropyCoder entropyCoder;
        int n20;
        block187: {
            CeltMode celtMode;
            block188: {
                block186: {
                    int n21;
                    block185: {
                        int n22;
                        block184: {
                            block183: {
                                int n23;
                                int n24;
                                int n25;
                                int n26;
                                OpusBandwidth opusBandwidth2;
                                int n27;
                                int n28;
                                int n29;
                                int n30;
                                int n31;
                                int n32;
                                SilkEncoder silkEncoder;
                                int n33;
                                int n34;
                                boolean bl2;
                                block182: {
                                    OpusBandwidth opusBandwidth3;
                                    block181: {
                                        block180: {
                                            block179: {
                                                block178: {
                                                    n20 = 0;
                                                    entropyCoder = new EntropyCoder();
                                                    bl2 = false;
                                                    n19 = 0;
                                                    n18 = 0;
                                                    n17 = 0;
                                                    n16 = 0;
                                                    bl = false;
                                                    n15 = 0;
                                                    analysisInfo = new AnalysisInfo();
                                                    n34 = -1;
                                                    n33 = -1;
                                                    n14 = Inlines.IMIN((int)1276, (int)n4);
                                                    this.rangeFinal = 0;
                                                    if (this.variable_duration != OpusFramesize.OPUS_FRAMESIZE_UNKNOWN) break block178;
                                                    if (400 * n2 == this.Fs) break block178;
                                                    if (200 * n2 == this.Fs || 100 * n2 == this.Fs || 50 * n2 == this.Fs || 25 * n2 == this.Fs) break block178;
                                                    if (50 * n2 != 3 * this.Fs) break block179;
                                                }
                                                if (400 * n2 >= this.Fs && n14 > 0) break block180;
                                            }
                                            return OpusError.OPUS_BAD_ARG;
                                        }
                                        silkEncoder = this.SilkEncoder;
                                        celtEncoder = this.Celt_Encoder;
                                        int n35 = this.application == OpusApplication.OPUS_APPLICATION_RESTRICTED_LOWDELAY ? 0 : this.delay_compensation;
                                        n5 = Inlines.IMIN((int)n5, (int)this.lsb_depth);
                                        celtMode = celtEncoder.GetMode();
                                        this.voice_ratio = -1;
                                        if (this.analysis.enabled) {
                                            analysisInfo.valid = 0;
                                            if (this.silk_mode.complexity >= 7 && this.Fs == 48000) {
                                                n34 = this.analysis.read_pos;
                                                n33 = this.analysis.read_subframe;
                                                Analysis.run_analysis((TonalityAnalysisState)this.analysis, (CeltMode)celtMode, (short[])((short[])(sArray2 != null ? sArray2 : null)), (int)n6, (int)n7, (int)n2, (int)n8, (int)n9, (int)n10, (int)this.Fs, (int)n5, (AnalysisInfo)analysisInfo);
                                            }
                                            this.detected_bandwidth = OpusBandwidth.OPUS_BANDWIDTH_UNKNOWN;
                                            if (analysisInfo.valid != 0) {
                                                if (this.signal_type == OpusSignal.OPUS_SIGNAL_AUTO) {
                                                    this.voice_ratio = (int)Math.floor(0.5f + 100.0f * (1.0f - analysisInfo.music_prob));
                                                }
                                                this.detected_bandwidth = (n32 = analysisInfo.bandwidth) <= 12 ? OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND : (n32 <= 14 ? OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND : (n32 <= 16 ? OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND : (n32 <= 18 ? OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND : OpusBandwidth.OPUS_BANDWIDTH_FULLBAND)));
                                            }
                                        }
                                        n31 = this.channels == 2 && this.force_channels != 1 ? CodecHelpers.compute_stereo_width((short[])sArray, (int)n, (int)n2, (int)this.Fs, (StereoWidthState)this.width_mem) : 0;
                                        n30 = n35;
                                        this.bitrate_bps = this.user_bitrate_to_bitrate(n2, n14);
                                        n29 = this.Fs / n2;
                                        if (this.use_vbr == 0) {
                                            n28 = 3 * this.Fs / n2;
                                            n32 = Inlines.IMIN((int)((3 * this.bitrate_bps / 8 + n28 / 2) / n28), (int)n14);
                                            this.bitrate_bps = n32 * n28 * 8 / 3;
                                            n14 = n32;
                                        }
                                        if (n14 < 3 || this.bitrate_bps < 3 * n29 * 8) break block181;
                                        if (n29 >= 50) break block182;
                                        if (n14 * n29 < 300) break block181;
                                        if (this.bitrate_bps >= 2400) break block182;
                                    }
                                    OpusMode opusMode = this.mode;
                                    OpusBandwidth opusBandwidth4 = opusBandwidth3 = this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_UNKNOWN ? OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND : this.bandwidth;
                                    if (opusMode == OpusMode.MODE_UNKNOWN) {
                                        opusMode = OpusMode.MODE_SILK_ONLY;
                                    }
                                    if (n29 > 100) {
                                        opusMode = OpusMode.MODE_CELT_ONLY;
                                    }
                                    if (n29 < 50) {
                                        opusMode = OpusMode.MODE_SILK_ONLY;
                                    }
                                    if (opusMode == OpusMode.MODE_SILK_ONLY && OpusBandwidthHelpers.GetOrdinal(opusBandwidth3) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND)) {
                                        opusBandwidth3 = OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND;
                                    } else if (opusMode == OpusMode.MODE_CELT_ONLY && OpusBandwidthHelpers.GetOrdinal(opusBandwidth3) == OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND)) {
                                        opusBandwidth3 = OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND;
                                    } else if (opusMode == OpusMode.MODE_HYBRID && OpusBandwidthHelpers.GetOrdinal(opusBandwidth3) <= OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND)) {
                                        opusBandwidth3 = OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND;
                                    }
                                    byArray[n3] = CodecHelpers.gen_toc((OpusMode)opusMode, (int)n29, (OpusBandwidth)opusBandwidth3, (int)this.stream_channels);
                                    n20 = 1;
                                    if (this.use_vbr == 0 && (n20 = OpusRepacketizer.padPacket(byArray, n3, n20, n14)) == OpusError.OPUS_OK) {
                                        n20 = n14;
                                    }
                                    return n20;
                                }
                                int n36 = n29 * n14 * 8;
                                n21 = this.bitrate_bps - (40 * this.channels + 20) * (this.Fs / n2 - 50);
                                if (this.signal_type == OpusSignal.OPUS_SIGNAL_VOICE) {
                                    n27 = 127;
                                } else if (this.signal_type == OpusSignal.OPUS_SIGNAL_MUSIC) {
                                    n27 = 0;
                                } else if (this.voice_ratio >= 0) {
                                    n27 = this.voice_ratio * 327 >> 8;
                                    if (this.application == OpusApplication.OPUS_APPLICATION_AUDIO) {
                                        n27 = Inlines.IMIN((int)n27, (int)115);
                                    }
                                } else {
                                    n27 = this.application == OpusApplication.OPUS_APPLICATION_VOIP ? 115 : 48;
                                }
                                if (this.force_channels != -1000 && this.channels == 2) {
                                    this.stream_channels = this.force_channels;
                                } else if (this.channels == 2) {
                                    n32 = 30000 + (n27 * n27 * 0 >> 14);
                                    n32 = this.stream_channels == 2 ? (n32 -= 1000) : (n32 += 1000);
                                    this.stream_channels = n21 > n32 ? 2 : 1;
                                } else {
                                    this.stream_channels = this.channels;
                                }
                                n21 = this.bitrate_bps - (40 * this.stream_channels + 20) * (this.Fs / n2 - 50);
                                if (this.application == OpusApplication.OPUS_APPLICATION_RESTRICTED_LOWDELAY) {
                                    this.mode = OpusMode.MODE_CELT_ONLY;
                                } else if (this.user_forced_mode == OpusMode.MODE_AUTO) {
                                    n32 = Inlines.MULT16_32_Q15((int)(Short.MAX_VALUE - n31), (int)OpusTables.mode_thresholds[0][0]) + Inlines.MULT16_32_Q15((int)n31, (int)OpusTables.mode_thresholds[1][0]);
                                    n28 = Inlines.MULT16_32_Q15((int)(Short.MAX_VALUE - n31), (int)OpusTables.mode_thresholds[1][1]) + Inlines.MULT16_32_Q15((int)n31, (int)OpusTables.mode_thresholds[1][1]);
                                    int n37 = n28 + (n27 * n27 * (n32 - n28) >> 14);
                                    if (this.application == OpusApplication.OPUS_APPLICATION_VOIP) {
                                        n37 += 8000;
                                    }
                                    if (this.prev_mode == OpusMode.MODE_CELT_ONLY) {
                                        n37 -= 4000;
                                    } else if (this.prev_mode != OpusMode.MODE_AUTO && this.prev_mode != OpusMode.MODE_UNKNOWN) {
                                        n37 += 4000;
                                    }
                                    OpusMode opusMode = this.mode = n21 >= n37 ? OpusMode.MODE_CELT_ONLY : OpusMode.MODE_SILK_ONLY;
                                    if (this.silk_mode.useInBandFEC != 0) {
                                        if (this.silk_mode.packetLossPercentage > 128 - n27 >> 4) {
                                            this.mode = OpusMode.MODE_SILK_ONLY;
                                        }
                                    }
                                    if (this.silk_mode.useDTX != 0 && n27 > 100) {
                                        this.mode = OpusMode.MODE_SILK_ONLY;
                                    }
                                } else {
                                    this.mode = this.user_forced_mode;
                                }
                                if (this.mode != OpusMode.MODE_CELT_ONLY && n2 < this.Fs / 100) {
                                    this.mode = OpusMode.MODE_CELT_ONLY;
                                }
                                if (this.lfe != 0) {
                                    this.mode = OpusMode.MODE_CELT_ONLY;
                                }
                                if (n14 < (n29 > 50 ? 12000 : 8000) * n2 / (this.Fs * 8)) {
                                    this.mode = OpusMode.MODE_CELT_ONLY;
                                }
                                if (this.stream_channels == 1 && this.prev_channels == 2 && this.silk_mode.toMono == 0 && this.mode != OpusMode.MODE_CELT_ONLY && this.prev_mode != OpusMode.MODE_CELT_ONLY) {
                                    this.silk_mode.toMono = 1;
                                    this.stream_channels = 2;
                                } else {
                                    this.silk_mode.toMono = 0;
                                }
                                if (this.prev_mode != OpusMode.MODE_AUTO && this.prev_mode != OpusMode.MODE_UNKNOWN && (this.mode != OpusMode.MODE_CELT_ONLY && this.prev_mode == OpusMode.MODE_CELT_ONLY || this.mode == OpusMode.MODE_CELT_ONLY && this.prev_mode != OpusMode.MODE_CELT_ONLY)) {
                                    n18 = 1;
                                    int n38 = n16 = this.mode != OpusMode.MODE_CELT_ONLY ? 1 : 0;
                                    if (n16 == 0) {
                                        if (n2 >= this.Fs / 100) {
                                            this.mode = this.prev_mode;
                                            bl = true;
                                        } else {
                                            n18 = 0;
                                        }
                                    }
                                }
                                if (this.silk_bw_switch != 0) {
                                    n18 = 1;
                                    n16 = 1;
                                    this.silk_bw_switch = 0;
                                    bl2 = true;
                                }
                                if (n18 != 0) {
                                    n17 = Inlines.IMIN((int)257, (int)(n14 * (this.Fs / 200) / (n2 + this.Fs / 200)));
                                    if (this.use_vbr != 0) {
                                        n17 = Inlines.IMIN((int)n17, (int)(this.bitrate_bps / 1600));
                                    }
                                }
                                if (this.mode != OpusMode.MODE_CELT_ONLY && this.prev_mode == OpusMode.MODE_CELT_ONLY) {
                                    EncControlState encControlState = new EncControlState();
                                    EncodeAPI.silk_InitEncoder((SilkEncoder)silkEncoder, (EncControlState)encControlState);
                                    bl2 = true;
                                }
                                if (this.mode == OpusMode.MODE_CELT_ONLY || this.first != 0 || this.silk_mode.allowBandwidthSwitch != 0) {
                                    int[] nArray;
                                    int[] nArray2;
                                    int[] nArray3 = new int[8];
                                    opusBandwidth2 = OpusBandwidth.OPUS_BANDWIDTH_FULLBAND;
                                    n26 = n21;
                                    if (this.mode != OpusMode.MODE_CELT_ONLY) {
                                        n26 = n26 * (45 + this.silk_mode.complexity) / 50;
                                        if (this.use_vbr == 0) {
                                            n26 -= 1000;
                                        }
                                    }
                                    if (this.channels == 2 && this.force_channels != 1) {
                                        nArray2 = OpusTables.stereo_voice_bandwidth_thresholds;
                                        nArray = OpusTables.stereo_music_bandwidth_thresholds;
                                    } else {
                                        nArray2 = OpusTables.mono_voice_bandwidth_thresholds;
                                        nArray = OpusTables.mono_music_bandwidth_thresholds;
                                    }
                                    for (n25 = 0; n25 < 8; ++n25) {
                                        nArray3[n25] = nArray[n25] + (n27 * n27 * (nArray2[n25] - nArray[n25]) >> 14);
                                    }
                                    do {
                                        n24 = nArray3[2 * (OpusBandwidthHelpers.GetOrdinal(opusBandwidth2) - OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND))];
                                        n23 = nArray3[2 * (OpusBandwidthHelpers.GetOrdinal(opusBandwidth2) - OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND)) + 1];
                                        if (this.first != 0) continue;
                                        if (OpusBandwidthHelpers.GetOrdinal(this.bandwidth) >= OpusBandwidthHelpers.GetOrdinal(opusBandwidth2)) {
                                            n24 -= n23;
                                            continue;
                                        }
                                        n24 += n23;
                                    } while (n26 < n24 && OpusBandwidthHelpers.GetOrdinal(opusBandwidth2 = OpusBandwidthHelpers.SUBTRACT(opusBandwidth2, 1)) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND));
                                    this.bandwidth = opusBandwidth2;
                                    if (this.first == 0 && this.mode != OpusMode.MODE_CELT_ONLY && this.silk_mode.inWBmodeWithoutVariableLP == 0 && OpusBandwidthHelpers.GetOrdinal(this.bandwidth) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND)) {
                                        this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND;
                                    }
                                }
                                if (OpusBandwidthHelpers.GetOrdinal(this.bandwidth) > OpusBandwidthHelpers.GetOrdinal(this.max_bandwidth)) {
                                    this.bandwidth = this.max_bandwidth;
                                }
                                if (this.user_bandwidth != OpusBandwidth.OPUS_BANDWIDTH_AUTO) {
                                    this.bandwidth = this.user_bandwidth;
                                }
                                if (this.mode != OpusMode.MODE_CELT_ONLY) {
                                    if (n36 < 15000) {
                                        this.bandwidth = OpusBandwidthHelpers.MIN(this.bandwidth, OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND);
                                    }
                                }
                                if (this.Fs <= 24000 && OpusBandwidthHelpers.GetOrdinal(this.bandwidth) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND)) {
                                    this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND;
                                }
                                if (this.Fs <= 16000 && OpusBandwidthHelpers.GetOrdinal(this.bandwidth) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND)) {
                                    this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND;
                                }
                                if (this.Fs <= 12000 && OpusBandwidthHelpers.GetOrdinal(this.bandwidth) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND)) {
                                    this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND;
                                }
                                if (this.Fs <= 8000 && OpusBandwidthHelpers.GetOrdinal(this.bandwidth) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND)) {
                                    this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND;
                                }
                                if (this.detected_bandwidth != OpusBandwidth.OPUS_BANDWIDTH_UNKNOWN && this.user_bandwidth == OpusBandwidth.OPUS_BANDWIDTH_AUTO) {
                                    OpusBandwidth opusBandwidth5 = n21 <= 18000 * this.stream_channels && this.mode == OpusMode.MODE_CELT_ONLY ? OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND : (n21 <= 24000 * this.stream_channels && this.mode == OpusMode.MODE_CELT_ONLY ? OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND : (n21 <= 30000 * this.stream_channels ? OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND : (n21 <= 44000 * this.stream_channels ? OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND : OpusBandwidth.OPUS_BANDWIDTH_FULLBAND)));
                                    this.detected_bandwidth = OpusBandwidthHelpers.MAX(this.detected_bandwidth, opusBandwidth5);
                                    this.bandwidth = OpusBandwidthHelpers.MIN(this.bandwidth, this.detected_bandwidth);
                                }
                                celtEncoder.SetLSBDepth(n5);
                                if (this.mode == OpusMode.MODE_CELT_ONLY && this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND) {
                                    this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND;
                                }
                                if (this.lfe != 0) {
                                    this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND;
                                }
                                if (n2 > this.Fs / 50 && (this.mode == OpusMode.MODE_CELT_ONLY || OpusBandwidthHelpers.GetOrdinal(this.bandwidth) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND))) {
                                    if (this.analysis.enabled && n34 != -1) {
                                        this.analysis.read_pos = n34;
                                        this.analysis.read_subframe = n33;
                                    }
                                    int n39 = n2 > this.Fs / 25 ? 3 : 2;
                                    int n40 = Inlines.IMIN((int)1276, (int)((n4 - 3) / n39));
                                    byte[] byArray2 = new byte[n39 * n40];
                                    OpusRepacketizer opusRepacketizer = new OpusRepacketizer();
                                    OpusMode opusMode = this.user_forced_mode;
                                    OpusBandwidth opusBandwidth6 = this.user_bandwidth;
                                    int n41 = this.force_channels;
                                    this.user_forced_mode = this.mode;
                                    this.user_bandwidth = this.bandwidth;
                                    this.force_channels = this.stream_channels;
                                    n26 = this.silk_mode.toMono;
                                    if (n26 != 0) {
                                        this.force_channels = 1;
                                    } else {
                                        this.prev_channels = this.stream_channels;
                                    }
                                    for (n25 = 0; n25 < n39; ++n25) {
                                        int n42;
                                        this.silk_mode.toMono = 0;
                                        if (bl && n25 == n39 - 1) {
                                            this.user_forced_mode = OpusMode.MODE_CELT_ONLY;
                                        }
                                        if ((n42 = this.opus_encode_native(sArray, n + n25 * (this.channels * this.Fs / 50), this.Fs / 50, byArray2, n25 * n40, n40, n5, null, 0, 0, n8, n9, n10, n11)) < 0) {
                                            return OpusError.OPUS_INTERNAL_ERROR;
                                        }
                                        n20 = opusRepacketizer.addPacket(byArray2, n25 * n40, n42);
                                        if (n20 >= 0) continue;
                                        return OpusError.OPUS_INTERNAL_ERROR;
                                    }
                                    int n43 = this.use_vbr != 0 ? n4 : Inlines.IMIN((int)(3 * this.bitrate_bps / (1200 / n39)), (int)n4);
                                    n20 = opusRepacketizer.opus_repacketizer_out_range_impl(0, n39, byArray, n3, n43, 0, this.use_vbr == 0 ? 1 : 0);
                                    if (n20 < 0) {
                                        return OpusError.OPUS_INTERNAL_ERROR;
                                    }
                                    this.user_forced_mode = opusMode;
                                    this.user_bandwidth = opusBandwidth6;
                                    this.force_channels = n41;
                                    this.silk_mode.toMono = n26;
                                    return n20;
                                }
                                opusBandwidth = this.bandwidth;
                                if (this.mode == OpusMode.MODE_SILK_ONLY && OpusBandwidthHelpers.GetOrdinal(opusBandwidth) > OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND)) {
                                    this.mode = OpusMode.MODE_HYBRID;
                                }
                                if (this.mode == OpusMode.MODE_HYBRID && OpusBandwidthHelpers.GetOrdinal(opusBandwidth) <= OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND)) {
                                    this.mode = OpusMode.MODE_SILK_ONLY;
                                }
                                int n44 = Inlines.IMIN((int)(n14 - n17), (int)(this.bitrate_bps * n2 / (this.Fs * 8))) - 1;
                                entropyCoder.enc_init(byArray, ++n3, n14 - 1);
                                sArray4 = new short[(n30 + n2) * this.channels];
                                System.arraycopy(this.delay_buffer, (this.encoder_buffer - n30) * this.channels, sArray4, 0, n30 * this.channels);
                                int n45 = this.mode == OpusMode.MODE_CELT_ONLY ? Inlines.silk_LSHIFT((int)Inlines.silk_lin2log((int)60), (int)8) : silkEncoder.state_Fxx[0].variable_HP_smth1_Q15;
                                this.variable_HP_smth2_Q15 = Inlines.silk_SMLAWB((int)this.variable_HP_smth2_Q15, (int)(n45 - this.variable_HP_smth2_Q15), (int)983);
                                int n46 = Inlines.silk_log2lin((int)Inlines.silk_RSHIFT((int)this.variable_HP_smth2_Q15, (int)8));
                                if (this.application == OpusApplication.OPUS_APPLICATION_VOIP) {
                                    CodecHelpers.hp_cutoff((short[])sArray, (int)n, (int)n46, (short[])sArray4, (int)(n30 * this.channels), (int[])this.hp_mem, (int)n2, (int)this.channels, (int)this.Fs);
                                } else {
                                    CodecHelpers.dc_reject((short[])sArray, (int)n, (int)3, (short[])sArray4, (int)(n30 * this.channels), (int[])this.hp_mem, (int)n2, (int)this.channels, (int)this.Fs);
                                }
                                n22 = Short.MAX_VALUE;
                                if (this.mode != OpusMode.MODE_CELT_ONLY) {
                                    short[] sArray5 = new short[this.channels * n2];
                                    int n47 = 8 * n44 * n29;
                                    if (this.mode == OpusMode.MODE_HYBRID) {
                                        this.silk_mode.bitRate = this.stream_channels * (5000 + (this.Fs == 100 * n2 ? 1000 : 0));
                                        this.silk_mode.bitRate = opusBandwidth == OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND ? (this.silk_mode.bitRate += (n47 - this.silk_mode.bitRate) * 2 / 3) : (this.silk_mode.bitRate += (n47 - this.silk_mode.bitRate) * 3 / 5);
                                        if (this.silk_mode.bitRate > n47 * 4 / 5) {
                                            this.silk_mode.bitRate = n47 * 4 / 5;
                                        }
                                        if (this.energy_masking == null) {
                                            int n48 = n47 - this.silk_mode.bitRate;
                                            int n49 = opusBandwidth == OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND ? 3000 : 3600;
                                            n22 = Inlines.SHL32((int)n48, (int)9) / Inlines.SHR32((int)(n48 + this.stream_channels * n49), (int)6);
                                            n22 = n22 < 28086 ? n22 + 4681 : Short.MAX_VALUE;
                                        }
                                    } else {
                                        this.silk_mode.bitRate = n47;
                                    }
                                    if (this.energy_masking != null && this.use_vbr != 0 && this.lfe == 0) {
                                        int n50 = 0;
                                        int n51 = 17;
                                        int n52 = 16000;
                                        if (this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND) {
                                            n51 = 13;
                                            n52 = 8000;
                                        } else if (this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND) {
                                            n51 = 15;
                                            n52 = 12000;
                                        }
                                        for (n23 = 0; n23 < this.channels; ++n23) {
                                            for (n25 = 0; n25 < n51; ++n25) {
                                                int n53 = Inlines.MAX16((int)Inlines.MIN16((int)this.energy_masking[21 * n23 + n25], (int)512), (int)-2048);
                                                if (n53 > 0) {
                                                    n53 = Inlines.HALF16((int)n53);
                                                }
                                                n50 += n53;
                                            }
                                        }
                                        n26 = n50 / n51 * this.channels;
                                        n24 = Inlines.PSHR32((int)Inlines.MULT16_16((int)n52, (int)(n26 += 205)), (int)10);
                                        n24 = Inlines.MAX32((int)n24, (int)(-2 * this.silk_mode.bitRate / 3));
                                        this.silk_mode.bitRate = this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND || this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_FULLBAND ? (this.silk_mode.bitRate += 3 * n24 / 5) : (this.silk_mode.bitRate += n24);
                                        n44 += n24 * n2 / (8 * this.Fs);
                                    }
                                    this.silk_mode.payloadSize_ms = 1000 * n2 / this.Fs;
                                    this.silk_mode.nChannelsAPI = this.channels;
                                    this.silk_mode.nChannelsInternal = this.stream_channels;
                                    if (opusBandwidth == OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND) {
                                        this.silk_mode.desiredInternalSampleRate = 8000;
                                    } else if (opusBandwidth == OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND) {
                                        this.silk_mode.desiredInternalSampleRate = 12000;
                                    } else {
                                        Inlines.OpusAssert((this.mode == OpusMode.MODE_HYBRID || opusBandwidth == OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND ? 1 : 0) != 0);
                                        this.silk_mode.desiredInternalSampleRate = 16000;
                                    }
                                    this.silk_mode.minInternalSampleRate = this.mode == OpusMode.MODE_HYBRID ? 16000 : 8000;
                                    if (this.mode == OpusMode.MODE_SILK_ONLY) {
                                        int n54 = n36;
                                        this.silk_mode.maxInternalSampleRate = 16000;
                                        if (n29 > 50) {
                                            n54 = n54 * 2 / 3;
                                        }
                                        if (n54 < 13000) {
                                            this.silk_mode.maxInternalSampleRate = 12000;
                                            this.silk_mode.desiredInternalSampleRate = Inlines.IMIN((int)12000, (int)this.silk_mode.desiredInternalSampleRate);
                                        }
                                        if (n54 < 9600) {
                                            this.silk_mode.maxInternalSampleRate = 8000;
                                            this.silk_mode.desiredInternalSampleRate = Inlines.IMIN((int)8000, (int)this.silk_mode.desiredInternalSampleRate);
                                        }
                                    } else {
                                        this.silk_mode.maxInternalSampleRate = 16000;
                                    }
                                    this.silk_mode.useCBR = this.use_vbr == 0 ? 1 : 0;
                                    int n55 = Inlines.IMIN((int)1275, (int)(n14 - 1 - n17));
                                    this.silk_mode.maxBits = n55 * 8;
                                    if (this.mode == OpusMode.MODE_HYBRID) {
                                        this.silk_mode.maxBits = this.silk_mode.maxBits * 9 / 10;
                                    }
                                    if (this.silk_mode.useCBR != 0) {
                                        this.silk_mode.maxBits = this.silk_mode.bitRate * n2 / (this.Fs * 8) * 8;
                                        this.silk_mode.bitRate = Inlines.IMAX((int)1, (int)(this.silk_mode.bitRate - 2000));
                                    }
                                    if (bl2) {
                                        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
                                        n26 = this.channels * (this.encoder_buffer - this.delay_compensation - this.Fs / 400);
                                        CodecHelpers.gain_fade((short[])this.delay_buffer, (int)n26, (int)0, (int)Short.MAX_VALUE, (int)celtMode.overlap, (int)(this.Fs / 400), (int)this.channels, (int[])celtMode.window, (int)this.Fs);
                                        Arrays.MemSet((short[])this.delay_buffer, (short)0, (int)n26);
                                        System.arraycopy(this.delay_buffer, 0, sArray5, 0, this.encoder_buffer * this.channels);
                                        EncodeAPI.silk_Encode((SilkEncoder)silkEncoder, (EncControlState)this.silk_mode, (short[])sArray5, (int)this.encoder_buffer, null, (BoxedValueInt)boxedValueInt, (int)1);
                                    }
                                    System.arraycopy(sArray4, n30 * this.channels, sArray5, 0, n2 * this.channels);
                                    opusBandwidth2 = new BoxedValueInt(n55);
                                    n20 = EncodeAPI.silk_Encode((SilkEncoder)silkEncoder, (EncControlState)this.silk_mode, (short[])sArray5, (int)n2, (EntropyCoder)entropyCoder, (BoxedValueInt)opusBandwidth2, (int)0);
                                    n55 = ((BoxedValueInt)opusBandwidth2).Val;
                                    if (n20 != 0) {
                                        return OpusError.OPUS_INTERNAL_ERROR;
                                    }
                                    if (n55 == 0) {
                                        this.rangeFinal = 0;
                                        byArray[n3 - 1] = CodecHelpers.gen_toc((OpusMode)this.mode, (int)(this.Fs / n2), (OpusBandwidth)opusBandwidth, (int)this.stream_channels);
                                        return 1;
                                    }
                                    if (this.mode == OpusMode.MODE_SILK_ONLY) {
                                        if (this.silk_mode.internalSampleRate == 8000) {
                                            opusBandwidth = OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND;
                                        } else if (this.silk_mode.internalSampleRate == 12000) {
                                            opusBandwidth = OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND;
                                        } else if (this.silk_mode.internalSampleRate == 16000) {
                                            opusBandwidth = OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND;
                                        }
                                    } else {
                                        Inlines.OpusAssert((this.silk_mode.internalSampleRate == 16000 ? 1 : 0) != 0);
                                    }
                                    this.silk_mode.opusCanSwitch = this.silk_mode.switchReady;
                                    if (this.silk_mode.opusCanSwitch != 0) {
                                        n18 = 1;
                                        n16 = 0;
                                        this.silk_bw_switch = 1;
                                    }
                                }
                                n13 = 21;
                                switch (opusBandwidth) {
                                    case OPUS_BANDWIDTH_NARROWBAND: {
                                        n13 = 13;
                                        break;
                                    }
                                    case OPUS_BANDWIDTH_MEDIUMBAND: 
                                    case OPUS_BANDWIDTH_WIDEBAND: {
                                        n13 = 17;
                                        break;
                                    }
                                    case OPUS_BANDWIDTH_SUPERWIDEBAND: {
                                        n13 = 19;
                                        break;
                                    }
                                    case OPUS_BANDWIDTH_FULLBAND: {
                                        n13 = 21;
                                    }
                                }
                                celtEncoder.SetEndBand(n13);
                                celtEncoder.SetChannels(this.stream_channels);
                                celtEncoder.SetBitrate(-1);
                                if (this.mode != OpusMode.MODE_SILK_ONLY) {
                                    n13 = 2;
                                    celtEncoder.SetVBR(false);
                                    if (this.silk_mode.reducedDependency != 0) {
                                        n13 = 0;
                                    }
                                    celtEncoder.SetPrediction(n13);
                                    if (this.mode == OpusMode.MODE_HYBRID) {
                                        int n56 = entropyCoder.tell() + 7 >> 3;
                                        if (n18 != 0) {
                                            n56 += this.mode == OpusMode.MODE_HYBRID ? 3 : 1;
                                        }
                                        n12 = this.use_vbr != 0 ? n56 + n44 - this.silk_mode.bitRate * n2 / (8 * this.Fs) : (n56 > n44 ? n56 : n44);
                                    } else if (this.use_vbr != 0) {
                                        int n57 = 0;
                                        if (this.analysis.enabled && this.variable_duration == OpusFramesize.OPUS_FRAMESIZE_VARIABLE && n2 != this.Fs / 50) {
                                            n57 = (60 * this.stream_channels + 40) * (this.Fs / n2 - 50);
                                            if (analysisInfo.valid != 0) {
                                                n57 = (int)((float)n57 * (1.0f + 0.5f * analysisInfo.tonality));
                                            }
                                        }
                                        celtEncoder.SetVBR(true);
                                        celtEncoder.SetVBRConstraint(this.vbr_constraint != 0);
                                        celtEncoder.SetBitrate(this.bitrate_bps + n57);
                                        n12 = n14 - 1 - n17;
                                    } else {
                                        n12 = n44;
                                    }
                                } else {
                                    n12 = 0;
                                }
                                sArray3 = new short[this.channels * this.Fs / 400];
                                if (this.mode != OpusMode.MODE_SILK_ONLY && this.mode != this.prev_mode && this.prev_mode != OpusMode.MODE_AUTO && this.prev_mode != OpusMode.MODE_UNKNOWN) {
                                    System.arraycopy(this.delay_buffer, (this.encoder_buffer - n30 - this.Fs / 400) * this.channels, sArray3, 0, this.channels * this.Fs / 400);
                                }
                                if (this.channels * (this.encoder_buffer - (n2 + n30)) > 0) {
                                    Arrays.MemMove((short[])this.delay_buffer, (int)(this.channels * n2), (int)0, (int)(this.channels * (this.encoder_buffer - n2 - n30)));
                                    System.arraycopy(sArray4, 0, this.delay_buffer, this.channels * (this.encoder_buffer - n2 - n30), (n2 + n30) * this.channels);
                                } else {
                                    System.arraycopy(sArray4, (n2 + n30 - this.encoder_buffer) * this.channels, this.delay_buffer, 0, this.encoder_buffer * this.channels);
                                }
                                if (this.prev_HB_gain < Short.MAX_VALUE) break block183;
                                if (n22 >= Short.MAX_VALUE) break block184;
                            }
                            CodecHelpers.gain_fade((short[])sArray4, (int)0, (int)this.prev_HB_gain, (int)n22, (int)celtMode.overlap, (int)n2, (int)this.channels, (int[])celtMode.window, (int)this.Fs);
                        }
                        this.prev_HB_gain = n22;
                        if (this.mode != OpusMode.MODE_HYBRID) break block185;
                        if (this.stream_channels != 1) break block186;
                    }
                    this.silk_mode.stereoWidth_Q14 = Inlines.IMIN((int)16384, (int)(2 * Inlines.IMAX((int)0, (int)(n21 - 30000))));
                }
                if (this.energy_masking != null || this.channels != 2) break block187;
                if (this.hybrid_stereo_width_Q14 < 16384) break block188;
                if (this.silk_mode.stereoWidth_Q14 >= 16384) break block187;
            }
            n13 = this.hybrid_stereo_width_Q14;
            int n58 = this.silk_mode.stereoWidth_Q14;
            n13 = n13 == 16384 ? Short.MAX_VALUE : Inlines.SHL16((int)n13, (int)1);
            n58 = n58 == 16384 ? Short.MAX_VALUE : Inlines.SHL16((int)n58, (int)1);
            CodecHelpers.stereo_fade((short[])sArray4, (int)n13, (int)n58, (int)celtMode.overlap, (int)n2, (int)this.channels, (int[])celtMode.window, (int)this.Fs);
            this.hybrid_stereo_width_Q14 = (short)this.silk_mode.stereoWidth_Q14;
        }
        if (this.mode != OpusMode.MODE_CELT_ONLY && entropyCoder.tell() + 17 + 20 * (this.mode == OpusMode.MODE_HYBRID ? 1 : 0) <= 8 * (n14 - 1)) {
            if (this.mode == OpusMode.MODE_HYBRID && (n18 != 0 || entropyCoder.tell() + 37 <= 8 * n12)) {
                entropyCoder.enc_bit_logp(n18, 12);
            }
            if (n18 != 0) {
                entropyCoder.enc_bit_logp(n16, 1);
                n13 = this.mode == OpusMode.MODE_HYBRID ? n14 - 1 - n12 : n14 - 1 - (entropyCoder.tell() + 7 >> 3);
                n17 = Inlines.IMIN((int)n13, (int)(this.bitrate_bps / 1600));
                n17 = Inlines.IMIN((int)257, (int)Inlines.IMAX((int)2, (int)n17));
                if (this.mode == OpusMode.MODE_HYBRID) {
                    entropyCoder.enc_uint((long)(n17 - 2), 256L);
                }
            }
        } else {
            n18 = 0;
        }
        if (n18 == 0) {
            this.silk_bw_switch = 0;
            n17 = 0;
        }
        if (this.mode != OpusMode.MODE_CELT_ONLY) {
            n19 = 17;
        }
        if (this.mode == OpusMode.MODE_SILK_ONLY) {
            n20 = entropyCoder.tell() + 7 >> 3;
            entropyCoder.enc_done();
            n12 = n20;
        } else {
            n12 = Inlines.IMIN((int)(n14 - 1 - n17), (int)n12);
            entropyCoder.enc_shrink(n12);
        }
        if (this.analysis.enabled && n18 != 0 || this.mode != OpusMode.MODE_SILK_ONLY) {
            analysisInfo.enabled = this.analysis.enabled;
            celtEncoder.SetAnalysis(analysisInfo);
        }
        if (n18 != 0 && n16 != 0) {
            celtEncoder.SetStartBand(0);
            celtEncoder.SetVBR(false);
            n13 = celtEncoder.celt_encode_with_ec(sArray4, 0, this.Fs / 200, byArray, n3 + n12, n17, null);
            if (n13 < 0) {
                return OpusError.OPUS_INTERNAL_ERROR;
            }
            n15 = celtEncoder.GetFinalRange();
            celtEncoder.ResetState();
        }
        celtEncoder.SetStartBand(n19);
        if (this.mode != OpusMode.MODE_SILK_ONLY) {
            if (this.mode != this.prev_mode && this.prev_mode != OpusMode.MODE_AUTO && this.prev_mode != OpusMode.MODE_UNKNOWN) {
                byte[] byArray3 = new byte[2];
                celtEncoder.ResetState();
                celtEncoder.celt_encode_with_ec(sArray3, 0, this.Fs / 400, byArray3, 0, 2, null);
                celtEncoder.SetPrediction(0);
            }
            if (entropyCoder.tell() <= 8 * n12 && (n20 = celtEncoder.celt_encode_with_ec(sArray4, 0, n2, null, 0, n12, entropyCoder)) < 0) {
                return OpusError.OPUS_INTERNAL_ERROR;
            }
        }
        if (n18 != 0 && n16 == 0) {
            byte[] byArray4 = new byte[2];
            int n59 = this.Fs / 200;
            int n60 = this.Fs / 400;
            celtEncoder.ResetState();
            celtEncoder.SetStartBand(0);
            celtEncoder.SetPrediction(0);
            celtEncoder.celt_encode_with_ec(sArray4, this.channels * (n2 - n59 - n60), n60, byArray4, 0, 2, null);
            int n61 = celtEncoder.celt_encode_with_ec(sArray4, this.channels * (n2 - n59), n59, byArray, n3 + n12, n17, null);
            if (n61 < 0) {
                return OpusError.OPUS_INTERNAL_ERROR;
            }
            n15 = celtEncoder.GetFinalRange();
        }
        byArray[--n3] = CodecHelpers.gen_toc((OpusMode)this.mode, (int)(this.Fs / n2), (OpusBandwidth)opusBandwidth, (int)this.stream_channels);
        this.rangeFinal = (int)entropyCoder.rng ^ n15;
        this.prev_mode = bl ? OpusMode.MODE_CELT_ONLY : this.mode;
        this.prev_channels = this.stream_channels;
        this.prev_framesize = n2;
        this.first = 0;
        if (entropyCoder.tell() > (n14 - 1) * 8) {
            if (n14 < 2) {
                return OpusError.OPUS_BUFFER_TOO_SMALL;
            }
            byArray[n3 + 1] = 0;
            n20 = 1;
            this.rangeFinal = 0;
        } else if (this.mode == OpusMode.MODE_SILK_ONLY && n18 == 0) {
            while (n20 > 2 && byArray[n3 + n20] == 0) {
                --n20;
            }
        }
        n20 += 1 + n17;
        if (this.use_vbr == 0) {
            if (OpusRepacketizer.padPacket(byArray, n3, n20, n14) != OpusError.OPUS_OK) {
                return OpusError.OPUS_INTERNAL_ERROR;
            }
            n20 = n14;
        }
        return n20;
    }

    public int getFinalRange() {
        return this.rangeFinal;
    }

    public void setApplication(OpusApplication opusApplication) {
        if (this.first == 0 && this.application != opusApplication) {
            throw new IllegalArgumentException("Application cannot be changed after encoding has started");
        }
        this.application = opusApplication;
    }

    public int getForceChannels() {
        return this.force_channels;
    }

    public void setForceChannels(int n) {
        block5: {
            block4: {
                if (n < 1) break block4;
                if (n <= this.channels) break block5;
            }
            if (n != -1000) {
                throw new IllegalArgumentException("Force channels must be <= num. of channels");
            }
        }
        this.force_channels = n;
    }

    public OpusBandwidth getMaxBandwidth() {
        return this.max_bandwidth;
    }

    public void setMaxBandwidth(OpusBandwidth opusBandwidth) {
        this.max_bandwidth = opusBandwidth;
        this.silk_mode.maxInternalSampleRate = this.max_bandwidth == OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND ? 8000 : (this.max_bandwidth == OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND ? 12000 : 16000);
    }

    public int getComplexity() {
        return this.silk_mode.complexity;
    }

    public void setUseDTX(boolean bl) {
        this.silk_mode.useDTX = bl ? 1 : 0;
    }

    public void setUseVBR(boolean bl) {
        this.use_vbr = bl ? 1 : 0;
        this.silk_mode.useCBR = bl ? 0 : 1;
    }

    public void setIsLFE(boolean bl) {
        this.lfe = bl ? 1 : 0;
        this.Celt_Encoder.SetLFE(bl ? 1 : 0);
    }

    public boolean getUseVBR() {
        return this.use_vbr != 0;
    }

    public void setBitrate(int n) {
        if (n != -1000 && n != -1) {
            if (n <= 0) {
                throw new IllegalArgumentException("Bitrate must be positive");
            }
            if (n <= 500) {
                n = 500;
            } else if (n > 300000 * this.channels) {
                n = 300000 * this.channels;
            }
        }
        this.user_bitrate_bps = n;
    }

    public boolean getIsLFE() {
        return this.lfe != 0;
    }

    public boolean getUseDTX() {
        return this.silk_mode.useDTX != 0;
    }
}

