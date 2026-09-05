/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09367
 *  Nursultan.class09370
 *  Nursultan.class10737
 *  Nursultan.class10868
 *  Nursultan.class11410
 *  Nursultan.class11436
 *  Nursultan.class11964
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  io.netty.handler.codec.http.DefaultHttpHeaders
 *  io.netty.handler.codec.http.HttpClientCodec
 *  io.netty.handler.codec.http.HttpHeaders
 *  io.netty.handler.codec.http.HttpObjectAggregator
 *  io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler
 *  io.netty.handler.codec.http.websocketx.WebSocketFrameAggregator
 *  io.netty.handler.codec.http.websocketx.WebSocketVersion
 */
package Nursultan;

import Nursultan.class09367;
import Nursultan.class09370;
import Nursultan.class10737;
import Nursultan.class10868;
import Nursultan.class11410;
import Nursultan.class11436;
import Nursultan.class11842;
import Nursultan.class11964;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.http.DefaultHttpHeaders;
import io.netty.handler.codec.http.HttpClientCodec;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpObjectAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketClientProtocolHandler;
import io.netty.handler.codec.http.websocketx.WebSocketFrameAggregator;
import io.netty.handler.codec.http.websocketx.WebSocketVersion;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class class11831
extends ChannelInitializer<Channel> {
    public static Object N_0;
    public static Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;

    private void M() {
    }

    public class11831(class11436 class114362, class11842 class118422, Supplier<class11410> supplier, Consumer<class11410> consumer, Runnable runnable) {
        this.M();
        this.y_0 = class114362;
        this.y_1 = class118422;
        this.y_2 = supplier;
        this.y_3 = consumer;
        this.y_4 = runnable;
    }

    static {
        class11831.N();
    }

    private static void N() {
        N_0 = 0x400000;
        N_1 = 65536;
    }

    public void initChannel(Channel channel) {
        class11410 class114102 = (class11410)((Supplier)this.y_2).get();
        ((Consumer)this.y_3).accept(class114102);
        ChannelPipeline channelPipeline = channel.pipeline();
        if (((class11436)this.y_0).i() && !((class11842)this.y_1).N(channelPipeline, channel, (class11436)this.y_0)) {
            ((Runnable)this.y_4).run();
            return;
        }
        channelPipeline.addLast("http_codec", (ChannelHandler)new HttpClientCodec()).addLast("http_aggregator", (ChannelHandler)new HttpObjectAggregator(65536)).addLast("ws_protocol", (ChannelHandler)new WebSocketClientProtocolHandler(((class11436)this.y_0).L(), WebSocketVersion.V13, null, false, (HttpHeaders)new DefaultHttpHeaders(), 0x400000)).addLast("ws_frame_aggregator", (ChannelHandler)new WebSocketFrameAggregator(0x400000)).addLast("ws_frame_to_buf", (ChannelHandler)new class10868()).addLast("decoder", (ChannelHandler)new class09370(class11964.SERVER_TO_CLIENT)).addLast("ws_buf_to_frame", (ChannelHandler)new class09367()).addLast("encoder", (ChannelHandler)new class10737(class11964.CLIENT_TO_SERVER)).addLast("packet_handler", (ChannelHandler)class114102);
        class114102.y(channel);
    }
}

