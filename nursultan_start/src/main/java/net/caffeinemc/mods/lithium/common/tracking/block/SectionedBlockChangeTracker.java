/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class00549
 *  minecraft.class00554
 *  minecraft.class00734
 *  minecraft.class01296
 *  minecraft.class05474
 *  minecraft.class07299
 *  minecraft.class08050
 *  net.caffeinemc.mods.lithium.common.block.BlockListeningSection
 *  net.caffeinemc.mods.lithium.common.util.deduplication.LithiumInterner
 *  net.caffeinemc.mods.lithium.common.util.tuples.WorldSectionBox
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 */
package net.caffeinemc.mods.lithium.common.tracking.block;

import java.util.ArrayList;
import java.util.Objects;
import minecraft.class00500;
import minecraft.class00549;
import minecraft.class00554;
import minecraft.class00734;
import minecraft.class01296;
import minecraft.class05474;
import minecraft.class07299;
import minecraft.class08050;
import net.caffeinemc.mods.lithium.common.block.BlockListeningSection;
import net.caffeinemc.mods.lithium.common.tracking.block.BlockChangeTracker;
import net.caffeinemc.mods.lithium.common.util.Pos$SectionYCoord;
import net.caffeinemc.mods.lithium.common.util.Pos$SectionYIndex;
import net.caffeinemc.mods.lithium.common.util.deduplication.LithiumInterner;
import net.caffeinemc.mods.lithium.common.util.tuples.WorldSectionBox;
import net.caffeinemc.mods.lithium.common.world.LithiumData;

