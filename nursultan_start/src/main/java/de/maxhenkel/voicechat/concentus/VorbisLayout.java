/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

class VorbisLayout {
    int nb_streams;
    int nb_coupled_streams;
    short[] mapping;
    static final VorbisLayout[] vorbis_mappings = new VorbisLayout[]{new VorbisLayout(1, 0, new short[]{0}), new VorbisLayout(1, 1, new short[]{0, 1}), new VorbisLayout(2, 1, new short[]{0, 2, 1}), new VorbisLayout(2, 2, new short[]{0, 1, 2, 3}), new VorbisLayout(3, 2, new short[]{0, 4, 1, 2, 3}), new VorbisLayout(4, 2, new short[]{0, 4, 1, 2, 3, 5}), new VorbisLayout(4, 3, new short[]{0, 4, 1, 2, 3, 5, 6}), new VorbisLayout(5, 3, new short[]{0, 6, 1, 2, 3, 4, 5, 7})};

    VorbisLayout(int n, int n2, short[] sArray) {
        this.nb_streams = n;
        this.nb_coupled_streams = n2;
        this.mapping = sArray;
    }
}

