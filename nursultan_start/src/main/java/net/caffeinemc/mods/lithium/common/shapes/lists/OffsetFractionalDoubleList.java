/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.doubles.AbstractDoubleList
 */
package net.caffeinemc.mods.lithium.common.shapes.lists;

import it.unimi.dsi.fastutil.doubles.AbstractDoubleList;

public class OffsetFractionalDoubleList
extends AbstractDoubleList {
    private final int numSections;
    private final double offset;

    public OffsetFractionalDoubleList(int n, double d) {
        this.numSections = n;
        this.offset = d;
    }

    public int size() {
        return this.numSections + 1;
    }

    public double getDouble(int n) {
        return this.offset + (double)n / (double)this.numSections;
    }
}

