/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.MDCT
 *  de.maxhenkel.voicechat.concentus.MDCTLookup
 *  de.maxhenkel.voicechat.concentus.OpusFramesize
 *  de.maxhenkel.voicechat.concentus.Pitch
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.AnalysisInfo;
import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.Bands;
import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.CeltMode;
import de.maxhenkel.voicechat.concentus.CeltTables;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.Kernels;
import de.maxhenkel.voicechat.concentus.MDCT;
import de.maxhenkel.voicechat.concentus.MDCTLookup;
import de.maxhenkel.voicechat.concentus.OpusFramesize;
import de.maxhenkel.voicechat.concentus.Pitch;

class CeltCommon {
    private static final short[] inv_table;
    private static final short[][] gains;
    private static final byte[][] tf_select_table;

    CeltCommon() {
    }

    static {
        short[] sArray = new short[128];
        sArray[0] = 255;
        sArray[1] = 255;
        sArray[2] = 156;
        sArray[3] = 110;
        sArray[4] = 86;
        sArray[5] = 70;
        sArray[6] = 59;
        sArray[7] = 51;
        sArray[8] = 45;
        sArray[9] = 40;
        sArray[10] = 37;
        sArray[11] = 33;
        sArray[12] = 31;
        sArray[13] = 28;
        sArray[14] = 26;
        sArray[15] = 25;
        sArray[16] = 23;
        sArray[17] = 22;
        sArray[18] = 21;
        sArray[19] = 20;
        sArray[20] = 19;
        sArray[21] = 18;
        sArray[22] = 17;
        sArray[23] = 16;
        sArray[24] = 16;
        sArray[25] = 15;
        sArray[26] = 15;
        sArray[27] = 14;
        sArray[28] = 13;
        sArray[29] = 13;
        sArray[30] = 12;
        sArray[31] = 12;
        sArray[32] = 12;
        sArray[33] = 12;
        sArray[34] = 11;
        sArray[35] = 11;
        sArray[36] = 11;
        sArray[37] = 10;
        sArray[38] = 10;
        sArray[39] = 10;
        sArray[40] = 9;
        sArray[41] = 9;
        sArray[42] = 9;
        sArray[43] = 9;
        sArray[44] = 9;
        sArray[45] = 9;
        sArray[46] = 8;
        sArray[47] = 8;
        sArray[48] = 8;
        sArray[49] = 8;
        sArray[50] = 8;
        sArray[51] = 7;
        sArray[52] = 7;
        sArray[53] = 7;
        sArray[54] = 7;
        sArray[55] = 7;
        sArray[56] = 7;
        sArray[57] = 6;
        sArray[58] = 6;
        sArray[59] = 6;
        sArray[60] = 6;
        sArray[61] = 6;
        sArray[62] = 6;
        sArray[63] = 6;
        sArray[64] = 6;
        sArray[65] = 6;
        sArray[66] = 6;
        sArray[67] = 6;
        sArray[68] = 6;
        sArray[69] = 6;
        sArray[70] = 6;
        sArray[71] = 6;
        sArray[72] = 6;
        sArray[73] = 5;
        sArray[74] = 5;
        sArray[75] = 5;
        sArray[76] = 5;
        sArray[77] = 5;
        sArray[78] = 5;
        sArray[79] = 5;
        sArray[80] = 5;
        sArray[81] = 5;
        sArray[82] = 5;
        sArray[83] = 5;
        sArray[84] = 5;
        sArray[85] = 4;
        sArray[86] = 4;
        sArray[87] = 4;
        sArray[88] = 4;
        sArray[89] = 4;
        sArray[90] = 4;
        sArray[91] = 4;
        sArray[92] = 4;
        sArray[93] = 4;
        sArray[94] = 4;
        sArray[95] = 4;
        sArray[96] = 4;
        sArray[97] = 4;
        sArray[98] = 4;
        sArray[99] = 4;
        sArray[100] = 4;
        sArray[101] = 4;
        sArray[102] = 4;
        sArray[103] = 4;
        sArray[104] = 4;
        sArray[105] = 4;
        sArray[106] = 4;
        sArray[107] = 4;
        sArray[108] = 4;
        sArray[109] = 4;
        sArray[110] = 3;
        sArray[111] = 3;
        sArray[112] = 3;
        sArray[113] = 3;
        sArray[114] = 3;
        sArray[115] = 3;
        sArray[116] = 3;
        sArray[117] = 3;
        sArray[118] = 3;
        sArray[119] = 3;
        sArray[120] = 3;
        sArray[121] = 3;
        sArray[122] = 3;
        sArray[123] = 3;
        sArray[124] = 3;
        sArray[125] = 3;
        sArray[126] = 3;
        sArray[127] = 2;
        inv_table = sArray;
        short[][] sArrayArray = new short[3][];
        short[] sArray2 = new short[3];
        sArray2[0] = 10048;
        sArray2[1] = 7112;
        sArray2[2] = 4248;
        sArrayArray[0] = sArray2;
        short[] sArray3 = new short[3];
        sArray3[0] = 15200;
        sArray3[1] = 8784;
        sArray3[2] = 0;
        sArrayArray[1] = sArray3;
        short[] sArray4 = new short[3];
        sArray4[0] = 26208;
        sArray4[1] = 3280;
        sArray4[2] = 0;
        sArrayArray[2] = sArray4;
        gains = sArrayArray;
        tf_select_table = new byte[][]{{0, -1, 0, -1, 0, -1, 0, -1}, {0, -1, 0, -2, 1, 0, 1, -1}, {0, -2, 0, -3, 2, 0, 1, -1}, {0, -2, 0, -3, 3, 0, 1, -1}};
    }

