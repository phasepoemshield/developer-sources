/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 */
package net.caffeinemc.mods.lithium.common.hopper;

import minecraft.class00394;
import net.caffeinemc.mods.lithium.common.hopper.ComparatorUpdatePattern$1;
import net.caffeinemc.mods.lithium.common.hopper.ComparatorUpdatePattern$2;
import net.caffeinemc.mods.lithium.common.hopper.ComparatorUpdatePattern$3;
import net.caffeinemc.mods.lithium.common.hopper.ComparatorUpdatePattern$4;
import net.caffeinemc.mods.lithium.common.hopper.LithiumStackList;

public sealed class ComparatorUpdatePattern
extends Enum<ComparatorUpdatePattern>
permits ComparatorUpdatePattern$1, ComparatorUpdatePattern$2, ComparatorUpdatePattern$3, ComparatorUpdatePattern$4 {
    public static final /* enum */ ComparatorUpdatePattern NO_UPDATE = new ComparatorUpdatePattern$1();
    public static final /* enum */ ComparatorUpdatePattern UPDATE = new ComparatorUpdatePattern$2();
    public static final /* enum */ ComparatorUpdatePattern DECREMENT_UPDATE_INCREMENT_UPDATE = new ComparatorUpdatePattern$3();
    public static final /* enum */ ComparatorUpdatePattern UPDATE_DECREMENT_UPDATE_INCREMENT_UPDATE = new ComparatorUpdatePattern$4();
    private static final /* synthetic */ ComparatorUpdatePattern[] $VALUES;

    static {
        $VALUES = ComparatorUpdatePattern.$values();
    }

    public static ComparatorUpdatePattern[] values() {
        return (ComparatorUpdatePattern[])$VALUES.clone();
    }

    public static ComparatorUpdatePattern valueOf(String string) {
        return Enum.valueOf(ComparatorUpdatePattern.class, string);
    }

    public void apply(class00394 class003942, LithiumStackList lithiumStackList) {
    }

    private static /* synthetic */ ComparatorUpdatePattern[] $values() {
        return new ComparatorUpdatePattern[]{NO_UPDATE, UPDATE, DECREMENT_UPDATE_INCREMENT_UPDATE, UPDATE_DECREMENT_UPDATE_INCREMENT_UPDATE};
    }

    public ComparatorUpdatePattern thenDecrementUpdateIncrementUpdate() {
        return this;
    }

    public boolean isChainable() {
        return true;
    }

    public ComparatorUpdatePattern thenUpdate() {
        return this;
    }
}

