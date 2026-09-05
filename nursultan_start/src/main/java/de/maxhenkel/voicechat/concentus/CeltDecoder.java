/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.OpusError
 *  de.maxhenkel.voicechat.concentus.QuantizeBands
 *  de.maxhenkel.voicechat.concentus.Rate
 *  de.maxhenkel.voicechat.concentus.VQ
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Autocorrelation;
import de.maxhenkel.voicechat.concentus.Bands;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltCommon;
import de.maxhenkel.voicechat.concentus.CeltLPC;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.CeltTables;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Kernels;
import de.maxhenkel.voicechat.concentus.OpusError;
import de.maxhenkel.voicechat.concentus.QuantizeBands;
import de.maxhenkel.voicechat.concentus.Rate;
import de.maxhenkel.voicechat.concentus.VQ;

class CeltDecoder {
    CeltMode mode = null;
    int overlap = 0;
    int channels = 0;
    int stream_channels = 0;
    int downsample = 0;
    int start = 0;
    int end = 0;
    int signalling = 0;
    int rng = 0;
    int error = 0;
    int last_pitch_index = 0;
    int loss_count = 0;
    int postfilter_period = 0;
    int postfilter_period_old = 0;
    int postfilter_gain = 0;
    int postfilter_gain_old = 0;
    int postfilter_tapset = 0;
    int postfilter_tapset_old = 0;
    final int[] preemph_memD = new int[2];
    int[][] decode_mem = null;
    int[][] lpc = null;
    int[] oldEBands = null;
    int[] oldLogE = null;
    int[] oldLogE2 = null;
    int[] backgroundLogE = null;

    CeltDecoder() {
    }

    private void Reset() {
        this.mode = null;
        this.overlap = 0;
        this.channels = 0;
        this.stream_channels = 0;
        this.downsample = 0;
        this.start = 0;
        this.end = 0;
        this.signalling = 0;
        this.PartialReset();
    }

