/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntList
 *  it.unimi.dsi.fastutil.ints.IntListIterator
 *  it.unimi.dsi.fastutil.ints.IntOpenHashSet
 *  it.unimi.dsi.fastutil.longs.LongArrayList
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.api.util.ColorMixer
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TopoGraphSorting
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.FullTQuad
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex
 *  net.caffeinemc.mods.sodium.client.util.MathUtil
 *  net.caffeinemc.mods.sodium.client.util.sorting.RadixSort
 *  org.joml.Vector3f
 *  org.joml.Vector3fc
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntList;
import it.unimi.dsi.fastutil.ints.IntListIterator;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongArrayList;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.IntConsumer;
import minecraft.class04995;
import net.caffeinemc.mods.sodium.api.util.ColorMixer;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.TranslucentGeometryCollector;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPBuildFailureException;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPSortState;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPWorkspace;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerBinaryPartitionBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerFixedDoubleBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerMultiPartitionBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode$IndexRemapper;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode$NodeReuseData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode$QuadIndexConsumerIntoArray;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.LeafMultiBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.Partition;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TopoGraphSorting;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.FullTQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;
import net.caffeinemc.mods.sodium.client.util.MathUtil;
import net.caffeinemc.mods.sodium.client.util.sorting.RadixSort;
import org.joml.Vector3f;
import org.joml.Vector3fc;

