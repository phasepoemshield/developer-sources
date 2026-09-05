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

class DecodePulses {
    DecodePulses() {
    }

    static void silk_decode_pulses(EntropyCoder entropyCoder, short[] sArray, int n, int n2, int n3) {
        int n4;
        int[] nArray = new int[20];
        int[] nArray2 = new int[20];
        int n5 = entropyCoder.dec_icdf(SilkTables.silk_rate_levels_iCDF[n >> 1], 8);
        Inlines.OpusAssert(true);
        int n6 = Inlines.silk_RSHIFT(n3, 4);
        if (n6 * 16 < n3) {
            Inlines.OpusAssert(n3 == 120);
            ++n6;
        }
        for (n4 = 0; n4 < n6; ++n4) {
            nArray2[n4] = 0;
            nArray[n4] = entropyCoder.dec_icdf(SilkTables.silk_pulses_per_block_iCDF[n5], 8);
            while (nArray[n4] == 17) {
                int n7 = n4;
                nArray2[n7] = nArray2[n7] + 1;
                nArray[n4] = entropyCoder.dec_icdf(SilkTables.silk_pulses_per_block_iCDF[9], nArray2[n4] == 10 ? 1 : 0, 8);
            }
        }
        for (n4 = 0; n4 < n6; ++n4) {
            if (nArray[n4] > 0) {
                ShellCoder.silk_shell_decoder((short[])sArray, (int)Inlines.silk_SMULBB(n4, 16), (EntropyCoder)entropyCoder, (int)nArray[n4]);
                continue;
            }
            Arrays.MemSetWithOffset(sArray, (short)0, Inlines.silk_SMULBB(n4, 16), 16);
        }
        for (n4 = 0; n4 < n6; ++n4) {
            if (nArray2[n4] <= 0) continue;
            int n8 = nArray2[n4];
            int n9 = Inlines.silk_SMULBB(n4, 16);
            for (int i = 0; i < 16; ++i) {
                int n10 = sArray[n9 + i];
                for (int j = 0; j < n8; ++j) {
                    n10 = Inlines.silk_LSHIFT(n10, 1);
                    n10 += entropyCoder.dec_icdf(SilkTables.silk_lsb_iCDF, 8);
                }
                sArray[n9 + i] = (short)n10;
            }
            int n11 = n4;
            nArray[n11] = nArray[n11] | n8 << 5;
        }
        CodeSigns.silk_decode_signs(entropyCoder, sArray, n3, n, n2, nArray);
    }
}

