/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.gson.JsonElement
 *  com.google.gson.JsonParser
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  io.netty.handler.codec.http.websocketx.TextWebSocketFrame
 */
package minecraft;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageDecoder;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import java.util.List;

public class class07424
extends MessageToMessageDecoder<TextWebSocketFrame> {
    protected void decode(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame textWebSocketFrame, List<Object> list) {
        JsonElement jsonElement = JsonParser.parseString((String)textWebSocketFrame.text());
        list.add(jsonElement);
    }
}

