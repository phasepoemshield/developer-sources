/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.Unpooled
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.EncoderException
 *  io.netty.handler.codec.MessageToMessageEncoder
 *  minecraft.class00381
 *  minecraft.class00657
 *  minecraft.class01657
 *  minecraft.class01659
 *  minecraft.class01894
 *  net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl
 *  net.fabricmc.fabric.mixin.networking.accessor.PacketEncoderAccessor
 */
package net.fabricmc.fabric.impl.networking.splitter;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.EncoderException;
import io.netty.handler.codec.MessageToMessageEncoder;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import minecraft.class00381;
import minecraft.class00657;
import minecraft.class01657;
import minecraft.class01659;
import minecraft.class01894;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload;
import net.fabricmc.fabric.impl.networking.splitter.PassthroughPacket;
import net.fabricmc.fabric.impl.networking.splitter.SplittablePacket;
import net.fabricmc.fabric.mixin.networking.accessor.PacketEncoderAccessor;

public class FabricPacketSplitter
extends MessageToMessageEncoder<class00381<?>> {
    public static final int SAFE_S2C_SPLIT_SIZE = 0x100000;
    public static final int SAFE_C2S_SPLIT_SIZE = Short.MAX_VALUE;
    private final class00657<?> encoder;
    private final PayloadTypeRegistryImpl<?> payloadTypeRegistry;

    public FabricPacketSplitter(class00657<?> class006572, PayloadTypeRegistryImpl<?> payloadTypeRegistryImpl) {
        this.encoder = class006572;
        this.payloadTypeRegistry = payloadTypeRegistryImpl;
    }

    protected void encode(ChannelHandlerContext channelHandlerContext, class00381<?> class003812, List<Object> list) throws Exception {
        if (class003812 instanceof SplittablePacket) {
            SplittablePacket splittablePacket = (SplittablePacket)class003812;
            splittablePacket.fabric_split(this.payloadTypeRegistry, channelHandlerContext, this.encoder, class003812, list::add);
        } else {
            list.add(class003812);
        }
        if (class003812.R()) {
            channelHandlerContext.pipeline().remove(channelHandlerContext.name());
        }
    }

    public static void genericPacketSplitter(class01894 class018942, ChannelHandlerContext channelHandlerContext, class00657<?> class006572, class00381<?> class003812, Function<class01659, class00381<?>> function, Consumer<class00381<?>> consumer, int n, int n2) throws Exception {
        ByteBuf byteBuf = Unpooled.buffer();
        ((PacketEncoderAccessor)class006572).fabric_encode(channelHandlerContext, class003812, byteBuf);
        if (byteBuf.readableBytes() < n) {
            consumer.accept(new PassthroughPacket(byteBuf));
            return;
        }
        if (byteBuf.readableBytes() > n2) {
            throw new EncoderException("Packet '" + String.valueOf(class018942) + "' may not be larger than " + n2 + " bytes!");
        }
        ByteBuf byteBuf2 = Unpooled.buffer((int)n);
        class01657.N((ByteBuf)byteBuf2, (int)byteBuf.readableBytes());
        byteBuf2.writeBytes(byteBuf.readSlice(n - byteBuf2.readableBytes()));
        consumer.accept(function.apply(new FabricSplitPacketPayload(byteBuf2)));
        while (byteBuf.isReadable()) {
            consumer.accept(function.apply(new FabricSplitPacketPayload(byteBuf.readSlice(Math.min(byteBuf.readableBytes(), n)))));
        }
    }
}

