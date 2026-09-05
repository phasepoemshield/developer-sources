/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;

class K2A {
    K2A() {
    }

    static void silk_k2a(int[] nArray, short[] sArray, int n) {
        int[] nArray2 = new int[16];
        for (int i = 0; i < n; ++i) {
            int n2;
            for (n2 = 0; n2 < i; ++n2) {
                nArray2[n2] = nArray[n2];
            }
            for (n2 = 0; n2 < i; ++n2) {
                nArray[n2] = Inlines.silk_SMLAWB(nArray[n2], Inlines.silk_LSHIFT(nArray2[i - n2 - 1], 1), sArray[i]);
            }
            nArray[i] = 0 - Inlines.silk_LSHIFT(sArray[i], 9);
        }
    }

    static void silk_k2a_Q16(int[] nArray, int[] nArray2, int n) {
        int[] nArray3 = new int[16];
        for (int i = 0; i < n; ++i) {
            int n2;
            for (n2 = 0; n2 < i; ++n2) {
                nArray3[n2] = nArray[n2];
            }
            for (n2 = 0; n2 < i; ++n2) {
                nArray[n2] = Inlines.silk_SMLAWW(nArray[n2], nArray3[i - n2 - 1], nArray2[i]);
            }
            nArray[i] = 0 - Inlines.silk_LSHIFT(nArray2[i], 8);
        }
    }
}

