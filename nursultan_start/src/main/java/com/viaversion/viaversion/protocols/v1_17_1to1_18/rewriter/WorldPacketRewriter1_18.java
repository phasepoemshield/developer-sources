/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk1_18
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPaletteImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.data.BlockEntityMappings1_18
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.storage.ChunkLightStorage
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.storage.ChunkLightStorage$ChunkLight
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.MathUtil
 */
package com.viaversion.viaversion.protocols.v1_17_1to1_18.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk1_18;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionImpl;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.DataPaletteImpl;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_17;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.Protocol1_17_1To1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.data.BlockEntities1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.data.BlockEntityMappings1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.storage.ChunkLightStorage;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.MathUtil;
import java.util.ArrayList;
import java.util.BitSet;

public final class WorldPacketRewriter1_18 {
    public static void register(Protocol1_17_1To1_18 protocol) {
        protocol.registerClientbound(ClientboundPackets1_17_1.BLOCK_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14);
                this.handler(wrapper -> {
                    short id = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
                    int newId = BlockEntityMappings1_18.newId((int)id);
                    wrapper.write((Type)Types.VAR_INT, (Object)newId);
                    WorldPacketRewriter1_18.handleSpawners(newId, (CompoundTag)wrapper.passthrough(Types.NAMED_COMPOUND_TAG));
                });
            }
        });
        protocol.registerClientbound(ClientboundPackets1_17_1.LIGHT_UPDATE, wrapper -> {
            int chunkX = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int chunkZ = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (((ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class)).isLoaded(chunkX, chunkZ)) {
                if (!Via.getConfig().cache1_17Light()) {
                    return;
                }
            } else {
                wrapper.cancel();
            }
            boolean trustEdges = (Boolean)wrapper.passthrough((Type)Types.BOOLEAN);
            long[] skyLightMask = (long[])wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            long[] blockLightMask = (long[])wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            long[] emptySkyLightMask = (long[])wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            long[] emptyBlockLightMask = (long[])wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            int skyLightLenght = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            byte[][] skyLight = new byte[skyLightLenght][];
            for (int i = 0; i < skyLightLenght; ++i) {
                skyLight[i] = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
            }
            int blockLightLength = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            byte[][] blockLight = new byte[blockLightLength][];
            for (int i = 0; i < blockLightLength; ++i) {
                blockLight[i] = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
            }
            ChunkLightStorage lightStorage = (ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class);
            lightStorage.storeLight(chunkX, chunkZ, new ChunkLightStorage.ChunkLight(trustEdges, skyLightMask, blockLightMask, emptySkyLightMask, emptyBlockLightMask, (byte[][])skyLight, (byte[][])blockLight));
        });
        protocol.registerClientbound(ClientboundPackets1_17_1.LEVEL_CHUNK, ClientboundPackets1_18.LEVEL_CHUNK_WITH_LIGHT, wrapper -> {
            ChunkLightStorage.ChunkLight light;
            EntityTracker tracker = protocol.getEntityRewriter().tracker(wrapper.user());
            Chunk oldChunk = (Chunk)wrapper.read((Type)new ChunkType1_17(tracker.currentWorldSectionHeight()));
            ArrayList<BlockEntityImpl> blockEntities = new ArrayList<BlockEntityImpl>(oldChunk.getBlockEntities().size());
            for (CompoundTag tag : oldChunk.getBlockEntities()) {
                NumberTag xTag = tag.getNumberTag("x");
                NumberTag yTag = tag.getNumberTag("y");
                NumberTag zTag = tag.getNumberTag("z");
                StringTag idTag = tag.getStringTag("id");
                if (xTag == null || yTag == null || zTag == null || idTag == null) continue;
                String id = idTag.getValue();
                int typeId = BlockEntities1_18.blockEntityIds().getInt((Object)Key.stripMinecraftNamespace((String)id));
                if (typeId == -1) {
                    protocol.getLogger().warning("Unknown block entity: " + id);
                }
                WorldPacketRewriter1_18.handleSpawners(typeId, tag);
                byte packedXZ = (byte)((xTag.asInt() & 0xF) << 4 | zTag.asInt() & 0xF);
                blockEntities.add(new BlockEntityImpl(packedXZ, yTag.asShort(), typeId, tag));
            }
            int[] biomeData = oldChunk.getBiomeData();
            ChunkSection[] sections = oldChunk.getSections();
            for (int i = 0; i < sections.length; ++i) {
                ChunkSection section = sections[i];
                if (section == null) {
                    sections[i] = section = new ChunkSectionImpl();
                    section.setNonAirBlocksCount(0);
                    DataPaletteImpl blockPalette = new DataPaletteImpl(4096);
                    blockPalette.addId(0);
                    section.addPalette(PaletteType.BLOCKS, (DataPalette)blockPalette);
                }
                DataPaletteImpl biomePalette = new DataPaletteImpl(64);
                section.addPalette(PaletteType.BIOMES, (DataPalette)biomePalette);
                int offset = i * 64;
                int biomeIndex = 0;
                int biomeArrayIndex = offset;
                while (biomeIndex < 64) {
                    int biome = biomeData[biomeArrayIndex];
                    biomePalette.setIdAt(biomeIndex, biome != -1 ? biome : 0);
                    ++biomeIndex;
                    ++biomeArrayIndex;
                }
            }
            Chunk1_18 chunk = new Chunk1_18(oldChunk.getX(), oldChunk.getZ(), sections, oldChunk.getHeightMap(), blockEntities);
            wrapper.write((Type)new ChunkType1_18(tracker.currentWorldSectionHeight(), MathUtil.ceilLog2((int)protocol.getMappingData().getBlockStateMappings().mappedSize()), MathUtil.ceilLog2((int)tracker.biomesSent())), (Object)chunk);
            ChunkLightStorage lightStorage = (ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class);
            boolean alreadyLoaded = !lightStorage.addLoadedChunk(chunk.getX(), chunk.getZ());
            ChunkLightStorage.ChunkLight chunkLight = light = Via.getConfig().cache1_17Light() ? lightStorage.getLight(chunk.getX(), chunk.getZ()) : lightStorage.removeLight(chunk.getX(), chunk.getZ());
            if (light == null) {
                protocol.getLogger().warning("No light data found for chunk at " + chunk.getX() + ", " + chunk.getZ() + ". Chunk was already loaded: " + alreadyLoaded);
                protocol.getLogger().warning("This means another plugin is sending chunk data in a bad order, or you need to re-enable the cache-1_17-light config option.");
                BitSet emptyLightMask = new BitSet();
                emptyLightMask.set(0, tracker.currentWorldSectionHeight() + 2);
                wrapper.write((Type)Types.BOOLEAN, (Object)false);
                wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)new long[0]);
                wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)new long[0]);
                wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)emptyLightMask.toLongArray());
                wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)emptyLightMask.toLongArray());
                wrapper.write((Type)Types.VAR_INT, (Object)0);
                wrapper.write((Type)Types.VAR_INT, (Object)0);
            } else {
                wrapper.write((Type)Types.BOOLEAN, (Object)light.trustEdges());
                wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)light.skyLightMask());
                wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)light.blockLightMask());
                wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)light.emptySkyLightMask());
                wrapper.write(Types.LONG_ARRAY_PRIMITIVE, (Object)light.emptyBlockLightMask());
                wrapper.write((Type)Types.VAR_INT, (Object)light.skyLight().length);
                for (byte[] skyLight : light.skyLight()) {
                    wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)skyLight);
                }
                wrapper.write((Type)Types.VAR_INT, (Object)light.blockLight().length);
                for (byte[] blockLight : light.blockLight()) {
                    wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)blockLight);
                }
            }
        });
        protocol.registerClientbound(ClientboundPackets1_17_1.FORGET_LEVEL_CHUNK, wrapper -> {
            int chunkX = (Integer)wrapper.passthrough((Type)Types.INT);
            int chunkZ = (Integer)wrapper.passthrough((Type)Types.INT);
            ((ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class)).clear(chunkX, chunkZ);
        });
    }

    private static void handleSpawners(int typeId, CompoundTag tag) {
        CompoundTag entity;
        if (typeId == 8 && (entity = tag.getCompoundTag("SpawnData")) != null) {
            CompoundTag spawnData = new CompoundTag();
            tag.put("SpawnData", (Tag)spawnData);
            spawnData.put("entity", (Tag)entity);
        }
    }
}

