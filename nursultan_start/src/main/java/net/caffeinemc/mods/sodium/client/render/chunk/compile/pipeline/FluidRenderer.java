/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04688
 *  minecraft.class07209
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers
 *  net.caffeinemc.mods.sodium.client.world.LevelSlice
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.pipeline;

import minecraft.class00500;
import minecraft.class04688;
import minecraft.class07209;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildBuffers;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.world.LevelSlice;

public abstract class FluidRenderer {
    public abstract void render(LevelSlice var1, class00500 var2, class04688 var3, class07209 var4, class07209 var5, TranslucentGeometryCollector var6, ChunkBuildBuffers var7);
}

