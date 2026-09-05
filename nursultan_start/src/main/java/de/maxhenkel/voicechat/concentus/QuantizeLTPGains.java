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
import de.maxhenkel.voicechat.concentus.SilkTables;
import de.maxhenkel.voicechat.concentus.VQ_WMat_EC;

class QuantizeLTPGains {
    QuantizeLTPGains() {
    }

    static void silk_quant_LTP_gains(short[] sArray, byte[] byArray, BoxedValueByte boxedValueByte, BoxedValueInt boxedValueInt, int[] nArray, int n, int n2, int n3) {
        int n4;
        byte[][] byArray2;
        int n5;
        byte[] byArray3 = new byte[4];
        int n6 = Integer.MAX_VALUE;
        int n7 = 0;
        for (n5 = 0; n5 < 3; ++n5) {
            int n8 = 51;
            short[] sArray2 = SilkTables.silk_LTP_gain_BITS_Q5_ptrs[n5];
            byArray2 = SilkTables.silk_LTP_vq_ptrs_Q7[n5];
            short[] sArray3 = SilkTables.silk_LTP_vq_gain_ptrs_Q7[n5];
            byte by = SilkTables.silk_LTP_vq_sizes[n5];
            int n9 = 0;
            int n10 = 0;
            int n11 = 0;
            int n12 = boxedValueInt.Val;
            for (n4 = 0; n4 < n3; ++n4) {
                int n13 = Inlines.silk_log2lin((int)(5333 - n12 + 896)) - n8;
                BoxedValueByte boxedValueByte2 = new BoxedValueByte(byArray3[n4]);
                BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
                BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
                VQ_WMat_EC.silk_VQ_WMat_EC(boxedValueByte2, boxedValueInt2, boxedValueInt3, sArray, n10, nArray, n9, byArray2, sArray3, sArray2, n, n13, by);
                int n14 = boxedValueInt2.Val;
                int n15 = boxedValueInt3.Val;
                byArray3[n4] = boxedValueByte2.Val;
                n11 = Inlines.silk_ADD_POS_SAT32((int)n11, (int)n14);
                n12 = Inlines.silk_max((int)0, (int)(n12 + Inlines.silk_lin2log((int)(n8 + n15)) - 896));
                n10 += 5;
                n9 += 25;
            }
            if ((n11 = Inlines.silk_min((int)0x7FFFFFFE, (int)n11)) < n6) {
                n6 = n11;
                boxedValueByte.Val = (byte)n5;
                System.arraycopy(byArray3, 0, byArray, 0, n3);
                n7 = n12;
            }
            if (n2 == 0) continue;
            if (n11 < 12304) break;
        }
        byArray2 = SilkTables.silk_LTP_vq_ptrs_Q7[boxedValueByte.Val];
        for (n4 = 0; n4 < n3; ++n4) {
            for (n5 = 0; n5 < 5; ++n5) {
                sArray[n4 * 5 + n5] = (short)Inlines.silk_LSHIFT((int)byArray2[byArray[n4]][n5], (int)7);
            }
        }
        boxedValueInt.Val = n7;
    }
}

