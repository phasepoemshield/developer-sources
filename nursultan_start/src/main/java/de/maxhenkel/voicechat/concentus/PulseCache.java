/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

class PulseCache {
    int size = 0;
    short[] index = null;
    short[] bits = null;
    short[] caps = null;

    PulseCache() {
    }

    void Reset() {
        this.size = 0;
        this.index = null;
        this.bits = null;
        this.caps = null;
    }
}

