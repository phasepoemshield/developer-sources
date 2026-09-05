/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.ApplySineWindow
 *  de.maxhenkel.voicechat.concentus.Autocorrelation
 *  de.maxhenkel.voicechat.concentus.BWExpander
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.Inlines
 *  de.maxhenkel.voicechat.concentus.K2A
 *  de.maxhenkel.voicechat.concentus.LPCInversePredGain
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.ApplySineWindow;
import de.maxhenkel.voicechat.concentus.Autocorrelation;
import de.maxhenkel.voicechat.concentus.BWExpander;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.K2A;
import de.maxhenkel.voicechat.concentus.LPCInversePredGain;
import de.maxhenkel.voicechat.concentus.Schur;
import de.maxhenkel.voicechat.concentus.Sigmoid;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkEncoderControl;
import de.maxhenkel.voicechat.concentus.SilkShapeState;
import de.maxhenkel.voicechat.concentus.SumSqrShift;

class NoiseShapeAnalysis {
    NoiseShapeAnalysis() {
    }

    static void silk_noise_shape_analysis(SilkChannelEncoder silkChannelEncoder, SilkEncoderControl silkEncoderControl, short[] sArray, int n, short[] sArray2, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        SilkShapeState silkShapeState = silkChannelEncoder.sShape;
        int n10 = 0;
        int[] nArray = new int[17];
        int[] nArray2 = new int[16];
        int[] nArray3 = new int[16];
        int[] nArray4 = new int[16];
        int n11 = n2 - silkChannelEncoder.la_shape;
        int n12 = silkChannelEncoder.SNR_dB_Q7;
        silkEncoderControl.input_quality_Q14 = Inlines.silk_RSHIFT((int)(silkChannelEncoder.input_quality_bands_Q15[0] + silkChannelEncoder.input_quality_bands_Q15[1]), (int)2);
        silkEncoderControl.coding_quality_Q14 = Inlines.silk_RSHIFT((int)Sigmoid.silk_sigm_Q15(Inlines.silk_RSHIFT_ROUND((int)(n12 - 2560), (int)4)), (int)1);
        if (silkChannelEncoder.useCBR == 0) {
            int n13 = 256 - silkChannelEncoder.speech_activity_Q8;
            n13 = Inlines.silk_SMULWB((int)Inlines.silk_LSHIFT((int)n13, (int)8), (int)n13);
            n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_SMULBB((int)-8, (int)n13), (int)Inlines.silk_SMULWB((int)(16384 + silkEncoderControl.input_quality_Q14), (int)silkEncoderControl.coding_quality_Q14));
        }
        n12 = silkChannelEncoder.indices.signalType == 2 ? Inlines.silk_SMLAWB((int)n12, (int)512, (int)silkChannelEncoder.LTPCorr_Q15) : Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_SMLAWB((int)3072, (int)-104858, (int)silkChannelEncoder.SNR_dB_Q7), (int)(16384 - silkEncoderControl.input_quality_Q14));
        if (silkChannelEncoder.indices.signalType == 2) {
            silkChannelEncoder.indices.quantOffsetType = 0;
            silkEncoderControl.sparseness_Q8 = 0;
        } else {
            int n14 = Inlines.silk_LSHIFT((int)silkChannelEncoder.fs_kHz, (int)1);
            int n15 = 0;
            int n16 = 0;
            int n17 = n;
            BoxedValueInt boxedValueInt = new BoxedValueInt(0);
            BoxedValueInt boxedValueInt2 = new BoxedValueInt(0);
            for (n9 = 0; n9 < Inlines.silk_SMULBB((int)5, (int)silkChannelEncoder.nb_subfr) / 2; ++n9) {
                SumSqrShift.silk_sum_sqr_shift(boxedValueInt, boxedValueInt2, sArray, n17, n14);
                n8 = boxedValueInt.Val;
                n10 = boxedValueInt2.Val;
                int n18 = Inlines.silk_lin2log((int)(n8 += Inlines.silk_RSHIFT((int)n14, (int)n10)));
                if (n9 > 0) {
                    n15 += Inlines.silk_abs((int)(n18 - n16));
                }
                n16 = n18;
                n17 += n14;
            }
            silkEncoderControl.sparseness_Q8 = Inlines.silk_RSHIFT((int)Sigmoid.silk_sigm_Q15(Inlines.silk_SMULWB((int)(n15 - 640), (int)6554)), (int)7);
            silkChannelEncoder.indices.quantOffsetType = silkEncoderControl.sparseness_Q8 > 192 ? (byte)0 : 1;
            n12 = Inlines.silk_SMLAWB((int)n12, (int)65536, (int)(silkEncoderControl.sparseness_Q8 - 128));
        }
        int n19 = Inlines.silk_SMULWB((int)silkEncoderControl.predGain_Q16, (int)66);
        int n20 = n7 = Inlines.silk_DIV32_varQ((int)62259, (int)Inlines.silk_SMLAWW((int)65536, (int)n19, (int)n19), (int)16);
        int n21 = Inlines.silk_SMULWB((int)(65536 - Inlines.silk_SMULBB((int)3, (int)silkEncoderControl.coding_quality_Q14)), (int)655);
        n20 = Inlines.silk_SUB32((int)n20, (int)n21);
        n7 = Inlines.silk_ADD32((int)n7, (int)n21);
        n20 = Inlines.silk_DIV32_16((int)Inlines.silk_LSHIFT((int)n20, (int)14), (int)Inlines.silk_RSHIFT((int)n7, (int)2));
        int n22 = silkChannelEncoder.warping_Q16 > 0 ? Inlines.silk_SMLAWB((int)silkChannelEncoder.warping_Q16, (int)silkEncoderControl.coding_quality_Q14, (int)2621) : 0;
        short[] sArray3 = new short[silkChannelEncoder.shapeWinLength];
        for (n9 = 0; n9 < silkChannelEncoder.nb_subfr; ++n9) {
            int n23 = silkChannelEncoder.fs_kHz * 3;
            int n24 = Inlines.silk_RSHIFT((int)(silkChannelEncoder.shapeWinLength - n23), (int)1);
            ApplySineWindow.silk_apply_sine_window((short[])sArray3, (int)0, (short[])sArray2, (int)n11, (int)1, (int)n24);
            int n25 = n24;
            System.arraycopy(sArray2, n11 + n25, sArray3, n25, n23);
            ApplySineWindow.silk_apply_sine_window((short[])sArray3, (int)(n25 += n23), (short[])sArray2, (int)(n11 + n25), (int)2, (int)n24);
            n11 += silkChannelEncoder.subfr_length;
            BoxedValueInt boxedValueInt = new BoxedValueInt(n10);
            if (silkChannelEncoder.warping_Q16 > 0) {
                Autocorrelation.silk_warped_autocorrelation((int[])nArray, (BoxedValueInt)boxedValueInt, (short[])sArray3, (int)n22, (int)silkChannelEncoder.shapeWinLength, (int)silkChannelEncoder.shapingLPCOrder);
            } else {
                Autocorrelation.silk_autocorr((int[])nArray, (BoxedValueInt)boxedValueInt, (short[])sArray3, (int)silkChannelEncoder.shapeWinLength, (int)(silkChannelEncoder.shapingLPCOrder + 1));
            }
            n10 = boxedValueInt.Val;
            nArray[0] = Inlines.silk_ADD32((int)nArray[0], (int)Inlines.silk_max_32((int)Inlines.silk_SMULWB((int)Inlines.silk_RSHIFT((int)nArray[0], (int)4), (int)52), (int)1));
            n8 = Schur.silk_schur64(nArray2, nArray, silkChannelEncoder.shapingLPCOrder);
            Inlines.OpusAssert((n8 >= 0 ? 1 : 0) != 0);
            K2A.silk_k2a_Q16((int[])nArray4, (int[])nArray2, (int)silkChannelEncoder.shapingLPCOrder);
            int n26 = -n10;
            Inlines.OpusAssert((n26 >= -12 ? 1 : 0) != 0);
            Inlines.OpusAssert((n26 <= 30 ? 1 : 0) != 0);
            if ((n26 & 1) != 0) {
                --n26;
                n8 >>= 1;
            }
            int n27 = Inlines.silk_SQRT_APPROX((int)n8);
            silkEncoderControl.Gains_Q16[n9] = Inlines.silk_LSHIFT_SAT32((int)n27, (int)(16 - (n26 >>= 1)));
            if (silkChannelEncoder.warping_Q16 > 0) {
                n6 = NoiseShapeAnalysis.warped_gain(nArray4, n22, silkChannelEncoder.shapingLPCOrder);
                Inlines.OpusAssert((silkEncoderControl.Gains_Q16[n9] >= 0 ? 1 : 0) != 0);
                silkEncoderControl.Gains_Q16[n9] = Inlines.silk_SMULWW((int)Inlines.silk_RSHIFT_ROUND((int)silkEncoderControl.Gains_Q16[n9], (int)1), (int)n6) >= 0x3FFFFFFF ? Integer.MAX_VALUE : Inlines.silk_SMULWW((int)silkEncoderControl.Gains_Q16[n9], (int)n6);
            }
            BWExpander.silk_bwexpander_32((int[])nArray4, (int)silkChannelEncoder.shapingLPCOrder, (int)n7);
            System.arraycopy(nArray4, 0, nArray3, 0, silkChannelEncoder.shapingLPCOrder);
            Inlines.OpusAssert((n20 <= 65536 ? 1 : 0) != 0);
            BWExpander.silk_bwexpander_32((int[])nArray3, (int)silkChannelEncoder.shapingLPCOrder, (int)n20);
            int n28 = LPCInversePredGain.silk_LPC_inverse_pred_gain_Q24((int[])nArray4, (int)silkChannelEncoder.shapingLPCOrder);
            n8 = LPCInversePredGain.silk_LPC_inverse_pred_gain_Q24((int[])nArray3, (int)silkChannelEncoder.shapingLPCOrder);
            n28 = Inlines.silk_LSHIFT32((int)Inlines.silk_SMULWB((int)n28, (int)22938), (int)1);
            silkEncoderControl.GainsPre_Q14[n9] = 4915 + Inlines.silk_DIV32_varQ((int)n28, (int)n8, (int)14);
            NoiseShapeAnalysis.limit_warped_coefs(nArray4, nArray3, n22, 67092088, silkChannelEncoder.shapingLPCOrder);
            for (int i = 0; i < silkChannelEncoder.shapingLPCOrder; ++i) {
                silkEncoderControl.AR1_Q13[n9 * 16 + i] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)nArray3[i], (int)11));
                silkEncoderControl.AR2_Q13[n9 * 16 + i] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)nArray4[i], (int)11));
            }
        }
        n6 = Inlines.silk_log2lin((int)(-Inlines.silk_SMLAWB((int)-2048, (int)n12, (int)10486)));
        int n29 = Inlines.silk_log2lin((int)Inlines.silk_SMLAWB((int)2048, (int)256, (int)10486));
        Inlines.OpusAssert((n6 > 0 ? 1 : 0) != 0);
        for (n9 = 0; n9 < silkChannelEncoder.nb_subfr; ++n9) {
            silkEncoderControl.Gains_Q16[n9] = Inlines.silk_SMULWW((int)silkEncoderControl.Gains_Q16[n9], (int)n6);
            Inlines.OpusAssert((silkEncoderControl.Gains_Q16[n9] >= 0 ? 1 : 0) != 0);
            silkEncoderControl.Gains_Q16[n9] = Inlines.silk_ADD_POS_SAT32((int)silkEncoderControl.Gains_Q16[n9], (int)n29);
        }
        n6 = 65536 + Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_MLA((int)0x333333, (int)silkEncoderControl.coding_quality_Q14, (int)410), (int)10);
        for (n9 = 0; n9 < silkChannelEncoder.nb_subfr; ++n9) {
            silkEncoderControl.GainsPre_Q14[n9] = Inlines.silk_SMULWB((int)n6, (int)silkEncoderControl.GainsPre_Q14[n9]);
        }
        n19 = Inlines.silk_MUL((int)64, (int)Inlines.silk_SMLAWB((int)4096, (int)4096, (int)(silkChannelEncoder.input_quality_bands_Q15[0] - 32768)));
        n19 = Inlines.silk_RSHIFT((int)Inlines.silk_MUL((int)n19, (int)silkChannelEncoder.speech_activity_Q8), (int)8);
        if (silkChannelEncoder.indices.signalType == 2) {
            int n30 = Inlines.silk_DIV32_16((int)3277, (int)silkChannelEncoder.fs_kHz);
            n9 = 0;
            while (n9 < silkChannelEncoder.nb_subfr) {
                n5 = n30 + Inlines.silk_DIV32_16((int)49152, (int)silkEncoderControl.pitchL[n9]);
                silkEncoderControl.LF_shp_Q14[n9] = Inlines.silk_LSHIFT((int)(16384 - n5 - Inlines.silk_SMULWB((int)n19, (int)n5)), (int)16);
                int n31 = n9++;
                silkEncoderControl.LF_shp_Q14[n31] = silkEncoderControl.LF_shp_Q14[n31] | n5 - 16384 & 0xFFFF;
            }
            Inlines.OpusAssert((boolean)true);
            n4 = -16384 - Inlines.silk_SMULWB((int)49152, (int)Inlines.silk_SMULWB((int)0x59999A, (int)silkChannelEncoder.speech_activity_Q8));
        } else {
            n5 = Inlines.silk_DIV32_16((int)21299, (int)silkChannelEncoder.fs_kHz);
            silkEncoderControl.LF_shp_Q14[0] = Inlines.silk_LSHIFT((int)(16384 - n5 - Inlines.silk_SMULWB((int)n19, (int)Inlines.silk_SMULWB((int)39322, (int)n5))), (int)16);
            silkEncoderControl.LF_shp_Q14[0] = silkEncoderControl.LF_shp_Q14[0] | n5 - 16384 & 0xFFFF;
            for (n9 = 1; n9 < silkChannelEncoder.nb_subfr; ++n9) {
                silkEncoderControl.LF_shp_Q14[n9] = silkEncoderControl.LF_shp_Q14[0];
            }
            n4 = -16384;
        }
        int n32 = Inlines.silk_SMULWB((int)Inlines.silk_SMULWB((int)(131072 - Inlines.silk_LSHIFT((int)silkEncoderControl.coding_quality_Q14, (int)3)), (int)silkChannelEncoder.LTPCorr_Q15), (int)6554);
        n32 = Inlines.silk_SMLAWB((int)n32, (int)(65536 - Inlines.silk_LSHIFT((int)silkEncoderControl.input_quality_Q14, (int)2)), (int)6554);
        if (silkChannelEncoder.indices.signalType == 2) {
            n3 = Inlines.silk_SMLAWB((int)19661, (int)(65536 - Inlines.silk_SMULWB((int)(262144 - Inlines.silk_LSHIFT((int)silkEncoderControl.coding_quality_Q14, (int)4)), (int)silkEncoderControl.input_quality_Q14)), (int)13107);
            n3 = Inlines.silk_SMULWB((int)Inlines.silk_LSHIFT((int)n3, (int)1), (int)Inlines.silk_SQRT_APPROX((int)Inlines.silk_LSHIFT((int)silkChannelEncoder.LTPCorr_Q15, (int)15)));
        } else {
            n3 = 0;
        }
        for (n9 = 0; n9 < 4; ++n9) {
            silkShapeState.HarmBoost_smth_Q16 = Inlines.silk_SMLAWB((int)silkShapeState.HarmBoost_smth_Q16, (int)(n32 - silkShapeState.HarmBoost_smth_Q16), (int)26214);
            silkShapeState.HarmShapeGain_smth_Q16 = Inlines.silk_SMLAWB((int)silkShapeState.HarmShapeGain_smth_Q16, (int)(n3 - silkShapeState.HarmShapeGain_smth_Q16), (int)26214);
            silkShapeState.Tilt_smth_Q16 = Inlines.silk_SMLAWB((int)silkShapeState.Tilt_smth_Q16, (int)(n4 - silkShapeState.Tilt_smth_Q16), (int)26214);
            silkEncoderControl.HarmBoost_Q14[n9] = Inlines.silk_RSHIFT_ROUND((int)silkShapeState.HarmBoost_smth_Q16, (int)2);
            silkEncoderControl.HarmShapeGain_Q14[n9] = Inlines.silk_RSHIFT_ROUND((int)silkShapeState.HarmShapeGain_smth_Q16, (int)2);
            silkEncoderControl.Tilt_Q14[n9] = Inlines.silk_RSHIFT_ROUND((int)silkShapeState.Tilt_smth_Q16, (int)2);
        }
    }

    static void limit_warped_coefs(int[] nArray, int[] nArray2, int n, int n2, int n3) {
        int n4;
        int n5 = 0;
        n = -n;
        for (n4 = n3 - 1; n4 > 0; --n4) {
            nArray[n4 - 1] = Inlines.silk_SMLAWB((int)nArray[n4 - 1], (int)nArray[n4], (int)n);
            nArray2[n4 - 1] = Inlines.silk_SMLAWB((int)nArray2[n4 - 1], (int)nArray2[n4], (int)n);
        }
        n = -n;
        int n6 = Inlines.silk_SMLAWB((int)65536, (int)(-n), (int)n);
        int n7 = Inlines.silk_SMLAWB((int)0x1000000, (int)nArray[0], (int)n);
        int n8 = Inlines.silk_DIV32_varQ((int)n6, (int)n7, (int)24);
        n7 = Inlines.silk_SMLAWB((int)0x1000000, (int)nArray2[0], (int)n);
        int n9 = Inlines.silk_DIV32_varQ((int)n6, (int)n7, (int)24);
        for (n4 = 0; n4 < n3; ++n4) {
            nArray[n4] = Inlines.silk_SMULWW((int)n8, (int)nArray[n4]);
            nArray2[n4] = Inlines.silk_SMULWW((int)n9, (int)nArray2[n4]);
        }
        for (int i = 0; i < 10; ++i) {
            int n10 = -1;
            for (n4 = 0; n4 < n3; ++n4) {
                int n11 = Inlines.silk_max((int)Inlines.silk_abs_int32((int)nArray[n4]), (int)Inlines.silk_abs_int32((int)nArray2[n4]));
                if (n11 <= n10) continue;
                n10 = n11;
                n5 = n4;
            }
            if (n10 <= n2) {
                return;
            }
            for (n4 = 1; n4 < n3; ++n4) {
                nArray[n4 - 1] = Inlines.silk_SMLAWB((int)nArray[n4 - 1], (int)nArray[n4], (int)n);
                nArray2[n4 - 1] = Inlines.silk_SMLAWB((int)nArray2[n4 - 1], (int)nArray2[n4], (int)n);
            }
            n8 = Inlines.silk_INVERSE32_varQ((int)n8, (int)32);
            n9 = Inlines.silk_INVERSE32_varQ((int)n9, (int)32);
            for (n4 = 0; n4 < n3; ++n4) {
                nArray[n4] = Inlines.silk_SMULWW((int)n8, (int)nArray[n4]);
                nArray2[n4] = Inlines.silk_SMULWW((int)n9, (int)nArray2[n4]);
            }
            int n12 = 64881 - Inlines.silk_DIV32_varQ((int)Inlines.silk_SMULWB((int)(n10 - n2), (int)Inlines.silk_SMLABB((int)819, (int)102, (int)i)), (int)Inlines.silk_MUL((int)n10, (int)(n5 + 1)), (int)22);
            BWExpander.silk_bwexpander_32((int[])nArray, (int)n3, (int)n12);
            BWExpander.silk_bwexpander_32((int[])nArray2, (int)n3, (int)n12);
            n = -n;
            for (n4 = n3 - 1; n4 > 0; --n4) {
                nArray[n4 - 1] = Inlines.silk_SMLAWB((int)nArray[n4 - 1], (int)nArray[n4], (int)n);
                nArray2[n4 - 1] = Inlines.silk_SMLAWB((int)nArray2[n4 - 1], (int)nArray2[n4], (int)n);
            }
            n = -n;
            n6 = Inlines.silk_SMLAWB((int)65536, (int)(-n), (int)n);
            n7 = Inlines.silk_SMLAWB((int)0x1000000, (int)nArray[0], (int)n);
            n8 = Inlines.silk_DIV32_varQ((int)n6, (int)n7, (int)24);
            n7 = Inlines.silk_SMLAWB((int)0x1000000, (int)nArray2[0], (int)n);
            n9 = Inlines.silk_DIV32_varQ((int)n6, (int)n7, (int)24);
            for (n4 = 0; n4 < n3; ++n4) {
                nArray[n4] = Inlines.silk_SMULWW((int)n8, (int)nArray[n4]);
                nArray2[n4] = Inlines.silk_SMULWW((int)n9, (int)nArray2[n4]);
            }
        }
        Inlines.OpusAssert((boolean)false);
    }

    static int warped_gain(int[] nArray, int n, int n2) {
        n = -n;
        int n3 = nArray[n2 - 1];
        for (int i = n2 - 2; i >= 0; --i) {
            n3 = Inlines.silk_SMLAWB((int)nArray[i], (int)n3, (int)n);
        }
        n3 = Inlines.silk_SMLAWB((int)0x1000000, (int)n3, (int)(-n));
        return Inlines.silk_INVERSE32_varQ((int)n3, (int)40);
    }
}

