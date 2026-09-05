/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.handler.codec.DecoderException
 *  io.netty.handler.codec.MessageToMessageDecoder
 *  minecraft.class00381
 *  minecraft.class00658
 *  minecraft.class01657
 *  minecraft.class01659
 *  minecraft.class01894
 *  minecraft.class02897
 *  net.fabricmc.fabric.impl.networking.GenericPayloadAccessor
 *  net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl
 *  net.fabricmc.fabric.impl.networking.VanillaPacketTypes
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.networking.splitter;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.util.List;
import minecraft.class00381;
import minecraft.class00658;
import minecraft.class01657;
import minecraft.class01659;
import minecraft.class01894;
import minecraft.class02897;
import net.fabricmc.fabric.impl.networking.GenericPayloadAccessor;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import net.fabricmc.fabric.impl.networking.VanillaPacketTypes;
import net.fabricmc.fabric.impl.networking.splitter.FabricPacketMerger$Merger;
import net.fabricmc.fabric.impl.networking.splitter.FabricSplitPacketPayload;
import org.jspecify.annotations.Nullable;

public class FabricPacketMerger
extends MessageToMessageDecoder<class00381<?>> {
    private final class00658<?> decoderHandler;
    private final PayloadTypeRegistryImpl<?> payloadTypeRegistry;
    private final VanillaPacketTypes vanillaPacketTypes;
    private @Nullable FabricPacketMerger$Merger packetMerger;

    public FabricPacketMerger(class00658<?> class006582, PayloadTypeRegistryImpl<?> payloadTypeRegistryImpl, VanillaPacketTypes vanillaPacketTypes) {
        this.decoderHandler = class006582;
        this.payloadTypeRegistry = payloadTypeRegistryImpl;
        this.vanillaPacketTypes = vanillaPacketTypes;
    }

    protected void decode(ChannelHandlerContext channelHandlerContext, class00381<?> class003812, List<Object> list) throws Exception {
        GenericPayloadAccessor genericPayloadAccessor;
        class01659 class016592;
        if (this.packetMerger != null) {
            class01659 class016593;
            Object object;
            FabricPacketMerger.ensureNotTransitioning(class003812);
            if (class003812 instanceof GenericPayloadAccessor) {
                object = (GenericPayloadAccessor)class003812;
                v0 = object.fabric_payload();
            } else {
                v0 = class016593 = null;
            }
            if (class016593 == null) {
                throw new DecoderException("Received '" + String.valueOf(class003812.method_65080().y()) + "' packet, while expecting 'minecraft:custom_payload'!");
            }
            if (!(class016593 instanceof FabricSplitPacketPayload)) {
                throw new DecoderException("Expected '" + String.valueOf(FabricSplitPacketPayload.ID.N()) + "' payload packet, but received '" + String.valueOf(class016593.method_56479().N()) + "'!");
            }
            object = (FabricSplitPacketPayload)class016593;
            if (this.packetMerger.add(channelHandlerContext, (FabricSplitPacketPayload)((Object)object), list)) {
                this.packetMerger = null;
            }
        } else if (class003812 instanceof GenericPayloadAccessor && (class016592 = (genericPayloadAccessor = (GenericPayloadAccessor)class003812).fabric_payload()) instanceof FabricSplitPacketPayload) {
            FabricSplitPacketPayload fabricSplitPacketPayload = (FabricSplitPacketPayload)class016592;
            FabricPacketMerger.ensureNotTransitioning(class003812);
            class016592 = fabricSplitPacketPayload.byteBuf();
            int n = class01657.N((ByteBuf)class016592);
            int n2 = class016592.readerIndex();
            class02897 class028972 = this.vanillaPacketTypes.get(class01657.N((ByteBuf)class016592));
            if (class028972 != class003812.method_65080()) {
                throw new DecoderException("Received unsupported split packet type! Expected '" + String.valueOf(class003812.method_65080().y()) + " got '" + String.valueOf(class028972 != null ? class028972.y() : "<NULL>") + "'!");
            }
            class01894 class018942 = (class01894)class01894.y.decode((Object)fabricSplitPacketPayload.byteBuf());
            class016592.readerIndex(n2);
            int n3 = this.payloadTypeRegistry.getMaxPacketSize(class018942);
            if (n3 == -1) {
                throw new DecoderException("Received '" + String.valueOf(class018942) + "' packet doesn't support splitting, but received split data!");
            }
            if (n3 < n) {
                throw new DecoderException("Received '" + String.valueOf(class018942) + "' packet is larger than max allowed size! Got " + n + " bytes, expected " + n3 + " bytes!");
            }
            this.packetMerger = new FabricPacketMerger$Merger(this.decoderHandler, class018942, n);
            if (this.packetMerger.add(channelHandlerContext, fabricSplitPacketPayload, list)) {
                throw new DecoderException("Received '" + String.valueOf(class018942) + "' as a split packet, but it wasn't actually split!");
            }
        } else {
            list.add(class003812);
            if (class003812.R()) {
                channelHandlerContext.pipeline().remove(channelHandlerContext.name());
            }
        }
    }

    private static void ensureNotTransitioning(class00381<?> class003812) {
        if (class003812.R()) {
            throw new DecoderException("Terminal message received in bundle");
        }
    }
}

