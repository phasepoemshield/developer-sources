/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.ViaChannelHandler
 *  com.viaversion.viaversion.exception.CancelCodecException
 *  com.viaversion.viaversion.exception.CancelDecoderException
 *  com.viaversion.viaversion.util.ByteBufUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufAllocator
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 */
package com.viaversion.viaversion.platform;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.ViaChannelHandler;
import com.viaversion.viaversion.exception.CancelCodecException;
import com.viaversion.viaversion.exception.CancelDecoderException;
import com.viaversion.viaversion.util.ByteBufUtil;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;

@ChannelHandler.Sharable
public class ViaDecodeHandler
extends MessageToMessageDecoder<ByteBuf>
implements ViaChannelHandler {
    public static final String NAME = "via-decoder";
    protected final UserConnection connection;

    public UserConnection connection() {
        return this.connection;
    }

    public ViaDecodeHandler(UserConnection connection) {
        this.connection = connection;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    protected void decode(ChannelHandlerContext ctx, ByteBuf buf, List<Object> out) throws Exception {
        if (!this.connection.checkIncomingPacket(buf.readableBytes())) {
            throw CancelDecoderException.generate(null);
        }
        if (!this.connection.shouldTransformPacket()) {
            out.add(buf.retain());
            return;
        }
        ByteBuf transformedBuf = ByteBufUtil.copy((ByteBufAllocator)ctx.alloc(), (ByteBuf)buf);
        try {
            this.connection.transformIncoming(transformedBuf, CancelDecoderException::generate);
            out.add(transformedBuf.retain());
        }
        finally {
            transformedBuf.release();
        }
    }

    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        if (!(cause instanceof CancelCodecException)) {
            super.exceptionCaught(ctx, cause);
        }
    }

    public boolean isSharable() {
        return true;
    }
}

