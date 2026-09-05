/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00744
 *  minecraft.class02362
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00744;
import minecraft.class02362;

class class00722
implements class02362<ByteBuf, class00744> {
    class00722() {
    }

    public class00744 decode(ByteBuf byteBuf) {
        return new class00744(byteBuf.readFloat(), byteBuf.readFloat(), byteBuf.readFloat());
    }

    public void encode(ByteBuf byteBuf, class00744 class007442) {
        byteBuf.writeFloat(class007442.N());
        byteBuf.writeFloat(class007442.y());
        byteBuf.writeFloat(class007442.L());
    }
}

