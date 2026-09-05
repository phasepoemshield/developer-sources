/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;

class LTPAnalysisFilter {
    LTPAnalysisFilter() {
    }

    static void silk_LTP_analysis_filter(short[] sArray, short[] sArray2, int n, short[] sArray3, int[] nArray, int[] nArray2, int n2, int n3, int n4) {
        short[] sArray4 = new short[5];
        int n5 = n;
        int n6 = 0;
        for (int i = 0; i < n3; ++i) {
            int n7 = n5 - nArray[i];
            sArray4[0] = sArray3[i * 5];
            sArray4[1] = sArray3[i * 5 + 1];
            sArray4[2] = sArray3[i * 5 + 2];
            sArray4[3] = sArray3[i * 5 + 3];
            sArray4[4] = sArray3[i * 5 + 4];
            for (int j = 0; j < n2 + n4; ++j) {
                int n8 = n6 + j;
                sArray[n8] = sArray2[n5 + j];
                int n9 = Inlines.silk_SMULBB((int)sArray2[n7 + 2], (int)sArray4[0]);
                n9 = Inlines.silk_SMLABB_ovflw((int)n9, (int)sArray2[n7 + 1], (int)sArray4[1]);
                n9 = Inlines.silk_SMLABB_ovflw((int)n9, (int)sArray2[n7], (int)sArray4[2]);
                n9 = Inlines.silk_SMLABB_ovflw((int)n9, (int)sArray2[n7 - 1], (int)sArray4[3]);
                n9 = Inlines.silk_SMLABB_ovflw((int)n9, (int)sArray2[n7 - 2], (int)sArray4[4]);
                n9 = Inlines.silk_RSHIFT_ROUND((int)n9, (int)14);
                sArray[n8] = (short)Inlines.silk_SAT16((int)(sArray2[n5 + j] - n9));
                sArray[n8] = (short)Inlines.silk_SMULWB((int)nArray2[i], (int)sArray[n8]);
                ++n7;
            }
            n6 += n2 + n4;
            n5 += n2;
        }
    }
}

