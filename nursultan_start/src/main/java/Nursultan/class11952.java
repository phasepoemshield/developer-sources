/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package Nursultan;

import io.netty.buffer.ByteBuf;

public class class11952 {
    public static Object N_0;
    public static Object N_1;
    public static Object N_2;
    public static Object N_3;

    private class11952() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class11952.i();
    }

    private static void i() {
        N_0 = 5;
        N_1 = 127;
        N_2 = 128;
        N_3 = 7;
    }

    public static int N(ByteBuf byteBuf) {
        byte by;
        int n = 0;
        int n2 = 0;
        do {
            by = byteBuf.readByte();
            n |= (by & 0x7F) << n2 * 7;
            if (++n2 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while (class11952.N(by));
        return n;
    }

    public static boolean N(byte by) {
        return (by & 0x80) == 128;
    }

    public static ByteBuf N(ByteBuf byteBuf, int n) {
        while ((n & 0xFFFFFF80) != 0) {
            byteBuf.writeByte(n & 0x7F | 0x80);
            n >>>= 7;
        }
        byteBuf.writeByte(n);
        return byteBuf;
    }
}

