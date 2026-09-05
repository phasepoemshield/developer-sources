/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class SilkVADState {
    final int[] AnaState = new int[2];
    final int[] AnaState1 = new int[2];
    final int[] AnaState2 = new int[2];
    final int[] XnrgSubfr = new int[4];
    final int[] NrgRatioSmth_Q8 = new int[4];
    short HPstate = 0;
    final int[] NL = new int[4];
    final int[] inv_NL = new int[4];
    final int[] NoiseLevelBias = new int[4];
    int counter = 0;

    SilkVADState() {
    }

    void Reset() {
        Arrays.MemSet((int[])this.AnaState, (int)0, (int)2);
        Arrays.MemSet((int[])this.AnaState1, (int)0, (int)2);
        Arrays.MemSet((int[])this.AnaState2, (int)0, (int)2);
        Arrays.MemSet((int[])this.XnrgSubfr, (int)0, (int)4);
        Arrays.MemSet((int[])this.NrgRatioSmth_Q8, (int)0, (int)4);
        this.HPstate = 0;
        Arrays.MemSet((int[])this.NL, (int)0, (int)4);
        Arrays.MemSet((int[])this.inv_NL, (int)0, (int)4);
        Arrays.MemSet((int[])this.NoiseLevelBias, (int)0, (int)4);
        this.counter = 0;
    }
}

