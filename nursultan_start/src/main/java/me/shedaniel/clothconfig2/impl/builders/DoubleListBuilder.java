/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DoubleListListEntry
 *  me.shedaniel.clothconfig2.gui.entries.DoubleListListEntry$DoubleListCell
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.DoubleListListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeListBuilder;
import minecraft.class00392;

public class DoubleListBuilder
extends AbstractRangeListBuilder<Double, DoubleListListEntry, DoubleListBuilder> {
    private Function<DoubleListListEntry, DoubleListListEntry.DoubleListCell> createNewInstance;

    public DoubleListBuilder(class00392 class003922, class00392 class003923, List<Double> list) {
        super(class003922, class003923);
        this.value = list;
    }

    @Override
    public DoubleListListEntry build() {
        DoubleListListEntry doubleListListEntry = new DoubleListListEntry(this.getFieldNameKey(), (List)this.value, this.isExpanded(), null, this.getSaveConsumer(), this.defaultValue, this.getResetButtonKey(), this.requireRestart, this.isDeleteButtonEnabled(), this.isInsertInFront());
        if (this.min != null) {
            doubleListListEntry.setMinimum((Double)this.min);
        }
        if (this.max != null) {
            doubleListListEntry.setMaximum((Double)this.max);
        }
        if (this.createNewInstance != null) {
            doubleListListEntry.setCreateNewInstance(this.createNewInstance);
        }
        doubleListListEntry.setInsertButtonEnabled(this.isInsertButtonEnabled());
        doubleListListEntry.setCellErrorSupplier(this.cellErrorSupplier);
        doubleListListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(doubleListListEntry.getValue()));
        doubleListListEntry.setAddTooltip(this.getAddTooltip());
        doubleListListEntry.setRemoveTooltip(this.getRemoveTooltip());
        if (this.errorSupplier != null) {
            doubleListListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(doubleListListEntry.getValue()));
        }
        return this.finishBuilding(doubleListListEntry);
    }

    @Override
    public DoubleListBuilder removeMax() {
        return (DoubleListBuilder)super.removeMax();
    }

    @Override
    public DoubleListBuilder removeMin() {
        return (DoubleListBuilder)super.removeMin();
    }

    @Override
    public DoubleListBuilder setDefaultValue(Supplier<List<Double>> supplier) {
        return (DoubleListBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public DoubleListBuilder setDefaultValue(List<Double> list) {
        this.defaultValue = () -> list;
        return this;
    }

    @Override
    public DoubleListBuilder setSaveConsumer(Consumer<List<Double>> consumer) {
        return (DoubleListBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public DoubleListBuilder setMax(double d) {
        this.max = d;
        return this;
    }

    @Override
    public DoubleListBuilder setMin(double d) {
        this.min = d;
        return this;
    }

    @Override
    public DoubleListBuilder setTooltip(Optional<class00392[]> optional) {
        return (DoubleListBuilder)super.setTooltip(optional);
    }

    @Override
    public DoubleListBuilder setTooltip(class00392 ... class00392Array) {
        return (DoubleListBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public DoubleListBuilder setExpanded(boolean bl) {
        return (DoubleListBuilder)super.setExpanded(bl);
    }

    @Override
    public DoubleListBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (DoubleListBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public DoubleListBuilder setTooltipSupplier(Function<List<Double>, Optional<class00392[]>> function) {
        return (DoubleListBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public DoubleListBuilder setErrorSupplier(Function<List<Double>, Optional<class00392>> function) {
        this.errorSupplier = function;
        return this;
    }

    @Override
    public DoubleListBuilder requireRestart() {
        return (DoubleListBuilder)super.requireRestart();
    }

    @Override
    public DoubleListBuilder setInsertInFront(boolean bl) {
        return (DoubleListBuilder)super.setInsertInFront(bl);
    }

    @Override
    public DoubleListBuilder setCellErrorSupplier(Function<Double, Optional<class00392>> function) {
        return (DoubleListBuilder)super.setCellErrorSupplier(function);
    }

    @Override
    public DoubleListBuilder setDeleteButtonEnabled(boolean bl) {
        return (DoubleListBuilder)super.setDeleteButtonEnabled(bl);
    }

    public DoubleListBuilder setCreateNewInstance(Function<DoubleListListEntry, DoubleListListEntry.DoubleListCell> function) {
        this.createNewInstance = function;
        return this;
    }

    @Override
    public Function<Double, Optional<class00392>> getCellErrorSupplier() {
        return super.getCellErrorSupplier();
    }

    @Override
    public DoubleListBuilder setRemoveButtonTooltip(class00392 class003922) {
        return (DoubleListBuilder)super.setRemoveButtonTooltip(class003922);
    }

    @Override
    public DoubleListBuilder setAddButtonTooltip(class00392 class003922) {
        return (DoubleListBuilder)super.setAddButtonTooltip(class003922);
    }
}

