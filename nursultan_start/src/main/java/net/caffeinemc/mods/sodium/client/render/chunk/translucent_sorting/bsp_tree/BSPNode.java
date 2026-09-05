/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  minecraft.class01296
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TopoGraphSorting
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import minecraft.class01296;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPResult;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPSortState;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPWorkspace;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.LeafDoubleBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.LeafSingleBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TopoGraphSorting;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;
import org.joml.Vector3fc;

public abstract class BSPNode {
    static BSPNode build(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, BSPNode bSPNode) {
        ++n;
        if (intArrayList.isEmpty()) {
            return null;
        }
        if (intArrayList.size() == 1) {
            return new LeafSingleBSPNode(intArrayList.getInt(0));
        }
        if (intArrayList.size() == 2) {
            TQuad tQuad;
            int n2 = intArrayList.getInt(0);
            int n3 = intArrayList.getInt(1);
            TQuad tQuad2 = (TQuad)bSPWorkspace.get(n2);
            if (BSPNode.doubleLeafPossible(tQuad2, tQuad = (TQuad)bSPWorkspace.get(n3), bSPWorkspace.canSplitQuads())) {
                return new LeafDoubleBSPNode(n2, n3);
            }
        }
        return InnerPartitionBSPNode.build(bSPWorkspace, intArrayList, n, bSPNode);
    }

    public void collectSortedQuads(NativeBuffer nativeBuffer, Vector3fc vector3fc) {
        this.collectSortedQuads(new BSPSortState(nativeBuffer), vector3fc);
    }

    abstract void collectSortedQuads(BSPSortState var1, Vector3fc var2);

    private static boolean doubleLeafPossible(TQuad tQuad, TQuad tQuad2, boolean bl) {
        ModelQuadFacing modelQuadFacing = tQuad.getFacing();
        ModelQuadFacing modelQuadFacing2 = tQuad2.getFacing();
        if (!modelQuadFacing.isAligned() || !modelQuadFacing2.isAligned()) {
            int n;
            int n2 = tQuad.getPackedNormal();
            return NormI8.isOpposite((int)n2, (int)(n = tQuad2.getPackedNormal())) || n2 == n && tQuad.getAccurateDotProduct() == tQuad2.getAccurateDotProduct();
        }
        if (tQuad.getExtents()[modelQuadFacing.ordinal()] == tQuad2.getExtents()[modelQuadFacing2.ordinal()]) {
            return true;
        }
        if (modelQuadFacing == modelQuadFacing2.getOpposite()) {
            return true;
        }
        return !TopoGraphSorting.orthogonalQuadVisibleThrough((TQuad)tQuad, (TQuad)tQuad2, (boolean)bl) && !TopoGraphSorting.orthogonalQuadVisibleThrough((TQuad)tQuad2, (TQuad)tQuad, (boolean)bl);
    }

    public static BSPResult buildBSP(TQuad[] tQuadArray, class01296 class012962, BSPNode bSPNode, boolean bl, boolean bl2, QuadSplittingMode quadSplittingMode) {
        InnerPartitionBSPNode.validateQuadCount(tQuadArray.length);
        BSPWorkspace bSPWorkspace = new BSPWorkspace(tQuadArray, class012962, bl, bl2, quadSplittingMode);
        int[] nArray = new int[tQuadArray.length];
        for (int i = 0; i < tQuadArray.length; ++i) {
            nArray[i] = i;
        }
        IntArrayList intArrayList = new IntArrayList(nArray);
        BSPNode bSPNode2 = BSPNode.build(bSPWorkspace, intArrayList, -1, bSPNode);
        BSPResult bSPResult = bSPWorkspace.result;
        bSPResult.setRootNode(bSPNode2);
        bSPResult.setUpdatedQuadIndexes(bSPWorkspace.getFinalizedUpdatedQuads());
        return bSPResult;
    }
}

