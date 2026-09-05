/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11303
 *  Nursultan.class11331
 *  Nursultan.class11363
 *  Nursultan.class11921
 *  Nursultan.class11938
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.handler.codec.http.websocketx.TextWebSocketFrame
 *  minecraft.class06202
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package Nursultan;

import Nursultan.class11303;
import Nursultan.class11331;
import Nursultan.class11363;
import Nursultan.class11921;
import Nursultan.class11938;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.handler.codec.http.websocketx.TextWebSocketFrame;
import minecraft.class06202;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class11657
extends SimpleChannelInboundHandler<TextWebSocketFrame> {
    private static String[] R;
    public static Object N_0;
    public Object y_0;

    private static void L() {
    }

    public class11657(class11331 class113312) {
        this.y();
        this.y_0 = class113312;
    }

    static {
        class11657.L();
        class11657.i();
        class11657.u();
        N_0 = LogManager.getLogger(String.class);
    }

    private static void i() {
        R = new String[2];
        class11657.R[0] = "auto-buy-s2c-connected";
        class11657.R[1] = "auto-buy-s2c-disconnected";
    }

    private static void u() {
    }

    private void y() {
    }

    public void channelRead0(ChannelHandlerContext channelHandlerContext, TextWebSocketFrame textWebSocketFrame) {
        String string = textWebSocketFrame.text();
        class06202.Nq().execute(() -> class11938.L().L((Object)new class11363(string)));
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        ((class11331)this.y_0).N().set(false);
        ((Logger)N_0).error((Object)throwable, throwable);
        channelHandlerContext.close();
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) {
        ((class11331)this.y_0).N().set(true);
        class11303.y((Object)class11921.N((String)R[0], (Object[])new Object[]{channelHandlerContext.channel().remoteAddress()}));
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        ((class11331)this.y_0).N().set(false);
        class11303.y((Object)class11921.N((String)R[1], (Object[])new Object[]{channelHandlerContext.channel().remoteAddress()}));
    }
}

