/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandlerAdapter
 *  io.netty.channel.ChannelInitializer
 *  io.netty.handler.proxy.ProxyConnectionEvent
 *  io.netty.handler.proxy.Socks4ProxyHandler
 *  io.netty.handler.proxy.Socks5ProxyHandler
 *  minecraft.class06541
 */
package ru.fiw.proxyserver;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.ChannelInitializer;
import io.netty.handler.proxy.ProxyConnectionEvent;
import io.netty.handler.proxy.Socks4ProxyHandler;
import io.netty.handler.proxy.Socks5ProxyHandler;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import minecraft.class06541;
import ru.fiw.proxyserver.Proxy;
import ru.fiw.proxyserver.TestPing;

class TestPing$1
extends ChannelInitializer<Channel> {
    final /* synthetic */ Proxy val$proxy;
    final /* synthetic */ InetSocketAddress val$proxyAddr;
    final /* synthetic */ TestPing this$0;

    TestPing$1(TestPing testPing, Proxy proxy, InetSocketAddress inetSocketAddress) {
        this.this$0 = testPing;
        this.val$proxy = proxy;
        this.val$proxyAddr = inetSocketAddress;
    }

    protected void initChannel(Channel channel) {
        if (this.val$proxy.type == Proxy.ProxyType.SOCKS5) {
            channel.pipeline().addLast(new ChannelHandler[]{new Socks5ProxyHandler((SocketAddress)this.val$proxyAddr, this.val$proxy.username, this.val$proxy.password)});
        } else {
            channel.pipeline().addLast(new ChannelHandler[]{new Socks4ProxyHandler((SocketAddress)this.val$proxyAddr, this.val$proxy.username)});
        }
        channel.pipeline().addLast(new ChannelHandler[]{new ChannelInboundHandlerAdapter(){

            public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
                TestPing$1.this.this$0.state = String.valueOf(class06541.field_1061) + "Failed: " + throwable.getMessage();
                channelHandlerContext.close();
            }

            public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) {
                if (object instanceof ProxyConnectionEvent) {
                    TestPing$1.this.this$0.state = String.valueOf(class06541.field_1060) + "Success!";
                    channelHandlerContext.close();
                }
            }
        }});
    }
}

