/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  minecraft.class00381
 */
package net.fabricmc.fabric.mixin.networking.accessor;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import minecraft.class00381;

public interface PacketEncoderAccessor {
    public void fabric_encode(ChannelHandlerContext var1, class00381<?> var2, ByteBuf var3) throws Exception;
}

