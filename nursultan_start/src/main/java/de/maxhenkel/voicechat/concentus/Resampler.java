/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkError;
import de.maxhenkel.voicechat.concentus.SilkResamplerState;
import de.maxhenkel.voicechat.concentus.SilkTables;

class Resampler {
    private static final int USE_silk_resampler_copy = 0;
    private static final int USE_silk_resampler_private_up2_HQ_wrapper = 1;
    private static final int USE_silk_resampler_private_IIR_FIR = 2;
    private static final int USE_silk_resampler_private_down_FIR = 3;
    private static final int ORDER_FIR = 4;

    Resampler() {
    }

    static void silk_resampler_private_AR2(int[] nArray, int n, int[] nArray2, int n2, short[] sArray, int n3, short[] sArray2, int n4) {
        for (int i = 0; i < n4; ++i) {
            int n5;
            nArray2[n2 + i] = n5 = Inlines.silk_ADD_LSHIFT32((int)nArray[n], (int)sArray[n3 + i], (int)8);
            n5 = Inlines.silk_LSHIFT((int)n5, (int)2);
            nArray[n] = Inlines.silk_SMLAWB((int)nArray[n + 1], (int)n5, (int)sArray2[0]);
            nArray[n + 1] = Inlines.silk_SMULWB((int)n5, (int)sArray2[1]);
        }
    }

