/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectListIterator
 *  it.unimi.dsi.fastutil.objects.ReferenceArrayList
 *  minecraft.class01296
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.api.util.NormI8
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.NoData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.StaticNormalRelativeData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.StaticTopoData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.FullTQuad
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.RegularTQuad
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GeometryPlanes
 *  net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder$Vertex
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting;

import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import it.unimi.dsi.fastutil.objects.ReferenceArrayList;
import minecraft.class01296;
import minecraft.class04995;
import net.caffeinemc.mods.sodium.api.util.NormI8;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.model.quad.properties.ModelQuadFacing;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.QuadSplittingMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortBehavior$SortMode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.SortType;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.BSPBuildFailureException;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.AnyOrderData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.CombinedCameraPos;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicBSPData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.DynamicTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.NoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.PresentTranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.StaticNormalRelativeData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.StaticTopoData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.FullTQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.RegularTQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.quad.TQuad;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.trigger.GeometryPlanes;
import net.caffeinemc.mods.sodium.client.render.chunk.vertex.format.ChunkVertexEncoder;

public class TranslucentGeometryCollector {
    private final class01296 sectionPos;
    private final QuadSplittingMode quadSplittingMode;
    private final SortBehavior sortBehavior;
    private boolean hasUnaligned;
    private int untrackedUnalignedNormalCount;
    private int alignedFacingBitmap;
    private final float[] extents;
    private boolean alignedExtentsMultiple;
    private final float[] alignedExtremes;
    private int unalignedANormal;
    private float unalignedADistance1;
    private float unalignedADistance2;
    private int unalignedBNormal;
    private float unalignedBDistance1;
    private float unalignedBDistance2;
    private ReferenceArrayList<TQuad>[] quadLists;
    private final int[] meshFacingCounts;
    private TQuad[] quads;
    private SortType sortType;
    private boolean quadHashPresent;
    private int quadHash;
    private static final int[] STATIC_TOPO_SORT_ATTEMPT_LIMITS;
    public static final int STATIC_TOPO_UNKNOWN_FALLBACK_LIMIT;

    public TranslucentGeometryCollector(class01296 class012962, SortBehavior sortBehavior) {
        this.quadSplittingMode = SodiumClientMod.options().performance.quadSplittingMode;
        this.hasUnaligned = false;
        this.untrackedUnalignedNormalCount = 0;
        this.alignedFacingBitmap = 0;
        this.extents = new float[]{Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY};
        this.alignedExtentsMultiple = false;
        this.alignedExtremes = new float[]{Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY};
        this.unalignedANormal = -1;
        this.unalignedADistance1 = Float.NaN;
        this.unalignedADistance2 = Float.NaN;
        this.unalignedBNormal = -1;
        this.unalignedBDistance1 = Float.NaN;
        this.unalignedBDistance2 = Float.NaN;
        this.quadLists = new ReferenceArrayList[ModelQuadFacing.COUNT];
        this.meshFacingCounts = new int[ModelQuadFacing.COUNT];
        this.quadHashPresent = false;
        this.quadHash = 0;
        this.sectionPos = class012962;
        this.sortBehavior = sortBehavior;
    }

    static {
        int[] nArray = new int[6];
        nArray[0] = -1;
        nArray[1] = -1;
        nArray[2] = 250;
        nArray[3] = 100;
        nArray[4] = 50;
        nArray[5] = 30;
        STATIC_TOPO_SORT_ATTEMPT_LIMITS = nArray;
        STATIC_TOPO_UNKNOWN_FALLBACK_LIMIT = STATIC_TOPO_SORT_ATTEMPT_LIMITS[STATIC_TOPO_SORT_ATTEMPT_LIMITS.length - 1];
    }

    public TranslucentData getTranslucentData(TranslucentData translucentData, CombinedCameraPos combinedCameraPos) {
        if (this.quads.length == 0) {
            return NoData.forNoTranslucent((class01296)this.sectionPos);
        }
        if (translucentData != null && translucentData.oldDataMatches(this, this.sortType, this.quads)) {
            return translucentData;
        }
        TranslucentData translucentData2 = this.makeNewTranslucentData(combinedCameraPos, translucentData);
        if (translucentData2 instanceof PresentTranslucentData) {
            PresentTranslucentData presentTranslucentData = (PresentTranslucentData)translucentData2;
            presentTranslucentData.setQuadHash(this.getQuadHash());
        }
        return translucentData2;
    }

