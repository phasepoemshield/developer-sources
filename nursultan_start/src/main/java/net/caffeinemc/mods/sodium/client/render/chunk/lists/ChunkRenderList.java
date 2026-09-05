/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class04995
 *  net.caffeinemc.mods.sodium.client.render.chunk.LocalSectionIndex
 *  net.caffeinemc.mods.sodium.client.util.iterator.ByteArrayIterator
 *  net.caffeinemc.mods.sodium.client.util.iterator.ByteIterator
 *  net.caffeinemc.mods.sodium.client.util.iterator.ReversibleByteArrayIterator
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.render.chunk.lists;

import java.util.Arrays;
import minecraft.class01296;
import minecraft.class04995;
import net.caffeinemc.mods.sodium.client.render.chunk.LocalSectionIndex;
import net.caffeinemc.mods.sodium.client.render.chunk.lists.SortItemsProvider;
import net.caffeinemc.mods.sodium.client.render.chunk.region.RenderRegion;
import net.caffeinemc.mods.sodium.client.util.iterator.ByteArrayIterator;
import net.caffeinemc.mods.sodium.client.util.iterator.ByteIterator;
import net.caffeinemc.mods.sodium.client.util.iterator.ReversibleByteArrayIterator;
import org.jspecify.annotations.Nullable;

public class ChunkRenderList {
    private final RenderRegion region;
    private final byte[] sectionsWithGeometry = new byte[256];
    private final long[] sectionsWithGeometryMap = new long[4];
    private final long[] prevSectionsWithGeometryMap = new long[4];
    private int sectionsWithGeometryCount = 0;
    private int prevSectionsWithGeometryCount = 0;
    private int lastRelativeCameraSectionX;
    private int lastRelativeCameraSectionY;
    private int lastRelativeCameraSectionZ;
    private boolean addedSectionsAreSorted = false;
    private final byte[] sectionsWithSprites = new byte[256];
    private int sectionsWithSpritesCount = 0;
    private final byte[] sectionsWithEntities = new byte[256];
    private int sectionsWithEntitiesCount = 0;
    private int size;
    private int lastVisibleFrame;
    private static final int SORTING_HISTOGRAM_SIZE = 18;

    public ChunkRenderList(RenderRegion renderRegion) {
        this.region = renderRegion;
    }

    public int size() {
        return this.size;
    }

    public void reset(int n, boolean bl) {
        this.prevSectionsWithGeometryCount = this.sectionsWithGeometryCount;
        Arrays.fill(this.sectionsWithGeometryMap, 0L);
        this.sectionsWithGeometryCount = 0;
        this.sectionsWithSpritesCount = 0;
        this.sectionsWithEntitiesCount = 0;
        this.size = 0;
        this.lastVisibleFrame = n;
        this.addedSectionsAreSorted = bl;
    }

    public void add(int n, int n2) {
        ++this.size;
        if ((n2 >>> 0 & 1) == 1) {
            int n3 = n >> 6;
            this.sectionsWithGeometryMap[n3] = this.sectionsWithGeometryMap[n3] | 1L << (n & 0x3F);
            if (this.addedSectionsAreSorted) {
                this.sectionsWithGeometry[this.sectionsWithGeometryCount] = (byte)n;
            }
            ++this.sectionsWithGeometryCount;
        }
        this.sectionsWithSprites[this.sectionsWithSpritesCount] = (byte)n;
        this.sectionsWithSpritesCount += n2 >>> 2 & 1;
        this.sectionsWithEntities[this.sectionsWithEntitiesCount] = (byte)n;
        this.sectionsWithEntitiesCount += n2 >>> 1 & 1;
    }

    public RenderRegion getRegion() {
        return this.region;
    }

    public @Nullable ByteIterator sectionsWithSpritesIterator() {
        if (this.sectionsWithSpritesCount == 0) {
            return null;
        }
        return new ByteArrayIterator(this.sectionsWithSprites, this.sectionsWithSpritesCount);
    }

    public int getSectionsWithGeometryCount() {
        return this.sectionsWithGeometryCount;
    }