    static void compute_mdcts(CeltMode celtMode, int n, int[][] nArray, int[][] nArray2, int n2, int n3, int n4, int n5) {
        int n6;
        int n7;
        int n8;
        int n9;
        int n10 = celtMode.overlap;
        if (n != 0) {
            n9 = n;
            n8 = celtMode.shortMdctSize;
            n7 = celtMode.maxLM;
        } else {
            n9 = 1;
            n8 = celtMode.shortMdctSize << n4;
            n7 = celtMode.maxLM - n4;
        }
        int n11 = 0;
        do {
            for (int i = 0; i < n9; ++i) {
                MDCT.clt_mdct_forward((MDCTLookup)celtMode.mdct, (int[])nArray[n11], (int)(i * n8), (int[])nArray2[n11], (int)i, (int[])celtMode.window, (int)n10, (int)n7, (int)n9);
            }
        } while (++n11 < n3);
        if (n3 == 2 && n2 == 1) {
            for (n6 = 0; n6 < n9 * n8; ++n6) {
                nArray2[0][n6] = Inlines.ADD32(Inlines.HALF32(nArray2[0][n6]), Inlines.HALF32(nArray2[1][n6]));
            }
        }
        if (n5 != 1) {
            n11 = 0;
            do {
                int n12 = n9 * n8 / n5;
                n6 = 0;
                while (n6 < n12) {
                    int[] nArray3 = nArray2[n11];
                    int n13 = n6++;
                    nArray3[n13] = nArray3[n13] * n5;
                }
                Arrays.MemSetWithOffset(nArray2[n11], 0, n12, n9 * n8 - n12);
            } while (++n11 < n2);
        }
    }

    static int compute_vbr(CeltMode celtMode, AnalysisInfo analysisInfo, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int n10, int n11, int n12, OpusFramesize opusFramesize, int n13, int n14, int n15, int n16) {
        int n17;
        int n18;
        int n19;
        block12: {
            block13: {
                int n20 = celtMode.nbEBands;
                short[] sArray = celtMode.eBands;
                int n21 = n4 != 0 ? n4 : n20;
                int n22 = sArray[n21] << n2;
                if (n5 == 2) {
                    n22 += sArray[Inlines.IMIN(n6, n21)] << n2;
                }
                n19 = n;
                if (analysisInfo.enabled && analysisInfo.valid != 0 && (double)analysisInfo.activity < 0.4) {
                    n19 -= (int)((float)(n22 << 3) * (0.4f - analysisInfo.activity));
                }
                if (n5 == 2) {
                    n18 = Inlines.IMIN(n6, n21);
                    n17 = (sArray[n18] << n2) - n18;
                    int n23 = Inlines.DIV32_16(Inlines.MULT16_16(26214, n17), n22);
                    n8 = Inlines.MIN16(n8, 256);
                    n19 -= Inlines.MIN32(Inlines.MULT16_32_Q15(n23, n19), Inlines.SHR32(Inlines.MULT16_16(n8 - 26, n17 << 3), 8));
                }
                n19 += n9 - (16 << n2);
                int n24 = opusFramesize == OpusFramesize.OPUS_FRAMESIZE_VARIABLE ? 328 : 655;
                n19 += Inlines.SHL32(Inlines.MULT16_32_Q15(n10 - n24, n19), 1);
                if (analysisInfo.enabled && analysisInfo.valid != 0 && n13 == 0) {
                    float f = Inlines.MAX16(0.0f, analysisInfo.tonality - 0.15f) - 0.09f;
                    n18 = n19 + (int)((float)(n22 << 3) * 1.2f * f);
                    if (n11 != 0) {
                        n18 += (int)((float)(n22 << 3) * 0.8f);
                    }
                    n19 = n18;
                }
                if (n14 != 0 && n13 == 0) {
                    n18 = n19 + Inlines.SHR32(Inlines.MULT16_16(n15, n22 << 3), 10);
                    n19 = Inlines.IMAX(n19 / 4, n18);
                }
                n17 = sArray[n20 - 2] << n2;
                n18 = Inlines.SHR32(Inlines.MULT16_16(n5 * n17 << 3, n12), 10);
                n18 = Inlines.IMAX(n18, n19 >> 2);
                n19 = Inlines.IMIN(n19, n18);
                if (n14 != 0 && n13 == 0) break block12;
                if (n7 != 0) break block13;
                if (n3 >= 64000) break block12;
            }
            n18 = Inlines.MAX16(0, n3 - 32000);
            if (n7 != 0) {
                n18 = Inlines.MIN16(n18, 21955);
            }
            n19 = n + Inlines.MULT16_32_Q15(n18, n19 - n);
        }
        if (n14 == 0) {
            if (n10 < 3277) {
                n18 = Inlines.MULT16_16_Q15(3329, Inlines.IMAX(0, Inlines.IMIN(32000, 96000 - n3)));
                n17 = Inlines.SHR32(Inlines.MULT16_16(n16, n18), 10);
                n19 += Inlines.MULT16_32_Q15(n17, n19);
            }
        }
        n19 = Inlines.IMIN(2 * n, n19);
        return n19;
    }

    static void celt_preemphasis(short[] sArray, int n, int[] nArray, int n2, int n3, int n4, int n5, int[] nArray2, BoxedValueInt boxedValueInt, int n6) {
        int n7;
        int n8 = nArray2[0];
        int n9 = boxedValueInt.Val;
        if (nArray2[1] == 0 && n5 == 1 && n6 == 0) {
            for (int i = 0; i < n3; ++i) {
                short s = sArray[n + n4 * i];
                nArray[n2 + i] = Inlines.SHL32(s, 12) - n9;
                n9 = Inlines.SHR32(Inlines.MULT16_16(n8, (int)s), 3);
            }
            boxedValueInt.Val = n9;
            return;
        }
        int n10 = n3 / n5;
        if (n5 != 1) {
            Arrays.MemSetWithOffset(nArray, 0, n2, n3);
        }
        for (n7 = 0; n7 < n10; ++n7) {
            nArray[n2 + n7 * n5] = sArray[n + n4 * n7];
        }
        for (n7 = 0; n7 < n3; ++n7) {
            int n11 = nArray[n2 + n7];
            nArray[n2 + n7] = Inlines.SHL32(n11, 12) - n9;
            n9 = Inlines.SHR32(Inlines.MULT16_16(n8, n11), 3);
        }
        boxedValueInt.Val = n9;
    }

