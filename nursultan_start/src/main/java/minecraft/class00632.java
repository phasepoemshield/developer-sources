/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandler$Sharable
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.EncoderException
 *  io.netty.handler.codec.MessageToByteEncoder
 *  minecraft.class01657
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToByteEncoder;
import minecraft.class01657;

@ChannelHandler.Sharable
public class class00632
extends MessageToByteEncoder<ByteBuf> {
    public static final int N = 3;

    protected void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, ByteBuf byteBuf2) {
        int n = byteBuf.readableBytes();
        int n2 = class01657.N((int)n);
        if (n2 > 3) {
            throw new EncoderException("Packet too large: size " + n + " is over 8");
        }
        byteBuf2.ensureWritable(n2 + n);
        class01657.N((ByteBuf)byteBuf2, (int)n);
        byteBuf2.writeBytes(byteBuf, byteBuf.readerIndex(), n);
    }
}

