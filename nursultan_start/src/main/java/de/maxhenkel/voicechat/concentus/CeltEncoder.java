/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.OpusError
 *  de.maxhenkel.voicechat.concentus.OpusFramesize
 *  de.maxhenkel.voicechat.concentus.Pitch
 *  de.maxhenkel.voicechat.concentus.QuantizeBands
 *  de.maxhenkel.voicechat.concentus.Rate
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.AnalysisInfo;
import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Bands;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltCommon;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.CeltTables;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.OpusError;
import de.maxhenkel.voicechat.concentus.OpusFramesize;
import de.maxhenkel.voicechat.concentus.Pitch;
import de.maxhenkel.voicechat.concentus.QuantizeBands;
import de.maxhenkel.voicechat.concentus.Rate;

class CeltEncoder {
    CeltMode mode = null;
    int channels = 0;
    int stream_channels = 0;
    int force_intra = 0;
    int clip = 0;
    int disable_pf = 0;
    int complexity = 0;
    int upsample = 0;
    int start = 0;
    int end = 0;
    int bitrate = 0;
    int vbr = 0;
    int signalling = 0;
    int constrained_vbr = 0;
    int loss_rate = 0;
    int lsb_depth = 0;
    OpusFramesize variable_duration = OpusFramesize.OPUS_FRAMESIZE_UNKNOWN;
    int lfe = 0;
    int rng = 0;
    int spread_decision = 0;
    int delayedIntra = 0;
    int tonal_average = 0;
    int lastCodedBands = 0;
    int hf_average = 0;
    int tapset_decision = 0;
    int prefilter_period = 0;
    int prefilter_gain = 0;
    int prefilter_tapset = 0;
    int consec_transient = 0;
    AnalysisInfo analysis = new AnalysisInfo();
    final int[] preemph_memE = new int[2];
    final int[] preemph_memD = new int[2];
    int vbr_reservoir = 0;
    int vbr_drift = 0;
    int vbr_offset = 0;
    int vbr_count = 0;
    int overlap_max = 0;
    int stereo_saving = 0;
    int intensity = 0;
    int[] energy_mask = null;
    int spec_avg = 0;
    int[][] in_mem = null;
    int[][] prefilter_mem = null;
    int[][] oldBandE = null;
    int[][] oldLogE = null;
    int[][] oldLogE2 = null;

    CeltEncoder() {
    }

    private void Reset() {
        this.mode = null;
        this.channels = 0;
        this.stream_channels = 0;
        this.force_intra = 0;
        this.clip = 0;
        this.disable_pf = 0;
        this.complexity = 0;
        this.upsample = 0;
        this.start = 0;
        this.end = 0;
        this.bitrate = 0;
        this.vbr = 0;
        this.signalling = 0;
        this.constrained_vbr = 0;
        this.loss_rate = 0;
        this.lsb_depth = 0;
        this.variable_duration = OpusFramesize.OPUS_FRAMESIZE_UNKNOWN;
        this.lfe = 0;
        this.PartialReset();
    }

