/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Environment
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 */
package com.viaversion.viaversion.protocols.v1_13to1_13_1.rewriter;

import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Environment;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13to1_13_1.Protocol1_13To1_13_1;

public class WorldPacketRewriter1_13_1 {
    public static void register(final Protocol1_13To1_13_1 protocol) {
        protocol.registerClientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_CHUNK, wrapper -> {
            ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_13To1_13_1.class);
            Chunk chunk = (Chunk)wrapper.passthrough((Type)ChunkType1_13.forEnvironment((Environment)clientWorld.getEnvironment()));
            protocol.getBlockRewriter().handleChunk(chunk);
        });
        protocol.replaceClientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == 2000) {
                        int data = (Integer)wrapper.get((Type)Types.INT, 1);
                        switch (data) {
                            case 1: {
                                wrapper.set((Type)Types.INT, 1, (Object)2);
                                break;
                            }
                            case 0: 
                            case 3: 
                            case 6: {
                                wrapper.set((Type)Types.INT, 1, (Object)4);
                                break;
                            }
                            case 2: 
                            case 5: 
                            case 8: {
                                wrapper.set((Type)Types.INT, 1, (Object)5);
                                break;
                            }
                            case 7: {
                                wrapper.set((Type)Types.INT, 1, (Object)3);
                                break;
                            }
                            default: {
                                wrapper.set((Type)Types.INT, 1, (Object)0);
                                break;
                            }
                        }
                    } else if (id == 1010) {
                        wrapper.set((Type)Types.INT, 1, (Object)protocol.getMappingData().getNewItemId(((Integer)wrapper.get((Type)Types.INT, 1)).intValue()));
                    } else if (id == 2001) {
                        wrapper.set((Type)Types.INT, 1, (Object)protocol.getMappingData().getNewBlockStateId(((Integer)wrapper.get((Type)Types.INT, 1)).intValue()));
                    }
                });
            }
        });
    }
}

