/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06710
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.CompoundContainerAccessor
 */
package net.caffeinemc.mods.lithium.common.hopper;

import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06710;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.hopper.LithiumDoubleInventory;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;
import net.caffeinemc.mods.lithium.mixin.block.hopper.CompoundContainerAccessor;

public class LithiumDoubleStackList
extends LithiumStackList {
    private final LithiumStackList first;
    private final LithiumStackList second;
    final LithiumDoubleInventory doubleInventory;
    private long signalStrengthChangeCount;

    public static LithiumDoubleStackList getOrCreate(LithiumInventory lithiumInventory, LithiumInventory lithiumInventory2, LithiumStackList lithiumStackList, LithiumStackList lithiumStackList2) {
        LithiumDoubleStackList lithiumDoubleStackList = lithiumStackList.parent;
        if (lithiumDoubleStackList == null || lithiumDoubleStackList != lithiumStackList2.parent || lithiumDoubleStackList.first != lithiumStackList || lithiumDoubleStackList.second != lithiumStackList2) {
            if (lithiumDoubleStackList != null) {
                lithiumDoubleStackList.doubleInventory.lithium$emitRemoved();
            }
            LithiumDoubleInventory lithiumDoubleInventory = new LithiumDoubleInventory(lithiumInventory, lithiumInventory2);
            lithiumDoubleStackList = new LithiumDoubleStackList(lithiumDoubleInventory, lithiumStackList, lithiumStackList2, lithiumDoubleInventory.method_5444());
            lithiumDoubleInventory.setDoubleStackList(lithiumDoubleStackList);
            lithiumStackList.parent = lithiumDoubleStackList;
            lithiumStackList2.parent = lithiumDoubleStackList;
        }
        return lithiumDoubleStackList;
    }

    public LithiumDoubleStackList(LithiumDoubleInventory lithiumDoubleInventory, LithiumStackList lithiumStackList, LithiumStackList lithiumStackList2, int n) {
        super(n);
        this.first = lithiumStackList;
        this.second = lithiumStackList2;
        this.doubleInventory = lithiumDoubleInventory;
    }

    @Override
    public class06584 remove(int n) {
        throw new UnsupportedOperationException("Call remove(int value, ItemStack element) on the inventory half only!");
    }

    public int size() {
        return this.first.size() + this.second.size();
    }

    public class06584 get(int n) {
        return n >= this.first.size() ? (class06584)this.second.get(n - this.first.size()) : (class06584)this.first.get(n);
    }

    @Override
    public void clear() {
        this.first.clear();
        this.second.clear();
    }

    @Override
    public void add(int n, class06584 class065842) {
        throw new UnsupportedOperationException("Call add(int value, ItemStack element) on the inventory half only!");
    }

    @Override
    public class06584 set(int n, class06584 class065842) {
        if (n >= this.first.size()) {
            return this.second.set(n - this.first.size(), class065842);
        }
        return this.first.set(n, class065842);
    }

    @Override
    public void changed() {
        throw new UnsupportedOperationException("Call changed() on the inventory half only!");
    }

    @Override
    public int getFullSlots() {
        return this.first.getFullSlots() + this.second.getFullSlots();
    }

    @Override
    public long getModCount() {
        return this.first.getModCount() + this.second.getModCount();
    }

    @Override
    public int getOccupiedSlots() {
        return this.first.getOccupiedSlots() + this.second.getOccupiedSlots();
    }

    @Override
    public int getSignalStrength(class06695 class066952) {
        boolean bl;
        boolean bl2 = bl = this.first.hasSignalStrengthOverride() || this.second.hasSignalStrengthOverride();
        if (bl) {
            return 0;
        }
        int n = this.cachedSignalStrength;
        if (n == -1 || this.getModCount() != this.signalStrengthChangeCount) {
            n = this.calculateSignalStrength(Integer.MAX_VALUE);
            this.signalStrengthChangeCount = this.getModCount();
            this.cachedSignalStrength = n;
            return n;
        }
        return n;
    }

    @Override
    public void lithium$notifyCount(class06584 class065842, int n, int n2) {
        throw new UnsupportedOperationException("Call lithium$notifyCount() on the inventory halves only!");
    }

    @Override
    public void lithium$forceUnsubscribe(class06584 class065842, int n) {
        throw new UnsupportedOperationException("Call lithium$forceUnsubscribe() on the inventory halves only!");
    }

    @Override
    public void lithium$notify(class06584 class065842, int n) {
        throw new UnsupportedOperationException("Call lithium$notify() on the inventory halves only!");
    }

    @Override
    public void changedInteractionConditions() {
        this.first.changedInteractionConditions();
        this.second.changedInteractionConditions();
    }

    @Override
    public void setReducedSignalStrengthOverride() {
        this.first.setReducedSignalStrengthOverride();
        this.second.setReducedSignalStrengthOverride();
    }

    @Override
    public void clearSignalStrengthOverride() {
        this.first.clearSignalStrengthOverride();
        this.second.clearSignalStrengthOverride();
    }

    @Override
    public void changedALot() {
        throw new UnsupportedOperationException("Call changed() on the inventory half only!");
    }

    @Override
    public boolean hasSignalStrengthOverride() {
        throw new UnsupportedOperationException("Call hasSignalStrengthOverride() on the inventory halves only!");
    }

    @Override
    int calculateSignalStrength(int n) {
        return super.calculateSignalStrength(n);
    }

    @Override
    public boolean maybeSendsComparatorUpdatesOnFailedExtract() {
        return this.first.maybeSendsComparatorUpdatesOnFailedExtract() || this.second.maybeSendsComparatorUpdatesOnFailedExtract();
    }

    @Override
    public void setNextInventoryModificationCallback(InventoryChangeTracker inventoryChangeTracker) {
        throw new UnsupportedOperationException("Call setNextInventoryModificationCallback() on the inventory halves only!");
    }

    @Override
    public void runComparatorUpdatePatternOnFailedExtract(LithiumStackList lithiumStackList, class06695 class066952) {
        if (class066952 instanceof class06710) {
            this.first.runComparatorUpdatePatternOnFailedExtract(this, ((CompoundContainerAccessor)class066952).getFirst());
            this.second.runComparatorUpdatePatternOnFailedExtract(this, ((CompoundContainerAccessor)class066952).getSecond());
        }
    }

    @Override
    public void removeInventoryModificationCallback(InventoryChangeTracker inventoryChangeTracker) {
        this.first.removeInventoryModificationCallback(inventoryChangeTracker);
        this.second.removeInventoryModificationCallback(inventoryChangeTracker);
    }
}

