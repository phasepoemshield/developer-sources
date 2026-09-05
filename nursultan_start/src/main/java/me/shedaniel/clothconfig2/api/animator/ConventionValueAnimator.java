/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.Objects;
import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

final class ConventionValueAnimator<T>
implements ValueAnimator<T> {
    private final ValueAnimator<T> parent;
    private final Supplier<T> convention;
    private final long duration;

    ConventionValueAnimator(ValueAnimator<T> valueAnimator, Supplier<T> supplier, long l) {
        this.parent = valueAnimator;
        this.convention = supplier;
        this.duration = l;
        this.setAs(supplier.get());
    }

    public T value() {
        return (T)this.parent.value();
    }

    public T target() {
        return this.convention.get();
    }

    public void update(double d) {
        this.parent.update(d);
        T t = this.target();
        if (!Objects.equals(this.parent.target(), t)) {
            this.setTo(t, this.duration);
        }
    }

    public ValueAnimator<T> setTarget(T t) {
        return this.parent.setTarget(t);
    }

    public ValueAnimator<T> setTo(T t, long l) {
        return this.parent.setTo(t, l);
    }
}

