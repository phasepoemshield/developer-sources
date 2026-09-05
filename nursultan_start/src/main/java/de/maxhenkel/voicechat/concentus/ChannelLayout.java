/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class ChannelLayout {
    int nb_channels;
    int nb_streams;
    int nb_coupled_streams;
    final short[] mapping = new short[256];

    ChannelLayout() {
    }

    void Reset() {
        this.nb_channels = 0;
        this.nb_streams = 0;
        this.nb_coupled_streams = 0;
        Arrays.MemSet(this.mapping, (short)0);
    }
}

