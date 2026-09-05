/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.OpusError;
import de.maxhenkel.voicechat.concentus.OpusPacketInfo;

public class OpusRepacketizer {
    byte toc = 0;
    int nb_frames = 0;
    final byte[][] frames = new byte[48][];
    final short[] len = new short[48];
    int framesize = 0;

    public OpusRepacketizer() {
        this.Reset();
    }

    int opus_repacketizer_cat_impl(byte[] byArray, int n, int n2, int n3) {
        BoxedValueByte boxedValueByte = new BoxedValueByte(0);
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        if (n2 < 1) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        if (this.nb_frames == 0) {
            this.toc = byArray[n];
            this.framesize = OpusPacketInfo.getNumSamplesPerFrame(byArray, n, 8000);
        } else if ((this.toc & 0xFC) != (byArray[n] & 0xFC)) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        int n4 = OpusPacketInfo.getNumFrames(byArray, n, n2);
        if (n4 < 1) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        if ((n4 + this.nb_frames) * this.framesize > 960) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        int n5 = OpusPacketInfo.opus_packet_parse_impl(byArray, n, n2, n3, boxedValueByte, this.frames, this.nb_frames, this.len, this.nb_frames, boxedValueInt, boxedValueInt);
        if (n5 < 1) {
            return n5;
        }
        this.nb_frames += n4;
        return OpusError.OPUS_OK;
    }

    public static int padMultistreamPacket(byte[] byArray, int n, int n2, int n3, int n4) {
        BoxedValueByte boxedValueByte = new BoxedValueByte(0);
        short[] sArray = new short[48];
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        if (n2 < 1) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (n2 == n3) {
            return OpusError.OPUS_OK;
        }
        if (n2 > n3) {
            return OpusError.OPUS_BAD_ARG;
        }
        int n5 = n3 - n2;
        for (int i = 0; i < n4 - 1; ++i) {
            if (n2 <= 0) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            int n6 = OpusPacketInfo.opus_packet_parse_impl(byArray, n, n2, 1, boxedValueByte, null, 0, sArray, 0, boxedValueInt2, boxedValueInt);
            if (n6 < 0) {
                return n6;
            }
            n += boxedValueInt.Val;
            n2 -= boxedValueInt.Val;
        }
        return OpusRepacketizer.padPacket(byArray, n, n2, n2 + n5);
    }

    public static int unpadMultistreamPacket(byte[] byArray, int n, int n2, int n3) {
        BoxedValueByte boxedValueByte = new BoxedValueByte(0);
        short[] sArray = new short[48];
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        OpusRepacketizer opusRepacketizer = new OpusRepacketizer();
        if (n2 < 1) {
            return OpusError.OPUS_BAD_ARG;
        }
        int n4 = n;
        int n5 = 0;
        for (int i = 0; i < n3; ++i) {
            int n6 = (i != n3 ? 1 : 0) - 1;
            if (n2 <= 0) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            opusRepacketizer.Reset();
            int n7 = OpusPacketInfo.opus_packet_parse_impl(byArray, n, n2, n6, boxedValueByte, null, 0, sArray, 0, boxedValueInt2, boxedValueInt);
            if (n7 < 0) {
                return n7;
            }
            n7 = opusRepacketizer.opus_repacketizer_cat_impl(byArray, n, boxedValueInt.Val, n6);
            if (n7 < 0) {
                return n7;
            }
            n7 = opusRepacketizer.opus_repacketizer_out_range_impl(0, opusRepacketizer.nb_frames, byArray, n4, n2, n6, 0);
            if (n7 < 0) {
                return n7;
            }
            n5 += n7;
            n4 += n7;
            n += boxedValueInt.Val;
            n2 -= boxedValueInt.Val;
        }
        return n5;
    }

    public int createPacket(byte[] byArray, int n, int n2) {
        return this.opus_repacketizer_out_range_impl(0, this.nb_frames, byArray, n, n2, 0, 0);
    }

    public int createPacket(int n, int n2, byte[] byArray, int n3, int n4) {
        return this.opus_repacketizer_out_range_impl(n, n2, byArray, n3, n4, 0, 0);
    }

    public void Reset() {
        this.nb_frames = 0;
    }

    public static int unpadPacket(byte[] byArray, int n, int n2) {
        if (n2 < 1) {
            return OpusError.OPUS_BAD_ARG;
        }
        OpusRepacketizer opusRepacketizer = new OpusRepacketizer();
        opusRepacketizer.Reset();
        int n3 = opusRepacketizer.addPacket(byArray, n, n2);
        if (n3 < 0) {
            return n3;
        }
        n3 = opusRepacketizer.opus_repacketizer_out_range_impl(0, opusRepacketizer.nb_frames, byArray, n, n2, 0, 0);
        Inlines.OpusAssert((n3 > 0 && n3 <= n2 ? 1 : 0) != 0);
        return n3;
    }

    public int getNumFrames() {
        return this.nb_frames;
    }

