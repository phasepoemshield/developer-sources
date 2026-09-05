/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkTables;
import de.maxhenkel.voicechat.concentus.StereoDecodeState;
import de.maxhenkel.voicechat.concentus.StereoEncodeState;
import de.maxhenkel.voicechat.concentus.SumSqrShift;

class Stereo {
    Stereo() {
    }

    static void silk_stereo_quant_pred(int[] nArray, byte[][] byArray) {
        int n = 0;
        Arrays.MemSet((byte[])byArray[0], (byte)0, (int)3);
        Arrays.MemSet((byte[])byArray[1], (byte)0, (int)3);
        for (int i = 0; i < 2; ++i) {
            boolean bl = false;
            int n2 = Integer.MAX_VALUE;
            for (int n3 = 0; !bl && n3 < 15; n3 = (int)((byte)(n3 + 1))) {
                short s = SilkTables.silk_stereo_pred_quant_Q13[n3];
                int n4 = Inlines.silk_SMULWB((int)(SilkTables.silk_stereo_pred_quant_Q13[n3 + 1] - s), (int)6554);
                for (int n5 = 0; !bl && n5 < 5; n5 = (int)((byte)(n5 + 1))) {
                    int n6 = Inlines.silk_SMLABB((int)s, (int)n4, (int)(2 * n5 + 1));
                    int n7 = Inlines.silk_abs((int)(nArray[i] - n6));
                    if (n7 < n2) {
                        n2 = n7;
                        n = n6;
                        byArray[i][0] = n3;
                        byArray[i][1] = n5;
                        continue;
                    }
                    bl = true;
                }
            }
            byArray[i][2] = (byte)Inlines.silk_DIV32_16((int)byArray[i][0], (int)3);
            byArray[i][0] = (byte)(byArray[i][0] - (byte)(byArray[i][2] * 3));
            nArray[i] = n;
        }
        nArray[0] = nArray[0] - nArray[1];
    }

    static int silk_stereo_find_predictor(BoxedValueInt boxedValueInt, short[] sArray, short[] sArray2, int[] nArray, int n, int n2, int n3) {
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        BoxedValueInt boxedValueInt5 = new BoxedValueInt(0);
        SumSqrShift.silk_sum_sqr_shift(boxedValueInt2, boxedValueInt4, sArray, n2);
        SumSqrShift.silk_sum_sqr_shift(boxedValueInt3, boxedValueInt5, sArray2, n2);
        int n4 = Inlines.silk_max_int((int)boxedValueInt4.Val, (int)boxedValueInt5.Val);
        n4 += n4 & 1;
        boxedValueInt3.Val = Inlines.silk_RSHIFT32((int)boxedValueInt3.Val, (int)(n4 - boxedValueInt5.Val));
        boxedValueInt2.Val = Inlines.silk_RSHIFT32((int)boxedValueInt2.Val, (int)(n4 - boxedValueInt4.Val));
        boxedValueInt2.Val = Inlines.silk_max_int((int)boxedValueInt2.Val, (int)1);
        int n5 = Inlines.silk_inner_prod_aligned_scale((short[])sArray, (short[])sArray2, (int)n4, (int)n2);
        int n6 = Inlines.silk_DIV32_varQ((int)n5, (int)boxedValueInt2.Val, (int)13);
        n6 = Inlines.silk_LIMIT((int)n6, (int)-16384, (int)16384);
        int n7 = Inlines.silk_SMULWB((int)n6, (int)n6);
        n3 = Inlines.silk_max_int((int)n3, (int)Inlines.silk_abs((int)n7));
        Inlines.OpusAssert((n3 < 32768 ? 1 : 0) != 0);
        n4 = Inlines.silk_RSHIFT((int)n4, (int)1);
        nArray[n] = Inlines.silk_SMLAWB((int)nArray[n], (int)(Inlines.silk_LSHIFT((int)Inlines.silk_SQRT_APPROX((int)boxedValueInt2.Val), (int)n4) - nArray[n]), (int)n3);
        boxedValueInt3.Val = Inlines.silk_SUB_LSHIFT32((int)boxedValueInt3.Val, (int)Inlines.silk_SMULWB((int)n5, (int)n6), (int)4);
        boxedValueInt3.Val = Inlines.silk_ADD_LSHIFT32((int)boxedValueInt3.Val, (int)Inlines.silk_SMULWB((int)boxedValueInt2.Val, (int)n7), (int)6);
        nArray[n + 1] = Inlines.silk_SMLAWB((int)nArray[n + 1], (int)(Inlines.silk_LSHIFT((int)Inlines.silk_SQRT_APPROX((int)boxedValueInt3.Val), (int)n4) - nArray[n + 1]), (int)n3);
        boxedValueInt.Val = Inlines.silk_DIV32_varQ((int)nArray[n + 1], (int)Inlines.silk_max((int)nArray[n], (int)1), (int)14);
        boxedValueInt.Val = Inlines.silk_LIMIT((int)boxedValueInt.Val, (int)0, (int)Short.MAX_VALUE);
        return n6;
    }

