/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class StereoEncodeState {
    final short[] pred_prev_Q13 = new short[2];
    final short[] sMid = new short[2];
    final short[] sSide = new short[2];
    final int[] mid_side_amp_Q0 = new int[4];
    short smth_width_Q14 = 0;
    short width_prev_Q14 = 0;
    short silent_side_len = 0;
    final byte[][][] predIx = Arrays.InitThreeDimensionalArrayByte((int)3, (int)2, (int)3);
    final byte[] mid_only_flags = new byte[3];

    StereoEncodeState() {
    }

    void Reset() {
        Arrays.MemSet((short[])this.pred_prev_Q13, (short)0, (int)2);
        Arrays.MemSet((short[])this.sMid, (short)0, (int)2);
        Arrays.MemSet((short[])this.sSide, (short)0, (int)2);
        Arrays.MemSet((int[])this.mid_side_amp_Q0, (int)0, (int)4);
        this.smth_width_Q14 = 0;
        this.width_prev_Q14 = 0;
        this.silent_side_len = 0;
        for (int i = 0; i < 3; ++i) {
            for (int j = 0; j < 2; ++j) {
                Arrays.MemSet((byte[])this.predIx[i][j], (byte)0, (int)3);
            }
        }
        Arrays.MemSet((byte[])this.mid_only_flags, (byte)0, (int)3);
    }
}

