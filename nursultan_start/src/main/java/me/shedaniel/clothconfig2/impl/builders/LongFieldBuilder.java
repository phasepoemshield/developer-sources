/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.LongListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.gui.entries.LongListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeFieldBuilder;
import minecraft.class00392;

public class LongFieldBuilder
extends AbstractRangeFieldBuilder<Long, LongListEntry, LongFieldBuilder> {
    public LongFieldBuilder(class00392 class003922, class00392 class003923, long l) {
        super(class003922, class003923);
        this.value = l;
    }

    @Override
    public LongListEntry build() {
        LongListEntry longListEntry = new LongListEntry(this.getFieldNameKey(), (Long)this.value, this.getResetButtonKey(), this.defaultValue, this.getSaveConsumer(), null, this.isRequireRestart());
        if (this.min != null) {
            longListEntry.setMinimum(((Long)this.min).longValue());
        }
        if (this.max != null) {
            longListEntry.setMaximum(((Long)this.max).longValue());
        }
        longListEntry.setTooltipSupplier(() -> this.getTooltipSupplier().apply(longListEntry.getValue()));
        if (this.errorSupplier != null) {
            longListEntry.setErrorSupplier(() -> (Optional)this.errorSupplier.apply(longListEntry.getValue()));
        }
        return this.finishBuilding(longListEntry);
    }

    @Override
    public LongFieldBuilder removeMax() {
        return (LongFieldBuilder)super.removeMax();
    }

    @Override
    public LongFieldBuilder removeMin() {
        return (LongFieldBuilder)super.removeMin();
    }

    @Override
    public LongFieldBuilder setDefaultValue(Supplier<Long> supplier) {
        return (LongFieldBuilder)super.setDefaultValue(supplier);
    }

    @Override
    public LongFieldBuilder setDefaultValue(long l) {
        this.defaultValue = () -> l;
        return this;
    }

    @Override
    public LongFieldBuilder setSaveConsumer(Consumer<Long> consumer) {
        return (LongFieldBuilder)super.setSaveConsumer(consumer);
    }

    @Override
    public LongFieldBuilder setMax(long l) {
        this.max = l;
        return this;
    }

    @Override
    public LongFieldBuilder setMin(long l) {
        this.min = l;
        return this;
    }

    @Override
    public LongFieldBuilder setTooltip(class00392 ... class00392Array) {
        return (LongFieldBuilder)super.setTooltip(class00392Array);
    }

    @Override
    public LongFieldBuilder setTooltip(Optional<class00392[]> optional) {
        return (LongFieldBuilder)super.setTooltip(optional);
    }

    @Override
    public LongFieldBuilder setTooltipSupplier(Function<Long, Optional<class00392[]>> function) {
        return (LongFieldBuilder)super.setTooltipSupplier(function);
    }

    @Override
    public LongFieldBuilder setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        return (LongFieldBuilder)super.setTooltipSupplier(supplier);
    }

    @Override
    public LongFieldBuilder setErrorSupplier(Function<Long, Optional<class00392>> function) {
        return (LongFieldBuilder)super.setErrorSupplier(function);
    }

    @Override
    public LongFieldBuilder requireRestart() {
        return (LongFieldBuilder)super.requireRestart();
    }
}