    static void celt_preemphasis(short[] sArray, int[] nArray, int n, int n2, int n3, int n4, int[] nArray2, BoxedValueInt boxedValueInt, int n5) {
        int n6;
        int n7 = nArray2[0];
        int n8 = boxedValueInt.Val;
        if (nArray2[1] == 0 && n4 == 1 && n5 == 0) {
            for (int i = 0; i < n2; ++i) {
                short s = sArray[n3 * i];
                nArray[n + i] = Inlines.SHL32(s, 12) - n8;
                n8 = Inlines.SHR32(Inlines.MULT16_16(n7, (int)s), 3);
            }
            boxedValueInt.Val = n8;
            return;
        }
        int n9 = n2 / n4;
        if (n4 != 1) {
            Arrays.MemSetWithOffset(nArray, 0, n, n2);
        }
        for (n6 = 0; n6 < n9; ++n6) {
            nArray[n + n6 * n4] = sArray[n3 * n6];
        }
        for (n6 = 0; n6 < n2; ++n6) {
            int n10 = nArray[n + n6];
            nArray[n + n6] = Inlines.SHL32(n10, 12) - n8;
            n8 = Inlines.SHR32(Inlines.MULT16_16(n7, n10), 3);
        }
        boxedValueInt.Val = n8;
    }

    static int transient_analysis(int[][] nArray, int n, int n2, BoxedValueInt boxedValueInt, BoxedValueInt boxedValueInt2) {
        int n3 = 0;
        int n4 = 0;
        boxedValueInt2.Val = 0;
        int[] nArray2 = new int[n];
        int n5 = n / 2;
        for (int i = 0; i < n2; ++i) {
            int n6;
            int n7;
            int n8 = 0;
            int n9 = 0;
            int n10 = 0;
            for (n7 = 0; n7 < n; ++n7) {
                n6 = Inlines.SHR32(nArray[i][n7], 12);
                int n11 = Inlines.ADD32(n9, n6);
                n9 = n10 + n11 - Inlines.SHL32(n6, 1);
                n10 = n6 - Inlines.SHR32(n11, 1);
                nArray2[n7] = Inlines.EXTRACT16(Inlines.SHR32(n11, 2));
            }
            Arrays.MemSet(nArray2, 0, 12);
            n6 = 0;
            n6 = 14 - Inlines.celt_ilog2(1 + Inlines.celt_maxabs32(nArray2, 0, n));
            if (n6 != 0) {
                for (n7 = 0; n7 < n; ++n7) {
                    nArray2[n7] = Inlines.SHL16(nArray2[n7], n6);
                }
            }
            int n12 = 0;
            n9 = 0;
            for (n7 = 0; n7 < n5; ++n7) {
                n6 = Inlines.PSHR32(Inlines.MULT16_16(nArray2[2 * n7], nArray2[2 * n7]) + Inlines.MULT16_16(nArray2[2 * n7 + 1], nArray2[2 * n7 + 1]), 16);
                n12 += n6;
                nArray2[n7] = n9 + Inlines.PSHR32(n6 - n9, 4);
                n9 = nArray2[n7];
            }
            n9 = 0;
            int n13 = 0;
            for (n7 = n5 - 1; n7 >= 0; --n7) {
                nArray2[n7] = n9 + Inlines.PSHR32(nArray2[n7] - n9, 3);
                n9 = nArray2[n7];
                n13 = Inlines.MAX16(n13, n9);
            }
            n12 = Inlines.MULT16_16(Inlines.celt_sqrt(n12), Inlines.celt_sqrt(Inlines.MULT16_16(n13, n5 >> 1)));
            int n14 = Inlines.SHL32(n5, 20) / Inlines.ADD32(1, Inlines.SHR32(n12, 1));
            n8 = 0;
            for (n7 = 12; n7 < n5 - 5; n7 += 4) {
                n6 = Inlines.MAX32(0, Inlines.MIN32(127, Inlines.MULT16_32_Q15(nArray2[n7] + 1, n14)));
                n8 += inv_table[n6];
            }
            if ((n8 = 64 * n8 * 4 / (6 * (n5 - 17))) <= n4) continue;
            boxedValueInt2.Val = i;
            n4 = n8;
        }
        n3 = n4 > 200 ? 1 : 0;
        int n15 = Inlines.MAX16(0, Inlines.celt_sqrt(27 * n4) - 42);
        boxedValueInt.Val = Inlines.celt_sqrt(Inlines.MAX32(0, Inlines.SHL32(Inlines.MULT16_16(113, Inlines.MIN16(163, n15)), 14) - 37312528));
        return n3;
    }

