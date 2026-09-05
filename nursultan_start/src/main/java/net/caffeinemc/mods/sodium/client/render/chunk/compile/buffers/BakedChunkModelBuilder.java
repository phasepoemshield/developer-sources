/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01391
 *  minecraft.class08388
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo$Builder
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers;

import minecraft.class01391;
import minecraft.class08388;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkVertexConsumer;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder;
import org.jspecify.annotations.NonNull;

public class BakedChunkModelBuilder
implements ChunkModelBuilder {
    private final ChunkMeshBufferBuilder[] vertexBuffers;
    private final ChunkVertexConsumer fallbackVertexConsumer = new ChunkVertexConsumer(this);
    private BuiltSectionInfo.Builder renderData;

    public BakedChunkModelBuilder(ChunkMeshBufferBuilder[] chunkMeshBufferBuilderArray) {
        this.vertexBuffers = chunkMeshBufferBuilderArray;
    }

    public void begin(BuiltSectionInfo.Builder builder, int n) {
        this.renderData = builder;
        for (ChunkMeshBufferBuilder chunkMeshBufferBuilder : this.vertexBuffers) {
            chunkMeshBufferBuilder.start(n);
        }
    }

    public void destroy() {
        for (ChunkMeshBufferBuilder chunkMeshBufferBuilder : this.vertexBuffers) {
            chunkMeshBufferBuilder.destroy();
        }
    }

    @Override
    public ChunkMeshBufferBuilder getVertexBuffer(ModelQuadFacing modelQuadFacing) {
        return this.vertexBuffers[modelQuadFacing.ordinal()];
    }

    @Override
    public void addSprite(@NonNull class08388 class083882) {
        this.renderData.addSprite(class083882);
    }

    @Override
    public class01391 asFallbackVertexConsumer(Material material, TranslucentGeometryCollector translucentGeometryCollector) {
        this.fallbackVertexConsumer.setData(material, translucentGeometryCollector);
        return this.fallbackVertexConsumer;
    }
}

