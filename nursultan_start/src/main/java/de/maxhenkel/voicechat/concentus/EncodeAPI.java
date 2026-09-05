/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Resampler
 *  de.maxhenkel.voicechat.concentus.SilkChannelEncoder
 *  de.maxhenkel.voicechat.concentus.SilkEncoder
 *  de.maxhenkel.voicechat.concentus.SilkError
 *  de.maxhenkel.voicechat.concentus.SilkResamplerState
 *  de.maxhenkel.voicechat.concentus.SilkTables
 *  de.maxhenkel.voicechat.concentus.Stereo
 *  de.maxhenkel.voicechat.concentus.StereoEncodeState
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.EncControlState;
import de.maxhenkel.voicechat.concentus.EncodeIndices;
import de.maxhenkel.voicechat.concentus.EncodePulses;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.HPVariableCutoff;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Resampler;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkEncoder;
import de.maxhenkel.voicechat.concentus.SilkError;
import de.maxhenkel.voicechat.concentus.SilkResamplerState;
import de.maxhenkel.voicechat.concentus.SilkTables;
import de.maxhenkel.voicechat.concentus.Stereo;
import de.maxhenkel.voicechat.concentus.StereoEncodeState;

class EncodeAPI {
    EncodeAPI() {
    }

    static int silk_QueryEncoder(SilkEncoder silkEncoder, EncControlState encControlState) {
        int n = SilkError.SILK_NO_ERROR;
        SilkChannelEncoder silkChannelEncoder = silkEncoder.state_Fxx[0];
        encControlState.Reset();
        encControlState.nChannelsAPI = silkEncoder.nChannelsAPI;
        encControlState.nChannelsInternal = silkEncoder.nChannelsInternal;
        encControlState.API_sampleRate = silkChannelEncoder.API_fs_Hz;
        encControlState.maxInternalSampleRate = silkChannelEncoder.maxInternal_fs_Hz;
        encControlState.minInternalSampleRate = silkChannelEncoder.minInternal_fs_Hz;
        encControlState.desiredInternalSampleRate = silkChannelEncoder.desiredInternal_fs_Hz;
        encControlState.payloadSize_ms = silkChannelEncoder.PacketSize_ms;
        encControlState.bitRate = silkChannelEncoder.TargetRate_bps;
        encControlState.packetLossPercentage = silkChannelEncoder.PacketLoss_perc;
        encControlState.complexity = silkChannelEncoder.Complexity;
        encControlState.useInBandFEC = silkChannelEncoder.useInBandFEC;
        encControlState.useDTX = silkChannelEncoder.useDTX;
        encControlState.useCBR = silkChannelEncoder.useCBR;
        encControlState.internalSampleRate = Inlines.silk_SMULBB(silkChannelEncoder.fs_kHz, 1000);
        encControlState.allowBandwidthSwitch = silkChannelEncoder.allow_bandwidth_switch;
        encControlState.inWBmodeWithoutVariableLP = silkChannelEncoder.fs_kHz == 16 && silkChannelEncoder.sLP.mode == 0 ? 1 : 0;
        return n;
    }

