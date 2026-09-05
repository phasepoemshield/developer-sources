/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.Bands
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.CeltCommon
 *  de.maxhenkel.voicechat.concentus.CeltMode
 *  de.maxhenkel.voicechat.concentus.ChannelLayout
 *  de.maxhenkel.voicechat.concentus.CodecHelpers
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Bands;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltCommon;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.ChannelLayout;
import de.maxhenkel.voicechat.concentus.CodecHelpers;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.MDCT;
import de.maxhenkel.voicechat.concentus.OpusApplication;
import de.maxhenkel.voicechat.concentus.OpusBandwidth;
import de.maxhenkel.voicechat.concentus.OpusEncoder;
import de.maxhenkel.voicechat.concentus.OpusError;
import de.maxhenkel.voicechat.concentus.OpusException;
import de.maxhenkel.voicechat.concentus.OpusFramesize;
import de.maxhenkel.voicechat.concentus.OpusMode;
import de.maxhenkel.voicechat.concentus.OpusMultistream;
import de.maxhenkel.voicechat.concentus.OpusRepacketizer;
import de.maxhenkel.voicechat.concentus.OpusSignal;
import de.maxhenkel.voicechat.concentus.QuantizeBands;
import de.maxhenkel.voicechat.concentus.VorbisLayout;

public class OpusMSEncoder {
    final ChannelLayout layout = new ChannelLayout();
    int lfe_stream = 0;
    OpusApplication application = OpusApplication.OPUS_APPLICATION_AUDIO;
    OpusFramesize variable_duration = OpusFramesize.OPUS_FRAMESIZE_UNKNOWN;
    int surround = 0;
    int bitrate_bps = 0;
    final float[] subframe_mem = new float[3];
    OpusEncoder[] encoders = null;
    int[] window_mem = null;
    int[] preemph_mem = null;
    private static final int[] diff_table;
    private final int MS_FRAME_TMP;

    private OpusMSEncoder(int n, int n2) {
        int n3;
        this.MS_FRAME_TMP = 3832;
        if (n < 1 || n2 > n || n2 < 0) {
            throw new IllegalArgumentException("Invalid channel count in MS encoder");
        }
        this.encoders = new OpusEncoder[n];
        for (n3 = 0; n3 < n; ++n3) {
            this.encoders[n3] = new OpusEncoder();
        }
        n3 = n2 * 2 + (n - n2);
        this.window_mem = new int[n3 * 120];
        this.preemph_mem = new int[n3];
    }

    static {
        int[] nArray = new int[17];
        nArray[0] = 512;
        nArray[1] = 300;
        nArray[2] = 165;
        nArray[3] = 87;
        nArray[4] = 45;
        nArray[5] = 23;
        nArray[6] = 11;
        nArray[7] = 6;
        nArray[8] = 3;
        nArray[9] = 0;
        nArray[10] = 0;
        nArray[11] = 0;
        nArray[12] = 0;
        nArray[13] = 0;
        nArray[14] = 0;
        nArray[15] = 0;
        nArray[16] = 0;
        diff_table = nArray;
    }

