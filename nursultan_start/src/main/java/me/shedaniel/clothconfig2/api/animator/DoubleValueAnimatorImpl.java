/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.impl.EasingMethod
 *  me.shedaniel.clothconfig2.impl.EasingMethod$EasingMethodImpl
 *  minecraft.class07536
 */
package me.shedaniel.clothconfig2.api.animator;

import me.shedaniel.clothconfig2.api.animator.NumberAnimator;
import me.shedaniel.clothconfig2.impl.EasingMethod;
import minecraft.class07536;

final class DoubleValueAnimatorImpl
extends NumberAnimator<Double> {
    private double amount;
    private double target;
    private long start;
    private long duration;

    DoubleValueAnimatorImpl() {
    }

    DoubleValueAnimatorImpl(double d) {
        this.setAs(d);
    }

    public Double value() {
        return this.amount;
    }

    public Double target() {
        return this.target;
    }

    public void update(double d) {
        if (this.duration != 0L) {
            if (this.amount < this.target) {
                this.amount = Math.min(DoubleValueAnimatorImpl.ease(this.amount, this.target + (this.target - this.amount), Math.min(((double)class07536.L() - (double)this.start) / (double)this.duration * d * 3.0, 1.0), (EasingMethod)EasingMethod.EasingMethodImpl.LINEAR), this.target);
            } else if (this.amount > this.target) {
                this.amount = Math.max(DoubleValueAnimatorImpl.ease(this.amount, this.target - (this.amount - this.target), Math.min(((double)class07536.L() - (double)this.start) / (double)this.duration * d * 3.0, 1.0), (EasingMethod)EasingMethod.EasingMethodImpl.LINEAR), this.target);
            }
        }
    }

    @Override
    public int intValue() {
        return (int)this.amount;
    }

    @Override
    public long longValue() {
        return (long)this.amount;
    }

    @Override
    public float floatValue() {
        return (float)this.amount;
    }

    @Override
    public double doubleValue() {
        return this.amount;
    }

    private void set(double d, long l) {
        this.target = d;
        this.start = class07536.L();
        if (l > 0L) {
            this.duration = l;
        } else {
            this.duration = 0L;
            this.amount = this.target;
        }
    }

    private static double ease(double d, double d2, double d3, EasingMethod easingMethod) {
        return d + (d2 - d) * easingMethod.apply(d3);
    }

    @Override
    public NumberAnimator<Double> setTargetNumber(Number number) {
        if (this.duration == 0L) {
            this.setAsNumber(number);
        } else {
            this.target = number.doubleValue();
        }
        return this;
    }

    @Override
    public NumberAnimator<Double> setToNumber(Number number, long l) {
        double d = number.doubleValue();
        if (this.target != d) {
            this.set(d, l);
        }
        return this;
    }
}

