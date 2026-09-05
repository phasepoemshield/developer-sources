/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_14
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_15
 */
package com.viaversion.viaversion.protocols.v1_14_4to1_15.rewriter;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_14;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_15;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.Protocol1_14_4To1_15;

public final class WorldPacketRewriter1_15 {
    public static void register(final Protocol1_14_4To1_15 protocol) {
        protocol.getBlockRewriter().registerLevelChunk((ClientboundPacketType)ClientboundPackets1_14_4.LEVEL_CHUNK, ChunkType1_14.TYPE, ChunkType1_15.TYPE, (connection, chunk) -> {
            if (chunk.isFullChunk()) {
                int[] biomeData = chunk.getBiomeData();
                int[] newBiomeData = new int[1024];
                if (biomeData != null) {
                    int i;
                    for (i = 0; i < 4; ++i) {
                        for (int j = 0; j < 4; ++j) {
                            int x = (j << 2) + 2;
                            int z = (i << 2) + 2;
                            int oldIndex = z << 4 | x;
                            newBiomeData[i << 2 | j] = biomeData[oldIndex];
                        }
                    }
                    for (i = 1; i < 64; ++i) {
                        System.arraycopy(newBiomeData, 0, newBiomeData, i * 16, 16);
                    }
                }
                chunk.setBiomeData(newBiomeData);
            }
        });
        protocol.replaceClientbound(ClientboundPackets1_14_4.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.FLOAT, (Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT, (Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT, (Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == 3 || id == 23) {
                        int data = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)protocol.getMappingData().getNewBlockStateId(data));
                    } else if (id == 32) {
                        protocol.getItemRewriter().handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2));
                    }
                });
            }
        });
    }
}

