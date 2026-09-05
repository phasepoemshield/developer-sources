/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06584
 */
package net.caffeinemc.mods.lithium.common.util.change_tracking;

import minecraft.class06584;
import net.caffeinemc.mods.lithium.common.util.change_tracking.ChangeSubscriber;

public interface ChangePublisher<T> {
    public int lithium$unsubscribe(ChangeSubscriber<T> var1);

    public void lithium$subscribe(ChangeSubscriber<T> var1, int var2);

    default public void lithium$unsubscribeWithData(ChangeSubscriber<T> changeSubscriber, int n) {
        throw new UnsupportedOperationException("Only implemented for ItemStacks");
    }

    default public boolean lithium$isSubscribedWithData(ChangeSubscriber<class06584> changeSubscriber, int n) {
        throw new UnsupportedOperationException("Only implemented for ItemStacks");
    }
}

