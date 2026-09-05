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

class class02364
implements class02362<ByteBuf, Integer> {
    class02364() {
    }

    public Integer decode(ByteBuf byteBuf) {
        return class00667.z((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, Integer n) {
        class00667.y((ByteBuf)byteBuf, (int)n);
    }
}

