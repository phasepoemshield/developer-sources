/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01657
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class01657;
import minecraft.class02362;

class class02388
implements class02362<ByteBuf, Integer> {
    class02388() {
    }

    public Integer decode(ByteBuf byteBuf) {
        return class01657.N((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, Integer n) {
        class01657.N((ByteBuf)byteBuf, (int)n);
    }
}