    static int tf_analysis(CeltMode celtMode, int n, int n2, int[] nArray, int n3, int[][] nArray2, int n4, int n5, BoxedValueInt boxedValueInt, int n6, int n7) {
        int n8;
        int n9;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int[] nArray3 = new int[2];
        int n15 = 0;
        int n16 = Inlines.MULT16_16_Q14(1311, Inlines.MAX16(-4096, 8192 - n6));
        int[] nArray4 = new int[n];
        int[] nArray5 = new int[celtMode.eBands[n] - celtMode.eBands[n - 1] << n5];
        int[] nArray6 = new int[celtMode.eBands[n] - celtMode.eBands[n - 1] << n5];
        int[] nArray7 = new int[n];
        int[] nArray8 = new int[n];
        boxedValueInt.Val = 0;
        for (n14 = 0; n14 < n; ++n14) {
            int n17 = 0;
            n13 = celtMode.eBands[n14 + 1] - celtMode.eBands[n14] << n5;
            n12 = celtMode.eBands[n14 + 1] - celtMode.eBands[n14] == 1 ? 1 : 0;
            System.arraycopy(nArray2[n7], celtMode.eBands[n14] << n5, nArray5, 0, n13);
            int n18 = n11 = CeltCommon.l1_metric(nArray5, n13, n2 != 0 ? n5 : 0, n16);
            if (n2 != 0 && n12 == 0) {
                System.arraycopy(nArray5, 0, nArray6, 0, n13);
                Bands.haar1ZeroOffset(nArray6, n13 >> n5, 1 << n5);
                n11 = CeltCommon.l1_metric(nArray6, n13, n5 + 1, n16);
                if (n11 < n18) {
                    n18 = n11;
                    n17 = -1;
                }
            }
            for (n10 = 0; n10 < n5 + (n2 == 0 && n12 == 0 ? 1 : 0); ++n10) {
                int n19 = n2 != 0 ? n5 - n10 - 1 : n10 + 1;
                Bands.haar1ZeroOffset(nArray5, n13 >> n10, 1 << n10);
                n11 = CeltCommon.l1_metric(nArray5, n13, n19, n16);
                if (n11 >= n18) continue;
                n18 = n11;
                n17 = n10 + 1;
            }
            nArray4[n14] = n2 != 0 ? 2 * n17 : -2 * n17;
            boxedValueInt.Val = boxedValueInt.Val + ((n2 != 0 ? n5 : 0) - nArray4[n14] / 2);
            if (n12 == 0 || nArray4[n14] != 0 && nArray4[n14] != -2 * n5) continue;
            int n20 = n14;
            nArray4[n20] = nArray4[n20] - 1;
        }
        n15 = 0;
        for (int i = 0; i < 2; ++i) {
            n9 = 0;
            n8 = n2 != 0 ? 0 : n3;
            for (n14 = 1; n14 < n; ++n14) {
                n10 = Inlines.IMIN(n9, n8 + n3);
                n13 = Inlines.IMIN(n9 + n3, n8);
                n9 = n10 + Inlines.abs(nArray4[n14] - 2 * CeltTables.tf_select_table[n5][4 * n2 + 2 * i + 0]);
                n8 = n13 + Inlines.abs(nArray4[n14] - 2 * CeltTables.tf_select_table[n5][4 * n2 + 2 * i + 1]);
            }
            nArray3[i] = n9 = Inlines.IMIN(n9, n8);
        }
        if (nArray3[1] < nArray3[0] && n2 != 0) {
            n15 = 1;
        }
        n9 = 0;
        n8 = n2 != 0 ? 0 : n3;
        for (n14 = 1; n14 < n; ++n14) {
            n12 = n9;
            n11 = n8 + n3;
            if (n12 < n11) {
                n10 = n12;
                nArray7[n14] = 0;
            } else {
                n10 = n11;
                nArray7[n14] = 1;
            }
            n12 = n9 + n3;
            n11 = n8;
            if (n12 < n11) {
                n13 = n12;
                nArray8[n14] = 0;
            } else {
                n13 = n11;
                nArray8[n14] = 1;
            }
            n9 = n10 + Inlines.abs(nArray4[n14] - 2 * CeltTables.tf_select_table[n5][4 * n2 + 2 * n15 + 0]);
            n8 = n13 + Inlines.abs(nArray4[n14] - 2 * CeltTables.tf_select_table[n5][4 * n2 + 2 * n15 + 1]);
        }
        nArray[n - 1] = n9 < n8 ? 0 : 1;
        for (n14 = n - 2; n14 >= 0; --n14) {
            nArray[n14] = nArray[n14 + 1] == 1 ? nArray8[n14 + 1] : nArray7[n14 + 1];
        }
        return n15;
    }

    static int patch_transient_decision(int[][] nArray, int[][] nArray2, int n, int n2, int n3, int n4) {
        int n5;
        int n6 = 0;
        int[] nArray3 = new int[26];
        if (n4 == 1) {
            nArray3[n2] = nArray2[0][n2];
            for (n5 = n2 + 1; n5 < n3; ++n5) {
                nArray3[n5] = Inlines.MAX16(nArray3[n5 - 1] - 1024, nArray2[0][n5]);
            }
        } else {
            nArray3[n2] = Inlines.MAX16(nArray2[0][n2], nArray2[1][n2]);
            for (n5 = n2 + 1; n5 < n3; ++n5) {
                nArray3[n5] = Inlines.MAX16(nArray3[n5 - 1] - 1024, Inlines.MAX16(nArray2[0][n5], nArray2[1][n5]));
            }
        }
        for (n5 = n3 - 2; n5 >= n2; --n5) {
            nArray3[n5] = Inlines.MAX16(nArray3[n5], nArray3[n5 + 1] - 1024);
        }
        int n7 = 0;
        do {
            for (n5 = Inlines.IMAX(2, n2); n5 < n3 - 1; ++n5) {
                int n8 = Inlines.MAX16(0, nArray[n7][n5]);
                int n9 = Inlines.MAX16(0, nArray3[n5]);
                n6 = Inlines.ADD32(n6, Inlines.MAX16(0, Inlines.SUB16(n8, n9)));
            }
        } while (++n7 < n4);
        n6 = Inlines.DIV32(n6, n4 * (n3 - 1 - Inlines.IMAX(2, n2)));
        return n6 > 1024 ? 1 : 0;
    }

