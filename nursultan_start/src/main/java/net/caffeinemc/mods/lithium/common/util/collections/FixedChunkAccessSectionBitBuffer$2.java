/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  minecraft.class07321
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.longs.LongIterator;
import minecraft.class07321;

class FixedChunkAccessSectionBitBuffer$2
implements LongIterator {
    int x;
    int z;
    final /* synthetic */ int val$xMin;
    final /* synthetic */ int val$zMin;
    final /* synthetic */ int val$zMax;
    final /* synthetic */ int val$xMax;

    public long nextLong() {
        long l = class07321.u((int)this.x, (int)this.z);
        if (this.z < this.val$zMax) {
            ++this.z;
        } else {
            this.z = this.val$zMin;
            ++this.x;
        }
        return l;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    FixedChunkAccessSectionBitBuffer$2() {
        void var5_-1;
        this.val$xMin = n2;
        this.val$zMin = n3;
        this.val$zMax = n4;
        this.val$xMax = var5_-1;
        this.x = this.val$xMin;
        this.z = this.val$zMin;
    }

    public boolean hasNext() {
        return this.x <= this.val$xMax;
    }
}

