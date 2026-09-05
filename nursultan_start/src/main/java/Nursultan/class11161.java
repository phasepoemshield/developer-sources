/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.group.ChannelGroup
 *  io.netty.handler.codec.http.HttpObjectAggregator
 *  io.netty.handler.codec.http.HttpServerCodec
 *  io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler
 */
package Nursultan;

import Nursultan.class11219;
import Nursultan.class11275;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.group.ChannelGroup;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.HttpServerCodec;
import io.netty.handler.codec.http.websocketx.WebSocketServerProtocolHandler;

public class class11161
extends ChannelInitializer<Channel> {
    private static String[] R;
    public Object N_0;

    private static void L() {
        R = new String[1];
        class11161.R[0] = "/autobuy";
    }

    public class11161(class11275 class112752) {
        this.y();
        this.N_0 = class112752;
    }

    static {
        class11161.L();
    }

    private void y() {
    }

    public void initChannel(Channel channel) {
        ChannelPipeline channelPipeline = channel.pipeline();
        channelPipeline.addLast(new ChannelHandler[]{new HttpServerCodec()});
        channelPipeline.addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)});
        channelPipeline.addLast(new ChannelHandler[]{new WebSocketServerProtocolHandler(R[0], null, true)});
        channelPipeline.addLast(new ChannelHandler[]{new class11219((ChannelGroup)((class11275)this.N_0).N_0)});
    }
}

