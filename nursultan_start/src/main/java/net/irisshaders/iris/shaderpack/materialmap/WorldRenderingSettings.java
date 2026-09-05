/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2IntFunction
 *  it.unimi.dsi.fastutil.objects.Object2IntMap
 *  minecraft.class00500
 *  minecraft.class00891
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType
 *  net.irisshaders.iris.shaderpack.materialmap.BlockRenderType
 *  net.irisshaders.iris.shaderpack.materialmap.NamespacedId
 */
package net.irisshaders.iris.shaderpack.materialmap;

import it.unimi.dsi.fastutil.objects.Object2IntFunction;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Map;
import minecraft.class00500;
import minecraft.class00891;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkMeshFormats;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexType;
import net.irisshaders.iris.shaderpack.materialmap.BlockRenderType;
import net.irisshaders.iris.shaderpack.materialmap.NamespacedId;

public class WorldRenderingSettings {
    public static final WorldRenderingSettings INSTANCE = new WorldRenderingSettings();
    private boolean reloadRequired = false;
    private Object2IntMap<class00500> blockStateIds = null;
    private Map<class00891, BlockRenderType> blockTypeIds = null;
    private Object2IntFunction<NamespacedId> entityIds;
    private Object2IntFunction<NamespacedId> itemIds;
    private float ambientOcclusionLevel = 1.0f;
    private boolean disableDirectionalShading = false;
    private boolean hasVillagerConversionId = false;
    private boolean useSeparateAo = false;
    private boolean separateEntityDraws = false;
    private boolean voxelizeLightBlocks = false;
    private ChunkVertexType chunkVertexFormat = ChunkMeshFormats.COMPACT;
    private boolean breaksAnisotropy = false;

    public Map<class00891, BlockRenderType> getBlockTypeIds() {
        return this.blockTypeIds;
    }

    public void setBlockStateIds(Object2IntMap<class00500> object2IntMap) {
        if (this.blockStateIds != null && this.blockStateIds.equals(object2IntMap)) {
            return;
        }
        this.reloadRequired = true;
        this.blockStateIds = object2IntMap;
    }

    public void setEntityIds(Object2IntFunction<NamespacedId> object2IntFunction) {
        this.entityIds = object2IntFunction;
        this.hasVillagerConversionId = object2IntFunction.containsKey((Object)new NamespacedId("minecraft", "zombie_villager_converting"));
    }

    public void setVertexFormat(ChunkVertexType chunkVertexType) {
        if (chunkVertexType == this.chunkVertexFormat) {
            return;
        }
        this.reloadRequired = true;
        this.chunkVertexFormat = chunkVertexType;
    }

    public boolean breaksAnisotropy() {
        return this.breaksAnisotropy;
    }

    public boolean isReloadRequired() {
        return this.reloadRequired;
    }

    public Object2IntMap<class00500> getBlockStateIds() {
        return this.blockStateIds;
    }

    public void setBlockTypeIds(Map<class00891, BlockRenderType> map) {
        if (this.blockTypeIds != null && this.blockTypeIds.equals(map)) {
            return;
        }
        this.reloadRequired = true;
        this.blockTypeIds = map;
    }

    public Object2IntFunction<NamespacedId> getEntityIds() {
        return this.entityIds;
    }

    public void setUseSeparateAo(boolean bl) {
        if (bl == this.useSeparateAo) {
            return;
        }
        this.reloadRequired = true;
        this.useSeparateAo = bl;
    }

    public void setItemIds(Object2IntFunction<NamespacedId> object2IntFunction) {
        this.itemIds = object2IntFunction;
    }

    public Object2IntFunction<NamespacedId> getItemIds() {
        return this.itemIds;
    }

    public void setDisableDirectionalShading(boolean bl) {
        if (bl == this.disableDirectionalShading) {
            return;
        }
        this.reloadRequired = true;
        this.disableDirectionalShading = bl;
    }

    public ChunkVertexType getVertexFormat() {
        return this.chunkVertexFormat;
    }

    public float getAmbientOcclusionLevel() {
        return this.ambientOcclusionLevel;
    }

    public boolean shouldDisableDirectionalShading() {
        return this.disableDirectionalShading;
    }

    public boolean shouldUseSeparateAo() {
        return this.useSeparateAo;
    }

    public boolean hasVillagerConversionId() {
        return this.hasVillagerConversionId;
    }

    public void setAmbientOcclusionLevel(float f) {
        if (f == this.ambientOcclusionLevel) {
            return;
        }
        this.reloadRequired = true;
        this.ambientOcclusionLevel = f;
    }

    public void setVoxelizeLightBlocks(boolean bl) {
        if (bl == this.voxelizeLightBlocks) {
            return;
        }
        this.reloadRequired = true;
        this.voxelizeLightBlocks = bl;
    }

    public void setSeparateEntityDraws(boolean bl) {
        this.separateEntityDraws = bl;
    }

    public boolean shouldVoxelizeLightBlocks() {
        return this.voxelizeLightBlocks;
    }

    public boolean shouldSeparateEntityDraws() {
        return this.separateEntityDraws;
    }

    public void clearReloadRequired() {
        this.reloadRequired = false;
    }

    public void setBreaksAnisotropy(boolean bl) {
        this.breaksAnisotropy = bl;
    }
}

