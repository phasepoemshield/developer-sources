/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class StereoDecodeState {
    final short[] pred_prev_Q13 = new short[2];
    final short[] sMid = new short[2];
    final short[] sSide = new short[2];

    StereoDecodeState() {
    }

    void Reset() {
        Arrays.MemSet((short[])this.pred_prev_Q13, (short)0, (int)2);
        Arrays.MemSet((short[])this.sMid, (short)0, (int)2);
        Arrays.MemSet((short[])this.sSide, (short)0, (int)2);
    }
}

