/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.ChannelLayout
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.ChannelLayout;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.OpusBandwidth;
import de.maxhenkel.voicechat.concentus.OpusDecoder;
import de.maxhenkel.voicechat.concentus.OpusError;
import de.maxhenkel.voicechat.concentus.OpusException;
import de.maxhenkel.voicechat.concentus.OpusMultistream;
import de.maxhenkel.voicechat.concentus.OpusPacketInfo;

public class OpusMSDecoder {
    ChannelLayout layout = new ChannelLayout();
    OpusDecoder[] decoders = null;

    public static OpusMSDecoder create(int n, int n2, int n3, int n4, short[] sArray) throws OpusException {
        block6: {
            block5: {
                if (n2 > 255 || n2 < 1 || n4 > n3 || n3 < 1 || n4 < 0) break block5;
                if (n3 <= 255 - n4) break block6;
            }
            throw new IllegalArgumentException("Invalid channel / stream configuration");
        }
        OpusMSDecoder opusMSDecoder = new OpusMSDecoder(n3, n4);
        int n5 = opusMSDecoder.opus_multistream_decoder_init(n, n2, n3, n4, sArray);
        if (n5 != OpusError.OPUS_OK) {
            if (n5 == OpusError.OPUS_BAD_ARG) {
                throw new IllegalArgumentException("Bad argument while creating MS decoder");
            }
            throw new OpusException("Could not create MS decoder", n5);
        }
        return opusMSDecoder;
    }

    private OpusMSDecoder(int n, int n2) {
        this.decoders = new OpusDecoder[n];
        for (int i = 0; i < n; ++i) {
            this.decoders[i] = new OpusDecoder();
        }
    }

    public int getLastPacketDuration() {
        if (this.decoders == null || this.decoders.length == 0) {
            return OpusError.OPUS_INVALID_STATE;
        }
        return this.decoders[0].getLastPacketDuration();
    }

    public OpusDecoder GetMultistreamDecoderState(int n) {
        return this.decoders[n];
    }

    public int getSampleRate() {
        if (this.decoders == null || this.decoders.length == 0) {
            throw new IllegalStateException("Decoder not initialized");
        }
        return this.decoders[0].getSampleRate();
    }

    public OpusBandwidth getBandwidth() {
        if (this.decoders == null || this.decoders.length == 0) {
            throw new IllegalStateException("Decoder not initialized");
        }
        return this.decoders[0].getBandwidth();
    }

    public int decodeMultistream(byte[] byArray, int n, int n2, short[] sArray, int n3, int n4, int n5) {
        return this.opus_multistream_decode_native(byArray, n, n2, sArray, n3, n4, n5, 0);
    }

