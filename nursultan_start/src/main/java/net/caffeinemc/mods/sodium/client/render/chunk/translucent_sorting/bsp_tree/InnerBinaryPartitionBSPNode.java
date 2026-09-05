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
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.Partition;
import org.joml.Vector3fc;

class InnerBinaryPartitionBSPNode
extends InnerPartitionBSPNode {
    private final float planeDistance;
    private final BSPNode inside;
    private final BSPNode outside;
    private final int[] onPlaneQuads;

    InnerBinaryPartitionBSPNode(InnerPartitionBSPNode$NodeReuseData innerPartitionBSPNode$NodeReuseData, float f, int n, BSPNode bSPNode, BSPNode bSPNode2, int[] nArray) {
        super(innerPartitionBSPNode$NodeReuseData, n);
        this.planeDistance = f;
        this.inside = bSPNode;
        this.outside = bSPNode2;
        this.onPlaneQuads = nArray;
    }

    InnerBinaryPartitionBSPNode(InnerPartitionBSPNode$NodeReuseData innerPartitionBSPNode$NodeReuseData, float f, Vector3fc vector3fc, BSPNode bSPNode, BSPNode bSPNode2, int[] nArray) {
        super(innerPartitionBSPNode$NodeReuseData, vector3fc);
        this.planeDistance = f;
        this.inside = bSPNode;
        this.outside = bSPNode2;
        this.onPlaneQuads = nArray;
    }

    @Override
    void collectSortedQuads(BSPSortState bSPSortState, Vector3fc vector3fc) {
        boolean bl;
        bSPSortState.startNode(this);
        boolean bl2 = bl = this.planeNormal.dot(vector3fc) < this.planeDistance;
        if (bl) {
            this.collectOutside(bSPSortState, vector3fc);
        } else {
            this.collectInside(bSPSortState, vector3fc);
        }
        if (this.onPlaneQuads != null) {
            bSPSortState.writeIndexes(this.onPlaneQuads);
        }
        if (bl) {
            this.collectInside(bSPSortState, vector3fc);
        } else {
            this.collectOutside(bSPSortState, vector3fc);
        }
    }

    static BSPNode buildFromParts(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, BSPNode bSPNode, IntArrayList intArrayList2, IntArrayList intArrayList3, IntArrayList intArrayList4, int n2, Vector3fc vector3fc, float f) {
        BSPNode bSPNode2;
        if (n2 == -1) {
            bSPWorkspace.addUnalignedPartitionPlane(vector3fc, f);
        } else {
            bSPWorkspace.addAlignedPartitionPlane(n2, Math.abs(f));
        }
        BSPNode bSPNode3 = null;
        BSPNode bSPNode4 = null;
        if (bSPNode instanceof InnerBinaryPartitionBSPNode) {
            bSPNode2 = (InnerBinaryPartitionBSPNode)bSPNode;
            if (bSPNode2.axis == n2 && (n2 == -1 || bSPNode2.planeNormal.equals((Object)vector3fc)) && bSPNode2.planeDistance == f) {
                bSPNode3 = bSPNode2.inside;
                bSPNode4 = bSPNode2.outside;
            }
        }
        bSPNode2 = null;
        BSPNode bSPNode5 = null;
        if (intArrayList2 != null) {
            bSPNode2 = BSPNode.build(bSPWorkspace, intArrayList2, n, bSPNode3);
        }
        if (intArrayList3 != null) {
            bSPNode5 = BSPNode.build(bSPWorkspace, intArrayList3, n, bSPNode4);
        }
        int[] nArray = BSPSortState.compressIndexes(intArrayList4);
        return new InnerBinaryPartitionBSPNode(InnerBinaryPartitionBSPNode.prepareNodeReuse(bSPWorkspace, intArrayList, n), f, vector3fc, bSPNode2, bSPNode5, nArray);
    }

    @Override
    void addPartitionPlanes(BSPWorkspace bSPWorkspace) {
        InnerPartitionBSPNode innerPartitionBSPNode;
        if (this.axis == -1) {
            bSPWorkspace.addUnalignedPartitionPlane(this.planeNormal, this.planeDistance);
        } else {
            bSPWorkspace.addAlignedPartitionPlane(this.axis, this.planeDistance);
        }
        BSPNode bSPNode = this.inside;
        if (bSPNode instanceof InnerPartitionBSPNode) {
            innerPartitionBSPNode = (InnerPartitionBSPNode)bSPNode;
            innerPartitionBSPNode.addPartitionPlanes(bSPWorkspace);
        }
        if ((bSPNode = this.outside) instanceof InnerPartitionBSPNode) {
            innerPartitionBSPNode = (InnerPartitionBSPNode)bSPNode;
            innerPartitionBSPNode.addPartitionPlanes(bSPWorkspace);
        }
    }

    private void collectInside(BSPSortState bSPSortState, Vector3fc vector3fc) {
        if (this.inside != null) {
            this.inside.collectSortedQuads(bSPSortState, vector3fc);
        }
    }

    private void collectOutside(BSPSortState bSPSortState, Vector3fc vector3fc) {
        if (this.outside != null) {
            this.outside.collectSortedQuads(bSPSortState, vector3fc);
        }
    }

    static BSPNode buildFromPartitions(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, BSPNode bSPNode, Partition partition, Partition partition2, int n2) {
        BSPNode bSPNode2;
        float f = partition.distance();
        bSPWorkspace.addAlignedPartitionPlane(n2, f);
        BSPNode bSPNode3 = null;
        BSPNode bSPNode4 = null;
        if (bSPNode instanceof InnerBinaryPartitionBSPNode) {
            bSPNode2 = (InnerBinaryPartitionBSPNode)bSPNode;
            if (bSPNode2.axis == n2 && bSPNode2.planeDistance == f) {
                bSPNode3 = bSPNode2.inside;
                bSPNode4 = bSPNode2.outside;
            }
        }
        bSPNode2 = null;
        BSPNode bSPNode5 = null;
        if (partition.quadsBefore() != null) {
            bSPNode2 = BSPNode.build(bSPWorkspace, partition.quadsBefore(), n, bSPNode3);
        }
        if (partition2 != null) {
            bSPNode5 = BSPNode.build(bSPWorkspace, partition2.quadsBefore(), n, bSPNode4);
        }
        int[] nArray = partition.quadsOn() == null ? null : BSPSortState.compressIndexes(partition.quadsOn());
        return new InnerBinaryPartitionBSPNode(InnerBinaryPartitionBSPNode.prepareNodeReuse(bSPWorkspace, intArrayList, n), f, n2, bSPNode2, bSPNode5, nArray);
    }
}

