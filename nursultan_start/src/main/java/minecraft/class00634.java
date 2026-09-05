/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.DecoderException
 *  minecraft.class01657
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.DecoderException;
import java.nio.ByteBuffer;
import java.util.List;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import minecraft.class01657;

public class class00634
extends ByteToMessageDecoder {
    public static final int N = 0x200000;
    public static final int y = 0x800000;
    private final Inflater L;
    private int u;
    private boolean i;

    public class00634(int n, boolean bl) {
        this.u = n;
        this.i = bl;
        this.L = new Inflater();
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) throws Exception {
        int n = class01657.N((ByteBuf)byteBuf);
        if (n == 0) {
            list.add(byteBuf.readBytes(byteBuf.readableBytes()));
            return;
        }
        if (this.i) {
            if (n < this.u) {
                throw new DecoderException("Badly compressed packet - size of " + n + " is below server threshold of " + this.u);
            }
            if (n > 0x800000) {
                throw new DecoderException("Badly compressed packet - size of " + n + " is larger than protocol maximum of 8388608");
            }
        }
        this.N(byteBuf);
        ByteBuf byteBuf2 = this.N(channelHandlerContext, n);
        this.L.reset();
        list.add(byteBuf2);
    }

    private ByteBuf N(ChannelHandlerContext channelHandlerContext, int n) throws DataFormatException {
        ByteBuf byteBuf = channelHandlerContext.alloc().directBuffer(n);
        try {
            ByteBuffer byteBuffer = byteBuf.internalNioBuffer(0, n);
            int n2 = byteBuffer.position();
            this.L.inflate(byteBuffer);
            int n3 = byteBuffer.position() - n2;
            if (n3 != n) {
                throw new DecoderException("Badly compressed packet - actual length of uncompressed payload " + n3 + " is does not match declared size " + n);
            }
            byteBuf.writerIndex(byteBuf.writerIndex() + n3);
            return byteBuf;
        }
        catch (Exception exception) {
            byteBuf.release();
            throw exception;
        }
    }

    public void N(int n, boolean bl) {
        this.u = n;
        this.i = bl;
    }

    private void N(ByteBuf byteBuf) {
        ByteBuffer byteBuffer;
        if (byteBuf.nioBufferCount() > 0) {
            byteBuffer = byteBuf.nioBuffer();
            byteBuf.skipBytes(byteBuf.readableBytes());
        } else {
            byteBuffer = ByteBuffer.allocateDirect(byteBuf.readableBytes());
            byteBuf.readBytes(byteBuffer);
            byteBuffer.flip();
        }
        this.L.setInput(byteBuffer);
    }
}

