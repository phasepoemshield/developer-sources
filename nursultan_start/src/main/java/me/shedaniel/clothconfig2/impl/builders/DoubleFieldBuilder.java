/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DoubleListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.DoubleListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeFieldBuilder;
import minecraft.class00392;

public class DoubleFieldBuilder
extends AbstractRangeFieldBuilder<Double, DoubleListEntry, DoubleFieldBuilder> {
    public DoubleFieldBuilder(class00392 class003922, class00392 class003923, double d) {
        super(class003922, class003923);
        this.value = d;
    }

    @Override
    public DoubleListEntry build() {
        DoubleListEntry doubleListEntry = new DoubleListEntry(this.getFieldNameKey(), (Double)this.value, this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), null, this.isRequireRestart());
        if (this.min != null) {
            doubleListEntry.setMinimum(((Double)this.min).doubleValue());
        }
        if (this.max != null) {
            doubleListEntry.setMaximum(((Double)this.max).doubleValue());
        }
        doubleListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(doubleListEntry.getValue()));
        if (this.errorSupplier != null) {
            doubleListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(doubleListEntry.getValue()));
        }
        return this.finishBuilding(doubleListEntry);
    }

    @Override
    public DoubleFieldBuilder removeMax() {
        return (DoubleFieldBuilder)super.removeMax();
    }

    @Override
    public DoubleFieldBuilder removeMin() {
        return (DoubleFieldBuilder)super.removeMin();
    }

    @Override
    public DoubleFieldBuilder setDefaultValue(Supplier<Double> supplier) {
        return (DoubleFieldBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public DoubleFieldBuilder setDefaultValue(double d) {
        this.defaultValue = () -> d;
        return this;
    }

    @Override
    public DoubleFieldBuilder setSaveConsumer(Consumer<Double> consumer) {
        return (DoubleFieldBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public DoubleFieldBuilder setMax(double d) {
        this.max = d;
        return this;
    }

    @Override
    public DoubleFieldBuilder setMin(double d) {
        this.min = d;
        return this;
    }

    @Override
    public DoubleFieldBuilder setTooltip(Optional<class00392[]> optional) {
        return (DoubleFieldBuilder)super.setTooltip(optional);
    }

    @Override
    public DoubleFieldBuilder setTooltip(class00392 ... class00392Array) {
        return (DoubleFieldBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public DoubleFieldBuilder setTooltipSupplier(Function<Double, Optional<class00392[]>> function) {
        return (DoubleFieldBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public DoubleFieldBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (DoubleFieldBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public DoubleFieldBuilder setErrorSupplier(Function<Double, Optional<class00392>> function) {
        return (DoubleFieldBuilder)super.setErrorSupplier(function);
    }

    @Override
    public DoubleFieldBuilder requireRestart() {
        return (DoubleFieldBuilder)super.requireRestart();
    }
}

