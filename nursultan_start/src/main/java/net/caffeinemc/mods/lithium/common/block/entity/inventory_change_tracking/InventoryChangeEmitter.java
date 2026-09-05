/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking;

import net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking.InventoryChangeListener;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;

public interface InventoryChangeEmitter {
    default public void emitCallbackReplaced() {
        this.lithium$emitRemoved();
    }

    public void lithium$emitStackListReplaced();

    public void lithium$forwardContentChangeOnce(InventoryChangeListener var1, LithiumStackList var2);

    public void lithium$emitContentModified();

    public void lithium$emitFirstComparatorAdded();

    public void lithium$stopForwardingMajorInventoryChanges(InventoryChangeListener var1);

    public void lithium$emitRemoved();

    public void lithium$forwardMajorInventoryChanges(InventoryChangeListener var1);
}

