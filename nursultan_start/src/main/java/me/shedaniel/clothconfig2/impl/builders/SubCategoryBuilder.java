/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.gui.entries.SubCategoryListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.gui.entries.SubCategoryListEntry;
import me.shedaniel.clothconfig2.impl.builders.FieldBuilder;
import minecraft.class00392;

public class SubCategoryBuilder
extends FieldBuilder<List<AbstractConfigListEntry>, SubCategoryListEntry, SubCategoryBuilder>
implements List<AbstractConfigListEntry> {
    private final List<AbstractConfigListEntry> entries;
    private Function<List<AbstractConfigListEntry>, Optional<class00392[]>> tooltipSupplier = list -> Optional.empty();
    private boolean expanded = false;

    public SubCategoryBuilder(class00392 class003922, class00392 class003923) {
        super(class003922, class003923);
        this.entries = Lists.newArrayList();
    }

    @Override
    public boolean remove(Object object) {
        return this.entries.remove(object);
    }

    @Override
    public AbstractConfigListEntry remove(int n) {
        return this.entries.remove(n);
    }

    @Override
    public int size() {
        return this.entries.size();
    }

    @Override
    public AbstractConfigListEntry get(int n) {
        return this.entries.get(n);
    }

    @Override
    public int indexOf(Object object) {
        return this.entries.indexOf(object);
    }

    @Override
    public void clear() {
        this.entries.clear();
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.entries.lastIndexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return this.entries.isEmpty();
    }

    @Override
    public boolean add(AbstractConfigListEntry abstractConfigListEntry) {
        return this.entries.add(abstractConfigListEntry);
    }

    @Override
    public void add(int n, AbstractConfigListEntry abstractConfigListEntry) {
        this.entries.add(n, abstractConfigListEntry);
    }

    @Override
    public List<AbstractConfigListEntry> subList(int n, int n2) {
        return this.entries.subList(n, n2);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        return this.entries.toArray(TArray);
    }

    @Override
    public Object[] toArray() {
        return this.entries.toArray();
    }

    @Override
    public Iterator<AbstractConfigListEntry> iterator() {
        return this.entries.iterator();
    }

    @Override
    public boolean contains(Object object) {
        return this.entries.contains(object);
    }

    @Override
    public boolean addAll(Collection<? extends AbstractConfigListEntry> collection) {
        return this.entries.addAll(collection);
    }

    @Override
    public boolean addAll(int n, Collection<? extends AbstractConfigListEntry> collection) {
        return this.entries.addAll(n, collection);
    }

    @Override
    public AbstractConfigListEntry set(int n, AbstractConfigListEntry abstractConfigListEntry) {
        return this.entries.set(n, abstractConfigListEntry);
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return this.entries.removeAll(collection);
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return this.entries.retainAll(collection);
    }

    @Override
    public ListIterator<AbstractConfigListEntry> listIterator(int n) {
        return this.entries.listIterator(n);
    }

    @Override
    public ListIterator<AbstractConfigListEntry> listIterator() {
        return this.entries.listIterator();
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.entries.containsAll(collection);
    }

    @Override
    public SubCategoryListEntry build() {
        SubCategoryListEntry subCategoryListEntry = new SubCategoryListEntry(this.getFieldNameKey(), this.entries, this.expanded);
        subCategoryListEntry.setTooltipSupplier(() -> this.tooltipSupplier.apply(subCategoryListEntry.getValue()));
        return this.finishBuilding(subCategoryListEntry);
    }

    public SubCategoryBuilder setTooltip(class00392 ... class00392Array) {
        this.tooltipSupplier = list -> Optional.ofNullable(class00392Array);
        return this;
    }

    public SubCategoryBuilder setTooltip(Optional<class00392[]> optional) {
        this.tooltipSupplier = list -> optional;
        return this;
    }

    public SubCategoryBuilder setExpanded(boolean bl) {
        this.expanded = bl;
        return this;
    }

    public SubCategoryBuilder setTooltipSupplier(Function<List<AbstractConfigListEntry>, Optional<class00392[]>> function) {
        this.tooltipSupplier = function;
        return this;
    }

    public SubCategoryBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        this.tooltipSupplier = list -> (Optional)supplier.get();
        return this;
    }

    @Override
    public void requireRestart(boolean bl) {
        throw new UnsupportedOperationException();
    }
}