    int opus_repacketizer_out_range_impl(int n, int n2, byte[] byArray, int n3, int n4, int n5, int n6) {
        int n7;
        int n8;
        if (n < 0 || n >= n2 || n2 > this.nb_frames) {
            return OpusError.OPUS_BAD_ARG;
        }
        int n9 = n2 - n;
        int n10 = n5 != 0 ? 1 + (this.len[n9 - 1] >= 252 ? 1 : 0) : 0;
        int n11 = n3;
        if (n9 == 1) {
            if ((n10 += this.len[0] + 1) > n4) {
                return OpusError.OPUS_BUFFER_TOO_SMALL;
            }
            int n12 = n11++;
            byArray[n12] = (byte)(this.toc & 0xFC);
        } else if (n9 == 2) {
            if (this.len[1] == this.len[0]) {
                if ((n10 += 2 * this.len[0] + 1) > n4) {
                    return OpusError.OPUS_BUFFER_TOO_SMALL;
                }
                int n13 = n11++;
                byArray[n13] = (byte)(this.toc & 0xFC | 1);
            } else {
                if ((n10 += this.len[0] + this.len[1] + 2 + (this.len[0] >= 252 ? 1 : 0)) > n4) {
                    return OpusError.OPUS_BUFFER_TOO_SMALL;
                }
                int n14 = n11++;
                byArray[n14] = (byte)(this.toc & 0xFC | 2);
                n11 += OpusPacketInfo.encode_size(this.len[0], byArray, n11);
            }
        }
        if (n9 > 2 || n6 != 0 && n10 < n4) {
            int n15 = 0;
            n11 = n3;
            n10 = n5 != 0 ? 1 + (this.len[n9 - 1] >= 252 ? 1 : 0) : 0;
            n8 = 0;
            for (n7 = 1; n7 < n9; ++n7) {
                if (this.len[n7] == this.len[0]) continue;
                n8 = 1;
                break;
            }
            if (n8 != 0) {
                n10 += 2;
                for (n7 = 0; n7 < n9 - 1; ++n7) {
                    n10 += 1 + (this.len[n7] >= 252 ? 1 : 0) + this.len[n7];
                }
                if ((n10 += this.len[n9 - 1]) > n4) {
                    return OpusError.OPUS_BUFFER_TOO_SMALL;
                }
                int n16 = n11++;
                byArray[n16] = (byte)(this.toc & 0xFC | 3);
                int n17 = n11++;
                byArray[n17] = (byte)(n9 | 0x80);
            } else {
                if ((n10 += n9 * this.len[0] + 2) > n4) {
                    return OpusError.OPUS_BUFFER_TOO_SMALL;
                }
                int n18 = n11++;
                byArray[n18] = (byte)(this.toc & 0xFC | 3);
                byArray[n11++] = (byte)n9;
            }
            int n19 = n15 = n6 != 0 ? n4 - n10 : 0;
            if (n15 != 0) {
                byArray[n3 + 1] = (byte)(byArray[n3 + 1] | 0x40);
                int n20 = (n15 - 1) / 255;
                for (n7 = 0; n7 < n20; ++n7) {
                    byArray[n11++] = -1;
                }
                int n21 = n11++;
                byArray[n21] = (byte)(n15 - 255 * n20 - 1);
                n10 += n15;
            }
            if (n8 != 0) {
                for (n7 = 0; n7 < n9 - 1; ++n7) {
                    n11 += OpusPacketInfo.encode_size(this.len[n7], byArray, n11);
                }
            }
        }
        if (n5 != 0) {
            n8 = OpusPacketInfo.encode_size(this.len[n9 - 1], byArray, n11);
            n11 += n8;
        }
        for (n7 = n; n7 < n9 + n; ++n7) {
            if (byArray == this.frames[n7]) {
                Arrays.MemMove((byte[])byArray, (int)0, (int)n11, (int)this.len[n7]);
            } else {
                System.arraycopy(this.frames[n7], 0, byArray, n11, this.len[n7]);
            }
            n11 += this.len[n7];
        }
        if (n6 != 0) {
            Arrays.MemSetWithOffset((byte[])byArray, (byte)0, (int)n11, (int)(n3 + n4 - n11));
        }
        return n10;
    }

    public static int padPacket(byte[] byArray, int n, int n2, int n3) {
        OpusRepacketizer opusRepacketizer = new OpusRepacketizer();
        if (n2 < 1) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (n2 == n3) {
            return OpusError.OPUS_OK;
        }
        if (n2 > n3) {
            return OpusError.OPUS_BAD_ARG;
        }
        opusRepacketizer.Reset();
        Arrays.MemMove((byte[])byArray, (int)n, (int)(n + n3 - n2), (int)n2);
        opusRepacketizer.addPacket(byArray, n + n3 - n2, n2);
        int n4 = opusRepacketizer.opus_repacketizer_out_range_impl(0, opusRepacketizer.nb_frames, byArray, n, n3, 0, 1);
        if (n4 > 0) {
            return OpusError.OPUS_OK;
        }
        return n4;
    }

    public int addPacket(byte[] byArray, int n, int n2) {
        return this.opus_repacketizer_cat_impl(byArray, n, n2, 0);
    }
}

