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

class class02397
implements class02362<ByteBuf, byte[]> {
    class02397() {
    }

    public byte[] decode(ByteBuf byteBuf) {
        return class00667.N((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, byte[] byArray) {
        class00667.N((ByteBuf)byteBuf, (byte[])byArray);
    }
}