    int celt_encode_with_ec(short[] sArray, int n, int n2, byte[] byArray, int n3, int n4, EntropyCoder entropyCoder) {
        int n5;
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        BoxedValueInt boxedValueInt;
        BoxedValueInt boxedValueInt2;
        BoxedValueInt boxedValueInt3;
        int n13;
        int[][] nArray;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        int n22;
        int n23;
        int n24;
        int n25;
        int n26;
        short[] sArray2;
        int n27;
        int n28;
        CeltMode celtMode;
        int n29;
        int n30;
        int n31;
        int n32;
        boolean bl;
        int n33;
        int n34;
        int n35;
        int n36;
        int n37;
        int n38;
        int n39;
        int n40;
        int n41;
        int n42;
        int n43;
        int n44;
        block102: {
            block101: {
                int n45;
                int n46;
                n44 = 0;
                n43 = 0;
                n42 = this.channels;
                n41 = this.stream_channels;
                n40 = 15;
                n39 = 0;
                n38 = 0;
                n37 = 0;
                n36 = 0;
                n35 = 0;
                n34 = 0;
                n33 = 0;
                bl = false;
                n32 = 0;
                n31 = 0;
                n30 = 0;
                n29 = 510000;
                celtMode = this.mode;
                n28 = celtMode.nbEBands;
                n27 = celtMode.overlap;
                sArray2 = celtMode.eBands;
                n26 = this.start;
                n25 = this.end;
                n24 = 0;
                if (n4 < 2 || sArray == null) {
                    return OpusError.OPUS_BAD_ARG;
                }
                n2 *= this.upsample;
                for (n23 = 0; n23 <= celtMode.maxLM && celtMode.shortMdctSize << n23 != n2; ++n23) {
                }
                if (n23 > celtMode.maxLM) {
                    return OpusError.OPUS_BAD_ARG;
                }
                n22 = 1 << n23;
                n21 = n22 * celtMode.shortMdctSize;
                if (entropyCoder == null) {
                    n20 = 1;
                    n19 = 0;
                } else {
                    n20 = entropyCoder.tell();
                    n19 = n20 + 4 >> 3;
                }
                Inlines.OpusAssert(this.signalling == 0);
                n4 = Inlines.IMIN(n4, 1275);
                n18 = n4 - n19;
                if (this.vbr != 0 && this.bitrate != -1) {
                    n46 = celtMode.Fs >> 3;
                    n17 = (this.bitrate * n2 + (n46 >> 1)) / n46;
                    n16 = n17 >> 6;
                } else {
                    n17 = 0;
                    n46 = this.bitrate * n2;
                    if (n20 > 1) {
                        n46 += n20;
                    }
                    if (this.bitrate != -1) {
                        n4 = Inlines.IMAX(2, Inlines.IMIN(n4, (n46 + 4 * celtMode.Fs) / (8 * celtMode.Fs) - (this.signalling != 0 ? 1 : 0)));
                    }
                    n16 = n4;
                }
                if (this.bitrate != -1) {
                    n29 = this.bitrate - (40 * n41 + 20) * ((400 >> n23) - 50);
                }
                if (entropyCoder == null) {
                    entropyCoder = new EntropyCoder();
                    entropyCoder.enc_init(byArray, n3, n4);
                }
                if (n17 > 0 && this.constrained_vbr != 0 && (n45 = Inlines.IMIN(Inlines.IMAX(n20 == 1 ? 2 : 0, n17 + (n46 = n17) - this.vbr_reservoir >> 6), n18)) < n18) {
                    n4 = n19 + n45;
                    n18 = n45;
                    entropyCoder.enc_shrink(n4);
                }
                n15 = n4 * 8;
                n14 = n25;
                if (n14 > celtMode.effEBands) {
                    n14 = celtMode.effEBands;
                }
                nArray = Arrays.InitTwoDimensionalArrayInt(n42, n21 + n27);
                int n47 = Inlines.MAX32(this.overlap_max, Inlines.celt_maxabs32(sArray, n, n41 * (n21 - n27) / this.upsample));
                this.overlap_max = Inlines.celt_maxabs32(sArray, n + n41 * (n21 - n27) / this.upsample, n41 * n27 / this.upsample);
                int n48 = n35 = (n47 = Inlines.MAX32(n47, this.overlap_max)) == 0 ? 1 : 0;
                if (n20 == 1) {
                    entropyCoder.enc_bit_logp(n35, 15);
                } else {
                    n35 = 0;
                }
                if (n35 != 0) {
                    if (n17 > 0) {
                        n16 = n4 = Inlines.IMIN(n4, n19 + 2);
                        n15 = n4 * 8;
                        n18 = 2;
                        entropyCoder.enc_shrink(n4);
                    }
                    n20 = n4 * 8;
                    entropyCoder.nbits_total += n20 - entropyCoder.tell();
                }
                n13 = 0;
                BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
                do {
                    n45 = 0;
                    boxedValueInt4.Val = this.preemph_memE[n13];
                    CeltCommon.celt_preemphasis(sArray, n + n13, nArray[n13], n27, n21, n42, this.upsample, celtMode.preemph, boxedValueInt4, n45);
                    this.preemph_memE[n13] = boxedValueInt4.Val;
                } while (++n13 < n42);
                n45 = (this.lfe != 0 && n18 > 3 || n18 > 12 * n41) && n26 == 0 && n35 == 0 && this.disable_pf == 0 && this.complexity >= 5 && (this.consec_transient == 0 || n23 == 3 || this.variable_duration != OpusFramesize.OPUS_FRAMESIZE_VARIABLE) ? 1 : 0;
                n37 = this.tapset_decision;
                boxedValueInt3 = new BoxedValueInt(0);
                boxedValueInt2 = new BoxedValueInt(0);
                boxedValueInt = new BoxedValueInt(0);
                n12 = this.run_prefilter(nArray, this.prefilter_mem, n42, n21, n37, boxedValueInt3, boxedValueInt2, boxedValueInt, n45, n18);
                n40 = boxedValueInt3.Val;
                n39 = boxedValueInt2.Val;
                n11 = boxedValueInt.Val;
                if (n39 > 13107) break block101;
                if (this.prefilter_gain <= 13107) break block102;
            }
            if ((this.analysis.valid == 0 || (double)this.analysis.tonality > 0.3) && ((double)n40 > 1.26 * (double)this.prefilter_period || (double)n40 < 0.79 * (double)this.prefilter_period)) {
                n33 = 1;
            }
        }
        if (n12 == 0) {
            if (n26 == 0 && n20 + 16 <= n15) {
                entropyCoder.enc_bit_logp(0, 1);
            }
        } else {
            entropyCoder.enc_bit_logp(1, 1);
            n10 = Inlines.EC_ILOG(++n40) - 5;
            entropyCoder.enc_uint(n10, 6L);
            entropyCoder.enc_bits(n40 - (16 << n10), 4 + n10);
            --n40;
            entropyCoder.enc_bits(n11, 3);
            entropyCoder.enc_icdf(n37, CeltTables.tapset_icdf, 2);
        }
        n43 = 0;
        n44 = 0;
        if (this.complexity >= 1 && this.lfe == 0) {
            BoxedValueInt boxedValueInt5 = new BoxedValueInt(0);
            BoxedValueInt boxedValueInt6 = new BoxedValueInt(0);
            n43 = CeltCommon.transient_analysis(nArray, n21 + n27, n42, boxedValueInt5, boxedValueInt6);
            n24 = boxedValueInt5.Val;
            n34 = boxedValueInt6.Val;
        }
        if (n23 > 0 && entropyCoder.tell() + 3 <= n15) {
            if (n43 != 0) {
                n44 = n22;
            }
        } else {
            n43 = 0;
            bl = true;
        }
        int[][] nArray2 = Arrays.InitTwoDimensionalArrayInt(n42, n21);
        int[][] nArray3 = Arrays.InitTwoDimensionalArrayInt(n42, n28);
        int[][] nArray4 = Arrays.InitTwoDimensionalArrayInt(n42, n28);
        boolean bl2 = n44 != 0 && this.complexity >= 8;
        int[][] nArray5 = Arrays.InitTwoDimensionalArrayInt(n42, n28);
        if (bl2) {
            CeltCommon.compute_mdcts(celtMode, 0, nArray, nArray2, n41, n42, n23, this.upsample);
            Bands.compute_band_energies(celtMode, nArray2, nArray3, n14, n41, n23);
            QuantizeBands.amp2Log2((CeltMode)celtMode, (int)n14, (int)n25, (int[][])nArray3, (int[][])nArray5, (int)n41);
            n9 = 0;
            while (n9 < n28) {
                int[] nArray6 = nArray5[0];
                int n49 = n9++;
                nArray6[n49] = nArray6[n49] + Inlines.HALF16(Inlines.SHL16(n23, 10));
            }
            if (n41 == 2) {
                n9 = 0;
                while (n9 < n28) {
                    int[] nArray7 = nArray5[1];
                    int n50 = n9++;
                    nArray7[n50] = nArray7[n50] + Inlines.HALF16(Inlines.SHL16(n23, 10));
                }
            }
        }
        CeltCommon.compute_mdcts(celtMode, n44, nArray, nArray2, n41, n42, n23, this.upsample);
        if (n42 == 2 && n41 == 1) {
            n34 = 0;
        }
        Bands.compute_band_energies(celtMode, nArray2, nArray3, n14, n41, n23);
        if (this.lfe != 0) {
            for (n9 = 2; n9 < n25; ++n9) {
                nArray3[0][n9] = Inlines.IMIN(nArray3[0][n9], Inlines.MULT16_32_Q15((short)3, nArray3[0][0]));
                nArray3[0][n9] = Inlines.MAX32(nArray3[0][n9], 1);
            }
        }
        QuantizeBands.amp2Log2((CeltMode)celtMode, (int)n14, (int)n25, (int[][])nArray3, (int[][])nArray4, (int)n41);
        int[] nArray8 = new int[n41 * n28];
        if (n26 == 0 && this.energy_mask != null && this.lfe == 0) {
            int n51 = 0;
            int n52 = 0;
            n10 = 0;
            int n53 = Inlines.IMAX(2, this.lastCodedBands);
            for (n13 = 0; n13 < n41; ++n13) {
                for (n9 = 0; n9 < n53; ++n9) {
                    n8 = Inlines.MAX16(Inlines.MIN16(this.energy_mask[n28 * n13 + n9], 256), -2048);
                    if (n8 > 0) {
                        n8 = Inlines.HALF16(n8);
                    }
                    n51 += Inlines.MULT16_16(n8, sArray2[n9 + 1] - sArray2[n9]);
                    n10 += sArray2[n9 + 1] - sArray2[n9];
                    n52 += Inlines.MULT16_16(n8, 1 + 2 * n9 - n53);
                }
            }
            Inlines.OpusAssert(n10 > 0);
            n51 = Inlines.DIV32_16(n51, n10);
            n51 += 205;
            n52 = n52 * 6 / (n41 * (n53 - 1) * (n53 + 1) * n53);
            n52 = Inlines.HALF32(n52);
            n52 = Inlines.MAX32(Inlines.MIN32(n52, 32), -32);
            n11 = 0;
            while (sArray2[n11 + 1] < sArray2[n53] / 2) {
                ++n11;
            }
            int n54 = 0;
            for (n9 = 0; n9 < n53; ++n9) {
                n8 = n51 + n52 * (n9 - n11);
                n7 = n41 == 2 ? Inlines.MAX16(this.energy_mask[n9], this.energy_mask[n28 + n9]) : this.energy_mask[n9];
                n7 = Inlines.MIN16(n7, 0);
                if ((n7 -= n8) <= 256) continue;
                nArray8[n9] = n7 - 256;
                ++n54;
            }
            if (n54 >= 3) {
                if ((n51 += 256) > 0) {
                    n51 = 0;
                    n52 = 0;
                    Arrays.MemSet(nArray8, 0, n53);
                } else {
                    for (n9 = 0; n9 < n53; ++n9) {
                        nArray8[n9] = Inlines.MAX16(0, nArray8[n9] - 256);
                    }
                }
            }
            n30 = 64 * n52;
            n32 = n51 += 205;
        }
        if (this.lfe == 0) {
            int n55 = -10240;
            n11 = 0;
            int n56 = n44 != 0 ? Inlines.HALF16(Inlines.SHL16(n23, 10)) : 0;
            for (n9 = n26; n9 < n25; ++n9) {
                n55 = Inlines.MAX16(n55 - 1024, nArray4[0][n9] - n56);
                if (n41 == 2) {
                    n55 = Inlines.MAX16(n55, nArray4[1][n9] - n56);
                }
                n11 += n55;
            }
            n31 = Inlines.SUB16(n11 /= n25 - n26, this.spec_avg);
            n31 = Inlines.MIN16(3072, Inlines.MAX16(-1536, n31));
            this.spec_avg += (short)Inlines.MULT16_16_Q15(655, n31);
        }
        if (!bl2) {
            System.arraycopy(nArray4[0], 0, nArray5[0], 0, n28);
            if (n41 == 2) {
                System.arraycopy(nArray4[1], 0, nArray5[1], 0, n28);
            }
        }
        if (n23 > 0 && entropyCoder.tell() + 3 <= n15 && n43 == 0 && this.complexity >= 5 && this.lfe == 0 && CeltCommon.patch_transient_decision(nArray4, this.oldBandE, n28, n26, n25, n41) != 0) {
            n43 = 1;
            n44 = n22;
            CeltCommon.compute_mdcts(celtMode, n44, nArray, nArray2, n41, n42, n23, this.upsample);
            Bands.compute_band_energies(celtMode, nArray2, nArray3, n14, n41, n23);
            QuantizeBands.amp2Log2((CeltMode)celtMode, (int)n14, (int)n25, (int[][])nArray3, (int[][])nArray4, (int)n41);
            n9 = 0;
            while (n9 < n28) {
                int[] nArray9 = nArray5[0];
                int n57 = n9++;
                nArray9[n57] = nArray9[n57] + Inlines.HALF16(Inlines.SHL16(n23, 10));
            }
            if (n41 == 2) {
                n9 = 0;
                while (n9 < n28) {
                    int[] nArray10 = nArray5[1];
                    int n58 = n9++;
                    nArray10[n58] = nArray10[n58] + Inlines.HALF16(Inlines.SHL16(n23, 10));
                }
            }
            n24 = 3277;
        }
        if (n23 > 0 && entropyCoder.tell() + 3 <= n15) {
            entropyCoder.enc_bit_logp(n43, 3);
        }
        int[][] nArray11 = Arrays.InitTwoDimensionalArrayInt(n41, n21);
        Bands.normalise_bands(celtMode, nArray2, nArray11, nArray3, n14, n41, n22);
        int[] nArray12 = new int[n28];
        if (n16 >= 15 * n41 && n26 == 0 && this.complexity >= 2 && this.lfe == 0) {
            int n59 = n16 < 40 ? 12 : (n16 < 60 ? 6 : (n16 < 100 ? 4 : 3));
            BoxedValueInt boxedValueInt7 = new BoxedValueInt(0);
            n6 = CeltCommon.tf_analysis(celtMode, n14, n43, nArray12, n59 *= 2, nArray11, n21, n23, boxedValueInt7, n24, n34);
            n5 = boxedValueInt7.Val;
            for (n9 = n14; n9 < n25; ++n9) {
                nArray12[n9] = nArray12[n14 - 1];
            }
        } else {
            n5 = 0;
            for (n9 = 0; n9 < n25; ++n9) {
                nArray12[n9] = n43;
            }
            n6 = 0;
        }
        int[][] nArray13 = Arrays.InitTwoDimensionalArrayInt(n41, n28);
        BoxedValueInt boxedValueInt8 = new BoxedValueInt(this.delayedIntra);
        QuantizeBands.quant_coarse_energy((CeltMode)celtMode, (int)n26, (int)n25, (int)n14, (int[][])nArray4, (int[][])this.oldBandE, (int)n15, (int[][])nArray13, (EntropyCoder)entropyCoder, (int)n41, (int)n23, (int)n18, (int)this.force_intra, (BoxedValueInt)boxedValueInt8, (int)(this.complexity >= 4 ? 1 : 0), (int)this.loss_rate, (int)this.lfe);
        this.delayedIntra = boxedValueInt8.Val;
        CeltCommon.tf_encode(n26, n25, n43, nArray12, n23, n6, entropyCoder);
        if (entropyCoder.tell() + 4 <= n15) {
            if (this.lfe != 0) {
                this.tapset_decision = 0;
                this.spread_decision = 2;
            } else if (n44 != 0 || this.complexity < 3 || n18 < 10 * n41 || n26 != 0) {
                this.spread_decision = this.complexity == 0 ? 0 : 2;
            } else {
                BoxedValueInt boxedValueInt9 = new BoxedValueInt(this.tonal_average);
                boxedValueInt3 = new BoxedValueInt(this.tapset_decision);
                boxedValueInt2 = new BoxedValueInt(this.hf_average);
                this.spread_decision = Bands.spreading_decision(celtMode, nArray11, boxedValueInt9, this.spread_decision, boxedValueInt2, boxedValueInt3, n12 != 0 && n44 == 0 ? 1 : 0, n14, n41, n22);
                this.tonal_average = boxedValueInt9.Val;
                this.tapset_decision = boxedValueInt3.Val;
                this.hf_average = boxedValueInt2.Val;
            }
            entropyCoder.enc_icdf(this.spread_decision, CeltTables.spread_icdf, 5);
        }
        int[] nArray14 = new int[n28];
        BoxedValueInt boxedValueInt10 = new BoxedValueInt(0);
        int n60 = CeltCommon.dynalloc_analysis(nArray4, nArray5, n28, n26, n25, n41, nArray14, this.lsb_depth, celtMode.logN, n43, this.vbr, this.constrained_vbr, sArray2, n23, n16, boxedValueInt10, this.lfe, nArray8);
        int n61 = boxedValueInt10.Val;
        if (this.lfe != 0) {
            nArray14[0] = Inlines.IMIN(8, n16 / 3);
        }
        int[] nArray15 = new int[n28];
        CeltCommon.init_caps(celtMode, nArray15, n23, n41);
        int n62 = 6;
        n15 <<= 3;
        int n63 = 0;
        n20 = entropyCoder.tell_frac();
        for (n9 = n26; n9 < n25; ++n9) {
            int n64 = n41 * (sArray2[n9 + 1] - sArray2[n9]) << n23;
            int n65 = Inlines.IMIN(n64 << 3, Inlines.IMAX(48, n64));
            int n66 = n62;
            n10 = 0;
            n8 = 0;
            while (n20 + (n66 << 3) < n15 - n63 && n10 < nArray15[n9]) {
                n7 = n8 < nArray14[n9] ? 1 : 0;
                entropyCoder.enc_bit_logp(n7, n66);
                n20 = entropyCoder.tell_frac();
                if (n7 == 0) break;
                n10 += n65;
                n63 += n65;
                n66 = 1;
                ++n8;
            }
            if (n8 != 0) {
                n62 = Inlines.IMAX(2, n62 - 1);
            }
            nArray14[n9] = n10;
        }
        if (n41 == 2) {
            if (n23 != 0) {
                n38 = CeltCommon.stereo_analysis(celtMode, nArray11, n23);
            }
            this.intensity = Bands.hysteresis_decision(n29 / 1000, CeltTables.intensity_thresholds, CeltTables.intensity_histeresis, 21, this.intensity);
            this.intensity = Inlines.IMIN(n25, Inlines.IMAX(n26, this.intensity));
        }
        int n67 = 5;
        if (n20 + 48 <= n15 - n63) {
            if (this.lfe != 0) {
                n67 = 5;
            } else {
                boxedValueInt3 = new BoxedValueInt(this.stereo_saving);
                n67 = CeltCommon.alloc_trim_analysis(celtMode, nArray11, nArray4, n25, n23, n41, this.analysis, boxedValueInt3, n24, this.intensity, n30);
                this.stereo_saving = boxedValueInt3.Val;
            }
            entropyCoder.enc_icdf(n67, CeltTables.trim_icdf, 7);
            n20 = entropyCoder.tell_frac();
        }
        if (n17 > 0) {
            int n68;
            n7 = celtMode.maxLM - n23;
            n4 = Inlines.IMIN(n4, 1275 >> 3 - n23);
            n10 = n17 - (40 * n41 + 20 << 3);
            if (this.constrained_vbr != 0) {
                n10 += this.vbr_offset >> n7;
            }
            int n69 = CeltCommon.compute_vbr(celtMode, this.analysis, n10, n23, n29, this.lastCodedBands, n41, this.intensity, this.constrained_vbr, this.stereo_saving, n61, n24, n33, n60, this.variable_duration, this.lfe, this.energy_mask != null ? 1 : 0, n32, n31);
            n8 = (n20 + n63 + 64 - 1 >> 6) + 2 - n19;
            n18 = (n69 += n20) + 32 >> 6;
            n18 = Inlines.IMAX(n8, n18);
            n18 = Inlines.IMIN(n4, n18 + n19) - n19;
            int n70 = n69 - n17;
            n69 = n18 << 6;
            if (n35 != 0) {
                n18 = 2;
                n69 = 128;
                n70 = 0;
            }
            if (this.vbr_count < 970) {
                ++this.vbr_count;
                n68 = Inlines.celt_rcp(Inlines.SHL32(this.vbr_count + 20, 16));
            } else {
                n68 = 33;
            }
            if (this.constrained_vbr != 0) {
                this.vbr_reservoir += n69 - n17;
            }
            if (this.constrained_vbr != 0) {
                this.vbr_drift += Inlines.MULT16_32_Q15(n68, n70 * (1 << n7) - this.vbr_offset - this.vbr_drift);
                this.vbr_offset = -this.vbr_drift;
            }
            if (this.constrained_vbr != 0 && this.vbr_reservoir < 0) {
                int n71 = -this.vbr_reservoir / 64;
                n18 += n35 != 0 ? 0 : n71;
                this.vbr_reservoir = 0;
            }
            n4 = Inlines.IMIN(n4, n18 + n19);
            entropyCoder.enc_shrink(n4);
        }
        int[] nArray16 = new int[n28];
        int[] nArray17 = new int[n28];
        int[] nArray18 = new int[n28];
        int n72 = (n4 * 8 << 3) - entropyCoder.tell_frac() - 1;
        int n73 = n43 != 0 && n23 >= 2 && n72 >= n23 + 2 << 3 ? 8 : 0;
        n72 -= n73;
        int n74 = n25 - 1;
        if (this.analysis.enabled && this.analysis.valid != 0) {
            int n75 = n29 < 32000 * n41 ? 13 : (n29 < 48000 * n41 ? 16 : (n29 < 60000 * n41 ? 18 : (n29 < 80000 * n41 ? 19 : 20)));
            n74 = Inlines.IMAX(this.analysis.bandwidth, n75);
        }
        if (this.lfe != 0) {
            n74 = 1;
        }
        BoxedValueInt boxedValueInt11 = new BoxedValueInt(this.intensity);
        BoxedValueInt boxedValueInt12 = new BoxedValueInt(0);
        boxedValueInt = new BoxedValueInt(n38);
        int n76 = Rate.compute_allocation((CeltMode)celtMode, (int)n26, (int)n25, (int[])nArray14, (int[])nArray15, (int)n67, (BoxedValueInt)boxedValueInt11, (BoxedValueInt)boxedValueInt, (int)n72, (BoxedValueInt)boxedValueInt12, (int[])nArray17, (int[])nArray16, (int[])nArray18, (int)n41, (int)n23, (EntropyCoder)entropyCoder, (int)1, (int)this.lastCodedBands, (int)n74);
        this.intensity = boxedValueInt11.Val;
        int n77 = boxedValueInt12.Val;
        n38 = boxedValueInt.Val;
        this.lastCodedBands = this.lastCodedBands != 0 ? Inlines.IMIN(this.lastCodedBands + 1, Inlines.IMAX(this.lastCodedBands - 1, n76)) : n76;
        QuantizeBands.quant_fine_energy((CeltMode)celtMode, (int)n26, (int)n25, (int[][])this.oldBandE, (int[][])nArray13, (int[])nArray16, (EntropyCoder)entropyCoder, (int)n41);
        short[] sArray3 = new short[n41 * n28];
        BoxedValueInt boxedValueInt13 = new BoxedValueInt(this.rng);
        Bands.quant_all_bands(1, celtMode, n26, n25, nArray11[0], n41 == 2 ? nArray11[1] : null, sArray3, nArray3, nArray17, n44, this.spread_decision, n38, this.intensity, nArray12, n4 * 64 - n73, n77, entropyCoder, n23, n76, boxedValueInt13);
        this.rng = boxedValueInt13.Val;
        if (n73 > 0) {
            n36 = this.consec_transient < 2 ? 1 : 0;
            entropyCoder.enc_bits(n36, 1);
        }
        QuantizeBands.quant_energy_finalise((CeltMode)celtMode, (int)n26, (int)n25, (int[][])this.oldBandE, (int[][])nArray13, (int[])nArray16, (int[])nArray18, (int)(n4 * 8 - entropyCoder.tell()), (EntropyCoder)entropyCoder, (int)n41);
        if (n35 != 0) {
            for (n9 = 0; n9 < n28; ++n9) {
                this.oldBandE[0][n9] = -28672;
            }
            if (n41 == 2) {
                for (n9 = 0; n9 < n28; ++n9) {
                    this.oldBandE[1][n9] = -28672;
                }
            }
        }
        this.prefilter_period = n40;
        this.prefilter_gain = n39;
        this.prefilter_tapset = n37;
        if (n42 == 2 && n41 == 1) {
            System.arraycopy(this.oldBandE[0], 0, this.oldBandE[1], 0, n28);
        }
        if (n43 == 0) {
            System.arraycopy(this.oldLogE[0], 0, this.oldLogE2[0], 0, n28);
            System.arraycopy(this.oldBandE[0], 0, this.oldLogE[0], 0, n28);
            if (n42 == 2) {
                System.arraycopy(this.oldLogE[1], 0, this.oldLogE2[1], 0, n28);
                System.arraycopy(this.oldBandE[1], 0, this.oldLogE[1], 0, n28);
            }
        } else {
            for (n9 = 0; n9 < n28; ++n9) {
                this.oldLogE[0][n9] = Inlines.MIN16(this.oldLogE[0][n9], this.oldBandE[0][n9]);
            }
            if (n42 == 2) {
                for (n9 = 0; n9 < n28; ++n9) {
                    this.oldLogE[1][n9] = Inlines.MIN16(this.oldLogE[1][n9], this.oldBandE[1][n9]);
                }
            }
        }
        n13 = 0;
        do {
            for (n9 = 0; n9 < n26; ++n9) {
                this.oldBandE[n13][n9] = 0;
                this.oldLogE2[n13][n9] = -28672;
                this.oldLogE[n13][n9] = -28672;
            }
            for (n9 = n25; n9 < n28; ++n9) {
                this.oldBandE[n13][n9] = 0;
                this.oldLogE2[n13][n9] = -28672;
                this.oldLogE[n13][n9] = -28672;
            }
        } while (++n13 < n42);
        this.consec_transient = n43 != 0 || bl ? ++this.consec_transient : 0;
        this.rng = (int)entropyCoder.rng;
        entropyCoder.enc_done();
        if (entropyCoder.get_error() != 0) {
            return OpusError.OPUS_INTERNAL_ERROR;
        }
        return n4;
    }

