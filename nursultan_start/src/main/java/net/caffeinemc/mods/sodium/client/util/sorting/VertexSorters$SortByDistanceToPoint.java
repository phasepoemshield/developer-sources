/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.sorting;

import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters$AbstractSorter;

class VertexSorters$SortByDistanceToPoint
extends VertexSorters$AbstractSorter {
    final float x;
    final float y;
    final float z;

    VertexSorters$SortByDistanceToPoint(float f, float f2, float f3) {
        this.x = f;
        this.y = f2;
        this.z = f3;
    }

    @Override
    public float applyMetric(float f, float f2, float f3) {
        float f4 = this.x - f;
        float f5 = this.y - f2;
        float f6 = this.z - f3;
        return f4 * f4 + f5 * f5 + f6 * f6;
    }
}

