/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 *  it.unimi.dsi.fastutil.ints.IntList
 *  net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData
 *  net.caffeinemc.mods.sodium.client.util.NativeBuffer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntConsumer;
import it.unimi.dsi.fastutil.ints.IntList;
import java.nio.IntBuffer;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree.InnerPartitionBSPNode;
import net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.data.TranslucentData;
import net.caffeinemc.mods.sodium.client.util.NativeBuffer;

class BSPSortState {
    static final int NO_FIXED_OFFSET = Integer.MIN_VALUE;
    private IntBuffer indexBuffer;
    private int indexModificationsRemaining;
    private int[] indexMap;
    private int fixedIndexOffset = Integer.MIN_VALUE;
    private static final int INDEX_COMPRESSION_MIN_LENGTH = 32;
    private static final int HEADER_LENGTH = 2;
    private static final int[] WIDTHS = new int[]{1, 2, 3, 4, 5, 6, 8, 10, 16, 32};
    private static final int CONSTANT_DELTA_WIDTH_INDEX = 15;
    private final IntConsumer indexConsumer = n -> TranslucentData.writeQuadVertexIndexes((IntBuffer)this.indexBuffer, (int)n);
    private final IntConsumer indexMapConsumer = n -> TranslucentData.writeQuadVertexIndexes((IntBuffer)this.indexBuffer, (int)this.indexMap[n]);

    private static int decompress(int[] nArray, IntConsumer intConsumer) {
        return BSPSortState.decompressWithOffset(nArray, 0, intConsumer);
    }

    BSPSortState(NativeBuffer nativeBuffer) {
        this.indexBuffer = nativeBuffer.getDirectBuffer().asIntBuffer();
    }