    static int silk_Encode(SilkEncoder silkEncoder, EncControlState encControlState, short[] sArray, int n, EntropyCoder entropyCoder, BoxedValueInt boxedValueInt, int n2) {
        int n3;
        int n4;
        int n5;
        int n6 = SilkError.SILK_NO_ERROR;
        int n7 = 0;
        int n8 = 0;
        int n9 = 0;
        int[] nArray = new int[2];
        boxedValueInt.Val = 0;
        if (encControlState.reducedDependency != 0) {
            silkEncoder.state_Fxx[0].first_frame_after_reset = 1;
            silkEncoder.state_Fxx[1].first_frame_after_reset = 1;
        }
        silkEncoder.state_Fxx[1].nFramesEncoded = 0;
        silkEncoder.state_Fxx[0].nFramesEncoded = 0;
        if ((n6 += encControlState.check_control_input()) != SilkError.SILK_NO_ERROR) {
            Inlines.OpusAssert(false);
            return n6;
        }
        encControlState.switchReady = 0;
        if (encControlState.nChannelsInternal > silkEncoder.nChannelsInternal) {
            n6 += SilkEncoder.silk_init_encoder((SilkChannelEncoder)silkEncoder.state_Fxx[1]);
            Arrays.MemSet(silkEncoder.sStereo.pred_prev_Q13, (short)0, 2);
            Arrays.MemSet(silkEncoder.sStereo.sSide, (short)0, 2);
            silkEncoder.sStereo.mid_side_amp_Q0[0] = 0;
            silkEncoder.sStereo.mid_side_amp_Q0[1] = 1;
            silkEncoder.sStereo.mid_side_amp_Q0[2] = 0;
            silkEncoder.sStereo.mid_side_amp_Q0[3] = 1;
            silkEncoder.sStereo.width_prev_Q14 = 0;
            silkEncoder.sStereo.smth_width_Q14 = (short)16384;
            if (silkEncoder.nChannelsAPI == 2) {
                silkEncoder.state_Fxx[1].resampler_state.Assign(silkEncoder.state_Fxx[0].resampler_state);
                System.arraycopy(silkEncoder.state_Fxx[0].In_HP_State, 0, silkEncoder.state_Fxx[1].In_HP_State, 0, 2);
            }
        }
        boolean bl = encControlState.payloadSize_ms != silkEncoder.state_Fxx[0].PacketSize_ms || silkEncoder.nChannelsInternal != encControlState.nChannelsInternal;
        silkEncoder.nChannelsAPI = encControlState.nChannelsAPI;
        silkEncoder.nChannelsInternal = encControlState.nChannelsInternal;
        int n10 = Inlines.silk_DIV32(100 * n, encControlState.API_sampleRate);
        int n11 = n10 > 1 ? n10 >> 1 : 1;
        int n12 = 0;
        if (n2 != 0) {
            if (n10 != 1) {
                Inlines.OpusAssert(false);
                return SilkError.SILK_ENC_INPUT_INVALID_NO_OF_SAMPLES;
            }
            for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
                Inlines.OpusAssert((n6 += SilkEncoder.silk_init_encoder((SilkChannelEncoder)silkEncoder.state_Fxx[n5])) == SilkError.SILK_NO_ERROR);
            }
            n7 = encControlState.payloadSize_ms;
            encControlState.payloadSize_ms = 10;
            n8 = encControlState.complexity;
            encControlState.complexity = 0;
            for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
                silkEncoder.state_Fxx[n5].controlled_since_last_payload = 0;
                silkEncoder.state_Fxx[n5].prefillFlag = 1;
            }
        } else {
            if (n10 * encControlState.API_sampleRate != 100 * n || n < 0) {
                Inlines.OpusAssert(false);
                return SilkError.SILK_ENC_INPUT_INVALID_NO_OF_SAMPLES;
            }
            if (1000 * n > encControlState.payloadSize_ms * encControlState.API_sampleRate) {
                Inlines.OpusAssert(false);
                return SilkError.SILK_ENC_INPUT_INVALID_NO_OF_SAMPLES;
            }
        }
        int n13 = Inlines.silk_RSHIFT32(encControlState.bitRate, encControlState.nChannelsInternal - 1);
        for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
            int n14 = n4 = n5 == 1 ? silkEncoder.state_Fxx[0].fs_kHz : 0;
            if ((n6 += silkEncoder.state_Fxx[n5].silk_control_encoder(encControlState, n13, silkEncoder.allowBandwidthSwitch, n5, n4)) != SilkError.SILK_NO_ERROR) {
                Inlines.OpusAssert(false);
                return n6;
            }
            if (silkEncoder.state_Fxx[n5].first_frame_after_reset != 0 || bl) {
                for (n3 = 0; n3 < silkEncoder.state_Fxx[0].nFramesPerPacket; ++n3) {
                    silkEncoder.state_Fxx[n5].LBRR_flags[n3] = 0;
                }
            }
            silkEncoder.state_Fxx[n5].inDTX = silkEncoder.state_Fxx[n5].useDTX;
        }
        Inlines.OpusAssert(encControlState.nChannelsInternal == 1 || silkEncoder.state_Fxx[0].fs_kHz == silkEncoder.state_Fxx[1].fs_kHz);
        int n15 = 10 * n10 * silkEncoder.state_Fxx[0].fs_kHz;
        int n16 = Inlines.silk_DIV32_16(n15 * silkEncoder.state_Fxx[0].API_fs_Hz, (short)(silkEncoder.state_Fxx[0].fs_kHz * 1000));
        short[] sArray2 = new short[n16];
        n4 = 0;
        while (true) {
            int n17;
            int n18;
            int n19 = silkEncoder.state_Fxx[0].frame_length - silkEncoder.state_Fxx[0].inputBufIx;
            n19 = Inlines.silk_min(n19, n15);
            n9 = Inlines.silk_DIV32_16(n19 * silkEncoder.state_Fxx[0].API_fs_Hz, silkEncoder.state_Fxx[0].fs_kHz * 1000);
            if (encControlState.nChannelsAPI == 2 && encControlState.nChannelsInternal == 2) {
                n18 = silkEncoder.state_Fxx[0].nFramesEncoded;
                for (n5 = 0; n5 < n9; ++n5) {
                    sArray2[n5] = sArray[n4 + 2 * n5];
                }
                if (silkEncoder.nPrevChannelsInternal == 1 && n18 == 0) {
                    silkEncoder.state_Fxx[1].resampler_state.Assign(silkEncoder.state_Fxx[0].resampler_state);
                }
                n6 += Resampler.silk_resampler((SilkResamplerState)silkEncoder.state_Fxx[0].resampler_state, (short[])silkEncoder.state_Fxx[0].inputBuf, (int)(silkEncoder.state_Fxx[0].inputBufIx + 2), (short[])sArray2, (int)0, (int)n9);
                silkEncoder.state_Fxx[0].inputBufIx += n19;
                n19 = silkEncoder.state_Fxx[1].frame_length - silkEncoder.state_Fxx[1].inputBufIx;
                n19 = Inlines.silk_min(n19, 10 * n10 * silkEncoder.state_Fxx[1].fs_kHz);
                for (n5 = 0; n5 < n9; ++n5) {
                    sArray2[n5] = sArray[n4 + 2 * n5 + 1];
                }
                n6 += Resampler.silk_resampler((SilkResamplerState)silkEncoder.state_Fxx[1].resampler_state, (short[])silkEncoder.state_Fxx[1].inputBuf, (int)(silkEncoder.state_Fxx[1].inputBufIx + 2), (short[])sArray2, (int)0, (int)n9);
                silkEncoder.state_Fxx[1].inputBufIx += n19;
            } else if (encControlState.nChannelsAPI == 2 && encControlState.nChannelsInternal == 1) {
                for (n5 = 0; n5 < n9; ++n5) {
                    int n20 = sArray[n4 + 2 * n5] + sArray[n4 + 2 * n5 + 1];
                    sArray2[n5] = (short)Inlines.silk_RSHIFT_ROUND(n20, 1);
                }
                n6 += Resampler.silk_resampler((SilkResamplerState)silkEncoder.state_Fxx[0].resampler_state, (short[])silkEncoder.state_Fxx[0].inputBuf, (int)(silkEncoder.state_Fxx[0].inputBufIx + 2), (short[])sArray2, (int)0, (int)n9);
                if (silkEncoder.nPrevChannelsInternal == 2 && silkEncoder.state_Fxx[0].nFramesEncoded == 0) {
                    n6 += Resampler.silk_resampler((SilkResamplerState)silkEncoder.state_Fxx[1].resampler_state, (short[])silkEncoder.state_Fxx[1].inputBuf, (int)(silkEncoder.state_Fxx[1].inputBufIx + 2), (short[])sArray2, (int)0, (int)n9);
                    for (n5 = 0; n5 < silkEncoder.state_Fxx[0].frame_length; ++n5) {
                        silkEncoder.state_Fxx[0].inputBuf[silkEncoder.state_Fxx[0].inputBufIx + n5 + 2] = (short)Inlines.silk_RSHIFT(silkEncoder.state_Fxx[0].inputBuf[silkEncoder.state_Fxx[0].inputBufIx + n5 + 2] + silkEncoder.state_Fxx[1].inputBuf[silkEncoder.state_Fxx[1].inputBufIx + n5 + 2], 1);
                    }
                }
                silkEncoder.state_Fxx[0].inputBufIx += n19;
            } else {
                Inlines.OpusAssert(encControlState.nChannelsAPI == 1 && encControlState.nChannelsInternal == 1);
                System.arraycopy(sArray, n4, sArray2, 0, n9);
                n6 += Resampler.silk_resampler((SilkResamplerState)silkEncoder.state_Fxx[0].resampler_state, (short[])silkEncoder.state_Fxx[0].inputBuf, (int)(silkEncoder.state_Fxx[0].inputBufIx + 2), (short[])sArray2, (int)0, (int)n9);
                silkEncoder.state_Fxx[0].inputBufIx += n19;
            }
            n4 += n9 * encControlState.nChannelsAPI;
            n -= n9;
            silkEncoder.allowBandwidthSwitch = 0;
            if (silkEncoder.state_Fxx[0].inputBufIx < silkEncoder.state_Fxx[0].frame_length) break;
            Inlines.OpusAssert(silkEncoder.state_Fxx[0].inputBufIx == silkEncoder.state_Fxx[0].frame_length);
            Inlines.OpusAssert(encControlState.nChannelsInternal == 1 || silkEncoder.state_Fxx[1].inputBufIx == silkEncoder.state_Fxx[1].frame_length);
            if (silkEncoder.state_Fxx[0].nFramesEncoded == 0 && n2 == 0) {
                short[] sArray3 = new short[]{0, 0};
                sArray3[0] = (short)(256 - Inlines.silk_RSHIFT(256, (silkEncoder.state_Fxx[0].nFramesPerPacket + 1) * encControlState.nChannelsInternal));
                entropyCoder.enc_icdf(0, sArray3, 8);
                for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
                    int n21 = 0;
                    for (n3 = 0; n3 < silkEncoder.state_Fxx[n5].nFramesPerPacket; ++n3) {
                        n21 |= Inlines.silk_LSHIFT(silkEncoder.state_Fxx[n5].LBRR_flags[n3], n3);
                    }
                    silkEncoder.state_Fxx[n5].LBRR_flag = (byte)(n21 > 0 ? 1 : 0);
                    if (n21 == 0 || silkEncoder.state_Fxx[n5].nFramesPerPacket <= 1) continue;
                    entropyCoder.enc_icdf(n21 - 1, SilkTables.silk_LBRR_flags_iCDF_ptr[silkEncoder.state_Fxx[n5].nFramesPerPacket - 2], 8);
                }
                for (n3 = 0; n3 < silkEncoder.state_Fxx[0].nFramesPerPacket; ++n3) {
                    for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
                        if (silkEncoder.state_Fxx[n5].LBRR_flags[n3] == 0) continue;
                        if (encControlState.nChannelsInternal == 2 && n5 == 0) {
                            Stereo.silk_stereo_encode_pred((EntropyCoder)entropyCoder, (byte[][])silkEncoder.sStereo.predIx[n3]);
                            if (silkEncoder.state_Fxx[1].LBRR_flags[n3] == 0) {
                                Stereo.silk_stereo_encode_mid_only((EntropyCoder)entropyCoder, (byte)silkEncoder.sStereo.mid_only_flags[n3]);
                            }
                        }
                        n17 = n3 > 0 && silkEncoder.state_Fxx[n5].LBRR_flags[n3 - 1] != 0 ? 2 : 0;
                        EncodeIndices.silk_encode_indices(silkEncoder.state_Fxx[n5], entropyCoder, n3, 1, n17);
                        EncodePulses.silk_encode_pulses(entropyCoder, silkEncoder.state_Fxx[n5].indices_LBRR[n3].signalType, silkEncoder.state_Fxx[n5].indices_LBRR[n3].quantOffsetType, silkEncoder.state_Fxx[n5].pulses_LBRR[n3], silkEncoder.state_Fxx[n5].frame_length);
                    }
                }
                for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
                    Arrays.MemSet(silkEncoder.state_Fxx[n5].LBRR_flags, 0, 3);
                }
                silkEncoder.nBitsUsedLBRR = entropyCoder.tell();
            }
            HPVariableCutoff.silk_HP_variable_cutoff(silkEncoder.state_Fxx);
            int n22 = Inlines.silk_DIV32_16(Inlines.silk_MUL(encControlState.bitRate, encControlState.payloadSize_ms), 1000);
            if (n2 == 0) {
                n22 -= silkEncoder.nBitsUsedLBRR;
            }
            n22 = Inlines.silk_DIV32_16(n22, silkEncoder.state_Fxx[0].nFramesPerPacket);
            n13 = encControlState.payloadSize_ms == 10 ? Inlines.silk_SMULBB(n22, 100) : Inlines.silk_SMULBB(n22, 50);
            n13 -= Inlines.silk_DIV32_16(Inlines.silk_MUL(silkEncoder.nBitsExceeded, 1000), 500);
            if (n2 == 0 && silkEncoder.state_Fxx[0].nFramesEncoded > 0) {
                n18 = entropyCoder.tell() - silkEncoder.nBitsUsedLBRR - n22 * silkEncoder.state_Fxx[0].nFramesEncoded;
                n13 -= Inlines.silk_DIV32_16(Inlines.silk_MUL(n18, 1000), 500);
            }
            n13 = Inlines.silk_LIMIT(n13, encControlState.bitRate, 5000);
            if (encControlState.nChannelsInternal == 2) {
                BoxedValueByte boxedValueByte = new BoxedValueByte(silkEncoder.sStereo.mid_only_flags[silkEncoder.state_Fxx[0].nFramesEncoded]);
                Stereo.silk_stereo_LR_to_MS((StereoEncodeState)silkEncoder.sStereo, (short[])silkEncoder.state_Fxx[0].inputBuf, (int)2, (short[])silkEncoder.state_Fxx[1].inputBuf, (int)2, (byte[][])silkEncoder.sStereo.predIx[silkEncoder.state_Fxx[0].nFramesEncoded], (BoxedValueByte)boxedValueByte, (int[])nArray, (int)n13, (int)silkEncoder.state_Fxx[0].speech_activity_Q8, (int)encControlState.toMono, (int)silkEncoder.state_Fxx[0].fs_kHz, (int)silkEncoder.state_Fxx[0].frame_length);
                silkEncoder.sStereo.mid_only_flags[silkEncoder.state_Fxx[0].nFramesEncoded] = boxedValueByte.Val;
                if (boxedValueByte.Val == 0) {
                    if (silkEncoder.prev_decode_only_middle == 1) {
                        silkEncoder.state_Fxx[1].sShape.Reset();
                        silkEncoder.state_Fxx[1].sPrefilt.Reset();
                        silkEncoder.state_Fxx[1].sNSQ.Reset();
                        Arrays.MemSet(silkEncoder.state_Fxx[1].prev_NLSFq_Q15, (short)0, 16);
                        Arrays.MemSet(silkEncoder.state_Fxx[1].sLP.In_LP_State, 0, 2);
                        silkEncoder.state_Fxx[1].prevLag = 100;
                        silkEncoder.state_Fxx[1].sNSQ.lagPrev = 100;
                        silkEncoder.state_Fxx[1].sShape.LastGainIndex = (byte)10;
                        silkEncoder.state_Fxx[1].prevSignalType = 0;
                        silkEncoder.state_Fxx[1].sNSQ.prev_gain_Q16 = 65536;
                        silkEncoder.state_Fxx[1].first_frame_after_reset = 1;
                    }
                    silkEncoder.state_Fxx[1].silk_encode_do_VAD();
                } else {
                    silkEncoder.state_Fxx[1].VAD_flags[silkEncoder.state_Fxx[0].nFramesEncoded] = 0;
                }
                if (n2 == 0) {
                    Stereo.silk_stereo_encode_pred((EntropyCoder)entropyCoder, (byte[][])silkEncoder.sStereo.predIx[silkEncoder.state_Fxx[0].nFramesEncoded]);
                    if (silkEncoder.state_Fxx[1].VAD_flags[silkEncoder.state_Fxx[0].nFramesEncoded] == 0) {
                        Stereo.silk_stereo_encode_mid_only((EntropyCoder)entropyCoder, (byte)silkEncoder.sStereo.mid_only_flags[silkEncoder.state_Fxx[0].nFramesEncoded]);
                    }
                }
            } else {
                System.arraycopy(silkEncoder.sStereo.sMid, 0, silkEncoder.state_Fxx[0].inputBuf, 0, 2);
                System.arraycopy(silkEncoder.state_Fxx[0].inputBuf, silkEncoder.state_Fxx[0].frame_length, silkEncoder.sStereo.sMid, 0, 2);
            }
            silkEncoder.state_Fxx[0].silk_encode_do_VAD();
            for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
                int n23;
                int n24 = encControlState.maxBits;
                if (n11 == 2 && n12 == 0) {
                    n24 = n24 * 3 / 5;
                } else if (n11 == 3) {
                    if (n12 == 0) {
                        n24 = n24 * 2 / 5;
                    } else if (n12 == 1) {
                        n24 = n24 * 3 / 4;
                    }
                }
                int n25 = n17 = encControlState.useCBR != 0 && n12 == n11 - 1 ? 1 : 0;
                if (encControlState.nChannelsInternal == 1) {
                    n23 = n13;
                } else {
                    n23 = nArray[n5];
                    if (n5 == 0 && nArray[1] > 0) {
                        n17 = 0;
                        n24 -= encControlState.maxBits / (n11 * 2);
                    }
                }
                if (n23 > 0) {
                    silkEncoder.state_Fxx[n5].silk_control_SNR(n23);
                    int n26 = silkEncoder.state_Fxx[0].nFramesEncoded - n5 <= 0 ? 0 : (n5 > 0 && silkEncoder.prev_decode_only_middle != 0 ? 1 : 2);
                    Inlines.OpusAssert((n6 += silkEncoder.state_Fxx[n5].silk_encode_frame(boxedValueInt, entropyCoder, n26, n24, n17)) == SilkError.SILK_NO_ERROR);
                }
                silkEncoder.state_Fxx[n5].controlled_since_last_payload = 0;
                silkEncoder.state_Fxx[n5].inputBufIx = 0;
                ++silkEncoder.state_Fxx[n5].nFramesEncoded;
            }
            silkEncoder.prev_decode_only_middle = silkEncoder.sStereo.mid_only_flags[silkEncoder.state_Fxx[0].nFramesEncoded - 1];
            if (boxedValueInt.Val > 0 && silkEncoder.state_Fxx[0].nFramesEncoded == silkEncoder.state_Fxx[0].nFramesPerPacket) {
                int n27 = 0;
                for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
                    for (n3 = 0; n3 < silkEncoder.state_Fxx[n5].nFramesPerPacket; ++n3) {
                        n27 = Inlines.silk_LSHIFT(n27, 1);
                        n27 |= silkEncoder.state_Fxx[n5].VAD_flags[n3];
                    }
                    n27 = Inlines.silk_LSHIFT(n27, 1);
                    n27 |= silkEncoder.state_Fxx[n5].LBRR_flag;
                }
                if (n2 == 0) {
                    entropyCoder.enc_patch_initial_bits(n27, (silkEncoder.state_Fxx[0].nFramesPerPacket + 1) * encControlState.nChannelsInternal);
                }
                if (silkEncoder.state_Fxx[0].inDTX != 0 && (encControlState.nChannelsInternal == 1 || silkEncoder.state_Fxx[1].inDTX != 0)) {
                    boxedValueInt.Val = 0;
                }
                silkEncoder.nBitsExceeded += boxedValueInt.Val * 8;
                silkEncoder.nBitsExceeded -= Inlines.silk_DIV32_16(Inlines.silk_MUL(encControlState.bitRate, encControlState.payloadSize_ms), 1000);
                silkEncoder.nBitsExceeded = Inlines.silk_LIMIT(silkEncoder.nBitsExceeded, 0, 10000);
                int n28 = Inlines.silk_SMLAWB(13, 3188, silkEncoder.timeSinceSwitchAllowed_ms);
                if (silkEncoder.state_Fxx[0].speech_activity_Q8 < n28) {
                    silkEncoder.allowBandwidthSwitch = 1;
                    silkEncoder.timeSinceSwitchAllowed_ms = 0;
                } else {
                    silkEncoder.allowBandwidthSwitch = 0;
                    silkEncoder.timeSinceSwitchAllowed_ms += encControlState.payloadSize_ms;
                }
            }
            if (n == 0) break;
            ++n12;
        }
        silkEncoder.nPrevChannelsInternal = encControlState.nChannelsInternal;
        encControlState.allowBandwidthSwitch = silkEncoder.allowBandwidthSwitch;
        encControlState.inWBmodeWithoutVariableLP = silkEncoder.state_Fxx[0].fs_kHz == 16 && silkEncoder.state_Fxx[0].sLP.mode == 0 ? 1 : 0;
        encControlState.internalSampleRate = Inlines.silk_SMULBB(silkEncoder.state_Fxx[0].fs_kHz, 1000);
        int n29 = encControlState.stereoWidth_Q14 = encControlState.toMono != 0 ? 0 : (int)silkEncoder.sStereo.smth_width_Q14;
        if (n2 != 0) {
            encControlState.payloadSize_ms = n7;
            encControlState.complexity = n8;
            for (n5 = 0; n5 < encControlState.nChannelsInternal; ++n5) {
                silkEncoder.state_Fxx[n5].controlled_since_last_payload = 0;
                silkEncoder.state_Fxx[n5].prefillFlag = 0;
            }
        }
        return n6;
    }

    static int silk_InitEncoder(SilkEncoder silkEncoder, EncControlState encControlState) {
        int n = SilkError.SILK_NO_ERROR;
        silkEncoder.Reset();
        for (int i = 0; i < 2; ++i) {
            Inlines.OpusAssert((n += SilkEncoder.silk_init_encoder((SilkChannelEncoder)silkEncoder.state_Fxx[i])) == SilkError.SILK_NO_ERROR);
        }
        silkEncoder.nChannelsAPI = 1;
        silkEncoder.nChannelsInternal = 1;
        Inlines.OpusAssert((n += EncodeAPI.silk_QueryEncoder(silkEncoder, encControlState)) == SilkError.SILK_NO_ERROR);
        return n;
    }
}

