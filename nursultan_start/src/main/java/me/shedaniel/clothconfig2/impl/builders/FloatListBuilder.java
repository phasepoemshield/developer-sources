/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.FloatListListEntry
 *  me.shedaniel.clothconfig2.gui.entries.FloatListListEntry$FloatListCell
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.FloatListListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeListBuilder;
import minecraft.class00392;

public class FloatListBuilder
extends AbstractRangeListBuilder<Float, FloatListListEntry, FloatListBuilder> {
    private Function<FloatListListEntry, FloatListListEntry.FloatListCell> createNewInstance;

    public FloatListBuilder(class00392 class003922, class00392 class003923, List<Float> list) {
        super(class003922, class003923);
        this.value = list;
    }

    @Override
    public FloatListListEntry build() {
        FloatListListEntry floatListListEntry = new FloatListListEntry(this.getFieldNameKey(), (List)this.value, this.isExpanded(), null, this.getSaveConsumer(), this.defaultValue, this.getResetButtonKey(), this.isRequireRestart(), this.isDeleteButtonEnabled(), this.isInsertInFront());
        if (this.min != null) {
            floatListListEntry.setMinimum(((Float)this.min).floatValue());
        }
        if (this.max != null) {
            floatListListEntry.setMaximum(((Float)this.max).floatValue());
        }
        if (this.createNewInstance != null) {
            floatListListEntry.setCreateNewInstance(this.createNewInstance);
        }
        floatListListEntry.setInsertButtonEnabled(this.isInsertButtonEnabled());
        floatListListEntry.setCellErrorSupplier(this.cellErrorSupplier);
        floatListListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(floatListListEntry.getValue()));
        floatListListEntry.setAddTooltip(this.getAddTooltip());
        floatListListEntry.setRemoveTooltip(this.getRemoveTooltip());
        if (this.errorSupplier != null) {
            floatListListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(floatListListEntry.getValue()));
        }
        return this.finishBuilding(floatListListEntry);
    }

    @Override
    public FloatListBuilder removeMax() {
        return (FloatListBuilder)super.removeMax();
    }

    @Override
    public FloatListBuilder removeMin() {
        return (FloatListBuilder)super.removeMin();
    }

    @Override
    public FloatListBuilder setDefaultValue(Supplier<List<Float>> supplier) {
        return (FloatListBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public FloatListBuilder setDefaultValue(List<Float> list) {
        return (FloatListBuilder)super.setDefaultValue(list);
    }

    @Override
    public FloatListBuilder setSaveConsumer(Consumer<List<Float>> consumer) {
        return (FloatListBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public FloatListBuilder setMax(float f) {
        this.max = Float.valueOf(f);
        return this;
    }

    @Override
    public FloatListBuilder setMin(float f) {
        this.min = Float.valueOf(f);
        return this;
    }

    @Override
    public FloatListBuilder setTooltip(class00392 ... class00392Array) {
        return (FloatListBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public FloatListBuilder setTooltip(Optional<class00392[]> optional) {
        return (FloatListBuilder)super.setTooltip(optional);
    }

    @Override
    public FloatListBuilder setExpanded(boolean bl) {
        return (FloatListBuilder)super.setExpanded(bl);
    }

    @Override
    public FloatListBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (FloatListBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public FloatListBuilder setTooltipSupplier(Function<List<Float>, Optional<class00392[]>> function) {
        return (FloatListBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public FloatListBuilder setErrorSupplier(Function<List<Float>, Optional<class00392>> function) {
        return (FloatListBuilder)super.setErrorSupplier(function);
    }

    @Override
    public FloatListBuilder requireRestart() {
        return (FloatListBuilder)super.requireRestart();
    }

    @Override
    public FloatListBuilder setInsertInFront(boolean bl) {
        return (FloatListBuilder)super.setInsertInFront(bl);
    }

    @Override
    public FloatListBuilder setCellErrorSupplier(Function<Float, Optional<class00392>> function) {
        return (FloatListBuilder)super.setCellErrorSupplier(function);
    }

    @Override
    public FloatListBuilder setDeleteButtonEnabled(boolean bl) {
        return (FloatListBuilder)super.setDeleteButtonEnabled(bl);
    }

    public FloatListBuilder setCreateNewInstance(Function<FloatListListEntry, FloatListListEntry.FloatListCell> function) {
        this.createNewInstance = function;
        return this;
    }

    @Override
    public Function<Float, Optional<class00392>> getCellErrorSupplier() {
        return super.getCellErrorSupplier();
    }

    @Override
    public FloatListBuilder setRemoveButtonTooltip(class00392 class003922) {
        return (FloatListBuilder)super.setRemoveButtonTooltip(class003922);
    }

    @Override
    public FloatListBuilder setAddButtonTooltip(class00392 class003922) {
        return (FloatListBuilder)super.setAddButtonTooltip(class003922);
    }
}

