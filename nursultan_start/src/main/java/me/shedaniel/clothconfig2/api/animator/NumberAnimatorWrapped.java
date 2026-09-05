/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.function.Function;
import me.shedaniel.clothconfig2.api.animator.NumberAnimator;

final class NumberAnimatorWrapped<T extends Number, R extends Number>
extends NumberAnimator<T> {
    private final NumberAnimator<R> parent;
    private final Function<R, T> converter;

    NumberAnimatorWrapped(NumberAnimator<R> numberAnimator, Function<R, T> function) {
        this.parent = numberAnimator;
        this.converter = function;
    }

    public T value() {
        return (T)((Number)this.converter.apply((Number)this.parent.value()));
    }

    public T target() {
        return (T)((Number)this.converter.apply((Number)this.parent.target()));
    }

    public void update(double d) {
        this.parent.update(d);
    }

    @Override
    public int intValue() {
        return this.parent.intValue();
    }

    @Override
    public long longValue() {
        return this.parent.longValue();
    }

    @Override
    public float floatValue() {
        return this.parent.floatValue();
    }

    @Override
    public double doubleValue() {
        return this.parent.doubleValue();
    }

    @Override
    public NumberAnimator<T> setTargetNumber(Number number) {
        this.parent.setTargetNumber(number);
        return this;
    }

    @Override
    public NumberAnimator<T> setToNumber(Number number, long l) {
        this.parent.setToNumber(number, l);
        return this;
    }
}

