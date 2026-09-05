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
import me.shedaniel.clothconfig2.gui.entries.IntegerListListEntry$IntegerListCell;
import minecraft.class00392;

public class IntegerListListEntry
extends AbstractTextFieldListListEntry<Integer, IntegerListListEntry$IntegerListCell, IntegerListListEntry> {
    int minimum = Integer.MIN_VALUE;
    int maximum = Integer.MAX_VALUE;

    @Deprecated
    public IntegerListListEntry(class00392 class003922, List<Integer> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Integer>> consumer, Supplier<List<Integer>> supplier2, class00392 class003923, boolean bl2, boolean bl3, boolean bl4) {
        super(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, bl3, bl4, IntegerListListEntry$IntegerListCell::new);
    }

    @Deprecated
    public IntegerListListEntry(class00392 class003922, List<Integer> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Integer>> consumer, Supplier<List<Integer>> supplier2, class00392 class003923, boolean bl2) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, true, true);
    }

    @Deprecated
    public IntegerListListEntry(class00392 class003922, List<Integer> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<Integer>> consumer, Supplier<List<Integer>> supplier2, class00392 class003923) {
        this(class003922, list, bl, supplier, consumer, supplier2, class003923, false);
    }

    @Override
    public IntegerListListEntry self() {
        return this;
    }

    public IntegerListListEntry setMinimum(int n) {
        this.minimum = n;
        return this;
    }

    public IntegerListListEntry setMaximum(int n) {
        this.maximum = n;
        return this;
    }
}

