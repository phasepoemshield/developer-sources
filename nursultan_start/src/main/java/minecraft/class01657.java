/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  net.fabricmc.fabric.mixin.attachment.VarIntAccessor
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import net.fabricmc.fabric.mixin.attachment.VarIntAccessor;

public class class01657
implements VarIntAccessor {
    public static final int N = 5;
    private static final int y = 127;
    private static final int L = 128;
    private static final int u = 7;

    public static int N(ByteBuf byteBuf) {
        byte by;
        int n = 0;
        int n2 = 0;
        do {
            by = byteBuf.readByte();
            n |= (by & 0x7F) << n2++ * 7;
            if (n2 <= 5) continue;
            throw new RuntimeException("VarInt too big");
        } while (class01657.N(by));
        return n;
    }

    public static ByteBuf N(ByteBuf byteBuf, int n) {
        while (true) {
            if ((n & 0xFFFFFF80) == 0) {
                byteBuf.writeByte(n);
                return byteBuf;
            }
            byteBuf.writeByte(n & 0x7F | 0x80);
            n >>>= 7;
        }
    }

    public static /* synthetic */ int N() {
        return N;
    }

    public static boolean N(byte by) {
        return (by & 0x80) == 128;
    }

    public static int N(int n) {
        for (int i = 1; i < 5; ++i) {
            if ((n & -1 << i * 7) != 0) continue;
            return i;
        }
        return 5;
    }
}

