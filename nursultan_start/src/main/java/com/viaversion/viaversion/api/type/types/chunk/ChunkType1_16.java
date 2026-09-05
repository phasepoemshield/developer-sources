/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.chunks.BaseChunk
 *  com.viaversion.viaversion.api.minecraft.chunks.Chunk
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.chunk;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.chunks.BaseChunk;
import com.viaversion.viaversion.api.minecraft.chunks.Chunk;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Arrays;

public class ChunkType1_16
extends Type<Chunk> {
    public static final Type<Chunk> TYPE = new ChunkType1_16();
    private static final CompoundTag[] EMPTY_COMPOUNDS = new CompoundTag[0];

    public ChunkType1_16() {
        super(Chunk.class);
    }

    public Chunk read(ByteBuf input) {
        int[] biomeData;
        int chunkX = input.readInt();
        int chunkZ = input.readInt();
        boolean fullChunk = input.readBoolean();
        boolean ignoreOldLightData = input.readBoolean();
        int primaryBitmask = Types.VAR_INT.readPrimitive(input);
        CompoundTag heightMap = (CompoundTag)Types.NAMED_COMPOUND_TAG.read(input);
        int[] nArray = biomeData = fullChunk ? new int[1024] : null;
        if (fullChunk) {
            for (int i = 0; i < 1024; ++i) {
                biomeData[i] = input.readInt();
            }
        }
        ByteBuf data = input.readSlice(Types.VAR_INT.readPrimitive(input));
        ChunkSection[] sections = new ChunkSection[16];
        for (int i = 0; i < 16; ++i) {
            if ((primaryBitmask & 1 << i) == 0) continue;
            short nonAirBlocksCount = data.readShort();
            ChunkSection section = (ChunkSection)Types.CHUNK_SECTION1_16.read(data);
            section.setNonAirBlocksCount((int)nonAirBlocksCount);
            sections[i] = section;
        }
        ArrayList<CompoundTag> nbtData = new ArrayList<CompoundTag>(Arrays.asList((CompoundTag[])Types.NAMED_COMPOUND_TAG_ARRAY.read(input)));
        return new BaseChunk(chunkX, chunkZ, fullChunk, ignoreOldLightData, primaryBitmask, sections, biomeData, heightMap, nbtData);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public void write(ByteBuf output, Chunk chunk) {
        output.writeInt(chunk.getX());
        output.writeInt(chunk.getZ());
        output.writeBoolean(chunk.isFullChunk());
        output.writeBoolean(chunk.isIgnoreOldLightData());
        Types.VAR_INT.writePrimitive(output, chunk.getBitmask());
        Types.NAMED_COMPOUND_TAG.write(output, (Object)chunk.getHeightMap());
        if (chunk.isBiomeData()) {
            for (int value : chunk.getBiomeData()) {
                output.writeInt(value);
            }
        }
        ByteBuf buf = output.alloc().buffer();
        try {
            for (int i = 0; i < 16; ++i) {
                ChunkSection section = chunk.getSections()[i];
                if (section == null) continue;
                buf.writeShort(section.getNonAirBlocksCount());
                Types.CHUNK_SECTION1_16.write(buf, (Object)section);
            }
            buf.readerIndex(0);
            Types.VAR_INT.writePrimitive(output, buf.readableBytes());
            output.writeBytes(buf);
        }
        finally {
            buf.release();
        }
        Types.NAMED_COMPOUND_TAG_ARRAY.write(output, (Object)chunk.getBlockEntities().toArray(EMPTY_COMPOUNDS));
    }
}

