/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongIterable
 *  it.unimi.dsi.fastutil.longs.LongIterator
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.longs.LongIterable;
import it.unimi.dsi.fastutil.longs.LongIterator;
import net.caffeinemc.mods.lithium.common.util.collections.FixedChunkAccessSectionBitBuffer;

class FixedChunkAccessSectionBitBuffer$1
implements LongIterable {
    final /* synthetic */ FixedChunkAccessSectionBitBuffer this$0;

    FixedChunkAccessSectionBitBuffer$1(FixedChunkAccessSectionBitBuffer fixedChunkAccessSectionBitBuffer) {
        this.this$0 = fixedChunkAccessSectionBitBuffer;
    }

    public LongIterator iterator() {
        return this.this$0.getChunkPosInRangeIterator();
    }
}

