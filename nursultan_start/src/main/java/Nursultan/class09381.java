/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  minecraft.class00423
 *  minecraft.class00642
 */
package Nursultan;

import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import minecraft.class00423;
import minecraft.class00642;

public class class09381
extends ChannelInitializer<Channel> {
    final /* synthetic */ class00642 N;

    public class09381(class00642 class006422) {
        this.N = class006422;
    }

    protected void initChannel(Channel channel) {
        ChannelPipeline channelPipeline = channel.pipeline();
        class00642.method_52911((ChannelPipeline)channelPipeline, (class00423)class00423.field_11942);
        this.N.method_53859(channelPipeline);
    }
}

