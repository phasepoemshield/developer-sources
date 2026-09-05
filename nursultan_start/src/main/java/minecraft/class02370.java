/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00667;
import minecraft.class02362;

class class02370
implements class02362<ByteBuf, long[]> {
    class02370() {
    }

    public long[] decode(ByteBuf byteBuf) {
        return class00667.y((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, long[] lArray) {
        class00667.N((ByteBuf)byteBuf, (long[])lArray);
    }
}