public class SectionedBlockChangeTracker
implements BlockChangeTracker {
    public final WorldSectionBox trackedWorldSections;
    private long maxChangeTime;
    private int timesRegistered;
    boolean isListeningToAll = false;
    private ArrayList<class01296> sectionsNotListeningTo = null;
    private ArrayList<BlockListeningSection> sectionsUnsubscribed = null;

    public SectionedBlockChangeTracker(WorldSectionBox worldSectionBox) {
        this.trackedWorldSections = worldSectionBox;
        this.maxChangeTime = 0L;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (object == null || object.getClass() != this.getClass()) {
            return false;
        }
        SectionedBlockChangeTracker sectionedBlockChangeTracker = (SectionedBlockChangeTracker)object;
        return Objects.equals(this.trackedWorldSections, sectionedBlockChangeTracker.trackedWorldSections);
    }

    public int hashCode() {
        return this.getClass().hashCode() ^ this.trackedWorldSections.hashCode();
    }

    public void register() {
        if (this.timesRegistered == 0) {
            WorldSectionBox worldSectionBox = this.trackedWorldSections;
            for (int i = worldSectionBox.chunkX1(); i < worldSectionBox.chunkX2(); ++i) {
                for (int j = worldSectionBox.chunkZ1(); j < worldSectionBox.chunkZ2(); ++j) {
                    class07299 class072992 = worldSectionBox.world();
                    class08050 class080502 = class072992.method_8402(i, j, class00549.m, false);
                    class00554[] class00554Array = class080502 == null ? null : class080502.u();
                    for (int k = worldSectionBox.chunkY1(); k < worldSectionBox.chunkY2(); ++k) {
                        if (Pos$SectionYCoord.getMinYSection((class05474)class072992) > k || Pos$SectionYCoord.getMaxYSectionExclusive((class05474)class072992) <= k) continue;
                        class01296 class012962 = class01296.N((int)i, (int)k, (int)j);
                        if (class00554Array == null) {
                            if (this.sectionsNotListeningTo == null) {
                                this.sectionsNotListeningTo = new ArrayList();
                            }
                            this.sectionsNotListeningTo.add(class012962);
                            continue;
                        }
                        class00554 class005542 = class00554Array[Pos$SectionYIndex.fromSectionCoord((class05474)class072992, k)];
                        BlockListeningSection blockListeningSection = (BlockListeningSection)class005542;
                        blockListeningSection.lithium$addToCallback(this, class01296.y((int)i, (int)k, (int)j), class072992);
                    }
                }
            }
            this.isListeningToAll = !(this.sectionsNotListeningTo != null && !this.sectionsNotListeningTo.isEmpty() || this.sectionsUnsubscribed != null && !this.sectionsUnsubscribed.isEmpty());
            this.setChanged(this.getWorldTime());
        }
        ++this.timesRegistered;
    }

    public void unregister() {
        if (--this.timesRegistered > 0) {
            return;
        }
        WorldSectionBox worldSectionBox = this.trackedWorldSections;
        class07299 class072992 = worldSectionBox.world();
        for (int i = worldSectionBox.chunkX1(); i < worldSectionBox.chunkX2(); ++i) {
            for (int j = worldSectionBox.chunkZ1(); j < worldSectionBox.chunkZ2(); ++j) {
                class08050 class080502 = class072992.method_8402(i, j, class00549.m, false);
                class00554[] class00554Array = class080502 == null ? null : class080502.u();
                for (int k = worldSectionBox.chunkY1(); k < worldSectionBox.chunkY2(); ++k) {
                    if (class00554Array == null || Pos$SectionYCoord.getMinYSection((class05474)class072992) > k || Pos$SectionYCoord.getMaxYSectionExclusive((class05474)class072992) <= k) continue;
                    class00554 class005542 = class00554Array[Pos$SectionYIndex.fromSectionCoord((class05474)class072992, k)];
                    BlockListeningSection blockListeningSection = (BlockListeningSection)class005542;
                    blockListeningSection.lithium$removeFromCallback(this);
                }
            }
        }
        this.sectionsNotListeningTo = null;
        LithiumInterner lithiumInterner = ((LithiumData)class072992).lithium$getData().blockChangeTrackers();
        lithiumInterner.deleteCanonical((Object)this);
    }

    public boolean isUnchangedSince(long l) {
        if (l <= this.maxChangeTime) {
            return false;
        }
        if (!this.isListeningToAll) {
            this.listenToAllSections();
            return this.isListeningToAll && l > this.maxChangeTime;
        }
        return true;
    }

    public static SectionedBlockChangeTracker registerAt(class07299 class072992, class00734 class007342) {
        WorldSectionBox worldSectionBox = WorldSectionBox.relevantExpandedBlocksBox((class07299)class072992, (class00734)class007342);
        SectionedBlockChangeTracker sectionedBlockChangeTracker = new SectionedBlockChangeTracker(worldSectionBox);
        LithiumInterner lithiumInterner = ((LithiumData)class072992).lithium$getData().blockChangeTrackers();
        sectionedBlockChangeTracker = (SectionedBlockChangeTracker)lithiumInterner.getCanonical((Object)sectionedBlockChangeTracker);
        sectionedBlockChangeTracker.register();
        return sectionedBlockChangeTracker;
    }

    public boolean matchesMovedBox(class00734 class007342) {
        return this.trackedWorldSections.matchesRelevantBlocksBox(class007342);
    }

    public long getWorldTime() {
        return this.trackedWorldSections.world().N();
    }

    @Override
    public void onChunkSectionInvalidated(class01296 class012962) {
        if (this.sectionsNotListeningTo == null) {
            this.sectionsNotListeningTo = new ArrayList();
        }
        this.sectionsNotListeningTo.add(class012962);
        this.setChanged(this.getWorldTime());
        this.isListeningToAll = false;
    }

    public void listenToAllSections() {
        class07299 class072992;
        boolean bl = false;
        ArrayList<class01296> arrayList = this.sectionsNotListeningTo;
        if (arrayList != null) {
            for (int i = arrayList.size() - 1; i >= 0; --i) {
                bl = true;
                class01296 class012962 = arrayList.get(i);
                class072992 = this.trackedWorldSections.world();
                class08050 class080502 = class072992.method_8402(class012962.method_10263(), class012962.method_10260(), class00549.m, false);
                if (class080502 == null) {
                    return;
                }
                arrayList.remove(i);
                class00554 class005542 = class080502.u()[Pos$SectionYIndex.fromSectionCoord((class05474)class072992, class012962.method_10264())];
                BlockListeningSection blockListeningSection = (BlockListeningSection)class005542;
                blockListeningSection.lithium$addToCallback(this, class012962.W(), class072992);
            }
        }
        if (this.sectionsUnsubscribed != null) {
            ArrayList<BlockListeningSection> arrayList2 = this.sectionsUnsubscribed;
            for (int i = arrayList2.size() - 1; i >= 0; --i) {
                bl = true;
                class072992 = arrayList2.remove(i);
                class072992.lithium$addToCallback(this, Long.MIN_VALUE, null);
            }
        }
        this.isListeningToAll = true;
        if (bl) {
            this.setChanged(this.getWorldTime());
        }
    }

    @Override
    public boolean setChanged(BlockListeningSection blockListeningSection, int n, int n2, int n3, class00500 class005002, class00500 class005003) {
        if (this.sectionsUnsubscribed == null) {
            this.sectionsUnsubscribed = new ArrayList();
        }
        this.sectionsUnsubscribed.add(blockListeningSection);
        this.setChanged(this.getWorldTime());
        this.isListeningToAll = false;
        return false;
    }

    public void setChanged(long l) {
        if (l > this.maxChangeTime) {
            this.maxChangeTime = l;
        }
    }
}

