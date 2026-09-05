/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.CeltDecoder
 *  de.maxhenkel.voicechat.concentus.CodecHelpers
 *  de.maxhenkel.voicechat.concentus.DecControlState
 *  de.maxhenkel.voicechat.concentus.DecodeAPI
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltDecoder;
import de.maxhenkel.voicechat.concentus.CodecHelpers;
import de.maxhenkel.voicechat.concentus.DecControlState;
import de.maxhenkel.voicechat.concentus.DecodeAPI;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.OpusBandwidth;
import de.maxhenkel.voicechat.concentus.OpusError;
import de.maxhenkel.voicechat.concentus.OpusException;
import de.maxhenkel.voicechat.concentus.OpusMode;
import de.maxhenkel.voicechat.concentus.OpusPacketInfo;
import de.maxhenkel.voicechat.concentus.SilkDecoder;

public class OpusDecoder {
    int channels;
    int Fs;
    final DecControlState DecControl = new DecControlState();
    int decode_gain;
    int stream_channels;
    OpusBandwidth bandwidth;
    OpusMode mode;
    OpusMode prev_mode;
    int frame_size;
    int prev_redundancy;
    int last_packet_duration;
    int rangeFinal;
    SilkDecoder SilkDecoder = new SilkDecoder();
    CeltDecoder Celt_Decoder = new CeltDecoder();
    private static final byte[] SILENCE = new byte[]{-1, -1};

    OpusDecoder() {
    }

    public OpusDecoder(int n, int n2) throws OpusException {
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
        int n3 = this.opus_decoder_init(n, n2);
        if (n3 != OpusError.OPUS_OK) {
            if (n3 == OpusError.OPUS_BAD_ARG) {
                throw new IllegalArgumentException("OPUS_BAD_ARG when creating decoder");
            }
            throw new OpusException("Error while initializing decoder", n3);
        }
    }

    void reset() {
        this.channels = 0;
        this.Fs = 0;
        this.DecControl.Reset();
        this.decode_gain = 0;
        this.partialReset();
    }

    public int decode(byte[] byArray, int n, int n2, byte[] byArray2, int n3, int n4, boolean bl) throws OpusException {
        short[] sArray = new short[Math.min(n4, 5760) * this.channels];
        int n5 = this.decode(byArray, n, n2, sArray, 0, n4, bl);
        int n6 = n3;
        for (int i = 0; i < sArray.length; ++i) {
            int n7 = n6++;
            byArray2[n7] = (byte)(sArray[i] & 0xFF);
            int n8 = n6++;
            byArray2[n8] = (byte)(sArray[i] >> 8 & 0xFF);
        }
        return n5;
    }

    public int decode(byte[] byArray, int n, int n2, short[] sArray, int n3, int n4, boolean bl) throws OpusException {
        if (n4 <= 0) {
            throw new IllegalArgumentException("Frame size must be > 0");
        }
        try {
            BoxedValueInt boxedValueInt = new BoxedValueInt(0);
            int n5 = this.opus_decode_native(byArray, n, n2, sArray, n3, n4, bl ? 1 : 0, 0, boxedValueInt, 0);
            if (n5 < 0) {
                if (n5 == OpusError.OPUS_BAD_ARG) {
                    throw new IllegalArgumentException("OPUS_BAD_ARG while decoding");
                }
                throw new OpusException("An error occurred during decoding", n5);
            }
            return n5;
        }
        catch (ArithmeticException arithmeticException) {
            throw new OpusException("Internal error during decoding: " + arithmeticException.getMessage());
        }
    }

    public void resetState() {
        this.partialReset();
        this.Celt_Decoder.ResetState();
        DecodeAPI.silk_InitDecoder((SilkDecoder)this.SilkDecoder);
        this.stream_channels = this.channels;
        this.frame_size = this.Fs / 400;
    }

    public int getLastPacketDuration() {
        return this.last_packet_duration;
    }

    public int getSampleRate() {
        return this.Fs;
    }

    public OpusBandwidth getBandwidth() {
        return this.bandwidth;
    }

    public int getPitch() {
        if (this.prev_mode == OpusMode.MODE_CELT_ONLY) {
            return this.Celt_Decoder.GetPitch();
        }
        return this.DecControl.prevPitchLag;
    }

