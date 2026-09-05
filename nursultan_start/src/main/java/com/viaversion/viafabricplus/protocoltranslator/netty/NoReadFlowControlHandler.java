/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.flow.FlowControlHandler
 */
package com.viaversion.viafabricplus.protocoltranslator.netty;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.flow.FlowControlHandler;

public final class NoReadFlowControlHandler
extends FlowControlHandler {
    public void read(ChannelHandlerContext channelHandlerContext) throws Exception {
        if (channelHandlerContext.channel().config().isAutoRead()) {
            super.read(channelHandlerContext);
        }
    }
}

