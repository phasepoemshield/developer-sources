/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.handler.codec.EncoderException
 *  minecraft.class00667
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.EncoderException;
import minecraft.class00667;
import minecraft.class02362;

class class02382
implements class02362<ByteBuf, byte[]> {
    final /* synthetic */ int N;

    class02382(int n) {
        this.N = n;
    }

    public byte[] decode(ByteBuf byteBuf) {
        return class00667.N((ByteBuf)byteBuf, (int)this.N);
    }

    public void encode(ByteBuf byteBuf, byte[] byArray) {
        if (byArray.length > this.N) {
            throw new EncoderException("ByteArray with size " + byArray.length + " is bigger than allowed " + this.N);
        }
        class00667.N((ByteBuf)byteBuf, (byte[])byArray);
    }
}

