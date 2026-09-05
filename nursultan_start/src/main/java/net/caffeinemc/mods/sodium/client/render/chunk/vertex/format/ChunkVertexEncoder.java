/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.render.chunk.vertex.format;

import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex;

public interface ChunkVertexEncoder {
    public long write(long var1, int var3, ChunkVertexEncoder$Vertex[] var4, int var5);
}

