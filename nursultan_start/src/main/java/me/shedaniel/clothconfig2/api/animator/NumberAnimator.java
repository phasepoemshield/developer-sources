/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.function.Supplier;
import me.shedaniel.clothconfig2.api.animator.NumberAnimator$1;
import me.shedaniel.clothconfig2.api.animator.NumberAnimatorWrapped;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

public abstract class NumberAnimator<T extends Number>
extends Number
implements ValueAnimator<T> {
    public NumberAnimator<Double> asDouble() {
        return new NumberAnimatorWrapped<Double, Number>(this, Number::doubleValue);
    }

    public ValueAnimator<T> setTarget(T t) {
        this.setTargetNumber((Number)t);
        return this;
    }

    public NumberAnimator<T> setTarget(int n) {
        this.setTargetNumber(n);
        return this;
    }

    public NumberAnimator<T> setTarget(long l) {
        this.setTargetNumber(l);
        return this;
    }

    public NumberAnimator<T> setTarget(float f) {
        this.setTargetNumber(Float.valueOf(f));
        return this;
    }

    public NumberAnimator<T> setTarget(double d) {
        this.setTargetNumber(d);
        return this;
    }

    public NumberAnimator<Integer> asInt() {
        return new NumberAnimatorWrapped<Integer, Number>(this, number -> (int)Math.round(number.doubleValue()));
    }

    public NumberAnimator<Long> asLong() {
        return new NumberAnimatorWrapped<Long, Number>(this, number -> Math.round(number.doubleValue()));
    }

    public NumberAnimator<Float> asFloat() {
        return new NumberAnimatorWrapped<Float, Number>(this, Number::floatValue);
    }

    public NumberAnimator<T> setTo(double d, long l) {
        this.setToNumber(d, l);
        return this;
    }

    public NumberAnimator<T> setTo(float f, long l) {
        this.setToNumber(Float.valueOf(f), l);
        return this;
    }

    public NumberAnimator<T> setTo(int n, long l) {
        this.setToNumber(n, l);
        return this;
    }

    public NumberAnimator<T> setTo(T t, long l) {
        this.setToNumber((Number)t, l);
        return this;
    }

    public NumberAnimator<T> setTo(long l, long l2) {
        this.setToNumber(l, l2);
        return this;
    }

    public NumberAnimator<T> setAs(T t) {
        super.setAs(t);
        return this;
    }

    public NumberAnimator<T> setAs(float f) {
        this.setAsNumber(Float.valueOf(f));
        return this;
    }

    public NumberAnimator<T> setAs(double d) {
        this.setAsNumber(d);
        return this;
    }

    public NumberAnimator<T> setAs(long l) {
        this.setAsNumber(l);
        return this;
    }

    public NumberAnimator<T> setAs(int n) {
        this.setAsNumber(n);
        return this;
    }

    public NumberAnimator<T> setAsNumber(Number number) {
        return this.setToNumber(number, -1L);
    }

    public NumberAnimator<T> withConvention(Supplier<T> supplier, long l) {
        ValueAnimator valueAnimator = super.withConvention(supplier, l);
        return new NumberAnimator$1(this, valueAnimator);
    }

    public abstract NumberAnimator<T> setTargetNumber(Number var1);

    public abstract NumberAnimator<T> setToNumber(Number var1, long var2);
}

