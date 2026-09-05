/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class02362;

class class02376
implements class02362<ByteBuf, Boolean> {
    class02376() {
    }

    public Boolean decode(ByteBuf byteBuf) {
        return byteBuf.readBoolean();
    }

    public void encode(ByteBuf byteBuf, Boolean bl) {
        byteBuf.writeBoolean(bl.booleanValue());
    }
}

