/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocol.shared_registration.def;

import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.protocol.shared_registration.PacketBound;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPackets1_21;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

final class BlockRegistrations {
    BlockRegistrations() {
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> @Nullable BlockRewriter<CU> block(RegistrationContext<CU, SU> ctx) {
        return ctx.protocol().getBlockRewriter();
    }

    static <CU extends ClientboundPacketType> void registerBlockPackets1_16_2(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        BlockRegistrations.common1_13(ctx, br);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.BLOCK_BREAK_ACK, arg_0 -> br.registerBlockBreakAck(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_16_2.SECTION_BLOCKS_UPDATE, arg_0 -> br.registerSectionBlocksUpdate(arg_0), PacketBound.ADDED_AT_MIN);
    }

    static <CU extends ClientboundPacketType> void registerBlockPackets1_21(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        BlockRegistrations.common1_19(ctx, br);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.LEVEL_EVENT, arg_0 -> br.registerLevelEvent1_21(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21.SECTION_BLOCKS_UPDATE, arg_0 -> br.registerSectionBlocksUpdate1_20(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerBlockPackets1_19(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        BlockRegistrations.common1_19(ctx, br);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.LEVEL_EVENT, arg_0 -> br.registerLevelEvent1_13(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.SECTION_BLOCKS_UPDATE, arg_0 -> br.registerSectionBlocksUpdate(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerBlockPackets1_13(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        BlockRegistrations.common1_13(ctx, br);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.CHUNK_BLOCKS_UPDATE, arg_0 -> br.registerChunkBlocksUpdate(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerBlockPackets1_18(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        BlockRegistrations.common1_13(ctx, br);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_18.BLOCK_BREAK_ACK, arg_0 -> br.registerBlockBreakAck(arg_0), PacketBound.REMOVED_AT_MAX);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_18.LEVEL_CHUNK_WITH_LIGHT, arg_0 -> br.registerLevelChunk1_18(arg_0), PacketBound.ADDED_AT_MIN);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_18.SECTION_BLOCKS_UPDATE, arg_0 -> br.registerSectionBlocksUpdate(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_18.BLOCK_ENTITY_DATA, arg_0 -> br.registerBlockEntityData1_18(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerBlockPackets1_14_4(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        BlockRegistrations.common1_13(ctx, br);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.CHUNK_BLOCKS_UPDATE, arg_0 -> br.registerChunkBlocksUpdate(arg_0), PacketBound.REMOVED_AT_MAX);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14_4.BLOCK_BREAK_ACK, arg_0 -> br.registerBlockBreakAck(arg_0), PacketBound.ADDED_AT_MIN);
    }

    static <CU extends ClientboundPacketType> void registerBlockPackets1_20(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        BlockRegistrations.common1_19(ctx, br);
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_4.LEVEL_EVENT, arg_0 -> br.registerLevelEvent1_13(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19_4.SECTION_BLOCKS_UPDATE, arg_0 -> br.registerSectionBlocksUpdate1_20(arg_0));
    }

    private static <CU extends ClientboundPacketType> void common1_19(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.BLOCK_EVENT, arg_0 -> br.registerBlockEvent(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.BLOCK_UPDATE, arg_0 -> br.registerBlockUpdate(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.LEVEL_CHUNK_WITH_LIGHT, arg_0 -> br.registerLevelChunk1_18(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.BLOCK_ENTITY_DATA, arg_0 -> br.registerBlockEntityData1_18(arg_0));
    }

    private static <CU extends ClientboundPacketType> void common1_13(RegistrationContext<CU, ?> ctx, BlockRewriter<CU> br) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.BLOCK_EVENT, arg_0 -> br.registerBlockEvent(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.BLOCK_UPDATE, arg_0 -> br.registerBlockUpdate(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_EVENT, arg_0 -> br.registerLevelEvent1_13(arg_0));
    }
}

