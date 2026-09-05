/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;

public class class01674 {
    private static final int N = 10;
    private static final int y = 127;
    private static final int L = 128;
    private static final int u = 7;

    public static ByteBuf N(ByteBuf byteBuf, long l) {
        while (true) {
            if ((l & 0xFFFFFFFFFFFFFF80L) == 0L) {
                byteBuf.writeByte((int)l);
                return byteBuf;
            }
            byteBuf.writeByte((int)(l & 0x7FL) | 0x80);
            l >>>= 7;
        }
    }

    public static long N(ByteBuf byteBuf) {
        byte by;
        long l = 0L;
        int n = 0;
        do {
            by = byteBuf.readByte();
            l |= (long)(by & 0x7F) << n++ * 7;
            if (n <= 10) continue;
            throw new RuntimeException("VarLong too big");
        } while (class01674.N(by));
        return l;
    }

    public static boolean N(byte by) {
        return (by & 0x80) == 128;
    }

    public static int N(long l) {
        for (int i = 1; i < 10; ++i) {
            if ((l & -1L << i * 7) != 0L) continue;
            return i;
        }
        return 10;
    }
}