    void SetPacketLossPercent(int n) {
        if (n < 0 || n > 100) {
            throw new IllegalArgumentException("Packet loss must be between 0 and 100");
        }
        this.loss_rate = n;
    }

    void SetExpertFrameDuration(OpusFramesize opusFramesize) {
        this.variable_duration = opusFramesize;
    }

    void SetLFE(int n) {
        this.lfe = n;
    }

    void SetVBR(boolean bl) {
        this.vbr = bl ? 1 : 0;
    }

    void SetBitrate(int n) {
        if (n <= 500 && n != -1) {
            throw new IllegalArgumentException("Bitrate out of range");
        }
        this.bitrate = n = Inlines.IMIN(n, 260000 * this.channels);
    }

    void ResetState() {
        int n;
        this.PartialReset();
        this.in_mem = Arrays.InitTwoDimensionalArrayInt(this.channels, this.mode.overlap);
        this.prefilter_mem = Arrays.InitTwoDimensionalArrayInt(this.channels, 1024);
        this.oldBandE = Arrays.InitTwoDimensionalArrayInt(this.channels, this.mode.nbEBands);
        this.oldLogE = Arrays.InitTwoDimensionalArrayInt(this.channels, this.mode.nbEBands);
        this.oldLogE2 = Arrays.InitTwoDimensionalArrayInt(this.channels, this.mode.nbEBands);
        for (n = 0; n < this.mode.nbEBands; ++n) {
            this.oldLogE2[0][n] = -28672;
            this.oldLogE[0][n] = -28672;
        }
        if (this.channels == 2) {
            for (n = 0; n < this.mode.nbEBands; ++n) {
                this.oldLogE2[1][n] = -28672;
                this.oldLogE[1][n] = -28672;
            }
        }
        this.vbr_offset = 0;
        this.delayedIntra = 1;
        this.spread_decision = 2;
        this.tonal_average = 256;
        this.hf_average = 0;
        this.tapset_decision = 0;
    }

