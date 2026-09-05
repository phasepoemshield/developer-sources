/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;

class ApplySineWindow {
    private static final short[] freq_table_Q16;

    ApplySineWindow() {
    }

    static {
        short[] sArray = new short[27];
        sArray[0] = 12111;
        sArray[1] = 9804;
        sArray[2] = 8235;
        sArray[3] = 7100;
        sArray[4] = 6239;
        sArray[5] = 5565;
        sArray[6] = 5022;
        sArray[7] = 4575;
        sArray[8] = 4202;
        sArray[9] = 3885;
        sArray[10] = 3612;
        sArray[11] = 3375;
        sArray[12] = 3167;
        sArray[13] = 2984;
        sArray[14] = 2820;
        sArray[15] = 2674;
        sArray[16] = 2542;
        sArray[17] = 2422;
        sArray[18] = 2313;
        sArray[19] = 2214;
        sArray[20] = 2123;
        sArray[21] = 2038;
        sArray[22] = 1961;
        sArray[23] = 1889;
        sArray[24] = 1822;
        sArray[25] = 1760;
        sArray[26] = 1702;
        freq_table_Q16 = sArray;
    }

    static void silk_apply_sine_window(short[] sArray, int n, short[] sArray2, int n2, int n3, int n4) {
        int n5;
        int n6;
        Inlines.OpusAssert(n3 == 1 || n3 == 2);
        Inlines.OpusAssert(n4 >= 16 && n4 <= 120);
        Inlines.OpusAssert((n4 & 3) == 0);
        int n7 = (n4 >> 2) - 4;
        Inlines.OpusAssert(n7 >= 0 && n7 <= 26);
        short s = freq_table_Q16[n7];
        int n8 = Inlines.silk_SMULWB(s, -s);
        Inlines.OpusAssert(n8 >= Short.MIN_VALUE);
        if (n3 == 1) {
            n6 = 0;
            n5 = s + Inlines.silk_RSHIFT(n4, 3);
        } else {
            n6 = 65536;
            n5 = 65536 + Inlines.silk_RSHIFT(n8, 1) + Inlines.silk_RSHIFT(n4, 4);
        }
        for (n7 = 0; n7 < n4; n7 += 4) {
            int n9 = n + n7;
            int n10 = n2 + n7;
            sArray[n9] = (short)Inlines.silk_SMULWB(Inlines.silk_RSHIFT(n6 + n5, 1), sArray2[n10]);
            sArray[n9 + 1] = (short)Inlines.silk_SMULWB(n5, sArray2[n10 + 1]);
            n6 = Inlines.silk_SMULWB(n5, n8) + Inlines.silk_LSHIFT(n5, 1) - n6 + 1;
            n6 = Inlines.silk_min(n6, 65536);
            sArray[n9 + 2] = (short)Inlines.silk_SMULWB(Inlines.silk_RSHIFT(n6 + n5, 1), sArray2[n10 + 2]);
            sArray[n9 + 3] = (short)Inlines.silk_SMULWB(n6, sArray2[n10 + 3]);
            n5 = Inlines.silk_SMULWB(n6, n8) + Inlines.silk_LSHIFT(n6, 1) - n5;
            n5 = Inlines.silk_min(n5, 65536);
        }
    }
}