    private static int ceilDiv(int n, int n2) {
        return -Math.floorDiv(-n, n2);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    private static boolean isOutOfBounds(int n) {
        if (n < 32) return true;
        if (n <= 1024) return false;
        return true;
    }

    static int[] compressIndexes(IntArrayList intArrayList) {
        return BSPSortState.compressIndexes(intArrayList, true);
    }

    static int[] compressIndexes(IntArrayList intArrayList, boolean bl) {
        int n;
        int n2;
        int n3;
        if (BSPSortState.isOutOfBounds(intArrayList.size())) {
            return intArrayList.toIntArray();
        }
        IntArrayList intArrayList2 = new IntArrayList((IntList)intArrayList);
        if (bl) {
            intArrayList2.sort(null);
        }
        int n4 = intArrayList2.getInt(0);
        int n5 = Integer.MAX_VALUE;
        int n6 = 0;
        for (n3 = 1; n3 < intArrayList2.size(); ++n3) {
            n2 = intArrayList2.getInt(n3);
            n = n2 - n4;
            intArrayList2.set(n3, n);
            n4 = n2;
            if (n < n5) {
                n5 = n;
            }
            if (n <= n6) continue;
            n6 = n;
        }
        n3 = 32 - Integer.numberOfLeadingZeros(n6 - n5);
        n2 = intArrayList2.getInt(0);
        if (n2 > 131072) {
            return intArrayList.toIntArray();
        }
        n = intArrayList2.size() - 1;
        if (n3 == 0) {
            int[] nArray = new int[]{0xF8000000 | n << 17 | n2, n5};
            return nArray;
        }
        if (n3 > 16) {
            return intArrayList.toIntArray();
        }
        int n7 = 0;
        while (WIDTHS[n7] < n3) {
            ++n7;
        }
        int n8 = WIDTHS[n7];
        int n9 = WIDTHS[WIDTHS.length - n7 - 1];
        int n10 = 2 + BSPSortState.ceilDiv(n, n9);
        int[] nArray = new int[n10];
        nArray[0] = Integer.MIN_VALUE | n7 << 27 | n << 17 | n2;
        nArray[1] = n5;
        int n11 = 32 - n8;
        int n12 = 2;
        int n13 = 0;
        int n14 = 0;
        for (int i = 1; i < intArrayList2.size(); ++i) {
            int n15 = intArrayList2.getInt(i) - n5;
            n13 |= n15 << n14;
            if ((n14 += n8) <= n11) continue;
            nArray[n12++] = n13;
            n13 = 0;
            n14 = 0;
        }
        if (n14 > 0) {
            nArray[n12++] = n13;
        }
        return nArray;
    }

    static void decompressOrRead(int[] nArray, IntConsumer intConsumer) {
        if (BSPSortState.isCompressed(nArray)) {
            BSPSortState.decompress(nArray, intConsumer);
        } else {
            for (int i = 0; i < nArray.length; ++i) {
                intConsumer.accept(nArray[i]);
            }
        }
    }

    void writeIndexes(int[] nArray) {
        int n;
        boolean bl;
        boolean bl2 = this.indexMap != null;
        boolean bl3 = bl = this.fixedIndexOffset != Integer.MIN_VALUE;
        if (BSPSortState.isCompressed(nArray)) {
            n = bl ? BSPSortState.decompressWithOffset(nArray, this.fixedIndexOffset, this.indexConsumer) : BSPSortState.decompress(nArray, bl2 ? this.indexMapConsumer : this.indexConsumer);
        } else {
            if (bl2) {
                for (int i = 0; i < nArray.length; ++i) {
                    TranslucentData.writeQuadVertexIndexes((IntBuffer)this.indexBuffer, (int)this.indexMap[nArray[i]]);
                }
            } else if (bl) {
                for (int i = 0; i < nArray.length; ++i) {
                    TranslucentData.writeQuadVertexIndexes((IntBuffer)this.indexBuffer, (int)(this.fixedIndexOffset + nArray[i]));
                }
            } else {
                TranslucentData.writeQuadVertexIndexes((IntBuffer)this.indexBuffer, (int[])nArray);
            }
            n = nArray.length;
        }
        if (bl2 || bl) {
            this.checkModificationCounter(n);
        }
    }

    void startNode(InnerPartitionBSPNode innerPartitionBSPNode) {
        if (innerPartitionBSPNode.indexMap != null) {
            if (this.indexMap != null || this.fixedIndexOffset != Integer.MIN_VALUE) {
                throw new IllegalStateException("Index modification already in progress");
            }
            this.indexMap = innerPartitionBSPNode.indexMap;
            this.indexModificationsRemaining = innerPartitionBSPNode.reuseData.indexCount();
        } else if (innerPartitionBSPNode.fixedIndexOffset != Integer.MIN_VALUE) {
            if (this.indexMap != null || this.fixedIndexOffset != Integer.MIN_VALUE) {
                throw new IllegalStateException("Index modification already in progress");
            }
            this.fixedIndexOffset = innerPartitionBSPNode.fixedIndexOffset;
            this.indexModificationsRemaining = innerPartitionBSPNode.reuseData.indexCount();
        }
    }

    void writeIndex(int n) {
        if (this.indexMap != null) {
            TranslucentData.writeQuadVertexIndexes((IntBuffer)this.indexBuffer, (int)this.indexMap[n]);
            this.checkModificationCounter(1);
        } else if (this.fixedIndexOffset != Integer.MIN_VALUE) {
            TranslucentData.writeQuadVertexIndexes((IntBuffer)this.indexBuffer, (int)(this.fixedIndexOffset + n));
            this.checkModificationCounter(1);
        } else {
            TranslucentData.writeQuadVertexIndexes((IntBuffer)this.indexBuffer, (int)n);
        }
    }

    static boolean isCompressed(int[] nArray) {
        return nArray[0] < 0;
    }

    private static int decompressWithOffset(int[] nArray, int n, IntConsumer intConsumer) {
        int n2 = nArray[0];
        int n3 = n2 >> 27 & 0xF;
        int n4 = n2 & 131071 + n;
        int n5 = (n2 >> 17 & 0x3FF) + 1;
        int n6 = nArray[1];
        if (n3 == 15) {
            for (int i = 0; i < n5; ++i) {
                intConsumer.accept(n4);
                n4 += n6;
            }
            return n5;
        }
        int n7 = WIDTHS[n3];
        int n8 = (1 << n7) - 1;
        int n9 = 32 - n7;
        int n10 = 2;
        int n11 = nArray[n10++];
        int n12 = 0;
        int n13 = n5;
        while (n5-- > 0) {
            intConsumer.accept(n4);
            if (n5 == 0) break;
            int n14 = n11 >> n12 & n8;
            if ((n12 += n7) > n9 && n5 > 1) {
                n11 = nArray[n10++];
                n12 = 0;
            }
            n4 += n6 + n14;
        }
        return n13;
    }

    private void checkModificationCounter(int n) {
        this.indexModificationsRemaining -= n;
        if (this.indexModificationsRemaining <= 0) {
            this.indexMap = null;
            this.fixedIndexOffset = Integer.MIN_VALUE;
        }
    }

    static int[] compressIndexesInPlace(int[] nArray, boolean bl) {
        if (BSPSortState.isOutOfBounds(nArray.length)) {
            return nArray;
        }
        return BSPSortState.compressIndexes(IntArrayList.wrap((int[])nArray), bl);
    }
}

