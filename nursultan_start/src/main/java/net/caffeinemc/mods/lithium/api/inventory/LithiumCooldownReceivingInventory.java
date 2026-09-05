/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.api.inventory;

public interface LithiumCooldownReceivingInventory {
    default public boolean canReceiveTransferCooldown() {
        return false;
    }

    default public void setTransferCooldown(long l) {
    }
}

