/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Resampler
 *  de.maxhenkel.voicechat.concentus.SilkChannelDecoder
 *  de.maxhenkel.voicechat.concentus.SilkDecoder
 *  de.maxhenkel.voicechat.concentus.SilkError
 *  de.maxhenkel.voicechat.concentus.SilkResamplerState
 *  de.maxhenkel.voicechat.concentus.SilkTables
 *  de.maxhenkel.voicechat.concentus.Stereo
 *  de.maxhenkel.voicechat.concentus.StereoDecodeState
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.DecControlState;
import de.maxhenkel.voicechat.concentus.DecodeIndices;
import de.maxhenkel.voicechat.concentus.DecodePulses;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Resampler;
import de.maxhenkel.voicechat.concentus.SilkChannelDecoder;
import de.maxhenkel.voicechat.concentus.SilkDecoder;
import de.maxhenkel.voicechat.concentus.SilkError;
import de.maxhenkel.voicechat.concentus.SilkResamplerState;
import de.maxhenkel.voicechat.concentus.SilkTables;
import de.maxhenkel.voicechat.concentus.Stereo;
import de.maxhenkel.voicechat.concentus.StereoDecodeState;

class DecodeAPI {
    DecodeAPI() {
    }

    /*
     * Unable to fully structure code
     */
    static int silk_Decode(SilkDecoder var0, DecControlState var1_1, int var2_2, int var3_3, EntropyCoder var4_4, short[] var5_5, int var6_6, BoxedValueInt var7_7) {
        block64: {
            block63: {
                var10_8 = 0;
                var11_9 = SilkError.SILK_NO_ERROR;
                var13_10 = new BoxedValueInt(0);
                var15_11 = new int[2];
                var19_12 = new int[]{0, 0};
                var22_13 = var0.channel_state;
                var7_7.Val = 0;
                Inlines.OpusAssert(var1_1.nChannelsInternal == 1 || var1_1.nChannelsInternal == 2);
                if (var3_3 != 0) {
                    for (var9_14 = 0; var9_14 < var1_1.nChannelsInternal; ++var9_14) {
                        var22_13[var9_14].nFramesDecoded = 0;
                    }
                }
                if (var1_1.nChannelsInternal > var0.nChannelsInternal) {
                    var11_9 += var22_13[1].silk_init_decoder();
                }
                if (var1_1.nChannelsInternal != 1 || var0.nChannelsInternal != 2) ** GOTO lbl-1000
                if (var1_1.internalSampleRate == 1000 * var22_13[0].fs_kHz) {
                    v0 = true;
                } else lbl-1000:
                // 2 sources

                {
                    v0 = var24_15 = false;
                }
                if (var22_13[0].nFramesDecoded == 0) {
                    for (var9_14 = 0; var9_14 < var1_1.nChannelsInternal; ++var9_14) {
                        if (var1_1.payloadSize_ms == 0) {
                            var22_13[var9_14].nFramesPerPacket = 1;
                            var22_13[var9_14].nb_subfr = 2;
                        } else if (var1_1.payloadSize_ms == 10) {
                            var22_13[var9_14].nFramesPerPacket = 1;
                            var22_13[var9_14].nb_subfr = 2;
                        } else if (var1_1.payloadSize_ms == 20) {
                            var22_13[var9_14].nFramesPerPacket = 1;
                            var22_13[var9_14].nb_subfr = 4;
                        } else if (var1_1.payloadSize_ms == 40) {
                            var22_13[var9_14].nFramesPerPacket = 2;
                            var22_13[var9_14].nb_subfr = 4;
                        } else if (var1_1.payloadSize_ms == 60) {
                            var22_13[var9_14].nFramesPerPacket = 3;
                            var22_13[var9_14].nb_subfr = 4;
                        } else {
                            Inlines.OpusAssert(false);
                            return SilkError.SILK_DEC_INVALID_FRAME_SIZE;
                        }
                        var26_16 = (var1_1.internalSampleRate >> 10) + 1;
                        if (var26_16 != 8 && var26_16 != 12 && var26_16 != 16) {
                            Inlines.OpusAssert(false);
                            return SilkError.SILK_DEC_INVALID_SAMPLING_FREQUENCY;
                        }
                        var11_9 += var22_13[var9_14].silk_decoder_set_fs(var26_16, var1_1.API_sampleRate);
                    }
                }
                if (var1_1.nChannelsAPI == 2 && var1_1.nChannelsInternal == 2 && (var0.nChannelsAPI == 1 || var0.nChannelsInternal == 1)) {
                    Arrays.MemSet(var0.sStereo.pred_prev_Q13, (short)0, 2);
                    Arrays.MemSet(var0.sStereo.sSide, (short)0, 2);
                    var22_13[1].resampler_state.Assign(var22_13[0].resampler_state);
                }
                var0.nChannelsAPI = var1_1.nChannelsAPI;
                var0.nChannelsInternal = var1_1.nChannelsInternal;
                if (var1_1.API_sampleRate > 48000) break block63;
                if (var1_1.API_sampleRate >= 8000) break block64;
            }
            var11_9 = SilkError.SILK_DEC_INVALID_SAMPLING_FREQUENCY;
            return var11_9;
        }
        if (var2_2 != 1 && var22_13[0].nFramesDecoded == 0) {
            for (var9_14 = 0; var9_14 < var1_1.nChannelsInternal; ++var9_14) {
                for (var8_22 = 0; var8_22 < var22_13[var9_14].nFramesPerPacket; ++var8_22) {
                    var22_13[var9_14].VAD_flags[var8_22] = var4_4.dec_bit_logp(1L);
                }
                var22_13[var9_14].LBRR_flag = var4_4.dec_bit_logp(1L);
            }
            for (var9_14 = 0; var9_14 < var1_1.nChannelsInternal; ++var9_14) {
                Arrays.MemSet(var22_13[var9_14].LBRR_flags, 0, 3);
                if (var22_13[var9_14].LBRR_flag == 0) continue;
                if (var22_13[var9_14].nFramesPerPacket == 1) {
                    var22_13[var9_14].LBRR_flags[0] = 1;
                    continue;
                }
                var12_23 = var4_4.dec_icdf(SilkTables.silk_LBRR_flags_iCDF_ptr[var22_13[var9_14].nFramesPerPacket - 2], 8) + 1;
                for (var8_22 = 0; var8_22 < var22_13[var9_14].nFramesPerPacket; ++var8_22) {
                    var22_13[var9_14].LBRR_flags[var8_22] = Inlines.silk_RSHIFT(var12_23, var8_22) & 1;
                }
            }
            if (var2_2 == 0) {
                for (var8_22 = 0; var8_22 < var22_13[0].nFramesPerPacket; ++var8_22) {
                    for (var9_14 = 0; var9_14 < var1_1.nChannelsInternal; ++var9_14) {
                        if (var22_13[var9_14].LBRR_flags[var8_22] == 0) continue;
                        var26_17 = new short[320];
                        if (var1_1.nChannelsInternal == 2 && var9_14 == 0) {
                            Stereo.silk_stereo_decode_pred((EntropyCoder)var4_4, (int[])var19_12);
                            if (var22_13[1].LBRR_flags[var8_22] == 0) {
                                var28_25 = new BoxedValueInt(var10_8);
                                Stereo.silk_stereo_decode_mid_only((EntropyCoder)var4_4, (BoxedValueInt)var28_25);
                                var10_8 = var28_25.Val;
                            }
                        }
                        var27_24 = var8_22 > 0 && var22_13[var9_14].LBRR_flags[var8_22 - 1] != 0 ? 2 : 0;
                        DecodeIndices.silk_decode_indices(var22_13[var9_14], var4_4, var8_22, 1, var27_24);
                        DecodePulses.silk_decode_pulses(var4_4, var26_17, var22_13[var9_14].indices.signalType, var22_13[var9_14].indices.quantOffsetType, var22_13[var9_14].frame_length);
                    }
                }
            }
        }
        if (var1_1.nChannelsInternal == 2) {
            if (var2_2 == 0 || var2_2 == 2 && var22_13[0].LBRR_flags[var22_13[0].nFramesDecoded] == 1) {
                Stereo.silk_stereo_decode_pred((EntropyCoder)var4_4, (int[])var19_12);
                if (var2_2 == 0 && var22_13[1].VAD_flags[var22_13[0].nFramesDecoded] == 0 || var2_2 == 2 && var22_13[1].LBRR_flags[var22_13[0].nFramesDecoded] == 0) {
                    var26_18 = new BoxedValueInt(var10_8);
                    Stereo.silk_stereo_decode_mid_only((EntropyCoder)var4_4, (BoxedValueInt)var26_18);
                    var10_8 = var26_18.Val;
                } else {
                    var10_8 = 0;
                }
            } else {
                for (var9_14 = 0; var9_14 < 2; ++var9_14) {
                    var19_12[var9_14] = var0.sStereo.pred_prev_Q13[var9_14];
                }
            }
        }
        if (var1_1.nChannelsInternal == 2 && var10_8 == 0 && var0.prev_decode_only_middle == 1) {
            Arrays.MemSet(var0.channel_state[1].outBuf, (short)0, 480);
            Arrays.MemSet(var0.channel_state[1].sLPC_Q14_buf, 0, 16);
            var0.channel_state[1].lagPrev = 100;
            var0.channel_state[1].LastGainIndex = (byte)10;
            var0.channel_state[1].prevSignalType = 0;
            var0.channel_state[1].first_frame_after_reset = 1;
        }
        v1 = var25_26 = var1_1.internalSampleRate * var1_1.nChannelsInternal < var1_1.API_sampleRate * var1_1.nChannelsAPI;
        if (var25_26) {
            var14_27 = var5_5;
            var15_11[0] = var6_6;
            var15_11[1] = var6_6 + var22_13[0].frame_length + 2;
        } else {
            var16_28 = new short[var1_1.nChannelsInternal * (var22_13[0].frame_length + 2)];
            var14_27 = var16_28;
            var15_11[0] = 0;
            var15_11[1] = var22_13[0].frame_length + 2;
        }
        var23_29 = var2_2 == 0 ? var10_8 == 0 : var0.prev_decode_only_middle == 0 || var1_1.nChannelsInternal == 2 && var2_2 == 2 && var22_13[1].LBRR_flags[var22_13[1].nFramesDecoded] == 1;
        for (var9_14 = 0; var9_14 < var1_1.nChannelsInternal; ++var9_14) {
            if (var9_14 == 0 || var23_29) {
                var26_19 = var22_13[0].nFramesDecoded - var9_14;
                var27_24 = var26_19 <= 0 ? 0 : (var2_2 == 2 ? (var22_13[var9_14].LBRR_flags[var26_19 - 1] != 0 ? 2 : 0) : (var9_14 > 0 && var0.prev_decode_only_middle != 0 ? 1 : 2));
                var11_9 += var22_13[var9_14].silk_decode_frame(var4_4, var14_27, var15_11[var9_14] + 2, var13_10, var2_2, var27_24);
            } else {
                Arrays.MemSetWithOffset(var14_27, (short)0, var15_11[var9_14] + 2, var13_10.Val);
            }
            ++var22_13[var9_14].nFramesDecoded;
        }
        if (var1_1.nChannelsAPI == 2 && var1_1.nChannelsInternal == 2) {
            Stereo.silk_stereo_MS_to_LR((StereoDecodeState)var0.sStereo, (short[])var14_27, (int)var15_11[0], (short[])var14_27, (int)var15_11[1], (int[])var19_12, (int)var22_13[0].fs_kHz, (int)var13_10.Val);
        } else {
            System.arraycopy(var0.sStereo.sMid, 0, var14_27, var15_11[0], 2);
            System.arraycopy(var14_27, var15_11[0] + var13_10.Val, var0.sStereo.sMid, 0, 2);
        }
        var7_7.Val = Inlines.silk_DIV32(var13_10.Val * var1_1.API_sampleRate, Inlines.silk_SMULBB(var22_13[0].fs_kHz, 1000));
        if (var1_1.nChannelsAPI == 2) {
            var18_30 = new short[var7_7.Val];
            var20_31 = var18_30;
            var21_32 = 0;
        } else {
            var20_31 = var5_5;
            var21_32 = var6_6;
        }
        if (var25_26) {
            var17_33 = new short[var1_1.nChannelsInternal * (var22_13[0].frame_length + 2)];
            System.arraycopy(var5_5, var6_6, var17_33, 0, var1_1.nChannelsInternal * (var22_13[0].frame_length + 2));
            var14_27 = var17_33;
            var15_11[0] = 0;
            var15_11[1] = var22_13[0].frame_length + 2;
        }
        for (var9_14 = 0; var9_14 < Inlines.silk_min(var1_1.nChannelsAPI, var1_1.nChannelsInternal); ++var9_14) {
            var11_9 += Resampler.silk_resampler((SilkResamplerState)var22_13[var9_14].resampler_state, (short[])var20_31, (int)var21_32, (short[])var14_27, (int)(var15_11[var9_14] + 1), (int)var13_10.Val);
            if (var1_1.nChannelsAPI != 2) continue;
            var26_20 = var6_6 + var9_14;
            for (var8_22 = 0; var8_22 < var7_7.Val; ++var8_22) {
                var5_5[var26_20 + 2 * var8_22] = var20_31[var21_32 + var8_22];
            }
        }
        if (var1_1.nChannelsAPI == 2 && var1_1.nChannelsInternal == 1) {
            if (var24_15) {
                var11_9 += Resampler.silk_resampler((SilkResamplerState)var22_13[1].resampler_state, (short[])var20_31, (int)var21_32, (short[])var14_27, (int)(var15_11[0] + 1), (int)var13_10.Val);
                for (var8_22 = 0; var8_22 < var7_7.Val; ++var8_22) {
                    var5_5[var6_6 + 1 + 2 * var8_22] = var20_31[var21_32 + var8_22];
                }
            } else {
                for (var8_22 = 0; var8_22 < var7_7.Val; ++var8_22) {
                    var5_5[var6_6 + 1 + 2 * var8_22] = var5_5[var6_6 + 2 * var8_22];
                }
            }
        }
        if (var22_13[0].prevSignalType == 2) {
            var26_21 = new int[]{6, 4, 3};
            var1_1.prevPitchLag = var22_13[0].lagPrev * var26_21[var22_13[0].fs_kHz - 8 >> 2];
        } else {
            var1_1.prevPitchLag = 0;
        }
        if (var2_2 == 1) {
            for (var8_22 = 0; var8_22 < var0.nChannelsInternal; ++var8_22) {
                var0.channel_state[var8_22].LastGainIndex = (byte)10;
            }
        } else {
            var0.prev_decode_only_middle = var10_8;
        }
        return var11_9;
    }

    static int silk_InitDecoder(SilkDecoder silkDecoder) {
        silkDecoder.Reset();
        int n = SilkError.SILK_NO_ERROR;
        SilkChannelDecoder[] silkChannelDecoderArray = silkDecoder.channel_state;
        for (int i = 0; i < 2; ++i) {
            n = silkChannelDecoderArray[i].silk_init_decoder();
        }
        silkDecoder.sStereo.Reset();
        silkDecoder.prev_decode_only_middle = 0;
        return n;
    }
}

