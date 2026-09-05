/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.LongListListEntry
 *  me.shedaniel.clothconfig2.gui.entries.LongListListEntry$LongListCell
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.LongListListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeListBuilder;
import minecraft.class00392;

public class LongListBuilder
extends AbstractRangeListBuilder<Long, LongListListEntry, LongListBuilder> {
    private Function<LongListListEntry, LongListListEntry.LongListCell> createNewInstance;

    public LongListBuilder(class00392 class003922, class00392 class003923, List<Long> list) {
        super(class003922, class003923);
        this.value = list;
    }

    @Override
    public LongListListEntry build() {
        LongListListEntry longListListEntry = new LongListListEntry(this.getFieldNameKey(), (List)this.value, this.isExpanded(), null, this.getSaveConsumer(), this.defaultValue, this.getResetButtonKey(), this.isRequireRestart(), this.isDeleteButtonEnabled(), this.isInsertInFront());
        if (this.min != null) {
            longListListEntry.setMinimum(((Long)this.min).longValue());
        }
        if (this.max != null) {
            longListListEntry.setMaximum(((Long)this.max).longValue());
        }
        if (this.createNewInstance != null) {
            longListListEntry.setCreateNewInstance(this.createNewInstance);
        }
        longListListEntry.setInsertButtonEnabled(this.isInsertButtonEnabled());
        longListListEntry.setCellErrorSupplier(this.cellErrorSupplier);
        longListListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(longListListEntry.getValue()));
        longListListEntry.setAddTooltip(this.getAddTooltip());
        longListListEntry.setRemoveTooltip(this.getRemoveTooltip());
        if (this.errorSupplier != null) {
            longListListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(longListListEntry.getValue()));
        }
        return this.finishBuilding(longListListEntry);
    }

    @Override
    public LongListBuilder removeMax() {
        return (LongListBuilder)super.removeMax();
    }

    @Override
    public LongListBuilder removeMin() {
        return (LongListBuilder)super.removeMin();
    }

    @Override
    public LongListBuilder setDefaultValue(Supplier<List<Long>> supplier) {
        return (LongListBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public LongListBuilder setDefaultValue(List<Long> list) {
        return (LongListBuilder)super.setDefaultValue(list);
    }

    @Override
    public LongListBuilder setSaveConsumer(Consumer<List<Long>> consumer) {
        return (LongListBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public LongListBuilder setMax(long l) {
        this.max = l;
        return this;
    }

    @Override
    public LongListBuilder setMin(long l) {
        this.min = l;
        return this;
    }

    @Override
    public LongListBuilder setTooltip(class00392 ... class00392Array) {
        return (LongListBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public LongListBuilder setTooltip(Optional<class00392[]> optional) {
        return (LongListBuilder)super.setTooltip(optional);
    }

    @Override
    public LongListBuilder setExpanded(boolean bl) {
        return (LongListBuilder)super.setExpanded(bl);
    }

    @Override
    public LongListBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (LongListBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public LongListBuilder setTooltipSupplier(Function<List<Long>, Optional<class00392[]>> function) {
        return (LongListBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public LongListBuilder setErrorSupplier(Function<List<Long>, Optional<class00392>> function) {
        return (LongListBuilder)super.setErrorSupplier(function);
    }

    @Override
    public LongListBuilder requireRestart() {
        return (LongListBuilder)super.requireRestart();
    }

    @Override
    public LongListBuilder setInsertInFront(boolean bl) {
        return (LongListBuilder)super.setInsertInFront(bl);
    }

    @Override
    public LongListBuilder setCellErrorSupplier(Function<Long, Optional<class00392>> function) {
        return (LongListBuilder)super.setCellErrorSupplier(function);
    }

    @Override
    public LongListBuilder setDeleteButtonEnabled(boolean bl) {
        return (LongListBuilder)super.setDeleteButtonEnabled(bl);
    }

    public LongListBuilder setCreateNewInstance(Function<LongListListEntry, LongListListEntry.LongListCell> function) {
        this.createNewInstance = function;
        return this;
    }

    @Override
    public Function<Long, Optional<class00392>> getCellErrorSupplier() {
        return super.getCellErrorSupplier();
    }

    @Override
    public LongListBuilder setRemoveButtonTooltip(class00392 class003922) {
        return (LongListBuilder)super.setRemoveButtonTooltip(class003922);
    }

    @Override
    public LongListBuilder setAddButtonTooltip(class00392 class003922) {
        return (LongListBuilder)super.setAddButtonTooltip(class003922);
    }
}

