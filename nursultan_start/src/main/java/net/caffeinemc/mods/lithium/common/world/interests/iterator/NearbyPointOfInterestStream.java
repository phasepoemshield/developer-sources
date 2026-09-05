/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongIterator
 *  it.unimi.dsi.fastutil.objects.ObjectArrayList
 *  minecraft.class01296
 *  minecraft.class03556
 *  minecraft.class05369
 *  minecraft.class05370
 *  minecraft.class05372
 *  minecraft.class05377
 *  minecraft.class07209
 *  minecraft.class07321
 *  net.caffeinemc.mods.lithium.common.util.Distances
 */
package net.caffeinemc.mods.lithium.common.world.interests.iterator;

import it.unimi.dsi.fastutil.longs.LongIterator;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Comparator;
import java.util.Optional;
import java.util.Spliterators;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import minecraft.class01296;
import minecraft.class03556;
import minecraft.class05369;
import minecraft.class05370;
import minecraft.class05372;
import minecraft.class05377;
import minecraft.class07209;
import minecraft.class07321;
import net.caffeinemc.mods.lithium.common.util.Distances;
import net.caffeinemc.mods.lithium.common.util.tuples.SortedPointOfInterest;
import net.caffeinemc.mods.lithium.common.world.interests.PointOfInterestSetExtended;
import net.caffeinemc.mods.lithium.common.world.interests.RegionBasedStorageSectionExtended;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.NearbyPointOfInterestStream$1;
import net.caffeinemc.mods.lithium.common.world.interests.iterator.NearbyPointOfInterestStream$QueuedSection;

