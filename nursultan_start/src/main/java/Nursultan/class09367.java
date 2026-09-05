/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageEncoder
 *  io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
 */
package Nursultan;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageEncoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import java.util.List;

public class class09367
extends MessageToMessageEncoder<ByteBuf> {
    public void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        list.add(new BinaryWebSocketFrame(byteBuf.retain()));
    }
}

