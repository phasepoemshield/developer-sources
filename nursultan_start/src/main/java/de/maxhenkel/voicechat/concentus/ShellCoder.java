/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkTables;

class ShellCoder {
    ShellCoder() {
    }

    static void decode_split(short[] sArray, int n, short[] sArray2, int n2, EntropyCoder entropyCoder, int n3, short[] sArray3) {
        if (n3 > 0) {
            sArray[n] = (short)entropyCoder.dec_icdf(sArray3, (int)SilkTables.silk_shell_code_table_offsets[n3], 8);
            sArray2[n2] = (short)(n3 - sArray[n]);
        } else {
            sArray[n] = 0;
            sArray2[n2] = 0;
        }
    }

    static void combine_pulses(int[] nArray, int[] nArray2, int n, int n2) {
        for (int i = 0; i < n2; ++i) {
            nArray[i] = nArray2[n + 2 * i] + nArray2[n + 2 * i + 1];
        }
    }

    static void combine_pulses(int[] nArray, int[] nArray2, int n) {
        for (int i = 0; i < n; ++i) {
            nArray[i] = nArray2[2 * i] + nArray2[2 * i + 1];
        }
    }

    static void encode_split(EntropyCoder entropyCoder, int n, int n2, short[] sArray) {
        if (n2 > 0) {
            entropyCoder.enc_icdf(n, sArray, (int)SilkTables.silk_shell_code_table_offsets[n2], 8);
        }
    }

    static void silk_shell_decoder(short[] sArray, int n, EntropyCoder entropyCoder, int n2) {
        short[] sArray2 = new short[8];
        short[] sArray3 = new short[4];
        short[] sArray4 = new short[2];
        Inlines.OpusAssert((boolean)true);
        ShellCoder.decode_split(sArray4, 0, sArray4, 1, entropyCoder, n2, SilkTables.silk_shell_code_table3);
        ShellCoder.decode_split(sArray3, 0, sArray3, 1, entropyCoder, sArray4[0], SilkTables.silk_shell_code_table2);
        ShellCoder.decode_split(sArray2, 0, sArray2, 1, entropyCoder, sArray3[0], SilkTables.silk_shell_code_table1);
        ShellCoder.decode_split(sArray, n, sArray, n + 1, entropyCoder, sArray2[0], SilkTables.silk_shell_code_table0);
        ShellCoder.decode_split(sArray, n + 2, sArray, n + 3, entropyCoder, sArray2[1], SilkTables.silk_shell_code_table0);
        ShellCoder.decode_split(sArray2, 2, sArray2, 3, entropyCoder, sArray3[1], SilkTables.silk_shell_code_table1);
        ShellCoder.decode_split(sArray, n + 4, sArray, n + 5, entropyCoder, sArray2[2], SilkTables.silk_shell_code_table0);
        ShellCoder.decode_split(sArray, n + 6, sArray, n + 7, entropyCoder, sArray2[3], SilkTables.silk_shell_code_table0);
        ShellCoder.decode_split(sArray3, 2, sArray3, 3, entropyCoder, sArray4[1], SilkTables.silk_shell_code_table2);
        ShellCoder.decode_split(sArray2, 4, sArray2, 5, entropyCoder, sArray3[2], SilkTables.silk_shell_code_table1);
        ShellCoder.decode_split(sArray, n + 8, sArray, n + 9, entropyCoder, sArray2[4], SilkTables.silk_shell_code_table0);
        ShellCoder.decode_split(sArray, n + 10, sArray, n + 11, entropyCoder, sArray2[5], SilkTables.silk_shell_code_table0);
        ShellCoder.decode_split(sArray2, 6, sArray2, 7, entropyCoder, sArray3[3], SilkTables.silk_shell_code_table1);
        ShellCoder.decode_split(sArray, n + 12, sArray, n + 13, entropyCoder, sArray2[6], SilkTables.silk_shell_code_table0);
        ShellCoder.decode_split(sArray, n + 14, sArray, n + 15, entropyCoder, sArray2[7], SilkTables.silk_shell_code_table0);
    }

    static void silk_shell_encoder(EntropyCoder entropyCoder, int[] nArray, int n) {
        int[] nArray2 = new int[8];
        int[] nArray3 = new int[4];
        int[] nArray4 = new int[2];
        int[] nArray5 = new int[1];
        Inlines.OpusAssert((boolean)true);
        ShellCoder.combine_pulses(nArray2, nArray, n, 8);
        ShellCoder.combine_pulses(nArray3, nArray2, 4);
        ShellCoder.combine_pulses(nArray4, nArray3, 2);
        ShellCoder.combine_pulses(nArray5, nArray4, 1);
        ShellCoder.encode_split(entropyCoder, nArray4[0], nArray5[0], SilkTables.silk_shell_code_table3);
        ShellCoder.encode_split(entropyCoder, nArray3[0], nArray4[0], SilkTables.silk_shell_code_table2);
        ShellCoder.encode_split(entropyCoder, nArray2[0], nArray3[0], SilkTables.silk_shell_code_table1);
        ShellCoder.encode_split(entropyCoder, nArray[n], nArray2[0], SilkTables.silk_shell_code_table0);
        ShellCoder.encode_split(entropyCoder, nArray[n + 2], nArray2[1], SilkTables.silk_shell_code_table0);
        ShellCoder.encode_split(entropyCoder, nArray2[2], nArray3[1], SilkTables.silk_shell_code_table1);
        ShellCoder.encode_split(entropyCoder, nArray[n + 4], nArray2[2], SilkTables.silk_shell_code_table0);
        ShellCoder.encode_split(entropyCoder, nArray[n + 6], nArray2[3], SilkTables.silk_shell_code_table0);
        ShellCoder.encode_split(entropyCoder, nArray3[2], nArray4[1], SilkTables.silk_shell_code_table2);
        ShellCoder.encode_split(entropyCoder, nArray2[4], nArray3[2], SilkTables.silk_shell_code_table1);
        ShellCoder.encode_split(entropyCoder, nArray[n + 8], nArray2[4], SilkTables.silk_shell_code_table0);
        ShellCoder.encode_split(entropyCoder, nArray[n + 10], nArray2[5], SilkTables.silk_shell_code_table0);
        ShellCoder.encode_split(entropyCoder, nArray2[6], nArray3[3], SilkTables.silk_shell_code_table1);
        ShellCoder.encode_split(entropyCoder, nArray[n + 12], nArray2[6], SilkTables.silk_shell_code_table0);
        ShellCoder.encode_split(entropyCoder, nArray[n + 14], nArray2[7], SilkTables.silk_shell_code_table0);
    }
}

