/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntArrayList
 *  it.unimi.dsi.fastutil.ints.IntConsumer
 */
package net.caffeinemc.mods.sodium.client.render.chunk.translucent_sorting.bsp_tree;

import it.unimi.dsi.fastutil.ints.IntArrayList;
import it.unimi.dsi.fastutil.ints.IntConsumer;

class InnerPartitionBSPNode$IndexRemapper
implements IntConsumer {
    final int[] indexMap;
    private final IntArrayList newIndexes;
    private int index = 0;
    int firstOffset = 0;
    private static final int OFFSET_CHANGED = Integer.MIN_VALUE;

    InnerPartitionBSPNode$IndexRemapper(int n, IntArrayList intArrayList) {
        this.indexMap = new int[n];
        this.newIndexes = intArrayList;
    }

    public void accept(int n) {
        int n2;
        this.indexMap[n] = n2 = this.newIndexes.getInt(this.index);
        int n3 = n2 - n;
        if (this.index == 0) {
            this.firstOffset = n3;
        } else if (this.firstOffset != n3) {
            this.firstOffset = Integer.MIN_VALUE;
        }
        ++this.index;
    }

    boolean hasFixedOffset() {
        return this.firstOffset != Integer.MIN_VALUE;
    }
}