    static void silk_resampler_down2_3(int[] nArray, short[] sArray, short[] sArray2, int n) {
        int n2;
        int[] nArray2 = new int[484];
        int n3 = 0;
        int n4 = 0;
        System.arraycopy(nArray, 0, nArray2, 0, 4);
        while (true) {
            n2 = Inlines.silk_min((int)n, (int)480);
            Resampler.silk_resampler_private_AR2(nArray, 4, nArray2, 4, sArray2, n3, SilkTables.silk_Resampler_2_3_COEFS_LQ, n2);
            int n5 = 0;
            for (int i = n2; i > 2; i -= 3) {
                int n6 = Inlines.silk_SMULWB((int)nArray2[n5], (int)SilkTables.silk_Resampler_2_3_COEFS_LQ[2]);
                n6 = Inlines.silk_SMLAWB((int)n6, (int)nArray2[n5 + 1], (int)SilkTables.silk_Resampler_2_3_COEFS_LQ[3]);
                n6 = Inlines.silk_SMLAWB((int)n6, (int)nArray2[n5 + 2], (int)SilkTables.silk_Resampler_2_3_COEFS_LQ[5]);
                n6 = Inlines.silk_SMLAWB((int)n6, (int)nArray2[n5 + 3], (int)SilkTables.silk_Resampler_2_3_COEFS_LQ[4]);
                sArray[n4++] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n6, (int)6));
                n6 = Inlines.silk_SMULWB((int)nArray2[n5 + 1], (int)SilkTables.silk_Resampler_2_3_COEFS_LQ[4]);
                n6 = Inlines.silk_SMLAWB((int)n6, (int)nArray2[n5 + 2], (int)SilkTables.silk_Resampler_2_3_COEFS_LQ[5]);
                n6 = Inlines.silk_SMLAWB((int)n6, (int)nArray2[n5 + 3], (int)SilkTables.silk_Resampler_2_3_COEFS_LQ[3]);
                n6 = Inlines.silk_SMLAWB((int)n6, (int)nArray2[n5 + 4], (int)SilkTables.silk_Resampler_2_3_COEFS_LQ[2]);
                sArray[n4++] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n6, (int)6));
                n5 += 3;
            }
            n3 += n2;
            if ((n -= n2) <= 0) break;
            System.arraycopy(nArray2, n2, nArray2, 0, 4);
        }
        System.arraycopy(nArray2, n2, nArray, 0, 4);
    }

    static void silk_resampler_down2(int[] nArray, short[] sArray, short[] sArray2, int n) {
        int n2 = Inlines.silk_RSHIFT32((int)n, (int)1);
        Inlines.OpusAssert((boolean)true);
        Inlines.OpusAssert((boolean)true);
        for (int i = 0; i < n2; ++i) {
            int n3 = Inlines.silk_LSHIFT((int)sArray2[2 * i], (int)10);
            int n4 = Inlines.silk_SUB32((int)n3, (int)nArray[0]);
            int n5 = Inlines.silk_SMLAWB((int)n4, (int)n4, (int)-25727);
            int n6 = Inlines.silk_ADD32((int)nArray[0], (int)n5);
            nArray[0] = Inlines.silk_ADD32((int)n3, (int)n5);
            n3 = Inlines.silk_LSHIFT((int)sArray2[2 * i + 1], (int)10);
            n4 = Inlines.silk_SUB32((int)n3, (int)nArray[1]);
            n5 = Inlines.silk_SMULWB((int)n4, (int)9872);
            n6 = Inlines.silk_ADD32((int)n6, (int)nArray[1]);
            n6 = Inlines.silk_ADD32((int)n6, (int)n5);
            nArray[1] = Inlines.silk_ADD32((int)n3, (int)n5);
            sArray[i] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n6, (int)11));
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    static int silk_resampler_init(SilkResamplerState silkResamplerState, int n, int n2, int n3) {
        int n4;
        block17: {
            block27: {
                block30: {
                    block29: {
                        block28: {
                            block26: {
                                block22: {
                                    block25: {
                                        block24: {
                                            block23: {
                                                block18: {
                                                    block21: {
                                                        block20: {
                                                            block19: {
                                                                silkResamplerState.Reset();
                                                                if (n3 == 0) break block18;
                                                                if (n == 8000) break block19;
                                                                if (n == 12000) break block19;
                                                                if (n == 16000) break block19;
                                                                if (n == 24000) break block19;
                                                                if (n != 48000) break block20;
                                                            }
                                                            if (n2 == 8000) break block21;
                                                            if (n2 == 12000) break block21;
                                                            if (n2 == 16000) break block21;
                                                        }
                                                        Inlines.OpusAssert((boolean)false);
                                                        return -1;
                                                    }
                                                    silkResamplerState.inputDelay = SilkTables.delay_matrix_enc[Resampler.rateID(n)][Resampler.rateID(n2)];
                                                    break block22;
                                                }
                                                if (n == 8000) break block23;
                                                if (n == 12000) break block23;
                                                if (n != 16000) break block24;
                                            }
                                            if (n2 == 8000) break block25;
                                            if (n2 == 12000) break block25;
                                            if (n2 == 16000) break block25;
                                            if (n2 == 24000 || n2 == 48000) break block25;
                                        }
                                        Inlines.OpusAssert((boolean)false);
                                        return -1;
                                    }
                                    silkResamplerState.inputDelay = SilkTables.delay_matrix_dec[Resampler.rateID(n)][Resampler.rateID(n2)];
                                }
                                silkResamplerState.Fs_in_kHz = Inlines.silk_DIV32_16((int)n, (int)1000);
                                silkResamplerState.Fs_out_kHz = Inlines.silk_DIV32_16((int)n2, (int)1000);
                                silkResamplerState.batchSize = silkResamplerState.Fs_in_kHz * 10;
                                n4 = 0;
                                if (n2 <= n) break block26;
                                if (n2 == Inlines.silk_MUL((int)n, (int)2)) {
                                    silkResamplerState.resampler_function = 1;
                                    break block17;
                                } else {
                                    silkResamplerState.resampler_function = 2;
                                    n4 = 1;
                                }
                                break block17;
                            }
                            if (n2 >= n) break block27;
                            silkResamplerState.resampler_function = 3;
                            if (Inlines.silk_MUL((int)n2, (int)4) != Inlines.silk_MUL((int)n, (int)3)) break block28;
                            silkResamplerState.FIR_Fracs = 3;
                            silkResamplerState.FIR_Order = 18;
                            silkResamplerState.Coefs = SilkTables.silk_Resampler_3_4_COEFS;
                            break block17;
                        }
                        if (Inlines.silk_MUL((int)n2, (int)3) != Inlines.silk_MUL((int)n, (int)2)) break block29;
                        silkResamplerState.FIR_Fracs = 2;
                        silkResamplerState.FIR_Order = 18;
                        silkResamplerState.Coefs = SilkTables.silk_Resampler_2_3_COEFS;
                        break block17;
                    }
                    if (Inlines.silk_MUL((int)n2, (int)2) != n) break block30;
                    silkResamplerState.FIR_Fracs = 1;
                    silkResamplerState.FIR_Order = 24;
                    silkResamplerState.Coefs = SilkTables.silk_Resampler_1_2_COEFS;
                    break block17;
                }
                if (Inlines.silk_MUL((int)n2, (int)3) == n) {
                    silkResamplerState.FIR_Fracs = 1;
                    silkResamplerState.FIR_Order = 36;
                    silkResamplerState.Coefs = SilkTables.silk_Resampler_1_3_COEFS;
                    break block17;
                } else if (Inlines.silk_MUL((int)n2, (int)4) == n) {
                    silkResamplerState.FIR_Fracs = 1;
                    silkResamplerState.FIR_Order = 36;
                    silkResamplerState.Coefs = SilkTables.silk_Resampler_1_4_COEFS;
                    break block17;
                } else {
                    if (Inlines.silk_MUL((int)n2, (int)6) != n) {
                        Inlines.OpusAssert((boolean)false);
                        return -1;
                    }
                    silkResamplerState.FIR_Fracs = 1;
                    silkResamplerState.FIR_Order = 36;
                    silkResamplerState.Coefs = SilkTables.silk_Resampler_1_6_COEFS;
                }
                break block17;
            }
            silkResamplerState.resampler_function = 0;
        }
        silkResamplerState.invRatio_Q16 = Inlines.silk_LSHIFT32((int)Inlines.silk_DIV32((int)Inlines.silk_LSHIFT32((int)n, (int)(14 + n4)), (int)n2), (int)2);
        while (Inlines.silk_SMULWW((int)silkResamplerState.invRatio_Q16, (int)n2) < Inlines.silk_LSHIFT32((int)n, (int)n4)) {
            ++silkResamplerState.invRatio_Q16;
        }
        return 0;
    }

    static int silk_resampler_private_down_FIR_INTERPOL(short[] sArray, int n, int[] nArray, short[] sArray2, int n2, int n3, int n4, int n5, int n6) {
        switch (n3) {
            case 18: {
                for (int i = 0; i < n5; i += n6) {
                    int n7 = Inlines.silk_RSHIFT((int)i, (int)16);
                    int n8 = Inlines.silk_SMULWB((int)(i & 0xFFFF), (int)n4);
                    int n9 = n2 + 9 * n8;
                    int n10 = Inlines.silk_SMULWB((int)nArray[n7 + 0], (int)sArray2[n9 + 0]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 1], (int)sArray2[n9 + 1]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 2], (int)sArray2[n9 + 2]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 3], (int)sArray2[n9 + 3]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 4], (int)sArray2[n9 + 4]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 5], (int)sArray2[n9 + 5]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 6], (int)sArray2[n9 + 6]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 7], (int)sArray2[n9 + 7]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 8], (int)sArray2[n9 + 8]);
                    n9 = n2 + 9 * (n4 - 1 - n8);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 17], (int)sArray2[n9 + 0]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 16], (int)sArray2[n9 + 1]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 15], (int)sArray2[n9 + 2]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 14], (int)sArray2[n9 + 3]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 13], (int)sArray2[n9 + 4]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 12], (int)sArray2[n9 + 5]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 11], (int)sArray2[n9 + 6]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 10], (int)sArray2[n9 + 7]);
                    n10 = Inlines.silk_SMLAWB((int)n10, (int)nArray[n7 + 9], (int)sArray2[n9 + 8]);
                    sArray[n++] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n10, (int)6));
                }
                break;
            }
            case 24: {
                for (int i = 0; i < n5; i += n6) {
                    int n11 = Inlines.silk_RSHIFT((int)i, (int)16);
                    int n12 = Inlines.silk_SMULWB((int)Inlines.silk_ADD32((int)nArray[n11 + 0], (int)nArray[n11 + 23]), (int)sArray2[n2 + 0]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 1], (int)nArray[n11 + 22]), (int)sArray2[n2 + 1]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 2], (int)nArray[n11 + 21]), (int)sArray2[n2 + 2]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 3], (int)nArray[n11 + 20]), (int)sArray2[n2 + 3]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 4], (int)nArray[n11 + 19]), (int)sArray2[n2 + 4]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 5], (int)nArray[n11 + 18]), (int)sArray2[n2 + 5]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 6], (int)nArray[n11 + 17]), (int)sArray2[n2 + 6]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 7], (int)nArray[n11 + 16]), (int)sArray2[n2 + 7]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 8], (int)nArray[n11 + 15]), (int)sArray2[n2 + 8]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 9], (int)nArray[n11 + 14]), (int)sArray2[n2 + 9]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 10], (int)nArray[n11 + 13]), (int)sArray2[n2 + 10]);
                    n12 = Inlines.silk_SMLAWB((int)n12, (int)Inlines.silk_ADD32((int)nArray[n11 + 11], (int)nArray[n11 + 12]), (int)sArray2[n2 + 11]);
                    sArray[n++] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n12, (int)6));
                }
                break;
            }
            case 36: {
                for (int i = 0; i < n5; i += n6) {
                    int n13 = Inlines.silk_RSHIFT((int)i, (int)16);
                    int n14 = Inlines.silk_SMULWB((int)Inlines.silk_ADD32((int)nArray[n13 + 0], (int)nArray[n13 + 35]), (int)sArray2[n2 + 0]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 1], (int)nArray[n13 + 34]), (int)sArray2[n2 + 1]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 2], (int)nArray[n13 + 33]), (int)sArray2[n2 + 2]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 3], (int)nArray[n13 + 32]), (int)sArray2[n2 + 3]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 4], (int)nArray[n13 + 31]), (int)sArray2[n2 + 4]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 5], (int)nArray[n13 + 30]), (int)sArray2[n2 + 5]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 6], (int)nArray[n13 + 29]), (int)sArray2[n2 + 6]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 7], (int)nArray[n13 + 28]), (int)sArray2[n2 + 7]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 8], (int)nArray[n13 + 27]), (int)sArray2[n2 + 8]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 9], (int)nArray[n13 + 26]), (int)sArray2[n2 + 9]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 10], (int)nArray[n13 + 25]), (int)sArray2[n2 + 10]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 11], (int)nArray[n13 + 24]), (int)sArray2[n2 + 11]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 12], (int)nArray[n13 + 23]), (int)sArray2[n2 + 12]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 13], (int)nArray[n13 + 22]), (int)sArray2[n2 + 13]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 14], (int)nArray[n13 + 21]), (int)sArray2[n2 + 14]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 15], (int)nArray[n13 + 20]), (int)sArray2[n2 + 15]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 16], (int)nArray[n13 + 19]), (int)sArray2[n2 + 16]);
                    n14 = Inlines.silk_SMLAWB((int)n14, (int)Inlines.silk_ADD32((int)nArray[n13 + 17], (int)nArray[n13 + 18]), (int)sArray2[n2 + 17]);
                    sArray[n++] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n14, (int)6));
                }
                break;
            }
            default: {
                Inlines.OpusAssert((boolean)false);
            }
        }
        return n;
    }

    static int silk_resampler_private_IIR_FIR_INTERPOL(short[] sArray, int n, short[] sArray2, int n2, int n3) {
        for (int i = 0; i < n2; i += n3) {
            int n4 = Inlines.silk_SMULWB((int)(i & 0xFFFF), (int)12);
            int n5 = i >> 16;
            int n6 = Inlines.silk_SMULBB((int)sArray2[n5], (int)SilkTables.silk_resampler_frac_FIR_12[n4][0]);
            n6 = Inlines.silk_SMLABB((int)n6, (int)sArray2[n5 + 1], (int)SilkTables.silk_resampler_frac_FIR_12[n4][1]);
            n6 = Inlines.silk_SMLABB((int)n6, (int)sArray2[n5 + 2], (int)SilkTables.silk_resampler_frac_FIR_12[n4][2]);
            n6 = Inlines.silk_SMLABB((int)n6, (int)sArray2[n5 + 3], (int)SilkTables.silk_resampler_frac_FIR_12[n4][3]);
            n6 = Inlines.silk_SMLABB((int)n6, (int)sArray2[n5 + 4], (int)SilkTables.silk_resampler_frac_FIR_12[11 - n4][3]);
            n6 = Inlines.silk_SMLABB((int)n6, (int)sArray2[n5 + 5], (int)SilkTables.silk_resampler_frac_FIR_12[11 - n4][2]);
            n6 = Inlines.silk_SMLABB((int)n6, (int)sArray2[n5 + 6], (int)SilkTables.silk_resampler_frac_FIR_12[11 - n4][1]);
            n6 = Inlines.silk_SMLABB((int)n6, (int)sArray2[n5 + 7], (int)SilkTables.silk_resampler_frac_FIR_12[11 - n4][0]);
            sArray[n++] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n6, (int)15));
        }
        return n;
    }

    static int silk_resampler(SilkResamplerState silkResamplerState, short[] sArray, int n, short[] sArray2, int n2, int n3) {
        Inlines.OpusAssert((n3 >= silkResamplerState.Fs_in_kHz ? 1 : 0) != 0);
        Inlines.OpusAssert((silkResamplerState.inputDelay <= silkResamplerState.Fs_in_kHz ? 1 : 0) != 0);
        int n4 = silkResamplerState.Fs_in_kHz - silkResamplerState.inputDelay;
        short[] sArray3 = silkResamplerState.delayBuf;
        System.arraycopy(sArray2, n2, sArray3, silkResamplerState.inputDelay, n4);
        switch (silkResamplerState.resampler_function) {
            case 1: {
                Resampler.silk_resampler_private_up2_HQ(silkResamplerState.sIIR, sArray, n, sArray3, 0, silkResamplerState.Fs_in_kHz);
                Resampler.silk_resampler_private_up2_HQ(silkResamplerState.sIIR, sArray, n + silkResamplerState.Fs_out_kHz, sArray2, n2 + n4, n3 - silkResamplerState.Fs_in_kHz);
                break;
            }
            case 2: {
                Resampler.silk_resampler_private_IIR_FIR(silkResamplerState, sArray, n, sArray3, 0, silkResamplerState.Fs_in_kHz);
                Resampler.silk_resampler_private_IIR_FIR(silkResamplerState, sArray, n + silkResamplerState.Fs_out_kHz, sArray2, n2 + n4, n3 - silkResamplerState.Fs_in_kHz);
                break;
            }
            case 3: {
                Resampler.silk_resampler_private_down_FIR(silkResamplerState, sArray, n, sArray3, 0, silkResamplerState.Fs_in_kHz);
                Resampler.silk_resampler_private_down_FIR(silkResamplerState, sArray, n + silkResamplerState.Fs_out_kHz, sArray2, n2 + n4, n3 - silkResamplerState.Fs_in_kHz);
                break;
            }
            default: {
                System.arraycopy(sArray3, 0, sArray, n, silkResamplerState.Fs_in_kHz);
                System.arraycopy(sArray2, n2 + n4, sArray, n + silkResamplerState.Fs_out_kHz, n3 - silkResamplerState.Fs_in_kHz);
            }
        }
        System.arraycopy(sArray2, n2 + n3 - silkResamplerState.inputDelay, sArray3, 0, silkResamplerState.inputDelay);
        return SilkError.SILK_NO_ERROR;
    }

    static void silk_resampler_private_down_FIR(SilkResamplerState silkResamplerState, short[] sArray, int n, short[] sArray2, int n2, int n3) {
        int n4;
        int[] nArray = new int[silkResamplerState.batchSize + silkResamplerState.FIR_Order];
        System.arraycopy(silkResamplerState.sFIR_i32, 0, nArray, 0, silkResamplerState.FIR_Order);
        int n5 = silkResamplerState.invRatio_Q16;
        while (true) {
            n4 = Inlines.silk_min((int)n3, (int)silkResamplerState.batchSize);
            Resampler.silk_resampler_private_AR2(silkResamplerState.sIIR, 0, nArray, silkResamplerState.FIR_Order, sArray2, n2, silkResamplerState.Coefs, n4);
            int n6 = Inlines.silk_LSHIFT32((int)n4, (int)16);
            n = Resampler.silk_resampler_private_down_FIR_INTERPOL(sArray, n, nArray, silkResamplerState.Coefs, 2, silkResamplerState.FIR_Order, silkResamplerState.FIR_Fracs, n6, n5);
            n2 += n4;
            if ((n3 -= n4) <= 1) break;
            System.arraycopy(nArray, n4, nArray, 0, silkResamplerState.FIR_Order);
        }
        System.arraycopy(nArray, n4, silkResamplerState.sFIR_i32, 0, silkResamplerState.FIR_Order);
    }

    static void silk_resampler_private_up2_HQ(int[] nArray, short[] sArray, int n, short[] sArray2, int n2, int n3) {
        Inlines.OpusAssert((SilkTables.silk_resampler_up2_hq_0[0] > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((SilkTables.silk_resampler_up2_hq_0[1] > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((SilkTables.silk_resampler_up2_hq_0[2] < 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((SilkTables.silk_resampler_up2_hq_1[0] > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((SilkTables.silk_resampler_up2_hq_1[1] > 0 ? 1 : 0) != 0);
        Inlines.OpusAssert((SilkTables.silk_resampler_up2_hq_1[2] < 0 ? 1 : 0) != 0);
        for (int i = 0; i < n3; ++i) {
            int n4 = Inlines.silk_LSHIFT((int)sArray2[n2 + i], (int)10);
            int n5 = Inlines.silk_SUB32((int)n4, (int)nArray[0]);
            int n6 = Inlines.silk_SMULWB((int)n5, (int)SilkTables.silk_resampler_up2_hq_0[0]);
            int n7 = Inlines.silk_ADD32((int)nArray[0], (int)n6);
            nArray[0] = Inlines.silk_ADD32((int)n4, (int)n6);
            n5 = Inlines.silk_SUB32((int)n7, (int)nArray[1]);
            n6 = Inlines.silk_SMULWB((int)n5, (int)SilkTables.silk_resampler_up2_hq_0[1]);
            int n8 = Inlines.silk_ADD32((int)nArray[1], (int)n6);
            nArray[1] = Inlines.silk_ADD32((int)n7, (int)n6);
            n5 = Inlines.silk_SUB32((int)n8, (int)nArray[2]);
            n6 = Inlines.silk_SMLAWB((int)n5, (int)n5, (int)SilkTables.silk_resampler_up2_hq_0[2]);
            n7 = Inlines.silk_ADD32((int)nArray[2], (int)n6);
            nArray[2] = Inlines.silk_ADD32((int)n8, (int)n6);
            sArray[n + 2 * i] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n7, (int)10));
            n5 = Inlines.silk_SUB32((int)n4, (int)nArray[3]);
            n6 = Inlines.silk_SMULWB((int)n5, (int)SilkTables.silk_resampler_up2_hq_1[0]);
            n7 = Inlines.silk_ADD32((int)nArray[3], (int)n6);
            nArray[3] = Inlines.silk_ADD32((int)n4, (int)n6);
            n5 = Inlines.silk_SUB32((int)n7, (int)nArray[4]);
            n6 = Inlines.silk_SMULWB((int)n5, (int)SilkTables.silk_resampler_up2_hq_1[1]);
            n8 = Inlines.silk_ADD32((int)nArray[4], (int)n6);
            nArray[4] = Inlines.silk_ADD32((int)n7, (int)n6);
            n5 = Inlines.silk_SUB32((int)n8, (int)nArray[5]);
            n6 = Inlines.silk_SMLAWB((int)n5, (int)n5, (int)SilkTables.silk_resampler_up2_hq_1[2]);
            n7 = Inlines.silk_ADD32((int)nArray[5], (int)n6);
            nArray[5] = Inlines.silk_ADD32((int)n8, (int)n6);
            sArray[n + 2 * i + 1] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)n7, (int)10));
        }
    }

    static void silk_resampler_private_IIR_FIR(SilkResamplerState silkResamplerState, short[] sArray, int n, short[] sArray2, int n2, int n3) {
        int n4;
        short[] sArray3 = new short[2 * silkResamplerState.batchSize + 8];
        System.arraycopy(silkResamplerState.sFIR_i16, 0, sArray3, 0, 8);
        int n5 = silkResamplerState.invRatio_Q16;
        while (true) {
            n4 = Inlines.silk_min((int)n3, (int)silkResamplerState.batchSize);
            Resampler.silk_resampler_private_up2_HQ(silkResamplerState.sIIR, sArray3, 8, sArray2, n2, n4);
            int n6 = Inlines.silk_LSHIFT32((int)n4, (int)17);
            n = Resampler.silk_resampler_private_IIR_FIR_INTERPOL(sArray, n, sArray3, n6, n5);
            n2 += n4;
            if ((n3 -= n4) <= 0) break;
            System.arraycopy(sArray3, n4 << 1, sArray3, 0, 8);
        }
        System.arraycopy(sArray3, n4 << 1, silkResamplerState.sFIR_i16, 0, 8);
    }

    private static int rateID(int n) {
        return ((n >> 12) - (n > 16000 ? 1 : 0) >> (n > 24000 ? 1 : 0)) - 1;
    }
}

