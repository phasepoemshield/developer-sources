/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.SilkTables
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;
import de.maxhenkel.voicechat.concentus.SilkTables;

class CodeSigns {
    CodeSigns() {
    }

    private static int silk_dec_map(int n) {
        return Inlines.silk_LSHIFT(n, 1) - 1;
    }

    static void silk_decode_signs(EntropyCoder entropyCoder, short[] sArray, int n, int n2, int n3, int[] nArray) {
        int n4;
        short[] sArray2 = new short[2];
        short[] sArray3 = SilkTables.silk_sign_iCDF;
        sArray2[1] = 0;
        int n5 = 0;
        int n6 = n4 = Inlines.silk_SMULBB(7, Inlines.silk_ADD_LSHIFT(n3, n2, 1));
        n = Inlines.silk_RSHIFT(n + 8, 4);
        for (n4 = 0; n4 < n; ++n4) {
            int n7 = nArray[n4];
            if (n7 > 0) {
                sArray2[0] = sArray3[n6 + Inlines.silk_min(n7 & 0x1F, 6)];
                for (int i = 0; i < 16; ++i) {
                    if (sArray[n5 + i] <= 0) continue;
                    int n8 = n5 + i;
                    sArray[n8] = (short)(sArray[n8] * (short)CodeSigns.silk_dec_map(entropyCoder.dec_icdf(sArray2, 8)));
                }
            }
            n5 += 16;
        }
    }

    private static int silk_enc_map(int n) {
        return Inlines.silk_RSHIFT(n, 15) + 1;
    }

    static void silk_encode_signs(EntropyCoder entropyCoder, byte[] byArray, int n, int n2, int n3, int[] nArray) {
        int n4;
        short[] sArray = new short[2];
        short[] sArray2 = SilkTables.silk_sign_iCDF;
        sArray[1] = 0;
        int n5 = 0;
        int n6 = n4 = Inlines.silk_SMULBB(7, Inlines.silk_ADD_LSHIFT(n3, n2, 1));
        n = Inlines.silk_RSHIFT(n + 8, 4);
        for (n4 = 0; n4 < n; ++n4) {
            int n7 = nArray[n4];
            if (n7 > 0) {
                sArray[0] = sArray2[n6 + Inlines.silk_min(n7 & 0x1F, 6)];
                for (int i = n5; i < n5 + 16; ++i) {
                    if (byArray[i] == 0) continue;
                    entropyCoder.enc_icdf(CodeSigns.silk_enc_map(byArray[i]), sArray, 8);
                }
            }
            n5 += 16;
        }
    }
}