    int opus_decode_native(byte[] byArray, int n, int n2, short[] sArray, int n3, int n4, int n5, int n6, BoxedValueInt boxedValueInt, int n7) {
        short[] sArray2;
        block18: {
            block17: {
                boxedValueInt.Val = 0;
                sArray2 = new short[48];
                if (n5 < 0 || n5 > 1) {
                    return OpusError.OPUS_BAD_ARG;
                }
                if (n5 != 0 || n2 == 0) break block17;
                if (byArray != null) break block18;
            }
            if (n4 % (this.Fs / 400) != 0) {
                return OpusError.OPUS_BAD_ARG;
            }
        }
        if (n2 == 0 || byArray == null) {
            int n8;
            int n9 = 0;
            do {
                if ((n8 = this.opus_decode_frame(null, 0, 0, sArray, n3 + n9 * this.channels, n4 - n9, 0)) >= 0) continue;
                return n8;
            } while ((n9 += n8) < n4);
            Inlines.OpusAssert((n9 == n4 ? 1 : 0) != 0);
            this.last_packet_duration = n9;
            return n9;
        }
        if (n2 < 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        OpusMode opusMode = OpusPacketInfo.getEncoderMode(byArray, n);
        OpusBandwidth opusBandwidth = OpusPacketInfo.getBandwidth(byArray, n);
        int n10 = OpusPacketInfo.getNumSamplesPerFrame(byArray, n, this.Fs);
        int n11 = OpusPacketInfo.getNumEncodedChannels(byArray, n);
        BoxedValueByte boxedValueByte = new BoxedValueByte(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        int n12 = OpusPacketInfo.opus_packet_parse_impl(byArray, n, n2, n6, boxedValueByte, null, 0, sArray2, 0, boxedValueInt2, boxedValueInt);
        int n13 = boxedValueInt2.Val;
        if (n12 < 0) {
            return n12;
        }
        n += n13;
        if (n5 != 0) {
            int n14;
            BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
            if (n4 < n10 || opusMode == OpusMode.MODE_CELT_ONLY || this.mode == OpusMode.MODE_CELT_ONLY) {
                return this.opus_decode_native(null, 0, 0, sArray, n3, n4, 0, 0, boxedValueInt3, n7);
            }
            int n15 = this.last_packet_duration;
            if (n4 - n10 != 0) {
                n14 = this.opus_decode_native(null, 0, 0, sArray, n3, n4 - n10, 0, 0, boxedValueInt3, n7);
                if (n14 < 0) {
                    this.last_packet_duration = n15;
                    return n14;
                }
                Inlines.OpusAssert((n14 == n4 - n10 ? 1 : 0) != 0);
            }
            this.mode = opusMode;
            this.bandwidth = opusBandwidth;
            this.frame_size = n10;
            this.stream_channels = n11;
            n14 = this.opus_decode_frame(byArray, n, sArray2[0], sArray, n3 + this.channels * (n4 - n10), n10, 1);
            if (n14 < 0) {
                return n14;
            }
            this.last_packet_duration = n4;
            return n4;
        }
        if (n12 * n10 > n4) {
            return OpusError.OPUS_BUFFER_TOO_SMALL;
        }
        this.mode = opusMode;
        this.bandwidth = opusBandwidth;
        this.frame_size = n10;
        this.stream_channels = n11;
        int n16 = 0;
        for (int i = 0; i < n12; ++i) {
            int n17 = this.opus_decode_frame(byArray, n, sArray2[i], sArray, n3 + n16 * this.channels, n4 - n16, 0);
            if (n17 < 0) {
                return n17;
            }
            Inlines.OpusAssert((n17 == n10 ? 1 : 0) != 0);
            n += sArray2[i];
            n16 += n17;
        }
        this.last_packet_duration = n16;
        return n16;
    }

    int opus_decoder_init(int n, int n2) {
        block7: {
            block6: {
                block5: {
                    if (n == 48000) break block5;
                    if (n == 24000) break block5;
                    if (n == 16000) break block5;
                    if (n == 12000) break block5;
                    if (n != 8000) break block6;
                }
                if (n2 == 1 || n2 == 2) break block7;
            }
            return OpusError.OPUS_BAD_ARG;
        }
        this.reset();
        SilkDecoder silkDecoder = this.SilkDecoder;
        CeltDecoder celtDecoder = this.Celt_Decoder;
        this.stream_channels = this.channels = n2;
        this.DecControl.API_sampleRate = this.Fs = n;
        this.DecControl.nChannelsAPI = this.channels;
        int n3 = DecodeAPI.silk_InitDecoder((SilkDecoder)silkDecoder);
        if (n3 != 0) {
            return OpusError.OPUS_INTERNAL_ERROR;
        }
        n3 = celtDecoder.celt_decoder_init(n, n2);
        if (n3 != OpusError.OPUS_OK) {
            return OpusError.OPUS_INTERNAL_ERROR;
        }
        celtDecoder.SetSignalling(0);
        this.prev_mode = OpusMode.MODE_UNKNOWN;
        this.frame_size = n / 400;
        return OpusError.OPUS_OK;
    }

    void partialReset() {
        this.stream_channels = 0;
        this.bandwidth = OpusBandwidth.OPUS_BANDWIDTH_UNKNOWN;
        this.mode = OpusMode.MODE_UNKNOWN;
        this.prev_mode = OpusMode.MODE_UNKNOWN;
        this.frame_size = 0;
        this.prev_redundancy = 0;
        this.last_packet_duration = 0;
        this.rangeFinal = 0;
    }

    int opus_decode_frame(byte[] byArray, int n, int n2, short[] sArray, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        OpusMode opusMode;
        int n9;
        int n10 = 0;
        int n11 = 0;
        EntropyCoder entropyCoder = new EntropyCoder();
        short[] sArray2 = null;
        boolean bl = false;
        int n12 = 0;
        int n13 = 0;
        int n14 = 0;
        int n15 = 0;
        SilkDecoder silkDecoder = this.SilkDecoder;
        CeltDecoder celtDecoder = this.Celt_Decoder;
        int n16 = this.Fs / 50;
        int n17 = n16 >> 1;
        int n18 = n17 >> 1;
        int n19 = n18 >> 1;
        if (n4 < n19) {
            return OpusError.OPUS_BUFFER_TOO_SMALL;
        }
        n4 = Inlines.IMIN((int)n4, (int)(this.Fs / 25 * 3));
        if (n2 <= 1) {
            byArray = null;
            n4 = Inlines.IMIN((int)n4, (int)this.frame_size);
        }
        if (byArray != null) {
            n9 = this.frame_size;
            opusMode = this.mode;
            entropyCoder.dec_init(byArray, n, n2);
        } else {
            n9 = n4;
            opusMode = this.prev_mode;
            if (opusMode == OpusMode.MODE_UNKNOWN) {
                for (int i = n3; i < n3 + n9 * this.channels; ++i) {
                    sArray[i] = 0;
                }
                return n9;
            }
            if (n9 > n16) {
                int n20;
                do {
                    if ((n20 = this.opus_decode_frame(null, 0, 0, sArray, n3, Inlines.IMIN((int)n9, (int)n16), 0)) < 0) {
                        return n20;
                    }
                    n3 += n20 * this.channels;
                } while ((n9 -= n20) > 0);
                return n4;
            }
            if (n9 < n16) {
                if (n9 > n17) {
                    n9 = n17;
                } else if (opusMode != OpusMode.MODE_SILK_ONLY && n9 > n18 && n9 < n17) {
                    n9 = n18;
                }
            }
        }
        int n21 = opusMode != OpusMode.MODE_CELT_ONLY && n4 >= n17 ? 1 : 0;
        int n22 = 0;
        int n23 = 0;
        if (byArray != null && this.prev_mode != OpusMode.MODE_UNKNOWN && this.prev_mode != OpusMode.MODE_AUTO && (opusMode == OpusMode.MODE_CELT_ONLY && this.prev_mode != OpusMode.MODE_CELT_ONLY && this.prev_redundancy == 0 || opusMode != OpusMode.MODE_CELT_ONLY && this.prev_mode == OpusMode.MODE_CELT_ONLY)) {
            bl = true;
            if (opusMode == OpusMode.MODE_CELT_ONLY) {
                n23 = n18 * this.channels;
            } else {
                n22 = n18 * this.channels;
            }
        }
        short[] sArray3 = new short[n23];
        if (bl && opusMode == OpusMode.MODE_CELT_ONLY) {
            sArray2 = sArray3;
            this.opus_decode_frame(null, 0, 0, sArray2, 0, Inlines.IMIN((int)n18, (int)n9), 0);
        }
        if (n9 > n4) {
            return OpusError.OPUS_BAD_ARG;
        }
        n4 = n9;
        int n24 = opusMode != OpusMode.MODE_CELT_ONLY && n21 == 0 ? Inlines.IMAX((int)n17, (int)n4) * this.channels : 0;
        short[] sArray4 = new short[n24];
        if (opusMode != OpusMode.MODE_CELT_ONLY) {
            int n25;
            short[] sArray5;
            int n26 = 0;
            if (n21 != 0) {
                sArray5 = sArray;
                n26 = n3;
            } else {
                sArray5 = sArray4;
                n26 = 0;
            }
            if (this.prev_mode == OpusMode.MODE_CELT_ONLY) {
                DecodeAPI.silk_InitDecoder((SilkDecoder)silkDecoder);
            }
            this.DecControl.payloadSize_ms = Inlines.IMAX((int)10, (int)(1000 * n9 / this.Fs));
            if (byArray != null) {
                this.DecControl.nChannelsInternal = this.stream_channels;
                if (opusMode == OpusMode.MODE_SILK_ONLY) {
                    if (this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND) {
                        this.DecControl.internalSampleRate = 8000;
                    } else if (this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND) {
                        this.DecControl.internalSampleRate = 12000;
                    } else if (this.bandwidth == OpusBandwidth.OPUS_BANDWIDTH_WIDEBAND) {
                        this.DecControl.internalSampleRate = 16000;
                    } else {
                        this.DecControl.internalSampleRate = 16000;
                        Inlines.OpusAssert((boolean)false);
                    }
                } else {
                    this.DecControl.internalSampleRate = 16000;
                }
            }
            n8 = byArray == null ? 1 : 2 * n5;
            n7 = 0;
            do {
                int n27 = n7 == 0 ? 1 : 0;
                BoxedValueInt boxedValueInt = new BoxedValueInt(0);
                n10 = DecodeAPI.silk_Decode((SilkDecoder)silkDecoder, (DecControlState)this.DecControl, (int)n8, (int)n27, (EntropyCoder)entropyCoder, (short[])sArray5, (int)n26, (BoxedValueInt)boxedValueInt);
                n25 = boxedValueInt.Val;
                if (n10 != 0) {
                    if (n8 != 0) {
                        n25 = n4;
                        Arrays.MemSetWithOffset((short[])sArray5, (short)0, (int)n26, (int)(n4 * this.channels));
                    } else {
                        return OpusError.OPUS_INTERNAL_ERROR;
                    }
                }
                n26 += n25 * this.channels;
            } while ((n7 += n25) < n4);
        }
        int n28 = 0;
        if (n5 == 0 && opusMode != OpusMode.MODE_CELT_ONLY && byArray != null && entropyCoder.tell() + 17 + 20 * (this.mode == OpusMode.MODE_HYBRID ? 1 : 0) <= 8 * n2 && (n12 = opusMode == OpusMode.MODE_HYBRID ? entropyCoder.dec_bit_logp(12L) : 1) != 0) {
            n14 = entropyCoder.dec_bit_logp(1L);
            int n29 = n13 = opusMode == OpusMode.MODE_HYBRID ? (int)entropyCoder.dec_uint(256L) + 2 : n2 - (entropyCoder.tell() + 7 >> 3);
            if ((n2 -= n13) * 8 < entropyCoder.tell()) {
                n2 = 0;
                n13 = 0;
                n12 = 0;
            }
            entropyCoder.storage -= n13;
        }
        if (opusMode != OpusMode.MODE_CELT_ONLY) {
            n28 = 17;
        }
        n8 = 21;
        switch (this.bandwidth) {
            case OPUS_BANDWIDTH_NARROWBAND: {
                n8 = 13;
                break;
            }
            case OPUS_BANDWIDTH_MEDIUMBAND: 
            case OPUS_BANDWIDTH_WIDEBAND: {
                n8 = 17;
                break;
            }
            case OPUS_BANDWIDTH_SUPERWIDEBAND: {
                n8 = 19;
                break;
            }
            case OPUS_BANDWIDTH_FULLBAND: {
                n8 = 21;
            }
        }
        celtDecoder.SetEndBand(n8);
        celtDecoder.SetChannels(this.stream_channels);
        if (n12 != 0) {
            bl = false;
            n22 = 0;
        }
        short[] sArray6 = new short[n22];
        if (bl && opusMode != OpusMode.MODE_CELT_ONLY) {
            sArray2 = sArray6;
            this.opus_decode_frame(null, 0, 0, sArray2, 0, Inlines.IMIN((int)n18, (int)n9), 0);
        }
        int n30 = n12 != 0 ? n18 * this.channels : 0;
        short[] sArray7 = new short[n30];
        if (n12 != 0 && n14 != 0) {
            celtDecoder.SetStartBand(0);
            celtDecoder.celt_decode_with_ec(byArray, n + n2, n13, sArray7, 0, n18, null, 0);
            n15 = celtDecoder.GetFinalRange();
        }
        celtDecoder.SetStartBand(n28);
        if (opusMode != OpusMode.MODE_SILK_ONLY) {
            n8 = Inlines.IMIN((int)n16, (int)n4);
            if (opusMode != this.prev_mode && this.prev_mode != OpusMode.MODE_AUTO && this.prev_mode != OpusMode.MODE_UNKNOWN && this.prev_redundancy == 0) {
                celtDecoder.ResetState();
            }
            n11 = celtDecoder.celt_decode_with_ec(n5 != 0 ? null : byArray, n, n2, sArray, n3, n8, entropyCoder, n21);
        } else {
            if (n21 == 0) {
                for (n6 = n3; n6 < n4 * this.channels + n3; ++n6) {
                    sArray[n6] = 0;
                }
            }
            if (this.prev_mode == OpusMode.MODE_HYBRID && (n12 == 0 || n14 == 0 || this.prev_redundancy == 0)) {
                celtDecoder.SetStartBand(0);
                celtDecoder.celt_decode_with_ec(SILENCE, 0, 2, sArray, n3, n19, null, n21);
            }
        }
        if (opusMode != OpusMode.MODE_CELT_ONLY && n21 == 0) {
            for (n6 = 0; n6 < n4 * this.channels; ++n6) {
                sArray[n3 + n6] = Inlines.SAT16((int)Inlines.ADD32((int)sArray[n3 + n6], (int)sArray4[n6]));
            }
        }
        int[] nArray = celtDecoder.GetMode().window;
        if (n12 != 0 && n14 == 0) {
            celtDecoder.ResetState();
            celtDecoder.SetStartBand(0);
            celtDecoder.celt_decode_with_ec(byArray, n + n2, n13, sArray7, 0, n18, null, 0);
            n15 = celtDecoder.GetFinalRange();
            CodecHelpers.smooth_fade((short[])sArray, (int)(n3 + this.channels * (n4 - n19)), (short[])sArray7, (int)(this.channels * n19), (short[])sArray, (int)(n3 + this.channels * (n4 - n19)), (int)n19, (int)this.channels, (int[])nArray, (int)this.Fs);
        }
        if (n12 != 0 && n14 != 0) {
            for (int i = 0; i < this.channels; ++i) {
                for (n6 = 0; n6 < n19; ++n6) {
                    sArray[this.channels * n6 + i + n3] = sArray7[this.channels * n6 + i];
                }
            }
            CodecHelpers.smooth_fade((short[])sArray7, (int)(this.channels * n19), (short[])sArray, (int)(n3 + this.channels * n19), (short[])sArray, (int)(n3 + this.channels * n19), (int)n19, (int)this.channels, (int[])nArray, (int)this.Fs);
        }
        if (bl) {
            if (n9 >= n18) {
                for (n6 = 0; n6 < this.channels * n19; ++n6) {
                    sArray[n6] = sArray2[n6];
                }
                CodecHelpers.smooth_fade((short[])sArray2, (int)(this.channels * n19), (short[])sArray, (int)(n3 + this.channels * n19), (short[])sArray, (int)(n3 + this.channels * n19), (int)n19, (int)this.channels, (int[])nArray, (int)this.Fs);
            } else {
                CodecHelpers.smooth_fade((short[])sArray2, (int)0, (short[])sArray, (int)n3, (short[])sArray, (int)n3, (int)n19, (int)this.channels, (int[])nArray, (int)this.Fs);
            }
        }
        if (this.decode_gain != 0) {
            n8 = Inlines.celt_exp2((int)Inlines.MULT16_16_P15((int)21771, (int)this.decode_gain));
            for (n6 = n3; n6 < n3 + n4 * this.channels; ++n6) {
                n7 = Inlines.MULT16_32_P16((short)sArray[n6], (int)n8);
                sArray[n6] = (short)Inlines.SATURATE((int)n7, (int)Short.MAX_VALUE);
            }
        }
        this.rangeFinal = n2 <= 1 ? 0 : (int)entropyCoder.rng ^ n15;
        this.prev_mode = opusMode;
        this.prev_redundancy = n12 != 0 && n14 == 0 ? 1 : 0;
        return n11 < 0 ? n11 : n9;
    }

    public int getFinalRange() {
        return this.rangeFinal;
    }

    public int getGain() {
        return this.decode_gain;
    }

    public void setGain(int n) {
        block3: {
            block2: {
                if (n < Short.MIN_VALUE) break block2;
                if (n <= Short.MAX_VALUE) break block3;
            }
            throw new IllegalArgumentException("Gain must be within the range of a signed int16");
        }
        this.decode_gain = n;
    }
}

