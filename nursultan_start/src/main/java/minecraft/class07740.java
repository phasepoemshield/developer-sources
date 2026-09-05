/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import javax.crypto.Cipher;
import javax.crypto.ShortBufferException;

public class class07740 {
    private final Cipher N;
    private byte[] y = new byte[0];
    private byte[] L = new byte[0];

    protected class07740(Cipher cipher) {
        this.N = cipher;
    }

    protected void N(ByteBuf byteBuf, ByteBuf byteBuf2) throws ShortBufferException {
        int n = byteBuf.readableBytes();
        byte[] byArray = this.N(byteBuf);
        int n2 = this.N.getOutputSize(n);
        if (this.L.length < n2) {
            this.L = new byte[n2];
        }
        byteBuf2.writeBytes(this.L, 0, this.N.update(byArray, 0, n, this.L));
    }

    protected ByteBuf N(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) throws ShortBufferException {
        int n = byteBuf.readableBytes();
        byte[] byArray = this.N(byteBuf);
        ByteBuf byteBuf2 = channelHandlerContext.alloc().heapBuffer(this.N.getOutputSize(n));
        byteBuf2.writerIndex(this.N.update(byArray, 0, n, byteBuf2.array(), byteBuf2.arrayOffset()));
        return byteBuf2;
    }

    private byte[] N(ByteBuf byteBuf) {
        int n = byteBuf.readableBytes();
        if (this.y.length < n) {
            this.y = new byte[n];
        }
        byteBuf.readBytes(this.y, 0, n);
        return this.y;
    }
}

