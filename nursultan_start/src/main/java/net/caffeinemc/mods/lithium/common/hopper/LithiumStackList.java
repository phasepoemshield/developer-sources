/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00743
 *  minecraft.class04995
 *  minecraft.class06584
 *  minecraft.class06695
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumDefaultedList
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.NonNullListAccessor
 */
package net.caffeinemc.mods.lithium.common.hopper;

import minecraft.class00394;
import minecraft.class00743;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class06695;
import net.caffeinemc.mods.lithium.api.inventory.LithiumDefaultedList;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.hopper.ComparatorUpdatePattern;
import net.caffeinemc.mods.lithium.common.hopper.HopperHelper;
import net.caffeinemc.mods.lithium.common.hopper.LithiumDoubleStackList;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangePublisher;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber$CountChangeSubscriber;
import net.caffeinemc.mods.lithium.mixin.block.hopper.NonNullListAccessor;

public class LithiumStackList
extends class00743<class06584>
implements LithiumDefaultedList,
ChangeSubscriber$CountChangeSubscriber<class06584> {
    final int maxCountPerStack;
    protected int cachedSignalStrength;
    private ComparatorUpdatePattern cachedComparatorUpdatePattern;
    private boolean signalStrengthOverride;
    private long modCount;
    private int occupiedSlots;
    private int fullSlots;
    LithiumDoubleStackList parent;
    InventoryChangeTracker nextInventoryModificationCallback;

    public LithiumStackList(class00743<class06584> class007432, int n) {
        super(((NonNullListAccessor)class007432).getDelegate(), (Object)class06584.E);
        this.maxCountPerStack = n;
        this.cachedSignalStrength = -1;
        this.cachedComparatorUpdatePattern = null;
        this.modCount = 0L;
        this.signalStrengthOverride = false;
        this.occupiedSlots = 0;
        this.fullSlots = 0;
        int n2 = this.size();
        for (int i = 0; i < n2; ++i) {
            class06584 class065842 = (class06584)this.get(i);
            if (class065842.R()) continue;
            ++this.occupiedSlots;
            if (class065842.U() <= class065842.c()) {
                ++this.fullSlots;
            }
            ((ChangePublisher)class065842).lithium$subscribe(this, i);
        }
        this.nextInventoryModificationCallback = null;
    }

    public LithiumStackList(int n) {
        super(null, (Object)class06584.E);
        this.maxCountPerStack = n;
        this.cachedSignalStrength = -1;
        this.nextInventoryModificationCallback = null;
    }

    public class06584 remove(int n) {
        class06584 class065842 = (class06584)super.remove(n);
        if (!class065842.R()) {
            ((ChangePublisher)class065842).lithium$unsubscribeWithData(this, n);
        }
        this.changedALot();
        return class065842;
    }

    public void clear() {
        int n = this.size();
        for (int i = 0; i < n; ++i) {
            class06584 class065842 = (class06584)this.get(i);
            if (class065842.R()) continue;
            ((ChangePublisher)class065842).lithium$unsubscribeWithData(this, i);
        }
        super.clear();
        this.changedALot();
    }

    public void add(int n, class06584 class065842) {
        super.add(n, (Object)class065842);
        if (!class065842.R()) {
            ((ChangePublisher)class065842).lithium$subscribe(this, this.indexOf(class065842));
        }
        this.changedALot();
    }

    public class06584 set(int n, class06584 class065842) {
        boolean bl;
        class06584 class065843 = (class06584)super.set(n, (Object)class065842);
        if (class065843 == class065842 && !class065842.R() && !(bl = ((ChangePublisher)class065843).lithium$isSubscribedWithData(this, n))) {
            class065843 = class06584.E;
        }
        if (class065843 != class065842) {
            if (!class065843.R()) {
                ((ChangePublisher)class065843).lithium$unsubscribeWithData(this, n);
            }
            if (!class065842.R()) {
                ((ChangePublisher)class065842).lithium$subscribe(this, n);
            }
            this.occupiedSlots += (class065843.R() ? 1 : 0) - (class065842.R() ? 1 : 0);
            this.fullSlots += (class065842.c() >= class065842.U() ? 1 : 0) - (class065843.c() >= class065843.U() ? 1 : 0);
            this.changed();
        }
        return class065843;
    }

    public void changed() {
        this.cachedSignalStrength = -1;
        this.cachedComparatorUpdatePattern = null;
        ++this.modCount;
        InventoryChangeTracker inventoryChangeTracker = this.nextInventoryModificationCallback;
        if (inventoryChangeTracker != null) {
            this.nextInventoryModificationCallback = null;
            inventoryChangeTracker.lithium$emitContentModified();
        }
    }

    public int getFullSlots() {
        return this.fullSlots;
    }

    public long getModCount() {
        return this.modCount;
    }

    public int getOccupiedSlots() {
        return this.occupiedSlots;
    }

    public int getSignalStrength(class06695 class066952) {
        if (this.signalStrengthOverride) {
            return 0;
        }
        int n = this.cachedSignalStrength;
        if (n == -1) {
            this.cachedSignalStrength = this.calculateSignalStrength(class066952.method_5439());
            return this.cachedSignalStrength;
        }
        return n;
    }

    @Override
    public void lithium$notifyCount(class06584 class065842, int n, int n2) {
        assert (class065842 == this.get(n));
        int n3 = class065842.c();
        if (n2 <= 0) {
            ((ChangePublisher)class065842).lithium$unsubscribeWithData(this, n);
        }
        int n4 = class065842.U();
        this.occupiedSlots -= n2 <= 0 ? 1 : 0;
        this.fullSlots += (n2 >= n4 ? 1 : 0) - (n3 >= n4 ? 1 : 0);
        this.changed();
    }

    @Override
    public void lithium$forceUnsubscribe(class06584 class065842, int n) {
        throw new UnsupportedOperationException("Cannot force unsubscribe on a LithiumStackList!");
    }

    @Override
    public void lithium$notify(class06584 class065842, int n) {
    }

    public void changedInteractionConditions() {
        this.changed();
    }

    public void setReducedSignalStrengthOverride() {
        this.signalStrengthOverride = true;
    }

    public void clearSignalStrengthOverride() {
        this.signalStrengthOverride = false;
    }

    public void changedALot() {
        class06584 class065842;
        int n;
        this.changed();
        this.occupiedSlots = 0;
        this.fullSlots = 0;
        int n2 = this.size();
        for (n = 0; n < n2; ++n) {
            class065842 = (class06584)this.get(n);
            if (class065842.R()) continue;
            ++this.occupiedSlots;
            if (class065842.U() <= class065842.c()) {
                ++this.fullSlots;
            }
            ((ChangePublisher)class065842).lithium$unsubscribe(this);
        }
        for (n = 0; n < n2; ++n) {
            class065842 = (class06584)this.get(n);
            if (class065842.R()) continue;
            ((ChangePublisher)class065842).lithium$subscribe(this, n);
        }
    }

    public boolean hasSignalStrengthOverride() {
        return this.signalStrengthOverride;
    }

    int calculateSignalStrength(int n) {
        int n2 = 0;
        float f = 0.0f;
        n = Math.min(n, this.size());
        for (int i = 0; i < n; ++i) {
            class06584 class065842 = (class06584)this.get(i);
            if (class065842.R()) continue;
            f += (float)class065842.c() / (float)Math.min(this.maxCountPerStack, class065842.U());
            ++n2;
        }
        return class04995.y((float)((f /= (float)n) * 14.0f)) + (n2 > 0 ? 1 : 0);
    }

    public boolean maybeSendsComparatorUpdatesOnFailedExtract() {
        return this.cachedComparatorUpdatePattern == null || this.cachedComparatorUpdatePattern != ComparatorUpdatePattern.NO_UPDATE;
    }

    public void setNextInventoryModificationCallback(InventoryChangeTracker inventoryChangeTracker) {
        if (this.nextInventoryModificationCallback != null && this.nextInventoryModificationCallback != inventoryChangeTracker) {
            this.nextInventoryModificationCallback.emitCallbackReplaced();
        }
        this.nextInventoryModificationCallback = inventoryChangeTracker;
    }

    public void runComparatorUpdatePatternOnFailedExtract(LithiumStackList lithiumStackList, class06695 class066952) {
        if (class066952 instanceof class00394) {
            if (this.cachedComparatorUpdatePattern == null) {
                this.cachedComparatorUpdatePattern = HopperHelper.determineComparatorUpdatePattern(class066952, lithiumStackList);
            }
            this.cachedComparatorUpdatePattern.apply((class00394)class066952, lithiumStackList);
        }
    }

    public void removeInventoryModificationCallback(InventoryChangeTracker inventoryChangeTracker) {
        if (this.nextInventoryModificationCallback != null && this.nextInventoryModificationCallback == inventoryChangeTracker) {
            this.nextInventoryModificationCallback = null;
        }
    }
}

