/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class TOCStruct {
    int VADFlag = 0;
    final int[] VADFlags = new int[3];
    int inbandFECFlag = 0;

    TOCStruct() {
    }

    void Reset() {
        this.VADFlag = 0;
        Arrays.MemSet((int[])this.VADFlags, (int)0, (int)3);
        this.inbandFECFlag = 0;
    }
}

