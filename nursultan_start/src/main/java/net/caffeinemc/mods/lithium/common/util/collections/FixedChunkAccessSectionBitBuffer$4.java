/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntIterator
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.ints.IntIterator;

class FixedChunkAccessSectionBitBuffer$4
implements IntIterator {
    int y;
    final /* synthetic */ int val$yMin;
    final /* synthetic */ int val$yLimit;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    FixedChunkAccessSectionBitBuffer$4() {
        void var3_-1;
        this.val$yMin = n2;
        this.val$yLimit = var3_-1;
        this.y = this.val$yMin;
    }

    public boolean hasNext() {
        return this.y < this.val$yLimit;
    }

    public int nextInt() {
        return this.y++;
    }
}

