/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.StringListListEntry
 *  me.shedaniel.clothconfig2.gui.entries.StringListListEntry$StringListCell
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.StringListListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractListBuilder;
import minecraft.class00392;

public class StringListBuilder
extends AbstractListBuilder<String, StringListListEntry, StringListBuilder> {
    private Function<StringListListEntry, StringListListEntry.StringListCell> createNewInstance;

    public StringListBuilder(class00392 class003922, class00392 class003923, List<String> list) {
        super(class003922, class003923);
        this.value = list;
    }

    @Override
    public StringListListEntry build() {
        StringListListEntry stringListListEntry = new StringListListEntry(this.getFieldNameKey(), (List)this.value, this.isExpanded(), null, this.getSaveConsumer(), this.defaultValue, this.getResetButtonKey(), this.isRequireRestart(), this.isDeleteButtonEnabled(), this.isInsertInFront());
        if (this.createNewInstance != null) {
            stringListListEntry.setCreateNewInstance(this.createNewInstance);
        }
        stringListListEntry.setInsertButtonEnabled(this.isInsertButtonEnabled());
        stringListListEntry.setCellErrorSupplier(this.cellErrorSupplier);
        stringListListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(stringListListEntry.getValue()));
        stringListListEntry.setAddTooltip(this.getAddTooltip());
        stringListListEntry.setRemoveTooltip(this.getRemoveTooltip());
        if (this.errorSupplier != null) {
            stringListListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(stringListListEntry.getValue()));
        }
        return this.finishBuilding(stringListListEntry);
    }

    @Override
    public StringListBuilder setDefaultValue(Supplier<List<String>> supplier) {
        return (StringListBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public StringListBuilder setDefaultValue(List<String> list) {
        return (StringListBuilder)super.setDefaultValue(list);
    }

    @Override
    public StringListBuilder setSaveConsumer(Consumer<List<String>> consumer) {
        return (StringListBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public StringListBuilder setTooltip(class00392 ... class00392Array) {
        return (StringListBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public StringListBuilder setTooltip(Optional<class00392[]> optional) {
        return (StringListBuilder)super.setTooltip(optional);
    }

    @Override
    public StringListBuilder setExpanded(boolean bl) {
        return (StringListBuilder)super.setExpanded(bl);
    }

    @Override
    public StringListBuilder setTooltipSupplier(Function<List<String>, Optional<class00392[]>> function) {
        return (StringListBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public StringListBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (StringListBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public StringListBuilder setErrorSupplier(Function<List<String>, Optional<class00392>> function) {
        return (StringListBuilder)super.setErrorSupplier(function);
    }

    @Override
    public StringListBuilder requireRestart() {
        return (StringListBuilder)super.requireRestart();
    }

    @Override
    public StringListBuilder setInsertInFront(boolean bl) {
        return (StringListBuilder)super.setInsertInFront(bl);
    }

    @Override
    public StringListBuilder setCellErrorSupplier(Function<String, Optional<class00392>> function) {
        return (StringListBuilder)super.setCellErrorSupplier(function);
    }

    @Override
    public StringListBuilder setDeleteButtonEnabled(boolean bl) {
        return (StringListBuilder)super.setDeleteButtonEnabled(bl);
    }

    public StringListBuilder setCreateNewInstance(Function<StringListListEntry, StringListListEntry.StringListCell> function) {
        this.createNewInstance = function;
        return this;
    }

    @Override
    public Function<String, Optional<class00392>> getCellErrorSupplier() {
        return super.getCellErrorSupplier();
    }

    @Override
    public StringListBuilder setRemoveButtonTooltip(class00392 class003922) {
        return (StringListBuilder)super.setRemoveButtonTooltip(class003922);
    }

    @Override
    public StringListBuilder setAddButtonTooltip(class00392 class003922) {
        return (StringListBuilder)super.setAddButtonTooltip(class003922);
    }
}