    void SetEndBand(int n) {
        if (n < 1 || n > this.mode.nbEBands) {
            throw new IllegalArgumentException("End band above max number of ebands (or less than 1)");
        }
        this.end = n;
    }

    CeltMode GetMode() {
        return this.mode;
    }

    int GetFinalRange() {
        return this.rng;
    }

    void SetSignalling(int n) {
        this.signalling = n;
    }

    private void PartialReset() {
        this.rng = 0;
        this.spread_decision = 0;
        this.delayedIntra = 0;
        this.tonal_average = 0;
        this.lastCodedBands = 0;
        this.hf_average = 0;
        this.tapset_decision = 0;
        this.prefilter_period = 0;
        this.prefilter_gain = 0;
        this.prefilter_tapset = 0;
        this.consec_transient = 0;
        this.analysis.Reset();
        this.preemph_memE[0] = 0;
        this.preemph_memE[1] = 0;
        this.preemph_memD[0] = 0;
        this.preemph_memD[1] = 0;
        this.vbr_reservoir = 0;
        this.vbr_drift = 0;
        this.vbr_offset = 0;
        this.vbr_count = 0;
        this.overlap_max = 0;
        this.stereo_saving = 0;
        this.intensity = 0;
        this.energy_mask = null;
        this.spec_avg = 0;
        this.in_mem = null;
        this.prefilter_mem = null;
        this.oldBandE = null;
        this.oldLogE = null;
        this.oldLogE2 = null;
    }