    int celt_decode_with_ec(byte[] byArray, int n, int n2, short[] sArray, int n3, int n4, EntropyCoder entropyCoder, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int[] nArray;
        int[] nArray2;
        int[] nArray3;
        int[] nArray4;
        int n13;
        int n14;
        short[] sArray2;
        int n15;
        int n16;
        CeltMode celtMode;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        int[] nArray5;
        int[][] nArrayArray;
        block38: {
            block37: {
                nArrayArray = new int[2][];
                nArray5 = new int[2];
                n21 = this.channels;
                n20 = 0;
                n19 = 0;
                n18 = 0;
                n17 = this.stream_channels;
                celtMode = this.mode;
                n16 = celtMode.nbEBands;
                n15 = celtMode.overlap;
                sArray2 = celtMode.eBands;
                n14 = this.start;
                n13 = this.end;
                n4 *= this.downsample;
                nArray4 = this.oldEBands;
                nArray3 = this.oldLogE;
                nArray2 = this.oldLogE2;
                nArray = this.backgroundLogE;
                for (n12 = 0; n12 <= celtMode.maxLM && celtMode.shortMdctSize << n12 != n4; ++n12) {
                }
                if (n12 > celtMode.maxLM) {
                    return OpusError.OPUS_BAD_ARG;
                }
                n11 = 1 << n12;
                if (n2 < 0) break block37;
                if (n2 <= 1275 && sArray != null) break block38;
            }
            return OpusError.OPUS_BAD_ARG;
        }
        int n22 = n11 * celtMode.shortMdctSize;
        int n23 = 0;
        do {
            nArrayArray[n23] = this.decode_mem[n23];
            nArray5[n23] = 2048 - n22;
        } while (++n23 < n21);
        int n24 = n13;
        if (n24 > celtMode.effEBands) {
            n24 = celtMode.effEBands;
        }
        if (byArray == null || n2 <= 1) {
            this.celt_decode_lost(n22, n12);
            CeltCommon.deemphasis(nArrayArray, nArray5, sArray, n3, n22, n21, this.downsample, celtMode.preemph, this.preemph_memD, n5);
            return n4 / this.downsample;
        }
        if (entropyCoder == null) {
            entropyCoder = new EntropyCoder();
            entropyCoder.dec_init(byArray, n, n2);
        }
        if (n17 == 1) {
            for (n10 = 0; n10 < n16; ++n10) {
                nArray4[n10] = Inlines.MAX16(nArray4[n10], nArray4[n16 + n10]);
            }
        }
        int n25 = n2 * 8;
        int n26 = entropyCoder.tell();
        int n27 = n26 >= n25 ? 1 : (n26 == 1 ? entropyCoder.dec_bit_logp(15L) : 0);
        if (n27 != 0) {
            n26 = n2 * 8;
            entropyCoder.nbits_total += n26 - entropyCoder.tell();
        }
        int n28 = 0;
        int n29 = 0;
        int n30 = 0;
        if (n14 == 0 && n26 + 16 <= n25) {
            if (entropyCoder.dec_bit_logp(1L) != 0) {
                n9 = (int)entropyCoder.dec_uint(6L);
                n29 = (16 << n9) + entropyCoder.dec_bits(4 + n9) - 1;
                n8 = entropyCoder.dec_bits(3);
                if (entropyCoder.tell() + 2 <= n25) {
                    n30 = entropyCoder.dec_icdf(CeltTables.tapset_icdf, 2);
                }
                n28 = 3072 * (n8 + 1);
            }
            n26 = entropyCoder.tell();
        }
        if (n12 > 0 && n26 + 3 <= n25) {
            n7 = entropyCoder.dec_bit_logp(3L);
            n26 = entropyCoder.tell();
        } else {
            n7 = 0;
        }
        int n31 = n7 != 0 ? n11 : 0;
        int n32 = n26 + 3 <= n25 ? entropyCoder.dec_bit_logp(3L) : 0;
        QuantizeBands.unquant_coarse_energy((CeltMode)celtMode, (int)n14, (int)n13, (int[])nArray4, (int)n32, (EntropyCoder)entropyCoder, (int)n17, (int)n12);
        int[] nArray6 = new int[n16];
        CeltCommon.tf_decode(n14, n13, n7, nArray6, n12, entropyCoder);
        n26 = entropyCoder.tell();
        int n33 = 2;
        if (n26 + 4 <= n25) {
            n33 = entropyCoder.dec_icdf(CeltTables.spread_icdf, 5);
        }
        int[] nArray7 = new int[n16];
        CeltCommon.init_caps(celtMode, nArray7, n12, n17);
        int[] nArray8 = new int[n16];
        int n34 = 6;
        n25 <<= 3;
        n26 = entropyCoder.tell_frac();
        for (n10 = n14; n10 < n13; ++n10) {
            int n35;
            n8 = n17 * (sArray2[n10 + 1] - sArray2[n10]) << n12;
            n9 = Inlines.IMIN(n8 << 3, Inlines.IMAX(48, n8));
            int n36 = n34;
            for (n35 = 0; n26 + (n36 << 3) < n25 && n35 < nArray7[n10]; n35 += n9, n25 -= n9) {
                n6 = entropyCoder.dec_bit_logp(n36);
                n26 = entropyCoder.tell_frac();
                if (n6 == 0) break;
                n36 = 1;
            }
            nArray8[n10] = n35;
            if (n35 <= 0) continue;
            n34 = Inlines.IMAX(2, n34 - 1);
        }
        int[] nArray9 = new int[n16];
        int n37 = n26 + 48 <= n25 ? entropyCoder.dec_icdf(CeltTables.trim_icdf, 7) : 5;
        int n38 = (n2 * 8 << 3) - entropyCoder.tell_frac() - 1;
        int n39 = n7 != 0 && n12 >= 2 && n38 >= n12 + 2 << 3 ? 8 : 0;
        n38 -= n39;
        int[] nArray10 = new int[n16];
        int[] nArray11 = new int[n16];
        BoxedValueInt boxedValueInt = new BoxedValueInt(n20);
        BoxedValueInt boxedValueInt2 = new BoxedValueInt(n19);
        BoxedValueInt boxedValueInt3 = new BoxedValueInt(0);
        int n40 = Rate.compute_allocation((CeltMode)celtMode, (int)n14, (int)n13, (int[])nArray8, (int[])nArray7, (int)n37, (BoxedValueInt)boxedValueInt, (BoxedValueInt)boxedValueInt2, (int)n38, (BoxedValueInt)boxedValueInt3, (int[])nArray10, (int[])nArray9, (int[])nArray11, (int)n17, (int)n12, (EntropyCoder)entropyCoder, (int)0, (int)0, (int)0);
        n20 = boxedValueInt.Val;
        n19 = boxedValueInt2.Val;
        int n41 = boxedValueInt3.Val;
        QuantizeBands.unquant_fine_energy((CeltMode)celtMode, (int)n14, (int)n13, (int[])nArray4, (int[])nArray9, (EntropyCoder)entropyCoder, (int)n17);
        n23 = 0;
        do {
            Arrays.MemMove(this.decode_mem[n23], n22, 0, 2048 - n22 + n15 / 2);
        } while (++n23 < n21);
        short[] sArray3 = new short[n17 * n16];
        int[][] nArray12 = Arrays.InitTwoDimensionalArrayInt(n17, n22);
        BoxedValueInt boxedValueInt4 = new BoxedValueInt(this.rng);
        Bands.quant_all_bands(0, celtMode, n14, n13, nArray12[0], n17 == 2 ? nArray12[1] : null, sArray3, null, nArray10, n31, n33, n19, n20, nArray6, n2 * 64 - n39, n41, entropyCoder, n12, n40, boxedValueInt4);
        this.rng = boxedValueInt4.Val;
        if (n39 > 0) {
            n18 = entropyCoder.dec_bits(1);
        }
        QuantizeBands.unquant_energy_finalise((CeltMode)celtMode, (int)n14, (int)n13, (int[])nArray4, (int[])nArray9, (int[])nArray11, (int)(n2 * 8 - entropyCoder.tell()), (EntropyCoder)entropyCoder, (int)n17);
        if (n18 != 0) {
            Bands.anti_collapse(celtMode, nArray12, sArray3, n12, n17, n22, n14, n13, nArray4, nArray3, nArray2, nArray10, this.rng);
        }
        if (n27 != 0) {
            for (n10 = 0; n10 < n17 * n16; ++n10) {
                nArray4[n10] = -28672;
            }
        }
        CeltCommon.celt_synthesis(celtMode, nArray12, nArrayArray, nArray5, nArray4, n14, n24, n17, n21, n7, n12, this.downsample, n27);
        n23 = 0;
        do {
            this.postfilter_period = Inlines.IMAX(this.postfilter_period, 15);
            this.postfilter_period_old = Inlines.IMAX(this.postfilter_period_old, 15);
            CeltCommon.comb_filter(nArrayArray[n23], nArray5[n23], nArrayArray[n23], nArray5[n23], this.postfilter_period_old, this.postfilter_period, celtMode.shortMdctSize, this.postfilter_gain_old, this.postfilter_gain, this.postfilter_tapset_old, this.postfilter_tapset, celtMode.window, n15);
            if (n12 == 0) continue;
            CeltCommon.comb_filter(nArrayArray[n23], nArray5[n23] + celtMode.shortMdctSize, nArrayArray[n23], nArray5[n23] + celtMode.shortMdctSize, this.postfilter_period, n29, n22 - celtMode.shortMdctSize, this.postfilter_gain, n28, this.postfilter_tapset, n30, celtMode.window, n15);
        } while (++n23 < n21);
        this.postfilter_period_old = this.postfilter_period;
        this.postfilter_gain_old = this.postfilter_gain;
        this.postfilter_tapset_old = this.postfilter_tapset;
        this.postfilter_period = n29;
        this.postfilter_gain = n28;
        this.postfilter_tapset = n30;
        if (n12 != 0) {
            this.postfilter_period_old = this.postfilter_period;
            this.postfilter_gain_old = this.postfilter_gain;
            this.postfilter_tapset_old = this.postfilter_tapset;
        }
        if (n17 == 1) {
            System.arraycopy(nArray4, 0, nArray4, n16, n16);
        }
        if (n7 == 0) {
            System.arraycopy(nArray3, 0, nArray2, 0, 2 * n16);
            System.arraycopy(nArray4, 0, nArray3, 0, 2 * n16);
            n6 = this.loss_count < 10 ? n11 * 1 : 1024;
            for (n10 = 0; n10 < 2 * n16; ++n10) {
                nArray[n10] = Inlines.MIN16(nArray[n10] + n6, nArray4[n10]);
            }
        } else {
            for (n10 = 0; n10 < 2 * n16; ++n10) {
                nArray3[n10] = Inlines.MIN16(nArray3[n10], nArray4[n10]);
            }
        }
        n23 = 0;
        do {
            for (n10 = 0; n10 < n14; ++n10) {
                nArray4[n23 * n16 + n10] = 0;
                nArray2[n23 * n16 + n10] = -28672;
                nArray3[n23 * n16 + n10] = -28672;
            }
            for (n10 = n13; n10 < n16; ++n10) {
                nArray4[n23 * n16 + n10] = 0;
                nArray2[n23 * n16 + n10] = -28672;
                nArray3[n23 * n16 + n10] = -28672;
            }
        } while (++n23 < 2);
        this.rng = (int)entropyCoder.rng;
        CeltCommon.deemphasis(nArrayArray, nArray5, sArray, n3, n22, n21, this.downsample, celtMode.preemph, this.preemph_memD, n5);
        this.loss_count = 0;
        if (entropyCoder.tell() > 8 * n2) {
            return OpusError.OPUS_INTERNAL_ERROR;
        }
        if (entropyCoder.get_error() != 0) {
            this.error = 1;
        }
        return n4 / this.downsample;
    }

