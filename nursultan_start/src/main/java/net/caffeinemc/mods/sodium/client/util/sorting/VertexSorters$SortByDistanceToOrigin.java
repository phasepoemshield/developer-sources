/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.sorting;

import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters$AbstractSorter;

class VertexSorters$SortByDistanceToOrigin
extends VertexSorters$AbstractSorter {
    static final VertexSorters$SortByDistanceToOrigin INSTANCE = new VertexSorters$SortByDistanceToOrigin();

    private VertexSorters$SortByDistanceToOrigin() {
    }

    @Override
    public float applyMetric(float f, float f2, float f3) {
        return f * f + f2 * f2 + f3 * f3;
    }
}

