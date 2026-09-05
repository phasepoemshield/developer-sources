/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.change_tracking;

import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;

public interface ChangeSubscriber$CountChangeSubscriber<T>
extends ChangeSubscriber<T> {
    public void lithium$notifyCount(T var1, int var2, int var3);
}