    private int opus_custom_decoder_init(CeltMode celtMode, int n) {
        if (n < 0 || n > 2) {
            return OpusError.OPUS_BAD_ARG;
        }
        if (this == null) {
            return OpusError.OPUS_ALLOC_FAIL;
        }
        this.Reset();
        this.mode = celtMode;
        this.overlap = celtMode.overlap;
        this.stream_channels = this.channels = n;
        this.downsample = 1;
        this.start = 0;
        this.end = this.mode.effEBands;
        this.signalling = 1;
        this.loss_count = 0;
        this.ResetState();
        return OpusError.OPUS_OK;
    }

    void ResetState() {
        this.PartialReset();
        this.decode_mem = new int[this.channels][];
        this.lpc = new int[this.channels][];
        for (int i = 0; i < this.channels; ++i) {
            this.decode_mem[i] = new int[2048 + this.mode.overlap];
            this.lpc[i] = new int[24];
        }
        this.oldEBands = new int[2 * this.mode.nbEBands];
        this.oldLogE = new int[2 * this.mode.nbEBands];
        this.oldLogE2 = new int[2 * this.mode.nbEBands];
        this.backgroundLogE = new int[2 * this.mode.nbEBands];
        for (int i = 0; i < 2 * this.mode.nbEBands; ++i) {
            this.oldLogE2[i] = -28672;
            this.oldLogE[i] = -28672;
        }
    }

