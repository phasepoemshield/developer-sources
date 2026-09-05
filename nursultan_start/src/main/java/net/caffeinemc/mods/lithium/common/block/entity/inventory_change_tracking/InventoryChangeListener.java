/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06695
 */
package net.caffeinemc.mods.lithium.common.block.entity.inventory_change_tracking;

import minecraft.class06695;

public interface InventoryChangeListener {
    default public void handleStackListReplaced(class06695 class066952) {
        this.lithium$handleInventoryRemoved(class066952);
    }

    public void lithium$handleInventoryRemoved(class06695 var1);

    public boolean lithium$handleComparatorAdded(class06695 var1);

    public void lithium$handleInventoryContentModified(class06695 var1);
}