    void SetChannels(int n) {
        if (n < 1 || n > 2) {
            throw new IllegalArgumentException("Channel count must be 1 or 2");
        }
        this.stream_channels = n;
    }

    void SetStartBand(int n) {
        if (n < 0 || n >= this.mode.nbEBands) {
            throw new IllegalArgumentException("Start band above max number of ebands (or negative)");
        }
        this.start = n;
    }

    int opus_custom_encoder_init_arch(CeltMode celtMode, int n) {
        if (n < 0 || n > 2) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (this == null || celtMode == null) {
            return OpusError.OPUS_ALLOC_FAIL;
        }
        this.Reset();
        this.mode = celtMode;
        this.stream_channels = this.channels = n;
        this.upsample = 1;
        this.start = 0;
        this.end = this.mode.effEBands;
        this.signalling = 1;
        this.constrained_vbr = 1;
        this.clip = 1;
        this.bitrate = -1;
        this.vbr = 0;
        this.force_intra = 0;
        this.complexity = 5;
        this.lsb_depth = 24;
        this.ResetState();
        return OpusError.OPUS_OK;
    }

    int GetLSBDepth() {
        return this.lsb_depth;
    }

    int celt_encoder_init(int n, int n2) {
        int n3 = this.opus_custom_encoder_init_arch(CeltMode.mode48000_960_120, n2);
        if (n3 != OpusError.OPUS_OK) {
            return n3;
        }
        this.upsample = CeltCommon.resampling_factor(n);
        return OpusError.OPUS_OK;
    }

