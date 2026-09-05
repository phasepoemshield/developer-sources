/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 */
package net.fabricmc.fabric.mixin.networking.accessor;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import java.util.List;

public interface PacketDecoderAccessor {
    public void fabric_decode(ChannelHandlerContext var1, ByteBuf var2, List<Object> var3) throws Exception;
}

