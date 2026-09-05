/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo
 *  net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionMeshParts
 *  net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 */
package net.caffeinemc.mods.sodium.client.render.chunk.compile;

import java.util.Map;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkSortOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionInfo;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionMeshParts;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;

public class ChunkBuildOutput
extends ChunkSortOutput {
    public final BuiltSectionInfo info;
    public final TranslucentData translucentData;
    public final Map<TerrainRenderPass, BuiltSectionMeshParts> meshes;

    public ChunkBuildOutput(RenderSection renderSection, int n, TranslucentData translucentData, BuiltSectionInfo builtSectionInfo, Map<TerrainRenderPass, BuiltSectionMeshParts> map) {
        super(renderSection, n);
        this.info = builtSectionInfo;
        this.translucentData = translucentData;
        this.meshes = map;
    }

    @Override
    public void destroy() {
        super.destroy();
        for (BuiltSectionMeshParts builtSectionMeshParts : this.meshes.values()) {
            builtSectionMeshParts.getVertexData().free();
        }
    }

    public BuiltSectionMeshParts getMesh(TerrainRenderPass terrainRenderPass) {
        return this.meshes.get(terrainRenderPass);
    }

    private long getMeshSize() {
        long l = 0L;
        for (BuiltSectionMeshParts builtSectionMeshParts : this.meshes.values()) {
            l += (long)builtSectionMeshParts.getVertexData().getLength();
        }
        return l;
    }

    @Override
    public long calculateResultSize() {
        return super.calculateResultSize() + this.getMeshSize();
    }
}

