/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class SilkDecoderControl {
    final int[] pitchL = new int[4];
    final int[] Gains_Q16 = new int[4];
    final short[][] PredCoef_Q12 = Arrays.InitTwoDimensionalArrayShort((int)2, (int)16);
    final short[] LTPCoef_Q14 = new short[20];
    int LTP_scale_Q14 = 0;

    SilkDecoderControl() {
    }

    void Reset() {
        Arrays.MemSet((int[])this.pitchL, (int)0, (int)4);
        Arrays.MemSet((int[])this.Gains_Q16, (int)0, (int)4);
        Arrays.MemSet((short[])this.PredCoef_Q12[0], (short)0, (int)16);
        Arrays.MemSet((short[])this.PredCoef_Q12[1], (short)0, (int)16);
        Arrays.MemSet((short[])this.LTPCoef_Q14, (short)0, (int)20);
        this.LTP_scale_Q14 = 0;
    }
}

