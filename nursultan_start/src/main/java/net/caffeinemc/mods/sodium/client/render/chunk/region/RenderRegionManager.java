/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap$Entry
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceMap$FastEntrySet
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  minecraft.class03386
 *  minecraft.class04643
 *  minecraft.class06202
 *  minecraft.class08700
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena
 *  net.caffeinemc.mods.sodium.client.gl.arena.PendingUpload
 *  net.caffeinemc.mods.sodium.client.gl.arena.staging.FallbackStagingBuffer
 *  net.caffeinemc.mods.sodium.client.gl.arena.staging.MappedStagingBuffer
 *  net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.gl.device.RenderDevice
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildOutput
 *  net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkSortOutput
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.SharedIndexSorter
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter
 *  net.irisshaders.iris.mixinterface.ShadowRenderRegion
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.render.chunk.region;

import it.unimi.dsi.fastutil.longs.Long2ReferenceOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceMap;
import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import minecraft.class03386;
import minecraft.class04643;
import minecraft.class06202;
import minecraft.class08700;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.gl.arena.GlBufferArena;
import net.caffeinemc.mods.sodium.client.gl.arena.PendingUpload;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.FallbackStagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.MappedStagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.RenderDevice;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.BuilderTaskOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkBuildOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.compile.ChunkSortOutput;
import net.caffeinemc.mods.sodium.client.render.chunk.data.BuiltSectionMeshParts;
import net.caffeinemc.mods.sodium.client.render.chunk.data.SectionRenderDataStorage;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegionManager$PendingSectionIndexBufferUpload;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegionManager$PendingSectionMeshUpload;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.SharedIndexSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.Sorter;
import net.irisshaders.iris.mixinterface.ShadowRenderRegion;
import org.jspecify.annotations.NonNull;

public class RenderRegionManager {
    private final Long2ReferenceOpenHashMap<RenderRegion> regions = new Long2ReferenceOpenHashMap();
    private final StagingBuffer stagingBuffer;

    private @NonNull RenderRegion create(int n, int n2, int n3) {
        long l = RenderRegion.key(n, n2, n3);
        RenderRegion renderRegion = (RenderRegion)this.regions.get(l);
        if (renderRegion == null) {
            renderRegion = new RenderRegion(n, n2, n3, this.stagingBuffer);
            this.regions.put(l, (Object)renderRegion);
        }
        return renderRegion;
    }

    public RenderRegionManager(CommandList commandList) {
        this.stagingBuffer = RenderRegionManager.createStagingBuffer(commandList);
    }

    public void update() {
        this.stagingBuffer.flip();
        try (CommandList commandList = RenderDevice.INSTANCE.createCommandList();){
            ObjectIterator objectIterator = this.regions.values().iterator();
            while (objectIterator.hasNext()) {
                RenderRegion renderRegion = (RenderRegion)objectIterator.next();
                renderRegion.update(commandList);
                if (!renderRegion.isEmpty()) continue;
                renderRegion.delete(commandList);
                objectIterator.remove();
            }
        }
    }

    public void delete(CommandList commandList) {
        for (RenderRegion renderRegion : this.regions.values()) {
            renderRegion.delete(commandList);
        }
        this.regions.clear();
        this.stagingBuffer.delete(commandList);
    }

    private void redirect$bin000$iris$forceClear(RenderRegion renderRegion) {
        ((ShadowRenderRegion)renderRegion).iris$forceClearAllBatches();
    }

    public void uploadResults(CommandList commandList, Collection<BuilderTaskOutput> collection) {
        for (Reference2ReferenceMap.Entry entry : this.createMeshUploadQueues(collection)) {
            this.uploadResults(commandList, (RenderRegion)entry.getKey(), (Collection)entry.getValue());
        }
    }

