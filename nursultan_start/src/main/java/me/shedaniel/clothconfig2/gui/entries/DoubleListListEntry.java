/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry;
import me.shedaniel.clothconfig2.gui.entries.DoubleListListEntry$DoubleListCell;
import minecraft.class00392;

public class DoubleListListEntry
extends AbstractTextFieldListListEntry<Double, DoubleListListEntry$DoubleListCell, DoubleListListEntry> {
    double minimum = Double.NEGATIVE_INFINITY;
    double maximum = Double.POSITIVE_INFINITY;

    @Deprecated
    public DoubleListListEntry(class00392 class003922, List<Double> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Double>> consumer, Supplier<List<Double>> supplier2, class00392 class003923, boolean bl2, boolean bl3, boolean bl4) {
        super(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, bl3, bl4, DoubleListListEntry$DoubleListCell::new);
    }

    @Deprecated
    public DoubleListListEntry(class00392 class003922, List<Double> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Double>> consumer, Supplier<List<Double>> supplier2, class00392 class003923, boolean bl2) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, true, true);
    }

    @Deprecated
    public DoubleListListEntry(class00392 class003922, List<Double> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Double>> consumer, Supplier<List<Double>> supplier2, class00392 class003923) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, false);
    }

    @Override
    public DoubleListListEntry self() {
        return this;
    }

    public DoubleListListEntry setMinimum(Double d) {
        this.minimum = d;
        return this;
    }

    public DoubleListListEntry setMaximum(Double d) {
        this.maximum = d;
        return this;
    }
}

