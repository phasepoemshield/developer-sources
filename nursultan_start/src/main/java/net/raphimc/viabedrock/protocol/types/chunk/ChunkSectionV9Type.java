/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.chunks.DataPalette
 *  com.viaversion.viaversion.api.minecraft.chunks.PaletteType
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSectionImpl
 */
package net.raphimc.viabedrock.protocol.types.chunk;

import com.viaversion.viaversion.api.minecraft.chunks.DataPalette;
import com.viaversion.viaversion.api.minecraft.chunks.PaletteType;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.util.List;
import net.raphimc.viabedrock.api.chunk.datapalette.BedrockDataPalette;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSectionImpl;
import net.raphimc.viabedrock.protocol.types.BedrockTypes;

public class ChunkSectionV9Type
extends Type<BedrockChunkSection> {
    public ChunkSectionV9Type() {
        super(BedrockChunkSection.class);
    }

    public void write(ByteBuf buffer, BedrockChunkSection value) {
        List palettes = value.palettes(PaletteType.BLOCKS);
        buffer.writeByte(palettes.size());
        buffer.writeByte(0);
        for (DataPalette palette : palettes) {
            BedrockTypes.DATA_PALETTE.write(buffer, (Object)((BedrockDataPalette)palette));
        }
    }

    public BedrockChunkSection read(ByteBuf buffer) {
        BedrockChunkSectionImpl chunkSection = new BedrockChunkSectionImpl();
        int layers = buffer.readUnsignedByte();
        buffer.readUnsignedByte();
        for (int i = 0; i < layers; ++i) {
            chunkSection.addPalette(PaletteType.BLOCKS, (DataPalette)BedrockTypes.DATA_PALETTE.read(buffer));
        }
        return chunkSection;
    }
}

