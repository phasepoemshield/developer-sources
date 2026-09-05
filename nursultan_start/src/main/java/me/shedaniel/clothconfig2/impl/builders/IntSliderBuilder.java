/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.IntegerSliderEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.IntegerSliderEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractSliderFieldBuilder;
import minecraft.class00392;

public class IntSliderBuilder
extends AbstractSliderFieldBuilder<Integer, IntegerSliderEntry, IntSliderBuilder> {
    public IntSliderBuilder(class00392 class003922, class00392 class003923, int n, int n2, int n3) {
        super(class003922, class003923);
        this.value = n;
        this.max = n3;
        this.min = n2;
    }

    @Override
    public IntegerSliderEntry build() {
        IntegerSliderEntry integerSliderEntry = new IntegerSliderEntry(this.getFieldNameKey(), ((Integer)this.min).intValue(), ((Integer)this.max).intValue(), ((Integer)this.value).intValue(), this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), null, this.isRequireRestart());
        if (this.textGetter != null) {
            integerSliderEntry.setTextGetter(this.textGetter);
        }
        integerSliderEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(integerSliderEntry.getValue()));
        if (this.errorSupplier != null) {
            integerSliderEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(integerSliderEntry.getValue()));
        }
        return this.finishBuilding(integerSliderEntry);
    }

    @Override
    public IntSliderBuilder removeMax() {
        return this;
    }

    @Override
    public IntSliderBuilder removeMin() {
        return this;
    }

    @Override
    public IntSliderBuilder setDefaultValue(Supplier<Integer> supplier) {
        return (IntSliderBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public IntSliderBuilder setDefaultValue(int n) {
        this.defaultValue = () -> n;
        return this;
    }

    @Override
    public IntSliderBuilder setSaveConsumer(Consumer<Integer> consumer) {
        return (IntSliderBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public IntSliderBuilder setMax(int n) {
        this.max = n;
        return this;
    }

    @Override
    public IntSliderBuilder setMin(int n) {
        this.min = n;
        return this;
    }

    @Override
    public IntSliderBuilder setTooltip(Optional<class00392[]> optional) {
        return (IntSliderBuilder)super.setTooltip(optional);
    }

    @Override
    public IntSliderBuilder setTooltip(class00392 ... class00392Array) {
        return (IntSliderBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public IntSliderBuilder setTooltipSupplier(Function<Integer, Optional<class00392[]>> function) {
        return (IntSliderBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public IntSliderBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (IntSliderBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public IntSliderBuilder setErrorSupplier(Function<Integer, Optional<class00392>> function) {
        return (IntSliderBuilder)super.setErrorSupplier(function);
    }

    @Override
    public IntSliderBuilder setTextGetter(Function<Integer, class00392> function) {
        return (IntSliderBuilder)super.setTextGetter(function);
    }

    @Override
    public IntSliderBuilder requireRestart() {
        return (IntSliderBuilder)super.requireRestart();
    }
}

