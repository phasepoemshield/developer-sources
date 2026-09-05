/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPSortState;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPWorkspace;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode$NodeReuseData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.Partition;
import org.joml.Vector3fc;

class InnerMultiPartitionBSPNode
extends InnerPartitionBSPNode {
    private final float[] planeDistances;
    private final BSPNode[] partitions;
    private final int[][] onPlaneQuads;

    InnerMultiPartitionBSPNode(InnerPartitionBSPNode$NodeReuseData innerPartitionBSPNode$NodeReuseData, int n, float[] fArray, BSPNode[] bSPNodeArray, int[][] nArray) {
        super(innerPartitionBSPNode$NodeReuseData, n);
        this.planeDistances = fArray;
        this.partitions = bSPNodeArray;
        this.onPlaneQuads = nArray;
    }

    @Override
    void collectSortedQuads(BSPSortState bSPSortState, Vector3fc vector3fc) {
        bSPSortState.startNode(this);
        float f = this.planeNormal.dot(vector3fc);
        for (int i = 0; i < this.planeDistances.length; ++i) {
            if (f <= this.planeDistances[i]) {
                boolean bl;
                boolean bl2 = bl = f == this.planeDistances[i];
                if (bl) {
                    this.collectPartitionQuads(bSPSortState, i, vector3fc);
                }
                for (int j = this.planeDistances.length; j > i; --j) {
                    this.collectPartitionQuads(bSPSortState, j, vector3fc);
                    this.collectPlaneQuads(bSPSortState, j - 1);
                }
                if (!bl) {
                    this.collectPartitionQuads(bSPSortState, i, vector3fc);
                }
                return;
            }
            this.collectPartitionQuads(bSPSortState, i, vector3fc);
            this.collectPlaneQuads(bSPSortState, i);
        }
        this.collectPartitionQuads(bSPSortState, this.planeDistances.length, vector3fc);
    }

    private void collectPlaneQuads(BSPSortState bSPSortState, int n) {
        if (this.onPlaneQuads[n] != null) {
            bSPSortState.writeIndexes(this.onPlaneQuads[n]);
        }
    }

    @Override
    void addPartitionPlanes(BSPWorkspace bSPWorkspace) {
        for (int i = 0; i < this.planeDistances.length; ++i) {
            bSPWorkspace.addAlignedPartitionPlane(this.axis, this.planeDistances[i]);
        }
        for (BSPNode bSPNode : this.partitions) {
            if (!(bSPNode instanceof InnerPartitionBSPNode)) continue;
            InnerPartitionBSPNode innerPartitionBSPNode = (InnerPartitionBSPNode)bSPNode;
            innerPartitionBSPNode.addPartitionPlanes(bSPWorkspace);
        }
    }

    private void collectPartitionQuads(BSPSortState bSPSortState, int n, Vector3fc vector3fc) {
        if (this.partitions[n] != null) {
            this.partitions[n].collectSortedQuads(bSPSortState, vector3fc);
        }
    }

    static BSPNode buildFromPartitions(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, BSPNode bSPNode, ReferenceArrayList<Partition> referenceArrayList, int n2, boolean bl) {
        int n3 = bl ? referenceArrayList.size() : referenceArrayList.size() - 1;
        float[] fArray = new float[n3];
        BSPNode[] bSPNodeArray = new BSPNode[n3 + 1];
        int[][] nArrayArray = new int[n3][];
        BSPNode[] bSPNodeArray2 = null;
        float[] fArray2 = null;
        int n4 = 0;
        float f = 0.0f;
        if (bSPNode instanceof InnerMultiPartitionBSPNode) {
            InnerMultiPartitionBSPNode innerMultiPartitionBSPNode = (InnerMultiPartitionBSPNode)bSPNode;
            if (innerMultiPartitionBSPNode.axis == n2 && innerMultiPartitionBSPNode.partitions.length > 0) {
                bSPNodeArray2 = innerMultiPartitionBSPNode.partitions;
                fArray2 = innerMultiPartitionBSPNode.planeDistances;
                f = innerMultiPartitionBSPNode.planeDistances[0];
            }
        }
        int n5 = referenceArrayList.size();
        for (int i = 0; i < n5; ++i) {
            Partition partition = (Partition)((Object)referenceArrayList.get(i));
            float f2 = Float.NaN;
            if (bl || i < n5 - 1) {
                f2 = partition.distance();
                bSPWorkspace.addAlignedPartitionPlane(n2, f2);
                if (Float.isNaN(f2)) {
                    throw new IllegalStateException("partition distance not set");
                }
                fArray[i] = f2;
            }
            if (partition.quadsBefore() != null) {
                BSPNode bSPNode2 = null;
                if (bSPNodeArray2 != null) {
                    while (n4 < bSPNodeArray2.length && f < f2) {
                        f = ++n4 < fArray2.length ? fArray2[n4] : Float.NaN;
                    }
                    if (n4 < bSPNodeArray2.length && (f == f2 || Float.isNaN(f2) && Float.isNaN(f))) {
                        bSPNode2 = bSPNodeArray2[n4];
                    }
                }
                bSPNodeArray[i] = BSPNode.build(bSPWorkspace, partition.quadsBefore(), n, bSPNode2);
            }
            if (partition.quadsOn() == null) continue;
            nArrayArray[i] = BSPSortState.compressIndexes(partition.quadsOn());
        }
        return new InnerMultiPartitionBSPNode(InnerMultiPartitionBSPNode.prepareNodeReuse(bSPWorkspace, intArrayList, n), n2, fArray, bSPNodeArray, nArrayArray);
    }
}

