/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03448
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderCache
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile;

import minecraft.class03448;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline.BlockRenderCache;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;

public class ChunkBuildContext {
    public final ChunkBuildBuffers buffers;
    public final BlockRenderCache cache;

    public ChunkBuildContext(class03448 class034482, ChunkVertexType chunkVertexType) {
        this.buffers = new ChunkBuildBuffers(chunkVertexType);
        this.cache = new BlockRenderCache(class06202.Nq(), class034482);
    }

    public void cleanup() {
        this.buffers.destroy();
        this.cache.cleanup();
    }
}

