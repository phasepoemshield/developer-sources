/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.ChannelPipeline
 *  io.netty.handler.codec.http.HttpObjectAggregator
 *  io.netty.handler.codec.http.HttpServerCodec
 *  io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler
 *  io.netty.handler.ssl.SslContext
 *  minecraft.class07393
 *  minecraft.class07394
 *  minecraft.class07424
 *  minecraft.class07911
 *  minecraft.class07932
 *  minecraft.class07934
 */
package Nursultan;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;
import io.netty.handler.ssl.SslContext;
import minecraft.class07393;
import minecraft.class07394;
import minecraft.class07424;
import minecraft.class07911;
import minecraft.class07932;
import minecraft.class07934;

public class class10859
extends ChannelInitializer<Channel> {
    final /* synthetic */ SslContext N;
    final /* synthetic */ class07393 y;
    final /* synthetic */ class07932 L;
    final /* synthetic */ class07911 u;

    public class10859(class07911 class079112, SslContext sslContext, class07393 class073932, class07932 class079322) {
        this.u = class079112;
        this.N = sslContext;
        this.y = class073932;
        this.L = class079322;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        ChannelPipeline channelPipeline = channel.pipeline();
        if (this.N != null) {
            channelPipeline.addLast(new ChannelHandler[]{this.N.newHandler(channel.alloc())});
        }
        channelPipeline.addLast(new ChannelHandler[]{new HttpServerCodec()}).addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)}).addLast(new ChannelHandler[]{this.u.N}).addLast(new ChannelHandler[]{new WebSocketServerProtocolHandler("/")}).addLast(new ChannelHandler[]{new class07424()}).addLast(new ChannelHandler[]{new class07394()}).addLast(new ChannelHandler[]{new class07934(channel, this.u, this.y, this.L)});
    }
}

