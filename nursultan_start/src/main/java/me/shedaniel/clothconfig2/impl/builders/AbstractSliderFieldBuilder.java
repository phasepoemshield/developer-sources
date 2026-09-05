/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.Objects;
import java.util.function.Function;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractRangeFieldBuilder;
import me.shedaniel.clothconfig2.impl.builders.FieldBuilder;
import minecraft.class00392;

public abstract class AbstractSliderFieldBuilder<T, A extends AbstractConfigListEntry, SELF extends FieldBuilder<T, A, SELF>>
extends AbstractRangeFieldBuilder<T, A, SELF> {
    protected Function<T, class00392> textGetter = null;

    protected AbstractSliderFieldBuilder(class00392 class003922, class00392 class003923) {
        super(class003922, class003923);
    }

    @Override
    public SELF setMax(T t) {
        Objects.requireNonNull(t, "max cannot be null");
        return super.setMax(t);
    }

    @Override
    public SELF setMin(T t) {
        Objects.requireNonNull(t, "min cannot be null");
        return super.setMin(t);
    }

    public SELF setTextGetter(Function<T, class00392> function) {
        this.textGetter = function;
        return (SELF)this;
    }
}

