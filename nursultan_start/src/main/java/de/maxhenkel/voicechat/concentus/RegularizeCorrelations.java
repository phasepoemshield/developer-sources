/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;

class RegularizeCorrelations {
    RegularizeCorrelations() {
    }

    static void silk_regularize_correlations(int[] nArray, int n, int[] nArray2, int n2, int n3, int n4) {
        for (int i = 0; i < n4; ++i) {
            Inlines.MatrixSet((int[])nArray, (int)n, (int)i, (int)i, (int)n4, (int)Inlines.silk_ADD32((int)Inlines.MatrixGet((int[])nArray, (int)n, (int)i, (int)i, (int)n4), (int)n3));
        }
        int n5 = n2;
        nArray2[n5] = nArray2[n5] + n3;
    }
}

