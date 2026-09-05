/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;

class class02375
implements class02362<ByteBuf, Integer> {
    class02375() {
    }

    public Integer decode(ByteBuf byteBuf) {
        return byteBuf.readUnsignedShort();
    }

    public void encode(ByteBuf byteBuf, Integer n) {
        byteBuf.writeShort(n.intValue());
    }
}

