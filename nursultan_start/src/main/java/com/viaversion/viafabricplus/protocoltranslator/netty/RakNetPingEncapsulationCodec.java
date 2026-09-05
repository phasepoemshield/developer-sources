/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.MessageToMessageCodec
 *  org.cloudburstmc.netty.channel.raknet.RakConstants
 *  org.cloudburstmc.netty.channel.raknet.RakPing
 *  org.cloudburstmc.netty.channel.raknet.RakPong
 */
package com.viaversion.viafabricplus.protocoltranslator.netty;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import java.net.InetSocketAddress;
import java.util.List;
import org.cloudburstmc.netty.channel.raknet.RakConstants;
import org.cloudburstmc.netty.channel.raknet.RakPing;
import org.cloudburstmc.netty.channel.raknet.RakPong;

public final class RakNetPingEncapsulationCodec
extends MessageToMessageCodec<RakPong, ByteBuf> {
    public static final String NAME = "viabedrock-ping-encapsulation";
    private final InetSocketAddress remoteAddress;

    public RakNetPingEncapsulationCodec(InetSocketAddress inetSocketAddress) {
        this.remoteAddress = inetSocketAddress;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, RakPong rakPong, List<Object> list) {
        if (!this.remoteAddress.equals(rakPong.getSender())) {
            channelHandlerContext.close();
            throw new IllegalStateException("Received pong from unexpected address: " + String.valueOf(rakPong.getSender()));
        }
        ByteBuf byteBuf = channelHandlerContext.alloc().buffer();
        byteBuf.writeByte(28);
        byteBuf.writeLong(rakPong.getPingTime());
        byteBuf.writeLong(rakPong.getGuid());
        byteBuf.writeBytes(RakConstants.DEFAULT_UNCONNECTED_MAGIC);
        byteBuf.writeShort(rakPong.getPongData().readableBytes());
        byteBuf.writeBytes(rakPong.getPongData());
        list.add(byteBuf);
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf, List<Object> list) {
        short s = byteBuf.readUnsignedByte();
        if (s != 1) {
            channelHandlerContext.close();
            throw new IllegalStateException("Unexpected packet ID: " + s);
        }
        list.add(new RakPing(byteBuf.readLong(), this.remoteAddress));
    }
}

