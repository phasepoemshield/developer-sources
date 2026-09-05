/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.change_tracking;

import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;

public interface ChangeSubscriber$EnchantmentSubscriber<T>
extends ChangeSubscriber<T> {
    public void lithium$notifyAfterEnchantmentChange(T var1, int var2);
}

