/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.SilkChannelDecoder;
import de.maxhenkel.voicechat.concentus.StereoDecodeState;

class SilkDecoder {
    final SilkChannelDecoder[] channel_state = new SilkChannelDecoder[2];
    final StereoDecodeState sStereo = new StereoDecodeState();
    int nChannelsAPI = 0;
    int nChannelsInternal = 0;
    int prev_decode_only_middle = 0;

    SilkDecoder() {
        for (int i = 0; i < 2; ++i) {
            this.channel_state[i] = new SilkChannelDecoder();
        }
    }

    void Reset() {
        for (int i = 0; i < 2; ++i) {
            this.channel_state[i].Reset();
        }
        this.sStereo.Reset();
        this.nChannelsAPI = 0;
        this.nChannelsInternal = 0;
        this.prev_decode_only_middle = 0;
    }
}

