/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 */
package net.caffeinemc.mods.lithium.common.hopper;

import minecraft.class00394;
import net.caffeinemc.mods.lithium.common.hopper.ComparatorUpdatePattern;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;

final class ComparatorUpdatePattern$3
extends ComparatorUpdatePattern {
    @Override
    public void apply(class00394 class003942, LithiumStackList lithiumStackList) {
        lithiumStackList.setReducedSignalStrengthOverride();
        class003942.method_5431();
        lithiumStackList.clearSignalStrengthOverride();
        class003942.method_5431();
    }

    @Override
    public boolean isChainable() {
        return false;
    }
}

