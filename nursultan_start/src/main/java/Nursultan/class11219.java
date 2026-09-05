/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11303
 *  Nursultan.class11402
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.group.ChannelGroup
 *  io.netty.handler.codec.http.websocketx.TextWebSocketFrame
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11303;
import Nursultan.class11402;
import Nursultan.class11921;
import Nursultan.class11938;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11219
extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    private static String[] u;
    public Object N_0;
    public static Object y_0;

    private static void L() {
        u = new String[2];
        class11219.u[0] = "auto-buy-c2s-connected";
        class11219.u[1] = "auto-buy-c2s-disconnected";
    }

    public class11219(ChannelGroup channelGroup) {
        this.N();
        this.N_0 = channelGroup;
    }

    static {
        class11219.L();
        class11219.u();
        y_0 = LogManager.getLogger(String.class);
    }

    private static void u() {
    }

    public void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame textWebSocketFrame) {
        String string = textWebSocketFrame.text();
        class06202.Nq().execute(() -> class11938.L().L((Object)new class11402(string)));
    }

    private void N() {
    }

    public void handlerRemoved(ChannelHandlerContext channelHandlerContext) {
        Channel channel = channelHandlerContext.channel();
        ((ChannelGroup)this.N_0).remove((Object)channel);
        class11303.y((Object)class11921.N((String)u[1], (Object[])new Object[]{channel.remoteAddress()}));
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        ((Logger)y_0).error((Object)throwable, throwable);
        channelHandlerContext.close();
    }

    public void handlerAdded(ChannelHandlerContext channelHandlerContext) {
        Channel channel = channelHandlerContext.channel();
        ((ChannelGroup)this.N_0).add((Object)channel);
        class11303.y((Object)class11921.N((String)u[0], (Object[])new Object[]{channel.remoteAddress()}));
    }
}

