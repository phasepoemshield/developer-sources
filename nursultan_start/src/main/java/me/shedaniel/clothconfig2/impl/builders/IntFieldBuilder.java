/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.IntegerListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.IntegerListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeFieldBuilder;
import minecraft.class00392;

public class IntFieldBuilder
extends AbstractRangeFieldBuilder<Integer, IntegerListEntry, IntFieldBuilder> {
    public IntFieldBuilder(class00392 class003922, class00392 class003923, int n) {
        super(class003922, class003923);
        this.value = n;
    }

    @Override
    public IntegerListEntry build() {
        IntegerListEntry integerListEntry = new IntegerListEntry(this.getFieldNameKey(), (Integer)this.value, this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), null, this.isRequireRestart());
        if (this.min != null) {
            integerListEntry.setMinimum(((Integer)this.min).intValue());
        }
        if (this.max != null) {
            integerListEntry.setMaximum(((Integer)this.max).intValue());
        }
        integerListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(integerListEntry.getValue()));
        if (this.errorSupplier != null) {
            integerListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(integerListEntry.getValue()));
        }
        return this.finishBuilding(integerListEntry);
    }

    @Override
    public IntFieldBuilder removeMax() {
        return (IntFieldBuilder)super.removeMax();
    }

    @Override
    public IntFieldBuilder removeMin() {
        return (IntFieldBuilder)super.removeMin();
    }

    @Override
    public IntFieldBuilder setDefaultValue(Supplier<Integer> supplier) {
        return (IntFieldBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public IntFieldBuilder setDefaultValue(int n) {
        return (IntFieldBuilder)super.setDefaultValue(n);
    }

    @Override
    public IntFieldBuilder setSaveConsumer(Consumer<Integer> consumer) {
        return (IntFieldBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public IntFieldBuilder setMax(int n) {
        return (IntFieldBuilder)super.setMax(n);
    }

    @Override
    public IntFieldBuilder setMin(int n) {
        return (IntFieldBuilder)super.setMin(n);
    }

    @Override
    public IntFieldBuilder setTooltip(class00392 ... class00392Array) {
        return (IntFieldBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public IntFieldBuilder setTooltip(Optional<class00392[]> optional) {
        return (IntFieldBuilder)super.setTooltip(optional);
    }

    @Override
    public IntFieldBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (IntFieldBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public IntFieldBuilder setTooltipSupplier(Function<Integer, Optional<class00392[]>> function) {
        return (IntFieldBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public IntFieldBuilder setErrorSupplier(Function<Integer, Optional<class00392>> function) {
        return (IntFieldBuilder)super.setErrorSupplier(function);
    }

    @Override
    public IntFieldBuilder requireRestart() {
        return (IntFieldBuilder)super.requireRestart();
    }
}

