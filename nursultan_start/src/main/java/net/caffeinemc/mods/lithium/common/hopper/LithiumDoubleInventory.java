/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet
 *  minecraft.class00743
 *  minecraft.class06584
 *  minecraft.class06695
 *  minecraft.class06710
 *  minecraft.class07211
 *  net.caffeinemc.mods.lithium.api.inventory.LithiumInventory
 *  net.caffeinemc.mods.lithium.mixin.block.hopper.CompoundContainerAccessor
 */
package net.caffeinemc.mods.lithium.common.hopper;

import it.unimi.dsi.fastutil.objects.ReferenceOpenHashSet;
import minecraft.class00743;
import minecraft.class06584;
import minecraft.class06695;
import minecraft.class06710;
import minecraft.class07211;
import net.caffeinemc.mods.lithium.api.inventory.LithiumInventory;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeEmitter;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeTracker;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_comparator_tracking.ComparatorTracker;
import net.caffeinemc.mods.lithium.common.hopper.InventoryHelper;
import net.caffeinemc.mods.lithium.common.hopper.LithiumDoubleStackList;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;
import net.caffeinemc.mods.lithium.mixin.block.hopper.CompoundContainerAccessor;

public class LithiumDoubleInventory
extends class06710
implements LithiumInventory,
InventoryChangeEmitter,
InventoryChangeListener,
InventoryChangeTracker,
ComparatorTracker {
    private final LithiumInventory first;
    private final LithiumInventory second;
    private LithiumStackList doubleStackList;
    ReferenceOpenHashSet<InventoryChangeListener> inventoryChangeListeners = null;
    ReferenceOpenHashSet<InventoryChangeListener> inventoryHandlingTypeListeners = null;

    LithiumDoubleInventory(LithiumInventory lithiumInventory, LithiumInventory lithiumInventory2) {
        super((class06695)lithiumInventory, (class06695)lithiumInventory2);
        this.first = lithiumInventory;
        this.second = lithiumInventory2;
    }

    @Override
    public void lithium$handleInventoryRemoved(class06695 class066952) {
        this.lithium$emitRemoved();
    }

    @Override
    public boolean lithium$handleComparatorAdded(class06695 class066952) {
        this.lithium$emitFirstComparatorAdded();
        return this.inventoryChangeListeners.isEmpty();
    }

    @Override
    public void lithium$emitStackListReplaced() {
        ReferenceOpenHashSet<InventoryChangeListener> referenceOpenHashSet = this.inventoryHandlingTypeListeners;
        this.inventoryHandlingTypeListeners = null;
        if (referenceOpenHashSet != null && !referenceOpenHashSet.isEmpty()) {
            referenceOpenHashSet.forEach(inventoryChangeListener -> inventoryChangeListener.handleStackListReplaced((class06695)this));
        }
        if (this.inventoryHandlingTypeListeners == null) {
            this.inventoryHandlingTypeListeners = referenceOpenHashSet;
        }
        this.invalidateChangeListening();
    }

    @Override
    public void lithium$forwardContentChangeOnce(InventoryChangeListener inventoryChangeListener, LithiumStackList lithiumStackList) {
        if (this.inventoryChangeListeners == null) {
            this.inventoryChangeListeners = new ReferenceOpenHashSet(1);
        }
        if (this.inventoryChangeListeners.isEmpty()) {
            ((InventoryChangeTracker)this.first).listenForContentChangesOnce(InventoryHelper.getLithiumStackList(this.first), this);
            ((InventoryChangeTracker)this.second).listenForContentChangesOnce(InventoryHelper.getLithiumStackList(this.second), this);
        }
        this.inventoryChangeListeners.add((Object)inventoryChangeListener);
    }

    @Override
    public void lithium$emitContentModified() {
        ReferenceOpenHashSet<InventoryChangeListener> referenceOpenHashSet = this.inventoryChangeListeners;
        if (referenceOpenHashSet != null) {
            for (InventoryChangeListener inventoryChangeListener : referenceOpenHashSet) {
                inventoryChangeListener.lithium$handleInventoryContentModified((class06695)this);
            }
            referenceOpenHashSet.clear();
        }
    }

    @Override
    public boolean lithium$hasAnyComparatorNearby() {
        return ((ComparatorTracker)this.first).lithium$hasAnyComparatorNearby() || ((ComparatorTracker)this.second).lithium$hasAnyComparatorNearby();
    }

    @Override
    public void lithium$emitFirstComparatorAdded() {
        ReferenceOpenHashSet<InventoryChangeListener> referenceOpenHashSet = this.inventoryChangeListeners;
        if (referenceOpenHashSet != null && !referenceOpenHashSet.isEmpty()) {
            referenceOpenHashSet.removeIf(inventoryChangeListener -> inventoryChangeListener.lithium$handleComparatorAdded((class06695)this));
        }
    }

    public void setDoubleStackList(LithiumStackList lithiumStackList) {
        if (this.doubleStackList != null) {
            throw new IllegalStateException("DoubleStackList already set!");
        }
        this.doubleStackList = lithiumStackList;
    }

    @Override
    public void lithium$stopForwardingMajorInventoryChanges(InventoryChangeListener inventoryChangeListener) {
        if (this.inventoryHandlingTypeListeners != null) {
            this.inventoryHandlingTypeListeners.remove((Object)inventoryChangeListener);
            if (this.inventoryHandlingTypeListeners.isEmpty()) {
                ((InventoryChangeTracker)this.first).stopListenForMajorInventoryChanges(this);
                ((InventoryChangeTracker)this.second).stopListenForMajorInventoryChanges(this);
            }
        }
    }

    public void setInventoryLithium(class00743<class06584> class007432) {
        throw new UnsupportedOperationException();
    }

    public class00743<class06584> getInventoryLithium() {
        return this.doubleStackList;
    }

    @Override
    public void lithium$emitRemoved() {
        ReferenceOpenHashSet<InventoryChangeListener> referenceOpenHashSet = this.inventoryHandlingTypeListeners;
        this.inventoryHandlingTypeListeners = null;
        if (referenceOpenHashSet != null && !referenceOpenHashSet.isEmpty()) {
            referenceOpenHashSet.forEach(inventoryChangeListener -> inventoryChangeListener.lithium$handleInventoryRemoved((class06695)this));
        }
        if (this.inventoryHandlingTypeListeners == null) {
            this.inventoryHandlingTypeListeners = referenceOpenHashSet;
        }
        this.invalidateChangeListening();
    }

    @Override
    public void lithium$onComparatorAdded(class07211 class072112, int n) {
        throw new UnsupportedOperationException("Call onComparatorAdded(Direction direction, int offset) on the inventory half only!");
    }

    private void invalidateChangeListening() {
        LithiumStackList lithiumStackList;
        if (this.inventoryChangeListeners != null) {
            this.inventoryChangeListeners.clear();
        }
        if ((lithiumStackList = this.doubleStackList) != null) {
            lithiumStackList.removeInventoryModificationCallback(this);
        }
    }

    public static LithiumDoubleInventory getLithiumInventory(class06710 class067102) {
        class06695 class066952;
        class06695 class066953 = ((CompoundContainerAccessor)class067102).getFirst();
        if (class066953 != (class066952 = ((CompoundContainerAccessor)class067102).getSecond()) && class066953 instanceof LithiumInventory) {
            LithiumInventory lithiumInventory = (LithiumInventory)class066953;
            if (class066952 instanceof LithiumInventory) {
                LithiumInventory lithiumInventory2 = (LithiumInventory)class066952;
                LithiumDoubleStackList lithiumDoubleStackList = LithiumDoubleStackList.getOrCreate(lithiumInventory, lithiumInventory2, InventoryHelper.getLithiumStackList(lithiumInventory), InventoryHelper.getLithiumStackList(lithiumInventory2));
                return lithiumDoubleStackList.doubleInventory;
            }
        }
        return null;
    }

    @Override
    public void lithium$handleInventoryContentModified(class06695 class066952) {
        this.lithium$emitContentModified();
    }

    @Override
    public void lithium$forwardMajorInventoryChanges(InventoryChangeListener inventoryChangeListener) {
        if (this.inventoryHandlingTypeListeners == null) {
            this.inventoryHandlingTypeListeners = new ReferenceOpenHashSet(1);
        }
        if (this.inventoryHandlingTypeListeners.isEmpty()) {
            ((InventoryChangeTracker)this.first).listenForMajorInventoryChanges(this);
            ((InventoryChangeTracker)this.second).listenForMajorInventoryChanges(this);
        }
        this.inventoryHandlingTypeListeners.add((Object)inventoryChangeListener);
    }
}

