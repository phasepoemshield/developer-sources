/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.concentus.BoxedValueInt
 *  de.maxhenkel.voicechat.concentus.EntropyCoder
 *  de.maxhenkel.voicechat.concentus.Inlines
 */
package de.maxhenkel.voicechat.concentus;

import de.maxhenkel.voicechat.concentus.BoxedValueInt;
import de.maxhenkel.voicechat.concentus.EntropyCoder;
import de.maxhenkel.voicechat.concentus.Inlines;

class Laplace {
    private static final int LAPLACE_LOG_MINP = 0;
    private static final long LAPLACE_MINP = 1L;
    private static final int LAPLACE_NMIN = 16;

    Laplace() {
    }

    static long ec_laplace_get_freq1(long l, int n) {
        long l2 = Inlines.CapToUInt32((long)(32736L - l));
        return Inlines.CapToUInt32((long)(l2 * (long)(16384 - n))) >> 15;
    }

    static void ec_laplace_encode(EntropyCoder entropyCoder, BoxedValueInt boxedValueInt, long l, int n) {
        int n2 = boxedValueInt.Val;
        long l2 = 0L;
        if (n2 != 0) {
            int n3;
            int n4 = 0 - (n2 < 0 ? 1 : 0);
            n2 = n2 + n4 ^ n4;
            l2 = l;
            l = Laplace.ec_laplace_get_freq1(l, n);
            for (n3 = 1; l > 0L && n3 < n2; ++n3) {
                l2 = Inlines.CapToUInt32((long)(l2 + (l *= 2L) + 2L));
                l = Inlines.CapToUInt32((long)(l * (long)n >> 15));
            }
            if (l == 0L) {
                int n5 = (int)(32768L - l2 + 1L - 1L) >> 0;
                n5 = n5 - n4 >> 1;
                int n6 = Inlines.IMIN((int)(n2 - n3), (int)(n5 - 1));
                l2 = Inlines.CapToUInt32((long)(l2 + (long)(2 * n6 + 1 + n4) * 1L));
                l = Inlines.IMIN((long)1L, (long)(32768L - l2));
                boxedValueInt.Val = n3 + n6 + n4 ^ n4;
            } else {
                l2 += Inlines.CapToUInt32((long)(++l & (long)(~n4)));
            }
            Inlines.OpusAssert((l2 + l <= 32768L ? 1 : 0) != 0);
            Inlines.OpusAssert((l > 0L ? 1 : 0) != 0);
        }
        entropyCoder.encode_bin(l2, l2 + l, 15);
    }

    static int ec_laplace_decode(EntropyCoder entropyCoder, long l, int n) {
        int n2 = 0;
        long l2 = entropyCoder.decode_bin(15);
        long l3 = 0L;
        if (l2 >= l) {
            ++n2;
            l3 = l;
            l = Laplace.ec_laplace_get_freq1(l, n) + 1L;
            while (l > 1L && l2 >= l3 + 2L * l) {
                l3 = Inlines.CapToUInt32((long)(l3 + (l *= 2L)));
                l = Inlines.CapToUInt32((long)((l - 2L) * (long)n >> 15));
                ++l;
                ++n2;
            }
            if (l <= 1L) {
                int n3 = (int)(l2 - l3) >> 1;
                n2 += n3;
                l3 = Inlines.CapToUInt32((long)(l3 + Inlines.CapToUInt32((long)((long)(2 * n3) * 1L))));
            }
            if (l2 < l3 + l) {
                n2 = -n2;
            } else {
                l3 = Inlines.CapToUInt32((long)(l3 + l));
            }
        }
        Inlines.OpusAssert((l3 < 32768L ? 1 : 0) != 0);
        Inlines.OpusAssert((l > 0L ? 1 : 0) != 0);
        Inlines.OpusAssert((l3 <= l2 ? 1 : 0) != 0);
        Inlines.OpusAssert((l2 < Inlines.IMIN((long)(l3 + l), (long)32768L) ? 1 : 0) != 0);
        entropyCoder.dec_update(l3, Inlines.IMIN((long)(l3 + l), (long)32768L), 32768L);
        return n2;
    }
}

