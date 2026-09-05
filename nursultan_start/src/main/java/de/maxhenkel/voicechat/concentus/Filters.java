/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.SilkChannelEncoder
 *  de.maxhenkel.voicechat.concentus.SilkEncoderControl
 *  de.maxhenkel.voicechat.concentus.SilkPrefilterState
 *  de.maxhenkel.voicechat.concentus.SilkTables
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Kernels;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkEncoderControl;
import de.maxhenkel.voicechat.concentus.SilkPrefilterState;
import de.maxhenkel.voicechat.concentus.SilkTables;

class Filters {
    private static final short A_fb1_20 = 10788;
    private static final short A_fb1_21 = -24290;
    private static final int QA = 24;
    private static final int A_LIMIT = 0xFFEF9E;

    Filters() {
    }

    static void silk_bwexpander_32(int[] nArray, int n, int n2) {
        int n3 = n2 - 65536;
        for (int i = 0; i < n - 1; ++i) {
            nArray[i] = Inlines.silk_SMULWW(n2, nArray[i]);
            n2 += Inlines.silk_RSHIFT_ROUND(Inlines.silk_MUL(n2, n3), 16);
        }
        nArray[n - 1] = Inlines.silk_SMULWW(n2, nArray[n - 1]);
    }

    static void silk_LPC_analysis_filter(short[] sArray, int n, short[] sArray2, int n2, short[] sArray3, int n3, int n4, int n5) {
        int n6;
        short[] sArray4 = new short[16];
        short[] sArray5 = new short[16];
        Inlines.OpusAssert(n5 >= 6);
        Inlines.OpusAssert((n5 & 1) == 0);
        Inlines.OpusAssert(n5 <= n4);
        Inlines.OpusAssert(n5 <= 16);
        for (n6 = 0; n6 < n5; ++n6) {
            sArray5[n6] = (short)(0 - sArray3[n3 + n6]);
        }
        for (n6 = 0; n6 < n5; ++n6) {
            sArray4[n6] = sArray2[n2 + n5 - n6 - 1];
        }
        Kernels.celt_fir(sArray2, n2 + n5, sArray5, sArray, n + n5, n4 - n5, n5, sArray4);
        for (n6 = n; n6 < n + n5; ++n6) {
            sArray[n6] = 0;
        }
    }

    static int silk_LPC_inverse_pred_gain(short[] sArray, int n) {
        int[][] nArrayArray = new int[][]{new int[n], new int[n]};
        int n2 = 0;
        int[] nArray = nArrayArray[n & 1];
        for (int i = 0; i < n; ++i) {
            n2 += sArray[i];
            nArray[i] = Inlines.silk_LSHIFT32(sArray[i], 12);
        }
        if (n2 >= 4096) {
            return 0;
        }
        return Filters.LPC_inverse_pred_gain_QA(nArrayArray, n);
    }

