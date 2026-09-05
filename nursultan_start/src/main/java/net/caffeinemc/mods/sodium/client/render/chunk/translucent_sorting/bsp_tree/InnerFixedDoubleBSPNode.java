/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPSortState;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPWorkspace;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode$NodeReuseData;
import org.joml.Vector3fc;

public class InnerFixedDoubleBSPNode
extends InnerPartitionBSPNode {
    private final BSPNode first;
    private final BSPNode second;

    InnerFixedDoubleBSPNode(InnerPartitionBSPNode$NodeReuseData innerPartitionBSPNode$NodeReuseData, BSPNode bSPNode, BSPNode bSPNode2) {
        super(innerPartitionBSPNode$NodeReuseData, 0);
        this.first = bSPNode;
        this.second = bSPNode2;
    }

    @Override
    void collectSortedQuads(BSPSortState bSPSortState, Vector3fc vector3fc) {
        bSPSortState.startNode(this);
        this.first.collectSortedQuads(bSPSortState, vector3fc);
        this.second.collectSortedQuads(bSPSortState, vector3fc);
    }

    static BSPNode buildFromParts(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, BSPNode bSPNode, IntArrayList intArrayList2, IntArrayList intArrayList3) {
        BSPNode bSPNode2;
        BSPNode bSPNode3 = null;
        BSPNode bSPNode4 = null;
        if (bSPNode instanceof InnerFixedDoubleBSPNode) {
            bSPNode2 = (InnerFixedDoubleBSPNode)bSPNode;
            bSPNode3 = bSPNode2.first;
            bSPNode4 = bSPNode2.second;
        }
        bSPNode2 = BSPNode.build(bSPWorkspace, intArrayList2, n, bSPNode3);
        BSPNode bSPNode5 = BSPNode.build(bSPWorkspace, intArrayList3, n, bSPNode4);
        return new InnerFixedDoubleBSPNode(InnerFixedDoubleBSPNode.prepareNodeReuse(bSPWorkspace, intArrayList, n), bSPNode2, bSPNode5);
    }

    @Override
    void addPartitionPlanes(BSPWorkspace bSPWorkspace) {
    }
}

