/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.FullMappings
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.BlockChangeRecord
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList
 *  com.viaversion.viaversion.util.MathUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.rewriter;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.FullMappings;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.BlockChangeRecord;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntityImpl;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.util.MathUtil;
import java.util.List;
import java.util.function.BiConsumer;
import org.checkerframework.checker.nullness.qual.Nullable;

public class BlockRewriter<C extends ClientboundPacketType> {
    protected final Protocol<C, ?, ?, ?> protocol;
    private final Type<BlockPosition> positionType;
    private final Type<CompoundTag> compoundTagType;
    private final ChunkTypeSupplier chunkTypeSupplier;
    private final ChunkTypeSupplier mappedChunkTypeSupplier;

    public BlockRewriter(Protocol<C, ?, ?, ?> protocol, Type<BlockPosition> positionType, Type<CompoundTag> compoundTagType, ChunkTypeSupplier chunkTypeSupplier, @Nullable ChunkTypeSupplier mappedChunkTypeSupplier) {
        this.protocol = protocol;
        this.positionType = positionType;
        this.compoundTagType = compoundTagType;
        this.chunkTypeSupplier = chunkTypeSupplier;
        this.mappedChunkTypeSupplier = mappedChunkTypeSupplier;
    }

    public void registerLevelEvent1_13(C packetType) {
        this.registerLevelEvent(packetType, 1010, 2001);
    }

