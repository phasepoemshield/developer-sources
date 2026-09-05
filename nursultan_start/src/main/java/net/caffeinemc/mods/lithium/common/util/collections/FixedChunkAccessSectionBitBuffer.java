/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntIterable
 *  it.unimi.dsi.fastutil.ints.IntIterator
 *  it.unimi.dsi.fastutil.longs.LongIterable
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  minecraft.class01296
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class08050
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import it.unimi.dsi.fastutil.ints.IntIterable;
import it.unimi.dsi.fastutil.ints.IntIterator;
import it.unimi.dsi.fastutil.longs.LongIterable;
import it.unimi.dsi.fastutil.longs.LongIterator;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import minecraft.class01296;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.collections.FixedChunkAccessSectionBitBuffer$1;
import net.caffeinemc.mods.lithium.common.util.collections.FixedChunkAccessSectionBitBuffer$2;
import net.caffeinemc.mods.lithium.common.util.collections.FixedChunkAccessSectionBitBuffer$3;
import net.caffeinemc.mods.lithium.common.util.collections.FixedChunkAccessSectionBitBuffer$4;

public class FixedChunkAccessSectionBitBuffer {
    public final int xMin;
    public final int yMin;
    public final int zMin;
    public final int xLength;
    public final int yLength;
    public final int zLength;
    public final int numChunks;
    public final int numSections;
    public final BitSet chunkSectionBits;
    public final ArrayList<class08050> chunkAccesses;

    public FixedChunkAccessSectionBitBuffer(int n, int n2, int n3, int n4, int n5, int n6) {
        this.xMin = Math.min(n, n2);
        this.yMin = Math.min(n3, n4);
        this.zMin = Math.min(n5, n6);
        this.xLength = Math.max(n, n2) - this.xMin + 1;
        this.yLength = Math.max(n3, n4) - this.yMin + 1;
        this.zLength = Math.max(n5, n6) - this.zMin + 1;
        this.numChunks = this.xLength * this.zLength;
        this.numSections = this.yLength * this.xLength * this.zLength;
        this.chunkSectionBits = new BitSet(this.numSections);
        this.chunkAccesses = new ArrayList<Object>(Collections.nCopies(this.xLength * this.zLength, null));
    }

    public FixedChunkAccessSectionBitBuffer(class07209 class072092, int n, int n2) {
        this(class01296.N((int)(class072092.method_10263() - n)), class01296.N((int)(class072092.method_10263() + n)), class01296.N((int)(class072092.method_10264() - n2)), class01296.N((int)(class072092.method_10264() + n2)), class01296.N((int)(class072092.method_10260() - n)), class01296.N((int)(class072092.method_10260() + n)));
    }

    public int getChunkIndex(int n, int n2) {
        int n3 = n - this.xMin;
        int n4 = n2 - this.zMin;
        return n3 * this.zLength + n4;
    }

    public int getChunkIndex(long l) {
        return this.getChunkIndex(class07321.N((long)l), class07321.y((long)l));
    }

    public int getSectionIndex(int n, int n2, int n3) {
        int n4 = n - this.xMin;
        int n5 = n2 - this.yMin;
        int n6 = n3 - this.zMin;
        return (n4 * this.zLength + n6) * this.yLength + n5;
    }

    public int getSectionIndex(long l) {
        return this.getSectionIndex(class01296.y((long)l), class01296.L((long)l), class01296.u((long)l));
    }

    public boolean getChunkSectionBit(class07209 class072092) {
        return this.getChunkSectionBit(class01296.N((int)class072092.method_10263()), class01296.N((int)class072092.method_10264()), class01296.N((int)class072092.method_10260()));
    }

    public boolean getChunkSectionBit(int n, int n2, int n3) {
        return this.chunkSectionBits.get(this.getSectionIndex(n, n2, n3));
    }

    public void setChunkAccess(class07209 class072092, class08050 class080502) {
        this.setChunkAccess(class07321.N((class07209)class072092), class080502);
    }

    public void setChunkAccess(long l, class08050 class080502) {
        this.chunkAccesses.set(this.getChunkIndex(l), class080502);
    }

    public IntIterable getSectionYInRange() {
        return new FixedChunkAccessSectionBitBuffer$3(this);
    }

    public class08050 getChunkAccess(class07209 class072092) {
        return this.getChunkAccess(class07321.N((class07209)class072092));
    }

    public class08050 getChunkAccess(long l) {
        return this.chunkAccesses.get(this.getChunkIndex(l));
    }

    public LongIterable getChunkPosInRange() {
        return new FixedChunkAccessSectionBitBuffer$1(this);
    }

    public void setChunkSectionStatus(long l, boolean bl) {
        this.chunkSectionBits.set(this.getSectionIndex(l), bl);
    }

    public boolean hasNoTrueChunkSections() {
        return this.chunkSectionBits.nextSetBit(0) == -1;
    }

    public IntIterator getSectionYInRangeIterator() {
        int n = this.yMin;
        int n2 = n + this.yLength;
        return new FixedChunkAccessSectionBitBuffer$4(this, n, n2);
    }

    public LongIterator getChunkPosInRangeIterator() {
        int n = this.xMin;
        int n2 = this.xMin + this.xLength - 1;
        int n3 = this.zMin;
        int n4 = this.zMin + this.zLength - 1;
        return new FixedChunkAccessSectionBitBuffer$2(this, n, n3, n4, n2);
    }
}

