/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Inlines;

class Kernels {
    Kernels() {
    }

    static void dual_inner_prod(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3, int n4, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2) {
        int n5 = 0;
        int n6 = 0;
        for (int i = 0; i < n4; ++i) {
            n5 = Inlines.MAC16_16(n5, nArray[n + i], nArray2[n2 + i]);
            n6 = Inlines.MAC16_16(n6, nArray[n + i], nArray3[n3 + i]);
        }
        boxedValueInt.Val = n5;
        boxedValueInt2.Val = n6;
    }

    static void celt_fir(short[] sArray, int n, short[] sArray2, short[] sArray3, int n2, int n3, int n4, short[] sArray4) {
        int n5;
        short[] sArray5 = new short[n4];
        short[] sArray6 = new short[n3 + n4];
        for (n5 = 0; n5 < n4; ++n5) {
            sArray5[n5] = sArray2[n4 - n5 - 1];
        }
        for (n5 = 0; n5 < n4; ++n5) {
            sArray6[n5] = sArray4[n4 - n5 - 1];
        }
        for (n5 = 0; n5 < n3; ++n5) {
            sArray6[n5 + n4] = sArray[n + n5];
        }
        for (n5 = 0; n5 < n4; ++n5) {
            sArray4[n5] = sArray[n + n3 - n5 - 1];
        }
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        for (n5 = 0; n5 < n3 - 3; n5 += 4) {
            boxedValueInt.Val = 0;
            boxedValueInt2.Val = 0;
            boxedValueInt3.Val = 0;
            boxedValueInt4.Val = 0;
            Kernels.xcorr_kernel(sArray5, 0, sArray6, n5, boxedValueInt, boxedValueInt2, boxedValueInt3, boxedValueInt4, n4);
            sArray3[n2 + n5] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(sArray[n + n5]), Inlines.PSHR32(boxedValueInt.Val, 12)));
            sArray3[n2 + n5 + 1] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(sArray[n + n5 + 1]), Inlines.PSHR32(boxedValueInt2.Val, 12)));
            sArray3[n2 + n5 + 2] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(sArray[n + n5 + 2]), Inlines.PSHR32(boxedValueInt3.Val, 12)));
            sArray3[n2 + n5 + 3] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(sArray[n + n5 + 3]), Inlines.PSHR32(boxedValueInt4.Val, 12)));
        }
        while (n5 < n3) {
            int n6 = 0;
            for (int i = 0; i < n4; ++i) {
                n6 = Inlines.MAC16_16(n6, sArray5[i], sArray6[n5 + i]);
            }
            sArray3[n2 + n5] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(sArray[n + n5]), Inlines.PSHR32(n6, 12)));
            ++n5;
        }
    }

    static void celt_fir(int[] nArray, int n, int[] nArray2, int n2, int[] nArray3, int n3, int n4, int n5, int[] nArray4) {
        int n6;
        int[] nArray5 = new int[n5];
        int[] nArray6 = new int[n4 + n5];
        for (n6 = 0; n6 < n5; ++n6) {
            nArray5[n6] = nArray2[n2 + n5 - n6 - 1];
        }
        for (n6 = 0; n6 < n5; ++n6) {
            nArray6[n6] = nArray4[n5 - n6 - 1];
        }
        for (n6 = 0; n6 < n4; ++n6) {
            nArray6[n6 + n5] = nArray[n + n6];
        }
        for (n6 = 0; n6 < n5; ++n6) {
            nArray4[n6] = nArray[n + n4 - n6 - 1];
        }
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        for (n6 = 0; n6 < n4 - 3; n6 += 4) {
            boxedValueInt.Val = 0;
            boxedValueInt2.Val = 0;
            boxedValueInt3.Val = 0;
            boxedValueInt4.Val = 0;
            Kernels.xcorr_kernel(nArray5, nArray6, n6, boxedValueInt, boxedValueInt2, boxedValueInt3, boxedValueInt4, n5);
            nArray3[n3 + n6] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(nArray[n + n6]), Inlines.PSHR32(boxedValueInt.Val, 12)));
            nArray3[n3 + n6 + 1] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(nArray[n + n6 + 1]), Inlines.PSHR32(boxedValueInt2.Val, 12)));
            nArray3[n3 + n6 + 2] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(nArray[n + n6 + 2]), Inlines.PSHR32(boxedValueInt3.Val, 12)));
            nArray3[n3 + n6 + 3] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(nArray[n + n6 + 3]), Inlines.PSHR32(boxedValueInt4.Val, 12)));
        }
        while (n6 < n4) {
            int n7 = 0;
            for (int i = 0; i < n5; ++i) {
                n7 = Inlines.MAC16_16(n7, nArray5[i], nArray6[n6 + i]);
            }
            nArray3[n3 + n6] = Inlines.SATURATE16(Inlines.ADD32(Inlines.EXTEND32(nArray[n + n6]), Inlines.PSHR32(n7, 12)));
            ++n6;
        }
    }

    static int celt_inner_prod(int[] nArray, int n, int[] nArray2, int n2, int n3) {
        int n4 = 0;
        for (int i = 0; i < n3; ++i) {
            n4 = Inlines.MAC16_16(n4, nArray[n + i], nArray2[n2 + i]);
        }
        return n4;
    }

    static int celt_inner_prod(short[] sArray, short[] sArray2, int n, int n2) {
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            n3 = Inlines.MAC16_16(n3, sArray[i], sArray2[n + i]);
        }
        return n3;
    }

    static int celt_inner_prod(short[] sArray, int n, short[] sArray2, int n2, int n3) {
        int n4 = 0;
        for (int i = 0; i < n3; ++i) {
            n4 = Inlines.MAC16_16(n4, sArray[n + i], sArray2[n2 + i]);
        }
        return n4;
    }

    static void xcorr_kernel(short[] sArray, int n, short[] sArray2, int n2, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, BoxedValueInt boxedValueInt3, BoxedValueInt boxedValueInt4, int n3) {
        short s;
        int n4;
        int n5 = boxedValueInt.Val;
        int n6 = boxedValueInt2.Val;
        int n7 = boxedValueInt3.Val;
        int n8 = boxedValueInt4.Val;
        Inlines.OpusAssert(n3 >= 3);
        short s2 = 0;
        short s3 = sArray2[n2++];
        short s4 = sArray2[n2++];
        short s5 = sArray2[n2++];
        for (n4 = 0; n4 < n3 - 3; n4 += 4) {
            s = sArray[n++];
            s2 = sArray2[n2++];
            n5 = Inlines.MAC16_16(n5, s, s3);
            n6 = Inlines.MAC16_16(n6, s, s4);
            n7 = Inlines.MAC16_16(n7, s, s5);
            n8 = Inlines.MAC16_16(n8, s, s2);
            s = sArray[n++];
            s3 = sArray2[n2++];
            n5 = Inlines.MAC16_16(n5, s, s4);
            n6 = Inlines.MAC16_16(n6, s, s5);
            n7 = Inlines.MAC16_16(n7, s, s2);
            n8 = Inlines.MAC16_16(n8, s, s3);
            s = sArray[n++];
            s4 = sArray2[n2++];
            n5 = Inlines.MAC16_16(n5, s, s5);
            n6 = Inlines.MAC16_16(n6, s, s2);
            n7 = Inlines.MAC16_16(n7, s, s3);
            n8 = Inlines.MAC16_16(n8, s, s4);
            s = sArray[n++];
            s5 = sArray2[n2++];
            n5 = Inlines.MAC16_16(n5, s, s2);
            n6 = Inlines.MAC16_16(n6, s, s3);
            n7 = Inlines.MAC16_16(n7, s, s4);
            n8 = Inlines.MAC16_16(n8, s, s5);
        }
        if (n4++ < n3) {
            s = sArray[n++];
            s2 = sArray2[n2++];
            n5 = Inlines.MAC16_16(n5, s, s3);
            n6 = Inlines.MAC16_16(n6, s, s4);
            n7 = Inlines.MAC16_16(n7, s, s5);
            n8 = Inlines.MAC16_16(n8, s, s2);
        }
        if (n4++ < n3) {
            s = sArray[n++];
            s3 = sArray2[n2++];
            n5 = Inlines.MAC16_16(n5, s, s4);
            n6 = Inlines.MAC16_16(n6, s, s5);
            n7 = Inlines.MAC16_16(n7, s, s2);
            n8 = Inlines.MAC16_16(n8, s, s3);
        }
        if (n4 < n3) {
            s = sArray[n++];
            s4 = sArray2[n2++];
            n5 = Inlines.MAC16_16(n5, s, s5);
            n6 = Inlines.MAC16_16(n6, s, s2);
            n7 = Inlines.MAC16_16(n7, s, s3);
            n8 = Inlines.MAC16_16(n8, s, s4);
        }
        boxedValueInt.Val = n5;
        boxedValueInt2.Val = n6;
        boxedValueInt3.Val = n7;
        boxedValueInt4.Val = n8;
    }

    static void xcorr_kernel(int[] nArray, int[] nArray2, int n, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, BoxedValueInt boxedValueInt3, BoxedValueInt boxedValueInt4, int n2) {
        int n3;
        int n4;
        int n5 = boxedValueInt.Val;
        int n6 = boxedValueInt2.Val;
        int n7 = boxedValueInt3.Val;
        int n8 = boxedValueInt4.Val;
        int n9 = 0;
        Inlines.OpusAssert(n2 >= 3);
        int n10 = 0;
        int n11 = nArray2[n++];
        int n12 = nArray2[n++];
        int n13 = nArray2[n++];
        for (n4 = 0; n4 < n2 - 3; n4 += 4) {
            n3 = nArray[n9++];
            n10 = nArray2[n++];
            n5 = Inlines.MAC16_16(n5, n3, n11);
            n6 = Inlines.MAC16_16(n6, n3, n12);
            n7 = Inlines.MAC16_16(n7, n3, n13);
            n8 = Inlines.MAC16_16(n8, n3, n10);
            n3 = nArray[n9++];
            n11 = nArray2[n++];
            n5 = Inlines.MAC16_16(n5, n3, n12);
            n6 = Inlines.MAC16_16(n6, n3, n13);
            n7 = Inlines.MAC16_16(n7, n3, n10);
            n8 = Inlines.MAC16_16(n8, n3, n11);
            n3 = nArray[n9++];
            n12 = nArray2[n++];
            n5 = Inlines.MAC16_16(n5, n3, n13);
            n6 = Inlines.MAC16_16(n6, n3, n10);
            n7 = Inlines.MAC16_16(n7, n3, n11);
            n8 = Inlines.MAC16_16(n8, n3, n12);
            n3 = nArray[n9++];
            n13 = nArray2[n++];
            n5 = Inlines.MAC16_16(n5, n3, n10);
            n6 = Inlines.MAC16_16(n6, n3, n11);
            n7 = Inlines.MAC16_16(n7, n3, n12);
            n8 = Inlines.MAC16_16(n8, n3, n13);
        }
        if (n4++ < n2) {
            n3 = nArray[n9++];
            n10 = nArray2[n++];
            n5 = Inlines.MAC16_16(n5, n3, n11);
            n6 = Inlines.MAC16_16(n6, n3, n12);
            n7 = Inlines.MAC16_16(n7, n3, n13);
            n8 = Inlines.MAC16_16(n8, n3, n10);
        }
        if (n4++ < n2) {
            n3 = nArray[n9++];
            n11 = nArray2[n++];
            n5 = Inlines.MAC16_16(n5, n3, n12);
            n6 = Inlines.MAC16_16(n6, n3, n13);
            n7 = Inlines.MAC16_16(n7, n3, n10);
            n8 = Inlines.MAC16_16(n8, n3, n11);
        }
        if (n4 < n2) {
            n3 = nArray[n9++];
            n12 = nArray2[n++];
            n5 = Inlines.MAC16_16(n5, n3, n13);
            n6 = Inlines.MAC16_16(n6, n3, n10);
            n7 = Inlines.MAC16_16(n7, n3, n11);
            n8 = Inlines.MAC16_16(n8, n3, n12);
        }
        boxedValueInt.Val = n5;
        boxedValueInt2.Val = n6;
        boxedValueInt3.Val = n7;
        boxedValueInt4.Val = n8;
    }
}

