/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo$Builder
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionMeshParts
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.UpdatedQuadsList
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.nio.ByteBuffer;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.BakedChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.buffers.ChunkModelBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionMeshParts;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.material.Material;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.UpdatedQuadsList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.builder.ChunkMeshBufferBuilder;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

public class ChunkBuildBuffers {
    private static final int UNASSIGNED_SEGMENT_INDEX = ModelQuadFacing.UNASSIGNED.ordinal() << 1;
    private final Reference2ReferenceOpenHashMap<TerrainRenderPass, BakedChunkModelBuilder> builders = new Reference2ReferenceOpenHashMap();
    private final ChunkVertexType vertexType;

    public ChunkBuildBuffers(ChunkVertexType chunkVertexType) {
        this.vertexType = chunkVertexType;
        for (TerrainRenderPass terrainRenderPass : DefaultTerrainRenderPasses.ALL) {
            ChunkMeshBufferBuilder[] chunkMeshBufferBuilderArray = new ChunkMeshBufferBuilder[ModelQuadFacing.COUNT];
            for (int i = 0; i < ModelQuadFacing.COUNT; ++i) {
                chunkMeshBufferBuilderArray[i] = new ChunkMeshBufferBuilder(this.vertexType, 131072);
            }
            this.builders.put((Object)terrainRenderPass, (Object)new BakedChunkModelBuilder(chunkMeshBufferBuilderArray));
        }
    }

    public ChunkModelBuilder get(Material material) {
        return (ChunkModelBuilder)this.builders.get((Object)material.pass);
    }

    public ChunkModelBuilder get(TerrainRenderPass terrainRenderPass) {
        return (ChunkModelBuilder)this.builders.get((Object)terrainRenderPass);
    }

    public void init(BuiltSectionInfo.Builder builder, int n) {
        for (BakedChunkModelBuilder bakedChunkModelBuilder : this.builders.values()) {
            bakedChunkModelBuilder.begin(builder, n);
        }
    }

    public void destroy() {
        for (BakedChunkModelBuilder bakedChunkModelBuilder : this.builders.values()) {
            bakedChunkModelBuilder.destroy();
        }
    }

    public BuiltSectionMeshParts createModifiedTranslucentMesh(UpdatedQuadsList updatedQuadsList) {
        BakedChunkModelBuilder bakedChunkModelBuilder = (BakedChunkModelBuilder)this.builders.get((Object)DefaultTerrainRenderPasses.TRANSLUCENT);
        int n = this.vertexType.getVertexFormat().getStride();
        int n2 = TranslucentData.quadCountToVertexCount((int)updatedQuadsList.getMeshQuadCount());
        NativeBuffer nativeBuffer = new NativeBuffer(n2 * n);
        ByteBuffer byteBuffer = nativeBuffer.getDirectBuffer();
        for (ModelQuadFacing modelQuadFacing : ModelQuadFacing.VALUES) {
            ChunkMeshBufferBuilder chunkMeshBufferBuilder = bakedChunkModelBuilder.getVertexBuffer(modelQuadFacing);
            if (chunkMeshBufferBuilder.isEmpty()) continue;
            byteBuffer.put(chunkMeshBufferBuilder.slice());
        }
        updatedQuadsList.applyBufferUpdates(bakedChunkModelBuilder.getVertexBuffer(ModelQuadFacing.UNASSIGNED), byteBuffer);
        int[] nArray = ChunkBuildBuffers.makeVertexSegments();
        nArray[ChunkBuildBuffers.UNASSIGNED_SEGMENT_INDEX] = n2;
        nArray[ChunkBuildBuffers.UNASSIGNED_SEGMENT_INDEX + 1] = ModelQuadFacing.UNASSIGNED.ordinal();
        return new BuiltSectionMeshParts(nativeBuffer, nArray);
    }

    public static int[] makeVertexSegments() {
        return new int[ModelQuadFacing.COUNT << 1];
    }

    public BuiltSectionMeshParts createMesh(TerrainRenderPass terrainRenderPass, int n, boolean bl, boolean bl2) {
        BakedChunkModelBuilder bakedChunkModelBuilder = (BakedChunkModelBuilder)this.builders.get((Object)terrainRenderPass);
        int[] nArray = ChunkBuildBuffers.makeVertexSegments();
        int n2 = 0;
        for (ModelQuadFacing modelQuadFacing : ModelQuadFacing.VALUES) {
            n2 += bakedChunkModelBuilder.getVertexBuffer(modelQuadFacing).count();
        }
        if (n2 == 0) {
            return null;
        }
        NativeBuffer nativeBuffer = new NativeBuffer(n2 * this.vertexType.getVertexFormat().getStride());
        ByteBuffer byteBuffer = nativeBuffer.getDirectBuffer();
        if (bl2) {
            ChunkMeshBufferBuilder chunkMeshBufferBuilder = bakedChunkModelBuilder.getVertexBuffer(ModelQuadFacing.UNASSIGNED);
            int n3 = 0;
            nArray[n3++] = chunkMeshBufferBuilder.count();
            nArray[n3++] = ModelQuadFacing.UNASSIGNED.ordinal();
            if (!chunkMeshBufferBuilder.isEmpty()) {
                byteBuffer.put(chunkMeshBufferBuilder.slice());
            }
            for (int i = 0; i < 2; ++i) {
                for (ModelQuadFacing modelQuadFacing : ModelQuadFacing.VALUES) {
                    int n4 = modelQuadFacing.ordinal();
                    if (modelQuadFacing == ModelQuadFacing.UNASSIGNED || (n >> n4 & 1) == i) continue;
                    ChunkMeshBufferBuilder chunkMeshBufferBuilder2 = bakedChunkModelBuilder.getVertexBuffer(modelQuadFacing);
                    nArray[n3++] = chunkMeshBufferBuilder2.count();
                    nArray[n3++] = n4;
                    if (chunkMeshBufferBuilder2.isEmpty()) continue;
                    byteBuffer.put(chunkMeshBufferBuilder2.slice());
                }
            }
        } else {
            if (bl) {
                nArray[ChunkBuildBuffers.UNASSIGNED_SEGMENT_INDEX] = n2;
                nArray[ChunkBuildBuffers.UNASSIGNED_SEGMENT_INDEX + 1] = ModelQuadFacing.UNASSIGNED.ordinal();
            }
            for (ModelQuadFacing modelQuadFacing : ModelQuadFacing.VALUES) {
                ChunkMeshBufferBuilder chunkMeshBufferBuilder = bakedChunkModelBuilder.getVertexBuffer(modelQuadFacing);
                if (chunkMeshBufferBuilder.isEmpty()) continue;
                if (!bl) {
                    int n5 = modelQuadFacing.ordinal();
                    int n6 = n5 << 1;
                    nArray[n6] = chunkMeshBufferBuilder.count();
                    nArray[n6 + 1] = n5;
                }
                byteBuffer.put(chunkMeshBufferBuilder.slice());
            }
        }
        return new BuiltSectionMeshParts(nativeBuffer, nArray);
    }
}

