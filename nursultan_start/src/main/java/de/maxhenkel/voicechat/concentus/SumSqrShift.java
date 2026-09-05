/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Inlines;

class SumSqrShift {
    SumSqrShift() {
    }

    static void silk_sum_sqr_shift(BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, short[] sArray, int n, int n2) {
        int n3;
        int n4;
        int n5 = 0;
        int n6 = 0;
        --n2;
        for (n4 = 0; n4 < n2; n4 += 2) {
            n5 = Inlines.silk_SMLABB_ovflw((int)n5, (int)sArray[n + n4], (int)sArray[n + n4]);
            if ((n5 = Inlines.silk_SMLABB_ovflw((int)n5, (int)sArray[n + n4 + 1], (int)sArray[n + n4 + 1])) >= 0) continue;
            n5 = (int)Inlines.silk_RSHIFT_uint((long)n5, (int)2);
            n6 = 2;
            n4 += 2;
            break;
        }
        while (n4 < n2) {
            n3 = Inlines.silk_SMULBB((int)sArray[n + n4], (int)sArray[n + n4]);
            if ((n5 = (int)Inlines.silk_ADD_RSHIFT_uint((long)n5, (long)(n3 = Inlines.silk_SMLABB_ovflw((int)n3, (int)sArray[n + n4 + 1], (int)sArray[n + n4 + 1])), (int)n6)) < 0) {
                n5 = (int)Inlines.silk_RSHIFT_uint((long)n5, (int)2);
                n6 += 2;
            }
            n4 += 2;
        }
        if (n4 == n2) {
            n3 = Inlines.silk_SMULBB((int)sArray[n + n4], (int)sArray[n + n4]);
            n5 = (int)Inlines.silk_ADD_RSHIFT_uint((long)n5, (long)n3, (int)n6);
        }
        if ((n5 & 0xC0000000) != 0) {
            n5 = (int)Inlines.silk_RSHIFT_uint((long)n5, (int)2);
            n6 += 2;
        }
        boxedValueInt2.Val = n6;
        boxedValueInt.Val = n5;
    }

    static void silk_sum_sqr_shift(BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, short[] sArray, int n) {
        int n2;
        int n3;
        int n4 = 0;
        int n5 = 0;
        --n;
        for (n3 = 0; n3 < n; n3 += 2) {
            n4 = Inlines.silk_SMLABB_ovflw((int)n4, (int)sArray[n3], (int)sArray[n3]);
            if ((n4 = Inlines.silk_SMLABB_ovflw((int)n4, (int)sArray[n3 + 1], (int)sArray[n3 + 1])) >= 0) continue;
            n4 = (int)Inlines.silk_RSHIFT_uint((long)n4, (int)2);
            n5 = 2;
            n3 += 2;
            break;
        }
        while (n3 < n) {
            n2 = Inlines.silk_SMULBB((int)sArray[n3], (int)sArray[n3]);
            if ((n4 = (int)Inlines.silk_ADD_RSHIFT_uint((long)n4, (long)(n2 = Inlines.silk_SMLABB_ovflw((int)n2, (int)sArray[n3 + 1], (int)sArray[n3 + 1])), (int)n5)) < 0) {
                n4 = (int)Inlines.silk_RSHIFT_uint((long)n4, (int)2);
                n5 += 2;
            }
            n3 += 2;
        }
        if (n3 == n) {
            n2 = Inlines.silk_SMULBB((int)sArray[n3], (int)sArray[n3]);
            n4 = (int)Inlines.silk_ADD_RSHIFT_uint((long)n4, (long)n2, (int)n5);
        }
        if ((n4 & 0xC0000000) != 0) {
            n4 = (int)Inlines.silk_RSHIFT_uint((long)n4, (int)2);
            n5 += 2;
        }
        boxedValueInt2.Val = n5;
        boxedValueInt.Val = n4;
    }
}

