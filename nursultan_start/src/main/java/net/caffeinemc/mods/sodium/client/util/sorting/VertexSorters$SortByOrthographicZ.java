/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.sorting;

import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters$AbstractSorter;

class VertexSorters$SortByOrthographicZ
extends VertexSorters$AbstractSorter {
    static final VertexSorters$SortByOrthographicZ INSTANCE = new VertexSorters$SortByOrthographicZ();

    private VertexSorters$SortByOrthographicZ() {
    }

    @Override
    public float applyMetric(float f, float f2, float f3) {
        return -f3;
    }
}