    static int alloc_trim_analysis(CeltMode celtMode, int[][] nArray, int[][] nArray2, int n, int n2, int n3, AnalysisInfo analysisInfo, BoxedValueInt boxedValueInt, int n4, int n5, int n6) {
        int n7;
        int n8 = 0;
        int n9 = 1280;
        if (n3 == 2) {
            int n10;
            int n11 = 0;
            for (n7 = 0; n7 < 8; ++n7) {
                n10 = Kernels.celt_inner_prod(nArray[0], celtMode.eBands[n7] << n2, nArray[1], celtMode.eBands[n7] << n2, celtMode.eBands[n7 + 1] - celtMode.eBands[n7] << n2);
                n11 = Inlines.ADD16(n11, (int)Inlines.EXTRACT16(Inlines.SHR32(n10, 18)));
            }
            n11 = Inlines.MULT16_16_Q15(4096, n11);
            int n12 = n11 = Inlines.MIN16(1024, Inlines.ABS32(n11));
            for (n7 = 8; n7 < n5; ++n7) {
                n10 = Kernels.celt_inner_prod(nArray[0], celtMode.eBands[n7] << n2, nArray[1], celtMode.eBands[n7] << n2, celtMode.eBands[n7 + 1] - celtMode.eBands[n7] << n2);
                n12 = Inlines.MIN16(n12, (int)Inlines.ABS16(Inlines.EXTRACT16(Inlines.SHR32(n10, 18))));
            }
            n12 = Inlines.MIN16(1024, Inlines.ABS32(n12));
            int n13 = Inlines.celt_log2(1049625 - Inlines.MULT16_16(n11, n11));
            int n14 = Inlines.MAX16(Inlines.HALF16(n13), Inlines.celt_log2(1049625 - Inlines.MULT16_16(n12, n12)));
            n13 = Inlines.PSHR32(n13 - 6144, 2);
            n14 = Inlines.PSHR32(n14 - 6144, 2);
            n9 += Inlines.MAX16(-1024, Inlines.MULT16_16_Q15(24576, n13));
            boxedValueInt.Val = Inlines.MIN16(boxedValueInt.Val + 64, 0 - Inlines.HALF16(n14));
        }
        int n15 = 0;
        do {
            for (n7 = 0; n7 < n - 1; ++n7) {
                n8 += nArray2[n15][n7] * (2 + 2 * n7 - n);
            }
        } while (++n15 < n3);
        n8 /= n3 * (n - 1);
        n9 -= Inlines.MAX16((int)Inlines.NEG16((short)512), Inlines.MIN16(512, Inlines.SHR16(n8 + 1024, 2) / 6));
        n9 -= Inlines.SHR16(n6, 2);
        n9 -= 2 * Inlines.SHR16(n4, 6);
        if (analysisInfo.enabled && analysisInfo.valid != 0) {
            n9 -= Inlines.MAX16(-512, Inlines.MIN16(512, (int)(512.0f * (analysisInfo.tonality_slope + 0.05f))));
        }
        int n16 = Inlines.PSHR32(n9, 8);
        n16 = Inlines.IMAX(0, Inlines.IMIN(10, n16));
        return n16;
    }

    static int celt_plc_pitch_search(int[][] nArray, int n) {
        BoxedValueInt boxedValueInt = new BoxedValueInt(0);
        int[] nArray2 = new int[1024];
        Pitch.pitch_downsample((int[][])nArray, (int[])nArray2, (int)2048, (int)n);
        Pitch.pitch_search((int[])nArray2, (int)360, (int[])nArray2, (int)1328, (int)620, (BoxedValueInt)boxedValueInt);
        boxedValueInt.Val = 720 - boxedValueInt.Val;
        return boxedValueInt.Val;
    }

    static void tf_encode(int n, int n2, int n3, int[] nArray, int n4, int n5, EntropyCoder entropyCoder) {
        int n6;
        int n7 = entropyCoder.storage * 8;
        int n8 = entropyCoder.tell();
        int n9 = n3 != 0 ? 2 : 4;
        int n10 = n4 > 0 && n8 + n9 + 1 <= n7 ? 1 : 0;
        n7 -= n10;
        int n11 = 0;
        int n12 = 0;
        for (n6 = n; n6 < n2; ++n6) {
            if (n8 + n9 <= n7) {
                entropyCoder.enc_bit_logp(nArray[n6] ^ n12, n9);
                n8 = entropyCoder.tell();
                n12 = nArray[n6];
                n11 |= n12;
            } else {
                nArray[n6] = n12;
            }
            n9 = n3 != 0 ? 4 : 5;
        }
        if (n10 != 0 && CeltTables.tf_select_table[n4][4 * n3 + 0 + n11] != CeltTables.tf_select_table[n4][4 * n3 + 2 + n11]) {
            entropyCoder.enc_bit_logp(n5, 1);
        } else {
            n5 = 0;
        }
        for (n6 = n; n6 < n2; ++n6) {
            nArray[n6] = CeltTables.tf_select_table[n4][4 * n3 + 2 * n5 + nArray[n6]];
        }
    }

    static void deemphasis(int[][] nArray, int[] nArray2, short[] sArray, int n, int n2, int n3, int n4, int[] nArray3, int[] nArray4, int n5) {
        boolean bl = false;
        int[] nArray5 = new int[n2];
        int n6 = nArray3[0];
        int n7 = n2 / n4;
        int n8 = 0;
        do {
            int n9;
            int n10;
            int n11 = nArray4[n8];
            int[] nArray6 = nArray[n8];
            int n12 = nArray2[n8];
            int n13 = n + n8;
            if (n4 > 1) {
                for (n10 = 0; n10 < n2; ++n10) {
                    n9 = nArray6[n12 + n10] + n11 + 0;
                    n11 = Inlines.MULT16_32_Q15(n6, n9);
                    nArray5[n10] = n9;
                }
                bl = true;
            } else if (n5 != 0) {
                for (n10 = 0; n10 < n2; ++n10) {
                    n9 = nArray6[n12 + n10] + n11 + 0;
                    n11 = Inlines.MULT16_32_Q15(n6, n9);
                    sArray[n13 + n10 * n3] = Inlines.SAT16(Inlines.ADD32(sArray[n13 + n10 * n3], Inlines.SIG2WORD16(n9)));
                }
            } else {
                for (n10 = 0; n10 < n2; ++n10) {
                    n9 = nArray6[n12 + n10] + n11 + 0;
                    if (nArray6[n12 + n10] > 0 && n11 > 0 && n9 < 0) {
                        n9 = Integer.MAX_VALUE;
                        n11 = Integer.MAX_VALUE;
                    } else {
                        n11 = Inlines.MULT16_32_Q15(n6, n9);
                    }
                    sArray[n13 + n10 * n3] = Inlines.SIG2WORD16(n9);
                }
            }
            nArray4[n8] = n11;
            if (!bl) continue;
            for (n10 = 0; n10 < n7; ++n10) {
                sArray[n13 + n10 * n3] = Inlines.SIG2WORD16(nArray5[n10 * n4]);
            }
        } while (++n8 < n3);
    }

