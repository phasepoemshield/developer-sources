/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;

class class02383
implements class02362<ByteBuf, Byte> {
    class02383() {
    }

    public Byte decode(ByteBuf byteBuf) {
        return byteBuf.readByte();
    }

    public void encode(ByteBuf byteBuf, Byte by) {
        byteBuf.writeByte((int)by.byteValue());
    }
}