    static int LPC_inverse_pred_gain_QA(int[][] nArray, int n) {
        int n2;
        int n3;
        int[] nArray2 = nArray[n & 1];
        int n4 = 0x40000000;
        for (int i = n - 1; i > 0; --i) {
            if (nArray2[i] > 0xFFEF9E || nArray2[i] < -16773022) {
                return 0;
            }
            n3 = 0 - Inlines.silk_LSHIFT(nArray2[i], 7);
            n2 = 0x40000000 - Inlines.silk_SMMUL(n3, n3);
            Inlines.OpusAssert(n2 > 32768);
            Inlines.OpusAssert(n2 <= 0x40000000);
            int n5 = 32 - Inlines.silk_CLZ32(Inlines.silk_abs(n2));
            int n6 = Inlines.silk_INVERSE32_varQ(n2, n5 + 30);
            n4 = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(n4, n2), 2);
            Inlines.OpusAssert(n4 >= 0);
            Inlines.OpusAssert(n4 <= 0x40000000);
            int[] nArray3 = nArray2;
            nArray2 = nArray[i & 1];
            for (int j = 0; j < i; ++j) {
                int n7 = nArray3[j] - Inlines.MUL32_FRAC_Q(nArray3[i - j - 1], n3, 31);
                nArray2[j] = Inlines.MUL32_FRAC_Q(n7, n6, n5);
            }
        }
        if (nArray2[0] > 0xFFEF9E || nArray2[0] < -16773022) {
            return 0;
        }
        n3 = 0 - Inlines.silk_LSHIFT(nArray2[0], 7);
        n2 = 0x40000000 - Inlines.silk_SMMUL(n3, n3);
        Inlines.OpusAssert((n4 = Inlines.silk_LSHIFT(Inlines.silk_SMMUL(n4, n2), 2)) >= 0);
        Inlines.OpusAssert(n4 <= 0x40000000);
        return n4;
    }

    static void silk_ana_filt_bank_1(short[] sArray, int n, int[] nArray, short[] sArray2, short[] sArray3, int n2, int n3) {
        int n4 = Inlines.silk_RSHIFT(n3, 1);
        for (int i = 0; i < n4; ++i) {
            int n5 = Inlines.silk_LSHIFT(sArray[n + 2 * i], 10);
            int n6 = Inlines.silk_SUB32(n5, nArray[0]);
            int n7 = Inlines.silk_SMLAWB(n6, n6, -24290);
            int n8 = Inlines.silk_ADD32(nArray[0], n7);
            nArray[0] = Inlines.silk_ADD32(n5, n7);
            n5 = Inlines.silk_LSHIFT(sArray[n + 2 * i + 1], 10);
            n6 = Inlines.silk_SUB32(n5, nArray[1]);
            n7 = Inlines.silk_SMULWB(n6, 10788);
            int n9 = Inlines.silk_ADD32(nArray[1], n7);
            nArray[1] = Inlines.silk_ADD32(n5, n7);
            sArray2[i] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(Inlines.silk_ADD32(n9, n8), 11));
            sArray3[n2 + i] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(Inlines.silk_SUB32(n9, n8), 11));
        }
    }

    static void silk_warped_LPC_analysis_filter(int[] nArray, int[] nArray2, short[] sArray, int n, short[] sArray2, int n2, short s, int n3, int n4) {
        Inlines.OpusAssert((n4 & 1) == 0);
        for (int i = 0; i < n3; ++i) {
            int n5 = Inlines.silk_SMLAWB(nArray[0], nArray[1], s);
            nArray[0] = Inlines.silk_LSHIFT(sArray2[n2 + i], 14);
            int n6 = Inlines.silk_SMLAWB(nArray[1], nArray[2] - n5, s);
            nArray[1] = n5;
            int n7 = Inlines.silk_RSHIFT(n4, 1);
            n7 = Inlines.silk_SMLAWB(n7, n5, sArray[n]);
            for (int j = 2; j < n4; j += 2) {
                n5 = Inlines.silk_SMLAWB(nArray[j], nArray[j + 1] - n6, s);
                nArray[j] = n6;
                n7 = Inlines.silk_SMLAWB(n7, n6, sArray[n + j - 1]);
                n6 = Inlines.silk_SMLAWB(nArray[j + 1], nArray[j + 2] - n5, s);
                nArray[j + 1] = n5;
                n7 = Inlines.silk_SMLAWB(n7, n5, sArray[n + j]);
            }
            nArray[n4] = n6;
            n7 = Inlines.silk_SMLAWB(n7, n6, sArray[n + n4 - 1]);
            nArray2[i] = Inlines.silk_LSHIFT(sArray2[n2 + i], 2) - Inlines.silk_RSHIFT_ROUND(n7, 9);
        }
    }

    static void silk_LP_interpolate_filter_taps(int[] nArray, int[] nArray2, int n, int n2) {
        if (n < 4) {
            if (n2 > 0) {
                if (n2 < 32768) {
                    for (int i = 0; i < 3; ++i) {
                        nArray[i] = Inlines.silk_SMLAWB(SilkTables.silk_Transition_LP_B_Q28[n][i], SilkTables.silk_Transition_LP_B_Q28[n + 1][i] - SilkTables.silk_Transition_LP_B_Q28[n][i], n2);
                    }
                    for (int i = 0; i < 2; ++i) {
                        nArray2[i] = Inlines.silk_SMLAWB(SilkTables.silk_Transition_LP_A_Q28[n][i], SilkTables.silk_Transition_LP_A_Q28[n + 1][i] - SilkTables.silk_Transition_LP_A_Q28[n][i], n2);
                    }
                } else {
                    Inlines.OpusAssert(n2 - 65536 == Inlines.silk_SAT16(n2 - 65536));
                    for (int i = 0; i < 3; ++i) {
                        nArray[i] = Inlines.silk_SMLAWB(SilkTables.silk_Transition_LP_B_Q28[n + 1][i], SilkTables.silk_Transition_LP_B_Q28[n + 1][i] - SilkTables.silk_Transition_LP_B_Q28[n][i], n2 - 65536);
                    }
                    for (int i = 0; i < 2; ++i) {
                        nArray2[i] = Inlines.silk_SMLAWB(SilkTables.silk_Transition_LP_A_Q28[n + 1][i], SilkTables.silk_Transition_LP_A_Q28[n + 1][i] - SilkTables.silk_Transition_LP_A_Q28[n][i], n2 - 65536);
                    }
                }
            } else {
                System.arraycopy(SilkTables.silk_Transition_LP_B_Q28[n], 0, nArray, 0, 3);
                System.arraycopy(SilkTables.silk_Transition_LP_A_Q28[n], 0, nArray2, 0, 2);
            }
        } else {
            System.arraycopy(SilkTables.silk_Transition_LP_B_Q28[4], 0, nArray, 0, 3);
            System.arraycopy(SilkTables.silk_Transition_LP_A_Q28[4], 0, nArray2, 0, 2);
        }
    }

    static void silk_biquad_alt(short[] sArray, int n, int[] nArray, int[] nArray2, int[] nArray3, short[] sArray2, int n2, int n3, int n4) {
        int n5 = -nArray2[0] & 0x3FFF;
        int n6 = Inlines.silk_RSHIFT(-nArray2[0], 14);
        int n7 = -nArray2[1] & 0x3FFF;
        int n8 = Inlines.silk_RSHIFT(-nArray2[1], 14);
        for (int i = 0; i < n3; ++i) {
            short s = sArray[n + i * n4];
            int n9 = Inlines.silk_LSHIFT(Inlines.silk_SMLAWB(nArray3[0], nArray[0], s), 2);
            nArray3[0] = nArray3[1] + Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWB(n9, n5), 14);
            nArray3[0] = Inlines.silk_SMLAWB(nArray3[0], n9, n6);
            nArray3[0] = Inlines.silk_SMLAWB(nArray3[0], nArray[1], s);
            nArray3[1] = Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWB(n9, n7), 14);
            nArray3[1] = Inlines.silk_SMLAWB(nArray3[1], n9, n8);
            nArray3[1] = Inlines.silk_SMLAWB(nArray3[1], nArray[2], s);
            sArray2[n2 + i * n4] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT(n9 + 16384 - 1, 14));
        }
    }

    static void silk_biquad_alt(short[] sArray, int n, int[] nArray, int[] nArray2, int[] nArray3, int n2, short[] sArray2, int n3, int n4, int n5) {
        int n6 = -nArray2[0] & 0x3FFF;
        int n7 = Inlines.silk_RSHIFT(-nArray2[0], 14);
        int n8 = -nArray2[1] & 0x3FFF;
        int n9 = Inlines.silk_RSHIFT(-nArray2[1], 14);
        for (int i = 0; i < n4; ++i) {
            int n10 = n2 + 1;
            short s = sArray[n + i * n5];
            int n11 = Inlines.silk_LSHIFT(Inlines.silk_SMLAWB(nArray3[n2], nArray[0], s), 2);
            nArray3[n2] = nArray3[n10] + Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWB(n11, n6), 14);
            nArray3[n2] = Inlines.silk_SMLAWB(nArray3[n2], n11, n7);
            nArray3[n2] = Inlines.silk_SMLAWB(nArray3[n2], nArray[1], s);
            nArray3[n10] = Inlines.silk_RSHIFT_ROUND(Inlines.silk_SMULWB(n11, n8), 14);
            nArray3[n10] = Inlines.silk_SMLAWB(nArray3[n10], n11, n9);
            nArray3[n10] = Inlines.silk_SMLAWB(nArray3[n10], nArray[2], s);
            sArray2[n3 + i * n5] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT(n11 + 16384 - 1, 14));
        }
    }

    static void silk_prefilter(SilkChannelEncoder silkChannelEncoder, SilkEncoderControl silkEncoderControl, int[] nArray, short[] sArray, int n) {
        SilkPrefilterState silkPrefilterState = silkChannelEncoder.sPrefilt;
        short[] sArray2 = new short[2];
        int n2 = n;
        int n3 = 0;
        int n4 = silkPrefilterState.lagPrev;
        int[] nArray2 = new int[silkChannelEncoder.subfr_length];
        int[] nArray3 = new int[silkChannelEncoder.subfr_length];
        for (int i = 0; i < silkChannelEncoder.nb_subfr; ++i) {
            int n5;
            if (silkChannelEncoder.indices.signalType == 2) {
                n4 = silkEncoderControl.pitchL[i];
            }
            Inlines.OpusAssert((n5 = Inlines.silk_SMULWB(silkEncoderControl.HarmShapeGain_Q14[i], 16384 - silkEncoderControl.HarmBoost_Q14[i])) >= 0);
            int n6 = Inlines.silk_RSHIFT(n5, 2);
            n6 |= Inlines.silk_LSHIFT(Inlines.silk_RSHIFT(n5, 1), 16);
            int n7 = silkEncoderControl.Tilt_Q14[i];
            int n8 = silkEncoderControl.LF_shp_Q14[i];
            int n9 = i * 16;
            Filters.silk_warped_LPC_analysis_filter(silkPrefilterState.sAR_shp, nArray3, silkEncoderControl.AR1_Q13, n9, sArray, n2, (short)silkChannelEncoder.warping_Q16, silkChannelEncoder.subfr_length, silkChannelEncoder.shapingLPCOrder);
            sArray2[0] = (short)Inlines.silk_RSHIFT_ROUND(silkEncoderControl.GainsPre_Q14[i], 4);
            int n10 = Inlines.silk_SMLABB(0x333333, silkEncoderControl.HarmBoost_Q14[i], n5);
            n10 = Inlines.silk_SMLABB(n10, silkEncoderControl.coding_quality_Q14, 410);
            n10 = Inlines.silk_SMULWB(n10, -silkEncoderControl.GainsPre_Q14[i]);
            n10 = Inlines.silk_RSHIFT_ROUND(n10, 14);
            sArray2[1] = (short)Inlines.silk_SAT16(n10);
            nArray2[0] = Inlines.silk_MLA(Inlines.silk_MUL(nArray3[0], sArray2[0]), silkPrefilterState.sHarmHP_Q2, sArray2[1]);
            for (int j = 1; j < silkChannelEncoder.subfr_length; ++j) {
                nArray2[j] = Inlines.silk_MLA(Inlines.silk_MUL(nArray3[j], sArray2[0]), nArray3[j - 1], sArray2[1]);
            }
            silkPrefilterState.sHarmHP_Q2 = nArray3[silkChannelEncoder.subfr_length - 1];
            Filters.silk_prefilt(silkPrefilterState, nArray2, nArray, n3, n6, n7, n8, n4, silkChannelEncoder.subfr_length);
            n2 += silkChannelEncoder.subfr_length;
            n3 += silkChannelEncoder.subfr_length;
        }
        silkPrefilterState.lagPrev = silkEncoderControl.pitchL[silkChannelEncoder.nb_subfr - 1];
    }

    static void silk_prefilt(SilkPrefilterState silkPrefilterState, int[] nArray, int[] nArray2, int n, int n2, int n3, int n4, int n5, int n6) {
        short[] sArray = silkPrefilterState.sLTP_shp;
        int n7 = silkPrefilterState.sLTP_shp_buf_idx;
        int n8 = silkPrefilterState.sLF_AR_shp_Q12;
        int n9 = silkPrefilterState.sLF_MA_shp_Q12;
        for (int i = 0; i < n6; ++i) {
            int n10;
            if (n5 > 0) {
                Inlines.OpusAssert(true);
                int n11 = n5 + n7;
                n10 = Inlines.silk_SMULBB(sArray[n11 - 1 - 1 & 0x1FF], n2);
                n10 = Inlines.silk_SMLABT(n10, sArray[n11 - 1 & 0x1FF], n2);
                n10 = Inlines.silk_SMLABB(n10, sArray[n11 - 1 + 1 & 0x1FF], n2);
            } else {
                n10 = 0;
            }
            int n12 = Inlines.silk_SMULWB(n8, n3);
            int n13 = Inlines.silk_SMLAWB(Inlines.silk_SMULWT(n8, n4), n9, n4);
            n8 = Inlines.silk_SUB32(nArray[i], Inlines.silk_LSHIFT(n12, 2));
            n9 = Inlines.silk_SUB32(n8, Inlines.silk_LSHIFT(n13, 2));
            n7 = n7 - 1 & 0x1FF;
            sArray[n7] = (short)Inlines.silk_SAT16(Inlines.silk_RSHIFT_ROUND(n9, 12));
            nArray2[n + i] = Inlines.silk_RSHIFT_ROUND(Inlines.silk_SUB32(n9, n10), 9);
        }
        silkPrefilterState.sLF_AR_shp_Q12 = n8;
        silkPrefilterState.sLF_MA_shp_Q12 = n9;
        silkPrefilterState.sLTP_shp_buf_idx = n7;
    }
}

