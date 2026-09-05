/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.FloatListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.FloatListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeFieldBuilder;
import minecraft.class00392;

public class FloatFieldBuilder
extends AbstractRangeFieldBuilder<Float, FloatListEntry, FloatFieldBuilder> {
    public FloatFieldBuilder(class00392 class003922, class00392 class003923, float f) {
        super(class003922, class003923);
        this.value = Float.valueOf(f);
    }

    @Override
    public FloatListEntry build() {
        FloatListEntry floatListEntry = new FloatListEntry(this.getFieldNameKey(), (Float)this.value, this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), null, this.isRequireRestart());
        if (this.min != null) {
            floatListEntry.setMinimum(((Float)this.min).floatValue());
        }
        if (this.max != null) {
            floatListEntry.setMaximum(((Float)this.max).floatValue());
        }
        floatListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(floatListEntry.getValue()));
        if (this.errorSupplier != null) {
            floatListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(floatListEntry.getValue()));
        }
        return this.finishBuilding(floatListEntry);
    }

    @Override
    public FloatFieldBuilder removeMax() {
        return (FloatFieldBuilder)super.removeMax();
    }

    @Override
    public FloatFieldBuilder removeMin() {
        return (FloatFieldBuilder)super.removeMin();
    }

    @Override
    public FloatFieldBuilder setDefaultValue(Supplier<Float> supplier) {
        return (FloatFieldBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public FloatFieldBuilder setDefaultValue(float f) {
        this.defaultValue = () -> Float.valueOf(f);
        return this;
    }

    @Override
    public FloatFieldBuilder setSaveConsumer(Consumer<Float> consumer) {
        return (FloatFieldBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public FloatFieldBuilder setMax(float f) {
        this.max = Float.valueOf(f);
        return this;
    }

    @Override
    public FloatFieldBuilder setMin(float f) {
        this.min = Float.valueOf(f);
        return this;
    }

    @Override
    public FloatFieldBuilder setTooltip(class00392 ... class00392Array) {
        return (FloatFieldBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public FloatFieldBuilder setTooltip(Optional<class00392[]> optional) {
        return (FloatFieldBuilder)super.setTooltip(optional);
    }

    @Override
    public FloatFieldBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (FloatFieldBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public FloatFieldBuilder setTooltipSupplier(Function<Float, Optional<class00392[]>> function) {
        return (FloatFieldBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public FloatFieldBuilder setErrorSupplier(Function<Float, Optional<class00392>> function) {
        return (FloatFieldBuilder)super.setErrorSupplier(function);
    }

    @Override
    public FloatFieldBuilder requireRestart() {
        return (FloatFieldBuilder)super.requireRestart();
    }
}

