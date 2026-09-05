/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.ChannelLayout
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.ChannelLayout;

class OpusMultistream {
    OpusMultistream() {
    }

    static int get_mono_channel(ChannelLayout channelLayout, int n, int n2) {
        int n3;
        int n4 = n3 = n2 < 0 ? 0 : n2 + 1;
        while (n3 < channelLayout.nb_channels) {
            if (channelLayout.mapping[n3] == n + channelLayout.nb_coupled_streams) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    static int get_right_channel(ChannelLayout channelLayout, int n, int n2) {
        int n3;
        int n4 = n3 = n2 < 0 ? 0 : n2 + 1;
        while (n3 < channelLayout.nb_channels) {
            if (channelLayout.mapping[n3] == n * 2 + 1) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    static int get_left_channel(ChannelLayout channelLayout, int n, int n2) {
        int n3;
        int n4 = n3 = n2 < 0 ? 0 : n2 + 1;
        while (n3 < channelLayout.nb_channels) {
            if (channelLayout.mapping[n3] == n * 2) {
                return n3;
            }
            ++n3;
        }
        return -1;
    }

    static int validate_layout(ChannelLayout channelLayout) {
        int n = channelLayout.nb_streams + channelLayout.nb_coupled_streams;
        if (n > 255) {
            return 0;
        }
        for (int i = 0; i < channelLayout.nb_channels; ++i) {
            if (channelLayout.mapping[i] < n) continue;
            if (channelLayout.mapping[i] == 255) continue;
            return 0;
        }
        return 1;
    }
}