    private void uploadResults(CommandList commandList, RenderRegion renderRegion, Collection<BuilderTaskOutput> collection) {
        Sorter sorter;
        ChunkBuildOutput chunkBuildOutput;
        int n;
        ArrayList<RenderRegionManager$PendingSectionMeshUpload> arrayList = new ArrayList<RenderRegionManager$PendingSectionMeshUpload>();
        ArrayList<RenderRegionManager$PendingSectionIndexBufferUpload> arrayList2 = new ArrayList<RenderRegionManager$PendingSectionIndexBufferUpload>();
        for (BuilderTaskOutput object2 : collection) {
            n = object2.render.getSectionIndex();
            if (object2.render.isDisposed()) {
                throw new IllegalStateException("Render section is disposed");
            }
            if (object2 instanceof ChunkBuildOutput) {
                chunkBuildOutput = (ChunkBuildOutput)object2;
                for (Sorter sorter2 : DefaultTerrainRenderPasses.ALL) {
                    SectionRenderDataStorage sectionRenderDataStorage = renderRegion.getStorage((TerrainRenderPass)sorter2);
                    if (sectionRenderDataStorage != null) {
                        sectionRenderDataStorage.removeVertexData(n);
                        renderRegion.clearCachedBatchFor((TerrainRenderPass)sorter2);
                    }
                    BuiltSectionMeshParts builtSectionMeshParts = chunkBuildOutput.getMesh((TerrainRenderPass)sorter2);
                    int n2 = -1;
                    if (!object2.render.isBuilt()) {
                        n2 = Math.toIntExact(System.currentTimeMillis() - renderRegion.getCreationTime());
                    }
                    if (builtSectionMeshParts == null) continue;
                    arrayList.add(new RenderRegionManager$PendingSectionMeshUpload(object2.render, n2, builtSectionMeshParts, (TerrainRenderPass)sorter2, new PendingUpload(builtSectionMeshParts.getVertexData())));
                }
            }
            if (!(object2 instanceof ChunkSortOutput) || (chunkBuildOutput = (ChunkSortOutput)object2).isReusingUploadedIndexData()) continue;
            sorter = chunkBuildOutput.getSorter();
            if (sorter instanceof SharedIndexSorter) {
                SharedIndexSorter f = (SharedIndexSorter)sorter;
                SectionRenderDataStorage sectionRenderDataStorage = renderRegion.createStorage(DefaultTerrainRenderPasses.TRANSLUCENT);
                sectionRenderDataStorage.removeIndexData(n);
                if (!sectionRenderDataStorage.setSharedIndexUsage(n, f.quadCount())) continue;
                renderRegion.clearCachedBatchFor(DefaultTerrainRenderPasses.TRANSLUCENT);
                continue;
            }
            SectionRenderDataStorage glBufferArena = renderRegion.getStorage(DefaultTerrainRenderPasses.TRANSLUCENT);
            if (glBufferArena != null) {
                glBufferArena.removeIndexData(n);
                glBufferArena.setSharedIndexUsage(n, 0);
                renderRegion.clearCachedBatchFor(DefaultTerrainRenderPasses.TRANSLUCENT);
            }
            if (sorter == null || (glBufferArena = sorter.getIndexBuffer()) == null) continue;
            arrayList2.add(new RenderRegionManager$PendingSectionIndexBufferUpload(object2.render, new PendingUpload(glBufferArena)));
        }
        class04643 class046432 = class08700.N();
        SectionRenderDataStorage sectionRenderDataStorage = renderRegion.getStorage(DefaultTerrainRenderPasses.TRANSLUCENT);
        int n3 = n = sectionRenderDataStorage != null && sectionRenderDataStorage.needsSharedIndexUpdate() ? 1 : 0;
        if (arrayList.isEmpty() && arrayList2.isEmpty() && n == 0) {
            return;
        }
        chunkBuildOutput = ((class03386)class06202.Nq().i_5).s().y();
        sorter = renderRegion.createResources(commandList);
        float f = renderRegion.getFillFractionInv();
        class046432.N("upload_vertices");
        if (!arrayList.isEmpty()) {
            GlBufferArena bl = sorter.getGeometryArena();
            boolean bl2 = bl.upload(commandList, arrayList.stream().map(renderRegionManager$PendingSectionMeshUpload -> renderRegionManager$PendingSectionMeshUpload.vertexUpload), f);
            if (bl2) {
                renderRegion.refreshTesselation(commandList);
                RenderRegion renderRegion2 = renderRegion;
                this.redirect$bin000$iris$forceClear(renderRegion2);
            }
            for (RenderRegionManager$PendingSectionMeshUpload renderRegionManager$PendingSectionMeshUpload2 : arrayList) {
                SectionRenderDataStorage sectionRenderDataStorage2 = renderRegion.createStorage(renderRegionManager$PendingSectionMeshUpload2.pass);
                if (renderRegionManager$PendingSectionMeshUpload2.relativeBuiltTime != -1) {
                    double d;
                    double d2;
                    double d3 = (double)renderRegionManager$PendingSectionMeshUpload2.section.getCenterX() - chunkBuildOutput.M;
                    double d4 = d3 * d3 + (d2 = (double)renderRegionManager$PendingSectionMeshUpload2.section.getCenterY() - chunkBuildOutput.B) * d2 + (d = (double)renderRegionManager$PendingSectionMeshUpload2.section.getCenterZ() - chunkBuildOutput.Z) * d;
                    int n4 = d4 < 768.0 ? -1 : renderRegionManager$PendingSectionMeshUpload2.relativeBuiltTime;
                    renderRegionManager$PendingSectionMeshUpload2.section.setFadeTime(n4);
                    sorter.writeMeshTimes(renderRegionManager$PendingSectionMeshUpload2.section.getSectionIndex(), n4);
                }
                sectionRenderDataStorage2.setVertexData(renderRegionManager$PendingSectionMeshUpload2.section.getSectionIndex(), renderRegionManager$PendingSectionMeshUpload2.vertexUpload.getResult(), renderRegionManager$PendingSectionMeshUpload2.meshData.getVertexSegments());
            }
        }
        class046432.y("upload_indices");
        boolean bl = false;
        if (!arrayList2.isEmpty()) {
            GlBufferArena glBufferArena = sorter.getIndexArena();
            bl = glBufferArena.upload(commandList, arrayList2.stream().map(renderRegionManager$PendingSectionIndexBufferUpload -> renderRegionManager$PendingSectionIndexBufferUpload.indexBufferUpload), f);
            for (RenderRegionManager$PendingSectionIndexBufferUpload renderRegionManager$PendingSectionIndexBufferUpload2 : arrayList2) {
                SectionRenderDataStorage sectionRenderDataStorage3 = renderRegion.createStorage(DefaultTerrainRenderPasses.TRANSLUCENT);
                sectionRenderDataStorage3.setIndexData(renderRegionManager$PendingSectionIndexBufferUpload2.section.getSectionIndex(), renderRegionManager$PendingSectionIndexBufferUpload2.indexBufferUpload.getResult());
            }
        }
        if (n != 0) {
            bl |= sectionRenderDataStorage.updateSharedIndexData(commandList, sorter.getIndexArena(), f);
        }
        if (bl) {
            renderRegion.refreshIndexedTesselation(commandList);
            renderRegion.clearCachedBatchFor(DefaultTerrainRenderPasses.TRANSLUCENT);
        }
        class046432.L();
    }

