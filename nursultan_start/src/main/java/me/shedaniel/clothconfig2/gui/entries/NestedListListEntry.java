/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ReferenceProvider
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ReferenceProvider;
import me.shedaniel.clothconfig2.gui.entries.AbstractListListEntry;
import me.shedaniel.clothconfig2.gui.entries.NestedListListEntry$NestedListCell;
import minecraft.class00392;

public final class NestedListListEntry<T, INNER extends AbstractConfigListEntry<T>>
extends AbstractListListEntry<T, NestedListListEntry$NestedListCell<T, INNER>, NestedListListEntry<T, INNER>> {
    final List<ReferenceProvider<?>> referencableEntries = Lists.newArrayList();

    public NestedListListEntry(class00392 class003922, List<T> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<T>> consumer, Supplier<List<T>> supplier2, class00392 class003923, boolean bl2, boolean bl3, BiFunction<T, NestedListListEntry<T, INNER>, INNER> biFunction) {
        super(class003922, list, bl, supplier, consumer, supplier2, class003923, false, bl2, bl3, (object, nestedListListEntry) -> new NestedListListEntry$NestedListCell<Object, AbstractConfigListEntry>(object, (NestedListListEntry<Object, AbstractConfigListEntry>)((Object)nestedListListEntry), (AbstractConfigListEntry)biFunction.apply((Object)object, (NestedListListEntry)((Object)nestedListListEntry))));
        for (NestedListListEntry$NestedListCell nestedListListEntry$NestedListCell : this.cells) {
            this.referencableEntries.add((ReferenceProvider<?>)nestedListListEntry$NestedListCell.nestedEntry);
        }
        this.setReferenceProviderEntries(this.referencableEntries);
    }

    @Override
    public NestedListListEntry<T, INNER> self() {
        return this;
    }

    public Iterator<String> getSearchTags() {
        return Iterators.concat((Iterator)super.getSearchTags(), (Iterator)Iterators.concat(this.cells.stream().map(nestedListListEntry$NestedListCell -> nestedListListEntry$NestedListCell.nestedEntry.getSearchTags()).iterator()));
    }
}

