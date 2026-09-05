/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.Arrays
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.Filters
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.Filters;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SideInfoIndices;
import de.maxhenkel.voicechat.concentus.SilkChannelEncoder;
import de.maxhenkel.voicechat.concentus.SilkConstants;
import de.maxhenkel.voicechat.concentus.SilkNSQState$NSQ_del_dec_struct;
import de.maxhenkel.voicechat.concentus.SilkNSQState$NSQ_sample_struct;
import de.maxhenkel.voicechat.concentus.SilkTables;

class SilkNSQState {
    final short[] xq = new short[640];
    final int[] sLTP_shp_Q14 = new int[640];
    final int[] sLPC_Q14 = new int[80 + SilkConstants.NSQ_LPC_BUF_LENGTH];
    final int[] sAR2_Q14 = new int[16];
    int sLF_AR_shp_Q14 = 0;
    int lagPrev = 0;
    int sLTP_buf_idx = 0;
    int sLTP_shp_buf_idx = 0;
    int rand_seed = 0;
    int prev_gain_Q16 = 0;
    int rewhite_flag = 0;

    SilkNSQState() {
    }

    private void silk_noise_shape_quantizer(int n, int[] nArray, byte[] byArray, int n2, short[] sArray, int n3, int[] nArray2, short[] sArray2, short[] sArray3, int n4, short[] sArray4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15) {
        int n16 = this.sLTP_shp_buf_idx - n6 + 1;
        int n17 = this.sLTP_buf_idx - n6 + 2;
        int n18 = Inlines.silk_RSHIFT((int)n10, (int)6);
        int n19 = SilkConstants.NSQ_LPC_BUF_LENGTH - 1;
        for (int i = 0; i < n13; ++i) {
            int n20;
            int n21;
            int n22;
            int n23;
            int n24;
            int n25;
            int n26;
            this.rand_seed = Inlines.silk_RAND((int)this.rand_seed);
            Inlines.OpusAssert((n15 == 10 || n15 == 16 ? 1 : 0) != 0);
            int n27 = Inlines.silk_RSHIFT((int)n15, (int)1);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 0], (int)sArray2[0]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 1], (int)sArray2[1]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 2], (int)sArray2[2]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 3], (int)sArray2[3]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 4], (int)sArray2[4]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 5], (int)sArray2[5]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 6], (int)sArray2[6]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 7], (int)sArray2[7]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 8], (int)sArray2[8]);
            n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 9], (int)sArray2[9]);
            if (n15 == 16) {
                n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 10], (int)sArray2[10]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 11], (int)sArray2[11]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 12], (int)sArray2[12]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 13], (int)sArray2[13]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 14], (int)sArray2[14]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)this.sLPC_Q14[n19 - 15], (int)sArray2[15]);
            }
            if (n == 2) {
                n26 = 2;
                n26 = Inlines.silk_SMLAWB((int)n26, (int)nArray2[n17], (int)sArray3[n4]);
                n26 = Inlines.silk_SMLAWB((int)n26, (int)nArray2[n17 - 1], (int)sArray3[n4 + 1]);
                n26 = Inlines.silk_SMLAWB((int)n26, (int)nArray2[n17 - 2], (int)sArray3[n4 + 2]);
                n26 = Inlines.silk_SMLAWB((int)n26, (int)nArray2[n17 - 3], (int)sArray3[n4 + 3]);
                n26 = Inlines.silk_SMLAWB((int)n26, (int)nArray2[n17 - 4], (int)sArray3[n4 + 4]);
                ++n17;
            } else {
                n26 = 0;
            }
            Inlines.OpusAssert(((n14 & 1) == 0 ? 1 : 0) != 0);
            int n28 = this.sLPC_Q14[n19];
            int n29 = this.sAR2_Q14[0];
            this.sAR2_Q14[0] = n28;
            int n30 = Inlines.silk_RSHIFT((int)n14, (int)1);
            n30 = Inlines.silk_SMLAWB((int)n30, (int)n28, (int)sArray4[n5]);
            for (int j = 2; j < n14; j += 2) {
                n28 = this.sAR2_Q14[j - 1];
                this.sAR2_Q14[j - 1] = n29;
                n30 = Inlines.silk_SMLAWB((int)n30, (int)n29, (int)sArray4[n5 + j - 1]);
                n29 = this.sAR2_Q14[j + 0];
                this.sAR2_Q14[j + 0] = n28;
                n30 = Inlines.silk_SMLAWB((int)n30, (int)n28, (int)sArray4[n5 + j]);
            }
            this.sAR2_Q14[n14 - 1] = n29;
            n30 = Inlines.silk_SMLAWB((int)n30, (int)n29, (int)sArray4[n5 + n14 - 1]);
            n30 = Inlines.silk_LSHIFT32((int)n30, (int)1);
            n30 = Inlines.silk_SMLAWB((int)n30, (int)this.sLF_AR_shp_Q14, (int)n8);
            int n31 = Inlines.silk_SMULWB((int)this.sLTP_shp_Q14[this.sLTP_shp_buf_idx - 1], (int)n9);
            n31 = Inlines.silk_SMLAWT((int)n31, (int)this.sLF_AR_shp_Q14, (int)n9);
            Inlines.OpusAssert((n6 > 0 || n != 2 ? 1 : 0) != 0);
            n29 = Inlines.silk_SUB32((int)Inlines.silk_LSHIFT32((int)n27, (int)2), (int)n30);
            n29 = Inlines.silk_SUB32((int)n29, (int)n31);
            if (n6 > 0) {
                int n32 = Inlines.silk_SMULWB((int)Inlines.silk_ADD32((int)this.sLTP_shp_Q14[n16], (int)this.sLTP_shp_Q14[n16 - 2]), (int)n7);
                n32 = Inlines.silk_SMLAWT((int)n32, (int)this.sLTP_shp_Q14[n16 - 1], (int)n7);
                n32 = Inlines.silk_LSHIFT((int)n32, (int)1);
                ++n16;
                n28 = Inlines.silk_SUB32((int)n26, (int)n32);
                n29 = Inlines.silk_ADD_LSHIFT32((int)n28, (int)n29, (int)1);
                n29 = Inlines.silk_RSHIFT_ROUND((int)n29, (int)3);
            } else {
                n29 = Inlines.silk_RSHIFT_ROUND((int)n29, (int)2);
            }
            int n33 = Inlines.silk_SUB32((int)nArray[i], (int)n29);
            if (this.rand_seed < 0) {
                n33 = -n33;
            }
            if ((n25 = Inlines.silk_RSHIFT((int)(n24 = Inlines.silk_SUB32((int)(n33 = Inlines.silk_LIMIT_32((int)n33, (int)-31744, (int)30720)), (int)n12)), (int)10)) > 0) {
                n24 = Inlines.silk_SUB32((int)Inlines.silk_LSHIFT((int)n25, (int)10), (int)80);
                n24 = Inlines.silk_ADD32((int)n24, (int)n12);
                n23 = Inlines.silk_ADD32((int)n24, (int)1024);
                n22 = Inlines.silk_SMULBB((int)n24, (int)n11);
                n21 = Inlines.silk_SMULBB((int)n23, (int)n11);
            } else if (n25 == 0) {
                n24 = n12;
                n23 = Inlines.silk_ADD32((int)n24, (int)944);
                n22 = Inlines.silk_SMULBB((int)n24, (int)n11);
                n21 = Inlines.silk_SMULBB((int)n23, (int)n11);
            } else if (n25 == -1) {
                n23 = n12;
                n24 = Inlines.silk_SUB32((int)n23, (int)944);
                n22 = Inlines.silk_SMULBB((int)(-n24), (int)n11);
                n21 = Inlines.silk_SMULBB((int)n23, (int)n11);
            } else {
                n24 = Inlines.silk_ADD32((int)Inlines.silk_LSHIFT((int)n25, (int)10), (int)80);
                n24 = Inlines.silk_ADD32((int)n24, (int)n12);
                n23 = Inlines.silk_ADD32((int)n24, (int)1024);
                n22 = Inlines.silk_SMULBB((int)(-n24), (int)n11);
                n21 = Inlines.silk_SMULBB((int)(-n23), (int)n11);
            }
            int n34 = Inlines.silk_SUB32((int)n33, (int)n24);
            n22 = Inlines.silk_SMLABB((int)n22, (int)n34, (int)n34);
            n34 = Inlines.silk_SUB32((int)n33, (int)n23);
            n21 = Inlines.silk_SMLABB((int)n21, (int)n34, (int)n34);
            if (n21 < n22) {
                n24 = n23;
            }
            byArray[n2 + i] = (byte)Inlines.silk_RSHIFT_ROUND((int)n24, (int)10);
            int n35 = Inlines.silk_LSHIFT((int)n24, (int)4);
            if (this.rand_seed < 0) {
                n35 = -n35;
            }
            int n36 = Inlines.silk_ADD_LSHIFT32((int)n35, (int)n26, (int)1);
            int n37 = Inlines.silk_ADD_LSHIFT32((int)n36, (int)n27, (int)4);
            sArray[n3 + i] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULWW((int)n37, (int)n18), (int)8));
            this.sLPC_Q14[++n19] = n37;
            this.sLF_AR_shp_Q14 = n20 = Inlines.silk_SUB_LSHIFT32((int)n37, (int)n30, (int)2);
            this.sLTP_shp_Q14[this.sLTP_shp_buf_idx] = Inlines.silk_SUB_LSHIFT32((int)n20, (int)n31, (int)2);
            nArray2[this.sLTP_buf_idx] = Inlines.silk_LSHIFT((int)n36, (int)1);
            ++this.sLTP_shp_buf_idx;
            ++this.sLTP_buf_idx;
            this.rand_seed = Inlines.silk_ADD32_ovflw((int)this.rand_seed, (int)byArray[n2 + i]);
        }
        System.arraycopy(this.sLPC_Q14, n13, this.sLPC_Q14, 0, SilkConstants.NSQ_LPC_BUF_LENGTH);
    }

    private void silk_nsq_scale_states(SilkChannelEncoder silkChannelEncoder, int[] nArray, int n, int[] nArray2, short[] sArray, int[] nArray3, int n2, int n3, int[] nArray4, int[] nArray5, int n4) {
        int n5;
        int n6 = nArray5[n2];
        int n7 = Inlines.silk_INVERSE32_varQ((int)Inlines.silk_max((int)nArray4[n2], (int)1), (int)47);
        Inlines.OpusAssert((n7 != 0 ? 1 : 0) != 0);
        int n8 = nArray4[n2] != this.prev_gain_Q16 ? Inlines.silk_DIV32_varQ((int)this.prev_gain_Q16, (int)nArray4[n2], (int)16) : 65536;
        int n9 = Inlines.silk_RSHIFT_ROUND((int)n7, (int)8);
        for (n5 = 0; n5 < silkChannelEncoder.subfr_length; ++n5) {
            nArray2[n5] = Inlines.silk_SMULWW((int)nArray[n + n5], (int)n9);
        }
        this.prev_gain_Q16 = nArray4[n2];
        if (this.rewhite_flag != 0) {
            if (n2 == 0) {
                n7 = Inlines.silk_LSHIFT((int)Inlines.silk_SMULWB((int)n7, (int)n3), (int)2);
            }
            for (n5 = this.sLTP_buf_idx - n6 - 2; n5 < this.sLTP_buf_idx; ++n5) {
                Inlines.OpusAssert((n5 < 320 ? 1 : 0) != 0);
                nArray3[n5] = Inlines.silk_SMULWB((int)n7, (int)sArray[n5]);
            }
        }
        if (n8 != 65536) {
            for (n5 = this.sLTP_shp_buf_idx - silkChannelEncoder.ltp_mem_length; n5 < this.sLTP_shp_buf_idx; ++n5) {
                this.sLTP_shp_Q14[n5] = Inlines.silk_SMULWW((int)n8, (int)this.sLTP_shp_Q14[n5]);
            }
            if (n4 == 2 && this.rewhite_flag == 0) {
                for (n5 = this.sLTP_buf_idx - n6 - 2; n5 < this.sLTP_buf_idx; ++n5) {
                    nArray3[n5] = Inlines.silk_SMULWW((int)n8, (int)nArray3[n5]);
                }
            }
            this.sLF_AR_shp_Q14 = Inlines.silk_SMULWW((int)n8, (int)this.sLF_AR_shp_Q14);
            for (n5 = 0; n5 < SilkConstants.NSQ_LPC_BUF_LENGTH; ++n5) {
                this.sLPC_Q14[n5] = Inlines.silk_SMULWW((int)n8, (int)this.sLPC_Q14[n5]);
            }
            for (n5 = 0; n5 < 16; ++n5) {
                this.sAR2_Q14[n5] = Inlines.silk_SMULWW((int)n8, (int)this.sAR2_Q14[n5]);
            }
        }
    }

    void Reset() {
        Arrays.MemSet((short[])this.xq, (short)0, (int)640);
        Arrays.MemSet((int[])this.sLTP_shp_Q14, (int)0, (int)640);
        Arrays.MemSet((int[])this.sLPC_Q14, (int)0, (int)(80 + SilkConstants.NSQ_LPC_BUF_LENGTH));
        Arrays.MemSet((int[])this.sAR2_Q14, (int)0, (int)16);
        this.sLF_AR_shp_Q14 = 0;
        this.lagPrev = 0;
        this.sLTP_buf_idx = 0;
        this.sLTP_shp_buf_idx = 0;
        this.rand_seed = 0;
        this.prev_gain_Q16 = 0;
        this.rewhite_flag = 0;
    }

    void silk_NSQ_del_dec(SilkChannelEncoder silkChannelEncoder, SideInfoIndices sideInfoIndices, int[] nArray, byte[] byArray, short[][] sArray, short[] sArray2, short[] sArray3, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        SilkNSQState$NSQ_del_dec_struct silkNSQState$NSQ_del_dec_struct;
        int n7;
        int n8 = 0;
        int n9 = 0;
        int n10 = this.lagPrev;
        Inlines.OpusAssert((this.prev_gain_Q16 != 0 ? 1 : 0) != 0);
        SilkNSQState$NSQ_del_dec_struct[] silkNSQState$NSQ_del_dec_structArray = new SilkNSQState$NSQ_del_dec_struct[silkChannelEncoder.nStatesDelayedDecision];
        for (int i = 0; i < silkChannelEncoder.nStatesDelayedDecision; ++i) {
            silkNSQState$NSQ_del_dec_structArray[i] = new SilkNSQState$NSQ_del_dec_struct(this, silkChannelEncoder.shapingLPCOrder);
        }
        for (n7 = 0; n7 < silkChannelEncoder.nStatesDelayedDecision; ++n7) {
            silkNSQState$NSQ_del_dec_struct = silkNSQState$NSQ_del_dec_structArray[n7];
            silkNSQState$NSQ_del_dec_struct.SeedInit = silkNSQState$NSQ_del_dec_struct.Seed = n7 + sideInfoIndices.Seed & 3;
            silkNSQState$NSQ_del_dec_struct.RD_Q10 = 0;
            silkNSQState$NSQ_del_dec_struct.LF_AR_Q14 = this.sLF_AR_shp_Q14;
            silkNSQState$NSQ_del_dec_struct.Shape_Q14[0] = this.sLTP_shp_Q14[silkChannelEncoder.ltp_mem_length - 1];
            System.arraycopy(this.sLPC_Q14, 0, silkNSQState$NSQ_del_dec_struct.sLPC_Q14, 0, SilkConstants.NSQ_LPC_BUF_LENGTH);
            System.arraycopy(this.sAR2_Q14, 0, silkNSQState$NSQ_del_dec_struct.sAR2_Q14, 0, silkChannelEncoder.shapingLPCOrder);
        }
        short s = SilkTables.silk_Quantization_Offsets_Q10[sideInfoIndices.signalType >> 1][sideInfoIndices.quantOffsetType];
        int n11 = 0;
        int n12 = Inlines.silk_min_int((int)32, (int)silkChannelEncoder.subfr_length);
        if (sideInfoIndices.signalType == 2) {
            for (n7 = 0; n7 < silkChannelEncoder.nb_subfr; ++n7) {
                n12 = Inlines.silk_min_int((int)n12, (int)(nArray6[n7] - 2 - 1));
            }
        } else if (n10 > 0) {
            n12 = Inlines.silk_min_int((int)n12, (int)(n10 - 2 - 1));
        }
        int n13 = sideInfoIndices.NLSFInterpCoef_Q2 == 4 ? 0 : 1;
        int[] nArray7 = new int[silkChannelEncoder.ltp_mem_length + silkChannelEncoder.frame_length];
        short[] sArray4 = new short[silkChannelEncoder.ltp_mem_length + silkChannelEncoder.frame_length];
        int[] nArray8 = new int[silkChannelEncoder.subfr_length];
        int[] nArray9 = new int[32];
        int n14 = silkChannelEncoder.ltp_mem_length;
        this.sLTP_shp_buf_idx = silkChannelEncoder.ltp_mem_length;
        this.sLTP_buf_idx = silkChannelEncoder.ltp_mem_length;
        int n15 = 0;
        for (n7 = 0; n7 < silkChannelEncoder.nb_subfr; ++n7) {
            int n16 = n7 >> 1 | 1 - n13;
            Inlines.OpusAssert((nArray2[n7] >= 0 ? 1 : 0) != 0);
            int n17 = Inlines.silk_RSHIFT((int)nArray2[n7], (int)2);
            n17 |= Inlines.silk_LSHIFT((int)Inlines.silk_RSHIFT((int)nArray2[n7], (int)1), (int)16);
            this.rewhite_flag = 0;
            if (sideInfoIndices.signalType == 2) {
                n10 = nArray6[n7];
                if ((n7 & 3 - Inlines.silk_LSHIFT((int)n13, (int)1)) == 0) {
                    int n18;
                    if (n7 == 2) {
                        n6 = silkNSQState$NSQ_del_dec_structArray[0].RD_Q10;
                        n5 = 0;
                        for (n4 = 1; n4 < silkChannelEncoder.nStatesDelayedDecision; ++n4) {
                            if (silkNSQState$NSQ_del_dec_structArray[n4].RD_Q10 >= n6) continue;
                            n6 = silkNSQState$NSQ_del_dec_structArray[n4].RD_Q10;
                            n5 = n4;
                        }
                        for (n4 = 0; n4 < silkChannelEncoder.nStatesDelayedDecision; ++n4) {
                            if (n4 == n5) continue;
                            silkNSQState$NSQ_del_dec_structArray[n4].RD_Q10 += 0x7FFFFFF;
                            Inlines.OpusAssert((silkNSQState$NSQ_del_dec_structArray[n4].RD_Q10 >= 0 ? 1 : 0) != 0);
                        }
                        silkNSQState$NSQ_del_dec_struct = silkNSQState$NSQ_del_dec_structArray[n5];
                        n3 = n11 + n12;
                        for (n4 = 0; n4 < n12; ++n4) {
                            n3 = n3 - 1 & 0x1F;
                            byArray[n8 + n4 - n12] = (byte)Inlines.silk_RSHIFT_ROUND((int)silkNSQState$NSQ_del_dec_struct.Q_Q10[n3], (int)10);
                            this.xq[n14 + n4 - n12] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULWW((int)silkNSQState$NSQ_del_dec_struct.Xq_Q14[n3], (int)nArray5[1]), (int)14));
                            this.sLTP_shp_Q14[this.sLTP_shp_buf_idx - n12 + n4] = silkNSQState$NSQ_del_dec_struct.Shape_Q14[n3];
                        }
                        n15 = 0;
                    }
                    Inlines.OpusAssert(((n18 = silkChannelEncoder.ltp_mem_length - n10 - silkChannelEncoder.predictLPCOrder - 2) > 0 ? 1 : 0) != 0);
                    Filters.silk_LPC_analysis_filter((short[])sArray4, (int)n18, (short[])this.xq, (int)(n18 + n7 * silkChannelEncoder.subfr_length), (short[])sArray[n16], (int)0, (int)(silkChannelEncoder.ltp_mem_length - n18), (int)silkChannelEncoder.predictLPCOrder);
                    this.sLTP_buf_idx = silkChannelEncoder.ltp_mem_length;
                    this.rewhite_flag = 1;
                }
            }
            this.silk_nsq_del_dec_scale_states(silkChannelEncoder, silkNSQState$NSQ_del_dec_structArray, nArray, n9, nArray8, sArray4, nArray7, n7, silkChannelEncoder.nStatesDelayedDecision, n2, nArray5, nArray6, sideInfoIndices.signalType, n12);
            BoxedValueInt boxedValueInt = new BoxedValueInt(n11);
            this.silk_noise_shape_quantizer_del_dec(silkNSQState$NSQ_del_dec_structArray, sideInfoIndices.signalType, nArray8, byArray, n8, this.xq, n14, nArray7, nArray9, sArray[n16], sArray2, n7 * 5, sArray3, n7 * 16, n10, n17, nArray3[n7], nArray4[n7], nArray5[n7], n, s, silkChannelEncoder.subfr_length, n15++, silkChannelEncoder.shapingLPCOrder, silkChannelEncoder.predictLPCOrder, silkChannelEncoder.warping_Q16, silkChannelEncoder.nStatesDelayedDecision, boxedValueInt, n12);
            n11 = boxedValueInt.Val;
            n9 += silkChannelEncoder.subfr_length;
            n8 += silkChannelEncoder.subfr_length;
            n14 += silkChannelEncoder.subfr_length;
        }
        n6 = silkNSQState$NSQ_del_dec_structArray[0].RD_Q10;
        n5 = 0;
        for (n7 = 1; n7 < silkChannelEncoder.nStatesDelayedDecision; ++n7) {
            if (silkNSQState$NSQ_del_dec_structArray[n7].RD_Q10 >= n6) continue;
            n6 = silkNSQState$NSQ_del_dec_structArray[n7].RD_Q10;
            n5 = n7;
        }
        silkNSQState$NSQ_del_dec_struct = silkNSQState$NSQ_del_dec_structArray[n5];
        sideInfoIndices.Seed = (byte)silkNSQState$NSQ_del_dec_struct.SeedInit;
        n3 = n11 + n12;
        int n19 = Inlines.silk_RSHIFT32((int)nArray5[silkChannelEncoder.nb_subfr - 1], (int)6);
        for (n4 = 0; n4 < n12; ++n4) {
            n3 = n3 - 1 & 0x1F;
            byArray[n8 + n4 - n12] = (byte)Inlines.silk_RSHIFT_ROUND((int)silkNSQState$NSQ_del_dec_struct.Q_Q10[n3], (int)10);
            this.xq[n14 + n4 - n12] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULWW((int)silkNSQState$NSQ_del_dec_struct.Xq_Q14[n3], (int)n19), (int)8));
            this.sLTP_shp_Q14[this.sLTP_shp_buf_idx - n12 + n4] = silkNSQState$NSQ_del_dec_struct.Shape_Q14[n3];
        }
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.sLPC_Q14, silkChannelEncoder.subfr_length, this.sLPC_Q14, 0, SilkConstants.NSQ_LPC_BUF_LENGTH);
        System.arraycopy(silkNSQState$NSQ_del_dec_struct.sAR2_Q14, 0, this.sAR2_Q14, 0, silkChannelEncoder.shapingLPCOrder);
        this.sLF_AR_shp_Q14 = silkNSQState$NSQ_del_dec_struct.LF_AR_Q14;
        this.lagPrev = nArray6[silkChannelEncoder.nb_subfr - 1];
        Arrays.MemMove((short[])this.xq, (int)silkChannelEncoder.frame_length, (int)0, (int)silkChannelEncoder.ltp_mem_length);
        Arrays.MemMove((int[])this.sLTP_shp_Q14, (int)silkChannelEncoder.frame_length, (int)0, (int)silkChannelEncoder.ltp_mem_length);
    }

    void Assign(SilkNSQState silkNSQState) {
        this.sLF_AR_shp_Q14 = silkNSQState.sLF_AR_shp_Q14;
        this.lagPrev = silkNSQState.lagPrev;
        this.sLTP_buf_idx = silkNSQState.sLTP_buf_idx;
        this.sLTP_shp_buf_idx = silkNSQState.sLTP_shp_buf_idx;
        this.rand_seed = silkNSQState.rand_seed;
        this.prev_gain_Q16 = silkNSQState.prev_gain_Q16;
        this.rewhite_flag = silkNSQState.rewhite_flag;
        System.arraycopy(silkNSQState.xq, 0, this.xq, 0, 640);
        System.arraycopy(silkNSQState.sLTP_shp_Q14, 0, this.sLTP_shp_Q14, 0, 640);
        System.arraycopy(silkNSQState.sLPC_Q14, 0, this.sLPC_Q14, 0, 80 + SilkConstants.NSQ_LPC_BUF_LENGTH);
        System.arraycopy(silkNSQState.sAR2_Q14, 0, this.sAR2_Q14, 0, 16);
    }

    private void silk_nsq_del_dec_scale_states(SilkChannelEncoder silkChannelEncoder, SilkNSQState$NSQ_del_dec_struct[] silkNSQState$NSQ_del_dec_structArray, int[] nArray, int n, int[] nArray2, short[] sArray, int[] nArray3, int n2, int n3, int n4, int[] nArray4, int[] nArray5, int n5, int n6) {
        int n7;
        int n8 = nArray5[n2];
        int n9 = Inlines.silk_INVERSE32_varQ((int)Inlines.silk_max((int)nArray4[n2], (int)1), (int)47);
        Inlines.OpusAssert((n9 != 0 ? 1 : 0) != 0);
        int n10 = nArray4[n2] != this.prev_gain_Q16 ? Inlines.silk_DIV32_varQ((int)this.prev_gain_Q16, (int)nArray4[n2], (int)16) : 65536;
        int n11 = Inlines.silk_RSHIFT_ROUND((int)n9, (int)8);
        for (n7 = 0; n7 < silkChannelEncoder.subfr_length; ++n7) {
            nArray2[n7] = Inlines.silk_SMULWW((int)nArray[n + n7], (int)n11);
        }
        this.prev_gain_Q16 = nArray4[n2];
        if (this.rewhite_flag != 0) {
            if (n2 == 0) {
                n9 = Inlines.silk_LSHIFT((int)Inlines.silk_SMULWB((int)n9, (int)n4), (int)2);
            }
            for (n7 = this.sLTP_buf_idx - n8 - 2; n7 < this.sLTP_buf_idx; ++n7) {
                Inlines.OpusAssert((n7 < 320 ? 1 : 0) != 0);
                nArray3[n7] = Inlines.silk_SMULWB((int)n9, (int)sArray[n7]);
            }
        }
        if (n10 != 65536) {
            for (n7 = this.sLTP_shp_buf_idx - silkChannelEncoder.ltp_mem_length; n7 < this.sLTP_shp_buf_idx; ++n7) {
                this.sLTP_shp_Q14[n7] = Inlines.silk_SMULWW((int)n10, (int)this.sLTP_shp_Q14[n7]);
            }
            if (n5 == 2 && this.rewhite_flag == 0) {
                for (n7 = this.sLTP_buf_idx - n8 - 2; n7 < this.sLTP_buf_idx - n6; ++n7) {
                    nArray3[n7] = Inlines.silk_SMULWW((int)n10, (int)nArray3[n7]);
                }
            }
            for (int i = 0; i < n3; ++i) {
                SilkNSQState$NSQ_del_dec_struct silkNSQState$NSQ_del_dec_struct = silkNSQState$NSQ_del_dec_structArray[i];
                silkNSQState$NSQ_del_dec_struct.LF_AR_Q14 = Inlines.silk_SMULWW((int)n10, (int)silkNSQState$NSQ_del_dec_struct.LF_AR_Q14);
                for (n7 = 0; n7 < SilkConstants.NSQ_LPC_BUF_LENGTH; ++n7) {
                    silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n7] = Inlines.silk_SMULWW((int)n10, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n7]);
                }
                for (n7 = 0; n7 < silkChannelEncoder.shapingLPCOrder; ++n7) {
                    silkNSQState$NSQ_del_dec_struct.sAR2_Q14[n7] = Inlines.silk_SMULWW((int)n10, (int)silkNSQState$NSQ_del_dec_struct.sAR2_Q14[n7]);
                }
                for (n7 = 0; n7 < 32; ++n7) {
                    silkNSQState$NSQ_del_dec_struct.Pred_Q15[n7] = Inlines.silk_SMULWW((int)n10, (int)silkNSQState$NSQ_del_dec_struct.Pred_Q15[n7]);
                    silkNSQState$NSQ_del_dec_struct.Shape_Q14[n7] = Inlines.silk_SMULWW((int)n10, (int)silkNSQState$NSQ_del_dec_struct.Shape_Q14[n7]);
                }
            }
        }
    }

    private void silk_noise_shape_quantizer_del_dec(SilkNSQState$NSQ_del_dec_struct[] silkNSQState$NSQ_del_dec_structArray, int n, int[] nArray, byte[] byArray, int n2, short[] sArray, int n3, int[] nArray2, int[] nArray3, short[] sArray2, short[] sArray3, int n4, short[] sArray4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, int n13, int n14, int n15, int n16, int n17, int n18, BoxedValueInt boxedValueInt, int n19) {
        SilkNSQState$NSQ_del_dec_struct silkNSQState$NSQ_del_dec_struct;
        int n20;
        int n21;
        Inlines.OpusAssert((n18 > 0 ? 1 : 0) != 0);
        SilkNSQState$NSQ_sample_struct[] silkNSQState$NSQ_sample_structArray = new SilkNSQState$NSQ_sample_struct[2 * n18];
        for (n21 = 0; n21 < 2 * n18; ++n21) {
            silkNSQState$NSQ_sample_structArray[n21] = new SilkNSQState$NSQ_sample_struct(this, null);
        }
        int n22 = this.sLTP_shp_buf_idx - n6 + 1;
        int n23 = this.sLTP_buf_idx - n6 + 2;
        int n24 = Inlines.silk_RSHIFT((int)n10, (int)6);
        for (int i = 0; i < n13; ++i) {
            int n25;
            int n26;
            int n27;
            if (n == 2) {
                n27 = 2;
                n27 = Inlines.silk_SMLAWB((int)n27, (int)nArray2[n23], (int)sArray3[n4 + 0]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)nArray2[n23 - 1], (int)sArray3[n4 + 1]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)nArray2[n23 - 2], (int)sArray3[n4 + 2]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)nArray2[n23 - 3], (int)sArray3[n4 + 3]);
                n27 = Inlines.silk_SMLAWB((int)n27, (int)nArray2[n23 - 4], (int)sArray3[n4 + 4]);
                n27 = Inlines.silk_LSHIFT((int)n27, (int)1);
                ++n23;
            } else {
                n27 = 0;
            }
            if (n6 > 0) {
                n26 = Inlines.silk_SMULWB((int)Inlines.silk_ADD32((int)this.sLTP_shp_Q14[n22], (int)this.sLTP_shp_Q14[n22 - 2]), (int)n7);
                n26 = Inlines.silk_SMLAWT((int)n26, (int)this.sLTP_shp_Q14[n22 - 1], (int)n7);
                n26 = Inlines.silk_SUB_LSHIFT32((int)n27, (int)n26, (int)2);
                ++n22;
            } else {
                n26 = 0;
            }
            for (n20 = 0; n20 < n18; ++n20) {
                int n28;
                int n29;
                int n30;
                int n31;
                int n32;
                silkNSQState$NSQ_del_dec_struct = silkNSQState$NSQ_del_dec_structArray[n20];
                int[] nArray4 = silkNSQState$NSQ_del_dec_struct.sAR2_Q14;
                n25 = 2 * n20;
                int n33 = n25 + 1;
                silkNSQState$NSQ_del_dec_struct.Seed = Inlines.silk_RAND((int)silkNSQState$NSQ_del_dec_struct.Seed);
                int n34 = SilkConstants.NSQ_LPC_BUF_LENGTH - 1 + i;
                Inlines.OpusAssert((n16 == 10 || n16 == 16 ? 1 : 0) != 0);
                int n35 = Inlines.silk_RSHIFT((int)n16, (int)1);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34], (int)sArray2[0]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 1], (int)sArray2[1]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 2], (int)sArray2[2]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 3], (int)sArray2[3]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 4], (int)sArray2[4]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 5], (int)sArray2[5]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 6], (int)sArray2[6]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 7], (int)sArray2[7]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 8], (int)sArray2[8]);
                n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 9], (int)sArray2[9]);
                if (n16 == 16) {
                    n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 10], (int)sArray2[10]);
                    n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 11], (int)sArray2[11]);
                    n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 12], (int)sArray2[12]);
                    n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 13], (int)sArray2[13]);
                    n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 14], (int)sArray2[14]);
                    n35 = Inlines.silk_SMLAWB((int)n35, (int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34 - 15], (int)sArray2[15]);
                }
                n35 = Inlines.silk_LSHIFT((int)n35, (int)4);
                Inlines.OpusAssert(((n15 & 1) == 0 ? 1 : 0) != 0);
                int n36 = Inlines.silk_SMLAWB((int)silkNSQState$NSQ_del_dec_struct.sLPC_Q14[n34], (int)nArray4[0], (int)n17);
                int n37 = Inlines.silk_SMLAWB((int)nArray4[0], (int)(nArray4[1] - n36), (int)n17);
                nArray4[0] = n36;
                int n38 = Inlines.silk_RSHIFT((int)n15, (int)1);
                n38 = Inlines.silk_SMLAWB((int)n38, (int)n36, (int)sArray4[n5]);
                for (int j = 2; j < n15; j += 2) {
                    n36 = Inlines.silk_SMLAWB((int)nArray4[j - 1], (int)(nArray4[j + 0] - n37), (int)n17);
                    nArray4[j - 1] = n37;
                    n38 = Inlines.silk_SMLAWB((int)n38, (int)n37, (int)sArray4[n5 + j - 1]);
                    n37 = Inlines.silk_SMLAWB((int)nArray4[j + 0], (int)(nArray4[j + 1] - n36), (int)n17);
                    nArray4[j + 0] = n36;
                    n38 = Inlines.silk_SMLAWB((int)n38, (int)n36, (int)sArray4[n5 + j]);
                }
                nArray4[n15 - 1] = n37;
                n38 = Inlines.silk_SMLAWB((int)n38, (int)n37, (int)sArray4[n5 + n15 - 1]);
                n38 = Inlines.silk_LSHIFT((int)n38, (int)1);
                n38 = Inlines.silk_SMLAWB((int)n38, (int)silkNSQState$NSQ_del_dec_struct.LF_AR_Q14, (int)n8);
                n38 = Inlines.silk_LSHIFT((int)n38, (int)2);
                int n39 = Inlines.silk_SMULWB((int)silkNSQState$NSQ_del_dec_struct.Shape_Q14[boxedValueInt.Val], (int)n9);
                n39 = Inlines.silk_SMLAWT((int)n39, (int)silkNSQState$NSQ_del_dec_struct.LF_AR_Q14, (int)n9);
                n39 = Inlines.silk_LSHIFT((int)n39, (int)2);
                n37 = Inlines.silk_ADD32((int)n38, (int)n39);
                n36 = Inlines.silk_ADD32((int)n26, (int)n35);
                n37 = Inlines.silk_SUB32((int)n36, (int)n37);
                n37 = Inlines.silk_RSHIFT_ROUND((int)n37, (int)4);
                int n40 = Inlines.silk_SUB32((int)nArray[i], (int)n37);
                if (silkNSQState$NSQ_del_dec_struct.Seed < 0) {
                    n40 = -n40;
                }
                if ((n32 = Inlines.silk_RSHIFT((int)(n31 = Inlines.silk_SUB32((int)(n40 = Inlines.silk_LIMIT_32((int)n40, (int)-31744, (int)30720)), (int)n12)), (int)10)) > 0) {
                    n31 = Inlines.silk_SUB32((int)Inlines.silk_LSHIFT((int)n32, (int)10), (int)80);
                    n31 = Inlines.silk_ADD32((int)n31, (int)n12);
                    n30 = Inlines.silk_ADD32((int)n31, (int)1024);
                    n29 = Inlines.silk_SMULBB((int)n31, (int)n11);
                    n28 = Inlines.silk_SMULBB((int)n30, (int)n11);
                } else if (n32 == 0) {
                    n31 = n12;
                    n30 = Inlines.silk_ADD32((int)n31, (int)944);
                    n29 = Inlines.silk_SMULBB((int)n31, (int)n11);
                    n28 = Inlines.silk_SMULBB((int)n30, (int)n11);
                } else if (n32 == -1) {
                    n30 = n12;
                    n31 = Inlines.silk_SUB32((int)n30, (int)944);
                    n29 = Inlines.silk_SMULBB((int)(-n31), (int)n11);
                    n28 = Inlines.silk_SMULBB((int)n30, (int)n11);
                } else {
                    n31 = Inlines.silk_ADD32((int)Inlines.silk_LSHIFT((int)n32, (int)10), (int)80);
                    n31 = Inlines.silk_ADD32((int)n31, (int)n12);
                    n30 = Inlines.silk_ADD32((int)n31, (int)1024);
                    n29 = Inlines.silk_SMULBB((int)(-n31), (int)n11);
                    n28 = Inlines.silk_SMULBB((int)(-n30), (int)n11);
                }
                int n41 = Inlines.silk_SUB32((int)n40, (int)n31);
                n29 = Inlines.silk_RSHIFT((int)Inlines.silk_SMLABB((int)n29, (int)n41, (int)n41), (int)10);
                n41 = Inlines.silk_SUB32((int)n40, (int)n30);
                n28 = Inlines.silk_RSHIFT((int)Inlines.silk_SMLABB((int)n28, (int)n41, (int)n41), (int)10);
                if (n29 < n28) {
                    silkNSQState$NSQ_sample_structArray[n25].RD_Q10 = Inlines.silk_ADD32((int)silkNSQState$NSQ_del_dec_struct.RD_Q10, (int)n29);
                    silkNSQState$NSQ_sample_structArray[n33].RD_Q10 = Inlines.silk_ADD32((int)silkNSQState$NSQ_del_dec_struct.RD_Q10, (int)n28);
                    silkNSQState$NSQ_sample_structArray[n25].Q_Q10 = n31;
                    silkNSQState$NSQ_sample_structArray[n33].Q_Q10 = n30;
                } else {
                    silkNSQState$NSQ_sample_structArray[n25].RD_Q10 = Inlines.silk_ADD32((int)silkNSQState$NSQ_del_dec_struct.RD_Q10, (int)n28);
                    silkNSQState$NSQ_sample_structArray[n33].RD_Q10 = Inlines.silk_ADD32((int)silkNSQState$NSQ_del_dec_struct.RD_Q10, (int)n29);
                    silkNSQState$NSQ_sample_structArray[n25].Q_Q10 = n30;
                    silkNSQState$NSQ_sample_structArray[n33].Q_Q10 = n31;
                }
                int n42 = Inlines.silk_LSHIFT32((int)silkNSQState$NSQ_sample_structArray[n25].Q_Q10, (int)4);
                if (silkNSQState$NSQ_del_dec_struct.Seed < 0) {
                    n42 = -n42;
                }
                int n43 = Inlines.silk_ADD32((int)n42, (int)n27);
                int n44 = Inlines.silk_ADD32((int)n43, (int)n35);
                int n45 = Inlines.silk_SUB32((int)n44, (int)n38);
                silkNSQState$NSQ_sample_structArray[n25].sLTP_shp_Q14 = Inlines.silk_SUB32((int)n45, (int)n39);
                silkNSQState$NSQ_sample_structArray[n25].LF_AR_Q14 = n45;
                silkNSQState$NSQ_sample_structArray[n25].LPC_exc_Q14 = n43;
                silkNSQState$NSQ_sample_structArray[n25].xq_Q14 = n44;
                n42 = Inlines.silk_LSHIFT32((int)silkNSQState$NSQ_sample_structArray[n33].Q_Q10, (int)4);
                if (silkNSQState$NSQ_del_dec_struct.Seed < 0) {
                    n42 = -n42;
                }
                n43 = Inlines.silk_ADD32((int)n42, (int)n27);
                n44 = Inlines.silk_ADD32((int)n43, (int)n35);
                n45 = Inlines.silk_SUB32((int)n44, (int)n38);
                silkNSQState$NSQ_sample_structArray[n33].sLTP_shp_Q14 = Inlines.silk_SUB32((int)n45, (int)n39);
                silkNSQState$NSQ_sample_structArray[n33].LF_AR_Q14 = n45;
                silkNSQState$NSQ_sample_structArray[n33].LPC_exc_Q14 = n43;
                silkNSQState$NSQ_sample_structArray[n33].xq_Q14 = n44;
            }
            boxedValueInt.Val = boxedValueInt.Val - 1 & 0x1F;
            int n46 = boxedValueInt.Val + n19 & 0x1F;
            int n47 = silkNSQState$NSQ_sample_structArray[0].RD_Q10;
            int n48 = 0;
            for (n20 = 1; n20 < n18; ++n20) {
                if (silkNSQState$NSQ_sample_structArray[n20 * 2].RD_Q10 >= n47) continue;
                n47 = silkNSQState$NSQ_sample_structArray[n20 * 2].RD_Q10;
                n48 = n20;
            }
            int n49 = silkNSQState$NSQ_del_dec_structArray[n48].RandState[n46];
            for (n20 = 0; n20 < n18; ++n20) {
                if (silkNSQState$NSQ_del_dec_structArray[n20].RandState[n46] == n49) continue;
                n21 = n20 * 2;
                silkNSQState$NSQ_sample_structArray[n21].RD_Q10 = Inlines.silk_ADD32((int)silkNSQState$NSQ_sample_structArray[n21].RD_Q10, (int)0x7FFFFFF);
                silkNSQState$NSQ_sample_structArray[n21 + 1].RD_Q10 = Inlines.silk_ADD32((int)silkNSQState$NSQ_sample_structArray[n21 + 1].RD_Q10, (int)0x7FFFFFF);
                Inlines.OpusAssert((silkNSQState$NSQ_sample_structArray[n21].RD_Q10 >= 0 ? 1 : 0) != 0);
            }
            int n50 = silkNSQState$NSQ_sample_structArray[0].RD_Q10;
            n47 = silkNSQState$NSQ_sample_structArray[1].RD_Q10;
            int n51 = 0;
            int n52 = 0;
            for (n20 = 1; n20 < n18; ++n20) {
                n21 = n20 * 2;
                if (silkNSQState$NSQ_sample_structArray[n21].RD_Q10 > n50) {
                    n50 = silkNSQState$NSQ_sample_structArray[n21].RD_Q10;
                    n51 = n20;
                }
                if (silkNSQState$NSQ_sample_structArray[n21 + 1].RD_Q10 >= n47) continue;
                n47 = silkNSQState$NSQ_sample_structArray[n21 + 1].RD_Q10;
                n52 = n20;
            }
            if (n47 < n50) {
                silkNSQState$NSQ_del_dec_structArray[n51].PartialCopyFrom(silkNSQState$NSQ_del_dec_structArray[n52], i);
                silkNSQState$NSQ_sample_structArray[n51 * 2].Assign(silkNSQState$NSQ_sample_structArray[n52 * 2 + 1]);
            }
            silkNSQState$NSQ_del_dec_struct = silkNSQState$NSQ_del_dec_structArray[n48];
            if (n14 > 0 || i >= n19) {
                byArray[n2 + i - n19] = (byte)Inlines.silk_RSHIFT_ROUND((int)silkNSQState$NSQ_del_dec_struct.Q_Q10[n46], (int)10);
                sArray[n3 + i - n19] = (short)Inlines.silk_SAT16((int)Inlines.silk_RSHIFT_ROUND((int)Inlines.silk_SMULWW((int)silkNSQState$NSQ_del_dec_struct.Xq_Q14[n46], (int)nArray3[n46]), (int)8));
                this.sLTP_shp_Q14[this.sLTP_shp_buf_idx - n19] = silkNSQState$NSQ_del_dec_struct.Shape_Q14[n46];
                nArray2[this.sLTP_buf_idx - n19] = silkNSQState$NSQ_del_dec_struct.Pred_Q15[n46];
            }
            ++this.sLTP_shp_buf_idx;
            ++this.sLTP_buf_idx;
            for (n20 = 0; n20 < n18; ++n20) {
                silkNSQState$NSQ_del_dec_struct = silkNSQState$NSQ_del_dec_structArray[n20];
                n25 = n20 * 2;
                silkNSQState$NSQ_del_dec_struct.LF_AR_Q14 = silkNSQState$NSQ_sample_structArray[n25].LF_AR_Q14;
                silkNSQState$NSQ_del_dec_struct.sLPC_Q14[SilkConstants.NSQ_LPC_BUF_LENGTH + i] = silkNSQState$NSQ_sample_structArray[n25].xq_Q14;
                silkNSQState$NSQ_del_dec_struct.Xq_Q14[boxedValueInt.Val] = silkNSQState$NSQ_sample_structArray[n25].xq_Q14;
                silkNSQState$NSQ_del_dec_struct.Q_Q10[boxedValueInt.Val] = silkNSQState$NSQ_sample_structArray[n25].Q_Q10;
                silkNSQState$NSQ_del_dec_struct.Pred_Q15[boxedValueInt.Val] = Inlines.silk_LSHIFT32((int)silkNSQState$NSQ_sample_structArray[n25].LPC_exc_Q14, (int)1);
                silkNSQState$NSQ_del_dec_struct.Shape_Q14[boxedValueInt.Val] = silkNSQState$NSQ_sample_structArray[n25].sLTP_shp_Q14;
                silkNSQState$NSQ_del_dec_struct.RandState[boxedValueInt.Val] = silkNSQState$NSQ_del_dec_struct.Seed = Inlines.silk_ADD32_ovflw((int)silkNSQState$NSQ_del_dec_struct.Seed, (int)Inlines.silk_RSHIFT_ROUND((int)silkNSQState$NSQ_sample_structArray[n25].Q_Q10, (int)10));
                silkNSQState$NSQ_del_dec_struct.RD_Q10 = silkNSQState$NSQ_sample_structArray[n25].RD_Q10;
            }
            nArray3[boxedValueInt.Val] = n24;
        }
        for (n20 = 0; n20 < n18; ++n20) {
            silkNSQState$NSQ_del_dec_struct = silkNSQState$NSQ_del_dec_structArray[n20];
            System.arraycopy(silkNSQState$NSQ_del_dec_struct.sLPC_Q14, n13, silkNSQState$NSQ_del_dec_struct.sLPC_Q14, 0, SilkConstants.NSQ_LPC_BUF_LENGTH);
        }
    }

    void silk_NSQ(SilkChannelEncoder silkChannelEncoder, SideInfoIndices sideInfoIndices, int[] nArray, byte[] byArray, short[][] sArray, short[] sArray2, short[] sArray3, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int[] nArray6, int n, int n2) {
        int n3 = 0;
        int n4 = 0;
        this.rand_seed = sideInfoIndices.Seed;
        int n5 = this.lagPrev;
        Inlines.OpusAssert((this.prev_gain_Q16 != 0 ? 1 : 0) != 0);
        short s = SilkTables.silk_Quantization_Offsets_Q10[sideInfoIndices.signalType >> 1][sideInfoIndices.quantOffsetType];
        int n6 = sideInfoIndices.NLSFInterpCoef_Q2 == 4 ? 0 : 1;
        int[] nArray7 = new int[silkChannelEncoder.ltp_mem_length + silkChannelEncoder.frame_length];
        short[] sArray4 = new short[silkChannelEncoder.ltp_mem_length + silkChannelEncoder.frame_length];
        int[] nArray8 = new int[silkChannelEncoder.subfr_length];
        this.sLTP_shp_buf_idx = silkChannelEncoder.ltp_mem_length;
        this.sLTP_buf_idx = silkChannelEncoder.ltp_mem_length;
        int n7 = silkChannelEncoder.ltp_mem_length;
        for (int i = 0; i < silkChannelEncoder.nb_subfr; ++i) {
            int n8 = i >> 1 | 1 - n6;
            int n9 = i * 5;
            int n10 = i * 16;
            Inlines.OpusAssert((nArray2[i] >= 0 ? 1 : 0) != 0);
            int n11 = Inlines.silk_RSHIFT((int)nArray2[i], (int)2);
            n11 |= Inlines.silk_LSHIFT((int)Inlines.silk_RSHIFT((int)nArray2[i], (int)1), (int)16);
            this.rewhite_flag = 0;
            if (sideInfoIndices.signalType == 2) {
                n5 = nArray6[i];
                if ((i & 3 - Inlines.silk_LSHIFT((int)n6, (int)1)) == 0) {
                    int n12 = silkChannelEncoder.ltp_mem_length - n5 - silkChannelEncoder.predictLPCOrder - 2;
                    Inlines.OpusAssert((n12 > 0 ? 1 : 0) != 0);
                    Filters.silk_LPC_analysis_filter((short[])sArray4, (int)n12, (short[])this.xq, (int)(n12 + i * silkChannelEncoder.subfr_length), (short[])sArray[n8], (int)0, (int)(silkChannelEncoder.ltp_mem_length - n12), (int)silkChannelEncoder.predictLPCOrder);
                    this.rewhite_flag = 1;
                    this.sLTP_buf_idx = silkChannelEncoder.ltp_mem_length;
                }
            }
            this.silk_nsq_scale_states(silkChannelEncoder, nArray, n4, nArray8, sArray4, nArray7, i, n2, nArray5, nArray6, sideInfoIndices.signalType);
            this.silk_noise_shape_quantizer(sideInfoIndices.signalType, nArray8, byArray, n3, this.xq, n7, nArray7, sArray[n8], sArray2, n9, sArray3, n10, n5, n11, nArray3[i], nArray4[i], nArray5[i], n, s, silkChannelEncoder.subfr_length, silkChannelEncoder.shapingLPCOrder, silkChannelEncoder.predictLPCOrder);
            n4 += silkChannelEncoder.subfr_length;
            n3 += silkChannelEncoder.subfr_length;
            n7 += silkChannelEncoder.subfr_length;
        }
        this.lagPrev = nArray6[silkChannelEncoder.nb_subfr - 1];
        Arrays.MemMove((short[])this.xq, (int)silkChannelEncoder.frame_length, (int)0, (int)silkChannelEncoder.ltp_mem_length);
        Arrays.MemMove((int[])this.sLTP_shp_Q14, (int)silkChannelEncoder.frame_length, (int)0, (int)silkChannelEncoder.ltp_mem_length);
    }
}

