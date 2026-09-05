/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import me.shedaniel.clothconfig2.gui.entries.AbstractListListEntry$AbstractListCell;
import me.shedaniel.clothconfig2.gui.entries.BaseListEntry;
import minecraft.class00392;

public abstract class AbstractListListEntry<T, C extends AbstractListListEntry$AbstractListCell<T, C, SELF>, SELF extends AbstractListListEntry<T, C, SELF>>
extends BaseListEntry<T, C, SELF> {
    protected final BiFunction<T, SELF, C> createNewCell;
    protected Function<T, Optional<class00392>> cellErrorSupplier;
    protected List<T> original;

    public AbstractListListEntry(class00392 class003922, List<T> list, boolean bl, Supplier<Optional<class00392[]>> supplier, Consumer<List<T>> consumer, Supplier<List<T>> supplier2, class00392 class003923, boolean bl2, boolean bl3, boolean bl4, BiFunction<T, SELF, C> biFunction) {
        super(class003922, supplier, supplier2, abstractListListEntry -> (AbstractListListEntry$AbstractListCell)((Object)((Object)biFunction.apply(null, abstractListListEntry))), consumer, class003923, bl2, bl3, bl4);
        this.createNewCell = biFunction;
        this.original = new ArrayList<T>(list);
        for (T t : list) {
            this.cells.add((AbstractListListEntry$AbstractListCell)((Object)biFunction.apply(t, (SELF)((Object)((AbstractListListEntry)((Object)this.self()))))));
        }
        this.widgets.addAll(this.cells);
        this.setExpanded(bl);
    }

    public List<T> getValue() {
        return this.cells.stream().map(AbstractListListEntry$AbstractListCell::getValue).collect(Collectors.toList());
    }

    @Override
    public boolean isEdited() {
        if (super.isEdited()) {
            return true;
        }
        Object object = this.getValue();
        if (object.size() != this.original.size()) {
            return true;
        }
        for (int i = 0; i < object.size(); ++i) {
            if (Objects.equals(object.get(i), this.original.get(i))) continue;
            return true;
        }
        return false;
    }

    @Override
    protected C getFromValue(T t) {
        return (C)((Object)((AbstractListListEntry$AbstractListCell)((Object)this.createNewCell.apply(t, (SELF)((Object)((AbstractListListEntry)((Object)this.self())))))));
    }

    public void setCellErrorSupplier(Function<T, Optional<class00392>> function) {
        this.cellErrorSupplier = function;
    }

    public Function<T, Optional<class00392>> getCellErrorSupplier() {
        return this.cellErrorSupplier;
    }
}