    static int l1_metric(int[] nArray, int n, int n2, int n3) {
        int n4 = 0;
        for (int i = 0; i < n; ++i) {
            n4 += Inlines.EXTEND32(Inlines.ABS32(nArray[i]));
        }
        n4 = Inlines.MAC16_32_Q15(n4, n2 * n3, n4);
        return n4;
    }

    static void tf_decode(int n, int n2, int n3, int[] nArray, int n4, EntropyCoder entropyCoder) {
        int n5;
        int n6 = entropyCoder.storage * 8;
        int n7 = entropyCoder.tell();
        int n8 = n3 != 0 ? 2 : 4;
        int n9 = n4 > 0 && n7 + n8 + 1 <= n6 ? 1 : 0;
        n6 -= n9;
        int n10 = 0;
        int n11 = 0;
        for (n5 = n; n5 < n2; ++n5) {
            if (n7 + n8 <= n6) {
                n7 = entropyCoder.tell();
                n11 |= (n10 ^= entropyCoder.dec_bit_logp(n8));
            }
            nArray[n5] = n10;
            n8 = n3 != 0 ? 4 : 5;
        }
        int n12 = 0;
        if (n9 != 0 && CeltTables.tf_select_table[n4][4 * n3 + 0 + n11] != CeltTables.tf_select_table[n4][4 * n3 + 2 + n11]) {
            n12 = entropyCoder.dec_bit_logp(1L);
        }
        for (n5 = n; n5 < n2; ++n5) {
            nArray[n5] = CeltTables.tf_select_table[n4][4 * n3 + 2 * n12 + nArray[n5]];
        }
    }

    static void init_caps(CeltMode celtMode, int[] nArray, int n, int n2) {
        for (int i = 0; i < celtMode.nbEBands; ++i) {
            int n3 = celtMode.eBands[i + 1] - celtMode.eBands[i] << n;
            nArray[i] = (celtMode.cache.caps[celtMode.nbEBands * (2 * n + n2 - 1) + i] + 64) * n2 * n3 >> 2;
        }
    }

    static int resampling_factor(int n) {
        int n2;
        switch (n) {
            case 48000: {
                n2 = 1;
                break;
            }
            case 24000: {
                n2 = 2;
                break;
            }
            case 16000: {
                n2 = 3;
                break;
            }
            case 12000: {
                n2 = 4;
                break;
            }
            case 8000: {
                n2 = 6;
                break;
            }
            default: {
                Inlines.OpusAssert(false);
                n2 = 0;
            }
        }
        return n2;
    }