    static void silk_stereo_decode_pred(EntropyCoder entropyCoder, int[] nArray) {
        int[][] nArray2 = Arrays.InitTwoDimensionalArrayInt((int)2, (int)3);
        int n = entropyCoder.dec_icdf(SilkTables.silk_stereo_pred_joint_iCDF, 8);
        nArray2[0][2] = Inlines.silk_DIV32_16((int)n, (int)5);
        nArray2[1][2] = n - 5 * nArray2[0][2];
        for (n = 0; n < 2; ++n) {
            nArray2[n][0] = entropyCoder.dec_icdf(SilkTables.silk_uniform3_iCDF, 8);
            nArray2[n][1] = entropyCoder.dec_icdf(SilkTables.silk_uniform5_iCDF, 8);
        }
        for (n = 0; n < 2; ++n) {
            int[] nArray3 = nArray2[n];
            nArray3[0] = nArray3[0] + 3 * nArray2[n][2];
            short s = SilkTables.silk_stereo_pred_quant_Q13[nArray2[n][0]];
            int n2 = Inlines.silk_SMULWB((int)(SilkTables.silk_stereo_pred_quant_Q13[nArray2[n][0] + 1] - s), (int)6554);
            nArray[n] = Inlines.silk_SMLABB((int)s, (int)n2, (int)(2 * nArray2[n][1] + 1));
        }
        nArray[0] = nArray[0] - nArray[1];
    }

    static void silk_stereo_encode_pred(EntropyCoder entropyCoder, byte[][] byArray) {
        int n = 5 * byArray[0][2] + byArray[1][2];
        Inlines.OpusAssert((n < 25 ? 1 : 0) != 0);
        entropyCoder.enc_icdf(n, SilkTables.silk_stereo_pred_joint_iCDF, 8);
        for (n = 0; n < 2; ++n) {
            Inlines.OpusAssert((byArray[n][0] < 3 ? 1 : 0) != 0);
            Inlines.OpusAssert((byArray[n][1] < 5 ? 1 : 0) != 0);
            entropyCoder.enc_icdf((int)byArray[n][0], SilkTables.silk_uniform3_iCDF, 8);
            entropyCoder.enc_icdf((int)byArray[n][1], SilkTables.silk_uniform5_iCDF, 8);
        }
    }

