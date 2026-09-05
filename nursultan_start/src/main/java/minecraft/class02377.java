/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;

class class02377
implements class02362<ByteBuf, Double> {
    class02377() {
    }

    public Double decode(ByteBuf byteBuf) {
        return byteBuf.readDouble();
    }

    public void encode(ByteBuf byteBuf, Double d) {
        byteBuf.writeDouble(d.doubleValue());
    }
}

