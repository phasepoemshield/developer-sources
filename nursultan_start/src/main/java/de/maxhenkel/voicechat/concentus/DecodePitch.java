/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.SilkTables
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkTables;

class DecodePitch {
    DecodePitch() {
    }

    static void silk_decode_pitch(short s, byte by, int[] nArray, int n, int n2) {
        byte[][] byArray;
        if (n == 8) {
            if (n2 == 4) {
                byArray = SilkTables.silk_CB_lags_stage2;
            } else {
                Inlines.OpusAssert(n2 == 2);
                byArray = SilkTables.silk_CB_lags_stage2_10_ms;
            }
        } else if (n2 == 4) {
            byArray = SilkTables.silk_CB_lags_stage3;
        } else {
            Inlines.OpusAssert(n2 == 2);
            byArray = SilkTables.silk_CB_lags_stage3_10_ms;
        }
        int n3 = Inlines.silk_SMULBB(2, n);
        int n4 = Inlines.silk_SMULBB(18, n);
        int n5 = n3 + s;
        for (int i = 0; i < n2; ++i) {
            nArray[i] = n5 + byArray[i][by];
            nArray[i] = Inlines.silk_LIMIT(nArray[i], n3, n4);
        }
    }
}

