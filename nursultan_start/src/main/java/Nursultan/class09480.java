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
 *  io.netty.handler.timeout.ReadTimeoutHandler
 *  minecraft.class00423
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class01025
 *  minecraft.class01589
 *  minecraft.class01602
 *  minecraft.class01618
 *  minecraft.class04184
 */
package Nursultan;

import io.netty.channel.Channel;
import io.netty.channel.ChannelException;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.timeout.ReadTimeoutHandler;
import minecraft.class00423;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01025;
import minecraft.class01589;
import minecraft.class01602;
import minecraft.class01618;
import minecraft.class04184;

public class class09480
extends ChannelInitializer<Channel> {
    final /* synthetic */ class01618 N;

    public class09480(class01618 class016182) {
        this.N = class016182;
    }

    protected void initChannel(Channel channel) {
        try {
            channel.config().setOption(ChannelOption.TCP_NODELAY, (Object)true);
        }
        catch (ChannelException channelException) {
            // empty catch block
        }
        ChannelPipeline channelPipeline = channel.pipeline().addLast("timeout", (ChannelHandler)new ReadTimeoutHandler(30));
        if (this.N.N.A()) {
            channelPipeline.addLast("legacy_query", (ChannelHandler)new class01602((class04184)this.N.u()));
        }
        class00642.method_48311((ChannelPipeline)channelPipeline, (class00423)class00423.field_11941, (boolean)false, null);
        int n = this.N.N.U();
        class01025 class010252 = n > 0 ? new class01025(n) : new class00642(class00423.field_11941);
        this.N.L.add(class010252);
        class010252.method_53859(channelPipeline);
        class010252.method_52912((class00638)new class01589(this.N.N, (class00642)class010252));
    }
}

