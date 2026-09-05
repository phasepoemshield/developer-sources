/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Kernels;

class CeltPitchXCorr {
    CeltPitchXCorr() {
    }

    static int pitch_xcorr(short[] sArray, short[] sArray2, int[] nArray, int n, int n2) {
        int n3;
        int n4 = 1;
        Inlines.OpusAssert(n2 > 0);
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        for (n3 = 0; n3 < n2 - 3; n3 += 4) {
            boxedValueInt.Val = 0;
            boxedValueInt2.Val = 0;
            boxedValueInt3.Val = 0;
            boxedValueInt4.Val = 0;
            Kernels.xcorr_kernel(sArray, 0, sArray2, n3, boxedValueInt, boxedValueInt2, boxedValueInt3, boxedValueInt4, n);
            nArray[n3] = boxedValueInt.Val;
            nArray[n3 + 1] = boxedValueInt2.Val;
            nArray[n3 + 2] = boxedValueInt3.Val;
            nArray[n3 + 3] = boxedValueInt4.Val;
            boxedValueInt.Val = Inlines.MAX32(boxedValueInt.Val, boxedValueInt2.Val);
            boxedValueInt3.Val = Inlines.MAX32(boxedValueInt3.Val, boxedValueInt4.Val);
            boxedValueInt.Val = Inlines.MAX32(boxedValueInt.Val, boxedValueInt3.Val);
            n4 = Inlines.MAX32(n4, boxedValueInt.Val);
        }
        while (n3 < n2) {
            int n5;
            nArray[n3] = n5 = Kernels.celt_inner_prod(sArray, sArray2, n3, n);
            n4 = Inlines.MAX32(n4, n5);
            ++n3;
        }
        return n4;
    }

    static int pitch_xcorr(short[] sArray, int n, short[] sArray2, int n2, int[] nArray, int n3, int n4) {
        int n5;
        int n6 = 1;
        Inlines.OpusAssert(n4 > 0);
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        for (n5 = 0; n5 < n4 - 3; n5 += 4) {
            boxedValueInt.Val = 0;
            boxedValueInt2.Val = 0;
            boxedValueInt3.Val = 0;
            boxedValueInt4.Val = 0;
            Kernels.xcorr_kernel(sArray, n, sArray2, n2 + n5, boxedValueInt, boxedValueInt2, boxedValueInt3, boxedValueInt4, n3);
            nArray[n5] = boxedValueInt.Val;
            nArray[n5 + 1] = boxedValueInt2.Val;
            nArray[n5 + 2] = boxedValueInt3.Val;
            nArray[n5 + 3] = boxedValueInt4.Val;
            boxedValueInt.Val = Inlines.MAX32(boxedValueInt.Val, boxedValueInt2.Val);
            boxedValueInt3.Val = Inlines.MAX32(boxedValueInt3.Val, boxedValueInt4.Val);
            boxedValueInt.Val = Inlines.MAX32(boxedValueInt.Val, boxedValueInt3.Val);
            n6 = Inlines.MAX32(n6, boxedValueInt.Val);
        }
        while (n5 < n4) {
            int n7;
            nArray[n5] = n7 = Kernels.celt_inner_prod(sArray, n, sArray2, n2 + n5, n3);
            n6 = Inlines.MAX32(n6, n7);
            ++n5;
        }
        return n6;
    }

    static int pitch_xcorr(int[] nArray, int[] nArray2, int[] nArray3, int n, int n2) {
        int n3;
        int n4 = 1;
        Inlines.OpusAssert(n2 > 0);
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        for (n3 = 0; n3 < n2 - 3; n3 += 4) {
            boxedValueInt.Val = 0;
            boxedValueInt2.Val = 0;
            boxedValueInt3.Val = 0;
            boxedValueInt4.Val = 0;
            Kernels.xcorr_kernel(nArray, nArray2, n3, boxedValueInt, boxedValueInt2, boxedValueInt3, boxedValueInt4, n);
            nArray3[n3] = boxedValueInt.Val;
            nArray3[n3 + 1] = boxedValueInt2.Val;
            nArray3[n3 + 2] = boxedValueInt3.Val;
            nArray3[n3 + 3] = boxedValueInt4.Val;
            boxedValueInt.Val = Inlines.MAX32(boxedValueInt.Val, boxedValueInt2.Val);
            boxedValueInt3.Val = Inlines.MAX32(boxedValueInt3.Val, boxedValueInt4.Val);
            boxedValueInt.Val = Inlines.MAX32(boxedValueInt.Val, boxedValueInt3.Val);
            n4 = Inlines.MAX32(n4, boxedValueInt.Val);
        }
        while (n3 < n2) {
            int n5;
            nArray3[n3] = n5 = Kernels.celt_inner_prod(nArray, 0, nArray2, n3, n);
            n4 = Inlines.MAX32(n4, n5);
            ++n3;
        }
        return n4;
    }
}

