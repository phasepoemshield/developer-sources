/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToByteEncoder
 *  minecraft.class01657
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;
import java.util.zip.Deflater;
import minecraft.class01657;

public class class00671
extends MessageToByteEncoder<ByteBuf> {
    private final byte[] N = new byte[8192];
    private final Deflater y;
    private int L;

    public class00671(int n) {
        this.L = n;
        this.y = new Deflater();
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n = byteBuf.readableBytes();
        if (n > 0x800000) {
            throw new IllegalArgumentException("Packet too big (is " + n + ", should be less than 8388608)");
        }
        if (n < this.L) {
            class01657.N((ByteBuf)byteBuf2, (int)0);
            byteBuf2.writeBytes(byteBuf);
        } else {
            byte[] byArray = new byte[n];
            byteBuf.readBytes(byArray);
            class01657.N((ByteBuf)byteBuf2, (int)byArray.length);
            this.y.setInput(byArray, 0, n);
            this.y.finish();
            while (!this.y.finished()) {
                int n2 = this.y.deflate(this.N);
                byteBuf2.writeBytes(this.N, 0, n2);
            }
            this.y.reset();
        }
    }

    public void N(int n) {
        this.L = n;
    }

    public int N() {
        return this.L;
    }
}