    public RenderRegion createForChunk(int n, int n2, int n3) {
        return this.create(n >> RenderRegion.REGION_WIDTH_SH, n2 >> RenderRegion.REGION_HEIGHT_SH, n3 >> RenderRegion.REGION_LENGTH_SH);
    }

    public Collection<RenderRegion> getLoadedRegions() {
        return this.regions.values();
    }

    public StagingBuffer getStagingBuffer() {
        return this.stagingBuffer;
    }

    private static StagingBuffer createStagingBuffer(CommandList commandList) {
        if (SodiumClientMod.options().advanced.useAdvancedStagingBuffers && MappedStagingBuffer.isSupported((RenderDevice)RenderDevice.INSTANCE)) {
            return new MappedStagingBuffer(commandList);
        }
        return new FallbackStagingBuffer(commandList);
    }

    private Reference2ReferenceMap.FastEntrySet<RenderRegion, List<BuilderTaskOutput>> createMeshUploadQueues(Collection<BuilderTaskOutput> collection) {
        Reference2ReferenceOpenHashMap reference2ReferenceOpenHashMap = new Reference2ReferenceOpenHashMap();
        for (BuilderTaskOutput builderTaskOutput : collection) {
            List list = (List)reference2ReferenceOpenHashMap.computeIfAbsent((Object)builderTaskOutput.render.getRegion(), object -> new ArrayList());
            list.add(builderTaskOutput);
        }
        return reference2ReferenceOpenHashMap.reference2ReferenceEntrySet();
    }
}

