/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimatorAsNumberAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import me.shedaniel.clothconfig2.api.animator.NumberAnimator;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;
import me.shedaniel.clothconfig2.api.animator.ValueAnimatorAsNumberAnimator;

class NumberAnimator$1
extends ValueAnimatorAsNumberAnimator<T> {
    final /* synthetic */ NumberAnimator this$0;

    NumberAnimator$1(NumberAnimator numberAnimator, ValueAnimator valueAnimator) {
        this.this$0 = numberAnimator;
        super(valueAnimator);
    }

    public NumberAnimator<T> setTargetNumber(Number number) {
        return this.this$0.setTargetNumber(number);
    }

    public NumberAnimator<T> setToNumber(Number number, long l) {
        return this.this$0.setToNumber(number, l);
    }
}

