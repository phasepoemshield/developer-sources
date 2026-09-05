/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.function.Function;
import me.shedaniel.clothconfig2.api.animator.ProgressValueAnimator;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

final class MappingProgressValueAnimator<R>
implements ProgressValueAnimator<R> {
    private final ValueAnimator<Double> parent;
    private final Function<Double, R> converter;
    private final Function<R, Double> backwardsConverter;

    @Override
    public double progress() {
        return (Double)this.parent.value() / 100.0;
    }

    MappingProgressValueAnimator(ValueAnimator<Double> valueAnimator, Function<Double, R> function, Function<R, Double> function2) {
        this.parent = valueAnimator;
        this.converter = function;
        this.backwardsConverter = function2;
    }

    public R value() {
        return this.converter.apply((Double)this.parent.value());
    }

    public R target() {
        return this.converter.apply((Double)this.parent.target());
    }

    public void update(double d) {
        this.parent.update(d);
    }

    @Override
    public ProgressValueAnimator<R> setTarget(R r) {
        this.parent.setTarget((Object)this.backwardsConverter.apply(r));
        return this;
    }

    @Override
    public ProgressValueAnimator<R> setTo(R r, long l) {
        this.parent.setTo((Object)this.backwardsConverter.apply(r), l);
        return this;
    }
}

