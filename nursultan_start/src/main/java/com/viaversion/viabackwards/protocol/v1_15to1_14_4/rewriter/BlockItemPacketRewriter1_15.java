/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_14
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_15
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 */
package com.viaversion.viabackwards.protocol.v1_15to1_14_4.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.protocol.v1_15to1_14_4.Protocol1_15To1_14_4;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_14;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_15;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.rewriter.RecipeRewriter;

public class BlockItemPacketRewriter1_15
extends BackwardsItemRewriter<ClientboundPackets1_15, ServerboundPackets1_14, Protocol1_15To1_14_4> {
    public BlockItemPacketRewriter1_15(Protocol1_15To1_14_4 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    protected void registerPackets() {
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_15.UPDATE_RECIPES);
        ((Protocol1_15To1_14_4)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_14.EDIT_BOOK, wrapper -> this.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
        ((Protocol1_15To1_14_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_15.LEVEL_CHUNK, wrapper -> {
            Chunk chunk = (Chunk)wrapper.read(ChunkType1_15.TYPE);
            wrapper.write(ChunkType1_14.TYPE, (Object)chunk);
            if (chunk.isFullChunk()) {
                int[] biomeData = chunk.getBiomeData();
                int[] newBiomeData = new int[256];
                for (int i = 0; i < 4; ++i) {
                    for (int j = 0; j < 4; ++j) {
                        int x = j << 2;
                        int z = i << 2;
                        int newIndex = z << 4 | x;
                        int oldIndex = i << 2 | j;
                        int biome = biomeData[oldIndex];
                        for (int k = 0; k < 4; ++k) {
                            int offX = newIndex + (k << 4);
                            for (int l = 0; l < 4; ++l) {
                                newBiomeData[offX + l] = biome;
                            }
                        }
                    }
                }
                chunk.setBiomeData(newBiomeData);
            }
            ((Protocol1_15To1_14_4)this.protocol).getBlockRewriter().handleChunk(chunk);
        });
        ((Protocol1_15To1_14_4)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_15.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
                this.map((Type)Types.DOUBLE, (Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == 3 || id == 23) {
                        int data = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)((Protocol1_15To1_14_4)BlockItemPacketRewriter1_15.this.protocol).getMappingData().getNewBlockStateId(data));
                    } else if (id == 32) {
                        Item item = BlockItemPacketRewriter1_15.this.handleItemToClient(wrapper.user(), (Item)wrapper.read(Types.ITEM1_13_2));
                        wrapper.write(Types.ITEM1_13_2, (Object)item);
                    }
                    int mappedId = ((Protocol1_15To1_14_4)BlockItemPacketRewriter1_15.this.protocol).getMappingData().getNewParticleId(id);
                    if (id != mappedId) {
                        wrapper.set((Type)Types.INT, 0, (Object)mappedId);
                    }
                });
            }
        });
    }
}

