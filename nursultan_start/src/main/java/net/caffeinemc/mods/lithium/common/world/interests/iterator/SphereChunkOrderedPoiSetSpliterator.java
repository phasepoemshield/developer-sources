/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01296
 *  minecraft.class03556
 *  minecraft.class05369
 *  minecraft.class05370
 *  minecraft.class05372
 *  minecraft.class05374
 *  minecraft.class05377
 *  minecraft.class07209
 *  net.caffeinemc.mods.lithium.common.util.Distances
 */
package net.caffeinemc.mods.lithium.common.world.interests.iterator;

import java.util.BitSet;
import java.util.Iterator;
import java.util.Spliterators;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class01296;
import minecraft.class03556;
import minecraft.class05369;
import minecraft.class05370;
import minecraft.class05372;
import minecraft.class05374;
import minecraft.class05377;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestSetExtended;
import net.caffeinemc.mods.lithium.common.world.interests.RegionBasedStorageSectionExtended;

public class SphereChunkOrderedPoiSetSpliterator
extends Spliterators.AbstractSpliterator<class05377> {
    private final RegionBasedStorageSectionExtended<class05370> storage;
    private final int chunkYMin;
    private final int chunkLimit;
    private final int minChunkX;
    private final int maxChunkX;
    private final class07209 origin;
    private final int radiusSq;
    private final Predicate<class03556<class05369>> typeFilter;
    private final class05372 status;
    int chunkX;
    int chunkZ;
    int iteratedChunks;
    BitSet chunkPoiSections;
    int nextPoiSectionIndex;
    Iterator<class05377> sectionIterator;

    @Override
    public boolean tryAdvance(Consumer<? super class05377> consumer) {
        while (true) {
            if (this.sectionIterator != null && this.sectionIterator.hasNext()) {
                class05377 class053772 = this.sectionIterator.next();
                if (!this.status.N().test(class053772) || !Distances.isWithinSphereRadius((class07209)this.origin, (long)this.radiusSq, (class07209)class053772.M())) continue;
                consumer.accept((class05377)class053772);
                return true;
            }
            if (!this.nextSection()) break;
        }
        return false;
    }

    public SphereChunkOrderedPoiSetSpliterator(int n, class07209 class072092, RegionBasedStorageSectionExtended<class05370> regionBasedStorageSectionExtended, Predicate<class03556<class05369>> predicate, class05372 class053722) {
        super((long)((class072092.method_10263() + n + 1 >> 4) - (class072092.method_10263() - n - 1 >> 4) + 1) * (long)((class072092.method_10260() + n + 1 >> 4) - (class072092.method_10260() - n - 1 >> 4) + 1), 16);
        this.storage = regionBasedStorageSectionExtended;
        this.chunkYMin = this.storage.lithium$getChunkYMin();
        this.origin = class072092;
        this.radiusSq = Math.multiplyExact(n, n);
        this.typeFilter = predicate;
        this.status = class053722;
        this.minChunkX = class072092.method_10263() - n - 1 >> 4;
        this.maxChunkX = class072092.method_10263() + n + 1 >> 4;
        int n2 = class072092.method_10260() - n - 1 >> 4;
        int n3 = class072092.method_10260() + n + 1 >> 4;
        this.chunkLimit = (this.maxChunkX - this.minChunkX + 1) * (n3 - n2 + 1);
        this.chunkX = this.minChunkX - 1;
        this.chunkZ = n2;
        this.iteratedChunks = -1;
    }

    private boolean nextSection() {
        do {
            int n;
            if (this.chunkPoiSections == null) continue;
            while ((n = this.chunkPoiSections.nextSetBit(this.nextPoiSectionIndex)) != -1) {
                this.nextPoiSectionIndex = n + 1;
                int n2 = n + this.chunkYMin;
                if (Distances.getMinSectionDistanceSq((class07209)this.origin, (int)this.chunkX, (int)n2, (int)this.chunkZ) > (long)this.radiusSq) continue;
                this.sectionIterator = this.getSectionIterator(this.chunkX, n2, this.chunkZ);
                if (this.sectionIterator == null || !this.sectionIterator.hasNext()) continue;
                return true;
            }
        } while (this.nextChunk());
        return false;
    }

    private Iterator<class05377> getSectionIterator(int n, int n2, int n3) {
        class05370 class053702 = ((class05374)this.storage).i(class01296.y((int)n, (int)n2, (int)n3)).orElse(null);
        if (class053702 == null) {
            return null;
        }
        return ((PointOfInterestSetExtended)class053702).lithium$iterate(this.typeFilter);
    }

    private boolean nextChunk() {
        do {
            if (this.iteratedChunks >= this.chunkLimit) {
                return false;
            }
            ++this.iteratedChunks;
            ++this.chunkX;
            if (this.chunkX <= this.maxChunkX) continue;
            ++this.chunkZ;
            this.chunkX = this.minChunkX;
        } while (Distances.getMinChunkToBlockDistanceL2Sq((class07209)this.origin, (int)this.chunkX, (int)this.chunkZ) > (long)this.radiusSq);
        this.chunkPoiSections = this.storage.lithium$getNonEmptyPOISections(this.chunkX, this.chunkZ);
        this.nextPoiSectionIndex = 0;
        this.sectionIterator = null;
        return true;
    }
}

