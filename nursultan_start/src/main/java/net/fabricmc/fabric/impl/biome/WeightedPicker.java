/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  minecraft.class04860
 *  minecraft.class04995
 */
package net.fabricmc.fabric.impl.biome;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import minecraft.class04860;
import minecraft.class04995;
import net.fabricmc.fabric.impl.biome.WeightedPicker$WeightedEntry;

public final class WeightedPicker<T> {
    private double currentTotal;
    private final List<WeightedPicker$WeightedEntry<T>> entries;

    WeightedPicker() {
        this(0.0, new ArrayList<WeightedPicker$WeightedEntry<T>>());
    }

    private WeightedPicker(double d, List<WeightedPicker$WeightedEntry<T>> list) {
        this.currentTotal = d;
        this.entries = list;
    }

    void add(T t, double d) {
        this.currentTotal += d;
        this.entries.add(new WeightedPicker$WeightedEntry<T>(t, d, this.currentTotal));
    }

    <U> WeightedPicker<U> map(Function<T, U> function) {
        return new WeightedPicker<T>(this.currentTotal, this.entries.stream().map((? super T weightedPicker$WeightedEntry) -> new WeightedPicker$WeightedEntry(function.apply(weightedPicker$WeightedEntry.entry), weightedPicker$WeightedEntry.weight, weightedPicker$WeightedEntry.upperWeightBound)).toList());
    }

    WeightedPicker$WeightedEntry<T> search(double d) {
        Preconditions.checkArgument((d <= this.currentTotal ? 1 : 0) != 0, (Object)"The provided target value for entry selection must be less than or equal to the weight total");
        Preconditions.checkArgument((d >= 0.0 ? 1 : 0) != 0, (Object)"The provided target value for entry selection cannot be negative");
        int n = 0;
        int n2 = this.entries.size() - 1;
        while (n < n2) {
            int n3 = n2 + n >>> 1;
            if (d < this.entries.get(n3).upperWeightBound()) {
                n2 = n3;
                continue;
            }
            n = n3 + 1;
        }
        return this.entries.get(n);
    }

    int getEntryCount() {
        return this.entries.size();
    }

    public T pickFromNoise(class04860 class048602, double d, double d2, double d3) {
        double d4 = class04995.N((double)Math.abs(class048602.N(d, d2, d3)), (double)0.0, (double)1.0) * this.getCurrentWeightTotal();
        return this.search(d4).entry();
    }

    double getCurrentWeightTotal() {
        return this.currentTotal;
    }
}

