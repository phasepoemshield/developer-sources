/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.channel.ChannelHandlerContext
 *  minecraft.class00381
 *  minecraft.class00423
 *  minecraft.class00642
 */
package net.fabricmc.fabric.impl.event.interaction;

import io.netty.channel.ChannelHandlerContext;
import minecraft.class00381;
import minecraft.class00423;
import minecraft.class00642;

final class FakePlayerNetworkHandler$FakeClientConnection
extends class00642 {
    FakePlayerNetworkHandler$FakeClientConnection() {
        super(class00423.field_11942);
    }

    public /* synthetic */ void channelRead0(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        super.channelRead0(channelHandlerContext, (class00381)object);
    }
}

