/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.NLSF
 *  de.maxhenkel.voicechat.concentus.SilkChannelEncoder
 *  de.maxhenkel.voicechat.concentus.SumSqrShift
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.BurgModified;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.NLSF;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SumSqrShift;

class FindLPC {
    FindLPC() {
    }

    static void silk_find_LPC(SilkChannelEncoder silkChannelEncoder, short[] sArray, short[] sArray2, int n) {
        int[] nArray = new int[16];
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt5 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt6 = new BoxedValueInt(0);
        int[] nArray2 = new int[16];
        short[] sArray3 = new short[16];
        short[] sArray4 = new short[16];
        int n2 = silkChannelEncoder.subfr_length + silkChannelEncoder.predictLPCOrder;
        silkChannelEncoder.indices.NLSFInterpCoef_Q2 = (byte)4;
        BurgModified.silk_burg_modified(boxedValueInt5, boxedValueInt6, nArray, sArray2, 0, n, n2, silkChannelEncoder.nb_subfr, silkChannelEncoder.predictLPCOrder);
        int n3 = boxedValueInt5.Val;
        int n4 = boxedValueInt6.Val;
        if (silkChannelEncoder.useInterpolatedNLSFs != 0 && silkChannelEncoder.first_frame_after_reset == 0 && silkChannelEncoder.nb_subfr == 4) {
            BurgModified.silk_burg_modified(boxedValueInt5, boxedValueInt6, nArray2, sArray2, 2 * n2, n, n2, 2, silkChannelEncoder.predictLPCOrder);
            int n5 = boxedValueInt5.Val;
            int n6 = boxedValueInt6.Val;
            int n7 = n6 - n4;
            if (n7 >= 0) {
                if (n7 < 32) {
                    n3 -= Inlines.silk_RSHIFT(n5, n7);
                }
            } else {
                Inlines.OpusAssert(n7 > -32);
                n3 = Inlines.silk_RSHIFT(n3, -n7) - n5;
                n4 = n6;
            }
            NLSF.silk_A2NLSF((short[])sArray, (int[])nArray2, (int)silkChannelEncoder.predictLPCOrder);
            short[] sArray5 = new short[2 * n2];
            for (int i = 3; i >= 0; --i) {
                int n8;
                Inlines.silk_interpolate(sArray4, silkChannelEncoder.prev_NLSFq_Q15, sArray, i, silkChannelEncoder.predictLPCOrder);
                NLSF.silk_NLSF2A((short[])sArray3, (short[])sArray4, (int)silkChannelEncoder.predictLPCOrder);
                Filters.silk_LPC_analysis_filter(sArray5, 0, sArray2, 0, sArray3, 0, 2 * n2, silkChannelEncoder.predictLPCOrder);
                SumSqrShift.silk_sum_sqr_shift((BoxedValueInt)boxedValueInt, (BoxedValueInt)boxedValueInt3, (short[])sArray5, (int)silkChannelEncoder.predictLPCOrder, (int)(n2 - silkChannelEncoder.predictLPCOrder));
                SumSqrShift.silk_sum_sqr_shift((BoxedValueInt)boxedValueInt2, (BoxedValueInt)boxedValueInt4, (short[])sArray5, (int)(silkChannelEncoder.predictLPCOrder + n2), (int)(n2 - silkChannelEncoder.predictLPCOrder));
                n7 = boxedValueInt3.Val - boxedValueInt4.Val;
                if (n7 >= 0) {
                    boxedValueInt2.Val = Inlines.silk_RSHIFT(boxedValueInt2.Val, n7);
                    n8 = 0 - boxedValueInt3.Val;
                } else {
                    boxedValueInt.Val = Inlines.silk_RSHIFT(boxedValueInt.Val, 0 - n7);
                    n8 = 0 - boxedValueInt4.Val;
                }
                int n9 = Inlines.silk_ADD32(boxedValueInt.Val, boxedValueInt2.Val);
                n7 = n8 - n4;
                boolean bl = n7 >= 0 ? Inlines.silk_RSHIFT(n9, n7) < n3 : (-n7 < 32 ? n9 < Inlines.silk_RSHIFT(n3, -n7) : false);
                if (!bl) continue;
                n3 = n9;
                n4 = n8;
                silkChannelEncoder.indices.NLSFInterpCoef_Q2 = (byte)i;
            }
        }
        if (silkChannelEncoder.indices.NLSFInterpCoef_Q2 == 4) {
            NLSF.silk_A2NLSF((short[])sArray, (int[])nArray, (int)silkChannelEncoder.predictLPCOrder);
        }
        Inlines.OpusAssert(silkChannelEncoder.indices.NLSFInterpCoef_Q2 == 4 || silkChannelEncoder.useInterpolatedNLSFs != 0 && silkChannelEncoder.first_frame_after_reset == 0 && silkChannelEncoder.nb_subfr == 4);
    }
}