    public SortType finishRendering() {
        int n = 0;
        ReferenceArrayList<TQuad>[] referenceArrayListArray = this.quadLists;
        int n2 = referenceArrayListArray.length;
        for (int i = 0; i < n2; ++i) {
            ObjectListIterator objectListIterator = referenceArrayListArray[i];
            if (objectListIterator == null) continue;
            n += objectListIterator.size();
        }
        this.quads = new TQuad[n];
        int n3 = 0;
        for (n2 = 0; n2 < ModelQuadFacing.COUNT; ++n2) {
            ReferenceArrayList<TQuad> referenceArrayList = this.quadLists[n2];
            if (referenceArrayList == null) continue;
            this.meshFacingCounts[n2] = referenceArrayList.size();
            for (TQuad tQuad : referenceArrayList) {
                this.quads[n3++] = tQuad;
            }
            if (n2 >= ModelQuadFacing.DIRECTIONS) continue;
            this.alignedFacingBitmap |= 1 << n2;
        }
        this.quadLists = null;
        this.sortType = TranslucentGeometryCollector.filterSortType(this.sortTypeHeuristic(), this.sortBehavior);
        return this.sortType;
    }

    private static SortType filterSortType(SortType sortType, SortBehavior sortBehavior) {
        switch (sortBehavior) {
            case OFF: {
                return SortType.NONE;
            }
            case STATIC: {
                if (sortType == SortType.STATIC_NORMAL_RELATIVE || sortType == SortType.STATIC_TOPO) {
                    return sortType;
                }
                return SortType.NONE;
            }
        }
        return sortType;
    }

    private SortType sortTypeHeuristic() {
        int n;
        if (this.quads.length <= 1) {
            return SortType.NONE;
        }
        if (this.sortBehavior.getSortMode() == SortBehavior$SortMode.NONE) {
            return SortType.NONE;
        }
        int n2 = Integer.bitCount(this.alignedFacingBitmap);
        int n3 = this.getPlaneCount(n2);
        int n4 = this.untrackedUnalignedNormalCount;
        if (this.unalignedANormal != -1) {
            ++n4;
        }
        if (this.unalignedBNormal != -1) {
            ++n4;
        }
        int n5 = n2 + n4;
        if (n3 <= 1) {
            return SortType.NONE;
        }
        if (!this.hasUnaligned) {
            n = ModelQuadFacing.bitmapIsOpposingAligned((int)this.alignedFacingBitmap);
            if (n3 == 2 && n != 0) {
                return SortType.NONE;
            }
            if (!this.alignedExtentsMultiple) {
                boolean bl = true;
                for (int i = 0; i < ModelQuadFacing.DIRECTIONS; ++i) {
                    int n6;
                    float f = this.alignedExtremes[i];
                    if (Float.isInfinite(f)) continue;
                    int n7 = n6 = i < 3 ? 1 : -1;
                    if ((float)n6 * f == this.extents[i]) continue;
                    bl = false;
                    break;
                }
                if (bl) {
                    return SortType.NONE;
                }
            }
            if (n != 0 || n2 == 1) {
                return SortType.STATIC_NORMAL_RELATIVE;
            }
        } else if (n2 == 0 ? n4 == 1 || n4 == 2 && NormI8.isOpposite((int)this.unalignedANormal, (int)this.unalignedBNormal) : n3 == 2 && NormI8.isOpposite((int)this.unalignedANormal, (int)ModelQuadFacing.PACKED_ALIGNED_NORMALS[n = Integer.numberOfTrailingZeros(this.alignedFacingBitmap)])) {
            return SortType.STATIC_NORMAL_RELATIVE;
        }
        if (this.quads.length <= STATIC_TOPO_SORT_ATTEMPT_LIMITS[n = class04995.N((int)n5, (int)2, (int)(STATIC_TOPO_SORT_ATTEMPT_LIMITS.length - 1))]) {
            return SortType.STATIC_TOPO;
        }
        return SortType.DYNAMIC;
    }

    public int getQuadHash() {
        if (this.quadHashPresent) {
            return this.quadHash;
        }
        TQuad[] tQuadArray = this.quads;
        for (int i = 0; i < tQuadArray.length; ++i) {
            TQuad tQuad = tQuadArray[i];
            this.quadHash = this.quadHash * 31 + tQuad.getQuadHash() + i * 3;
        }
        this.quadHashPresent = true;
        return this.quadHash;
    }

    public boolean isSplittingQuads() {
        return this.quadSplittingMode.allowsSplitting();
    }

    private int getPlaneCount(int n) {
        int n2 = n;
        if (this.alignedExtentsMultiple) {
            n2 = 100;
        }
        int n3 = 0;
        if (!Float.isNaN(this.unalignedADistance1)) {
            ++n3;
        }
        if (!Float.isNaN(this.unalignedADistance2)) {
            ++n3;
        }
        if (!Float.isNaN(this.unalignedBDistance1)) {
            ++n3;
        }
        if (!Float.isNaN(this.unalignedBDistance2)) {
            ++n3;
        }
        return n2 + n3;
    }