    void SetEnergyMask(int[] nArray) {
        this.energy_mask = nArray;
    }

    void SetAnalysis(AnalysisInfo analysisInfo) {
        if (analysisInfo == null) {
            throw new IllegalArgumentException("AnalysisInfo");
        }
        this.analysis.Assign(analysisInfo);
    }

    void SetComplexity(int n) {
        if (n < 0 || n > 10) {
            throw new IllegalArgumentException("Complexity must be between 0 and 10 inclusive");
        }
        this.complexity = n;
    }

    void SetVBRConstraint(boolean bl) {
        this.constrained_vbr = bl ? 1 : 0;
    }

    int run_prefilter(int[][] nArray, int[][] nArray2, int n, int n2, int n3, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2, BoxedValueInt boxedValueInt3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int[][] nArrayArray = new int[n][];
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(0);
        CeltMode celtMode = this.mode;
        int n9 = celtMode.overlap;
        for (int i = 0; i < n; ++i) {
            nArrayArray[i] = new int[n2 + 1024];
        }
        int n10 = 0;
        do {
            System.arraycopy(nArray2[n10], 0, nArrayArray[n10], 0, 1024);
            System.arraycopy(nArray[n10], n9, nArrayArray[n10], 1024, n2);
        } while (++n10 < n);
        if (n4 != 0) {
            int[] nArray3 = new int[1024 + n2 >> 1];
            Pitch.pitch_downsample((int[][])nArrayArray, (int[])nArray3, (int)(1024 + n2), (int)n);
            Pitch.pitch_search((int[])nArray3, (int)512, (int[])nArray3, (int)n2, (int)979, (BoxedValueInt)boxedValueInt4);
            boxedValueInt4.Val = 1024 - boxedValueInt4.Val;
            n8 = Pitch.remove_doubling((int[])nArray3, (int)1024, (int)15, (int)n2, (BoxedValueInt)boxedValueInt4, (int)this.prefilter_period, (int)this.prefilter_gain);
            if (boxedValueInt4.Val > 1022) {
                boxedValueInt4.Val = 1022;
            }
            n8 = Inlines.MULT16_16_Q15(22938, n8);
            if (this.loss_rate > 2) {
                n8 = Inlines.HALF32(n8);
            }
            if (this.loss_rate > 4) {
                n8 = Inlines.HALF32(n8);
            }
            if (this.loss_rate > 8) {
                n8 = 0;
            }
        } else {
            n8 = 0;
            boxedValueInt4.Val = 15;
        }
        int n11 = 6554;
        if (Inlines.abs(boxedValueInt4.Val - this.prefilter_period) * 10 > boxedValueInt4.Val) {
            n11 += 6554;
        }
        if (n5 < 25) {
            n11 += 3277;
        }
        if (n5 < 35) {
            n11 += 3277;
        }
        if (this.prefilter_gain > 13107) {
            n11 -= 3277;
        }
        if (this.prefilter_gain > 18022) {
            n11 -= 3277;
        }
        if (n8 < (n11 = Inlines.MAX16(n11, 6554))) {
            n8 = 0;
            n7 = 0;
            n6 = 0;
        } else {
            if (Inlines.ABS32(n8 - this.prefilter_gain) < 3277) {
                n8 = this.prefilter_gain;
            }
            n6 = (n8 + 1536 >> 10) / 3 - 1;
            n6 = Inlines.IMAX(0, Inlines.IMIN(7, n6));
            n8 = 3072 * (n6 + 1);
            n7 = 1;
        }
        n10 = 0;
        do {
            int n12 = celtMode.shortMdctSize - n9;
            this.prefilter_period = Inlines.IMAX(this.prefilter_period, 15);
            System.arraycopy(this.in_mem[n10], 0, nArray[n10], 0, n9);
            if (n12 != 0) {
                CeltCommon.comb_filter(nArray[n10], n9, nArrayArray[n10], 1024, this.prefilter_period, this.prefilter_period, n12, -this.prefilter_gain, -this.prefilter_gain, this.prefilter_tapset, this.prefilter_tapset, null, 0);
            }
            CeltCommon.comb_filter(nArray[n10], n9 + n12, nArrayArray[n10], 1024 + n12, this.prefilter_period, boxedValueInt4.Val, n2 - n12, -this.prefilter_gain, -n8, this.prefilter_tapset, n3, celtMode.window, n9);
            System.arraycopy(nArray[n10], n2, this.in_mem[n10], 0, n9);
            if (n2 > 1024) {
                System.arraycopy(nArrayArray[n10], n2, nArray2[n10], 0, 1024);
                continue;
            }
            Arrays.MemMove(nArray2[n10], n2, 0, 1024 - n2);
            System.arraycopy(nArrayArray[n10], 1024, nArray2[n10], 1024 - n2, n2);
        } while (++n10 < n);
        boxedValueInt2.Val = n8;
        boxedValueInt.Val = boxedValueInt4.Val;
        boxedValueInt3.Val = n6;
        return n7;
    }

    void SetPrediction(int n) {
        if (n < 0 || n > 2) {
            throw new IllegalArgumentException("CELT prediction mode must be 0, 1, or 2");
        }
        this.disable_pf = n <= 1 ? 1 : 0;
        this.force_intra = n == 0 ? 1 : 0;
    }

    void SetLSBDepth(int n) {
        if (n < 8 || n > 24) {
            throw new IllegalArgumentException("Bit depth must be between 8 and 24");
        }
        this.lsb_depth = n;
    }
}

