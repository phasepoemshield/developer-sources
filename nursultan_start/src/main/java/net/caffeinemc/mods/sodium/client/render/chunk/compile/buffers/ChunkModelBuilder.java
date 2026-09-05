/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers;

import minecraft.class01391;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder;
import org.jspecify.annotations.NonNull;

public interface ChunkModelBuilder {
    public ChunkMeshBufferBuilder getVertexBuffer(ModelQuadFacing var1);

    public void addSprite(@NonNull class08388 var1);

    public class01391 asFallbackVertexConsumer(Material var1, TranslucentGeometryCollector var2);
}