    public void ResetState() {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.decoders[i].resetState();
        }
    }

    public int getFinalRange() {
        int n = 0;
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            n ^= this.decoders[i].getFinalRange();
        }
        return n;
    }

    static void opus_copy_channel_out_short(short[] sArray, int n, int n2, int n3, short[] sArray2, int n4, int n5, int n6) {
        if (sArray2 != null) {
            for (int i = 0; i < n6; ++i) {
                sArray[i * n2 + n3 + n] = sArray2[i * n5 + n4];
            }
        } else {
            for (int i = 0; i < n6; ++i) {
                sArray[i * n2 + n3 + n] = 0;
            }
        }
    }

    int opus_multistream_decoder_init(int n, int n2, int n3, int n4, short[] sArray) {
        int n5;
        int n6;
        int n7;
        block10: {
            block9: {
                n7 = 0;
                if (n2 > 255 || n2 < 1 || n4 > n3 || n3 < 1 || n4 < 0) break block9;
                if (n3 <= 255 - n4) break block10;
            }
            throw new IllegalArgumentException("Invalid channel or coupled stream count");
        }
        this.layout.nb_channels = n2;
        this.layout.nb_streams = n3;
        this.layout.nb_coupled_streams = n4;
        for (n6 = 0; n6 < this.layout.nb_channels; ++n6) {
            this.layout.mapping[n6] = sArray[n6];
        }
        if (OpusMultistream.validate_layout(this.layout) == 0) {
            throw new IllegalArgumentException("Invalid surround channel layout");
        }
        for (n6 = 0; n6 < this.layout.nb_coupled_streams; ++n6) {
            n5 = this.decoders[n7].opus_decoder_init(n, 2);
            if (n5 != OpusError.OPUS_OK) {
                return n5;
            }
            ++n7;
        }
        while (n6 < this.layout.nb_streams) {
            n5 = this.decoders[n7].opus_decoder_init(n, 1);
            if (n5 != OpusError.OPUS_OK) {
                return n5;
            }
            ++n7;
            ++n6;
        }
        return OpusError.OPUS_OK;
    }

    int opus_multistream_decode_native(byte[] byArray, int n, int n2, short[] sArray, int n3, int n4, int n5, int n6) {
        boolean bl = false;
        int n7 = this.getSampleRate();
        n4 = Inlines.IMIN((int)n4, (int)(n7 / 25 * 3));
        short[] sArray2 = new short[2 * n4];
        int n8 = 0;
        if (n2 == 0) {
            bl = true;
        }
        if (n2 < 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (!bl && n2 < 2 * this.layout.nb_streams - 1) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        if (!bl) {
            int n9 = OpusMSDecoder.opus_multistream_packet_validate(byArray, n, n2, this.layout.nb_streams, n7);
            if (n9 < 0) {
                return n9;
            }
            if (n9 > n4) {
                return OpusError.OPUS_BUFFER_TOO_SMALL;
            }
        }
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            int n10;
            int n11;
            OpusDecoder opusDecoder = this.decoders[n8++];
            if (!bl && n2 <= 0) {
                return OpusError.OPUS_INTERNAL_ERROR;
            }
            BoxedValueInt boxedValueInt = new BoxedValueInt(0);
            int n12 = opusDecoder.opus_decode_native(byArray, n, n2, sArray2, 0, n4, n5, i != this.layout.nb_streams - 1 ? 1 : 0, boxedValueInt, n6);
            n += boxedValueInt.Val;
            n2 -= boxedValueInt.Val;
            if (n12 <= 0) {
                return n12;
            }
            n4 = n12;
            if (i < this.layout.nb_coupled_streams) {
                n11 = -1;
                while ((n10 = OpusMultistream.get_left_channel(this.layout, i, n11)) != -1) {
                    OpusMSDecoder.opus_copy_channel_out_short(sArray, n3, this.layout.nb_channels, n10, sArray2, 0, 2, n4);
                    n11 = n10;
                }
                n11 = -1;
                while ((n10 = OpusMultistream.get_right_channel(this.layout, i, n11)) != -1) {
                    OpusMSDecoder.opus_copy_channel_out_short(sArray, n3, this.layout.nb_channels, n10, sArray2, 1, 2, n4);
                    n11 = n10;
                }
                continue;
            }
            n11 = -1;
            while ((n10 = OpusMultistream.get_mono_channel(this.layout, i, n11)) != -1) {
                OpusMSDecoder.opus_copy_channel_out_short(sArray, n3, this.layout.nb_channels, n10, sArray2, 0, 1, n4);
                n11 = n10;
            }
        }
        for (int i = 0; i < this.layout.nb_channels; ++i) {
            if (this.layout.mapping[i] != 255) continue;
            OpusMSDecoder.opus_copy_channel_out_short(sArray, n3, this.layout.nb_channels, i, null, 0, 0, n4);
        }
        return n4;
    }

    static int opus_multistream_packet_validate(byte[] byArray, int n, int n2, int n3, int n4) {
        BoxedValueByte boxedValueByte = new BoxedValueByte(0);
        short[] sArray = new short[48];
        int n5 = 0;
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        for (int i = 0; i < n3; ++i) {
            if (n2 <= 0) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            int n6 = OpusPacketInfo.opus_packet_parse_impl(byArray, n, n2, i != n3 - 1 ? 1 : 0, boxedValueByte, null, 0, sArray, 0, boxedValueInt2, boxedValueInt);
            if (n6 < 0) {
                return n6;
            }
            int n7 = OpusPacketInfo.getNumSamples(byArray, n, boxedValueInt.Val, n4);
            if (i != 0 && n5 != n7) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            n5 = n7;
            n += boxedValueInt.Val;
            n2 -= boxedValueInt.Val;
        }
        return n5;
    }

    public int getGain() {
        if (this.decoders == null || this.decoders.length == 0) {
            throw new IllegalStateException("Decoder not initialized");
        }
        return this.decoders[0].getGain();
    }

    public void setGain(int n) {
        for (int i = 0; i < this.layout.nb_streams; ++i) {
            this.decoders[i].setGain(n);
        }
    }
}