    public void registerChunkBlocksUpdate(C packetType) {
        if (Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getBlockStateMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough((Type)Types.INT);
            for (BlockChangeRecord record : (BlockChangeRecord[])wrapper.passthrough(Types.BLOCK_CHANGE_ARRAY)) {
                record.setBlockId(this.protocol.getMappingData().getNewBlockStateId(record.getBlockId()));
            }
        });
    }

    public void registerBlockUpdate(C packetType) {
        if (Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getBlockStateMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(this.positionType);
            int blockId = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)this.protocol.getMappingData().getNewBlockStateId(blockId));
        });
    }

    public void registerLevelEvent1_21(C packetType) {
        this.registerLevelEvent(packetType, -1, 2001);
    }

    public void handleBlockEntities(Chunk chunk, UserConnection connection) {
        int i;
        FullMappings blockEntityMappings = this.protocol.getMappingData().getBlockEntityMappings();
        List blockEntities = chunk.blockEntities();
        IntArrayList toRemove = new IntArrayList(0);
        for (i = 0; i < blockEntities.size(); ++i) {
            BlockEntity blockEntity = (BlockEntity)blockEntities.get(i);
            if (blockEntityMappings != null) {
                int id = blockEntity.typeId();
                int mappedId = blockEntityMappings.getNewId(id);
                if (mappedId == -1) {
                    toRemove.add(i);
                    continue;
                }
                if (id != mappedId) {
                    blockEntity = blockEntity.withTypeId(mappedId);
                    blockEntities.set(i, blockEntity);
                }
            }
            if (blockEntity.tag() == null) continue;
            this.handleBlockEntity(connection, blockEntity);
        }
        if (!toRemove.isEmpty()) {
            for (i = toRemove.size() - 1; i >= 0; --i) {
                blockEntities.remove(toRemove.getInt(i));
            }
        }
    }

    public void registerLevelChunk1_18(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            Chunk chunk = this.handleChunk1_18(wrapper);
            this.handleBlockEntities(chunk, wrapper.user());
        });
    }

    public void registerBlockBreakAck(C packetType) {
        this.registerBlockUpdate(packetType);
    }

    public void registerBlockEntityData1_18(C packetType) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.passthrough(this.positionType);
            int blockEntityId = (Integer)wrapper.read((Type)Types.VAR_INT);
            FullMappings mappings = this.protocol.getMappingData().getBlockEntityMappings();
            if (mappings != null) {
                int mappedBlockEntityId = mappings.getNewId(blockEntityId);
                if (mappedBlockEntityId == -1) {
                    wrapper.cancel();
                    return;
                }
                wrapper.write((Type)Types.VAR_INT, (Object)mappedBlockEntityId);
            } else {
                wrapper.write((Type)Types.VAR_INT, (Object)blockEntityId);
            }
            CompoundTag tag = (CompoundTag)wrapper.passthrough(this.compoundTagType);
            if (tag != null) {
                BlockEntityImpl blockEntity = new BlockEntityImpl(BlockEntity.pack((int)position.x(), (int)position.z()), (short)position.y(), blockEntityId, tag);
                this.handleBlockEntity(wrapper.user(), (BlockEntity)blockEntity);
            }
        });
    }

    public void registerSectionBlocksUpdate(C packetType) {
        if (Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getBlockStateMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.BOOLEAN);
            for (BlockChangeRecord record : (BlockChangeRecord[])wrapper.passthrough(Types.VAR_LONG_BLOCK_CHANGE_ARRAY)) {
                record.setBlockId(this.protocol.getMappingData().getNewBlockStateId(record.getBlockId()));
            }
        });
    }

    public void registerSectionBlocksUpdate1_20(C packetType) {
        if (Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getBlockStateMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough((Type)Types.LONG);
            for (BlockChangeRecord record : (BlockChangeRecord[])wrapper.passthrough(Types.VAR_LONG_BLOCK_CHANGE_ARRAY)) {
                record.setBlockId(this.protocol.getMappingData().getNewBlockStateId(record.getBlockId()));
            }
        });
    }

    public void registerBlockEvent(C packetType) {
        if (Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getBlockMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            wrapper.passthrough(this.positionType);
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            int blockId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int mappedId = this.protocol.getMappingData().getNewBlockId(blockId);
            if (mappedId == -1) {
                wrapper.cancel();
                return;
            }
            if (blockId != mappedId) {
                wrapper.set((Type)Types.VAR_INT, 0, (Object)mappedId);
            }
        });
    }

    public Chunk handleChunk1_18(PacketWrapper wrapper) {
        EntityTracker tracker = this.protocol.getEntityRewriter().tracker(wrapper.user());
        Preconditions.checkArgument((tracker.biomesSent() != -1 ? 1 : 0) != 0, (Object)"Biome count not set");
        Preconditions.checkArgument((tracker.currentWorldSectionHeight() != -1 ? 1 : 0) != 0, (Object)"Section height not set");
        Type<Chunk> chunkType = this.createChunkType(this.chunkTypeSupplier, tracker, false);
        Type<Chunk> mappedChunkType = this.mappedChunkTypeSupplier != null ? this.createChunkType(this.mappedChunkTypeSupplier, tracker, true) : chunkType;
        Chunk chunk = (Chunk)wrapper.passthroughAndMap(chunkType, mappedChunkType);
        if (Mappings.isIntIdIdentity((Mappings)this.protocol.getMappingData().getBlockStateMappings())) {
            return chunk;
        }
        for (ChunkSection section : chunk.getSections()) {
            DataPalette blockPalette = section.palette(PaletteType.BLOCKS);
            blockPalette.replaceIds(arg_0 -> ((MappingData)this.protocol.getMappingData()).getNewBlockStateId(arg_0));
        }
        return chunk;
    }

    public void handleChunk(Chunk chunk) {
        for (int s = 0; s < chunk.getSections().length; ++s) {
            ChunkSection section = chunk.getSections()[s];
            if (section == null) continue;
            DataPalette palette = section.palette(PaletteType.BLOCKS);
            palette.replaceIds(arg_0 -> ((MappingData)this.protocol.getMappingData()).getNewBlockStateId(arg_0));
        }
    }

    public void handleBlockEntity(UserConnection connection, BlockEntity blockEntity) {
    }

    protected Type<Chunk> createChunkType(ChunkTypeSupplier supplier, EntityTracker tracker, boolean mapped) {
        Mappings mappings = this.protocol.getMappingData().getBlockStateMappings();
        return supplier.supply(tracker.currentWorldSectionHeight(), MathUtil.ceilLog2((int)(mapped ? mappings.mappedSize() : mappings.size())), MathUtil.ceilLog2((int)tracker.biomesSent()));
    }

    public void registerLevelChunk(C packetType, Type<Chunk> chunkType, Type<Chunk> newChunkType, @Nullable BiConsumer<UserConnection, Chunk> chunkRewriter) {
        this.protocol.registerClientbound(packetType, wrapper -> {
            Chunk chunk = (Chunk)wrapper.read(chunkType);
            wrapper.write(newChunkType, (Object)chunk);
            this.handleChunk(chunk);
            if (chunkRewriter != null) {
                chunkRewriter.accept(wrapper.user(), chunk);
            }
        });
    }

    public void registerLevelChunk(C packetType, Type<Chunk> chunkType, Type<Chunk> newChunkType) {
        this.registerLevelChunk(packetType, chunkType, newChunkType, null);
    }

    private void registerLevelEvent(C packetType, int playRecordId, int blockBreakId) {
        MappingData mappingData = this.protocol.getMappingData();
        if (mappingData == null || Mappings.isIntIdIdentity((Mappings)mappingData.getItemMappings()) && Mappings.isIntIdIdentity((Mappings)mappingData.getBlockStateMappings())) {
            return;
        }
        this.protocol.registerClientbound(packetType, wrapper -> {
            int id = (Integer)wrapper.passthrough((Type)Types.INT);
            wrapper.passthrough(this.positionType);
            int data = (Integer)wrapper.read((Type)Types.INT);
            if (playRecordId != -1 && id == playRecordId && mappingData.getItemMappings() != null) {
                wrapper.write((Type)Types.INT, (Object)mappingData.getNewItemId(data));
            } else if (id == blockBreakId && mappingData.getBlockStateMappings() != null) {
                wrapper.write((Type)Types.INT, (Object)mappingData.getNewBlockStateId(data));
            } else {
                wrapper.write((Type)Types.INT, (Object)data);
            }
        });
    }

    public static <C extends ClientboundPacketType> BlockRewriter<C> legacy(Protocol<C, ?, ?, ?> protocol) {
        return new BlockRewriter<C>(protocol, (Type<BlockPosition>)Types.BLOCK_POSITION1_8, (Type<CompoundTag>)Types.NAMED_COMPOUND_TAG, null, null);
    }

    public static <C extends ClientboundPacketType> BlockRewriter<C> for1_18(Protocol<C, ?, ?, ?> protocol, ChunkTypeSupplier chunkTypeSupplier, ChunkTypeSupplier mappedChunkTypeSupplier) {
        return new BlockRewriter<C>(protocol, (Type<BlockPosition>)Types.BLOCK_POSITION1_14, (Type<CompoundTag>)Types.NAMED_COMPOUND_TAG, chunkTypeSupplier, mappedChunkTypeSupplier);
    }

    public static <C extends ClientboundPacketType> BlockRewriter<C> for1_18(Protocol<C, ?, ?, ?> protocol, ChunkTypeSupplier chunkTypeSupplier) {
        return BlockRewriter.for1_18(protocol, chunkTypeSupplier, null);
    }

    public static <C extends ClientboundPacketType> BlockRewriter<C> for1_20_2(Protocol<C, ?, ?, ?> protocol, ChunkTypeSupplier chunkTypeSupplier) {
        return BlockRewriter.for1_20_2(protocol, chunkTypeSupplier, null);
    }

    public static <C extends ClientboundPacketType> BlockRewriter<C> for1_20_2(Protocol<C, ?, ?, ?> protocol, ChunkTypeSupplier chunkTypeSupplier, ChunkTypeSupplier mappedChunkTypeSupplier) {
        return new BlockRewriter<C>(protocol, (Type<BlockPosition>)Types.BLOCK_POSITION1_14, (Type<CompoundTag>)Types.TRUSTED_COMPOUND_TAG, chunkTypeSupplier, mappedChunkTypeSupplier);
    }

    public static <C extends ClientboundPacketType> BlockRewriter<C> for1_14(Protocol<C, ?, ?, ?> protocol) {
        return new BlockRewriter<C>(protocol, (Type<BlockPosition>)Types.BLOCK_POSITION1_14, (Type<CompoundTag>)Types.NAMED_COMPOUND_TAG, null, null);
    }

    @FunctionalInterface
    public static interface ChunkTypeSupplier {
        public Type<Chunk> supply(int var1, int var2, int var3);
    }
}

