/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelException
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelOption
 *  minecraft.class00392
 *  minecraft.class01849
 *  minecraft.class03420
 *  minecraft.class04584
 *  minecraft.class07837
 */
package minecraft;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import java.util.List;
import minecraft.class00392;
import minecraft.class01849;
import minecraft.class03420;
import minecraft.class04568;
import minecraft.class04579;
import minecraft.class04584;
import minecraft.class07837;

class class04577
extends ChannelInitializer<Channel> {
    final /* synthetic */ class03420 N;
    final /* synthetic */ class04568 y;

    class04577(class04584 class045842, class03420 class034202, class04568 class045682) {
        this.N = class034202;
        this.y = class045682;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        channel.pipeline().addLast(new ChannelHandler[]{new class01849(this.N, (n, string, string2, n2, n3) -> {
            this.y.N(class04579.field_47883);
            class045682.B = class00392.y((String)string);
            class045682.u = class00392.y((String)string2);
            class045682.L = class04584.N((int)n2, (int)n3);
            class045682.i = new class07837(n3, n2, List.of());
        })});
    }
}

