/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;

class SilkEncoderControl {
    final int[] Gains_Q16 = new int[4];
    final short[][] PredCoef_Q12 = Arrays.InitTwoDimensionalArrayShort((int)2, (int)16);
    final short[] LTPCoef_Q14 = new short[20];
    int LTP_scale_Q14 = 0;
    final int[] pitchL = new int[4];
    final short[] AR1_Q13 = new short[64];
    final short[] AR2_Q13 = new short[64];
    final int[] LF_shp_Q14 = new int[4];
    final int[] GainsPre_Q14 = new int[4];
    final int[] HarmBoost_Q14 = new int[4];
    final int[] Tilt_Q14 = new int[4];
    final int[] HarmShapeGain_Q14 = new int[4];
    int Lambda_Q10 = 0;
    int input_quality_Q14 = 0;
    int coding_quality_Q14 = 0;
    int sparseness_Q8 = 0;
    int predGain_Q16 = 0;
    int LTPredCodGain_Q7 = 0;
    final int[] ResNrg = new int[4];
    final int[] ResNrgQ = new int[4];
    final int[] GainsUnq_Q16 = new int[4];
    byte lastGainIndexPrev = 0;

    SilkEncoderControl() {
    }

    void Reset() {
        Arrays.MemSet((int[])this.Gains_Q16, (int)0, (int)4);
        Arrays.MemSet((short[])this.PredCoef_Q12[0], (short)0, (int)16);
        Arrays.MemSet((short[])this.PredCoef_Q12[1], (short)0, (int)16);
        Arrays.MemSet((short[])this.LTPCoef_Q14, (short)0, (int)20);
        this.LTP_scale_Q14 = 0;
        Arrays.MemSet((int[])this.pitchL, (int)0, (int)4);
        Arrays.MemSet((short[])this.AR1_Q13, (short)0, (int)64);
        Arrays.MemSet((short[])this.AR2_Q13, (short)0, (int)64);
        Arrays.MemSet((int[])this.LF_shp_Q14, (int)0, (int)4);
        Arrays.MemSet((int[])this.GainsPre_Q14, (int)0, (int)4);
        Arrays.MemSet((int[])this.HarmBoost_Q14, (int)0, (int)4);
        Arrays.MemSet((int[])this.Tilt_Q14, (int)0, (int)4);
        Arrays.MemSet((int[])this.HarmShapeGain_Q14, (int)0, (int)4);
        this.Lambda_Q10 = 0;
        this.input_quality_Q14 = 0;
        this.coding_quality_Q14 = 0;
        this.sparseness_Q8 = 0;
        this.predGain_Q16 = 0;
        this.LTPredCodGain_Q7 = 0;
        Arrays.MemSet((int[])this.ResNrg, (int)0, (int)4);
        Arrays.MemSet((int[])this.ResNrgQ, (int)0, (int)4);
        Arrays.MemSet((int[])this.GainsUnq_Q16, (int)0, (int)4);
        this.lastGainIndexPrev = 0;
    }
}

