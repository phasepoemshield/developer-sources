/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Inlines;

class VQ_WMat_EC {
    VQ_WMat_EC() {
    }

    static void silk_VQ_WMat_EC(BoxedValueByte boxedValueByte, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, short[] sArray, int n, int[] nArray, int n2, byte[][] byArray, short[] sArray2, short[] sArray3, int n3, int n4, int n5) {
        int n6 = 0;
        short[] sArray4 = new short[5];
        boxedValueInt.Val = Integer.MAX_VALUE;
        for (int i = 0; i < n5; ++i) {
            byte[] byArray2 = byArray[n6++];
            int n7 = sArray2[i];
            sArray4[0] = (short)(sArray[n] - Inlines.silk_LSHIFT((int)byArray2[0], (int)7));
            sArray4[1] = (short)(sArray[n + 1] - Inlines.silk_LSHIFT((int)byArray2[1], (int)7));
            sArray4[2] = (short)(sArray[n + 2] - Inlines.silk_LSHIFT((int)byArray2[2], (int)7));
            sArray4[3] = (short)(sArray[n + 3] - Inlines.silk_LSHIFT((int)byArray2[3], (int)7));
            sArray4[4] = (short)(sArray[n + 4] - Inlines.silk_LSHIFT((int)byArray2[4], (int)7));
            int n8 = Inlines.silk_SMULBB((int)n3, (int)sArray3[i]);
            Inlines.OpusAssert(((n8 = Inlines.silk_ADD_LSHIFT32((int)n8, (int)Inlines.silk_max((int)Inlines.silk_SUB32((int)n7, (int)n4), (int)0), (int)10)) >= 0 ? 1 : 0) != 0);
            int n9 = Inlines.silk_SMULWB((int)nArray[n2 + 1], (int)sArray4[1]);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 2], (int)sArray4[2]);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 3], (int)sArray4[3]);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 4], (int)sArray4[4]);
            n9 = Inlines.silk_LSHIFT((int)n9, (int)1);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2], (int)sArray4[0]);
            n8 = Inlines.silk_SMLAWB((int)n8, (int)n9, (int)sArray4[0]);
            n9 = Inlines.silk_SMULWB((int)nArray[n2 + 7], (int)sArray4[2]);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 8], (int)sArray4[3]);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 9], (int)sArray4[4]);
            n9 = Inlines.silk_LSHIFT((int)n9, (int)1);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 6], (int)sArray4[1]);
            n8 = Inlines.silk_SMLAWB((int)n8, (int)n9, (int)sArray4[1]);
            n9 = Inlines.silk_SMULWB((int)nArray[n2 + 13], (int)sArray4[3]);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 14], (int)sArray4[4]);
            n9 = Inlines.silk_LSHIFT((int)n9, (int)1);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 12], (int)sArray4[2]);
            n8 = Inlines.silk_SMLAWB((int)n8, (int)n9, (int)sArray4[2]);
            n9 = Inlines.silk_SMULWB((int)nArray[n2 + 19], (int)sArray4[4]);
            n9 = Inlines.silk_LSHIFT((int)n9, (int)1);
            n9 = Inlines.silk_SMLAWB((int)n9, (int)nArray[n2 + 18], (int)sArray4[3]);
            n8 = Inlines.silk_SMLAWB((int)n8, (int)n9, (int)sArray4[3]);
            n9 = Inlines.silk_SMULWB((int)nArray[n2 + 24], (int)sArray4[4]);
            n8 = Inlines.silk_SMLAWB((int)n8, (int)n9, (int)sArray4[4]);
            Inlines.OpusAssert((n8 >= 0 ? 1 : 0) != 0);
            if (n8 >= boxedValueInt.Val) continue;
            boxedValueInt.Val = n8;
            boxedValueByte.Val = (byte)i;
            boxedValueInt2.Val = n7;
        }
    }
}

