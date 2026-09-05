/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter
 *  com.viaversion.viabackwards.protocol.v1_18to1_17_1.data.BlockEntityMappings1_17_1
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.chunks.BaseChunk
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
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18
 *  com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.MathUtil
 */
package com.viaversion.viabackwards.protocol.v1_18to1_17_1.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsItemRewriter;
import com.viaversion.viabackwards.protocol.v1_18to1_17_1.Protocol1_18To1_17_1;
import com.viaversion.viabackwards.protocol.v1_18to1_17_1.data.BlockEntityMappings1_17_1;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.chunks.BaseChunk;
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
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.rewriter.RecipeRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.MathUtil;
import java.util.ArrayList;
import java.util.BitSet;

public final class BlockItemPacketRewriter1_18
extends BackwardsItemRewriter<ClientboundPackets1_18, ServerboundPackets1_17, Protocol1_18To1_17_1> {
    public BlockItemPacketRewriter1_18(Protocol1_18To1_17_1 protocol) {
        super((BackwardsProtocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_ARRAY);
    }

    protected void registerPackets() {
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_18.UPDATE_RECIPES);
        ((Protocol1_18To1_17_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_18.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_14);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    int data = (Integer)wrapper.get((Type)Types.INT, 1);
                    if (id == 1010) {
                        wrapper.set((Type)Types.INT, 1, (Object)((Protocol1_18To1_17_1)BlockItemPacketRewriter1_18.this.protocol).getMappingData().getNewItemId(data));
                    }
                });
            }
        });
        ((Protocol1_18To1_17_1)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_18.LEVEL_PARTICLES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (id == 3) {
                        int blockState = (Integer)wrapper.read((Type)Types.VAR_INT);
                        if (blockState == 7786) {
                            wrapper.set((Type)Types.INT, 0, (Object)3);
                        } else {
                            wrapper.set((Type)Types.INT, 0, (Object)2);
                        }
                        return;
                    }
                    ParticleMappings mappings = ((Protocol1_18To1_17_1)BlockItemPacketRewriter1_18.this.protocol).getMappingData().getParticleMappings();
                    if (mappings.isBlockParticle(id)) {
                        int data = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        wrapper.set((Type)Types.VAR_INT, 0, (Object)((Protocol1_18To1_17_1)BlockItemPacketRewriter1_18.this.protocol).getMappingData().getNewBlockStateId(data));
                    } else if (mappings.isItemParticle(id)) {
                        BlockItemPacketRewriter1_18.this.passthroughClientboundItem(wrapper);
                    }
                    int newId = ((Protocol1_18To1_17_1)BlockItemPacketRewriter1_18.this.protocol).getMappingData().getNewParticleId(id);
                    if (newId != id) {
                        wrapper.set((Type)Types.INT, 0, (Object)newId);
                    }
                });
            }
        });
        ((Protocol1_18To1_17_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_18.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14);
                this.handler(wrapper -> {
                    int id = (Integer)wrapper.read((Type)Types.VAR_INT);
                    CompoundTag tag = (CompoundTag)wrapper.read(Types.NAMED_COMPOUND_TAG);
                    int mappedId = BlockEntityMappings1_17_1.mappedId((int)id);
                    if (mappedId == -1) {
                        wrapper.cancel();
                        return;
                    }
                    String identifier = (String)((Protocol1_18To1_17_1)BlockItemPacketRewriter1_18.this.protocol).getMappingData().blockEntities().get(id);
                    if (identifier == null) {
                        wrapper.cancel();
                        return;
                    }
                    CompoundTag newTag = tag == null ? new CompoundTag() : tag;
                    BlockPosition pos = (BlockPosition)wrapper.get(Types.BLOCK_POSITION1_14, 0);
                    newTag.putString("id", Key.namespaced((String)identifier));
                    newTag.putInt("x", pos.x());
                    newTag.putInt("y", pos.y());
                    newTag.putInt("z", pos.z());
                    BlockItemPacketRewriter1_18.this.handleSpawner(id, newTag);
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)mappedId));
                    wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)newTag);
                });
            }
        });
        ((Protocol1_18To1_17_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_18.LEVEL_CHUNK_WITH_LIGHT, (ClientboundPacketType)ClientboundPackets1_17_1.LEVEL_CHUNK, wrapper -> {
            EntityTracker tracker = ((Protocol1_18To1_17_1)this.protocol).getEntityRewriter().tracker(wrapper.user());
            ChunkType1_18 chunkType = new ChunkType1_18(tracker.currentWorldSectionHeight(), MathUtil.ceilLog2((int)((Protocol1_18To1_17_1)this.protocol).getMappingData().getBlockStateMappings().mappedSize()), MathUtil.ceilLog2((int)tracker.biomesSent()));
            Chunk oldChunk = (Chunk)wrapper.read((Type)chunkType);
            ChunkSection[] sections = oldChunk.getSections();
            BitSet mask = new BitSet(oldChunk.getSections().length);
            int[] biomeData = new int[sections.length * 64];
            int biomeIndex = 0;
            for (int j = 0; j < sections.length; ++j) {
                ChunkSection section = sections[j];
                DataPalette biomePalette = section.palette(PaletteType.BIOMES);
                for (int i = 0; i < 64; ++i) {
                    biomeData[biomeIndex++] = biomePalette.idAt(i);
                }
                if (section.getNonAirBlocksCount() == 0) {
                    sections[j] = null;
                    continue;
                }
                mask.set(j);
            }
            ArrayList<CompoundTag> blockEntityTags = new ArrayList<CompoundTag>(oldChunk.blockEntities().size());
            for (BlockEntity blockEntity : oldChunk.blockEntities()) {
                CompoundTag tag;
                String id = (String)((Protocol1_18To1_17_1)this.protocol).getMappingData().blockEntities().get(blockEntity.typeId());
                if (id == null) continue;
                if (blockEntity.tag() != null) {
                    tag = blockEntity.tag();
                    this.handleSpawner(blockEntity.typeId(), tag);
                } else {
                    tag = new CompoundTag();
                }
                blockEntityTags.add(tag);
                tag.putInt("x", (oldChunk.getX() << 4) + blockEntity.sectionX());
                tag.putInt("y", (int)blockEntity.y());
                tag.putInt("z", (oldChunk.getZ() << 4) + blockEntity.sectionZ());
                tag.putString("id", Key.namespaced((String)id));
            }
            BaseChunk chunk = new BaseChunk(oldChunk.getX(), oldChunk.getZ(), true, false, mask, oldChunk.getSections(), biomeData, oldChunk.getHeightMap(), blockEntityTags);
            wrapper.write((Type)new ChunkType1_17(tracker.currentWorldSectionHeight()), (Object)chunk);
            PacketWrapper lightPacket = wrapper.create((PacketType)ClientboundPackets1_17_1.LIGHT_UPDATE);
            lightPacket.write((Type)Types.VAR_INT, (Object)chunk.getX());
            lightPacket.write((Type)Types.VAR_INT, (Object)chunk.getZ());
            lightPacket.write((Type)Types.BOOLEAN, (Object)((Boolean)wrapper.read((Type)Types.BOOLEAN)));
            lightPacket.write(Types.LONG_ARRAY_PRIMITIVE, (Object)((long[])wrapper.read(Types.LONG_ARRAY_PRIMITIVE)));
            lightPacket.write(Types.LONG_ARRAY_PRIMITIVE, (Object)((long[])wrapper.read(Types.LONG_ARRAY_PRIMITIVE)));
            lightPacket.write(Types.LONG_ARRAY_PRIMITIVE, (Object)((long[])wrapper.read(Types.LONG_ARRAY_PRIMITIVE)));
            lightPacket.write(Types.LONG_ARRAY_PRIMITIVE, (Object)((long[])wrapper.read(Types.LONG_ARRAY_PRIMITIVE)));
            int skyLightLength = (Integer)wrapper.read((Type)Types.VAR_INT);
            lightPacket.write((Type)Types.VAR_INT, (Object)skyLightLength);
            for (int i = 0; i < skyLightLength; ++i) {
                lightPacket.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)((byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE)));
            }
            int blockLightLength = (Integer)wrapper.read((Type)Types.VAR_INT);
            lightPacket.write((Type)Types.VAR_INT, (Object)blockLightLength);
            for (int i = 0; i < blockLightLength; ++i) {
                lightPacket.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)((byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE)));
            }
            lightPacket.send(Protocol1_18To1_17_1.class);
        });
        ((Protocol1_18To1_17_1)this.protocol).cancelClientbound((ClientboundPacketType)ClientboundPackets1_18.SET_SIMULATION_DISTANCE);
    }

    private void handleSpawner(int typeId, CompoundTag tag) {
        CompoundTag entity;
        CompoundTag spawnData;
        if (typeId == 8 && (spawnData = tag.getCompoundTag("SpawnData")) != null && (entity = spawnData.getCompoundTag("entity")) != null) {
            tag.put("SpawnData", (Tag)entity);
        }
    }
}