public class NearbyPointOfInterestStream
extends Spliterators.AbstractSpliterator<class05377>
implements Consumer<class05377> {
    public static final Comparator<SortedPointOfInterest> NEGATIVE_Y_POINT_COMPARATOR = (sortedPointOfInterest, sortedPointOfInterest2) -> {
        if (sortedPointOfInterest == null) {
            if (sortedPointOfInterest2 == null) {
                return 0;
            }
            return -1;
        }
        if (sortedPointOfInterest2 == null) {
            return 1;
        }
        int n = Integer.compare(sortedPointOfInterest.distanceSq(), sortedPointOfInterest2.distanceSq());
        if (n != 0) {
            return n;
        }
        int n2 = Integer.compare(sortedPointOfInterest.getY(), sortedPointOfInterest2.getY());
        if (n2 != 0) {
            return n2;
        }
        int n3 = Integer.compare(class01296.N((int)sortedPointOfInterest.getZ()), class01296.N((int)sortedPointOfInterest2.getZ()));
        if (n3 != 0) {
            return n3;
        }
        return Integer.compare(class01296.N((int)sortedPointOfInterest.getX()), class01296.N((int)sortedPointOfInterest2.getX()));
    };
    public static final Comparator<SortedPointOfInterest> POINT_COMPARATOR = (sortedPointOfInterest, sortedPointOfInterest2) -> {
        if (sortedPointOfInterest == null) {
            if (sortedPointOfInterest2 == null) {
                return 0;
            }
            return -1;
        }
        if (sortedPointOfInterest2 == null) {
            return 1;
        }
        int n = Integer.compare(sortedPointOfInterest.distanceSq(), sortedPointOfInterest2.distanceSq());
        if (n != 0) {
            return n;
        }
        int n2 = Integer.compare(class01296.N((int)sortedPointOfInterest.getZ()), class01296.N((int)sortedPointOfInterest2.getZ()));
        if (n2 != 0) {
            return n2;
        }
        int n3 = Integer.compare(class01296.N((int)sortedPointOfInterest.getX()), class01296.N((int)sortedPointOfInterest2.getX()));
        if (n3 != 0) {
            return n3;
        }
        return Integer.compare(class01296.N((int)sortedPointOfInterest.getY()), class01296.N((int)sortedPointOfInterest2.getY()));
    };
    private final RegionBasedStorageSectionExtended<class05370> storage;
    private final Predicate<class03556<class05369>> typeSelector;
    private final class05372 occupationStatus;
    private final class07209 origin;
    private final Predicate<class05377> afterSortingPredicate;
    private final Comparator<SortedPointOfInterest> pointComparatorWithoutInSectionOrder;
    private final int chunkYMin;
    private final int clampedOriginChunkY;
    private final BiPredicate<class07209, class07209> distanceLimit;
    private final double minChunkYDistSq;
    private final ObjectArrayList<NearbyPointOfInterestStream$QueuedSection> queuedPOISections;
    private int queuedSectionsSearched;
    private boolean forciblyDeplete;
    private final int forciblyDepleteTrigger;
    int ring;
    final int ringMax;
    private final LongIterator ringIterator;
    private final int ringClosestEdgeDistance;
    double closestRingDistanceSq;
    private int nextSectionDistanceSq;
    private int minCollectedElementDistanceSq = Integer.MAX_VALUE;
    private int minCollectedElementIndex = -1;
    private final ArrayList<SortedPointOfInterest> points;
    private int nextPointIndex;
    private int sortedToIndex;

    @Override
    public boolean tryAdvance(Consumer<? super class05377> consumer) {
        if (this.nextPointIndex < this.points.size() && this.tryAdvancePoint(consumer)) {
            return true;
        }
        while (this.ringIterator.hasNext() || !this.isSectionListEmpty()) {
            this.keepAddingRingsUntilSufficient();
            int n = this.points.size();
            while (!this.isSectionListEmpty() && (double)this.minCollectedElementDistanceSq >= this.getMinimumNextPotentialDistanceSq()) {
                long l = ((NearbyPointOfInterestStream$QueuedSection)((Object)this.queuedPOISections.get((int)this.queuedSectionsSearched++))).sectionPos;
                this.nextSectionDistanceSq = this.getNextSectionDistanceSq();
                Optional<class05370> optional = this.storage.lithium$getElementAt(l);
                if (optional.isPresent()) {
                    ((PointOfInterestSetExtended)optional.get()).lithium$collectMatchingPoints(this.typeSelector, this.occupationStatus, this);
                }
                if (this.forciblyDeplete) {
                    boolean bl = this.forciblyDeplete = !this.isSectionListEmpty();
                }
                if (this.points.size() <= n && (this.forciblyDeplete || !((double)this.nextSectionDistanceSq > this.closestRingDistanceSq))) continue;
                break;
            }
            if (!this.tryAdvancePoint(consumer)) continue;
            return true;
        }
        return this.tryAdvancePoint(consumer);
    }

    public NearbyPointOfInterestStream(Predicate<class03556<class05369>> predicate, class05372 class053722, Predicate<class05377> predicate2, class07209 class072092, int n, RegionBasedStorageSectionExtended<class05370> regionBasedStorageSectionExtended, BiPredicate<class07209, class07209> biPredicate, Comparator<SortedPointOfInterest> comparator) {
        super(Long.MAX_VALUE, 16);
        this.storage = regionBasedStorageSectionExtended;
        this.points = new ArrayList();
        this.occupationStatus = class053722;
        this.typeSelector = predicate;
        this.origin = class072092;
        this.chunkYMin = this.storage.lithium$getChunkYMin();
        int n2 = this.storage.lithium$getChunkYMaxInclusive();
        this.clampedOriginChunkY = Math.clamp((long)class01296.N((int)class072092.method_10264()), (int)this.chunkYMin, (int)n2);
        int n3 = Math.min(Math.max(this.origin.method_10264(), class01296.L((int)this.chunkYMin)), class01296.N((int)n2, (int)15)) - this.origin.method_10264();
        this.minChunkYDistSq = n3 * n3;
        int n4 = this.origin.method_10263();
        int n5 = this.origin.method_10260();
        int n6 = class01296.N((int)(class072092.method_10263() + n));
        int n7 = class01296.N((int)(class072092.method_10263() - n));
        int n8 = class01296.N((int)(class072092.method_10260() + n));
        int n9 = class01296.N((int)(class072092.method_10260() - n));
        this.ring = 0;
        int n10 = class01296.N((int)n4);
        int n11 = class01296.N((int)n5);
        this.ringMax = Math.max(Math.max(n6 - n10, n10 - n7), Math.max(n8 - n11, n11 - n9));
        this.ringIterator = this.getRingsOfChunksIterator(n10, n6, n7, n11, n8, n9);
        this.ringClosestEdgeDistance = Math.min(Math.min((n4 & 0xF) + 1, 16 - n4 & 0xF), Math.min((n5 & 0xF) + 1, 16 - n5 & 0xF));
        this.closestRingDistanceSq = this.getPotentialRingDistanceSq();
        this.nextSectionDistanceSq = Integer.MAX_VALUE;
        this.minCollectedElementDistanceSq = Integer.MAX_VALUE;
        int n12 = n2 - this.chunkYMin + 1;
        int n13 = n12 * 9;
        this.queuedPOISections = new ObjectArrayList(n13);
        this.queuedSectionsSearched = 0;
        this.forciblyDeplete = false;
        this.forciblyDepleteTrigger = n13 - n12;
        this.distanceLimit = biPredicate;
        this.afterSortingPredicate = predicate2;
        this.pointComparatorWithoutInSectionOrder = comparator;
    }

    @Override
    public void accept(class05377 class053772) {
        if (this.distanceLimit.test(this.origin, class053772.M())) {
            this.collectPoint(class053772);
        }
    }

    public class05377 getFirst() {
        class05377[] class05377Array = new class05377[1];
        this.tryAdvance((Consumer<? super class05377>)((Consumer<class05377>)class053772 -> {
            class05377Array[0] = class053772;
        }));
        return class05377Array[0];
    }

    private void keepAddingRingsUntilSufficient() {
        if (!this.forciblyDeplete && this.ringIterator.hasNext() && (double)Math.min(this.minCollectedElementDistanceSq, this.nextSectionDistanceSq) >= this.closestRingDistanceSq) {
            this.queuedPOISections.removeElements(0, this.queuedSectionsSearched);
            this.queuedSectionsSearched = 0;
            int n = this.ring;
            do {
                int n2;
                long l;
                int n3;
                class07209 class072092;
                if (this.distanceLimit.test(this.origin, class072092 = Distances.getClosestPosInChunk((class07209)this.origin, (int)(n3 = class07321.N((long)(l = this.ringIterator.nextLong()))), (int)(n2 = class07321.y((long)l))))) {
                    BitSet bitSet = this.storage.lithium$getNonEmptyPOISections(n3, n2);
                    int n4 = bitSet.nextSetBit(this.clampedOriginChunkY - this.chunkYMin);
                    int n5 = this.getYDistanceFromBitIndex(n4);
                    int n6 = bitSet.previousSetBit(this.clampedOriginChunkY - this.chunkYMin - 1);
                    int n7 = this.getYDistanceFromBitIndex(n6);
                    while (n4 != -1 || n6 != -1) {
                        int n8;
                        if (n7 <= n5 && n6 != -1) {
                            n8 = n6 + this.chunkYMin;
                            n6 = bitSet.previousSetBit(n6 - 1);
                            n7 = this.getYDistanceFromBitIndex(n6);
                            if (!this.distanceLimit.test(this.origin, class072092.method_33096(Distances.getClosestBlockCoordInSection((int)this.origin.method_10264(), (int)n8)))) {
                                n6 = -1;
                                continue;
                            }
                        } else {
                            n8 = n4 + this.chunkYMin;
                            n4 = bitSet.nextSetBit(n4 + 1);
                            n5 = this.getYDistanceFromBitIndex(n4);
                            if (!this.distanceLimit.test(this.origin, class072092.method_33096(Distances.getClosestBlockCoordInSection((int)this.origin.method_10264(), (int)n8)))) {
                                n4 = -1;
                                continue;
                            }
                        }
                        this.queuedPOISections.add((Object)new NearbyPointOfInterestStream$QueuedSection(class01296.y((int)n3, (int)n8, (int)n2), Math.toIntExact(Distances.getMinSectionDistanceSq((class07209)this.origin, (int)n3, (int)n8, (int)n2))));
                    }
                    boolean bl = this.forciblyDeplete = this.queuedPOISections.size() > this.forciblyDepleteTrigger;
                }
                if (!this.forciblyDeplete && this.ring <= n) continue;
                this.sortSectionList();
                this.nextSectionDistanceSq = this.getNextSectionDistanceSq();
                if (this.forciblyDeplete || (double)Math.min(this.minCollectedElementDistanceSq, this.nextSectionDistanceSq) < this.closestRingDistanceSq) break;
                n = this.ring;
            } while (this.ringIterator.hasNext());
        }
    }

    private double getMinimumNextPotentialDistanceSq() {
        return Math.min((double)this.nextSectionDistanceSq, this.closestRingDistanceSq);
    }

    private boolean tryAdvancePoint(Consumer<? super class05377> consumer) {
        while (this.nextPointIndex < this.points.size()) {
            SortedPointOfInterest sortedPointOfInterest;
            if (this.minCollectedElementIndex >= 0) {
                sortedPointOfInterest = this.points.get(this.minCollectedElementIndex);
                if ((double)sortedPointOfInterest.distanceSq() >= this.getMinimumNextPotentialDistanceSq()) {
                    return false;
                }
                this.minCollectedElementIndex = -2;
                this.minCollectedElementDistanceSq = Integer.MAX_VALUE;
            } else {
                if (this.sortedToIndex <= this.nextPointIndex) {
                    this.points.subList(this.sortedToIndex, this.points.size()).sort(this.pointComparatorWithoutInSectionOrder);
                    this.sortedToIndex = this.points.size();
                }
                if ((sortedPointOfInterest = this.points.get(this.nextPointIndex)) != null && (double)sortedPointOfInterest.distanceSq() >= this.getMinimumNextPotentialDistanceSq()) {
                    this.minCollectedElementDistanceSq = sortedPointOfInterest.distanceSq();
                    this.minCollectedElementIndex = this.nextPointIndex;
                    return false;
                }
                ++this.nextPointIndex;
            }
            if (sortedPointOfInterest == null || sortedPointOfInterest.isConsumed() || this.afterSortingPredicate != null && !this.afterSortingPredicate.test(sortedPointOfInterest.poi())) continue;
            sortedPointOfInterest.setConsumed();
            consumer.accept((class05377)sortedPointOfInterest.poi());
            return true;
        }
        return false;
    }

    private void collectPoint(class05377 class053772) {
        SortedPointOfInterest sortedPointOfInterest = new SortedPointOfInterest(class053772, this.origin);
        this.points.add(sortedPointOfInterest);
        this.sortedToIndex = Math.max(0, this.nextPointIndex - 1);
        if (sortedPointOfInterest.distanceSq() <= this.minCollectedElementDistanceSq) {
            this.updateMinPoint(sortedPointOfInterest, this.points.size() - 1);
        }
    }

    private boolean isSectionListEmpty() {
        return this.queuedPOISections.size() <= this.queuedSectionsSearched;
    }

    private void sortSectionList() {
        this.queuedPOISections.subList(this.queuedSectionsSearched, this.queuedPOISections.size()).sort(Comparator.comparingInt(nearbyPointOfInterestStream$QueuedSection -> nearbyPointOfInterestStream$QueuedSection.minDistance));
    }

    private void updateMinPoint(SortedPointOfInterest sortedPointOfInterest, int n) {
        int n2 = sortedPointOfInterest.distanceSq();
        if (this.minCollectedElementIndex >= 0 && n2 == this.minCollectedElementDistanceSq) {
            if (this.pointComparatorWithoutInSectionOrder.compare(this.points.get(this.minCollectedElementIndex), sortedPointOfInterest) > 0) {
                this.minCollectedElementIndex = n;
            }
        } else if (this.minCollectedElementIndex != -2) {
            this.minCollectedElementIndex = n;
            this.minCollectedElementDistanceSq = n2;
        }
    }

    private int getNextSectionDistanceSq() {
        return this.isSectionListEmpty() ? Integer.MAX_VALUE : ((NearbyPointOfInterestStream$QueuedSection)((Object)this.queuedPOISections.get(this.queuedSectionsSearched))).minDistance();
    }

    double getPotentialRingDistanceSq() {
        int n = Math.max(this.ring - 1, 0) * 16 + (this.ring > 0 ? this.ringClosestEdgeDistance : 0);
        return this.ring > this.ringMax ? Double.MAX_VALUE : (double)(n * n) + this.minChunkYDistSq;
    }

    private int getYDistanceFromBitIndex(int n) {
        return n == -1 ? Integer.MAX_VALUE : Math.abs(Distances.getClosestBlockCoordInSection((int)this.origin.method_10264(), (int)(n + this.chunkYMin)) - this.origin.method_10264());
    }

    private LongIterator getRingsOfChunksIterator(int n, int n2, int n3, int n4, int n5, int n6) {
        return new NearbyPointOfInterestStream$1(this, n, n4, n3, n2, n6, n5);
    }
}

