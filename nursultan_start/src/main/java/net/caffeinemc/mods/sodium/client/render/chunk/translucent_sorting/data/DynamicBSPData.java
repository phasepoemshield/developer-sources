/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad
 *  org.joml.Vector3dc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data;

import minecraft.class01296;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPResult;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.UpdatedQuadsList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicBSPData$DynamicBSPSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicSorter;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import org.joml.Vector3dc;

public class DynamicBSPData
extends DynamicData {
    private static final int NODE_REUSE_MIN_GENERATION = 1;
    private final int indexQuadCount;
    final BSPNode rootNode;
    private final int generation;
    private UpdatedQuadsList updatedQuadsList;
    private final boolean neededQuadSplitting;

    private DynamicBSPData(class01296 class012962, int n, BSPResult bSPResult, Vector3dc vector3dc, int n2) {
        super(class012962, n, bSPResult, vector3dc);
        this.rootNode = bSPResult.getRootNode();
        this.generation = n2;
        this.updatedQuadsList = bSPResult.getUpdatedQuadsList();
        this.neededQuadSplitting = this.updatedQuadsList != null;
        this.indexQuadCount = this.updatedQuadsList != null ? this.updatedQuadsList.getIndexQuadCount() : n;
    }

    public UpdatedQuadsList getUpdatedQuads() {
        return this.updatedQuadsList;
    }

    public boolean meshesWereModified() {
        return this.neededQuadSplitting;
    }

    public boolean oldDataMatches(TranslucentGeometryCollector translucentGeometryCollector, SortType sortType, TQuad[] tQuadArray) {
        return !this.meshesWereModified() && super.oldDataMatches(translucentGeometryCollector, sortType, tQuadArray);
    }

    public int getIndexQuadCount() {
        return this.indexQuadCount;
    }

    public static DynamicBSPData fromMesh(CombinedCameraPos combinedCameraPos, TQuad[] tQuadArray, class01296 class012962, TranslucentData translucentData, QuadSplittingMode quadSplittingMode) {
        Object object;
        BSPNode bSPNode = null;
        int n = 0;
        boolean bl = false;
        boolean bl2 = false;
        if (translucentData instanceof DynamicBSPData) {
            object = (DynamicBSPData)translucentData;
            n = object.generation + 1;
            bSPNode = object.rootNode;
            bl2 = !object.neededQuadSplitting;
            bl = bl2 && n >= 1;
        }
        object = BSPNode.buildBSP(tQuadArray, class012962, bSPNode, bl, bl2, quadSplittingMode);
        DynamicBSPData dynamicBSPData = new DynamicBSPData(class012962, tQuadArray.length, (BSPResult)((Object)object), combinedCameraPos.getAbsoluteCameraPos(), n);
        object.prepareIntegration();
        return dynamicBSPData;
    }

    @Override
    public DynamicSorter getSorter() {
        this.updatedQuadsList = null;
        return new DynamicBSPData$DynamicBSPSorter(this, this.getIndexQuadCount());
    }
}

