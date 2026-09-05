/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class SideInfoIndices {
    final byte[] GainsIndices = new byte[4];
    final byte[] LTPIndex = new byte[4];
    final byte[] NLSFIndices = new byte[17];
    short lagIndex = 0;
    byte contourIndex = 0;
    byte signalType = 0;
    byte quantOffsetType = 0;
    byte NLSFInterpCoef_Q2 = 0;
    byte PERIndex = 0;
    byte LTP_scaleIndex = 0;
    byte Seed = 0;

    SideInfoIndices() {
    }

    void Reset() {
        Arrays.MemSet((byte[])this.GainsIndices, (byte)0, (int)4);
        Arrays.MemSet((byte[])this.LTPIndex, (byte)0, (int)4);
        Arrays.MemSet((byte[])this.NLSFIndices, (byte)0, (int)17);
        this.lagIndex = 0;
        this.contourIndex = 0;
        this.signalType = 0;
        this.quantOffsetType = 0;
        this.NLSFInterpCoef_Q2 = 0;
        this.PERIndex = 0;
        this.LTP_scaleIndex = 0;
        this.Seed = 0;
    }

    void Assign(SideInfoIndices sideInfoIndices) {
        System.arraycopy(sideInfoIndices.GainsIndices, 0, this.GainsIndices, 0, 4);
        System.arraycopy(sideInfoIndices.LTPIndex, 0, this.LTPIndex, 0, 4);
        System.arraycopy(sideInfoIndices.NLSFIndices, 0, this.NLSFIndices, 0, 17);
        this.lagIndex = sideInfoIndices.lagIndex;
        this.contourIndex = sideInfoIndices.contourIndex;
        this.signalType = sideInfoIndices.signalType;
        this.quantOffsetType = sideInfoIndices.quantOffsetType;
        this.NLSFInterpCoef_Q2 = sideInfoIndices.NLSFInterpCoef_Q2;
        this.PERIndex = sideInfoIndices.PERIndex;
        this.LTP_scaleIndex = sideInfoIndices.LTP_scaleIndex;
        this.Seed = sideInfoIndices.Seed;
    }
}

