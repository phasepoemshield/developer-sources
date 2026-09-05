/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.api.chunk.datapalette.BedrockBlockArray
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSectionImpl
 */
package net.raphimc.viabedrock.protocol.types.chunk;

import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.api.chunk.datapalette.BedrockBlockArray;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSectionImpl;

public class ChunkSectionV0Type
extends Type<BedrockChunkSection> {
    public ChunkSectionV0Type() {
        super(BedrockChunkSection.class);
    }

    public void write(ByteBuf buffer, BedrockChunkSection value) {
        BedrockBlockArray blockArray = (BedrockBlockArray)value.palette(PaletteType.BLOCKS);
        buffer.writeBytes(blockArray.getBlocks());
        buffer.writeBytes(blockArray.getData().getHandle());
    }

    public BedrockChunkSection read(ByteBuf buffer) {
        BedrockBlockArray blockArray = new BedrockBlockArray();
        buffer.readBytes(blockArray.getBlocks());
        buffer.readBytes(blockArray.getData().getHandle());
        BedrockChunkSectionImpl chunkSection = new BedrockChunkSectionImpl();
        chunkSection.addPalette(PaletteType.BLOCKS, (DataPalette)blockArray);
        return chunkSection;
    }
}