    public boolean appendQuad(ChunkVertexEncoder.Vertex[] vertexArray, ModelQuadFacing modelQuadFacing, int n) {
        Object object = this.isSplittingQuads() ? FullTQuad.fromVertices((ChunkVertexEncoder.Vertex[])vertexArray, (ModelQuadFacing)modelQuadFacing, (int)n) : RegularTQuad.fromVertices((ChunkVertexEncoder.Vertex[])vertexArray, (ModelQuadFacing)modelQuadFacing, (int)n);
        if (object == null) {
            return true;
        }
        int n2 = modelQuadFacing.ordinal();
        ReferenceArrayList referenceArrayList = this.quadLists[n2];
        if (referenceArrayList == null) {
            this.quadLists[n2] = referenceArrayList = new ReferenceArrayList();
        }
        referenceArrayList.add(object);
        if (modelQuadFacing.isAligned()) {
            if (!this.hasUnaligned) {
                int n3;
                float[] fArray = object.getExtents();
                for (n3 = 0; n3 < 3; ++n3) {
                    this.extents[n3] = Math.max(this.extents[n3], fArray[n3]);
                }
                for (n3 = 3; n3 < 6; ++n3) {
                    this.extents[n3] = Math.min(this.extents[n3], fArray[n3]);
                }
            }
            float f = this.alignedExtremes[n2];
            float f2 = object.getAccurateDotProduct();
            float f3 = this.alignedExtremes[n2];
            if (!this.alignedExtentsMultiple && !Float.isInfinite(f3) && f3 != f2) {
                this.alignedExtentsMultiple = true;
            }
            this.alignedExtremes[n2] = modelQuadFacing.getSign() > 0 ? Math.max(f, f2) : Math.min(f, f2);
        } else {
            this.hasUnaligned = true;
            float f = object.getAccurateDotProduct();
            if (n == this.unalignedANormal) {
                if (Float.isNaN(this.unalignedADistance1)) {
                    this.unalignedADistance1 = f;
                } else {
                    this.unalignedADistance2 = f;
                }
            } else if (n == this.unalignedBNormal) {
                if (Float.isNaN(this.unalignedBDistance1)) {
                    this.unalignedBDistance1 = f;
                } else {
                    this.unalignedBDistance2 = f;
                }
            } else if (this.unalignedANormal == -1) {
                this.unalignedANormal = n;
                this.unalignedADistance1 = f;
            } else if (this.unalignedBNormal == -1) {
                this.unalignedBNormal = n;
                this.unalignedBDistance1 = f;
            } else {
                ++this.untrackedUnalignedNormalCount;
            }
        }
        return false;
    }

    private TranslucentData makeNewTranslucentData(CombinedCameraPos combinedCameraPos, TranslucentData translucentData) {
        if (this.sortType == SortType.NONE) {
            return AnyOrderData.fromMesh(this.quads, this.sectionPos);
        }
        if (this.sortType == SortType.STATIC_NORMAL_RELATIVE) {
            boolean bl = this.alignedFacingBitmap == 0;
            return StaticNormalRelativeData.fromMesh((int[])this.meshFacingCounts, (TQuad[])this.quads, (class01296)this.sectionPos, (boolean)bl);
        }
        if (this.sortType == SortType.STATIC_TOPO) {
            StaticTopoData staticTopoData = StaticTopoData.fromMesh((TQuad[])this.quads, (class01296)this.sectionPos, (boolean)this.isSplittingQuads());
            if (staticTopoData != null) {
                return staticTopoData;
            }
            this.sortType = SortType.DYNAMIC;
        }
        this.sortType = TranslucentGeometryCollector.filterSortType(this.sortType, this.sortBehavior);
        if (this.sortType == SortType.NONE) {
            return AnyOrderData.fromMesh(this.quads, this.sectionPos);
        }
        if (this.sortType == SortType.DYNAMIC) {
            try {
                return DynamicBSPData.fromMesh(combinedCameraPos, this.quads, this.sectionPos, translucentData, this.quadSplittingMode);
            }
            catch (BSPBuildFailureException bSPBuildFailureException) {
                GeometryPlanes geometryPlanes = GeometryPlanes.fromQuadLists((class01296)this.sectionPos, (TQuad[])this.quads);
                return DynamicTopoData.fromMesh((CombinedCameraPos)combinedCameraPos, (TQuad[])this.quads, (class01296)this.sectionPos, (GeometryPlanes)geometryPlanes);
            }
        }
        throw new IllegalStateException("Unknown sort type: " + String.valueOf((Object)this.sortType));
    }
}