    static void silk_stereo_MS_to_LR(StereoDecodeState stereoDecodeState, short[] sArray, int n, short[] sArray2, int n2, int[] nArray, int n3, int n4) {
        int n5;
        int n6;
        System.arraycopy(stereoDecodeState.sMid, 0, sArray, n, 2);
        System.arraycopy(stereoDecodeState.sSide, 0, sArray2, n2, 2);
        System.arraycopy(sArray, n + n4, stereoDecodeState.sMid, 0, 2);
        System.arraycopy(sArray2, n2 + n4, stereoDecodeState.sSide, 0, 2);
        int n7 = stereoDecodeState.pred_prev_Q13[0];
        int n8 = stereoDecodeState.pred_prev_Q13[1];
        int n9 = Inlines.silk_DIV32_16((int)65536, (int)(8 * n3));
        int n10 = Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULBB((int)(nArray[0] - stereoDecodeState.pred_prev_Q13[0]), (int)n9), (int)16);
        int n11 = Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULBB((int)(nArray[1] - stereoDecodeState.pred_prev_Q13[1]), (int)n9), (int)16);
        for (n6 = 0; n6 < 8 * n3; ++n6) {
            n5 = Inlines.silk_LSHIFT((int)Inlines.silk_ADD_LSHIFT((int)(sArray[n + n6] + sArray[n + n6 + 2]), (int)sArray[n + n6 + 1], (int)1), (int)9);
            n5 = Inlines.silk_SMLAWB((int)Inlines.silk_LSHIFT((int)sArray2[n2 + n6 + 1], (int)8), (int)n5, (int)(n7 += n10));
            n5 = Inlines.silk_SMLAWB((int)n5, (int)Inlines.silk_LSHIFT((int)sArray[n + n6 + 1], (int)11), (int)(n8 += n11));
            sArray2[n2 + n6 + 1] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n5, (int)8));
        }
        n7 = nArray[0];
        n8 = nArray[1];
        for (n6 = 8 * n3; n6 < n4; ++n6) {
            n5 = Inlines.silk_LSHIFT((int)Inlines.silk_ADD_LSHIFT((int)(sArray[n + n6] + sArray[n + n6 + 2]), (int)sArray[n + n6 + 1], (int)1), (int)9);
            n5 = Inlines.silk_SMLAWB((int)Inlines.silk_LSHIFT((int)sArray2[n2 + n6 + 1], (int)8), (int)n5, (int)n7);
            n5 = Inlines.silk_SMLAWB((int)n5, (int)Inlines.silk_LSHIFT((int)sArray[n + n6 + 1], (int)11), (int)n8);
            sArray2[n2 + n6 + 1] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n5, (int)8));
        }
        stereoDecodeState.pred_prev_Q13[0] = (short)nArray[0];
        stereoDecodeState.pred_prev_Q13[1] = (short)nArray[1];
        for (n6 = 0; n6 < n4; ++n6) {
            n5 = sArray[n + n6 + 1] + sArray2[n2 + n6 + 1];
            int n12 = sArray[n + n6 + 1] - sArray2[n2 + n6 + 1];
            sArray[n + n6 + 1] = (short)Inlines.silk_SAT16((int)n5);
            sArray2[n2 + n6 + 1] = (short)Inlines.silk_SAT16((int)n12);
        }
    }

    /*
     * Unable to fully structure code
     */
    static void silk_stereo_LR_to_MS(StereoEncodeState var0, short[] var1_1, int var2_2, short[] var3_3, int var4_4, byte[][] var5_5, BoxedValueByte var6_6, int[] var7_7, int var8_8, int var9_9, int var10_10, int var11_11, int var12_12) {
        block18: {
            block19: {
                block20: {
                    block17: {
                        var23_13 = new int[2];
                        var30_14 = new BoxedValueInt(0);
                        var31_15 = new BoxedValueInt(0);
                        var37_16 = var2_2 - 2;
                        var32_17 = new short[var12_12 + 2];
                        for (var13_18 = 0; var13_18 < var12_12 + 2; ++var13_18) {
                            var18_19 = var1_1[var2_2 + var13_18 - 2] + var3_3[var4_4 + var13_18 - 2];
                            var19_20 = var1_1[var2_2 + var13_18 - 2] - var3_3[var4_4 + var13_18 - 2];
                            var1_1[var37_16 + var13_18] = (short)Inlines.silk_RSHIFT_ROUND((int)var18_19, (int)1);
                            var32_17[var13_18] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)var19_20, (int)1));
                        }
                        System.arraycopy(var0.sMid, 0, var1_1, var37_16, 2);
                        System.arraycopy(var0.sSide, 0, var32_17, 0, 2);
                        System.arraycopy(var1_1, var37_16 + var12_12, var0.sMid, 0, 2);
                        System.arraycopy(var32_17, var12_12, var0.sSide, 0, 2);
                        var33_21 = new short[var12_12];
                        var34_22 = new short[var12_12];
                        for (var13_18 = 0; var13_18 < var12_12; ++var13_18) {
                            var18_19 = Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_ADD_LSHIFT32((int)(var1_1[var37_16 + var13_18] + var1_1[var37_16 + var13_18 + 2]), (int)var1_1[var37_16 + var13_18 + 1], (int)1), (int)2);
                            var33_21[var13_18] = (short)var18_19;
                            var34_22[var13_18] = (short)(var1_1[var37_16 + var13_18 + 1] - var18_19);
                        }
                        var35_23 = new short[var12_12];
                        var36_24 = new short[var12_12];
                        for (var13_18 = 0; var13_18 < var12_12; ++var13_18) {
                            var18_19 = Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_ADD_LSHIFT32((int)(var32_17[var13_18] + var32_17[var13_18 + 2]), (int)var32_17[var13_18 + 1], (int)1), (int)2);
                            var35_23[var13_18] = (short)var18_19;
                            var36_24[var13_18] = (short)(var32_17[var13_18 + 1] - var18_19);
                        }
                        v0 = var14_25 = var12_12 == 10 * var11_11;
                        var20_26 = var14_25 ? 328 : 655;
                        var20_26 = Inlines.silk_SMULWB((int)Inlines.silk_SMULBB((int)var9_9, (int)var9_9), (int)var20_26);
                        var23_13[0] = Stereo.silk_stereo_find_predictor(var30_14, var33_21, var35_23, var0.mid_side_amp_Q0, 0, var12_12, var20_26);
                        var23_13[1] = Stereo.silk_stereo_find_predictor(var31_15, var34_22, var36_24, var0.mid_side_amp_Q0, 2, var12_12, var20_26);
                        var24_27 = Inlines.silk_SMLABB((int)var31_15.Val, (int)var30_14.Val, (int)3);
                        var24_27 = Inlines.silk_min((int)var24_27, (int)65536);
                        if ((var8_8 -= var14_25 ? 1200 : 600) < 1) {
                            var8_8 = 1;
                        }
                        var26_28 = Inlines.silk_SMLABB((int)2000, (int)var11_11, (int)900);
                        Inlines.OpusAssert((boolean)(var26_28 < 32767));
                        var25_29 = Inlines.silk_MUL((int)3, (int)var24_27);
                        var7_7[0] = Inlines.silk_DIV32_varQ((int)var8_8, (int)(851968 + var25_29), (int)19);
                        if (var7_7[0] < var26_28) {
                            var7_7[0] = var26_28;
                            var7_7[1] = var8_8 - var7_7[0];
                            var27_30 = Inlines.silk_DIV32_varQ((int)(Inlines.silk_LSHIFT((int)var7_7[1], (int)1) - var26_28), (int)Inlines.silk_SMULWB((int)(65536 + var25_29), (int)var26_28), (int)16);
                            var27_30 = Inlines.silk_LIMIT((int)var27_30, (int)0, (int)16384);
                        } else {
                            var7_7[1] = var8_8 - var7_7[0];
                            var27_30 = 16384;
                        }
                        var0.smth_width_Q14 = (short)Inlines.silk_SMLAWB((int)var0.smth_width_Q14, (int)(var27_30 - var0.smth_width_Q14), (int)var20_26);
                        var6_6.Val = 0;
                        if (var10_10 == 0) break block17;
                        var27_30 = 0;
                        var23_13[0] = 0;
                        var23_13[1] = 0;
                        Stereo.silk_stereo_quant_pred(var23_13, var5_5);
                        break block18;
                    }
                    if (var0.width_prev_Q14 != 0) break block19;
                    if (8 * var8_8 < 13 * var26_28) break block20;
                    if (Inlines.silk_SMULWB((int)var24_27, (int)var0.smth_width_Q14) >= 819) break block19;
                }
                var23_13[0] = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)var0.smth_width_Q14, (int)var23_13[0]), (int)14);
                var23_13[1] = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)var0.smth_width_Q14, (int)var23_13[1]), (int)14);
                Stereo.silk_stereo_quant_pred(var23_13, var5_5);
                var27_30 = 0;
                var23_13[0] = 0;
                var23_13[1] = 0;
                var7_7[0] = var8_8;
                var7_7[1] = 0;
                var6_6.Val = 1;
                break block18;
            }
            if (var0.width_prev_Q14 == 0) ** GOTO lbl-1000
            if (8 * var8_8 < 11 * var26_28) ** GOTO lbl-1000
            if (Inlines.silk_SMULWB((int)var24_27, (int)var0.smth_width_Q14) < 328) lbl-1000:
            // 2 sources

            {
                var23_13[0] = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)var0.smth_width_Q14, (int)var23_13[0]), (int)14);
                var23_13[1] = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)var0.smth_width_Q14, (int)var23_13[1]), (int)14);
                Stereo.silk_stereo_quant_pred(var23_13, var5_5);
                var27_30 = 0;
                var23_13[0] = 0;
                var23_13[1] = 0;
            } else if (var0.smth_width_Q14 > 15565) {
                Stereo.silk_stereo_quant_pred(var23_13, var5_5);
                var27_30 = 16384;
            } else {
                var23_13[0] = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)var0.smth_width_Q14, (int)var23_13[0]), (int)14);
                var23_13[1] = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)var0.smth_width_Q14, (int)var23_13[1]), (int)14);
                Stereo.silk_stereo_quant_pred(var23_13, var5_5);
                var27_30 = var0.smth_width_Q14;
            }
        }
        if (var6_6.Val == 1) {
            var0.silent_side_len = (short)(var0.silent_side_len + (short)(var12_12 - 8 * var11_11));
            if (var0.silent_side_len < 5 * var11_11) {
                var6_6.Val = 0;
            } else {
                var0.silent_side_len = (short)10000;
            }
        } else {
            var0.silent_side_len = 0;
        }
        if (var6_6.Val == 0 && var7_7[1] < 1) {
            var7_7[1] = 1;
            var7_7[0] = Inlines.silk_max_int((int)1, (int)(var8_8 - var7_7[1]));
        }
        var21_31 = -var0.pred_prev_Q13[0];
        var22_32 = -var0.pred_prev_Q13[1];
        var28_33 = Inlines.silk_LSHIFT((int)var0.width_prev_Q14, (int)10);
        var15_34 = Inlines.silk_DIV32_16((int)65536, (int)(8 * var11_11));
        var16_35 = 0 - Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULBB((int)(var23_13[0] - var0.pred_prev_Q13[0]), (int)var15_34), (int)16);
        var17_36 = 0 - Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULBB((int)(var23_13[1] - var0.pred_prev_Q13[1]), (int)var15_34), (int)16);
        var29_37 = Inlines.silk_LSHIFT((int)Inlines.silk_SMULWB((int)(var27_30 - var0.width_prev_Q14), (int)var15_34), (int)10);
        for (var13_18 = 0; var13_18 < 8 * var11_11; ++var13_18) {
            var18_19 = Inlines.silk_LSHIFT((int)Inlines.silk_ADD_LSHIFT((int)(var1_1[var37_16 + var13_18] + var1_1[var37_16 + var13_18 + 2]), (int)var1_1[var37_16 + var13_18 + 1], (int)1), (int)9);
            var18_19 = Inlines.silk_SMLAWB((int)Inlines.silk_SMULWB((int)(var28_33 += var29_37), (int)var32_17[var13_18 + 1]), (int)var18_19, (int)(var21_31 += var16_35));
            var18_19 = Inlines.silk_SMLAWB((int)var18_19, (int)Inlines.silk_LSHIFT((int)var1_1[var37_16 + var13_18 + 1], (int)11), (int)(var22_32 += var17_36));
            var3_3[var4_4 + var13_18 - 1] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)var18_19, (int)8));
        }
        var21_31 = 0 - var23_13[0];
        var22_32 = 0 - var23_13[1];
        var28_33 = Inlines.silk_LSHIFT((int)var27_30, (int)10);
        for (var13_18 = 8 * var11_11; var13_18 < var12_12; ++var13_18) {
            var18_19 = Inlines.silk_LSHIFT((int)Inlines.silk_ADD_LSHIFT((int)(var1_1[var37_16 + var13_18] + var1_1[var37_16 + var13_18 + 2]), (int)var1_1[var37_16 + var13_18 + 1], (int)1), (int)9);
            var18_19 = Inlines.silk_SMLAWB((int)Inlines.silk_SMULWB((int)var28_33, (int)var32_17[var13_18 + 1]), (int)var18_19, (int)var21_31);
            var18_19 = Inlines.silk_SMLAWB((int)var18_19, (int)Inlines.silk_LSHIFT((int)var1_1[var37_16 + var13_18 + 1], (int)11), (int)var22_32);
            var3_3[var4_4 + var13_18 - 1] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)var18_19, (int)8));
        }
        var0.pred_prev_Q13[0] = (short)var23_13[0];
        var0.pred_prev_Q13[1] = (short)var23_13[1];
        var0.width_prev_Q14 = (short)var27_30;
    }

    static void silk_stereo_decode_mid_only(EntropyCoder entropyCoder, BoxedValueInt boxedValueInt) {
        boxedValueInt.Val = entropyCoder.dec_icdf(SilkTables.silk_stereo_only_code_mid_iCDF, 8);
    }

    static void silk_stereo_encode_mid_only(EntropyCoder entropyCoder, byte by) {
        entropyCoder.enc_icdf((int)by, SilkTables.silk_stereo_only_code_mid_iCDF, 8);
    }
}

