/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;

class class02395
implements class02362<ByteBuf, Float> {
    class02395() {
    }

    public Float decode(ByteBuf byteBuf) {
        return Float.valueOf(byteBuf.readFloat());
    }

    public void encode(ByteBuf byteBuf, Float f) {
        byteBuf.writeFloat(f.floatValue());
    }
}

