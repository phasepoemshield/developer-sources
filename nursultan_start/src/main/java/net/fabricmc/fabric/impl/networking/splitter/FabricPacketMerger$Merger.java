/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.DecoderException
 *  minecraft.class00658
 *  minecraft.class01894
 *  net.fabricmc.fabric.mixin.networking.accessor.PacketDecoderAccessor
 */
package net.fabricmc.fabric.impl.networking.splitter;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import java.util.List;
import minecraft.class00658;
import minecraft.class01894;
import net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload;
import net.fabricmc.fabric.mixin.networking.accessor.PacketDecoderAccessor;

class FabricPacketMerger$Merger {
    private final PacketDecoderAccessor decoderHandler;
    private final class01894 packetId;
    private final int finalSize;
    private final ByteBuf byteBuf;

    FabricPacketMerger$Merger(class00658<?> class006582, class01894 class018942, int n) {
        this.decoderHandler = (PacketDecoderAccessor)class006582;
        this.packetId = class018942;
        this.byteBuf = Unpooled.buffer((int)n);
        this.finalSize = n;
    }

    boolean add(ChannelHandlerContext channelHandlerContext, FabricSplitPacketPayload fabricSplitPacketPayload, List<Object> list) throws Exception {
        int n = this.byteBuf.readableBytes() + fabricSplitPacketPayload.byteBuf().readableBytes();
        if (this.finalSize < n) {
            throw new DecoderException("Received too much data for packet '" + String.valueOf(this.packetId) + "'! Expected " + this.finalSize + " bytes, received " + n + " bytes!");
        }
        this.byteBuf.writeBytes(fabricSplitPacketPayload.byteBuf());
        if (this.byteBuf.readableBytes() == this.finalSize) {
            this.decoderHandler.fabric_decode(channelHandlerContext, this.byteBuf, list);
            return true;
        }
        return false;
    }
}

