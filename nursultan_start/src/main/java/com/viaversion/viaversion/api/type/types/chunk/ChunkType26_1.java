/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkSectionType1_18
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkSectionType26_1
 */
package com.viaversion.viaversion.api.type.types.chunk;

import com.viaversion.viaversion.api.type.types.chunk.ChunkSectionType1_18;
import com.viaversion.viaversion.api.type.types.chunk.ChunkSectionType26_1;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_21_5;

public final class ChunkType26_1
extends ChunkType1_21_5 {
    public ChunkType26_1(int ySectionCount, int globalPaletteBlockBits, int globalPaletteBiomeBits) {
        super((ChunkSectionType1_18)new ChunkSectionType26_1(globalPaletteBlockBits, globalPaletteBiomeBits), ySectionCount);
    }
}

