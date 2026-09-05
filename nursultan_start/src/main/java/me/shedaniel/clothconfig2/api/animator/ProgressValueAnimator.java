/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.function.Function;
import me.shedaniel.clothconfig2.api.animator.MappingProgressValueAnimator;
import me.shedaniel.clothconfig2.api.animator.NumberAnimator;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

public interface ProgressValueAnimator<T>
extends ValueAnimator<T> {
    public double progress();

    public ProgressValueAnimator<T> setTarget(T var1);

    public ProgressValueAnimator<T> setTo(T var1, long var2);

    default public ProgressValueAnimator<T> setAs(T t) {
        super.setAs(t);
        return this;
    }

    public static <R> ProgressValueAnimator<R> mapProgress(NumberAnimator<?> numberAnimator, Function<Double, R> function, Function<R, Double> function2) {
        return new MappingProgressValueAnimator<R>(numberAnimator.asDouble(), function, function2);
    }
}

