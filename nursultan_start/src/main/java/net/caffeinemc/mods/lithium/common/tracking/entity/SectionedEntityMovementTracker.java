/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.HashCommon
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class01101
 *  minecraft.class01129
 *  minecraft.class01135
 *  minecraft.class01296
 *  minecraft.class04782
 *  net.caffeinemc.mods.lithium.common.util.tuples.WorldSectionBox
 *  net.caffeinemc.mods.lithium.common.world.LithiumData
 *  net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.PersistentEntitySectionManagerAccessor
 *  net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.ServerLevelAccessor
 */
package net.caffeinemc.mods.lithium.common.tracking.entity;

import it.unimi.dsi.fastutil.HashCommon;
import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import java.util.ArrayList;
import minecraft.class01101;
import minecraft.class01129;
import minecraft.class01135;
import minecraft.class01296;
import minecraft.class04782;
import net.caffeinemc.mods.lithium.common.tracking.entity.EntityMovementTrackerSection;
import net.caffeinemc.mods.lithium.common.tracking.entity.MovementTrackerHelper;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementListener;
import net.caffeinemc.mods.lithium.common.util.tuples.WorldSectionBox;
import net.caffeinemc.mods.lithium.common.world.LithiumData;
import net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.PersistentEntitySectionManagerAccessor;
import net.caffeinemc.mods.lithium.mixin.util.entity_movement_tracking.ServerLevelAccessor;

public abstract class SectionedEntityMovementTracker<E extends class01135> {
    final WorldSectionBox trackedWorldSections;
    final Object clazz;
    private final int trackedIndex;
    ArrayList<class01101<E>> sortedSections;
    boolean[] sectionVisible;
    private int timesRegistered;
    private final ArrayList<EntityMovementTrackerSection> sectionsNotListeningTo;
    private long maxChangeTime;
    private ReferenceOpenHashSet<SectionedEntityMovementListener> sectionedEntityMovementListeners;

    public SectionedEntityMovementTracker(WorldSectionBox worldSectionBox, Object object) {
        this.clazz = object;
        this.trackedWorldSections = worldSectionBox;
        this.trackedIndex = MovementTrackerHelper.getTrackerIndex(object);
        assert (this.trackedIndex != -1);
        this.sectionedEntityMovementListeners = null;
        this.sectionsNotListeningTo = new ArrayList();
    }

    public boolean equals(Object object) {
        return object.getClass() == this.getClass() && this.clazz == ((SectionedEntityMovementTracker)object).clazz && this.trackedWorldSections.equals((Object)((SectionedEntityMovementTracker)object).trackedWorldSections);
    }

    public int hashCode() {
        return HashCommon.mix((int)this.trackedWorldSections.hashCode()) ^ HashCommon.mix((int)this.trackedIndex) ^ this.getClass().hashCode();
    }

    public void register(class04782 class047822) {
        assert (class047822 == this.trackedWorldSections.world());
        if (this.timesRegistered == 0) {
            class01129 class011292 = ((PersistentEntitySectionManagerAccessor)((ServerLevelAccessor)class047822).getEntityManager()).getCache();
            WorldSectionBox worldSectionBox = this.trackedWorldSections;
            int n = worldSectionBox.numSections();
            assert (n > 0);
            this.sortedSections = new ArrayList(n);
            this.sectionVisible = new boolean[n];
            for (int i = worldSectionBox.chunkX1(); i < worldSectionBox.chunkX2(); ++i) {
                for (int j = worldSectionBox.chunkZ1(); j < worldSectionBox.chunkZ2(); ++j) {
                    for (int k = worldSectionBox.chunkY1(); k < worldSectionBox.chunkY2(); ++k) {
                        class01101 class011012 = class011292.L(class01296.y((int)i, (int)k, (int)j));
                        EntityMovementTrackerSection entityMovementTrackerSection = (EntityMovementTrackerSection)class011012;
                        this.sortedSections.add(class011012);
                        entityMovementTrackerSection.lithium$addListener(this);
                    }
                }
            }
            this.setChanged(class047822.N());
        }
        ++this.timesRegistered;
    }

