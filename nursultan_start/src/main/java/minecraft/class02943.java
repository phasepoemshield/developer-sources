/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  minecraft.class03706
 *  minecraft.class08375
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import minecraft.class03706;
import minecraft.class08375;

public class class02943
extends ChannelInboundHandlerAdapter {
    private final class03706 N;

    public class02943(class03706 class037062) {
        this.N = class037062;
    }

    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        if ((object = class08375.y((Object)object)) instanceof ByteBuf) {
            ByteBuf byteBuf = (ByteBuf)object;
            this.N.N(byteBuf.readableBytes());
        }
        channelHandlerContext.fireChannelRead(object);
    }
}

