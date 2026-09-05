/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;

class BWExpander {
    BWExpander() {
    }

    static void silk_bwexpander_32(int[] nArray, int n, int n2) {
        int n3 = n2 - 65536;
        for (int i = 0; i < n - 1; ++i) {
            nArray[i] = Inlines.silk_SMULWW(n2, nArray[i]);
            n2 += Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(n2, n3), 16);
        }
        nArray[n - 1] = Inlines.silk_SMULWW(n2, nArray[n - 1]);
    }

    static void silk_bwexpander(short[] sArray, int n, int n2) {
        int n3 = n2 - 65536;
        for (int i = 0; i < n - 1; ++i) {
            sArray[i] = (short)Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(n2, sArray[i]), 16);
            n2 += Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(n2, n3), 16);
        }
        sArray[n - 1] = (short)Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(n2, sArray[n - 1]), 16);
    }
}

