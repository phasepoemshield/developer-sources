/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSection
 *  com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionImpl
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.util.BiIntConsumer
 *  com.viaversion.viaversion.util.CompactArrayUtil
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.chunk;

import com.viaversion.viaversion.api.minecraft.chunks.ChunkSection;
import com.viaversion.viaversion.api.minecraft.chunks.ChunkSectionImpl;
import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.util.BiIntConsumer;
import com.viaversion.viaversion.util.CompactArrayUtil;
import io.netty.buffer.ByteBuf;
import java.util.function.IntToLongFunction;

public class ChunkSectionType1_9
extends Type<ChunkSection> {
    private static final int GLOBAL_PALETTE = 13;

    public ChunkSectionType1_9() {
        super(ChunkSection.class);
    }

    public void write(ByteBuf buffer, ChunkSection chunkSection) {
        int bitsPerBlock = 4;
        DataPalette blockPalette = chunkSection.palette(PaletteType.BLOCKS);
        while (blockPalette.size() > 1 << bitsPerBlock) {
            ++bitsPerBlock;
        }
        if (bitsPerBlock > 8) {
            bitsPerBlock = 13;
        }
        buffer.writeByte(bitsPerBlock);
        if (bitsPerBlock != 13) {
            Types.VAR_INT.writePrimitive(buffer, blockPalette.size());
            for (int i = 0; i < blockPalette.size(); ++i) {
                Types.VAR_INT.writePrimitive(buffer, blockPalette.idByIndex(i));
            }
        } else {
            Types.VAR_INT.writePrimitive(buffer, 0);
        }
        long[] data = CompactArrayUtil.createCompactArray((int)bitsPerBlock, (int)4096, (IntToLongFunction)(bitsPerBlock == 13 ? arg_0 -> ((DataPalette)blockPalette).idAt(arg_0) : arg_0 -> ((DataPalette)blockPalette).paletteIndexAt(arg_0)));
        Types.LONG_ARRAY_PRIMITIVE.write(buffer, (Object)data);
    }

    public ChunkSection read(ByteBuf buffer) {
        int expectedLength;
        int bitsPerBlock = buffer.readUnsignedByte();
        if (bitsPerBlock < 4) {
            bitsPerBlock = 4;
        }
        if (bitsPerBlock > 8) {
            bitsPerBlock = 13;
        }
        int paletteLength = Types.VAR_INT.readPrimitive(buffer);
        ChunkSectionImpl chunkSection = bitsPerBlock != 13 ? new ChunkSectionImpl(true, paletteLength) : new ChunkSectionImpl(true);
        DataPalette blockPalette = chunkSection.palette(PaletteType.BLOCKS);
        for (int i = 0; i < paletteLength; ++i) {
            if (bitsPerBlock != 13) {
                blockPalette.addId(Types.VAR_INT.readPrimitive(buffer));
                continue;
            }
            Types.VAR_INT.readPrimitive(buffer);
        }
        long[] blockData = (long[])Types.LONG_ARRAY_PRIMITIVE.read(buffer);
        if (blockData.length > 0 && blockData.length == (expectedLength = (int)Math.ceil((double)(4096 * bitsPerBlock) / 64.0))) {
            CompactArrayUtil.iterateCompactArray((int)bitsPerBlock, (int)4096, (long[])blockData, (BiIntConsumer)(bitsPerBlock == 13 ? (arg_0, arg_1) -> ((DataPalette)blockPalette).setIdAt(arg_0, arg_1) : (arg_0, arg_1) -> ((DataPalette)blockPalette).setPaletteIndexAt(arg_0, arg_1)));
        }
        return chunkSection;
    }
}

