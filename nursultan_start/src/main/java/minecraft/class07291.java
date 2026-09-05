/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class02362
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class07321;

class class07291
implements class02362<ByteBuf, class07321> {
    class07291() {
    }

    public class07321 decode(ByteBuf byteBuf) {
        return class00667.u((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, class07321 class073212) {
        class00667.N((ByteBuf)byteBuf, (class07321)class073212);
    }
}

