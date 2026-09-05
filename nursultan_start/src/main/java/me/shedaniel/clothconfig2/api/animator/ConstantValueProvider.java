/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ValueProvider
 */
package me.shedaniel.clothconfig2.api.animator;

import me.shedaniel.clothconfig2.api.animator.ValueProvider;

final class ConstantValueProvider<T>
implements ValueProvider<T> {
    private final T value;

    public ConstantValueProvider(T t) {
        this.value = t;
    }

    public T value() {
        return this.value;
    }

    public T target() {
        return this.value;
    }

    public void update(double d) {
    }

    public void completeImmediately() {
    }
}