    static void comb_filter(int[] nArray, int n, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7, int n8, int n9, int[] nArray3, int n10) {
        int n11;
        if (n6 == 0 && n7 == 0) {
            if (n2 != n) {
                // empty if block
            }
            return;
        }
        int n12 = Inlines.MULT16_16_P15(n6, (int)gains[n8][0]);
        int n13 = Inlines.MULT16_16_P15(n6, (int)gains[n8][1]);
        int n14 = Inlines.MULT16_16_P15(n6, (int)gains[n8][2]);
        int n15 = Inlines.MULT16_16_P15(n7, (int)gains[n9][0]);
        int n16 = Inlines.MULT16_16_P15(n7, (int)gains[n9][1]);
        int n17 = Inlines.MULT16_16_P15(n7, (int)gains[n9][2]);
        int n18 = nArray2[n2 - n4 + 1];
        int n19 = nArray2[n2 - n4];
        int n20 = nArray2[n2 - n4 - 1];
        int n21 = nArray2[n2 - n4 - 2];
        if (n6 == n7 && n3 == n4 && n8 == n9) {
            n10 = 0;
        }
        for (n11 = 0; n11 < n10; ++n11) {
            int n22 = nArray2[n2 + n11 - n4 + 2];
            int n23 = Inlines.MULT16_16_Q15(nArray3[n11], nArray3[n11]);
            nArray[n + n11] = nArray2[n2 + n11] + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15((int)((short)(Short.MAX_VALUE - n23)), n12), nArray2[n2 + n11 - n3]) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15((int)((short)(Short.MAX_VALUE - n23)), n13), Inlines.ADD32(nArray2[n2 + n11 - n3 + 1], nArray2[n2 + n11 - n3 - 1])) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15((int)((short)(Short.MAX_VALUE - n23)), n14), Inlines.ADD32(nArray2[n2 + n11 - n3 + 2], nArray2[n2 + n11 - n3 - 2])) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15(n23, n15), n19) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15(n23, n16), Inlines.ADD32(n18, n20)) + Inlines.MULT16_32_Q15(Inlines.MULT16_16_Q15(n23, n17), Inlines.ADD32(n22, n21));
            n21 = n20;
            n20 = n19;
            n19 = n18;
            n18 = n22;
        }
        if (n7 == 0) {
            if (n2 != n) {
                // empty if block
            }
            return;
        }
        CeltCommon.comb_filter_const(nArray, n + n11, nArray2, n2 + n11, n4, n5 - n11, n15, n16, n17);
    }

    static int stereo_analysis(CeltMode celtMode, int[][] nArray, int n) {
        int n2 = 1;
        int n3 = 1;
        for (int i = 0; i < 13; ++i) {
            for (int j = celtMode.eBands[i] << n; j < celtMode.eBands[i + 1] << n; ++j) {
                int n4 = Inlines.EXTEND32(nArray[0][j]);
                int n5 = Inlines.EXTEND32(nArray[1][j]);
                int n6 = Inlines.ADD32(n4, n5);
                int n7 = Inlines.SUB32(n4, n5);
                n2 = Inlines.ADD32(n2, Inlines.ADD32(Inlines.ABS32(n4), Inlines.ABS32(n5)));
                n3 = Inlines.ADD32(n3, Inlines.ADD32(Inlines.ABS32(n6), Inlines.ABS32(n7)));
            }
        }
        n3 = Inlines.MULT16_32_Q15((short)23170, n3);
        int n8 = 13;
        if (n <= 1) {
            n8 -= 8;
        }
        return Inlines.MULT16_32_Q15((celtMode.eBands[13] << n + 1) + n8, n3) > Inlines.MULT16_32_Q15(celtMode.eBands[13] << n + 1, n2) ? 1 : 0;
    }

    static void comb_filter_const(int[] nArray, int n, int[] nArray2, int n2, int n3, int n4, int n5, int n6, int n7) {
        int n8 = n2 - n3;
        int n9 = nArray2[n8 - 2];
        int n10 = nArray2[n8 - 1];
        int n11 = nArray2[n8];
        int n12 = nArray2[n8 + 1];
        for (int i = 0; i < n4; ++i) {
            int n13 = nArray2[n8 + i + 2];
            nArray[n + i] = nArray2[n2 + i] + Inlines.MULT16_32_Q15(n5, n11) + Inlines.MULT16_32_Q15(n6, Inlines.ADD32(n12, n10)) + Inlines.MULT16_32_Q15(n7, Inlines.ADD32(n13, n9));
            n9 = n10;
            n10 = n11;
            n11 = n12;
            n12 = n13;
        }
    }

    static int median_of_5(int[] nArray, int n) {
        int n2;
        int n3;
        int n4;
        int n5;
        int n6 = nArray[n + 2];
        if (nArray[n] > nArray[n + 1]) {
            n5 = nArray[n + 1];
            n4 = nArray[n];
        } else {
            n5 = nArray[n];
            n4 = nArray[n + 1];
        }
        if (nArray[n + 3] > nArray[n + 4]) {
            n3 = nArray[n + 4];
            n2 = nArray[n + 3];
        } else {
            n3 = nArray[n + 3];
            n2 = nArray[n + 4];
        }
        if (n5 > n3) {
            int n7 = n3;
            n3 = n5;
            n5 = n7;
            n7 = n2;
            n2 = n4;
            n4 = n7;
        }
        if (n6 > n4) {
            if (n4 < n3) {
                return Inlines.MIN16(n6, n3);
            }
            return Inlines.MIN16(n2, n4);
        }
        if (n6 < n3) {
            return Inlines.MIN16(n4, n3);
        }
        return Inlines.MIN16(n6, n2);
    }

    static int dynalloc_analysis(int[][] nArray, int[][] nArray2, int n, int n2, int n3, int n4, int[] nArray3, int n5, short[] sArray, int n6, int n7, int n8, short[] sArray2, int n9, int n10, BoxedValueInt boxedValueInt, int n11, int[] nArray4) {
        int n12;
        int n13 = 0;
        int[][] nArray5 = Arrays.InitTwoDimensionalArrayInt(2, n);
        int[] nArray6 = new int[n4 * n];
        Arrays.MemSet(nArray3, 0, n);
        int n14 = -32666;
        for (n12 = 0; n12 < n3; ++n12) {
            nArray6[n12] = Inlines.MULT16_16((short)64, sArray[n12]) + 512 + Inlines.SHL16(9 - n5, 10) - Inlines.SHL16(CeltTables.eMeans[n12], 6) + Inlines.MULT16_16(6, (n12 + 5) * (n12 + 5));
        }
        int n15 = 0;
        do {
            for (n12 = 0; n12 < n3; ++n12) {
                n14 = Inlines.MAX16(n14, nArray[n15][n12] - nArray6[n12]);
            }
        } while (++n15 < n4);
        if (n10 > 50 && n9 >= 1 && n11 == 0) {
            int n16;
            int n17;
            int n18 = 0;
            n15 = 0;
            do {
                int[] nArray7 = nArray5[n15];
                nArray7[0] = nArray2[n15][0];
                for (n12 = 1; n12 < n3; ++n12) {
                    if (nArray2[n15][n12] > nArray2[n15][n12 - 1] + 512) {
                        n18 = n12;
                    }
                    nArray7[n12] = Inlines.MIN16(nArray7[n12 - 1] + 1536, nArray2[n15][n12]);
                }
                for (n12 = n18 - 1; n12 >= 0; --n12) {
                    nArray7[n12] = Inlines.MIN16(nArray7[n12], Inlines.MIN16(nArray7[n12 + 1] + 2048, nArray2[n15][n12]));
                }
                n17 = 1024;
                for (n12 = 2; n12 < n3 - 2; ++n12) {
                    nArray7[n12] = Inlines.MAX16(nArray7[n12], CeltCommon.median_of_5(nArray2[n15], n12 - 2) - n17);
                }
                n16 = CeltCommon.median_of_3(nArray2[n15], 0) - n17;
                nArray7[0] = Inlines.MAX16(nArray7[0], n16);
                nArray7[1] = Inlines.MAX16(nArray7[1], n16);
                n16 = CeltCommon.median_of_3(nArray2[n15], n3 - 3) - n17;
                nArray7[n3 - 2] = Inlines.MAX16(nArray7[n3 - 2], n16);
                nArray7[n3 - 1] = Inlines.MAX16(nArray7[n3 - 1], n16);
                for (n12 = 0; n12 < n3; ++n12) {
                    nArray7[n12] = Inlines.MAX16(nArray7[n12], nArray6[n12]);
                }
            } while (++n15 < n4);
            if (n4 == 2) {
                for (n12 = n2; n12 < n3; ++n12) {
                    nArray5[1][n12] = Inlines.MAX16(nArray5[1][n12], nArray5[0][n12] - 4096);
                    nArray5[0][n12] = Inlines.MAX16(nArray5[0][n12], nArray5[1][n12] - 4096);
                    nArray5[0][n12] = Inlines.HALF16(Inlines.MAX16(0, nArray[0][n12] - nArray5[0][n12]) + Inlines.MAX16(0, nArray[1][n12] - nArray5[1][n12]));
                }
            } else {
                for (n12 = n2; n12 < n3; ++n12) {
                    nArray5[0][n12] = Inlines.MAX16(0, nArray[0][n12] - nArray5[0][n12]);
                }
            }
            for (n12 = n2; n12 < n3; ++n12) {
                nArray5[0][n12] = Inlines.MAX16(nArray5[0][n12], nArray4[n12]);
            }
            if ((n7 == 0 || n8 != 0) && n6 == 0) {
                for (n12 = n2; n12 < n3; ++n12) {
                    nArray5[0][n12] = Inlines.HALF16(nArray5[0][n12]);
                }
            }
            for (n12 = n2; n12 < n3; ++n12) {
                int n19;
                if (n12 < 8) {
                    int[] nArray8 = nArray5[0];
                    int n20 = n12;
                    nArray8[n20] = nArray8[n20] * 2;
                }
                if (n12 >= 12) {
                    nArray5[0][n12] = Inlines.HALF16(nArray5[0][n12]);
                }
                nArray5[0][n12] = Inlines.MIN16(nArray5[0][n12], 4096);
                n17 = n4 * (sArray2[n12 + 1] - sArray2[n12]) << n9;
                if (n17 < 6) {
                    n16 = Inlines.SHR32(nArray5[0][n12], 10);
                    n19 = n16 * n17 << 3;
                } else if (n17 > 48) {
                    n16 = Inlines.SHR32(nArray5[0][n12] * 8, 10);
                    n19 = (n16 * n17 << 3) / 8;
                } else {
                    n16 = Inlines.SHR32(nArray5[0][n12] * n17 / 6, 10);
                    n19 = n16 * 6 << 3;
                }
                if ((n7 == 0 || n8 != 0 && n6 == 0) && n13 + n19 >> 3 >> 3 > n10 / 4) {
                    int n21 = n10 / 4 << 3 << 3;
                    nArray3[n12] = n21 - n13;
                    n13 = n21;
                    break;
                }
                nArray3[n12] = n16;
                n13 += n19;
            }
        }
        boxedValueInt.Val = n13;
        return n14;
    }

    static void celt_synthesis(CeltMode celtMode, int[][] nArray, int[][] nArray2, int[] nArray3, int[] nArray4, int n, int n2, int n3, int n4, int n5, int n6, int n7, int n8) {
        int n9;
        int n10;
        int n11;
        int n12 = celtMode.overlap;
        int n13 = celtMode.nbEBands;
        int n14 = celtMode.shortMdctSize << n6;
        int[] nArray5 = new int[n14];
        int n15 = 1 << n6;
        if (n5 != 0) {
            n11 = n15;
            n10 = celtMode.shortMdctSize;
            n9 = celtMode.maxLM;
        } else {
            n11 = 1;
            n10 = celtMode.shortMdctSize << n6;
            n9 = celtMode.maxLM - n6;
        }
        if (n4 == 2 && n3 == 1) {
            int n16;
            Bands.denormalise_bands(celtMode, nArray[0], nArray5, 0, nArray4, 0, n, n2, n15, n7, n8);
            int n17 = nArray3[1] + n12 / 2;
            System.arraycopy(nArray5, 0, nArray2[1], n17, n14);
            for (n16 = 0; n16 < n11; ++n16) {
                MDCT.clt_mdct_backward((MDCTLookup)celtMode.mdct, (int[])nArray2[1], (int)(n17 + n16), (int[])nArray2[0], (int)(nArray3[0] + n10 * n16), (int[])celtMode.window, (int)n12, (int)n9, (int)n11);
            }
            for (n16 = 0; n16 < n11; ++n16) {
                MDCT.clt_mdct_backward((MDCTLookup)celtMode.mdct, (int[])nArray5, (int)n16, (int[])nArray2[1], (int)(nArray3[1] + n10 * n16), (int[])celtMode.window, (int)n12, (int)n9, (int)n11);
            }
        } else if (n4 == 1 && n3 == 2) {
            int n18 = nArray3[0] + n12 / 2;
            Bands.denormalise_bands(celtMode, nArray[0], nArray5, 0, nArray4, 0, n, n2, n15, n7, n8);
            Bands.denormalise_bands(celtMode, nArray[1], nArray2[0], n18, nArray4, n13, n, n2, n15, n7, n8);
            for (int i = 0; i < n14; ++i) {
                nArray5[i] = Inlines.HALF32(Inlines.ADD32(nArray5[i], nArray2[0][n18 + i]));
            }
            for (int i = 0; i < n11; ++i) {
                MDCT.clt_mdct_backward((MDCTLookup)celtMode.mdct, (int[])nArray5, (int)i, (int[])nArray2[0], (int)(nArray3[0] + n10 * i), (int[])celtMode.window, (int)n12, (int)n9, (int)n11);
            }
        } else {
            int n19 = 0;
            do {
                Bands.denormalise_bands(celtMode, nArray[n19], nArray5, 0, nArray4, n19 * n13, n, n2, n15, n7, n8);
                for (int i = 0; i < n11; ++i) {
                    MDCT.clt_mdct_backward((MDCTLookup)celtMode.mdct, (int[])nArray5, (int)i, (int[])nArray2[n19], (int)(nArray3[n19] + n10 * i), (int[])celtMode.window, (int)n12, (int)n9, (int)n11);
                }
            } while (++n19 < n4);
        }
    }

    static int median_of_3(int[] nArray, int n) {
        int n2;
        int n3;
        if (nArray[n] > nArray[n + 1]) {
            n3 = nArray[n + 1];
            n2 = nArray[n];
        } else {
            n3 = nArray[n];
            n2 = nArray[n + 1];
        }
        int n4 = nArray[n + 2];
        if (n2 < n4) {
            return n2;
        }
        if (n3 < n4) {
            return n4;
        }
        return n3;
    }
}