    public void emitEntityMovement(int n, EntityMovementTrackerSection entityMovementTrackerSection) {
        if ((n & 1 << this.trackedIndex) != 0) {
            this.notifyAllListeners();
            this.sectionsNotListeningTo.add(entityMovementTrackerSection);
        }
    }

    public void onSectionLeftRange(EntityMovementTrackerSection entityMovementTrackerSection) {
        this.setChanged(this.trackedWorldSections.world().N());
        int n = this.sortedSections.lastIndexOf(entityMovementTrackerSection);
        this.sectionVisible[n] = false;
        if (!this.sectionsNotListeningTo.remove(entityMovementTrackerSection)) {
            entityMovementTrackerSection.lithium$removeListenToMovementOnce(this, this.trackedIndex);
            this.notifyAllListeners();
        }
    }

    public void listenToEntityMovementOnce(SectionedEntityMovementListener sectionedEntityMovementListener) {
        if (this.sectionedEntityMovementListeners == null) {
            this.sectionedEntityMovementListeners = new ReferenceOpenHashSet();
        }
        this.sectionedEntityMovementListeners.add((Object)sectionedEntityMovementListener);
        if (!this.sectionsNotListeningTo.isEmpty()) {
            this.setChanged(this.listenToAllSectionsAndGetMaxChangeTime());
        }
    }

    public void onSectionEnteredRange(EntityMovementTrackerSection entityMovementTrackerSection) {
        this.setChanged(this.trackedWorldSections.world().N());
        int n = this.sortedSections.lastIndexOf(entityMovementTrackerSection);
        this.sectionVisible[n] = true;
        this.sectionsNotListeningTo.add(entityMovementTrackerSection);
        this.notifyAllListeners();
    }

    public boolean isUnchangedSince(long l) {
        if (l <= this.maxChangeTime) {
            return false;
        }
        if (!this.sectionsNotListeningTo.isEmpty()) {
            this.setChanged(this.listenToAllSectionsAndGetMaxChangeTime());
            return l > this.maxChangeTime;
        }
        return true;
    }

    public void unRegister(class04782 class047822) {
        assert (class047822 == this.trackedWorldSections.world());
        if (--this.timesRegistered > 0) {
            return;
        }
        assert (this.timesRegistered == 0);
        class01129 class011292 = ((PersistentEntitySectionManagerAccessor)((ServerLevelAccessor)class047822).getEntityManager()).getCache();
        ((LithiumData)class047822).lithium$getData().entityMovementTrackers().deleteCanonical((Object)this);
        ArrayList<class01101<E>> arrayList = this.sortedSections;
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            class01101<E> class011012 = arrayList.get(i);
            EntityMovementTrackerSection entityMovementTrackerSection = (EntityMovementTrackerSection)class011012;
            entityMovementTrackerSection.lithium$removeListener(class011292, this);
            if (this.sectionsNotListeningTo.remove(class011012)) continue;
            ((EntityMovementTrackerSection)class011012).lithium$removeListenToMovementOnce(this, this.trackedIndex);
        }
        this.setChanged(class047822.N());
    }

    private long listenToAllSectionsAndGetMaxChangeTime() {
        long l = Long.MIN_VALUE;
        ArrayList<EntityMovementTrackerSection> arrayList = this.sectionsNotListeningTo;
        for (int i = arrayList.size() - 1; i >= 0; --i) {
            EntityMovementTrackerSection entityMovementTrackerSection = arrayList.remove(i);
            entityMovementTrackerSection.lithium$listenToMovementOnce(this, this.trackedIndex);
            l = Math.max(l, entityMovementTrackerSection.lithium$getChangeTime(this.trackedIndex));
        }
        return l;
    }

    private void notifyAllListeners() {
        ReferenceOpenHashSet<SectionedEntityMovementListener> referenceOpenHashSet = this.sectionedEntityMovementListeners;
        if (referenceOpenHashSet != null && !referenceOpenHashSet.isEmpty()) {
            for (SectionedEntityMovementListener sectionedEntityMovementListener : referenceOpenHashSet) {
                sectionedEntityMovementListener.lithium$handleEntityMovement(this.clazz);
            }
            referenceOpenHashSet.clear();
        }
    }

    private void setChanged(long l) {
        if (l > this.maxChangeTime) {
            this.maxChangeTime = l;
        }
    }
}

