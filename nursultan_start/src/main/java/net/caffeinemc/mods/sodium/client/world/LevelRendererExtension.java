/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer
 *  net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices
 */
package net.caffeinemc.mods.sodium.client.world;

import net.caffeinemc.mods.sodium.client.render.SodiumWorldRenderer;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;

public interface LevelRendererExtension {
    public ChunkRenderMatrices sodium$getMatrices();

    public void sodium$setMatrices(ChunkRenderMatrices var1);

    public SodiumWorldRenderer sodium$getWorldRenderer();
}

