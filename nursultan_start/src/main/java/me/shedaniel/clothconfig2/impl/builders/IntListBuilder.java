/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.IntegerListListEntry
 *  me.shedaniel.clothconfig2.gui.entries.IntegerListListEntry$IntegerListCell
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.IntegerListListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeListBuilder;
import minecraft.class00392;

public class IntListBuilder
extends AbstractRangeListBuilder<Integer, IntegerListListEntry, IntListBuilder> {
    private Function<IntegerListListEntry, IntegerListListEntry.IntegerListCell> createNewInstance;

    public IntListBuilder(class00392 class003922, class00392 class003923, List<Integer> list) {
        super(class003922, class003923);
        this.value = list;
    }

    @Override
    public IntegerListListEntry build() {
        IntegerListListEntry integerListListEntry = new IntegerListListEntry(this.getFieldNameKey(), (List)this.value, this.isExpanded(), null, this.getSaveConsumer(), this.defaultValue, this.getResetButtonKey(), this.isRequireRestart(), this.isDeleteButtonEnabled(), this.isInsertInFront());
        if (this.min != null) {
            integerListListEntry.setMinimum(((Integer)this.min).intValue());
        }
        if (this.max != null) {
            integerListListEntry.setMaximum(((Integer)this.max).intValue());
        }
        if (this.createNewInstance != null) {
            integerListListEntry.setCreateNewInstance(this.createNewInstance);
        }
        integerListListEntry.setInsertButtonEnabled(this.isInsertButtonEnabled());
        integerListListEntry.setCellErrorSupplier(this.cellErrorSupplier);
        integerListListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(integerListListEntry.getValue()));
        integerListListEntry.setAddTooltip(this.getAddTooltip());
        integerListListEntry.setRemoveTooltip(this.getRemoveTooltip());
        if (this.errorSupplier != null) {
            integerListListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(integerListListEntry.getValue()));
        }
        return this.finishBuilding(integerListListEntry);
    }

    @Override
    public IntListBuilder removeMax() {
        return (IntListBuilder)super.removeMax();
    }

    @Override
    public IntListBuilder removeMin() {
        return (IntListBuilder)super.removeMin();
    }

    @Override
    public IntListBuilder setDefaultValue(Supplier<List<Integer>> supplier) {
        return (IntListBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public IntListBuilder setDefaultValue(List<Integer> list) {
        return (IntListBuilder)super.setDefaultValue(list);
    }

    @Override
    public IntListBuilder setSaveConsumer(Consumer<List<Integer>> consumer) {
        return (IntListBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public IntListBuilder setMax(int n) {
        this.max = n;
        return this;
    }

    @Override
    public IntListBuilder setMin(int n) {
        this.min = n;
        return this;
    }

    @Override
    public IntListBuilder setTooltip(class00392 ... class00392Array) {
        return (IntListBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public IntListBuilder setTooltip(Optional<class00392[]> optional) {
        return (IntListBuilder)super.setTooltip(optional);
    }

    @Override
    public IntListBuilder setExpanded(boolean bl) {
        return (IntListBuilder)super.setExpanded(bl);
    }

    @Override
    public IntListBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (IntListBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public IntListBuilder setTooltipSupplier(Function<List<Integer>, Optional<class00392[]>> function) {
        return (IntListBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public IntListBuilder setErrorSupplier(Function<List<Integer>, Optional<class00392>> function) {
        return (IntListBuilder)super.setErrorSupplier(function);
    }

    @Override
    public IntListBuilder requireRestart() {
        return (IntListBuilder)super.requireRestart();
    }

    @Override
    public IntListBuilder setInsertInFront(boolean bl) {
        return (IntListBuilder)super.setInsertInFront(bl);
    }

    @Override
    public IntListBuilder setCellErrorSupplier(Function<Integer, Optional<class00392>> function) {
        return (IntListBuilder)super.setCellErrorSupplier(function);
    }

    @Override
    public IntListBuilder setDeleteButtonEnabled(boolean bl) {
        return (IntListBuilder)super.setDeleteButtonEnabled(bl);
    }

    public IntListBuilder setCreateNewInstance(Function<IntegerListListEntry, IntegerListListEntry.IntegerListCell> function) {
        this.createNewInstance = function;
        return this;
    }

    @Override
    public Function<Integer, Optional<class00392>> getCellErrorSupplier() {
        return super.getCellErrorSupplier();
    }

    @Override
    public IntListBuilder setRemoveButtonTooltip(class00392 class003922) {
        return (IntListBuilder)super.setRemoveButtonTooltip(class003922);
    }

    @Override
    public IntListBuilder setAddButtonTooltip(class00392 class003922) {
        return (IntListBuilder)super.setAddButtonTooltip(class003922);
    }
}

