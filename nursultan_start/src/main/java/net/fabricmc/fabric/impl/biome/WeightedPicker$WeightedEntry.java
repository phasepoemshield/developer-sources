/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package net.fabricmc.fabric.impl.biome;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class WeightedPicker$WeightedEntry<T>
extends Record {
    final T entry;
    final double weight;
    final double upperWeightBound;

    public double weight() {
        return this.weight;
    }

    WeightedPicker$WeightedEntry(T t, double d, double d2) {
        this.entry = t;
        this.weight = d;
        this.upperWeightBound = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{WeightedPicker$WeightedEntry.class, "entry;weight;upperWeightBound", "entry", "weight", "upperWeightBound"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{WeightedPicker$WeightedEntry.class, "entry;weight;upperWeightBound", "entry", "weight", "upperWeightBound"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{WeightedPicker$WeightedEntry.class, "entry;weight;upperWeightBound", "entry", "weight", "upperWeightBound"}, this);
    }

    public T entry() {
        return this.entry;
    }

    public double upperWeightBound() {
        return this.upperWeightBound;
    }
}

