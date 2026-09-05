/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk1_18
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkSectionType1_18
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.chunk;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.blockentity.BlockEntity;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk1_18;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkSectionType1_18;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;

public final class ChunkType1_18
extends Type<Chunk> {
    private final ChunkSectionType1_18 sectionType;
    private final int ySectionCount;

    public ChunkType1_18(int ySectionCount, int globalPaletteBlockBits, int globalPaletteBiomeBits) {
        super(Chunk.class);
        Preconditions.checkArgument((ySectionCount > 0 ? 1 : 0) != 0);
        this.sectionType = new ChunkSectionType1_18(globalPaletteBlockBits, globalPaletteBiomeBits);
        this.ySectionCount = ySectionCount;
    }

    public void write(ByteBuf buffer, Chunk chunk) {
        buffer.writeInt(chunk.getX());
        buffer.writeInt(chunk.getZ());
        Types.NAMED_COMPOUND_TAG.write(buffer, (Object)chunk.getHeightMap());
        Types.VAR_INT.writePrimitive(buffer, this.sectionType.serializedSize(chunk));
        for (ChunkSection section : chunk.getSections()) {
            this.sectionType.write(buffer, section);
        }
        Types.VAR_INT.writePrimitive(buffer, chunk.blockEntities().size());
        for (BlockEntity blockEntity : chunk.blockEntities()) {
            Types.BLOCK_ENTITY1_18.write(buffer, (Object)blockEntity);
        }
    }

    public Chunk read(ByteBuf buffer) {
        int chunkX = buffer.readInt();
        int chunkZ = buffer.readInt();
        CompoundTag heightMap = (CompoundTag)Types.NAMED_COMPOUND_TAG.read(buffer);
        ByteBuf sectionsBuf = buffer.readSlice(Types.VAR_INT.readPrimitive(buffer));
        ChunkSection[] sections = new ChunkSection[this.ySectionCount];
        for (int i = 0; i < this.ySectionCount; ++i) {
            sections[i] = this.sectionType.read(sectionsBuf);
        }
        int blockEntitiesLength = Types.VAR_INT.readPrimitive(buffer);
        ArrayList<BlockEntity> blockEntities = new ArrayList<BlockEntity>(blockEntitiesLength);
        for (int i = 0; i < blockEntitiesLength; ++i) {
            blockEntities.add((BlockEntity)Types.BLOCK_ENTITY1_18.read(buffer));
        }
        return new Chunk1_18(chunkX, chunkZ, sections, heightMap, blockEntities);
    }
}

