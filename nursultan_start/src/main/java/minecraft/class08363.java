/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 */
package minecraft;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import minecraft.class08375;

public class class08363
extends ChannelInboundHandlerAdapter {
    public void channelRead(ChannelHandlerContext channelHandlerContext, Object object) {
        channelHandlerContext.fireChannelRead(class08375.y(object));
    }
}

