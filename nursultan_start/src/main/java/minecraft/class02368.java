/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;

class class02368
implements class02362<ByteBuf, Long> {
    class02368() {
    }

    public Long decode(ByteBuf byteBuf) {
        return byteBuf.readLong();
    }

    public void encode(ByteBuf byteBuf, Long l) {
        byteBuf.writeLong(l.longValue());
    }
}

