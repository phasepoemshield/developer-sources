/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.LongSliderEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.LongSliderEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractSliderFieldBuilder;
import minecraft.class00392;

public class LongSliderBuilder
extends AbstractSliderFieldBuilder<Long, LongSliderEntry, LongSliderBuilder> {
    public LongSliderBuilder(class00392 class003922, class00392 class003923, long l, long l2, long l3) {
        super(class003922, class003923);
        this.value = l;
        this.max = l3;
        this.min = l2;
    }

    @Override
    public LongSliderEntry build() {
        LongSliderEntry longSliderEntry = new LongSliderEntry(this.getFieldNameKey(), ((Long)this.min).longValue(), ((Long)this.max).longValue(), ((Long)this.value).longValue(), this.getSaveConsumer(), this.getResetButtonKey(), this.defaultValue, null, this.isRequireRestart());
        if (this.textGetter != null) {
            longSliderEntry.setTextGetter(this.textGetter);
        }
        longSliderEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(longSliderEntry.getValue()));
        if (this.errorSupplier != null) {
            longSliderEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(longSliderEntry.getValue()));
        }
        return this.finishBuilding(longSliderEntry);
    }

    @Override
    public LongSliderBuilder setDefaultValue(long l) {
        this.defaultValue = () -> l;
        return this;
    }

    @Override
    public LongSliderBuilder setDefaultValue(Supplier<Long> supplier) {
        return (LongSliderBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public LongSliderBuilder setSaveConsumer(Consumer<Long> consumer) {
        return (LongSliderBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public LongSliderBuilder setTooltip(class00392 ... class00392Array) {
        return (LongSliderBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public LongSliderBuilder setTooltip(Optional<class00392[]> optional) {
        return (LongSliderBuilder)super.setTooltip(optional);
    }

    @Override
    public LongSliderBuilder setTooltipSupplier(Function<Long, Optional<class00392[]>> function) {
        return (LongSliderBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public LongSliderBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (LongSliderBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public LongSliderBuilder setErrorSupplier(Function<Long, Optional<class00392>> function) {
        return (LongSliderBuilder)super.setErrorSupplier(function);
    }

    @Override
    public LongSliderBuilder setTextGetter(Function<Long, class00392> function) {
        return (LongSliderBuilder)super.setTextGetter(function);
    }

    @Override
    public LongSliderBuilder requireRestart() {
        return (LongSliderBuilder)super.requireRestart();
    }
}

