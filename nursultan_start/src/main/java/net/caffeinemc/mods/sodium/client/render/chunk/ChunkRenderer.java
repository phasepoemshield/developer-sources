/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08188
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderListIterable
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass
 *  net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform
 *  net.caffeinemc.mods.sodium.client.util.FogParameters
 */
package net.caffeinemc.mods.sodium.client.render.chunk;

import minecraft.class08188;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.render.chunk.ChunkRenderMatrices;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderListIterable;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.viewport.CameraTransform;
import net.caffeinemc.mods.sodium.client.util.FogParameters;

public interface ChunkRenderer {
    public void delete(CommandList var1);

    public void render(ChunkRenderMatrices var1, CommandList var2, ChunkRenderListIterable var3, TerrainRenderPass var4, CameraTransform var5, FogParameters var6, boolean var7, class08188 var8);
}

