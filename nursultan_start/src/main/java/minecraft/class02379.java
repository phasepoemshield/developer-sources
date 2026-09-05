/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class01663
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import minecraft.class01663;
import minecraft.class02362;

class class02379
implements class02362<ByteBuf, String> {
    final /* synthetic */ int N;

    class02379(int n) {
        this.N = n;
    }

    public String decode(ByteBuf byteBuf) {
        return class01663.N((ByteBuf)byteBuf, (int)this.N);
    }

    public void encode(ByteBuf byteBuf, String string) {
        class01663.N((ByteBuf)byteBuf, (CharSequence)string, (int)this.N);
    }
}

