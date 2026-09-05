/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueByte
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.BoxedValueShort
 *  de.maxhenkel.voicechat.concentus.CeltPitchXCorr
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueByte;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.BoxedValueShort;
import de.maxhenkel.voicechat.concentus.CeltPitchXCorr;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.PitchAnalysisCore$silk_pe_stage3_vals;
import de.maxhenkel.voicechat.concentus.Resampler;
import de.maxhenkel.voicechat.concentus.SilkTables;
import de.maxhenkel.voicechat.concentus.Sort;
import de.maxhenkel.voicechat.concentus.SumSqrShift;

class PitchAnalysisCore {
    private static final int SCRATCH_SIZE = 22;
    private static final int SF_LENGTH_4KHZ = 20;
    private static final int SF_LENGTH_8KHZ = 40;
    private static final int MIN_LAG_4KHZ = 8;
    private static final int MIN_LAG_8KHZ = 16;
    private static final int MAX_LAG_4KHZ = 72;
    private static final int MAX_LAG_8KHZ = 143;
    private static final int CSTRIDE_4KHZ = 65;
    private static final int CSTRIDE_8KHZ = 132;
    private static final int D_COMP_MIN = 13;
    private static final int D_COMP_MAX = 147;
    private static final int D_COMP_STRIDE = 134;

    PitchAnalysisCore() {
    }

    static void silk_P_Ana_calc_energy_st3(PitchAnalysisCore$silk_pe_stage3_vals[] pitchAnalysisCore$silk_pe_stage3_valsArray, short[] sArray, int n, int n2, int n3, int n4) {
        int n5;
        byte[][] byArray;
        byte[][] byArray2;
        Inlines.OpusAssert((n4 >= 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n4 <= 2 ? 1 : 0) != 0);
        if (n3 == 4) {
            byArray2 = SilkTables.silk_Lag_range_stage3[n4];
            byArray = SilkTables.silk_CB_lags_stage3;
            n5 = SilkTables.silk_nb_cbk_searchs_stage3[n4];
        } else {
            Inlines.OpusAssert((n3 == 2 ? 1 : 0) != 0);
            byArray2 = SilkTables.silk_Lag_range_stage3_10_ms;
            byArray = SilkTables.silk_CB_lags_stage3_10_ms;
            n5 = 12;
        }
        int[] nArray = new int[22];
        int n6 = Inlines.silk_LSHIFT((int)n2, (int)2);
        for (int i = 0; i < n3; ++i) {
            int n7;
            int n8 = 0;
            int n9 = n6 - (n + byArray2[i][0]);
            int n10 = Inlines.silk_inner_prod_self((short[])sArray, (int)n9, (int)n2);
            Inlines.OpusAssert((n10 >= 0 ? 1 : 0) != 0);
            nArray[n8] = n10;
            ++n8;
            int n11 = byArray2[i][1] - byArray2[i][0] + 1;
            for (n7 = 1; n7 < n11; ++n7) {
                Inlines.OpusAssert(((n10 -= Inlines.silk_SMULBB((int)sArray[n9 + n2 - n7], (int)sArray[n9 + n2 - n7])) >= 0 ? 1 : 0) != 0);
                n10 = Inlines.silk_ADD_SAT32((int)n10, (int)Inlines.silk_SMULBB((int)sArray[n9 - n7], (int)sArray[n9 - n7]));
                Inlines.OpusAssert((n10 >= 0 ? 1 : 0) != 0);
                Inlines.OpusAssert((n8 < 22 ? 1 : 0) != 0);
                nArray[n8] = n10;
                ++n8;
            }
            byte by = byArray2[i][0];
            for (n7 = 0; n7 < n5; ++n7) {
                int n12 = byArray[i][n7] - by;
                for (int j = 0; j < 5; ++j) {
                    Inlines.OpusAssert((n12 + j < 22 ? 1 : 0) != 0);
                    Inlines.OpusAssert((n12 + j < n8 ? 1 : 0) != 0);
                    Inlines.MatrixGet((PitchAnalysisCore$silk_pe_stage3_vals[])pitchAnalysisCore$silk_pe_stage3_valsArray, (int)i, (int)n7, (int)n5).Values[j] = nArray[n12 + j];
                    Inlines.OpusAssert((Inlines.MatrixGet((PitchAnalysisCore$silk_pe_stage3_vals[])pitchAnalysisCore$silk_pe_stage3_valsArray, (int)i, (int)n7, (int)n5).Values[j] >= 0 ? 1 : 0) != 0);
                }
            }
            n6 += n2;
        }
    }