    void SetEndBand(int n) {
        if (n < 1 || n > this.mode.nbEBands) {
            throw new IllegalArgumentException("End band above max number of ebands (or less than 1)");
        }
        this.end = n;
    }

    public int GetPitch() {
        return this.postfilter_period;
    }

    public CeltMode GetMode() {
        return this.mode;
    }

    public int GetFinalRange() {
        return this.rng;
    }

    void celt_decode_lost(int n, int n2) {
        boolean bl;
        int n3 = this.channels;
        int[][] nArrayArray = new int[2][];
        int[] nArray = new int[2];
        CeltMode celtMode = this.mode;
        int n4 = celtMode.nbEBands;
        int n5 = celtMode.overlap;
        short[] sArray = celtMode.eBands;
        int n6 = 0;
        do {
            nArrayArray[n6] = this.decode_mem[n6];
            nArray[n6] = 2048 - n;
        } while (++n6 < n3);
        boolean bl2 = bl = this.loss_count >= 5 || this.start != 0;
        if (bl) {
            int n7;
            int n8 = this.end;
            int n9 = Inlines.IMAX(this.start, Inlines.IMIN(n8, celtMode.effEBands));
            int[][] nArray2 = Arrays.InitTwoDimensionalArrayInt(n3, n);
            int n10 = this.loss_count == 0 ? 1536 : 512;
            n6 = 0;
            do {
                for (n7 = this.start; n7 < n8; ++n7) {
                    this.oldEBands[n6 * n4 + n7] = Inlines.MAX16(this.backgroundLogE[n6 * n4 + n7], this.oldEBands[n6 * n4 + n7] - n10);
                }
            } while (++n6 < n3);
            int n11 = this.rng;
            for (n6 = 0; n6 < n3; ++n6) {
                for (n7 = this.start; n7 < n9; ++n7) {
                    int n12 = sArray[n7] << n2;
                    int n13 = sArray[n7 + 1] - sArray[n7] << n2;
                    for (int i = 0; i < n13; ++i) {
                        n11 = Bands.celt_lcg_rand(n11);
                        nArray2[n6][n12 + i] = n11 >> 20;
                    }
                    VQ.renormalise_vector((int[])nArray2[n6], (int)0, (int)n13, (int)Short.MAX_VALUE);
                }
            }
            this.rng = n11;
            n6 = 0;
            do {
                Arrays.MemMove(this.decode_mem[n6], n, 0, 2048 - n + (n5 >> 1));
            } while (++n6 < n3);
            CeltCommon.celt_synthesis(celtMode, nArray2, nArrayArray, nArray, this.oldEBands, this.start, n9, n3, n3, 0, n2, this.downsample, 0);
        } else {
            int n14;
            int n15 = Short.MAX_VALUE;
            if (this.loss_count == 0) {
                this.last_pitch_index = n14 = CeltCommon.celt_plc_pitch_search(this.decode_mem, n3);
            } else {
                n14 = this.last_pitch_index;
                n15 = 26214;
            }
            int[] nArray3 = new int[n5];
            int[] nArray4 = new int[1024];
            int[] nArray5 = celtMode.window;
            n6 = 0;
            do {
                int[] nArray6;
                int n16;
                int n17 = 0;
                int[] nArray7 = this.decode_mem[n6];
                for (n16 = 0; n16 < 1024; ++n16) {
                    nArray4[n16] = Inlines.ROUND16(nArray7[1024 + n16], 12);
                }
                if (this.loss_count == 0) {
                    nArray6 = new int[25];
                    Autocorrelation._celt_autocorr(nArray4, nArray6, nArray5, n5, 24, 1024);
                    nArray6[0] = nArray6[0] + Inlines.SHR32(nArray6[0], 13);
                    for (n16 = 1; n16 <= 24; ++n16) {
                        int n18 = n16;
                        nArray6[n18] = nArray6[n18] - Inlines.MULT16_32_Q15(2 * n16 * n16, nArray6[n16]);
                    }
                    CeltLPC.celt_lpc(this.lpc[n6], nArray6, 24);
                }
                int n19 = Inlines.IMIN(2 * n14, 1024);
                nArray6 = new int[24];
                for (n16 = 0; n16 < 24; ++n16) {
                    nArray6[n16] = Inlines.ROUND16(nArray7[2048 - n19 - 1 - n16], 12);
                }
                Kernels.celt_fir(nArray4, 1024 - n19, this.lpc[n6], 0, nArray4, 1024 - n19, n19, 24, nArray6);
                int n20 = 1;
                int n21 = 1;
                int n22 = Inlines.IMAX(0, 2 * Inlines.celt_zlog2(Inlines.celt_maxabs16(nArray4, 1024 - n19, n19)) - 20);
                int n23 = n19 >> 1;
                for (n16 = 0; n16 < n23; ++n16) {
                    int n24 = nArray4[1024 - n23 + n16];
                    n20 += Inlines.SHR32(Inlines.MULT16_16(n24, n24), n22);
                    n24 = nArray4[1024 - 2 * n23 + n16];
                    n21 += Inlines.SHR32(Inlines.MULT16_16(n24, n24), n22);
                }
                n20 = Inlines.MIN32(n20, n21);
                int n25 = Inlines.celt_sqrt(Inlines.frac_div32(Inlines.SHR32(n20, 1), n21));
                Arrays.MemMove(nArray7, n, 0, 2048 - n);
                int n26 = 1024 - n14;
                int n27 = n + n5;
                int n28 = Inlines.MULT16_16_Q15(n15, n25);
                int n29 = 0;
                n16 = 0;
                while (n16 < n27) {
                    if (n29 >= n14) {
                        n29 -= n14;
                        n28 = Inlines.MULT16_16_Q15(n28, n25);
                    }
                    nArray7[2048 - n + n16] = Inlines.SHL32(Inlines.MULT16_16_Q15(n28, nArray4[n26 + n29]), 12);
                    n20 = Inlines.ROUND16(nArray7[1024 - n + n26 + n29], 12);
                    n17 += Inlines.SHR32(Inlines.MULT16_16(n20, n20), 8);
                    ++n16;
                    ++n29;
                }
                int[] nArray8 = new int[24];
                for (n16 = 0; n16 < 24; ++n16) {
                    nArray8[n16] = Inlines.ROUND16(nArray7[2048 - n - 1 - n16], 12);
                }
                CeltLPC.celt_iir(nArray7, 2048 - n, this.lpc[n6], nArray7, 2048 - n, n27, 24, nArray8);
                int n30 = 0;
                for (n16 = 0; n16 < n27; ++n16) {
                    n21 = Inlines.ROUND16(nArray7[2048 - n + n16], 12);
                    n30 += Inlines.SHR32(Inlines.MULT16_16(n21, n21), 8);
                }
                if (n17 <= Inlines.SHR32(n30, 2)) {
                    for (n16 = 0; n16 < n27; ++n16) {
                        nArray7[2048 - n + n16] = 0;
                    }
                } else if (n17 < n30) {
                    n21 = Inlines.celt_sqrt(Inlines.frac_div32(Inlines.SHR32(n17, 1) + 1, n30 + 1));
                    for (n16 = 0; n16 < n5; ++n16) {
                        n23 = Short.MAX_VALUE - Inlines.MULT16_16_Q15(nArray5[n16], Short.MAX_VALUE - n21);
                        nArray7[2048 - n + n16] = Inlines.MULT16_32_Q15(n23, nArray7[2048 - n + n16]);
                    }
                    for (n16 = n5; n16 < n27; ++n16) {
                        nArray7[2048 - n + n16] = Inlines.MULT16_32_Q15(n21, nArray7[2048 - n + n16]);
                    }
                }
                CeltCommon.comb_filter(nArray3, 0, nArray7, 2048, this.postfilter_period, this.postfilter_period, n5, -this.postfilter_gain, -this.postfilter_gain, this.postfilter_tapset, this.postfilter_tapset, null, 0);
                for (n16 = 0; n16 < n5 / 2; ++n16) {
                    nArray7[2048 + n16] = Inlines.MULT16_32_Q15(nArray5[n16], nArray3[n5 - 1 - n16]) + Inlines.MULT16_32_Q15(nArray5[n5 - n16 - 1], nArray3[n16]);
                }
            } while (++n6 < n3);
        }
        ++this.loss_count;
    }

