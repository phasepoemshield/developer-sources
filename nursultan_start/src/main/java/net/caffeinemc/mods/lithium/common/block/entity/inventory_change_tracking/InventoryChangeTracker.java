/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking;

import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeEmitter;
import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;

public interface InventoryChangeTracker
extends InventoryChangeEmitter {
    default public void listenForMajorInventoryChanges(InventoryChangeListener inventoryChangeListener) {
        this.lithium$forwardMajorInventoryChanges(inventoryChangeListener);
    }

    default public void listenForContentChangesOnce(LithiumStackList lithiumStackList, InventoryChangeListener inventoryChangeListener) {
        this.lithium$forwardContentChangeOnce(inventoryChangeListener, lithiumStackList);
    }

    default public void stopListenForMajorInventoryChanges(InventoryChangeListener inventoryChangeListener) {
        this.lithium$stopForwardingMajorInventoryChanges(inventoryChangeListener);
    }
}