    public void resetState() {
        this.subframe_mem[2] = 0.0f;
        this.subframe_mem[1] = 0.0f;
        this.subframe_mem[0] = 0.0f;
        if (this.surround != 0) {
            Arrays.MemSet((int[])this.preemph_mem, (int)0, (int)this.layout.nb_channels);
            Arrays.MemSet((int[])this.window_mem, (int)0, (int)(this.layout.nb_channels * 120));
        }
        int n = 0;
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            OpusEncoder opusEncoder = this.encoders[n++];
            opusEncoder.resetState();
        }
    }

    public void setPacketLossPercent(int n) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setPacketLossPercent(n);
        }
    }

    static void opus_copy_channel_in_short(short[] sArray, int n, int n2, short[] sArray2, int n3, int n4, int n5, int n6) {
        for (int i = 0; i < n6; ++i) {
            sArray[n + i * n2] = sArray2[i * n4 + n5 + n3];
        }
    }

    public OpusFramesize getExpertFrameDuration() {
        return this.variable_duration;
    }

    public OpusEncoder getMultistreamEncoderState(int n) {
        if (n >= this.layout.nb_streams) {
            throw new IllegalArgumentException("Requested stream doesn't exist");
        }
        return this.encoders[n];
    }

    public boolean getUseConstrainedVBR() {
        return this.encoders[0].getUseConstrainedVBR();
    }

    public boolean getPredictionDisabled() {
        return this.encoders[0].getPredictionDisabled();
    }

    public int getPacketLossPercent() {
        return this.encoders[0].getPacketLossPercent();
    }

    public void setExpertFrameDuration(OpusFramesize opusFramesize) {
        this.variable_duration = opusFramesize;
    }

    static int validate_encoder_layout(ChannelLayout channelLayout) {
        for (int i = 0; i < channelLayout.nb_streams; ++i) {
            if (i < channelLayout.nb_coupled_streams) {
                if (OpusMultistream.get_left_channel(channelLayout, i, -1) == -1) {
                    return 0;
                }
                if (OpusMultistream.get_right_channel(channelLayout, i, -1) != -1) continue;
                return 0;
            }
            if (OpusMultistream.get_mono_channel(channelLayout, i, -1) != -1) continue;
            return 0;
        }
        return 1;
    }

    int surround_rate_allocation(int[] nArray, int n) {
        int n2;
        int n3 = 0;
        OpusEncoder opusEncoder = this.encoders[0];
        int n4 = opusEncoder.getSampleRate();
        int n5 = this.bitrate_bps > this.layout.nb_channels * 40000 ? 20000 : this.bitrate_bps / this.layout.nb_channels / 2;
        n5 += 60 * (n4 / n - 50);
        int n6 = 3500 + 60 * (n4 / n - 50);
        int n7 = 512;
        int n8 = 32;
        if (this.bitrate_bps == -1000) {
            n2 = n4 + 60 * n4 / n;
        } else if (this.bitrate_bps == -1) {
            n2 = 300000;
        } else {
            int n9 = this.lfe_stream != -1 ? 1 : 0;
            int n10 = this.layout.nb_coupled_streams;
            int n11 = this.layout.nb_streams - n10 - n9;
            int n12 = (n11 << 8) + n7 * n10 + n9 * n8;
            n2 = 256 * (this.bitrate_bps - n6 * n9 - n5 * (n10 + n11)) / n12;
        }
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            nArray[i] = i < this.layout.nb_coupled_streams ? n5 + (n2 * n7 >> 8) : (i != this.lfe_stream ? n5 + n2 : n6 + (n2 * n8 >> 8));
            nArray[i] = Inlines.IMAX((int)nArray[i], (int)500);
            n3 += nArray[i];
        }
        return n3;
    }

    public void setUseConstrainedVBR(boolean bl) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setUseConstrainedVBR(bl);
        }
    }

    public void setPredictionDisabled(boolean bl) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setPredictionDisabled(bl);
        }
    }

    public static OpusMSEncoder Create(int n, int n2, int n3, int n4, short[] sArray, OpusApplication opusApplication) throws OpusException {
        block6: {
            block5: {
                if (n2 > 255 || n2 < 1 || n4 > n3 || n3 < 1 || n4 < 0) break block5;
                if (n3 <= 255 - n4) break block6;
            }
            throw new IllegalArgumentException("Invalid channel / stream configuration");
        }
        OpusMSEncoder opusMSEncoder = new OpusMSEncoder(n3, n4);
        int n5 = opusMSEncoder.opus_multistream_encoder_init(n, n2, n3, n4, sArray, opusApplication, 0);
        if (n5 != OpusError.OPUS_OK) {
            if (n5 == OpusError.OPUS_BAD_ARG) {
                throw new IllegalArgumentException("OPUS_BAD_ARG when creating MS encoder");
            }
            throw new OpusException("Could not create MS encoder", n5);
        }
        return opusMSEncoder;
    }

    public int getSampleRate() {
        return this.encoders[0].getSampleRate();
    }

    public void setBandwidth(OpusBandwidth opusBandwidth) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setBandwidth(opusBandwidth);
        }
    }

    public OpusBandwidth getBandwidth() {
        return this.encoders[0].getBandwidth();
    }

    public OpusApplication getApplication() {
        return this.encoders[0].getApplication();
    }

    static void channel_pos(int n, int[] nArray) {
        if (n == 4) {
            nArray[0] = 1;
            nArray[1] = 3;
            nArray[2] = 1;
            nArray[3] = 3;
        } else if (n == 3 || n == 5 || n == 6) {
            nArray[0] = 1;
            nArray[1] = 2;
            nArray[2] = 3;
            nArray[3] = 1;
            nArray[4] = 3;
            nArray[5] = 0;
        } else if (n == 7) {
            nArray[0] = 1;
            nArray[1] = 2;
            nArray[2] = 3;
            nArray[3] = 1;
            nArray[4] = 3;
            nArray[5] = 2;
            nArray[6] = 0;
        } else if (n == 8) {
            nArray[0] = 1;
            nArray[1] = 2;
            nArray[2] = 3;
            nArray[3] = 1;
            nArray[4] = 3;
            nArray[5] = 1;
            nArray[6] = 3;
            nArray[7] = 0;
        }
    }

    static void surround_analysis(CeltMode celtMode, short[] sArray, int n, int[] nArray, int[] nArray2, int[] nArray3, int n2, int n3, int n4, int n5) {
        Object object;
        int n6;
        int n7;
        int n8;
        int[] nArray4 = new int[]{0, 0, 0, 0, 0, 0, 0, 0};
        int[][] nArray5 = Arrays.InitTwoDimensionalArrayInt((int)1, (int)21);
        int[][] nArray6 = Arrays.InitTwoDimensionalArrayInt((int)3, (int)21);
        int n9 = CeltCommon.resampling_factor((int)n5);
        int n10 = n2 * n9;
        for (n8 = 0; n8 < celtMode.maxLM && celtMode.shortMdctSize << n8 != n10; ++n8) {
        }
        int[] nArray7 = new int[n10 + n3];
        short[] sArray2 = new short[n2];
        int[][] nArray8 = Arrays.InitTwoDimensionalArrayInt((int)1, (int)n10);
        OpusMSEncoder.channel_pos(n4, nArray4);
        for (n7 = 0; n7 < 3; ++n7) {
            for (n6 = 0; n6 < 21; ++n6) {
                nArray6[n7][n6] = -28672;
            }
        }
        for (n7 = 0; n7 < n4; ++n7) {
            System.arraycopy(nArray2, n7 * n3, nArray7, 0, n3);
            OpusMSEncoder.opus_copy_channel_in_short(sArray2, 0, 1, sArray, n, n4, n7, n2);
            object = new BoxedValueInt(nArray3[n7]);
            CeltCommon.celt_preemphasis((short[])sArray2, (int[])nArray7, (int)n3, (int)n10, (int)1, (int)n9, (int[])celtMode.preemph, (BoxedValueInt)object, (int)0);
            nArray3[n7] = object.Val;
            MDCT.clt_mdct_forward(celtMode.mdct, nArray7, 0, nArray8[0], 0, celtMode.window, n3, celtMode.maxLM - n8, 1);
            if (n9 != 1) {
                int n11 = n2;
                n6 = 0;
                while (n6 < n11) {
                    int[] nArray9 = nArray8[0];
                    int n12 = n6++;
                    nArray9[n12] = nArray9[n12] * n9;
                }
                while (n6 < n10) {
                    nArray8[0][n6] = 0;
                    ++n6;
                }
            }
            Bands.compute_band_energies((CeltMode)celtMode, (int[][])nArray8, (int[][])nArray5, (int)21, (int)1, (int)n8);
            QuantizeBands.amp2Log2(celtMode, 21, 21, nArray5[0], nArray, 21 * n7, 1);
            for (n6 = 1; n6 < 21; ++n6) {
                nArray[21 * n7 + n6] = Inlines.MAX16((int)nArray[21 * n7 + n6], (int)(nArray[21 * n7 + n6 - 1] - 1024));
            }
            for (n6 = 19; n6 >= 0; --n6) {
                nArray[21 * n7 + n6] = Inlines.MAX16((int)nArray[21 * n7 + n6], (int)(nArray[21 * n7 + n6 + 1] - 2048));
            }
            if (nArray4[n7] == 1) {
                for (n6 = 0; n6 < 21; ++n6) {
                    nArray6[0][n6] = OpusMSEncoder.logSum(nArray6[0][n6], nArray[21 * n7 + n6]);
                }
            } else if (nArray4[n7] == 3) {
                for (n6 = 0; n6 < 21; ++n6) {
                    nArray6[2][n6] = OpusMSEncoder.logSum(nArray6[2][n6], nArray[21 * n7 + n6]);
                }
            } else if (nArray4[n7] == 2) {
                for (n6 = 0; n6 < 21; ++n6) {
                    nArray6[0][n6] = OpusMSEncoder.logSum(nArray6[0][n6], nArray[21 * n7 + n6] - 512);
                    nArray6[2][n6] = OpusMSEncoder.logSum(nArray6[2][n6], nArray[21 * n7 + n6] - 512);
                }
            }
            System.arraycopy(nArray7, n10, nArray2, n7 * n3, n3);
        }
        for (n6 = 0; n6 < 21; ++n6) {
            nArray6[1][n6] = Inlines.MIN32((int)nArray6[0][n6], (int)nArray6[2][n6]);
        }
        int n13 = Inlines.HALF16((int)Inlines.celt_log2((int)(32768 / (n4 - 1))));
        for (n7 = 0; n7 < 3; ++n7) {
            n6 = 0;
            while (n6 < 21) {
                int[] nArray10 = nArray6[n7];
                int n14 = n6++;
                nArray10[n14] = nArray10[n14] + n13;
            }
        }
        for (n7 = 0; n7 < n4; ++n7) {
            if (nArray4[n7] != 0) {
                object = nArray6[nArray4[n7] - 1];
                for (n6 = 0; n6 < 21; ++n6) {
                    nArray[21 * n7 + n6] = nArray[21 * n7 + n6] - object[n6];
                }
                continue;
            }
            for (n6 = 0; n6 < 21; ++n6) {
                nArray[21 * n7 + n6] = 0;
            }
        }
    }

    public int encodeMultistream(short[] sArray, int n, int n2, byte[] byArray, int n3, int n4) {
        return this.opus_multistream_encode_native(sArray, n, n2, byArray, n3, n4, 16, 0);
    }

    public static OpusMSEncoder CreateSurround(int n, int n2, int n3, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, short[] sArray, OpusApplication opusApplication) throws OpusException {
        if (n2 > 255 || n2 < 1 || opusApplication == OpusApplication.OPUS_APPLICATION_UNIMPLEMENTED) {
            throw new IllegalArgumentException("Invalid channel count or application");
        }
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        OpusMSEncoder.GetStreamCount(n2, n3, boxedValueInt3, boxedValueInt4);
        OpusMSEncoder opusMSEncoder = new OpusMSEncoder(boxedValueInt3.Val, boxedValueInt4.Val);
        int n4 = opusMSEncoder.opus_multistream_surround_encoder_init(n, n2, n3, boxedValueInt, boxedValueInt2, sArray, opusApplication);
        if (n4 != OpusError.OPUS_OK) {
            if (n4 == OpusError.OPUS_BAD_ARG) {
                throw new IllegalArgumentException("Bad argument passed to CreateSurround");
            }
            throw new OpusException("Could not create multistream encoder", n4);
        }
        return opusMSEncoder;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static void GetStreamCount(int n, int n2, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2) {
        if (n2 == 0) {
            if (n == 1) {
                boxedValueInt.Val = 1;
                boxedValueInt2.Val = 0;
                return;
            } else {
                if (n != 2) throw new IllegalArgumentException("More than 2 channels requires custom mappings");
                boxedValueInt.Val = 1;
                boxedValueInt2.Val = 1;
            }
            return;
        } else if (n2 == 1 && n <= 8 && n >= 1) {
            boxedValueInt.Val = VorbisLayout.vorbis_mappings[n - 1].nb_streams;
            boxedValueInt2.Val = VorbisLayout.vorbis_mappings[n - 1].nb_coupled_streams;
            return;
        } else {
            if (n2 != 255) throw new IllegalArgumentException("Invalid mapping family");
            boxedValueInt.Val = n;
            boxedValueInt2.Val = 0;
        }
    }

    public int getBitrate() {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            OpusEncoder opusEncoder = this.encoders[n2++];
            n += opusEncoder.getBitrate();
        }
        return n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    int opus_multistream_surround_encoder_init(int n, int n2, int n3, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, short[] sArray, OpusApplication opusApplication) {
        boxedValueInt.Val = 0;
        boxedValueInt2.Val = 0;
        if (n2 > 255 || n2 < 1) {
            return OpusError.OPUS_BAD_ARG;
        }
        this.lfe_stream = -1;
        if (n3 == 0) {
            if (n2 == 1) {
                boxedValueInt.Val = 1;
                boxedValueInt2.Val = 0;
                sArray[0] = 0;
                return this.opus_multistream_encoder_init(n, n2, boxedValueInt.Val, boxedValueInt2.Val, sArray, opusApplication, n2 > 2 && n3 == 1 ? 1 : 0);
            } else {
                if (n2 != 2) return OpusError.OPUS_UNIMPLEMENTED;
                boxedValueInt.Val = 1;
                boxedValueInt2.Val = 1;
                sArray[0] = 0;
                sArray[1] = 1;
            }
            return this.opus_multistream_encoder_init(n, n2, boxedValueInt.Val, boxedValueInt2.Val, sArray, opusApplication, n2 > 2 && n3 == 1 ? 1 : 0);
        } else if (n3 == 1 && n2 <= 8 && n2 >= 1) {
            boxedValueInt.Val = VorbisLayout.vorbis_mappings[n2 - 1].nb_streams;
            boxedValueInt2.Val = VorbisLayout.vorbis_mappings[n2 - 1].nb_coupled_streams;
            for (int i = 0; i < n2; ++i) {
                sArray[i] = VorbisLayout.vorbis_mappings[n2 - 1].mapping[i];
            }
            if (n2 < 6) return this.opus_multistream_encoder_init(n, n2, boxedValueInt.Val, boxedValueInt2.Val, sArray, opusApplication, n2 > 2 && n3 == 1 ? 1 : 0);
            this.lfe_stream = boxedValueInt.Val - 1;
            return this.opus_multistream_encoder_init(n, n2, boxedValueInt.Val, boxedValueInt2.Val, sArray, opusApplication, n2 > 2 && n3 == 1 ? 1 : 0);
        } else {
            if (n3 != 255) return OpusError.OPUS_UNIMPLEMENTED;
            boxedValueInt.Val = n2;
            boxedValueInt2.Val = 0;
            for (int n4 = 0; n4 < n2; n4 = (int)((byte)(n4 + 1))) {
                sArray[n4] = (short)n4;
            }
        }
        return this.opus_multistream_encoder_init(n, n2, boxedValueInt.Val, boxedValueInt2.Val, sArray, opusApplication, n2 > 2 && n3 == 1 ? 1 : 0);
    }

    public void setComplexity(int n) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setComplexity(n);
        }
    }

    public void setUseInbandFEC(boolean bl) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setUseInbandFEC(bl);
        }
    }

    public void setSignalType(OpusSignal opusSignal) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setSignalType(opusSignal);
        }
    }

    public int getLookahead() {
        return this.encoders[0].getLookahead();
    }

    public OpusSignal getSignalType() {
        return this.encoders[0].getSignalType();
    }

    public int getLSBDepth() {
        return this.encoders[0].getLSBDepth();
    }

    public void setLSBDepth(int n) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setLSBDepth(n);
        }
    }

    public OpusMode getForceMode() {
        return this.encoders[0].getForceMode();
    }

    public void setForceMode(OpusMode opusMode) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setForceMode(opusMode);
        }
    }

    public boolean getUseInbandFEC() {
        return this.encoders[0].getUseInbandFEC();
    }

    public int getFinalRange() {
        int n = 0;
        int n2 = 0;
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            n ^= this.encoders[n2++].getFinalRange();
        }
        return n;
    }

    public void setApplication(OpusApplication opusApplication) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setApplication(opusApplication);
        }
    }

    public int getForceChannels() {
        return this.encoders[0].getForceChannels();
    }

    public void setForceChannels(int n) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setForceChannels(n);
        }
    }

    public OpusBandwidth getMaxBandwidth() {
        return this.encoders[0].getMaxBandwidth();
    }

    public void setMaxBandwidth(OpusBandwidth opusBandwidth) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setMaxBandwidth(opusBandwidth);
        }
    }

    public int getComplexity() {
        return this.encoders[0].getComplexity();
    }

    int opus_multistream_encode_native(short[] sArray, int n, int n2, byte[] byArray, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        byte[] byArray2 = new byte[3832];
        OpusRepacketizer opusRepacketizer = new OpusRepacketizer();
        int[] nArray = new int[256];
        int[] nArray2 = new int[42];
        int[] nArray3 = null;
        int[] nArray4 = null;
        if (this.surround != 0) {
            nArray4 = this.preemph_mem;
            nArray3 = this.window_mem;
        }
        int n9 = 0;
        int n10 = this.encoders[n9].getSampleRate();
        boolean bl = this.encoders[n9].getUseVBR();
        CeltMode celtMode = this.encoders[n9].GetCeltMode();
        int n11 = this.layout.nb_streams + this.layout.nb_coupled_streams;
        int n12 = this.encoders[n9].getLookahead();
        int n13 = CodecHelpers.compute_frame_size((short[])sArray, (int)n, (int)n2, (OpusFramesize)this.variable_duration, (int)n11, (int)n10, (int)this.bitrate_bps, (int)(n12 -= n10 / 400), (float[])this.subframe_mem, (boolean)this.encoders[n9].analysis.enabled);
        if (400 * n13 < n10) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (400 * n13 != n10) {
            if (200 * n13 != n10 && 100 * n13 != n10 && 50 * n13 != n10 && 25 * n13 != n10 && 50 * n13 != 3 * n10) {
                return OpusError.OPUS_BAD_ARG;
            }
        }
        if (n4 < (n8 = this.layout.nb_streams * 2 - 1)) {
            return OpusError.OPUS_BUFFER_TOO_SMALL;
        }
        short[] sArray2 = new short[2 * n13];
        int[] nArray5 = new int[21 * this.layout.nb_channels];
        if (this.surround != 0) {
            OpusMSEncoder.surround_analysis(celtMode, sArray, n, nArray5, nArray3, nArray4, n13, 120, this.layout.nb_channels, n10);
        }
        int n14 = this.surround_rate_allocation(nArray, n13);
        if (!bl) {
            if (this.bitrate_bps == -1000) {
                n4 = Inlines.IMIN((int)n4, (int)(3 * n14 / (24 * n10 / n13)));
            } else if (this.bitrate_bps != -1) {
                n4 = Inlines.IMIN((int)n4, (int)Inlines.IMAX((int)n8, (int)(3 * this.bitrate_bps / (24 * n10 / n13))));
            }
        }
        for (n7 = 0; n7 < this.layout.nb_streams; ++n7) {
            OpusEncoder opusEncoder = this.encoders[n9];
            ++n9;
            opusEncoder.setBitrate(nArray[n7]);
            if (this.surround == 0) continue;
            n11 = this.bitrate_bps;
            if (n13 * 50 < n10) {
                n11 -= 60 * (n10 / n13 - 50) * this.layout.nb_channels;
            }
            if (n11 > 10000 * this.layout.nb_channels) {
                opusEncoder.setBandwidth(OpusBandwidth.OPUS_BANDWIDTH_FULLBAND);
            } else if (n11 > 7000 * this.layout.nb_channels) {
                opusEncoder.setBandwidth(OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND);
            } else if (n11 > 5000 * this.layout.nb_channels) {
                opusEncoder.setBandwidth(OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND);
            } else {
                opusEncoder.setBandwidth(OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND);
            }
            if (n7 >= this.layout.nb_coupled_streams) continue;
            opusEncoder.setForceMode(OpusMode.MODE_CELT_ONLY);
            opusEncoder.setForceChannels(2);
        }
        n9 = 0;
        int n15 = 0;
        for (n7 = 0; n7 < this.layout.nb_streams; ++n7) {
            int n16;
            int n17;
            int n18;
            int n19;
            opusRepacketizer.Reset();
            OpusEncoder opusEncoder = this.encoders[n9];
            if (n7 < this.layout.nb_coupled_streams) {
                n19 = OpusMultistream.get_left_channel(this.layout, n7, -1);
                int n20 = OpusMultistream.get_right_channel(this.layout, n7, -1);
                OpusMSEncoder.opus_copy_channel_in_short(sArray2, 0, 2, sArray, n, this.layout.nb_channels, n19, n13);
                OpusMSEncoder.opus_copy_channel_in_short(sArray2, 1, 2, sArray, n, this.layout.nb_channels, n20, n13);
                ++n9;
                if (this.surround != 0) {
                    for (n18 = 0; n18 < 21; ++n18) {
                        nArray2[n18] = nArray5[21 * n19 + n18];
                        nArray2[21 + n18] = nArray5[21 * n20 + n18];
                    }
                }
                n17 = n19;
                n16 = n20;
            } else {
                n19 = OpusMultistream.get_mono_channel(this.layout, n7, -1);
                OpusMSEncoder.opus_copy_channel_in_short(sArray2, 0, 1, sArray, n, this.layout.nb_channels, n19, n13);
                ++n9;
                if (this.surround != 0) {
                    for (n18 = 0; n18 < 21; ++n18) {
                        nArray2[n18] = nArray5[21 * n19 + n18];
                    }
                }
                n17 = n19;
                n16 = -1;
            }
            if (this.surround != 0) {
                opusEncoder.SetEnergyMask(nArray2);
            }
            int n21 = n4 - n15;
            n21 -= Inlines.IMAX((int)0, (int)(2 * (this.layout.nb_streams - n7 - 1) - 1));
            n21 = Inlines.IMIN((int)n21, (int)3832);
            if (n7 != this.layout.nb_streams - 1) {
                n21 -= n21 > 253 ? 2 : 1;
            }
            if (!bl && n7 == this.layout.nb_streams - 1) {
                opusEncoder.setBitrate(n21 * (8 * n10 / n13));
            }
            if ((n11 = opusEncoder.opus_encode_native(sArray2, 0, n13, byArray2, 0, n21, n5, sArray, n, n2, n17, n16, this.layout.nb_channels, n6)) < 0) {
                return n11;
            }
            opusRepacketizer.addPacket(byArray2, 0, n11);
            n11 = opusRepacketizer.opus_repacketizer_out_range_impl(0, opusRepacketizer.getNumFrames(), byArray, n3, n4 - n15, n7 != this.layout.nb_streams - 1 ? 1 : 0, !bl && n7 == this.layout.nb_streams - 1 ? 1 : 0);
            n3 += n11;
            n15 += n11;
        }
        return n15;
    }

    int opus_multistream_encoder_init(int n, int n2, int n3, int n4, short[] sArray, OpusApplication opusApplication, int n5) {
        int n6;
        int n7;
        block14: {
            block13: {
                if (n2 > 255 || n2 < 1 || n4 > n3 || n3 < 1 || n4 < 0) break block13;
                if (n3 <= 255 - n4) break block14;
            }
            return OpusError.OPUS_BAD_ARG;
        }
        this.layout.nb_channels = n2;
        this.layout.nb_streams = n3;
        this.layout.nb_coupled_streams = n4;
        this.subframe_mem[2] = 0.0f;
        this.subframe_mem[1] = 0.0f;
        this.subframe_mem[0] = 0.0f;
        if (n5 == 0) {
            this.lfe_stream = -1;
        }
        this.bitrate_bps = -1000;
        this.application = opusApplication;
        this.variable_duration = OpusFramesize.OPUS_FRAMESIZE_ARG;
        for (n7 = 0; n7 < this.layout.nb_channels; ++n7) {
            this.layout.mapping[n7] = sArray[n7];
        }
        if (OpusMultistream.validate_layout(this.layout) == 0 || OpusMSEncoder.validate_encoder_layout(this.layout) == 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        int n8 = 0;
        for (n7 = 0; n7 < this.layout.nb_coupled_streams; ++n7) {
            n6 = this.encoders[n8].opus_init_encoder(n, 2, opusApplication);
            if (n6 != OpusError.OPUS_OK) {
                return n6;
            }
            if (n7 == this.lfe_stream) {
                this.encoders[n8].setIsLFE(true);
            }
            ++n8;
        }
        while (n7 < this.layout.nb_streams) {
            n6 = this.encoders[n8].opus_init_encoder(n, 1, opusApplication);
            if (n7 == this.lfe_stream) {
                this.encoders[n8].setIsLFE(true);
            }
            if (n6 != OpusError.OPUS_OK) {
                return n6;
            }
            ++n8;
            ++n7;
        }
        if (n5 != 0) {
            Arrays.MemSet((int[])this.preemph_mem, (int)0, (int)n2);
            Arrays.MemSet((int[])this.window_mem, (int)0, (int)(n2 * 120));
        }
        this.surround = n5;
        return OpusError.OPUS_OK;
    }

    public void setUseDTX(boolean bl) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setUseDTX(bl);
        }
    }

    public void setUseVBR(boolean bl) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.encoders[i].setUseVBR(bl);
        }
    }

    public boolean getUseVBR() {
        return this.encoders[0].getUseVBR();
    }

    public void setBitrate(int n) {
        if (n < 0) {
            if (n != -1000 && n != -1) {
                throw new IllegalArgumentException("Invalid bitrate");
            }
        }
        this.bitrate_bps = n;
    }

    public boolean getUseDTX() {
        return this.encoders[0].getUseDTX();
    }

    static int logSum(int n, int n2) {
        int n3;
        int n4;
        if (n > n2) {
            n4 = n;
            n3 = Inlines.SUB32((int)Inlines.EXTEND32((int)n), (int)Inlines.EXTEND32((int)n2));
        } else {
            n4 = n2;
            n3 = Inlines.SUB32((int)Inlines.EXTEND32((int)n2), (int)Inlines.EXTEND32((int)n));
        }
        if (n3 >= 8192) {
            return n4;
        }
        int n5 = Inlines.SHR32((int)n3, (int)9);
        int n6 = Inlines.SHL16((int)(n3 - Inlines.SHL16((int)n5, (int)9)), (int)6);
        return n4 + diff_table[n5] + Inlines.MULT16_16_Q15((int)n6, (int)Inlines.SUB16((int)diff_table[n5 + 1], (int)diff_table[n5]));
    }
}

