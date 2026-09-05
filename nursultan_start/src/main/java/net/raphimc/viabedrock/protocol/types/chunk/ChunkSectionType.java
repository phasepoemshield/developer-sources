/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 *  net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection
 */
package net.raphimc.viabedrock.protocol.types.chunk;

import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import net.raphimc.viabedrock.api.chunk.section.BedrockChunkSection;
import net.raphimc.viabedrock.protocol.types.chunk.ChunkSectionV0Type;
import net.raphimc.viabedrock.protocol.types.chunk.ChunkSectionV1Type;
import net.raphimc.viabedrock.protocol.types.chunk.ChunkSectionV8Type;
import net.raphimc.viabedrock.protocol.types.chunk.ChunkSectionV9Type;

public class ChunkSectionType
extends Type<BedrockChunkSection> {
    private final Type<BedrockChunkSection> V0 = new ChunkSectionV0Type();
    private final Type<BedrockChunkSection> V1 = new ChunkSectionV1Type();
    private final Type<BedrockChunkSection> V8 = new ChunkSectionV8Type();
    private final Type<BedrockChunkSection> V9 = new ChunkSectionV9Type();

    public ChunkSectionType() {
        super(BedrockChunkSection.class);
    }

    public void write(ByteBuf buffer, BedrockChunkSection value) {
        throw new UnsupportedOperationException("Cannot serialize ChunkSectionType");
    }

    public BedrockChunkSection read(ByteBuf buffer) {
        byte version = buffer.readByte();
        return switch (version) {
            case 0, 2, 3, 4, 5, 6, 7 -> (BedrockChunkSection)this.V0.read(buffer);
            case 1 -> (BedrockChunkSection)this.V1.read(buffer);
            case 8 -> (BedrockChunkSection)this.V8.read(buffer);
            case 9 -> (BedrockChunkSection)this.V9.read(buffer);
            default -> throw new UnsupportedOperationException("Unknown chunk section version: " + version);
        };
    }
}

