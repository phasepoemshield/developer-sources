/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class01296
 *  minecraft.class05487
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.util.collections.FixedChunkAccessSectionBitBuffer
 */
package net.caffeinemc.mods.lithium.common.ai.non_poi_block_search;

import it.unimi.dsi.fastutil.longs.LongIterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class01296;
import minecraft.class05487;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.util.collections.FixedChunkAccessSectionBitBuffer;

public class CheckAndCacheBlockChecker {
    private final FixedChunkAccessSectionBitBuffer chunkSections2MaybeContainsMatchingBlock;
    private final class05487 levelReader;
    public final boolean shouldChunkLoad;
    public final Predicate<class00500> blockStatePredicate;
    private int unloadedPossibleChunkSections = 0;
    public final int minSectionY;

    public CheckAndCacheBlockChecker(class07209 class072092, int n, int n2, class05487 class054872, Predicate<class00500> predicate, boolean bl) {
        this.chunkSections2MaybeContainsMatchingBlock = new FixedChunkAccessSectionBitBuffer(class072092, n, n2);
        this.levelReader = class054872;
        this.shouldChunkLoad = bl;
        this.blockStatePredicate = predicate;
        this.minSectionY = class054872.method_32891();
    }

    public boolean hasUnloadedPossibleChunks() {
        return this.unloadedPossibleChunkSections > 0;
    }

    public class08050 getCachedChunkAccess(class07209 class072092) {
        return this.chunkSections2MaybeContainsMatchingBlock.getChunkAccess(class072092);
    }

    public class08050 getCachedChunkAccess(long l) {
        return this.chunkSections2MaybeContainsMatchingBlock.getChunkAccess(l);
    }

    public boolean shouldStop() {
        return this.chunkSections2MaybeContainsMatchingBlock.hasNoTrueChunkSections();
    }

    private boolean checkChunkSection(class08050 class080502, int n, int n2, int n3) {
        int n4 = n2 - this.minSectionY;
        class00554[] class00554Array = class080502.u();
        if (n4 >= 0 && n4 < class00554Array.length && class00554Array[n4].N(this.blockStatePredicate)) {
            this.chunkSections2MaybeContainsMatchingBlock.setChunkSectionStatus(class01296.y((int)n, (int)n2, (int)n3), true);
            return true;
        }
        return false;
    }

    public boolean checkPosition(class07209 class072092) {
        if (!this.chunkSections2MaybeContainsMatchingBlock.getChunkSectionBit(class072092)) {
            return false;
        }
        class08050 class080502 = this.chunkSections2MaybeContainsMatchingBlock.getChunkAccess(class072092);
        if (class080502 == null) {
            if (!this.shouldChunkLoad) {
                return false;
            }
            int n = class01296.N((int)class072092.method_10263());
            int n2 = class01296.N((int)class072092.method_10264());
            int n3 = class01296.N((int)class072092.method_10260());
            class080502 = this.levelReader.method_8402(n, n3, class00549.m, true);
            assert (class080502 != null);
            this.chunkSections2MaybeContainsMatchingBlock.setChunkAccess(class072092, class080502);
            if (!this.checkChunkSection(class080502, n, n2, n3)) {
                --this.unloadedPossibleChunkSections;
                return false;
            }
        }
        return this.blockStatePredicate.test(class080502.method_8320(class072092));
    }

    public boolean checkCachedSection(int n, int n2, int n3) {
        return this.chunkSections2MaybeContainsMatchingBlock.getChunkSectionBit(n, n2, n3);
    }

    public void initializeChunks(Consumer<Long> consumer) {
        boolean bl = consumer == null;
        LongIterator longIterator = this.chunkSections2MaybeContainsMatchingBlock.getChunkPosInRange().iterator();
        while (longIterator.hasNext()) {
            long l = (Long)longIterator.next();
            int n = class07321.N((long)l);
            int n2 = class07321.y((long)l);
            boolean bl2 = false;
            class08050 class080502 = this.levelReader.method_8402(n, n2, class00549.m, false);
            if (class080502 != null) {
                this.chunkSections2MaybeContainsMatchingBlock.setChunkAccess(l, class080502);
                var10_9 = this.chunkSections2MaybeContainsMatchingBlock.getSectionYInRange().iterator();
                while (var10_9.hasNext()) {
                    var11_10 = (Integer)var10_9.next();
                    bl2 = this.checkChunkSection(class080502, n, var11_10, n2) || bl2;
                }
            } else if (this.shouldChunkLoad) {
                var10_9 = this.chunkSections2MaybeContainsMatchingBlock.getSectionYInRange().iterator();
                while (var10_9.hasNext()) {
                    var11_10 = (Integer)var10_9.next();
                    this.chunkSections2MaybeContainsMatchingBlock.setChunkSectionStatus(class01296.y((int)n, (int)var11_10, (int)n2), !this.levelReader.method_31601(class01296.L((int)var11_10)));
                    ++this.unloadedPossibleChunkSections;
                }
                bl2 = true;
            }
            if (bl || !bl2) continue;
            consumer.accept(l);
        }
    }

    public void initializeChunks() {
        this.initializeChunks(null);
    }

    public int getChunkSize() {
        return this.chunkSections2MaybeContainsMatchingBlock.numChunks;
    }
}

