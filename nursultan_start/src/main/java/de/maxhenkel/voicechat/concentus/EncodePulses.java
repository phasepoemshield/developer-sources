/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.ShellCoder
 *  de.maxhenkel.voicechat.concentus.SilkTables
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.Arrays;
import de.maxhenkel.voicechat.concentus.CodeSigns;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.ShellCoder;
import de.maxhenkel.voicechat.concentus.SilkTables;

class EncodePulses {
    EncodePulses() {
    }

    static int combine_and_check(int[] nArray, int[] nArray2, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            int n3 = nArray2[2 * i] + nArray2[2 * i + 1];
            if (n3 > n) {
                return 1;
            }
            nArray[i] = n3;
        }
        return 0;
    }

    static int combine_and_check(int[] nArray, int n, int[] nArray2, int n2, int n3, int n4) {
        for (int i = 0; i < n4; ++i) {
            int n5 = 2 * i + n2;
            int n6 = nArray2[n5] + nArray2[n5 + 1];
            if (n6 > n3) {
                return 1;
            }
            nArray[n + i] = n6;
        }
        return 0;
    }

    static void silk_encode_pulses(EntropyCoder entropyCoder, int n, int n2, byte[] byArray, int n3) {
        int n4;
        int n5;
        int n6 = 0;
        int[] nArray = new int[8];
        Arrays.MemSet(nArray, 0, 8);
        Inlines.OpusAssert(true);
        int n7 = Inlines.silk_RSHIFT(n3, 4);
        if (n7 * 16 < n3) {
            Inlines.OpusAssert(n3 == 120);
            ++n7;
            Arrays.MemSetWithOffset(byArray, (byte)0, n3, 16);
        }
        int[] nArray2 = new int[n7 * 16];
        Inlines.OpusAssert(true);
        for (n5 = 0; n5 < n7 * 16; n5 += 4) {
            nArray2[n5 + 0] = Inlines.silk_abs(byArray[n5 + 0]);
            nArray2[n5 + 1] = Inlines.silk_abs(byArray[n5 + 1]);
            nArray2[n5 + 2] = Inlines.silk_abs(byArray[n5 + 2]);
            nArray2[n5 + 3] = Inlines.silk_abs(byArray[n5 + 3]);
        }
        int[] nArray3 = new int[n7];
        int[] nArray4 = new int[n7];
        int n8 = 0;
        for (n5 = 0; n5 < n7; ++n5) {
            nArray4[n5] = 0;
            block2: while (true) {
                int n9 = EncodePulses.combine_and_check(nArray, 0, nArray2, n8, SilkTables.silk_max_pulses_table[0], 8);
                n9 += EncodePulses.combine_and_check(nArray, nArray, SilkTables.silk_max_pulses_table[1], 4);
                n9 += EncodePulses.combine_and_check(nArray, nArray, SilkTables.silk_max_pulses_table[2], 2);
                if ((n9 += EncodePulses.combine_and_check(nArray3, n5, nArray, 0, SilkTables.silk_max_pulses_table[3], 1)) == 0) break;
                int n10 = n5;
                nArray4[n10] = nArray4[n10] + 1;
                n4 = n8;
                while (true) {
                    if (n4 >= n8 + 16) continue block2;
                    nArray2[n4] = Inlines.silk_RSHIFT(nArray2[n4], 1);
                    ++n4;
                }
                break;
            }
            n8 += 16;
        }
        int n11 = Integer.MAX_VALUE;
        for (n4 = 0; n4 < 9; ++n4) {
            short[] sArray = SilkTables.silk_pulses_per_block_BITS_Q5[n4];
            int n12 = SilkTables.silk_rate_levels_BITS_Q5[n >> 1][n4];
            for (n5 = 0; n5 < n7; ++n5) {
                if (nArray4[n5] > 0) {
                    n12 += sArray[17];
                    continue;
                }
                n12 += sArray[nArray3[n5]];
            }
            if (n12 >= n11) continue;
            n11 = n12;
            n6 = n4;
        }
        entropyCoder.enc_icdf(n6, SilkTables.silk_rate_levels_iCDF[n >> 1], 8);
        for (n5 = 0; n5 < n7; ++n5) {
            if (nArray4[n5] == 0) {
                entropyCoder.enc_icdf(nArray3[n5], SilkTables.silk_pulses_per_block_iCDF[n6], 8);
                continue;
            }
            entropyCoder.enc_icdf(17, SilkTables.silk_pulses_per_block_iCDF[n6], 8);
            for (n4 = 0; n4 < nArray4[n5] - 1; ++n4) {
                entropyCoder.enc_icdf(17, SilkTables.silk_pulses_per_block_iCDF[9], 8);
            }
            entropyCoder.enc_icdf(nArray3[n5], SilkTables.silk_pulses_per_block_iCDF[9], 8);
        }
        for (n5 = 0; n5 < n7; ++n5) {
            if (nArray3[n5] <= 0) continue;
            ShellCoder.silk_shell_encoder((EntropyCoder)entropyCoder, (int[])nArray2, (int)(n5 * 16));
        }
        for (n5 = 0; n5 < n7; ++n5) {
            if (nArray4[n5] <= 0) continue;
            int n13 = n5 * 16;
            int n14 = nArray4[n5] - 1;
            for (n4 = 0; n4 < 16; ++n4) {
                int n15;
                byte by = (byte)Inlines.silk_abs(byArray[n13 + n4]);
                for (int i = n14; i > 0; --i) {
                    n15 = Inlines.silk_RSHIFT(by, i) & 1;
                    entropyCoder.enc_icdf(n15, SilkTables.silk_lsb_iCDF, 8);
                }
                n15 = by & 1;
                entropyCoder.enc_icdf(n15, SilkTables.silk_lsb_iCDF, 8);
            }
        }
        CodeSigns.silk_encode_signs(entropyCoder, byArray, n3, n, n2, nArray3);
    }
}

