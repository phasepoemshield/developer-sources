/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05377
 *  minecraft.class07209
 *  net.caffeinemc.mods.lithium.common.util.Distances
 */
package net.caffeinemc.mods.lithium.common.util.tuples;

import minecraft.class05377;
import minecraft.class07209;
import net.caffeinemc.mods.lithium.common.util.Distances;

public final class SortedPointOfInterest {
    private final class05377 poi;
    private final int distanceSq;
    private boolean consumed;

    public SortedPointOfInterest(class05377 class053772, int n) {
        this.poi = class053772;
        this.distanceSq = n;
    }

    public SortedPointOfInterest(class05377 class053772, class07209 class072092) {
        this(class053772, Distances.distanceSqInt((class07209)class053772.M(), (class07209)class072092));
    }

    public int getY() {
        return this.getPos().method_10264();
    }

    public int getX() {
        return this.getPos().method_10263();
    }

    public int getZ() {
        return this.getPos().method_10260();
    }

    public boolean isConsumed() {
        return this.consumed;
    }

    public int distanceSq() {
        return this.distanceSq;
    }

    public class05377 poi() {
        return this.poi;
    }

    public class07209 getPos() {
        return this.poi.M();
    }

    public void setConsumed() {
        this.consumed = true;
    }
}

