/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 *  minecraft.class02362
 *  minecraft.class07209
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class00667;
import minecraft.class02362;
import minecraft.class07209;

class class07226
implements class02362<ByteBuf, class07209> {
    class07226() {
    }

    public class07209 decode(ByteBuf byteBuf) {
        return class00667.L((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, class07209 class072092) {
        class00667.N((ByteBuf)byteBuf, (class07209)class072092);
    }
}

