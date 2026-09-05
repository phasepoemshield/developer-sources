/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.Inlines;

class GainQuantization {
    private static final int OFFSET = 2090;
    private static final int SCALE_Q16 = 2251;
    private static final int INV_SCALE_Q16 = 1907825;

    GainQuantization() {
    }

    static void silk_gains_dequant(int[] nArray, byte[] byArray, BoxedValueByte boxedValueByte, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            int n3;
            int n4;
            boxedValueByte.Val = i == 0 && n == 0 ? (byte)Inlines.silk_max_int(byArray[i], boxedValueByte.Val - 16) : ((n4 = byArray[i] + -4) > (n3 = 8 + boxedValueByte.Val) ? (byte)(boxedValueByte.Val + (byte)(Inlines.silk_LSHIFT(n4, 1) - n3)) : (byte)(boxedValueByte.Val + (byte)n4));
            boxedValueByte.Val = (byte)Inlines.silk_LIMIT_int(boxedValueByte.Val, 0, 63);
            nArray[i] = Inlines.silk_log2lin(Inlines.silk_min_32(Inlines.silk_SMULWB(1907825, boxedValueByte.Val) + 2090, 3967));
        }
    }

    static void silk_gains_quant(byte[] byArray, int[] nArray, BoxedValueByte boxedValueByte, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            byArray[i] = (byte)Inlines.silk_SMULWB(2251, Inlines.silk_lin2log(nArray[i]) - 2090);
            if (byArray[i] < boxedValueByte.Val) {
                int n3 = i;
                byArray[n3] = (byte)(byArray[n3] + 1);
            }
            byArray[i] = (byte)Inlines.silk_LIMIT_int(byArray[i], 0, 63);
            if (i == 0 && n == 0) {
                byArray[i] = (byte)Inlines.silk_LIMIT_int(byArray[i], boxedValueByte.Val + -4, 63);
                boxedValueByte.Val = byArray[i];
            } else {
                byArray[i] = (byte)(byArray[i] - boxedValueByte.Val);
                int n4 = 8 + boxedValueByte.Val;
                if (byArray[i] > n4) {
                    byArray[i] = (byte)(n4 + Inlines.silk_RSHIFT(byArray[i] - n4 + 1, 1));
                }
                byArray[i] = (byte)Inlines.silk_LIMIT_int(byArray[i], -4, 36);
                boxedValueByte.Val = byArray[i] > n4 ? (byte)(boxedValueByte.Val + (byte)(Inlines.silk_LSHIFT(byArray[i], 1) - n4)) : (byte)(boxedValueByte.Val + byArray[i]);
                int n5 = i;
                byArray[n5] = (byte)(byArray[n5] - -4);
            }
            nArray[i] = Inlines.silk_log2lin(Inlines.silk_min_32(Inlines.silk_SMULWB(1907825, boxedValueByte.Val) + 2090, 3967));
        }
    }

    static int silk_gains_ID(byte[] byArray, int n) {
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            n2 = Inlines.silk_ADD_LSHIFT32(byArray[i], n2, 8);
        }
        return n2;
    }
}

