/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01657
 *  minecraft.class04995
 *  minecraft.class06889
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class01657;
import minecraft.class04995;
import minecraft.class06889;

public class class00928 {
    private static final int L = 15;
    private static final int u = Short.MAX_VALUE;
    private static final double i = 32766.0;
    private static final int R = 2;
    private static final int M = 3;
    private static final int B = 4;
    private static final int Z = 3;
    private static final int z = 18;
    private static final int U = 33;
    public static final double N = 1.7179869183E10;
    public static final double y = 3.051944088384301E-5;

    private static long y(double d) {
        return Math.round((d * 0.5 + 0.5) * 32766.0);
    }

    private static double N(long l) {
        return Math.min((double)(l & 0x7FFFL), 32766.0) * 2.0 / 32766.0 - 1.0;
    }

    private static double N(double d) {
        return Double.isNaN(d) ? 0.0 : Math.clamp((double)d, (double)-1.7179869183E10, (double)1.7179869183E10);
    }

    public static void N(ByteBuf byteBuf, class06889 class068892) {
        double d;
        double d2;
        double d3 = class00928.N(class068892.M);
        double d4 = class04995.N((double)d3, (double)class04995.N((double)(d2 = class00928.N(class068892.B)), (double)(d = class00928.N(class068892.Z))));
        if (d4 < 3.051944088384301E-5) {
            byteBuf.writeByte(0);
            return;
        }
        long l = class04995.u((double)d4);
        boolean bl = (l & 3L) != l;
        long l2 = bl ? l & 3L | 4L : l;
        long l3 = class00928.y(d3 / (double)l) << 3;
        long l4 = class00928.y(d2 / (double)l) << 18;
        long l5 = class00928.y(d / (double)l) << 33;
        long l6 = l2 | l3 | l4 | l5;
        byteBuf.writeByte((int)((byte)l6));
        byteBuf.writeByte((int)((byte)(l6 >> 8)));
        byteBuf.writeInt((int)(l6 >> 16));
        if (bl) {
            class01657.N((ByteBuf)byteBuf, (int)((int)(l >> 2)));
        }
    }

    public static class06889 N(ByteBuf byteBuf) {
        short s = byteBuf.readUnsignedByte();
        if (s == 0) {
            return class06889.L;
        }
        short s2 = byteBuf.readUnsignedByte();
        long l = byteBuf.readUnsignedInt() << 16 | (long)(s2 << 8) | (long)s;
        long l2 = s & 3;
        if (class00928.N(s)) {
            l2 |= ((long)class01657.N((ByteBuf)byteBuf) & 0xFFFFFFFFL) << 2;
        }
        return new class06889(class00928.N(l >> 3) * (double)l2, class00928.N(l >> 18) * (double)l2, class00928.N(l >> 33) * (double)l2);
    }

    public static boolean N(int n) {
        return (n & 4) == 4;
    }
}

