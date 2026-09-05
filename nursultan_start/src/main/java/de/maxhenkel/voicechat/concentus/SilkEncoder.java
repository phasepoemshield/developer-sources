/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.StereoEncodeState;
import de.maxhenkel.voicechat.concentus.VoiceActivityDetection;

class SilkEncoder {
    final SilkChannelEncoder[] state_Fxx = new SilkChannelEncoder[2];
    final StereoEncodeState sStereo = new StereoEncodeState();
    int nBitsUsedLBRR = 0;
    int nBitsExceeded = 0;
    int nChannelsAPI = 0;
    int nChannelsInternal = 0;
    int nPrevChannelsInternal = 0;
    int timeSinceSwitchAllowed_ms = 0;
    int allowBandwidthSwitch = 0;
    int prev_decode_only_middle = 0;

    SilkEncoder() {
        for (int i = 0; i < 2; ++i) {
            this.state_Fxx[i] = new SilkChannelEncoder();
        }
    }

    void Reset() {
        for (int i = 0; i < 2; ++i) {
            this.state_Fxx[i].Reset();
        }
        this.sStereo.Reset();
        this.nBitsUsedLBRR = 0;
        this.nBitsExceeded = 0;
        this.nChannelsAPI = 0;
        this.nChannelsInternal = 0;
        this.nPrevChannelsInternal = 0;
        this.timeSinceSwitchAllowed_ms = 0;
        this.allowBandwidthSwitch = 0;
        this.prev_decode_only_middle = 0;
    }

    static int silk_init_encoder(SilkChannelEncoder silkChannelEncoder) {
        int n = 0;
        silkChannelEncoder.Reset();
        silkChannelEncoder.variable_HP_smth2_Q15 = silkChannelEncoder.variable_HP_smth1_Q15 = Inlines.silk_LSHIFT((int)(Inlines.silk_lin2log((int)0x3C0000) - 2048), (int)8);
        silkChannelEncoder.first_frame_after_reset = 1;
        return n += VoiceActivityDetection.silk_VAD_Init(silkChannelEncoder.sVAD);
    }
}

