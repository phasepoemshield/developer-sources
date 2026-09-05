/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.impl.builders.FieldBuilder;
import minecraft.class00392;

public abstract class AbstractFieldBuilder<T, A extends AbstractConfigListEntry, SELF extends FieldBuilder<T, A, SELF>>
extends FieldBuilder<T, A, SELF> {
    private Consumer<T> saveConsumer = null;
    private Function<T, Optional<class00392[]>> tooltipSupplier = object -> Optional.empty();
    protected T value;

    protected AbstractFieldBuilder(class00392 class003922, class00392 class003923) {
        super(class003922, class003923);
    }

    public SELF setDefaultValue(Supplier<T> supplier) {
        this.defaultValue = supplier;
        return (SELF)this;
    }

    public SELF setDefaultValue(T t) {
        this.defaultValue = () -> t;
        return (SELF)this;
    }

    public SELF setSaveConsumer(Consumer<T> consumer) {
        this.saveConsumer = consumer;
        return (SELF)this;
    }

    public SELF setTooltip(class00392 ... class00392Array) {
        this.tooltipSupplier = object -> Optional.ofNullable(class00392Array);
        return (SELF)this;
    }

    public SELF setTooltip(Optional<class00392[]> optional) {
        this.tooltipSupplier = object -> optional;
        return (SELF)this;
    }

    public SELF setTooltipSupplier(Function<T, Optional<class00392[]>> function) {
        this.tooltipSupplier = function;
        return (SELF)this;
    }

    public SELF setTooltipSupplier(Supplier<Optional<class00392[]>> supplier) {
        this.tooltipSupplier = object -> (Optional)supplier.get();
        return (SELF)this;
    }

    public SELF setErrorSupplier(Function<T, Optional<class00392>> function) {
        this.errorSupplier = function;
        return (SELF)this;
    }

    public Function<T, Optional<class00392[]>> getTooltipSupplier() {
        return this.tooltipSupplier;
    }

    public SELF requireRestart() {
        this.requireRestart(true);
        return (SELF)this;
    }

    public Consumer<T> getSaveConsumer() {
        return this.saveConsumer;
    }
}

