/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.CeltTables;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;

class CWRS {
    static final int[] CELT_PVQ_U_ROW;

    CWRS() {
    }

    static {
        int[] nArray = new int[15];
        nArray[0] = 0;
        nArray[1] = 176;
        nArray[2] = 351;
        nArray[3] = 525;
        nArray[4] = 698;
        nArray[5] = 870;
        nArray[6] = 1041;
        nArray[7] = 1131;
        nArray[8] = 1178;
        nArray[9] = 1207;
        nArray[10] = 1226;
        nArray[11] = 1240;
        nArray[12] = 1248;
        nArray[13] = 1254;
        nArray[14] = 1257;
        CELT_PVQ_U_ROW = nArray;
    }

    static void encode_pulses(int[] nArray, int n, int n2, EntropyCoder entropyCoder) {
        Inlines.OpusAssert(n2 > 0);
        entropyCoder.enc_uint(CWRS.icwrs(n, nArray), CWRS.CELT_PVQ_V(n, n2));
    }

    static int decode_pulses(int[] nArray, int n, int n2, EntropyCoder entropyCoder) {
        return CWRS.cwrsi(n, n2, entropyCoder.dec_uint(CWRS.CELT_PVQ_V(n, n2)), nArray);
    }

    private static long CELT_PVQ_U(int n, int n2) {
        return CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[Inlines.IMIN(n, n2)] + Inlines.IMAX(n, n2)];
    }

    static long icwrs(int n, int[] nArray) {
        Inlines.OpusAssert(n >= 2);
        int n2 = n - 1;
        long l = nArray[n2] < 0 ? 1L : 0L;
        int n3 = Inlines.abs(nArray[n2]);
        do {
            l += CWRS.CELT_PVQ_U(n - --n2, n3);
            n3 += Inlines.abs(nArray[n2]);
            if (nArray[n2] >= 0) continue;
            l += CWRS.CELT_PVQ_U(n - n2, n3 + 1);
        } while (n2 > 0);
        return l;
    }

    private static long CELT_PVQ_V(int n, int n2) {
        return CWRS.CELT_PVQ_U(n, n2) + CWRS.CELT_PVQ_U(n, n2 + 1);
    }

    static int cwrsi(int n, int n2, long l, int[] nArray) {
        short s;
        int n3;
        int n4;
        long l2;
        int n5 = 0;
        int n6 = 0;
        Inlines.OpusAssert(n2 > 0);
        Inlines.OpusAssert(n > 1);
        while (n > 2) {
            long l3;
            if (n2 >= n) {
                int n7 = CELT_PVQ_U_ROW[n];
                l2 = CeltTables.CELT_PVQ_U_DATA[n7 + n2 + 1];
                n4 = 0 - (l >= l2 ? 1 : 0);
                n3 = n2;
                l3 = CeltTables.CELT_PVQ_U_DATA[n7 + n];
                if (l3 > (l -= Inlines.CapToUInt32(l2 & (long)n4))) {
                    Inlines.OpusAssert(l2 > l3);
                    n2 = n;
                    while ((l2 = CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[--n2] + n]) > l) {
                    }
                } else {
                    l2 = CeltTables.CELT_PVQ_U_DATA[n7 + n2];
                    while (l2 > l) {
                        l2 = CeltTables.CELT_PVQ_U_DATA[n7 + --n2];
                    }
                }
                l -= l2;
                s = (short)(n3 - n2 + n4 ^ n4);
                nArray[n6++] = s;
                n5 = Inlines.MAC16_16(n5, s, s);
            } else {
                l2 = CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[n2] + n];
                l3 = CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[n2 + 1] + n];
                if (l2 <= l && l < l3) {
                    l -= l2;
                    nArray[n6++] = 0;
                } else {
                    n4 = 0 - (l >= l3 ? 1 : 0);
                    l -= Inlines.CapToUInt32(l3 & (long)n4);
                    n3 = n2;
                    while ((l2 = CeltTables.CELT_PVQ_U_DATA[CELT_PVQ_U_ROW[--n2] + n]) > l) {
                    }
                    l -= l2;
                    s = (short)(n3 - n2 + n4 ^ n4);
                    nArray[n6++] = s;
                    n5 = Inlines.MAC16_16(n5, s, s);
                }
            }
            --n;
        }
        l2 = 2L * (long)n2 + 1L;
        n4 = 0 - (l >= l2 ? 1 : 0);
        n3 = n2;
        n2 = (int)((l -= Inlines.CapToUInt32(l2 & (long)n4)) + 1L >> 1);
        if (n2 != 0) {
            l -= 2L * (long)n2 - 1L;
        }
        s = (short)(n3 - n2 + n4 ^ n4);
        nArray[n6++] = s;
        n5 = Inlines.MAC16_16(n5, s, s);
        n4 = -((int)l);
        s = (short)(n2 + n4 ^ n4);
        nArray[n6] = s;
        n5 = Inlines.MAC16_16(n5, s, s);
        return n5;
    }
}

