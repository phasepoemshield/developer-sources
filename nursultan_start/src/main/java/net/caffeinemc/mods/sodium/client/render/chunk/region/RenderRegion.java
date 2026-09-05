/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer
 *  net.caffeinemc.mods.sodium.client.gl.device.CommandList
 *  net.caffeinemc.mods.sodium.client.gl.device.MultiDrawBatch
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.render.chunk.RenderSection
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 *  net.irisshaders.iris.mixinterface.ShadowRenderRegion
 *  org.apache.commons.lang3.Validate
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package net.caffeinemc.mods.sodium.client.render.chunk.region;

import it.unimi.dsi.fastutil.objects.Reference2ReferenceOpenHashMap;
import java.util.Arrays;
import java.util.Map;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.gl.arena.staging.StagingBuffer;
import net.caffeinemc.mods.sodium.client.gl.device.CommandList;
import net.caffeinemc.mods.sodium.client.gl.device.MultiDrawBatch;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.RenderSection;
import net.caffeinemc.mods.sodium.client.render.chunk.data.SectionRenderDataStorage;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.ChunkRenderList;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion$DeviceResources;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.DefaultTerrainRenderPasses;
import net.caffeinemc.mods.sodium.client.render.chunk.terrain.TerrainRenderPass;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.irisshaders.iris.mixinterface.ShadowRenderRegion;
import org.apache.commons.lang3.Validate;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class RenderRegion
implements ShadowRenderRegion {
    public static final int SECTION_VERTEX_COUNT_ESTIMATE = 756;
    public static final int SECTION_INDEX_COUNT_ESTIMATE = 756 / DefaultTerrainRenderPasses.ALL.length / 4 * 6;
    public static final int SECTION_BUFFER_ESTIMATE = 756 * ChunkMeshFormats.COMPACT.getVertexFormat().getStride() + SECTION_INDEX_COUNT_ESTIMATE * 4;
    public static final int REGION_WIDTH = 8;
    public static final int REGION_HEIGHT = 4;
    public static final int REGION_LENGTH = 8;
    public static final int REGION_WIDTH_M = 7;
    public static final int REGION_HEIGHT_M = 3;
    public static final int REGION_LENGTH_M = 7;
    public static final int REGION_WIDTH_SH = Integer.bitCount(7);
    public static final int REGION_HEIGHT_SH = Integer.bitCount(3);
    public static final int REGION_LENGTH_SH = Integer.bitCount(7);
    public static final int REGION_SIZE = 256;
    private final StagingBuffer stagingBuffer;
    private final int x;
    private final int y;
    private final int z;
    private ChunkRenderList renderList;
    private final RenderSection[] sections = new RenderSection[256];
    private final long creationTime;
    private int sectionCount;
    private final Map<TerrainRenderPass, SectionRenderDataStorage> sectionRenderData = new Reference2ReferenceOpenHashMap();
    private RenderRegion$DeviceResources resources;
    private Map<TerrainRenderPass, MultiDrawBatch> cachedBatches = new Reference2ReferenceOpenHashMap();
    ChunkRenderList regularRenderList;
    ChunkRenderList shadowRenderList;
    Map regularCachedBatches;
    Map shadowCachedBatches;

    public RenderRegion(int n, int n2, int n3, StagingBuffer stagingBuffer) {
        this.x = n;
        this.y = n2;
        this.z = n3;
        this.creationTime = System.currentTimeMillis();
        this.stagingBuffer = stagingBuffer;
        this.renderList = new ChunkRenderList(this);
    }

    static {
        Validate.isTrue((boolean)MathUtil.isPowerOfTwo((int)8));
        Validate.isTrue((boolean)MathUtil.isPowerOfTwo((int)4));
        Validate.isTrue((boolean)MathUtil.isPowerOfTwo((int)8));
    }

    public void update(CommandList commandList) {
        if (this.resources != null && this.resources.shouldDelete()) {
            this.resources.delete(commandList);
            this.resources = null;
        }
    }

    public boolean isEmpty() {
        return this.sectionCount == 0;
    }

    public RenderRegion$DeviceResources getResources() {
        return this.resources;
    }

    public static long key(int n, int n2, int n3) {
        return class01296.y((int)n, (int)n2, (int)n3);
    }

    public void delete(CommandList commandList) {
        for (SectionRenderDataStorage sectionRenderDataStorage : this.sectionRenderData.values()) {
            sectionRenderDataStorage.delete();
        }
        this.sectionRenderData.clear();
        if (this.resources != null) {
            this.resources.delete(commandList);
            this.resources = null;
        }
        Arrays.fill(this.sections, null);
        for (MultiDrawBatch multiDrawBatch : this.cachedBatches.values()) {
            multiDrawBatch.delete();
        }
        this.cachedBatches.clear();
    }

    public long getCreationTime() {
        return this.creationTime;
    }

    public int getY() {
        return this.y;
    }

    public int getX() {
        return this.x;
    }

    public int getZ() {
        return this.z;
    }

    public SectionRenderDataStorage getStorage(TerrainRenderPass terrainRenderPass) {
        return this.sectionRenderData.get(terrainRenderPass);
    }

    public RenderSection getSection(int n) {
        return this.sections[n];
    }

    private void handler$bio000$iris$clearBatchFor(CallbackInfo callbackInfo) {
        if (this.regularCachedBatches != null) {
            for (MultiDrawBatch multiDrawBatch : this.regularCachedBatches.values()) {
                multiDrawBatch.clear();
            }
        }
        if (this.shadowCachedBatches != null) {
            for (MultiDrawBatch multiDrawBatch : this.shadowCachedBatches.values()) {
                multiDrawBatch.clear();
            }
        }
    }

    public MultiDrawBatch getCachedBatch(TerrainRenderPass terrainRenderPass) {
        MultiDrawBatch multiDrawBatch = this.cachedBatches.get(terrainRenderPass);
        if (multiDrawBatch != null) {
            return multiDrawBatch;
        }
        multiDrawBatch = new MultiDrawBatch(ModelQuadFacing.COUNT * 256 + 1);
        this.cachedBatches.put(terrainRenderPass, multiDrawBatch);
        return multiDrawBatch;
    }

    public ChunkRenderList getRenderList() {
        return this.renderList;
    }

    public RenderRegion$DeviceResources createResources(CommandList commandList) {
        if (this.resources == null) {
            this.resources = new RenderRegion$DeviceResources(commandList, this.stagingBuffer);
        }
        return this.resources;
    }

    public void refreshTesselation(CommandList commandList) {
        if (this.resources != null) {
            this.resources.deleteTessellation(commandList);
            this.resources.deleteIndexedTessellation(commandList);
        }
        for (SectionRenderDataStorage sectionRenderDataStorage : this.sectionRenderData.values()) {
            sectionRenderDataStorage.onBufferResized();
        }
    }

    private void ensureRenderList() {
        if (this.renderList == null) {
            this.renderList = new ChunkRenderList(this);
        }
        if (this.cachedBatches == null) {
            this.cachedBatches = new Reference2ReferenceOpenHashMap();
        }
    }

    public float getFillFractionInv() {
        return 256.0f / (float)this.sectionCount;
    }

    public SectionRenderDataStorage createStorage(TerrainRenderPass terrainRenderPass) {
        SectionRenderDataStorage sectionRenderDataStorage = this.sectionRenderData.get(terrainRenderPass);
        if (sectionRenderDataStorage == null) {
            sectionRenderDataStorage = new SectionRenderDataStorage(terrainRenderPass.isTranslucent());
            this.sectionRenderData.put(terrainRenderPass, sectionRenderDataStorage);
        }
        return sectionRenderDataStorage;
    }

    public void swapToShadowRenderList() {
        this.regularRenderList = this.renderList;
        this.renderList = this.shadowRenderList;
        this.regularCachedBatches = this.cachedBatches;
        this.cachedBatches = this.shadowCachedBatches;
        this.shadowCachedBatches = null;
        this.ensureRenderList();
    }

    public void swapToRegularRenderList() {
        this.shadowRenderList = this.renderList;
        this.renderList = this.regularRenderList;
        this.shadowCachedBatches = this.cachedBatches;
        this.cachedBatches = this.regularCachedBatches;
        this.regularCachedBatches = null;
        this.ensureRenderList();
    }

    public int getChunkZ() {
        return this.z << REGION_LENGTH_SH;
    }

    public int getOriginY() {
        return this.getChunkY() << 4;
    }

    public int getOriginZ() {
        return this.getChunkZ() << 4;
    }

    public int getChunkY() {
        return this.y << REGION_HEIGHT_SH;
    }

    public int getOriginX() {
        return this.getChunkX() << 4;
    }

    public int getChunkX() {
        return this.x << REGION_WIDTH_SH;
    }

    public void addSection(RenderSection renderSection) {
        int n = renderSection.getSectionIndex();
        RenderSection renderSection2 = this.sections[n];
        if (renderSection2 != null) {
            throw new IllegalStateException("Section has already been added to the region");
        }
        this.sections[n] = renderSection;
        ++this.sectionCount;
    }

    public void clearCachedBatchFor(TerrainRenderPass terrainRenderPass) {
        this.handler$bio000$iris$clearBatchFor(null);
        MultiDrawBatch multiDrawBatch = this.cachedBatches.get(terrainRenderPass);
        if (multiDrawBatch != null) {
            multiDrawBatch.clear();
        }
    }

    public void clearAllCachedBatches() {
        for (MultiDrawBatch multiDrawBatch : this.cachedBatches.values()) {
            multiDrawBatch.clear();
        }
    }

    public void iris$forceClearAllBatches() {
        if (this.regularCachedBatches != null) {
            for (MultiDrawBatch multiDrawBatch : this.regularCachedBatches.values()) {
                multiDrawBatch.clear();
            }
        }
        if (this.shadowCachedBatches != null) {
            for (MultiDrawBatch multiDrawBatch : this.shadowCachedBatches.values()) {
                multiDrawBatch.clear();
            }
        }
        if (this.cachedBatches != null) {
            for (MultiDrawBatch multiDrawBatch : this.cachedBatches.values()) {
                multiDrawBatch.clear();
            }
        }
    }

    public void refreshIndexedTesselation(CommandList commandList) {
        if (this.resources != null) {
            this.resources.deleteIndexedTessellation(commandList);
        }
        this.sectionRenderData.get(DefaultTerrainRenderPasses.TRANSLUCENT).onIndexBufferResized();
    }

    public void removeSection(RenderSection renderSection) {
        int n = renderSection.getSectionIndex();
        RenderSection renderSection2 = this.sections[n];
        if (renderSection2 == null) {
            throw new IllegalStateException("Section was not loaded within the region");
        }
        if (renderSection2 != renderSection) {
            throw new IllegalStateException("Tried to remove the wrong section");
        }
        for (SectionRenderDataStorage sectionRenderDataStorage : this.sectionRenderData.values()) {
            sectionRenderDataStorage.removeData(n);
        }
        this.sections[n] = null;
        --this.sectionCount;
    }
}

