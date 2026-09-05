/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.ByteToMessageDecoder
 *  io.netty.handler.codec.CorruptedFrameException
 *  minecraft.class01657
 *  minecraft.class03706
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;
import io.netty.handler.codec.CorruptedFrameException;
import java.util.List;
import minecraft.class01657;
import minecraft.class03706;
import org.jspecify.annotations.Nullable;

public class class00660
extends ByteToMessageDecoder {
    private static final int N = 3;
    private final ByteBuf y = Unpooled.directBuffer((int)3);
    private final @Nullable class03706 L;

    public class00660(@Nullable class03706 class037062) {
        this.L = class037062;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        byteBuf.markReaderIndex();
        this.y.clear();
        if (!class00660.N(byteBuf, this.y)) {
            byteBuf.resetReaderIndex();
            return;
        }
        int n = class01657.N((ByteBuf)this.y);
        if (n == 0) {
            throw new CorruptedFrameException("Frame length cannot be zero");
        }
        if (byteBuf.readableBytes() < n) {
            byteBuf.resetReaderIndex();
            return;
        }
        if (this.L != null) {
            this.L.N(n + class01657.N((int)n));
        }
        list.add(byteBuf.readBytes(n));
    }

    private static boolean N(ByteBuf byteBuf, ByteBuf byteBuf2) {
        for (int i = 0; i < 3; ++i) {
            if (!byteBuf.isReadable()) {
                return false;
            }
            byte by = byteBuf.readByte();
            byteBuf2.writeByte((int)by);
            if (class01657.N((byte)by)) continue;
            return true;
        }
        throw new CorruptedFrameException("length wider than 21-bit");
    }

    protected void handlerRemoved0(ChannelHandlerContext channelHandlerContext) {
        this.y.release();
    }
}

