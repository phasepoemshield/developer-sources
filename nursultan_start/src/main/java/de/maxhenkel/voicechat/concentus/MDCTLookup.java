/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.FFTState
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.FFTState;

class MDCTLookup {
    int n = 0;
    int maxshift = 0;
    FFTState[] kfft = new FFTState[4];
    short[] trig = null;

    MDCTLookup() {
    }
}

