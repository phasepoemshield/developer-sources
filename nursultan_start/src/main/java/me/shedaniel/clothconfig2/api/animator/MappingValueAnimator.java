/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.function.Function;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

final class MappingValueAnimator<T, R>
implements ValueAnimator<R> {
    private final ValueAnimator<T> parent;
    private final Function<T, R> converter;
    private final Function<R, T> backwardsConverter;

    MappingValueAnimator(ValueAnimator<T> valueAnimator, Function<T, R> function, Function<R, T> function2) {
        this.parent = valueAnimator;
        this.converter = function;
        this.backwardsConverter = function2;
    }

    public R value() {
        return this.converter.apply(this.parent.value());
    }

    public R target() {
        return this.converter.apply(this.parent.target());
    }

    public void update(double d) {
        this.parent.update(d);
    }

    public ValueAnimator<R> setTarget(R r) {
        this.parent.setTarget(this.backwardsConverter.apply(r));
        return this;
    }

    public ValueAnimator<R> setTo(R r, long l) {
        this.parent.setTo(this.backwardsConverter.apply(r), l);
        return this;
    }
}

