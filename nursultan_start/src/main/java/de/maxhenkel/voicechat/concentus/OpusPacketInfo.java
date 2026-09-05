/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.BoxedValueShort
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.BoxedValueShort;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.OpusBandwidth;
import de.maxhenkel.voicechat.concentus.OpusBandwidthHelpers;
import de.maxhenkel.voicechat.concentus.OpusDecoder;
import de.maxhenkel.voicechat.concentus.OpusError;
import de.maxhenkel.voicechat.concentus.OpusException;
import de.maxhenkel.voicechat.concentus.OpusMode;
import java.util.ArrayList;
import java.util.List;

public class OpusPacketInfo {
    public byte TOCByte;
    public List<Byte[]> Frames;
    public int PayloadOffset;

    private OpusPacketInfo(byte by, List<Byte[]> list, int n) {
        this.TOCByte = by;
        this.Frames = list;
        this.PayloadOffset = n;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    static int opus_packet_parse_impl(byte[] byArray, int n, int n2, int n3, BoxedValueByte boxedValueByte, byte[][] byArray2, int n4, short[] sArray, int n5, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2) {
        int n6;
        int n7;
        BoxedValueShort boxedValueShort;
        int n8;
        int n9 = 0;
        int n10 = n;
        boxedValueByte.Val = 0;
        boxedValueInt.Val = 0;
        boxedValueInt2.Val = 0;
        if (sArray == null || n2 < 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (n2 == 0) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        int n11 = OpusPacketInfo.getNumSamplesPerFrame(byArray, n, 48000);
        boolean bl = false;
        byte by = byArray[n++];
        int n12 = --n2;
        switch (by & 3) {
            case 0: {
                n8 = 1;
                break;
            }
            case 1: {
                n8 = 2;
                bl = true;
                if (n3 != 0) break;
                if ((n2 & 1) != 0) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                n12 = n2 / 2;
                sArray[n5] = (short)n12;
                break;
            }
            case 2: {
                n8 = 2;
                boxedValueShort = new BoxedValueShort(sArray[n5]);
                n7 = OpusPacketInfo.parse_size(byArray, n, n2, boxedValueShort);
                sArray[n5] = boxedValueShort.Val;
                if (sArray[n5] < 0 || sArray[n5] > (n2 -= n7)) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                n += n7;
                n12 = n2 - sArray[n5];
                break;
            }
            default: {
                int n13;
                if (n2 < 1) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                if ((n8 = (n13 = Inlines.SignedByteToUnsignedInt((byte)byArray[n++])) & 0x3F) <= 0) return OpusError.OPUS_INVALID_PACKET;
                if (n11 * n8 > 5760) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                --n2;
                if ((n13 & 0x40) != 0) {
                    int n14;
                    do {
                        if (n2 <= 0) {
                            return OpusError.OPUS_INVALID_PACKET;
                        }
                        n14 = Inlines.SignedByteToUnsignedInt((byte)byArray[n++]);
                        --n2;
                        int n15 = n14 == 255 ? 254 : n14;
                        n2 -= n15;
                        n9 += n15;
                    } while (n14 == 255);
                }
                if (n2 < 0) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                boolean bl2 = bl = (n13 & 0x80) == 0;
                if (!bl) {
                    n12 = n2;
                    for (n6 = 0; n6 < n8 - 1; ++n6) {
                        boxedValueShort = new BoxedValueShort(sArray[n5 + n6]);
                        n7 = OpusPacketInfo.parse_size(byArray, n, n2, boxedValueShort);
                        sArray[n5 + n6] = boxedValueShort.Val;
                        if (sArray[n5 + n6] < 0 || sArray[n5 + n6] > (n2 -= n7)) {
                            return OpusError.OPUS_INVALID_PACKET;
                        }
                        n += n7;
                        n12 -= n7 + sArray[n5 + n6];
                    }
                    if (n12 >= 0) break;
                    return OpusError.OPUS_INVALID_PACKET;
                }
                if (n3 != 0) break;
                n12 = n2 / n8;
                if (n12 * n8 != n2) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                for (n6 = 0; n6 < n8 - 1; ++n6) {
                    sArray[n5 + n6] = (short)n12;
                }
            }
        }
        if (n3 != 0) {
            boxedValueShort = new BoxedValueShort(sArray[n5 + n8 - 1]);
            n7 = OpusPacketInfo.parse_size(byArray, n, n2, boxedValueShort);
            sArray[n5 + n8 - 1] = boxedValueShort.Val;
            if (sArray[n5 + n8 - 1] < 0 || sArray[n5 + n8 - 1] > (n2 -= n7)) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            n += n7;
            if (bl) {
                if (sArray[n5 + n8 - 1] * n8 > n2) {
                    return OpusError.OPUS_INVALID_PACKET;
                }
                for (n6 = 0; n6 < n8 - 1; ++n6) {
                    sArray[n5 + n6] = sArray[n5 + n8 - 1];
                }
            } else if (n7 + sArray[n5 + n8 - 1] > n12) {
                return OpusError.OPUS_INVALID_PACKET;
            }
        } else {
            if (n12 > 1275) {
                return OpusError.OPUS_INVALID_PACKET;
            }
            sArray[n5 + n8 - 1] = (short)n12;
        }
        boxedValueInt.Val = n - n10;
        for (n6 = 0; n6 < n8; ++n6) {
            if (byArray2 != null) {
                byArray2[n4 + n6] = new byte[byArray.length - n];
                System.arraycopy(byArray, n, byArray2[n4 + n6], 0, byArray.length - n);
            }
            n += sArray[n5 + n6];
        }
        boxedValueInt2.Val = n9 + (n - n10);
        boxedValueByte.Val = by;
        return n8;
    }

    public static int getNumEncodedChannels(byte[] byArray, int n) {
        return (byArray[n] & 4) != 0 ? 2 : 1;
    }

    public static int getNumSamplesPerFrame(byte[] byArray, int n, int n2) {
        int n3;
        if ((byArray[n] & 0x80) != 0) {
            n3 = byArray[n] >> 3 & 3;
            n3 = (n2 << n3) / 400;
        } else {
            n3 = (byArray[n] & 0x60) == 96 ? ((byArray[n] & 8) != 0 ? n2 / 50 : n2 / 100) : ((n3 = byArray[n] >> 3 & 3) == 3 ? n2 * 60 / 1000 : (n2 << n3) / 100);
        }
        return n3;
    }

    public static OpusBandwidth getBandwidth(byte[] byArray, int n) {
        OpusBandwidth opusBandwidth;
        if ((byArray[n] & 0x80) != 0) {
            opusBandwidth = OpusBandwidthHelpers.GetBandwidth(OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND) + (byArray[n] >> 5 & 3));
            if (opusBandwidth == OpusBandwidth.OPUS_BANDWIDTH_MEDIUMBAND) {
                opusBandwidth = OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND;
            }
        } else {
            opusBandwidth = (byArray[n] & 0x60) == 96 ? ((byArray[n] & 0x10) != 0 ? OpusBandwidth.OPUS_BANDWIDTH_FULLBAND : OpusBandwidth.OPUS_BANDWIDTH_SUPERWIDEBAND) : OpusBandwidthHelpers.GetBandwidth(OpusBandwidthHelpers.GetOrdinal(OpusBandwidth.OPUS_BANDWIDTH_NARROWBAND) + (byArray[n] >> 5 & 3));
        }
        return opusBandwidth;
    }

    public static int getNumFrames(byte[] byArray, int n, int n2) {
        if (n2 < 1) {
            return OpusError.OPUS_BAD_ARG;
        }
        int n3 = byArray[n] & 3;
        if (n3 == 0) {
            return 1;
        }
        if (n3 != 3) {
            return 2;
        }
        if (n2 < 2) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        return byArray[n + 1] & 0x3F;
    }

    public static OpusPacketInfo parseOpusPacket(byte[] byArray, int n, int n2) throws OpusException {
        BoxedValueInt boxedValueInt;
        BoxedValueInt boxedValueInt2;
        short[] sArray;
        BoxedValueByte boxedValueByte = new BoxedValueByte(0);
        int n3 = OpusPacketInfo.getNumFrames(byArray, n, n2);
        byte[][] byArrayArray = new byte[n3][];
        int n4 = OpusPacketInfo.opus_packet_parse_impl(byArray, n, n2, 0, boxedValueByte, byArrayArray, 0, sArray = new short[n3], 0, boxedValueInt2 = new BoxedValueInt(0), boxedValueInt = new BoxedValueInt(0));
        if (n4 < 0) {
            throw new OpusException("An error occurred while parsing the packet", n4);
        }
        ArrayList<Byte[]> arrayList = new ArrayList<Byte[]>();
        for (int i = 0; i < byArrayArray.length; ++i) {
            Byte[] byteArray = new Byte[byArrayArray[i].length];
            for (int j = 0; j < byteArray.length; ++j) {
                byteArray[j] = byArrayArray[i][j];
            }
            arrayList.add(byteArray);
        }
        return new OpusPacketInfo(boxedValueByte.Val, arrayList, boxedValueInt2.Val);
    }

    public static int getNumSamples(byte[] byArray, int n, int n2, int n3) {
        int n4 = OpusPacketInfo.getNumFrames(byArray, n, n2);
        if (n4 < 0) {
            return n4;
        }
        int n5 = n4 * OpusPacketInfo.getNumSamplesPerFrame(byArray, n, n3);
        if (n5 * 25 > n3 * 3) {
            return OpusError.OPUS_INVALID_PACKET;
        }
        return n5;
    }

    public static int getNumSamples(OpusDecoder opusDecoder, byte[] byArray, int n, int n2) {
        return OpusPacketInfo.getNumSamples(byArray, n, n2, opusDecoder.Fs);
    }

    static int encode_size(int n, byte[] byArray, int n2) {
        if (n < 252) {
            byArray[n2] = (byte)(n & 0xFF);
            return 1;
        }
        int n3 = 252 + (n & 3);
        byArray[n2] = (byte)(n3 & 0xFF);
        byArray[n2 + 1] = (byte)(n - n3 >> 2);
        return 2;
    }

    public static OpusMode getEncoderMode(byte[] byArray, int n) {
        OpusMode opusMode = (byArray[n] & 0x80) != 0 ? OpusMode.MODE_CELT_ONLY : ((byArray[n] & 0x60) == 96 ? OpusMode.MODE_HYBRID : OpusMode.MODE_SILK_ONLY);
        return opusMode;
    }

    static int parse_size(byte[] byArray, int n, int n2, BoxedValueShort boxedValueShort) {
        if (n2 < 1) {
            boxedValueShort.Val = (short)-1;
            return -1;
        }
        if (Inlines.SignedByteToUnsignedInt((byte)byArray[n]) < 252) {
            boxedValueShort.Val = (short)Inlines.SignedByteToUnsignedInt((byte)byArray[n]);
            return 1;
        }
        if (n2 < 2) {
            boxedValueShort.Val = (short)-1;
            return -1;
        }
        boxedValueShort.Val = (short)(4 * Inlines.SignedByteToUnsignedInt((byte)byArray[n + 1]) + Inlines.SignedByteToUnsignedInt((byte)byArray[n]));
        return 2;
    }
}