    public @Nullable ByteIterator sectionsWithGeometryIterator(boolean bl) {
        if (this.sectionsWithGeometryCount == 0) {
            return null;
        }
        return new ReversibleByteArrayIterator(this.sectionsWithGeometry, this.sectionsWithGeometryCount, bl);
    }

    public @Nullable ByteIterator sectionsWithEntitiesIterator() {
        if (this.sectionsWithEntitiesCount == 0) {
            return null;
        }
        return new ByteArrayIterator(this.sectionsWithEntities, this.sectionsWithEntitiesCount);
    }

    public int getSectionsWithSpritesCount() {
        return this.sectionsWithSpritesCount;
    }

    public int getSectionsWithEntitiesCount() {
        return this.sectionsWithEntitiesCount;
    }

    public void prepareForRender(class01296 class012962, SortItemsProvider sortItemsProvider) {
        int n = class04995.N((int)(class012962.method_10263() - this.region.getChunkX()), (int)-1, (int)8);
        int n2 = class04995.N((int)(class012962.method_10264() - this.region.getChunkY()), (int)-1, (int)4);
        int n3 = class04995.N((int)(class012962.method_10260() - this.region.getChunkZ()), (int)-1, (int)8);
        if (this.prevSectionsWithGeometryCount != this.sectionsWithGeometryCount || n != this.lastRelativeCameraSectionX || n2 != this.lastRelativeCameraSectionY || n3 != this.lastRelativeCameraSectionZ || !Arrays.equals(this.sectionsWithGeometryMap, this.prevSectionsWithGeometryMap)) {
            this.region.clearAllCachedBatches();
            this.prevSectionsWithGeometryCount = this.sectionsWithGeometryCount;
            System.arraycopy(this.sectionsWithGeometryMap, 0, this.prevSectionsWithGeometryMap, 0, this.sectionsWithGeometryMap.length);
            this.lastRelativeCameraSectionX = n;
            this.lastRelativeCameraSectionY = n2;
            this.lastRelativeCameraSectionZ = n3;
            if (!this.addedSectionsAreSorted) {
                this.sortSections(n, n2, n3, sortItemsProvider);
            }
        }
    }

    private void sortSections(int n, int n2, int n3, SortItemsProvider sortItemsProvider) {
        int n4;
        n = class04995.N((int)n, (int)0, (int)7);
        n2 = class04995.N((int)n2, (int)0, (int)3);
        n3 = class04995.N((int)n3, (int)0, (int)7);
        int[] nArray = new int[18];
        int[] nArray2 = sortItemsProvider.ensureSortItemsOfLength(this.sectionsWithGeometryCount);
        this.sectionsWithGeometryCount = 0;
        for (n4 = 0; n4 < this.sectionsWithGeometryMap.length; ++n4) {
            int n5 = n4 << 6;
            for (long i = this.sectionsWithGeometryMap[n4]; i != 0L; i &= i - 1L) {
                int n6;
                int n7 = Long.numberOfTrailingZeros(i) + n5;
                int n8 = Math.abs(LocalSectionIndex.unpackX((int)n7) - n);
                int n9 = Math.abs(LocalSectionIndex.unpackY((int)n7) - n2);
                int n10 = Math.abs(LocalSectionIndex.unpackZ((int)n7) - n3);
                int n11 = n6 = n8 + n9 + n10;
                nArray[n11] = nArray[n11] + 1;
                nArray2[this.sectionsWithGeometryCount++] = n6 << 8 | n7;
            }
        }
        for (n4 = 1; n4 < 18; ++n4) {
            int n12 = n4;
            nArray[n12] = nArray[n12] + nArray[n4 - 1];
        }
        for (n4 = 0; n4 < this.sectionsWithGeometryCount; ++n4) {
            int n13;
            int n14 = nArray2[n4];
            int n15 = n13 = n14 >>> 8;
            int n16 = nArray[n15] - 1;
            nArray[n15] = n16;
            this.sectionsWithGeometry[n16] = (byte)n14;
        }
    }

    public int getLastVisibleFrame() {
        return this.lastVisibleFrame;
    }
}

