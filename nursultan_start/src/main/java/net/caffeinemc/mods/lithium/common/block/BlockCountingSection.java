/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate
 */
package net.caffeinemc.mods.lithium.common.block;

import minecraft.class00500;
import net.caffeinemc.mods.lithium.common.block.TrackedBlockStatePredicate;

public interface BlockCountingSection {
    public boolean lithium$mayContainAny(TrackedBlockStatePredicate var1);

    default public short lithium$getCount(TrackedBlockStatePredicate trackedBlockStatePredicate) {
        return this.lithium$getCount(trackedBlockStatePredicate.getIndex());
    }

    public short lithium$getCount(int var1);

    public void lithium$trackBlockStateChange(class00500 var1, class00500 var2);
}

