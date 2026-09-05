/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.BlockFace
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 */
package com.viaversion.viabackwards.protocol.v1_13_1to1_13.rewriter;

import com.viaversion.viabackwards.protocol.v1_13_1to1_13.Protocol1_13_1To1_13;
import com.viaversion.viaversion.api.minecraft.BlockFace;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.rewriter.BlockRewriter;

public class WorldPacketRewriter1_13_1 {
    public static void register(final Protocol1_13_1To1_13 protocol) {
        BlockRewriter blockRewriter = BlockRewriter.legacy((Protocol)protocol);
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_13_1To1_13.class);
            Chunk chunk = (Chunk)wrapper.passthrough((Type)ChunkType1_13.forEnvironment((Environment)clientWorld.getEnvironment()));
            blockRewriter.handleChunk(chunk);
        });
        blockRewriter.registerBlockEvent((ClientboundPacketType)ClientboundPackets1_13.BLOCK_EVENT);
        blockRewriter.registerBlockUpdate((ClientboundPacketType)ClientboundPackets1_13.BLOCK_UPDATE);
        blockRewriter.registerChunkBlocksUpdate((ClientboundPacketType)ClientboundPackets1_13.CHUNK_BLOCKS_UPDATE);
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 1);
                    if (id == 1010) {
                        wrapper.set((Type)Types.INT, 1, (Object)protocol.getMappingData().getNewItemId(data));
                    } else if (id == 2001) {
                        wrapper.set((Type)Types.INT, 1, (Object)protocol.getMappingData().getNewBlockStateId(data));
                    } else if (id == 2000) {
                        switch (data) {
                            case 0: 
                            case 1: {
                                BlockPosition pos = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_8, 0);
                                BlockFace relative = data == 0 ? BlockFace.BOTTOM : BlockFace.TOP;
                                wrapper.set(Types.BLOCK_POSITION1_8, 0, (Object)pos.getRelative(relative));
                                wrapper.set((Type)Types.INT, 1, (Object)4);
                                break;
                            }
                            case 2: {
                                wrapper.set((Type)Types.INT, 1, (Object)1);
                                break;
                            }
                            case 3: {
                                wrapper.set((Type)Types.INT, 1, (Object)7);
                                break;
                            }
                            case 4: {
                                wrapper.set((Type)Types.INT, 1, (Object)3);
                                break;
                            }
                            case 5: {
                                wrapper.set((Type)Types.INT, 1, (Object)5);
                            }
                        }
                    }
                });
            }
        });
    }
}

