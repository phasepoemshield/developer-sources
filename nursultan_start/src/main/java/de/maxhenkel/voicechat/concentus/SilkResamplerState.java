/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class SilkResamplerState {
    final int[] sIIR = new int[6];
    final int[] sFIR_i32 = new int[36];
    final short[] sFIR_i16 = new short[36];
    final short[] delayBuf = new short[48];
    int resampler_function = 0;
    int batchSize = 0;
    int invRatio_Q16 = 0;
    int FIR_Order = 0;
    int FIR_Fracs = 0;
    int Fs_in_kHz = 0;
    int Fs_out_kHz = 0;
    int inputDelay = 0;
    short[] Coefs = null;

    SilkResamplerState() {
    }

    void Reset() {
        Arrays.MemSet((int[])this.sIIR, (int)0, (int)6);
        Arrays.MemSet((int[])this.sFIR_i32, (int)0, (int)36);
        Arrays.MemSet((short[])this.sFIR_i16, (short)0, (int)36);
        Arrays.MemSet((short[])this.delayBuf, (short)0, (int)48);
        this.resampler_function = 0;
        this.batchSize = 0;
        this.invRatio_Q16 = 0;
        this.FIR_Order = 0;
        this.FIR_Fracs = 0;
        this.Fs_in_kHz = 0;
        this.Fs_out_kHz = 0;
        this.inputDelay = 0;
        this.Coefs = null;
    }

    void Assign(SilkResamplerState silkResamplerState) {
        this.resampler_function = silkResamplerState.resampler_function;
        this.batchSize = silkResamplerState.batchSize;
        this.invRatio_Q16 = silkResamplerState.invRatio_Q16;
        this.FIR_Order = silkResamplerState.FIR_Order;
        this.FIR_Fracs = silkResamplerState.FIR_Fracs;
        this.Fs_in_kHz = silkResamplerState.Fs_in_kHz;
        this.Fs_out_kHz = silkResamplerState.Fs_out_kHz;
        this.inputDelay = silkResamplerState.inputDelay;
        this.Coefs = silkResamplerState.Coefs;
        System.arraycopy(silkResamplerState.sIIR, 0, this.sIIR, 0, 6);
        System.arraycopy(silkResamplerState.sFIR_i32, 0, this.sFIR_i32, 0, 36);
        System.arraycopy(silkResamplerState.sFIR_i16, 0, this.sFIR_i16, 0, 36);
        System.arraycopy(silkResamplerState.delayBuf, 0, this.delayBuf, 0, 48);
    }
}

