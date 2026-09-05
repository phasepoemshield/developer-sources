/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimator$Arg
 */
package me.shedaniel.clothconfig2.api.animator;

import com.google.common.collect.ImmutableList;
import java.util.List;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimator;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg2$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg2$Up;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

public class RecordValueAnimatorArgs$Arg2<A1, A2, T>
implements RecordValueAnimator.Arg<T> {
    private final ValueAnimator<A1> a1;
    private final ValueAnimator<A2> a2;
    private final RecordValueAnimatorArgs$Arg2$Op<A1, A2, T> op;
    private final RecordValueAnimatorArgs$Arg2$Up<A1, A2, T> up;

    public List<ValueAnimator<?>> dependencies() {
        return ImmutableList.builder().add(this.a1).add(this.a2).build();
    }

    public RecordValueAnimatorArgs$Arg2(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, RecordValueAnimatorArgs$Arg2$Op<A1, A2, T> recordValueAnimatorArgs$Arg2$Op, RecordValueAnimatorArgs$Arg2$Up<A1, A2, T> recordValueAnimatorArgs$Arg2$Up) {
        this.a1 = valueAnimator;
        this.a2 = valueAnimator2;
        this.op = recordValueAnimatorArgs$Arg2$Op;
        this.up = recordValueAnimatorArgs$Arg2$Up;
    }

    public T value() {
        return this.op.construct(this.a1.value(), this.a2.value());
    }

    public T target() {
        return this.op.construct(this.a1.target(), this.a2.target());
    }

    public void set(T t, long l) {
        this.up.update(t, object -> this.a1.setTo(object, l), object -> this.a2.setTo(object, l));
    }

    public void setTarget(T t) {
        this.up.update(t, this.a1::setTarget, this.a2::setTarget);
    }
}

