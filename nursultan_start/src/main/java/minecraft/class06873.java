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
import minecraft.class06889;

class class06873
implements class02362<ByteBuf, class06889> {
    class06873() {
    }

    public class06889 decode(ByteBuf byteBuf) {
        return class00667.M((ByteBuf)byteBuf);
    }

    public void encode(ByteBuf byteBuf, class06889 class068892) {
        class00667.N((ByteBuf)byteBuf, (class06889)class068892);
    }
}

