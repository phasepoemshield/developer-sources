/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;

class class02373
implements class02362<ByteBuf, Integer> {
    class02373() {
    }

    public Integer decode(ByteBuf byteBuf) {
        return byteBuf.readInt();
    }

    public void encode(ByteBuf byteBuf, Integer n) {
        byteBuf.writeInt(n.intValue());
    }
}

