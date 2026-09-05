/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelInitializer
 *  io.netty.channel.ChannelPipeline
 *  minecraft.class00423
 *  minecraft.class00638
 *  minecraft.class00642
 *  minecraft.class01601
 *  minecraft.class01604
 *  minecraft.class01618
 *  minecraft.class07529
 */
package Nursultan;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import minecraft.class00423;
import minecraft.class00638;
import minecraft.class00642;
import minecraft.class01601;
import minecraft.class01604;
import minecraft.class01618;
import minecraft.class07529;

public class class09483
extends ChannelInitializer<Channel> {
    final /* synthetic */ class01618 N;

    public class09483(class01618 class016182) {
        this.N = class016182;
    }

    protected void initChannel(Channel channel) {
        class00642 class006422 = new class00642(class00423.field_11941);
        class006422.method_52912((class00638)new class01604(this.N.N, class006422));
        this.N.L.add(class006422);
        ChannelPipeline channelPipeline = channel.pipeline();
        class00642.method_52911((ChannelPipeline)channelPipeline, (class00423)class00423.field_11941);
        if (class07529.NK > 0) {
            channelPipeline.addLast("latency", (ChannelHandler)new class01601(class07529.NK, class07529.NV));
        }
        class006422.method_53859(channelPipeline);
    }
}

