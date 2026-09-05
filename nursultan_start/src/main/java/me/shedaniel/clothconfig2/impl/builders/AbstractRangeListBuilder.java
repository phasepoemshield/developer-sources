/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.impl.builders;

import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.impl.builders.AbstractListBuilder;
import minecraft.class00392;

public abstract class AbstractRangeListBuilder<T, A extends AbstractConfigListEntry, SELF extends AbstractRangeListBuilder<T, A, SELF>>
extends AbstractListBuilder<T, A, SELF> {
    protected T min = null;
    protected T max = null;

    protected AbstractRangeListBuilder(class00392 class003922, class00392 class003923) {
        super(class003922, class003923);
    }

    public SELF removeMax() {
        this.max = null;
        return (SELF)this;
    }

    public SELF removeMin() {
        this.min = null;
        return (SELF)this;
    }

    public SELF setMax(T t) {
        this.max = t;
        return (SELF)this;
    }

    public SELF setMin(T t) {
        this.min = t;
        return (SELF)this;
    }
}

