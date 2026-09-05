/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;

class Sigmoid {
    private static final int[] sigm_LUT_slope_Q10;
    private static final int[] sigm_LUT_pos_Q15;
    private static final int[] sigm_LUT_neg_Q15;

    Sigmoid() {
    }

    static {
        int[] nArray = new int[6];
        nArray[0] = 237;
        nArray[1] = 153;
        nArray[2] = 73;
        nArray[3] = 30;
        nArray[4] = 12;
        nArray[5] = 7;
        sigm_LUT_slope_Q10 = nArray;
        int[] nArray2 = new int[6];
        nArray2[0] = 16384;
        nArray2[1] = 23955;
        nArray2[2] = 28861;
        nArray2[3] = 31213;
        nArray2[4] = 32178;
        nArray2[5] = 32548;
        sigm_LUT_pos_Q15 = nArray2;
        int[] nArray3 = new int[6];
        nArray3[0] = 16384;
        nArray3[1] = 8812;
        nArray3[2] = 3906;
        nArray3[3] = 1554;
        nArray3[4] = 589;
        nArray3[5] = 219;
        sigm_LUT_neg_Q15 = nArray3;
    }

    static int silk_sigm_Q15(int n) {
        if (n < 0) {
            n = -n;
            if (n >= 192) {
                return 0;
            }
            int n2 = Inlines.silk_RSHIFT((int)n, (int)5);
            return sigm_LUT_neg_Q15[n2] - Inlines.silk_SMULBB((int)sigm_LUT_slope_Q10[n2], (int)(n & 0x1F));
        }
        if (n >= 192) {
            return Short.MAX_VALUE;
        }
        int n3 = Inlines.silk_RSHIFT((int)n, (int)5);
        return sigm_LUT_pos_Q15[n3] + Inlines.silk_SMULBB((int)sigm_LUT_slope_Q10[n3], (int)(n & 0x1F));
    }
}

