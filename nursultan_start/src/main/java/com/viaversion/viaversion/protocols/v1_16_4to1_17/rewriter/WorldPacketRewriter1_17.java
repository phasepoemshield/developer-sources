/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.classic.world_height.WorldHeightSupport
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_16_2
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16_2
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 */
package com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter;

import com.viaversion.viafabricplus.features.classic.world_height.WorldHeightSupport;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord1_16_2;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_16_2;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import java.util.ArrayList;
import java.util.BitSet;

public final class WorldPacketRewriter1_17 {
    public static void register(Protocol1_16_4To1_17 protocol1_16_4To1_17) {
        protocol1_16_4To1_17.registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.SET_BORDER, null, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            ClientboundPackets1_17 clientboundPackets1_17 = switch (n) {
                case 0 -> ClientboundPackets1_17.SET_BORDER_SIZE;
                case 1 -> ClientboundPackets1_17.SET_BORDER_LERP_SIZE;
                case 2 -> ClientboundPackets1_17.SET_BORDER_CENTER;
                case 3 -> ClientboundPackets1_17.INITIALIZE_BORDER;
                case 4 -> ClientboundPackets1_17.SET_BORDER_WARNING_DELAY;
                case 5 -> ClientboundPackets1_17.SET_BORDER_WARNING_DISTANCE;
                default -> throw new IllegalArgumentException("Invalid world border type received: " + n);
            };
            packetWrapper.setPacketType((PacketType)clientboundPackets1_17);
        });
        PacketHandlers packetHandlers = new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    int skyLightMask = (Integer)wrapper.read((Type)Types.VAR_INT);
                    int blockLightMask = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)this.toBitSetLongArray(skyLightMask));
                    wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)this.toBitSetLongArray(blockLightMask));
                    wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)this.toBitSetLongArray((Integer)wrapper.read((Type)Types.VAR_INT)));
                    wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)this.toBitSetLongArray((Integer)wrapper.read((Type)Types.VAR_INT)));
                    this.writeLightArrays(wrapper, skyLightMask);
                    this.writeLightArrays(wrapper, blockLightMask);
                });
            }

            private boolean isSet(int mask, int i) {
                return (mask & 1 << i) != 0;
            }

            private void writeLightArrays(PacketWrapper wrapper, int bitMask) {
                ArrayList<byte[]> light = new ArrayList<byte[]>();
                for (int i = 0; i < 18; ++i) {
                    if (!this.isSet(bitMask, i)) continue;
                    light.add((byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE));
                }
                wrapper.write((Type)Types.VAR_INT, (Object)light.size());
                for (byte[] bytes : light) {
                    wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)bytes);
                }
            }

            private long[] toBitSetLongArray(int bitmask) {
                return new long[]{bitmask};
            }
        };
        ClientboundPackets1_16_2 clientboundPackets1_16_2 = ClientboundPackets1_16_2.LIGHT_UPDATE;
        Protocol1_16_4To1_17 protocol1_16_4To1_172 = protocol1_16_4To1_17;
        WorldPacketRewriter1_17.redirect$dfo001$viafabricplus$handleClassicWorldHeight(protocol1_16_4To1_172, (ClientboundPacketType)clientboundPackets1_16_2, (PacketHandler)packetHandlers);
        packetHandlers = packetWrapper -> {
            Chunk chunk = (Chunk)packetWrapper.read(ChunkType1_16_2.TYPE);
            if (!chunk.isFullChunk()) {
                WorldPacketRewriter1_17.writeMultiBlockChangePacket(packetWrapper, chunk);
                packetWrapper.cancel();
                return;
            }
            packetWrapper.write((Type)new ChunkType1_17(chunk.getSections().length), (Object)chunk);
            chunk.setChunkMask(BitSet.valueOf(new long[]{chunk.getBitmask()}));
            protocol1_16_4To1_17.getBlockRewriter().handleChunk(chunk);
        };
        clientboundPackets1_16_2 = ClientboundPackets1_16_2.LEVEL_CHUNK;
        protocol1_16_4To1_172 = protocol1_16_4To1_17;
        WorldPacketRewriter1_17.redirect$dfo001$viafabricplus$handleClassicWorldHeight(protocol1_16_4To1_172, (ClientboundPacketType)clientboundPackets1_16_2, (PacketHandler)packetHandlers);
    }

    private static void redirect$dfo001$viafabricplus$handleClassicWorldHeight(Protocol1_16_4To1_17 protocol1_16_4To1_17, ClientboundPacketType clientboundPacketType, PacketHandler packetHandler) {
        if (clientboundPacketType == ClientboundPackets1_16_2.LEVEL_CHUNK) {
            packetHandler = WorldHeightSupport.handleChunkData((PacketHandler)packetHandler);
        }
        if (clientboundPacketType == ClientboundPackets1_16_2.LIGHT_UPDATE) {
            packetHandler = WorldHeightSupport.handleUpdateLight((PacketHandler)packetHandler);
        }
        protocol1_16_4To1_17.registerClientbound(clientboundPacketType, packetHandler);
    }

    private static void writeMultiBlockChangePacket(PacketWrapper packetWrapper, Chunk chunk) {
        long l = ((long)chunk.getX() & 0x3FFFFFL) << 42;
        l |= ((long)chunk.getZ() & 0x3FFFFFL) << 20;
        ChunkSection[] chunkSectionArray = chunk.getSections();
        for (int i = 0; i < chunkSectionArray.length; ++i) {
            ChunkSection chunkSection = chunkSectionArray[i];
            if (chunkSection == null) continue;
            PacketWrapper packetWrapper2 = packetWrapper.create((PacketType)ClientboundPackets1_17.SECTION_BLOCKS_UPDATE);
            packetWrapper2.write((Type)Types.LONG, (Object)(l | (long)i & 0xFFFFFL));
            packetWrapper2.write((Type)Types.BOOLEAN, (Object)true);
            BlockChangeRecord[] blockChangeRecordArray = new BlockChangeRecord[4096];
            DataPalette dataPalette = chunkSection.palette(PaletteType.BLOCKS);
            int n = 0;
            for (int j = 0; j < 16; ++j) {
                for (int k = 0; k < 16; ++k) {
                    for (int i2 = 0; i2 < 16; ++i2) {
                        int n2 = Protocol1_16_4To1_17.MAPPINGS.getNewBlockStateId(dataPalette.idAt(j, k, i2));
                        blockChangeRecordArray[n++] = new BlockChangeRecord1_16_2(j, k, i2, n2);
                    }
                }
            }
            packetWrapper2.write(Types.VAR_LONG_BLOCK_CHANGE_ARRAY, (Object)blockChangeRecordArray);
            packetWrapper2.send(Protocol1_16_4To1_17.class);
        }
    }
}

