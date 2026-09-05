/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 */
package net.caffeinemc.mods.lithium.common.util.math;

import minecraft.class06889;

public class MutableVec3d {
    private double x;
    private double y;
    private double z;

    public void add(class06889 class068892) {
        this.x += class068892.M;
        this.y += class068892.B;
        this.z += class068892.Z;
    }

    public double getY() {
        return this.y;
    }

    public double getX() {
        return this.x;
    }

    public double getZ() {
        return this.z;
    }

    public class06889 toImmutable() {
        return new class06889(this.x, this.y, this.z);
    }
}

