/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11331
 *  Nursultan.class11657
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.handler.codec.http.HttpClientCodec
 *  io.netty.handler.codec.http.HttpObjectAggregator
 *  io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler
 *  io.netty.handler.codec.http.websocketx.WebSocketVersion
 */
package Nursultan;

import Nursultan.class11331;
import Nursultan.class11657;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import java.net.URI;

public class class09230
extends ChannelInitializer<Channel> {
    public Object N_0;
    public Object N_1;

    public class09230(class11331 class113312, URI uRI) {
        this.u();
        this.N_1 = class113312;
        this.N_0 = uRI;
    }

    private void u() {
    }

    public void initChannel(Channel channel) {
        ChannelPipeline channelPipeline = channel.pipeline();
        channelPipeline.addLast(new ChannelHandler[]{new HttpClientCodec()});
        channelPipeline.addLast(new ChannelHandler[]{new HttpObjectAggregator(65536)});
        channelPipeline.addLast(new ChannelHandler[]{new WebSocketClientProtocolHandler((URI)this.N_0, WebSocketVersion.V13, null, false, null, 65536)});
        channelPipeline.addLast(new ChannelHandler[]{new class11657((class11331)this.N_1)});
    }
}

