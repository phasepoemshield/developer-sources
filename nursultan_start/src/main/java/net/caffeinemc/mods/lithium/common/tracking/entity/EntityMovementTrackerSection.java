/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01129
 *  minecraft.class01135
 */
package net.caffeinemc.mods.lithium.common.tracking.entity;

import minecraft.class01129;
import minecraft.class01135;
import net.caffeinemc.mods.lithium.common.tracking.entity.SectionedEntityMovementTracker;

public interface EntityMovementTrackerSection {
    public void lithium$removeListener(class01129<?> var1, SectionedEntityMovementTracker<?> var2);

    public void lithium$addListener(SectionedEntityMovementTracker<?> var1);

    public long lithium$getChangeTime(int var1);

    public <S, E extends class01135> void lithium$removeListenToMovementOnce(SectionedEntityMovementTracker<E> var1, int var2);

    public void lithium$trackEntityMovement(int var1, long var2);

    public <S, E extends class01135> void lithium$listenToMovementOnce(SectionedEntityMovementTracker<E> var1, int var2);
}

