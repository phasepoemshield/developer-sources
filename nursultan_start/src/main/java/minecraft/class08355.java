/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelOutboundHandlerAdapter
 *  io.netty.channel.ChannelPromise
 */
package minecraft;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelOutboundHandlerAdapter;
import io.netty.channel.ChannelPromise;
import minecraft.class08375;

public class class08355
extends ChannelOutboundHandlerAdapter {
    public void write(ChannelHandlerContext channelHandlerContext, Object object, ChannelPromise channelPromise) {
        channelHandlerContext.write(class08375.N(object), channelPromise);
    }
}

