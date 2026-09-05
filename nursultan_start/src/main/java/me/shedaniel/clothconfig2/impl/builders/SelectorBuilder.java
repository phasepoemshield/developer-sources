/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.SelectionListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Objects;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.SelectionListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractFieldBuilder;
import minecraft.class00392;

public class SelectorBuilder<T>
extends AbstractFieldBuilder<T, SelectionListEntry<T>, SelectorBuilder<T>> {
    private final T[] valuesArray;
    private Function<T, class00392> nameProvider = null;

    public SelectorBuilder(class00392 class003922, class00392 class003923, T[] TArray, T t) {
        super(class003922, class003923);
        Objects.requireNonNull(t);
        this.valuesArray = TArray;
        this.value = t;
    }

    @Override
    public SelectionListEntry<T> build() {
        SelectionListEntry selectionListEntry = new SelectionListEntry(this.getFieldNameKey(), (Object[])this.valuesArray, this.value, this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), this.nameProvider, null, this.isRequireRestart());
        selectionListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(selectionListEntry.getValue()));
        if (this.errorSupplier != null) {
            selectionListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(selectionListEntry.getValue()));
        }
        return this.finishBuilding(selectionListEntry);
    }

    @Override
    public SelectorBuilder<T> setDefaultValue(T t) {
        return (SelectorBuilder)super.setDefaultValue(t);
    }

    @Override
    public SelectorBuilder<T> setDefaultValue(Supplier<T> supplier) {
        return (SelectorBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public SelectorBuilder<T> setSaveConsumer(Consumer<T> consumer) {
        return (SelectorBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public SelectorBuilder<T> setTooltip(Optional<class00392[]> optional) {
        return (SelectorBuilder)super.setTooltip(optional);
    }

    @Override
    public SelectorBuilder<T> setTooltip(class00392 ... class00392Array) {
        return (SelectorBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public SelectorBuilder<T> setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (SelectorBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public SelectorBuilder<T> setTooltipSupplier(Function<T, Optional<class00392[]>> function) {
        return (SelectorBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public SelectorBuilder<T> setErrorSupplier(Function<T, Optional<class00392>> function) {
        return (SelectorBuilder)super.setErrorSupplier(function);
    }

    @Override
    public SelectorBuilder<T> requireRestart() {
        return (SelectorBuilder)super.requireRestart();
    }

    public SelectorBuilder<T> setNameProvider(Function<T, class00392> function) {
        this.nameProvider = function;
        return this;
    }
}

