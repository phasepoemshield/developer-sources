/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Kernels;

class CeltLPC {
    CeltLPC() {
    }

    static void celt_lpc(int[] nArray, int[] nArray2, int n) {
        int n2;
        int n3 = nArray2[0];
        int[] nArray3 = new int[n];
        if (nArray2[0] != 0) {
            for (n2 = 0; n2 < n; ++n2) {
                int n4;
                int n5 = 0;
                for (n4 = 0; n4 < n2; ++n4) {
                    n5 += Inlines.MULT32_32_Q31(nArray3[n4], nArray2[n2 - n4]);
                }
                int n6 = 0 - Inlines.frac_div32(Inlines.SHL32(n5 += Inlines.SHR32(nArray2[n2 + 1], 3), 3), n3);
                nArray3[n2] = Inlines.SHR32(n6, 3);
                for (n4 = 0; n4 < n2 + 1 >> 1; ++n4) {
                    int n7 = nArray3[n4];
                    int n8 = nArray3[n2 - 1 - n4];
                    nArray3[n4] = n7 + Inlines.MULT32_32_Q31(n6, n8);
                    nArray3[n2 - 1 - n4] = n8 + Inlines.MULT32_32_Q31(n6, n7);
                }
                if ((n3 -= Inlines.MULT32_32_Q31(Inlines.MULT32_32_Q31(n6, n6), n3)) < Inlines.SHR32(nArray2[0], 10)) break;
            }
        }
        for (n2 = 0; n2 < n; ++n2) {
            nArray[n2] = Inlines.ROUND16(nArray3[n2], 16);
        }
    }

    static void celt_iir(int[] nArray, int n, int[] nArray2, int[] nArray3, int n2, int n3, int n4, int[] nArray4) {
        int n5;
        int[] nArray5 = new int[n4];
        int[] nArray6 = new int[n3 + n4];
        Inlines.OpusAssert((n4 & 3) == 0);
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        for (n5 = 0; n5 < n4; ++n5) {
            nArray5[n5] = nArray2[n4 - n5 - 1];
        }
        for (n5 = 0; n5 < n4; ++n5) {
            nArray6[n5] = 0 - nArray4[n4 - n5 - 1];
        }
        while (n5 < n3 + n4) {
            nArray6[n5] = 0;
            ++n5;
        }
        for (n5 = 0; n5 < n3 - 3; n5 += 4) {
            boxedValueInt.Val = nArray[n + n5];
            boxedValueInt2.Val = nArray[n + n5 + 1];
            boxedValueInt3.Val = nArray[n + n5 + 2];
            boxedValueInt4.Val = nArray[n + n5 + 3];
            Kernels.xcorr_kernel(nArray5, nArray6, n5, boxedValueInt, boxedValueInt2, boxedValueInt3, boxedValueInt4, n4);
            int n6 = boxedValueInt.Val;
            int n7 = boxedValueInt2.Val;
            int n8 = boxedValueInt3.Val;
            int n9 = boxedValueInt4.Val;
            nArray6[n5 + n4] = 0 - Inlines.ROUND16(n6, 12);
            nArray3[n2 + n5] = n6;
            n7 = Inlines.MAC16_16(n7, nArray6[n5 + n4], nArray2[0]);
            nArray6[n5 + n4 + 1] = 0 - Inlines.ROUND16(n7, 12);
            nArray3[n2 + n5 + 1] = n7;
            n8 = Inlines.MAC16_16(n8, nArray6[n5 + n4 + 1], nArray2[0]);
            n8 = Inlines.MAC16_16(n8, nArray6[n5 + n4], nArray2[1]);
            nArray6[n5 + n4 + 2] = 0 - Inlines.ROUND16(n8, 12);
            nArray3[n2 + n5 + 2] = n8;
            n9 = Inlines.MAC16_16(n9, nArray6[n5 + n4 + 2], nArray2[0]);
            n9 = Inlines.MAC16_16(n9, nArray6[n5 + n4 + 1], nArray2[1]);
            n9 = Inlines.MAC16_16(n9, nArray6[n5 + n4], nArray2[2]);
            nArray6[n5 + n4 + 3] = 0 - Inlines.ROUND16(n9, 12);
            nArray3[n2 + n5 + 3] = n9;
        }
        while (n5 < n3) {
            int n10 = nArray[n + n5];
            for (int i = 0; i < n4; ++i) {
                n10 -= Inlines.MULT16_16(nArray5[i], nArray6[n5 + i]);
            }
            nArray6[n5 + n4] = Inlines.ROUND16(n10, 12);
            nArray3[n2 + n5] = n10;
            ++n5;
        }
        for (n5 = 0; n5 < n4; ++n5) {
            nArray4[n5] = nArray3[n2 + n3 - n5 - 1];
        }
    }
}

