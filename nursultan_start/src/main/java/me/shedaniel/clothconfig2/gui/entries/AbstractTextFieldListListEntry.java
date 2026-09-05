/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.AbstractListListEntry;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry$AbstractTextFieldListCell;
import minecraft.class00392;

public abstract class AbstractTextFieldListListEntry<T, C extends AbstractTextFieldListListEntry$AbstractTextFieldListCell<T, C, SELF>, SELF extends AbstractTextFieldListListEntry<T, C, SELF>>
extends AbstractListListEntry<T, C, SELF> {
    public AbstractTextFieldListListEntry(class00392 class003922, List<T> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<T>> consumer, Supplier<List<T>> supplier2, class00392 class003923, boolean bl2, boolean bl3, boolean bl4, BiFunction<T, SELF, C> biFunction) {
        super(class003922, list, bl, supplier, consumer, supplier2, class003923, bl2, bl3, bl4, biFunction);
    }
}

