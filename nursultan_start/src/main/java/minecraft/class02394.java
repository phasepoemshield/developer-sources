/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;

class class02394
implements class02362<ByteBuf, Short> {
    class02394() {
    }

    public Short decode(ByteBuf byteBuf) {
        return byteBuf.readShort();
    }

    public void encode(ByteBuf byteBuf, Short s) {
        byteBuf.writeShort((int)s.shortValue());
    }
}