    private static void silk_P_Ana_calc_corr_st3(PitchAnalysisCore$silk_pe_stage3_vals[] pitchAnalysisCore$silk_pe_stage3_valsArray, short[] sArray, int n, int n2, int n3, int n4) {
        int n5;
        byte[][] byArray;
        byte[][] byArray2;
        Inlines.OpusAssert((n4 >= 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((n4 <= 2 ? 1 : 0) != 0);
        if (n3 == 4) {
            byArray2 = SilkTables.silk_Lag_range_stage3[n4];
            byArray = SilkTables.silk_CB_lags_stage3;
            n5 = SilkTables.silk_nb_cbk_searchs_stage3[n4];
        } else {
            Inlines.OpusAssert((n3 == 2 ? 1 : 0) != 0);
            byArray2 = SilkTables.silk_Lag_range_stage3_10_ms;
            byArray = SilkTables.silk_CB_lags_stage3_10_ms;
            n5 = 12;
        }
        int[] nArray = new int[22];
        int[] nArray2 = new int[22];
        int n6 = Inlines.silk_LSHIFT((int)n2, (int)2);
        for (int i = 0; i < n3; ++i) {
            int n7;
            int n8 = 0;
            byte by = byArray2[i][1];
            int n9 = byArray2[i][0];
            Inlines.OpusAssert((by - n9 + 1 <= 22 ? 1 : 0) != 0);
            CeltPitchXCorr.pitch_xcorr((short[])sArray, (int)n6, (short[])sArray, (int)(n6 - n - by), (int[])nArray2, (int)n2, (int)(by - n9 + 1));
            for (n7 = n9; n7 <= by; ++n7) {
                Inlines.OpusAssert((n8 < 22 ? 1 : 0) != 0);
                nArray[n8] = nArray2[by - n7];
                ++n8;
            }
            byte by2 = byArray2[i][0];
            for (int j = 0; j < n5; ++j) {
                int n10 = byArray[i][j] - by2;
                for (n7 = 0; n7 < 5; ++n7) {
                    Inlines.OpusAssert((n10 + n7 < 22 ? 1 : 0) != 0);
                    Inlines.OpusAssert((n10 + n7 < n8 ? 1 : 0) != 0);
                    Inlines.MatrixGet((PitchAnalysisCore$silk_pe_stage3_vals[])pitchAnalysisCore$silk_pe_stage3_valsArray, (int)i, (int)j, (int)n5).Values[n7] = nArray[n10 + n7];
                }
            }
            n6 += n2;
        }
    }

    /*
     * Unable to fully structure code
     */
    static int silk_pitch_analysis_core(short[] var0, int[] var1_1, BoxedValueShort var2_2, BoxedValueByte var3_3, BoxedValueInt var4_4, int var5_5, int var6_6, int var7_7, int var8_8, int var9_9, int var10_10) {
        var13_11 = new int[6];
        var34_12 = new int[24];
        var50_13 = new int[11];
        Inlines.OpusAssert((boolean)(var8_8 == 8 || var8_8 == 12 || var8_8 == 16));
        Inlines.OpusAssert((boolean)(var9_9 >= 0));
        Inlines.OpusAssert((boolean)(var9_9 <= 2));
        Inlines.OpusAssert((boolean)(var6_6 >= 0 && var6_6 <= 65536));
        if (var7_7 < 0) ** GOTO lbl-1000
        if (var7_7 <= 8192) {
            v0 = true;
        } else lbl-1000:
        // 2 sources

        {
            v0 = false;
        }
        Inlines.OpusAssert((boolean)v0);
        var53_14 = (20 + var10_10 * 5) * var8_8;
        var55_15 = (20 + var10_10 * 5) * 4;
        var54_16 = (20 + var10_10 * 5) * 8;
        var56_17 = 5 * var8_8;
        var57_18 = 2 * var8_8;
        var58_19 = 18 * var8_8 - 1;
        var11_20 = new short[var54_16];
        if (var8_8 == 16) {
            Arrays.MemSet((int[])var13_11, (int)0, (int)2);
            Resampler.silk_resampler_down2(var13_11, var11_20, var0, var53_14);
        } else if (var8_8 == 12) {
            Arrays.MemSet((int[])var13_11, (int)0, (int)6);
            Resampler.silk_resampler_down2_3(var13_11, var11_20, var0, var53_14);
        } else {
            Inlines.OpusAssert((boolean)(var8_8 == 8));
            System.arraycopy(var0, 0, var11_20, 0, var54_16);
        }
        Arrays.MemSet((int[])var13_11, (int)0, (int)2);
        var12_21 = new short[var55_15];
        Resampler.silk_resampler_down2(var13_11, var12_21, var11_20, var54_16);
        for (var15_22 = var55_15 - 1; var15_22 > 0; --var15_22) {
            var12_21[var15_22] = Inlines.silk_ADD_SAT16((short)var12_21[var15_22], (short)var12_21[var15_22 - 1]);
        }
        var67_23 = new BoxedValueInt(0);
        var68_24 = new BoxedValueInt(0);
        SumSqrShift.silk_sum_sqr_shift(var67_23, var68_24, var12_21, var55_15);
        var27_25 = var67_23.Val;
        var28_26 = var68_24.Val;
        if (var28_26 > 0) {
            var28_26 = Inlines.silk_RSHIFT((int)var28_26, (int)1);
            for (var15_22 = 0; var15_22 < var55_15; ++var15_22) {
                var12_21[var15_22] = Inlines.silk_RSHIFT16((short)var12_21[var15_22], (int)var28_26);
            }
        }
        var19_27 = new short[var10_10 * 132];
        var20_28 = new int[65];
        Arrays.MemSet((short[])var19_27, (short)0, (int)((var10_10 >> 1) * 65));
        var23_29 = var12_21;
        var24_30 = Inlines.silk_LSHIFT((int)20, (int)2);
        for (var16_31 = 0; var16_31 < var10_10 >> 1; ++var16_31) {
            var21_33 = var23_29;
            var22_34 = var24_30 - 8;
            CeltPitchXCorr.pitch_xcorr((short[])var23_29, (int)var24_30, (short[])var23_29, (int)(var24_30 - 72), (int[])var20_28, (int)40, (int)65);
            var25_35 = var20_28[64];
            var26_36 = Inlines.silk_inner_prod_self((short[])var23_29, (int)var24_30, (int)40);
            var26_36 = Inlines.silk_ADD32((int)var26_36, (int)Inlines.silk_inner_prod_self((short[])var21_33, (int)var22_34, (int)40));
            var26_36 = Inlines.silk_ADD32((int)var26_36, (int)Inlines.silk_SMULBB((int)40, (int)4000));
            Inlines.MatrixSet((short[])var19_27, (int)var16_31, (int)0, (int)65, (short)((short)Inlines.silk_DIV32_varQ((int)var25_35, (int)var26_36, (int)14)));
            for (var17_32 = 9; var17_32 <= 72; ++var17_32) {
                var25_35 = var20_28[72 - var17_32];
                var26_36 = Inlines.silk_ADD32((int)var26_36, (int)(Inlines.silk_SMULBB((int)var21_33[--var22_34], (int)var21_33[var22_34]) - Inlines.silk_SMULBB((int)var21_33[var22_34 + 40], (int)var21_33[var22_34 + 40])));
                Inlines.MatrixSet((short[])var19_27, (int)var16_31, (int)(var17_32 - 8), (int)65, (short)((short)Inlines.silk_DIV32_varQ((int)var25_35, (int)var26_36, (int)14)));
            }
            var24_30 += 40;
        }
        if (var10_10 == 4) {
            for (var15_22 = 72; var15_22 >= 8; --var15_22) {
                var36_37 = Inlines.MatrixGet((short[])var19_27, (int)0, (int)(var15_22 - 8), (int)65) + Inlines.MatrixGet((short[])var19_27, (int)1, (int)(var15_22 - 8), (int)65);
                var36_37 = Inlines.silk_SMLAWB((int)var36_37, (int)var36_37, (int)Inlines.silk_LSHIFT((int)(-var15_22), (int)4));
                var19_27[var15_22 - 8] = (short)var36_37;
            }
        } else {
            for (var15_22 = 72; var15_22 >= 8; --var15_22) {
                var36_37 = Inlines.silk_LSHIFT((int)var19_27[var15_22 - 8], (int)1);
                var36_37 = Inlines.silk_SMLAWB((int)var36_37, (int)var36_37, (int)Inlines.silk_LSHIFT((int)(-var15_22), (int)4));
                var19_27[var15_22 - 8] = (short)var36_37;
            }
        }
        Inlines.OpusAssert((boolean)(3 * (var32_38 = Inlines.silk_ADD_LSHIFT32((int)4, (int)var9_9, (int)1)) <= 24));
        Sort.silk_insertion_sort_decreasing_int16(var19_27, var34_12, 65, var32_38);
        var31_39 = var19_27[0];
        if (var31_39 < 3277) {
            Arrays.MemSet((int[])var1_1, (int)0, (int)var10_10);
            var4_4.Val = 0;
            var2_2.Val = 0;
            var3_3.Val = 0;
            return 1;
        }
        var37_40 = Inlines.silk_SMULWB((int)var6_6, (int)var31_39);
        for (var15_22 = 0; var15_22 < var32_38; ++var15_22) {
            if (var19_27[var15_22] <= var37_40) {
                var32_38 = var15_22;
                break;
            }
            var34_12[var15_22] = Inlines.silk_LSHIFT((int)(var34_12[var15_22] + 8), (int)1);
        }
        Inlines.OpusAssert((boolean)(var32_38 > 0));
        var35_41 = new short[134];
        for (var15_22 = 13; var15_22 < 147; ++var15_22) {
            var35_41[var15_22 - 13] = 0;
        }
        for (var15_22 = 0; var15_22 < var32_38; ++var15_22) {
            var35_41[var34_12[var15_22] - 13] = 1;
        }
        for (var15_22 = 146; var15_22 >= 16; --var15_22) {
            v1 = var15_22 - 13;
            var35_41[v1] = (short)(var35_41[v1] + (short)(var35_41[var15_22 - 1 - 13] + var35_41[var15_22 - 2 - 13]));
        }
        var32_38 = 0;
        for (var15_22 = 16; var15_22 < 144; ++var15_22) {
            if (var35_41[var15_22 + 1 - 13] <= 0) continue;
            var34_12[var32_38] = var15_22;
            ++var32_38;
        }
        for (var15_22 = 146; var15_22 >= 16; --var15_22) {
            v2 = var15_22 - 13;
            var35_41[v2] = (short)(var35_41[v2] + (short)(var35_41[var15_22 - 1 - 13] + var35_41[var15_22 - 2 - 13] + var35_41[var15_22 - 3 - 13]));
        }
        var33_42 = 0;
        for (var15_22 = 16; var15_22 < 147; ++var15_22) {
            if (var35_41[var15_22 - 13] <= 0) continue;
            var35_41[var33_42] = (short)(var15_22 - 2);
            ++var33_42;
        }
        var67_23.Val = 0;
        var68_24.Val = 0;
        SumSqrShift.silk_sum_sqr_shift(var67_23, var68_24, var11_20, var54_16);
        var27_25 = var67_23.Val;
        var28_26 = var68_24.Val;
        if (var28_26 > 0) {
            var28_26 = Inlines.silk_RSHIFT((int)var28_26, (int)1);
            for (var15_22 = 0; var15_22 < var54_16; ++var15_22) {
                var11_20[var15_22] = Inlines.silk_RSHIFT16((short)var11_20[var15_22], (int)var28_26);
            }
        }
        Arrays.MemSet((short[])var19_27, (short)0, (int)(var10_10 * 132));
        var23_29 = var11_20;
        var24_30 = 160;
        for (var16_31 = 0; var16_31 < var10_10; ++var16_31) {
            var30_45 = Inlines.silk_ADD32((int)Inlines.silk_inner_prod((short[])var23_29, (int)var24_30, (short[])var23_29, (int)var24_30, (int)40), (int)1);
            for (var18_43 = 0; var18_43 < var33_42; ++var18_43) {
                var21_33 = var23_29;
                var17_32 = var35_41[var18_43];
                var22_34 = var24_30 - var17_32;
                var25_35 = Inlines.silk_inner_prod((short[])var23_29, (int)var24_30, (short[])var21_33, (int)var22_34, (int)40);
                if (var25_35 > 0) {
                    var29_44 = Inlines.silk_inner_prod_self((short[])var21_33, (int)var22_34, (int)40);
                    Inlines.MatrixSet((short[])var19_27, (int)var16_31, (int)(var17_32 - 14), (int)132, (short)((short)Inlines.silk_DIV32_varQ((int)var25_35, (int)Inlines.silk_ADD32((int)var30_45, (int)var29_44), (int)14)));
                    continue;
                }
                Inlines.MatrixSet((short[])var19_27, (int)var16_31, (int)(var17_32 - 14), (int)132, (short)0);
            }
            var24_30 += 40;
        }
        var46_46 = -2147483648;
        var47_47 = -2147483648;
        var39_48 = 0;
        var42_49 = -1;
        if (var5_5 > 0) {
            if (var8_8 == 12) {
                var5_5 = Inlines.silk_DIV32_16((int)Inlines.silk_LSHIFT((int)var5_5, (int)1), (int)3);
            } else if (var8_8 == 16) {
                var5_5 = Inlines.silk_RSHIFT((int)var5_5, (int)1);
            }
            var64_50 = Inlines.silk_lin2log((int)var5_5);
        } else {
            var64_50 = 0;
        }
        Inlines.OpusAssert((boolean)(var7_7 == Inlines.silk_SAT16((int)var7_7)));
        if (var10_10 == 4) {
            var66_51 = SilkTables.silk_CB_lags_stage2;
            var61_52 = var8_8 == 8 && var9_9 > 0 ? 11 : 3;
        } else {
            var66_51 = SilkTables.silk_CB_lags_stage2_10_ms;
            var61_52 = 3;
        }
        for (var16_31 = 0; var16_31 < var32_38; ++var16_31) {
            var17_32 = var34_12[var16_31];
            for (var18_43 = 0; var18_43 < var61_52; ++var18_43) {
                var50_13[var18_43] = 0;
                for (var15_22 = 0; var15_22 < var10_10; ++var15_22) {
                    var69_59 = var17_32 + var66_51[var15_22][var18_43];
                    var50_13[var18_43] = var50_13[var18_43] + Inlines.MatrixGet((short[])var19_27, (int)var15_22, (int)(var69_59 - 14), (int)132);
                }
            }
            var49_55 = -2147483648;
            var40_53 = 0;
            for (var15_22 = 0; var15_22 < var61_52; ++var15_22) {
                if (var50_13[var15_22] <= var49_55) continue;
                var49_55 = var50_13[var15_22];
                var40_53 = var15_22;
            }
            var63_57 = Inlines.silk_lin2log((int)var17_32);
            Inlines.OpusAssert((boolean)(var63_57 == Inlines.silk_SAT16((int)var63_57)));
            Inlines.OpusAssert((boolean)(var10_10 * 1638 == Inlines.silk_SAT16((int)(var10_10 * 1638))));
            var48_54 = var49_55 - Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)(var10_10 * 1638), (int)var63_57), (int)7);
            Inlines.OpusAssert((boolean)(var10_10 * 1638 == Inlines.silk_SAT16((int)(var10_10 * 1638))));
            if (var5_5 > 0) {
                var62_56 = var63_57 - var64_50;
                Inlines.OpusAssert((boolean)(var62_56 == Inlines.silk_SAT16((int)var62_56)));
                var62_56 = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)var62_56, (int)var62_56), (int)7);
                var65_58 = Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)(var10_10 * 1638), (int)var4_4.Val), (int)15);
                var65_58 = Inlines.silk_DIV32((int)Inlines.silk_MUL((int)var65_58, (int)var62_56), (int)(var62_56 + 64));
                var48_54 -= var65_58;
            }
            if (var48_54 <= var47_47 || var49_55 <= Inlines.silk_SMULBB((int)var10_10, (int)var7_7) || SilkTables.silk_CB_lags_stage2[0][var40_53] > 16) continue;
            var47_47 = var48_54;
            var46_46 = var49_55;
            var42_49 = var17_32;
            var39_48 = var40_53;
        }
        if (var42_49 == -1) {
            Arrays.MemSet((int[])var1_1, (int)0, (int)var10_10);
            var4_4.Val = 0;
            var2_2.Val = 0;
            var3_3.Val = 0;
            return 1;
        }
        var4_4.Val = Inlines.silk_LSHIFT((int)Inlines.silk_DIV32_16((int)var46_46, (int)var10_10), (int)2);
        Inlines.OpusAssert((boolean)(var4_4.Val >= 0));
        if (var8_8 > 8) {
            var67_23.Val = 0;
            var68_24.Val = 0;
            SumSqrShift.silk_sum_sqr_shift(var67_23, var68_24, var0, var53_14);
            var27_25 = var67_23.Val;
            var28_26 = var68_24.Val;
            if (var28_26 > 0) {
                var69_60 = new short[var53_14];
                var28_26 = Inlines.silk_RSHIFT((int)var28_26, (int)1);
                for (var15_22 = 0; var15_22 < var53_14; ++var15_22) {
                    var69_60[var15_22] = Inlines.silk_RSHIFT16((short)var0[var15_22], (int)var28_26);
                }
                var14_61 = var69_60;
            } else {
                var14_61 = var0;
            }
            var41_62 = var39_48;
            Inlines.OpusAssert((boolean)(var42_49 == Inlines.silk_SAT16((int)var42_49)));
            var42_49 = var8_8 == 12 ? Inlines.silk_RSHIFT((int)Inlines.silk_SMULBB((int)var42_49, (int)3), (int)1) : (var8_8 == 16 ? Inlines.silk_LSHIFT((int)var42_49, (int)1) : Inlines.silk_SMULBB((int)var42_49, (int)3));
            var42_49 = Inlines.silk_LIMIT_int((int)var42_49, (int)var57_18, (int)var58_19);
            var43_63 = Inlines.silk_max_int((int)(var42_49 - 2), (int)var57_18);
            var44_64 = Inlines.silk_min_int((int)(var42_49 + 2), (int)var58_19);
            var45_65 = var42_49;
            var39_48 = 0;
            var46_46 = -2147483648;
            for (var16_31 = 0; var16_31 < var10_10; ++var16_31) {
                var1_1[var16_31] = var42_49 + 2 * SilkTables.silk_CB_lags_stage2[var16_31][var41_62];
            }
            if (var10_10 == 4) {
                var61_52 = SilkTables.silk_nb_cbk_searchs_stage3[var9_9];
                var66_51 = SilkTables.silk_CB_lags_stage3;
            } else {
                var61_52 = 12;
                var66_51 = SilkTables.silk_CB_lags_stage3_10_ms;
            }
            var51_66 = new PitchAnalysisCore$silk_pe_stage3_vals[var10_10 * var61_52];
            var52_67 = new PitchAnalysisCore$silk_pe_stage3_vals[var10_10 * var61_52];
            for (var70_68 = 0; var70_68 < var10_10 * var61_52; ++var70_68) {
                var51_66[var70_68] = new PitchAnalysisCore$silk_pe_stage3_vals();
                var52_67[var70_68] = new PitchAnalysisCore$silk_pe_stage3_vals();
            }
            PitchAnalysisCore.silk_P_Ana_calc_corr_st3(var52_67, var14_61, var43_63, var56_17, var10_10, var9_9);
            PitchAnalysisCore.silk_P_Ana_calc_energy_st3(var51_66, var14_61, var43_63, var56_17, var10_10, var9_9);
            var38_69 = 0;
            Inlines.OpusAssert((boolean)(var42_49 == Inlines.silk_SAT16((int)var42_49)));
            var59_70 = Inlines.silk_DIV32_16((int)1638, (int)var42_49);
            var23_29 = var14_61;
            var24_30 = 20 * var8_8;
            var30_45 = Inlines.silk_ADD32((int)Inlines.silk_inner_prod_self((short[])var23_29, (int)var24_30, (int)(var10_10 * var56_17)), (int)1);
            for (var17_32 = var43_63; var17_32 <= var44_64; ++var17_32) {
                for (var18_43 = 0; var18_43 < var61_52; ++var18_43) {
                    var25_35 = 0;
                    var27_25 = var30_45;
                    for (var16_31 = 0; var16_31 < var10_10; ++var16_31) {
                        var25_35 = Inlines.silk_ADD32((int)var25_35, (int)Inlines.MatrixGet((PitchAnalysisCore$silk_pe_stage3_vals[])var52_67, (int)var16_31, (int)var18_43, (int)var61_52).Values[var38_69]);
                        Inlines.OpusAssert((boolean)((var27_25 = Inlines.silk_ADD32((int)var27_25, (int)Inlines.MatrixGet((PitchAnalysisCore$silk_pe_stage3_vals[])var51_66, (int)var16_31, (int)var18_43, (int)var61_52).Values[var38_69])) >= 0));
                    }
                    if (var25_35 > 0) {
                        var49_55 = Inlines.silk_DIV32_varQ((int)var25_35, (int)var27_25, (int)14);
                        var60_71 = 32767 - Inlines.silk_MUL((int)var59_70, (int)var18_43);
                        Inlines.OpusAssert((boolean)(var60_71 == Inlines.silk_SAT16((int)var60_71)));
                        var49_55 = Inlines.silk_SMULWB((int)var49_55, (int)var60_71);
                    } else {
                        var49_55 = 0;
                    }
                    if (var49_55 <= var46_46 || var17_32 + SilkTables.silk_CB_lags_stage3[0][var18_43] > var58_19) continue;
                    var46_46 = var49_55;
                    var45_65 = var17_32;
                    var39_48 = var18_43;
                }
                ++var38_69;
            }
            for (var16_31 = 0; var16_31 < var10_10; ++var16_31) {
                var1_1[var16_31] = var45_65 + var66_51[var16_31][var39_48];
                var1_1[var16_31] = Inlines.silk_LIMIT((int)var1_1[var16_31], (int)var57_18, (int)(18 * var8_8));
            }
            var2_2.Val = (short)(var45_65 - var57_18);
            var3_3.Val = (byte)var39_48;
        } else {
            for (var16_31 = 0; var16_31 < var10_10; ++var16_31) {
                var1_1[var16_31] = var42_49 + var66_51[var16_31][var39_48];
                var1_1[var16_31] = Inlines.silk_LIMIT((int)var1_1[var16_31], (int)16, (int)144);
            }
            var2_2.Val = (short)(var42_49 - 16);
            var3_3.Val = (byte)var39_48;
        }
        Inlines.OpusAssert((boolean)(var2_2.Val >= 0));
        return 0;
    }
}

