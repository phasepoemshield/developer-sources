/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01674
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class01674;
import minecraft.class02362;

class class02369
implements class02362<ByteBuf, Long> {
    class02369() {
    }

    public Long decode(ByteBuf byteBuf) {
        return class01674.N((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, Long l) {
        class01674.N((ByteBuf)byteBuf, (long)l);
    }
}