abstract class InnerPartitionBSPNode
extends BSPNode {
    private static final int NODE_REUSE_THRESHOLD = 30;
    private static final int MAX_INTERSECTION_ATTEMPTS = 500;
    protected static final int UNALIGNED_AXIS = -1;
    final Vector3fc planeNormal;
    final int axis;
    int[] indexMap;
    int fixedIndexOffset = Integer.MIN_VALUE;
    final InnerPartitionBSPNode$NodeReuseData reuseData;
    private static final int INTERVAL_START = 2;
    private static final int INTERVAL_END = 0;
    private static final int INTERVAL_SIDE = 1;

    InnerPartitionBSPNode(InnerPartitionBSPNode$NodeReuseData innerPartitionBSPNode$NodeReuseData, int n) {
        this.planeNormal = ModelQuadFacing.ALIGNED_NORMALS[n];
        this.axis = n;
        this.reuseData = innerPartitionBSPNode$NodeReuseData;
    }

    InnerPartitionBSPNode(InnerPartitionBSPNode$NodeReuseData innerPartitionBSPNode$NodeReuseData, Vector3fc vector3fc) {
        this.planeNormal = vector3fc;
        this.axis = -1;
        this.reuseData = innerPartitionBSPNode$NodeReuseData;
    }

    static BSPNode build(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, BSPNode bSPNode) {
        InnerPartitionBSPNode innerPartitionBSPNode;
        InnerPartitionBSPNode innerPartitionBSPNode2;
        if (bSPNode instanceof InnerPartitionBSPNode && (innerPartitionBSPNode2 = InnerPartitionBSPNode.attemptNodeReuse(bSPWorkspace, intArrayList, innerPartitionBSPNode = (InnerPartitionBSPNode)bSPNode)) != null) {
            return innerPartitionBSPNode2;
        }
        innerPartitionBSPNode = new ReferenceArrayList();
        innerPartitionBSPNode2 = new LongArrayList((int)((double)intArrayList.size() * 1.5));
        IntArrayList intArrayList2 = null;
        IntArrayList intArrayList3 = null;
        boolean bl = bSPWorkspace.canSplitQuads();
        if (bl) {
            intArrayList2 = new IntArrayList(5);
            intArrayList3 = new IntArrayList(5);
        }
        for (int i = 0; i < 3; ++i) {
            int n2;
            int n3;
            int n4 = (i + n + 1) % 3;
            int n5 = n4 + 3;
            int n6 = 0;
            boolean bl2 = true;
            int n7 = 0;
            innerPartitionBSPNode2.clear();
            int n8 = intArrayList.size();
            for (n3 = 0; n3 < n8; ++n3) {
                float f;
                int n9 = intArrayList.getInt(n3);
                TQuad tQuad = (TQuad)bSPWorkspace.get(n9);
                float[] fArray = tQuad.getExtents();
                float f2 = fArray[n4];
                if (f2 == (f = fArray[n5])) {
                    innerPartitionBSPNode2.add(InnerPartitionBSPNode.encodeIntervalPoint(f2, n9, 1));
                } else {
                    innerPartitionBSPNode2.add(InnerPartitionBSPNode.encodeIntervalPoint(f2, n9, 0));
                    innerPartitionBSPNode2.add(InnerPartitionBSPNode.encodeIntervalPoint(f, n9, 2));
                    bl2 = false;
                }
                ModelQuadFacing modelQuadFacing = tQuad.getFacing();
                if (modelQuadFacing.getSign() > 0) {
                    ++n7;
                }
                n6 |= 1 << modelQuadFacing.ordinal();
            }
            if (!ModelQuadFacing.bitmapHasUnassigned((int)n6) && ((n3 = Integer.bitCount(n6)) == 1 || n3 == 2 && ModelQuadFacing.bitmapIsOpposingAligned((int)n6))) {
                if (bl2) {
                    return InnerPartitionBSPNode.buildSNRLeafNodeFromPoints(bSPWorkspace, (LongArrayList)innerPartitionBSPNode2, n7);
                }
                return InnerPartitionBSPNode.buildSNRLeafNodeFromQuads(bSPWorkspace, intArrayList);
            }
            Arrays.sort(innerPartitionBSPNode2.elements(), 0, innerPartitionBSPNode2.size());
            float f = Float.NaN;
            IntArrayList intArrayList4 = null;
            IntArrayList intArrayList5 = null;
            int n10 = 0;
            innerPartitionBSPNode.clear();
            if (bl) {
                intArrayList3.clear();
            }
            float f3 = Float.NaN;
            int n11 = innerPartitionBSPNode2.size();
            block7: for (n2 = 0; n2 < n11; n2 += 1) {
                long l = innerPartitionBSPNode2.getLong(n2);
                switch (InnerPartitionBSPNode.decodeType(l)) {
                    case 2: {
                        if (n10 == 0 && (intArrayList4 != null || intArrayList5 != null)) {
                            innerPartitionBSPNode.add((Object)new Partition(f, intArrayList4, intArrayList5));
                            f = Float.NaN;
                            intArrayList4 = null;
                            intArrayList5 = null;
                        }
                        ++n10;
                        if (intArrayList5 != null) {
                            if (Float.isNaN(f)) {
                                throw new IllegalStateException("distance not set");
                            }
                            innerPartitionBSPNode.add((Object)new Partition(f, intArrayList4, intArrayList5));
                            f = Float.NaN;
                            intArrayList5 = null;
                        }
                        if (intArrayList4 == null) {
                            intArrayList4 = new IntArrayList();
                        }
                        intArrayList4.add(InnerPartitionBSPNode.decodeQuadIndex(l));
                        continue block7;
                    }
                    case 0: {
                        --n10;
                        if (intArrayList5 != null) continue block7;
                        f = InnerPartitionBSPNode.decodeDistance(l);
                        continue block7;
                    }
                    case 1: {
                        float f4;
                        int n12 = InnerPartitionBSPNode.decodeQuadIndex(l);
                        if (n10 == 0) {
                            f4 = InnerPartitionBSPNode.decodeDistance(l);
                            if (intArrayList5 == null) {
                                intArrayList5 = new IntArrayList();
                                f = f4;
                            } else if (f != f4) {
                                innerPartitionBSPNode.add((Object)new Partition(f, intArrayList4, intArrayList5));
                                f = f4;
                                intArrayList4 = null;
                                intArrayList5 = new IntArrayList();
                            }
                            intArrayList5.add(n12);
                            continue block7;
                        }
                        if (intArrayList4 == null) {
                            throw new IllegalStateException("there must be started intervals here");
                        }
                        intArrayList4.add(n12);
                        if (!bl) continue block7;
                        f4 = InnerPartitionBSPNode.decodeDistance(l);
                        if (f4 == f3 || Float.isNaN(f3)) {
                            intArrayList3.add(n12);
                        } else {
                            InnerPartitionBSPNode.flushBestSplittingGroup(intArrayList3, intArrayList2, n4);
                        }
                        f3 = f4;
                    }
                }
            }
            if (bl) {
                InnerPartitionBSPNode.flushBestSplittingGroup(intArrayList3, intArrayList2, n4);
            }
            if (intArrayList4 != null && intArrayList4.size() == intArrayList.size()) continue;
            int n13 = n2 = intArrayList5 != null ? 1 : 0;
            if (intArrayList4 != null || intArrayList5 != null) {
                innerPartitionBSPNode.add((Object)new Partition(n2 != 0 ? f : Float.NaN, intArrayList4, intArrayList5));
            }
            if (innerPartitionBSPNode.size() <= 2) {
                Partition partition;
                Partition partition2 = (Partition)((Object)innerPartitionBSPNode.get(0));
                Partition partition3 = partition = innerPartitionBSPNode.size() == 2 ? (Partition)((Object)innerPartitionBSPNode.get(1)) : null;
                if (partition == null || !n2) {
                    return InnerBinaryPartitionBSPNode.buildFromPartitions(bSPWorkspace, intArrayList, n, bSPNode, partition2, partition, n4);
                }
            }
            return InnerMultiPartitionBSPNode.buildFromPartitions(bSPWorkspace, intArrayList, n, bSPNode, (ReferenceArrayList<Partition>)innerPartitionBSPNode, n4, n2 != 0);
        }
        if (bl) {
            BSPNode bSPNode2 = InnerPartitionBSPNode.buildTopoMultiLeafNode(bSPWorkspace, intArrayList, true);
            if (bSPNode2 != null) {
                return bSPNode2;
            }
            return InnerPartitionBSPNode.handleUnsortableBySplitting(bSPWorkspace, intArrayList, n, bSPNode, intArrayList2);
        }
        BSPNode bSPNode3 = InnerPartitionBSPNode.handleIntersecting(bSPWorkspace, intArrayList, n, bSPNode);
        if (bSPNode3 != null) {
            return bSPNode3;
        }
        BSPNode bSPNode4 = InnerPartitionBSPNode.buildTopoMultiLeafNode(bSPWorkspace, intArrayList, false);
        if (bSPNode4 == null) {
            throw new BSPBuildFailureException("No partition found but not intersecting and can't be statically topo sorted");
        }
        return bSPNode4;
    }

    private static BSPNode handleUnsortableBySplitting(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, BSPNode bSPNode, IntArrayList intArrayList2) {
        float f;
        Vector3fc vector3fc;
        int n2;
        int n3;
        if (intArrayList2.isEmpty()) {
            n3 = intArrayList.getInt(0);
            intArrayList2.add(n3);
        } else {
            n3 = intArrayList2.getInt(0);
        }
        FullTQuad fullTQuad = (FullTQuad)bSPWorkspace.get(n3);
        ModelQuadFacing modelQuadFacing = fullTQuad.getFacing();
        int n4 = intArrayList2.size();
        Vector3fc vector3fc2 = fullTQuad.getVeryAccurateNormal();
        float f2 = fullTQuad.getAccurateDotProduct();
        Vector3f vector3f = vector3fc2.negate(new Vector3f());
        float f3 = -f2;
        boolean bl = modelQuadFacing.isAligned();
        IntArrayList intArrayList3 = new IntArrayList();
        IntArrayList intArrayList4 = new IntArrayList();
        IntListIterator intListIterator = intArrayList.iterator();
        while (intListIterator.hasNext()) {
            int n5 = (Integer)intListIterator.next();
            boolean bl2 = false;
            for (n2 = 0; n2 < n4; ++n2) {
                if (n5 != intArrayList2.getInt(n2)) continue;
                bl2 = true;
            }
            if (bl2) continue;
            FullTQuad fullTQuad2 = (FullTQuad)bSPWorkspace.get(n5);
            ModelQuadFacing modelQuadFacing2 = fullTQuad2.getFacing();
            if (modelQuadFacing2 == modelQuadFacing) {
                boolean bl3;
                Vector3fc vector3fc3 = fullTQuad2.getVeryAccurateNormal();
                float f4 = fullTQuad2.getAccurateDotProduct();
                boolean bl4 = InnerPartitionBSPNode.floatEquals(f4, f2) && (bl || vector3fc3.equals(vector3fc2, 1.0E-5f));
                boolean bl5 = bl3 = bl4 || InnerPartitionBSPNode.floatEquals(f4, f3) && (bl || vector3fc3.equals((Vector3fc)vector3f, 1.0E-5f));
                if (bl4 || bl3) {
                    intArrayList2.add(n5);
                    continue;
                }
            }
            InnerPartitionBSPNode.splitCandidate(bSPWorkspace, intArrayList2, n5, fullTQuad2, vector3fc2, f2, intArrayList4, intArrayList3);
        }
        if (bSPWorkspace.quantizeTriggerNormals) {
            intListIterator = fullTQuad.useQuantizedFacing();
            vector3fc = fullTQuad.getQuantizedNormal();
            f = fullTQuad.getQuantizedDotProduct();
        } else {
            intListIterator = modelQuadFacing;
            vector3fc = vector3fc2;
            f = f2;
        }
        n2 = -1;
        if (intListIterator.isAligned()) {
            n2 = intListIterator.getAxis();
        }
        return InnerBinaryPartitionBSPNode.buildFromParts(bSPWorkspace, intArrayList, n, bSPNode, intArrayList3, intArrayList4, intArrayList2, n2, vector3fc, f);
    }

    public static void validateQuadCount(int n) {
        if (n * 2 > 0x3FFFFFFF) {
            throw new IllegalArgumentException("Too many quads: " + n);
        }
    }

    static InnerPartitionBSPNode$NodeReuseData prepareNodeReuse(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n) {
        if (bSPWorkspace.prepareNodeReuse && n == 1 && intArrayList.size() > 30) {
            int n2 = 1;
            int n3 = -1;
            for (int i = 0; i < intArrayList.size(); ++i) {
                int n4 = intArrayList.getInt(i);
                TQuad tQuad = (TQuad)bSPWorkspace.get(n4);
                n2 = n2 * 31 + tQuad.getQuadHash();
                n3 = Math.max(n3, n4);
            }
            return new InnerPartitionBSPNode$NodeReuseData(n2, BSPSortState.compressIndexes(intArrayList, false), intArrayList.size(), n3);
        }
        return null;
    }

    private static BSPNode handleIntersecting(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, BSPNode bSPNode) {
        int n2;
        TQuad tQuad;
        IntOpenHashSet intOpenHashSet;
        block12: {
            Int2IntOpenHashMap int2IntOpenHashMap = null;
            intOpenHashSet = null;
            int n3 = class04995.N((int)(intArrayList.size() / 2), (int)2, (int)4);
            int n4 = -1;
            int n5 = 0;
            int n6 = intArrayList.size();
            int n7 = Math.max(1, n6 * (n6 - 1) / 2 / 500);
            int n8 = 0;
            Random random = null;
            if (n7 > 1) {
                int n9 = n7 / 2;
                n8 = n7 = Math.max(1, n7 - n9);
                random = new Random();
            }
            while (true) {
                n4 += n7;
                if (n8 > 0) {
                    n4 += random.nextInt(n8);
                }
                while (n4 >= n5) {
                    n4 -= n5;
                    ++n5;
                }
                if (n5 >= intArrayList.size()) break block12;
                TQuad tQuad2 = (TQuad)bSPWorkspace.get(intArrayList.getInt(n4));
                if (!TQuad.extentsIntersect((TQuad)tQuad2, (TQuad)(tQuad = (TQuad)bSPWorkspace.get(intArrayList.getInt(n5))))) continue;
                if (int2IntOpenHashMap == null) {
                    int2IntOpenHashMap = new Int2IntOpenHashMap();
                }
                n2 = int2IntOpenHashMap.get(n4) + 1;
                int2IntOpenHashMap.put(n4, n2);
                int n10 = int2IntOpenHashMap.get(n5) + 1;
                int2IntOpenHashMap.put(n5, n10);
                if (n2 >= n3) {
                    if (intOpenHashSet == null) {
                        intOpenHashSet = new IntOpenHashSet(2);
                    }
                    intOpenHashSet.add(n4);
                }
                if (n10 >= n3) {
                    if (intOpenHashSet == null) {
                        intOpenHashSet = new IntOpenHashSet(2);
                    }
                    intOpenHashSet.add(n5);
                }
                if (intOpenHashSet != null && intOpenHashSet.size() == intArrayList.size()) break;
            }
            return new LeafMultiBSPNode(BSPSortState.compressIndexes(intArrayList));
        }
        if (intOpenHashSet != null) {
            IntArrayList intArrayList2 = new IntArrayList(intArrayList.size() - intOpenHashSet.size());
            tQuad = new IntArrayList(intOpenHashSet.size());
            for (n2 = 0; n2 < intArrayList.size(); ++n2) {
                if (intOpenHashSet.contains(n2)) {
                    tQuad.add(intArrayList.getInt(n2));
                    continue;
                }
                intArrayList2.add(intArrayList.getInt(n2));
            }
            return InnerFixedDoubleBSPNode.buildFromParts(bSPWorkspace, intArrayList, n, bSPNode, intArrayList2, (IntArrayList)tQuad);
        }
        return null;
    }

    private static void addQuadIndex(IntArrayList intArrayList, int n) {
        if (n >= 0) {
            intArrayList.add(n);
        }
    }

    abstract void addPartitionPlanes(BSPWorkspace var1);

    private static int decodeQuadIndex(long l) {
        return (int)(l & 0x3FFFFFFFL);
    }

    static InnerPartitionBSPNode attemptNodeReuse(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, InnerPartitionBSPNode innerPartitionBSPNode) {
        if (innerPartitionBSPNode == null || !bSPWorkspace.allowNodeReuse) {
            return null;
        }
        innerPartitionBSPNode.indexMap = null;
        innerPartitionBSPNode.fixedIndexOffset = Integer.MIN_VALUE;
        InnerPartitionBSPNode$NodeReuseData innerPartitionBSPNode$NodeReuseData = innerPartitionBSPNode.reuseData;
        if (innerPartitionBSPNode$NodeReuseData == null) {
            return null;
        }
        if (innerPartitionBSPNode$NodeReuseData.indexCount != intArrayList.size()) {
            return null;
        }
        int n = 1;
        for (int i = 0; i < intArrayList.size(); ++i) {
            int n2 = intArrayList.getInt(i);
            TQuad tQuad = (TQuad)bSPWorkspace.get(n2);
            n = n * 31 + tQuad.getQuadHash();
        }
        if (n != innerPartitionBSPNode$NodeReuseData.quadHash) {
            return null;
        }
        InnerPartitionBSPNode$IndexRemapper innerPartitionBSPNode$IndexRemapper = new InnerPartitionBSPNode$IndexRemapper(innerPartitionBSPNode$NodeReuseData.maxIndex + 1, intArrayList);
        BSPSortState.decompressOrRead(innerPartitionBSPNode$NodeReuseData.indexes, innerPartitionBSPNode$IndexRemapper);
        if (innerPartitionBSPNode$IndexRemapper.hasFixedOffset()) {
            innerPartitionBSPNode.fixedIndexOffset = innerPartitionBSPNode$IndexRemapper.firstOffset;
        } else {
            innerPartitionBSPNode.indexMap = innerPartitionBSPNode$IndexRemapper.indexMap;
        }
        innerPartitionBSPNode.addPartitionPlanes(bSPWorkspace);
        return innerPartitionBSPNode;
    }

    private static void splitCandidate(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, int n, FullTQuad fullTQuad, Vector3fc vector3fc, float f, IntArrayList intArrayList2, IntArrayList intArrayList3) {
        int n2;
        int n3 = fullTQuad.getUniqueVertexMap();
        int n4 = Integer.bitCount(n3);
        if (n4 < 3) {
            throw new IllegalStateException("Unexpected quad with less than 3 unique vertices");
        }
        ChunkVertexEncoder.Vertex[] vertexArray = fullTQuad.getVertices();
        int n5 = 0;
        int n6 = 0;
        for (n2 = 0; n2 < 4; ++n2) {
            ChunkVertexEncoder.Vertex vertex = vertexArray[n2];
            float f2 = vector3fc.dot(vertex.x, vertex.y, vertex.z);
            float f3 = f2 - f;
            if (Math.abs(f3) < 1.0E-5f) {
                n6 |= 1 << n2;
                continue;
            }
            if (!(f3 < 0.0f)) continue;
            n5 |= 1 << n2;
        }
        n2 = n5 & n3;
        int n7 = n6 & n3;
        if (n7 == n3) {
            intArrayList.add(n);
            return;
        }
        if (n2 == 0) {
            intArrayList2.add(n);
            return;
        }
        if ((n2 | n7) == n3) {
            intArrayList3.add(n);
            return;
        }
        int n8 = Integer.bitCount(n7);
        int n9 = Integer.bitCount(n2);
        if (!bSPWorkspace.canSplitQuads()) {
            int n10 = 4 - n9 - n8;
            if (n8 >= n9 && n8 >= n10) {
                intArrayList.add(n);
            } else if (n9 >= n10) {
                intArrayList3.add(n);
            } else {
                intArrayList2.add(n);
            }
            return;
        }
        FullTQuad fullTQuad2 = FullTQuad.splittingCopy((FullTQuad)fullTQuad);
        FullTQuad fullTQuad3 = null;
        FullTQuad fullTQuad4 = null;
        if (n4 == 3) {
            int n11 = fullTQuad.getSameVertexMap();
            if (n8 == 1) {
                int n12 = -1;
                boolean bl = false;
                if ((n6 & n11) == 0) {
                    bl = (n11 & n5) != 0;
                    n12 = Integer.numberOfTrailingZeros(n11);
                }
                int n13 = Integer.numberOfTrailingZeros(n2);
                int n14 = Integer.numberOfTrailingZeros(~(n2 | n7) & n3);
                InnerPartitionBSPNode.splitTriangleVertex(n13, n14, n12, bl, fullTQuad, fullTQuad2, vector3fc, f);
            } else if (Integer.bitCount(n5) == 2) {
                InnerPartitionBSPNode.splitQuadEven(n5, fullTQuad, fullTQuad2, vector3fc, f);
            } else if (n9 == 1) {
                int n15 = Integer.numberOfTrailingZeros(n2);
                InnerPartitionBSPNode.splitTriangleCorner(n15, fullTQuad, fullTQuad2, vector3fc, f);
            } else {
                int n16 = Integer.numberOfTrailingZeros(~n5);
                InnerPartitionBSPNode.splitTriangleCorner(n16, fullTQuad2, fullTQuad, vector3fc, f);
            }
        } else {
            if (n8 == 2 && n7 == 5) {
                n2 |= 1;
                n9 = 2;
            } else if (n8 == 2 && n7 == 10) {
                n2 |= 2;
                n9 = 2;
            } else if (n8 == 1 && n9 == 1) {
                n2 |= n7;
                n9 = 2;
            }
            if (n9 == 2) {
                InnerPartitionBSPNode.splitQuadEven(n2, fullTQuad, fullTQuad2, vector3fc, f);
            } else if (n9 == 3) {
                int n17 = Integer.numberOfTrailingZeros(~n2);
                fullTQuad4 = FullTQuad.splittingCopy((FullTQuad)fullTQuad);
                InnerPartitionBSPNode.splitQuadOdd(n17, fullTQuad2, fullTQuad4, fullTQuad, vector3fc, f);
            } else {
                int n18 = Integer.numberOfTrailingZeros(n2);
                fullTQuad3 = FullTQuad.splittingCopy((FullTQuad)fullTQuad);
                InnerPartitionBSPNode.splitQuadOdd(n18, fullTQuad, fullTQuad3, fullTQuad2, vector3fc, f);
            }
        }
        InnerPartitionBSPNode.addQuadIndex(intArrayList3, bSPWorkspace.updateQuad(fullTQuad, n));
        InnerPartitionBSPNode.addQuadIndex(intArrayList2, bSPWorkspace.pushQuad(fullTQuad2));
        InnerPartitionBSPNode.addQuadIndex(intArrayList3, bSPWorkspace.pushQuad(fullTQuad4));
        InnerPartitionBSPNode.addQuadIndex(intArrayList2, bSPWorkspace.pushQuad(fullTQuad3));
    }

    private static void splitQuadEven(int n, FullTQuad fullTQuad, FullTQuad fullTQuad2, Vector3fc vector3fc, float f) {
        ChunkVertexEncoder.Vertex[] vertexArray = fullTQuad.getVertices();
        ChunkVertexEncoder.Vertex[] vertexArray2 = fullTQuad2.getVertices();
        for (int i = 0; i < 4; ++i) {
            int n2;
            int n3;
            boolean bl;
            int n4 = i + 1 & 3;
            boolean bl2 = (n & 1 << i) != 0;
            boolean bl3 = bl = (n & 1 << n4) != 0;
            if (bl2 == bl) continue;
            if (bl2) {
                n3 = i;
                n2 = n4;
            } else {
                n3 = n4;
                n2 = i;
            }
            InnerPartitionBSPNode.interpolateAttributes(f, vector3fc, vertexArray[n3], vertexArray2[n2], vertexArray[n2], vertexArray2[n3]);
        }
        fullTQuad.updateSplitQuadAfterVertexModification();
        fullTQuad2.updateSplitQuadAfterVertexModification();
    }

    private static boolean floatEquals(float f, float f2) {
        return Float.floatToIntBits(f) == Float.floatToIntBits(f2) || Math.abs(f - f2) <= 1.0E-5f;
    }

    private static float decodeDistance(long l) {
        return MathUtil.comparableIntToFloat((int)((int)(l >>> 32)));
    }

    private static void splitQuadOdd(int n, FullTQuad fullTQuad, FullTQuad fullTQuad2, FullTQuad fullTQuad3, Vector3fc vector3fc, float f) {
        ChunkVertexEncoder.Vertex[] vertexArray = fullTQuad.getVertices();
        ChunkVertexEncoder.Vertex[] vertexArray2 = fullTQuad2.getVertices();
        ChunkVertexEncoder.Vertex[] vertexArray3 = fullTQuad3.getVertices();
        int n2 = n - 1 & 3;
        int n3 = n + 1 & 3;
        int n4 = n + 2 & 3;
        ChunkVertexEncoder.Vertex vertex = vertexArray[n];
        InnerPartitionBSPNode.interpolateAttributes(f, vector3fc, vertex, vertexArray3[n3], vertexArray[n3], vertexArray2[n3], vertexArray3[n]);
        InnerPartitionBSPNode.interpolateAttributes(f, vector3fc, vertex, vertexArray3[n2], vertexArray[n2], vertexArray[n4], vertexArray2[n]);
        ChunkVertexEncoder.Vertex.copyVertexTo((ChunkVertexEncoder.Vertex)vertexArray2[n2], (ChunkVertexEncoder.Vertex)vertexArray2[n4]);
        fullTQuad.updateSplitQuadAfterVertexModification();
        fullTQuad2.updateSplitQuadAfterVertexModification();
        fullTQuad3.updateSplitQuadAfterVertexModification();
    }

    private static int decodeType(long l) {
        return (int)(l >>> 30) & 3;
    }

    private static BSPNode buildTopoMultiLeafNode(BSPWorkspace bSPWorkspace, IntArrayList intArrayList, boolean bl) {
        int n = intArrayList.size();
        if (n > TranslucentGeometryCollector.STATIC_TOPO_UNKNOWN_FALLBACK_LIMIT) {
            return null;
        }
        TQuad[] tQuadArray = new TQuad[n];
        int[] nArray = new int[n];
        for (int i = 0; i < intArrayList.size(); ++i) {
            int n2 = intArrayList.getInt(i);
            tQuadArray[i] = (TQuad)bSPWorkspace.get(n2);
            nArray[i] = n2;
        }
        InnerPartitionBSPNode$QuadIndexConsumerIntoArray innerPartitionBSPNode$QuadIndexConsumerIntoArray = new InnerPartitionBSPNode$QuadIndexConsumerIntoArray(n);
        if (!TopoGraphSorting.topoGraphSort((IntConsumer)((Object)innerPartitionBSPNode$QuadIndexConsumerIntoArray), (TQuad[])tQuadArray, (int)tQuadArray.length, (int[])nArray, null, null, (boolean)bl)) {
            return null;
        }
        return new LeafMultiBSPNode(BSPSortState.compressIndexesInPlace(innerPartitionBSPNode$QuadIndexConsumerIntoArray.indexes, false));
    }

    private static void interpolateAttributes(float f, Vector3fc vector3fc, ChunkVertexEncoder.Vertex vertex, ChunkVertexEncoder.Vertex vertex2, ChunkVertexEncoder.Vertex vertex3, ChunkVertexEncoder.Vertex vertex4, ChunkVertexEncoder.Vertex vertex5) {
        float f2 = vertex2.x - vertex.x;
        float f3 = vertex2.y - vertex.y;
        float f4 = vertex2.z - vertex.z;
        if (Math.abs(f2) < 1.0E-5f && Math.abs(f3) < 1.0E-5f && Math.abs(f4) < 1.0E-5f) {
            InnerPartitionBSPNode.copyVertexToMultiple(vertex, vertex3, vertex4, vertex5);
            return;
        }
        float f5 = vector3fc.dot(f2, f3, f4);
        if (f5 == 0.0f) {
            throw new IllegalStateException("Quad with an edge in the split plane should have been handled earlier");
        }
        float f6 = (f - vector3fc.dot(vertex.x, vertex.y, vertex.z)) / f5;
        if (f6 >= 1.0f) {
            InnerPartitionBSPNode.copyVertexToMultiple(vertex2, vertex3, vertex4, vertex5);
            return;
        }
        if (f6 <= 0.0f) {
            InnerPartitionBSPNode.copyVertexToMultiple(vertex, vertex3, vertex4, vertex5);
            return;
        }
        float f7 = vertex.x + f2 * f6;
        float f8 = vertex.y + f3 * f6;
        float f9 = vertex.z + f4 * f6;
        int n = ColorMixer.mix((int)vertex.color, (int)vertex2.color, (float)f6);
        float f10 = class04995.B((float)f6, (float)vertex.ao, (float)vertex2.ao);
        float f11 = class04995.B((float)f6, (float)vertex.u, (float)vertex2.u);
        float f12 = class04995.B((float)f6, (float)vertex.v, (float)vertex2.v);
        float f13 = class04995.B((float)f6, (float)(vertex.light & 0xFF), (float)(vertex2.light & 0xFF));
        float f14 = class04995.B((float)f6, (float)(vertex.light >> 16), (float)(vertex2.light >> 16));
        int n2 = ((int)f14 & 0xFF) << 16 | (int)f13 & 0xFF;
        ChunkVertexEncoder.Vertex.writeVertex((ChunkVertexEncoder.Vertex)vertex3, (float)f7, (float)f8, (float)f9, (int)n, (float)f10, (float)f11, (float)f12, (int)n2);
        ChunkVertexEncoder.Vertex.writeVertex((ChunkVertexEncoder.Vertex)vertex4, (float)f7, (float)f8, (float)f9, (int)n, (float)f10, (float)f11, (float)f12, (int)n2);
        if (vertex5 != null) {
            ChunkVertexEncoder.Vertex.writeVertex((ChunkVertexEncoder.Vertex)vertex5, (float)f7, (float)f8, (float)f9, (int)n, (float)f10, (float)f11, (float)f12, (int)n2);
        }
    }

    private static void interpolateAttributes(float f, Vector3fc vector3fc, ChunkVertexEncoder.Vertex vertex, ChunkVertexEncoder.Vertex vertex2, ChunkVertexEncoder.Vertex vertex3, ChunkVertexEncoder.Vertex vertex4) {
        InnerPartitionBSPNode.interpolateAttributes(f, vector3fc, vertex, vertex2, vertex3, vertex4, null);
    }

    private static BSPNode buildSNRLeafNodeFromPoints(BSPWorkspace bSPWorkspace, LongArrayList longArrayList, int n) {
        int n2;
        int n3 = longArrayList.size();
        if (n < n3) {
            for (int i = 0; i < n3; ++i) {
                long l = longArrayList.getLong(i);
                n2 = InnerPartitionBSPNode.decodeQuadIndex(l);
                if (((TQuad)bSPWorkspace.get(n2)).getFacing().getSign() != -1) continue;
                longArrayList.set(i, l ^ 0xFFFFFFFF00000000L);
            }
        }
        Arrays.sort(longArrayList.elements(), 0, n3);
        int[] nArray = new int[n3];
        int n4 = 0;
        int n5 = n;
        for (n2 = 0; n2 < n3; ++n2) {
            int n6 = InnerPartitionBSPNode.decodeQuadIndex(longArrayList.getLong(n2));
            if (((TQuad)bSPWorkspace.get(n6)).getFacing().getSign() == 1) {
                nArray[n4++] = n6;
                continue;
            }
            nArray[n5++] = n6;
        }
        return new LeafMultiBSPNode(BSPSortState.compressIndexes(IntArrayList.wrap((int[])nArray), false));
    }

    private static void copyVertexToMultiple(ChunkVertexEncoder.Vertex vertex, ChunkVertexEncoder.Vertex vertex2, ChunkVertexEncoder.Vertex vertex3, ChunkVertexEncoder.Vertex vertex4) {
        ChunkVertexEncoder.Vertex.copyVertexTo((ChunkVertexEncoder.Vertex)vertex, (ChunkVertexEncoder.Vertex)vertex2);
        ChunkVertexEncoder.Vertex.copyVertexTo((ChunkVertexEncoder.Vertex)vertex, (ChunkVertexEncoder.Vertex)vertex3);
        if (vertex4 != null) {
            ChunkVertexEncoder.Vertex.copyVertexTo((ChunkVertexEncoder.Vertex)vertex, (ChunkVertexEncoder.Vertex)vertex4);
        }
    }

    private static BSPNode buildSNRLeafNodeFromQuads(BSPWorkspace bSPWorkspace, IntArrayList intArrayList) {
        int n;
        int[] nArray = intArrayList.elements();
        int n2 = intArrayList.size();
        int[] nArray2 = new int[n2];
        int[] nArray3 = new int[n2];
        for (n = 0; n < n2; ++n) {
            TQuad tQuad = (TQuad)bSPWorkspace.get(nArray[n]);
            nArray2[n] = MathUtil.floatToComparableInt((float)tQuad.getAccurateDotProduct());
            nArray3[n] = n;
        }
        RadixSort.sortIndirect((int[])nArray3, (int[])nArray2, (boolean)true);
        for (n = 0; n < n2; ++n) {
            nArray3[n] = nArray[nArray3[n]];
        }
        return new LeafMultiBSPNode(BSPSortState.compressIndexes(IntArrayList.wrap((int[])nArray3), false));
    }

    static void flushBestSplittingGroup(IntArrayList intArrayList, IntArrayList intArrayList2, int n) {
        int n2;
        int n3 = intArrayList.size();
        if (n3 > (n2 = intArrayList2.size()) || n3 == n2 && n == 1) {
            intArrayList2.clear();
            intArrayList2.addAll((IntList)intArrayList);
        }
        intArrayList.clear();
    }

    private static void splitTriangleCorner(int n, FullTQuad fullTQuad, FullTQuad fullTQuad2, Vector3fc vector3fc, float f) {
        ChunkVertexEncoder.Vertex[] vertexArray = fullTQuad.getVertices();
        ChunkVertexEncoder.Vertex[] vertexArray2 = fullTQuad2.getVertices();
        int n2 = n - 1 & 3;
        int n3 = n + 1 & 3;
        int n4 = n + 2 & 3;
        ChunkVertexEncoder.Vertex vertex = vertexArray[n];
        InnerPartitionBSPNode.interpolateAttributes(f, vector3fc, vertex, vertexArray2[n3], vertexArray[n3], vertexArray[n4], vertexArray2[n]);
        ChunkVertexEncoder.Vertex.copyVertexTo((ChunkVertexEncoder.Vertex)vertexArray2[n2], (ChunkVertexEncoder.Vertex)vertexArray2[n4]);
        InnerPartitionBSPNode.interpolateAttributes(f, vector3fc, vertex, vertexArray2[n2], vertexArray[n2], vertexArray2[n2]);
        fullTQuad.updateSplitQuadAfterVertexModification();
        fullTQuad2.updateSplitQuadAfterVertexModification();
    }

    private static long encodeIntervalPoint(float f, int n, int n2) {
        return (long)MathUtil.floatToComparableInt((float)f) << 32 | (long)n2 << 30 | (long)n;
    }

    private static void splitTriangleVertex(int n, int n2, int n3, boolean bl, FullTQuad fullTQuad, FullTQuad fullTQuad2, Vector3fc vector3fc, float f) {
        ChunkVertexEncoder.Vertex[] vertexArray = fullTQuad.getVertices();
        ChunkVertexEncoder.Vertex[] vertexArray2 = fullTQuad2.getVertices();
        ChunkVertexEncoder.Vertex vertex = null;
        if (n3 != -1) {
            vertex = bl ? vertexArray2[n3] : vertexArray[n3];
        }
        InnerPartitionBSPNode.interpolateAttributes(f, vector3fc, vertexArray[n], vertexArray2[n2], vertexArray[n2], vertexArray2[n], vertex);
        fullTQuad.updateSplitQuadAfterVertexModification();
        fullTQuad2.updateSplitQuadAfterVertexModification();
    }
}

