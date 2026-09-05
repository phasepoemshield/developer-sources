/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.CorruptedFrameException
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame
 *  io.netty.handler.codec.http.websocketx.WebSocketFrame
 */
package Nursultan;

import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.CorruptedFrameException;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.BinaryWebSocketFrame;
import io.netty.handler.codec.http.websocketx.WebSocketFrame;
import java.util.List;

public class class10868
extends MessageToMessageDecoder<WebSocketFrame> {
    public void decode(ChannelHandlerContext channelHandlerContext, WebSocketFrame webSocketFrame, List<Object> list) {
        if (webSocketFrame instanceof BinaryWebSocketFrame) {
            BinaryWebSocketFrame binaryWebSocketFrame = (BinaryWebSocketFrame)webSocketFrame;
            list.add(binaryWebSocketFrame.content().retain());
            return;
        }
        throw new CorruptedFrameException("Only binary websocket frames are supported");
    }
}

