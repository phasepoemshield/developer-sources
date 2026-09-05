/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntIterable
 *  it.unimi.dsi.fastutil.ints.IntIterator
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.ints.IntIterable;
import it.unimi.dsi.fastutil.ints.IntIterator;
import net.caffeinemc.mods.lithium.common.util.collections.FixedChunkAccessSectionBitBuffer;

class FixedChunkAccessSectionBitBuffer$3
implements IntIterable {
    final /* synthetic */ FixedChunkAccessSectionBitBuffer this$0;

    FixedChunkAccessSectionBitBuffer$3(FixedChunkAccessSectionBitBuffer fixedChunkAccessSectionBitBuffer) {
        this.this$0 = fixedChunkAccessSectionBitBuffer;
    }

    public IntIterator iterator() {
        return this.this$0.getSectionYInRangeIterator();
    }
}