    public void SetSignalling(int n) {
        this.signalling = n;
    }

    private void PartialReset() {
        this.rng = 0;
        this.error = 0;
        this.last_pitch_index = 0;
        this.loss_count = 0;
        this.postfilter_period = 0;
        this.postfilter_period_old = 0;
        this.postfilter_gain = 0;
        this.postfilter_gain_old = 0;
        this.postfilter_tapset = 0;
        this.postfilter_tapset_old = 0;
        Arrays.MemSet(this.preemph_memD, 0, 2);
        this.decode_mem = null;
        this.lpc = null;
        this.oldEBands = null;
        this.oldLogE = null;
        this.oldLogE2 = null;
        this.backgroundLogE = null;
    }

    void SetChannels(int n) {
        if (n < 1 || n > 2) {
            throw new IllegalArgumentException("Channel count must be 1 or 2");
        }
        this.stream_channels = n;
    }

    int celt_decoder_init(int n, int n2) {
        int n3 = this.opus_custom_decoder_init(CeltMode.mode48000_960_120, n2);
        if (n3 != OpusError.OPUS_OK) {
            return n3;
        }
        this.downsample = CeltCommon.resampling_factor(n);
        if (this.downsample == 0) {
            return OpusError.OPUS_BAD_ARG;
        }
        return OpusError.OPUS_OK;
    }

    void SetStartBand(int n) {
        if (n < 0 || n >= this.mode.nbEBands) {
            throw new IllegalArgumentException("Start band above max number of ebands (or negative)");
        }
        this.start = n;
    }

    int GetAndClearError() {
        int n = this.error;
        this.error = 0;
        return n;
    }

    public int GetLookahead() {
        return this.overlap / this.downsample;
    }
}

