/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.NumberAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import me.shedaniel.clothconfig2.api.animator.NumberAnimator;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

abstract class ValueAnimatorAsNumberAnimator<T extends Number>
extends NumberAnimator<T> {
    private final ValueAnimator<T> animator;

    ValueAnimatorAsNumberAnimator(ValueAnimator<T> valueAnimator) {
        this.animator = valueAnimator;
    }

    public T value() {
        return (T)((Number)this.animator.value());
    }

    public T target() {
        return (T)((Number)this.animator.target());
    }

    public void update(double d) {
        this.animator.update(d);
    }

    public int intValue() {
        return ((Number)this.animator.value()).intValue();
    }

    public long longValue() {
        return ((Number)this.animator.value()).longValue();
    }

    public float floatValue() {
        return ((Number)this.animator.value()).floatValue();
    }

    public double doubleValue() {
        return ((Number)this.animator.value()).doubleValue();
    }
}

