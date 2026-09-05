/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class02566
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;
import minecraft.class02566;

class class02386
implements class02362<ByteBuf, Integer> {
    class02386() {
    }

    public Integer decode(ByteBuf byteBuf) {
        return class02566.N((int)(byteBuf.readByte() & 0xFF), (int)(byteBuf.readByte() & 0xFF), (int)(byteBuf.readByte() & 0xFF));
    }

    public void encode(ByteBuf byteBuf, Integer n) {
        byteBuf.writeByte(class02566.L((int)n));
        byteBuf.writeByte(class02566.u((int)n));
        byteBuf.writeByte(class02566.i((int)n));
    }
}

