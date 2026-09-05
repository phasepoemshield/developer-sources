/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03326
 *  org.joml.Vector3f
 */
package net.caffeinemc.mods.sodium.client.util.sorting;

import minecraft.class03326;
import net.caffeinemc.mods.sodium.client.util.sorting.VertexSorters$AbstractSorter;
import org.joml.Vector3f;

class VertexSorters$SortByFallback
extends VertexSorters$AbstractSorter {
    private final class03326 function;
    private final Vector3f scratch = new Vector3f();

    VertexSorters$SortByFallback(class03326 class033262) {
        this.function = class033262;
    }

    @Override
    public float applyMetric(float f, float f2, float f3) {
        return this.function.apply(this.scratch.set(f, f2, f3));
    }
}

