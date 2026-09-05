/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import com.google.common.collect.ImmutableList;
import java.util.List;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimator$Arg;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg1$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg1$Up;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

public class RecordValueAnimatorArgs$Arg1<A1, T>
implements RecordValueAnimator$Arg<T> {
    private final ValueAnimator<A1> a1;
    private final RecordValueAnimatorArgs$Arg1$Op<A1, T> op;
    private final RecordValueAnimatorArgs$Arg1$Up<A1, T> up;

    @Override
    public List<ValueAnimator<?>> dependencies() {
        return ImmutableList.builder().add(this.a1).build();
    }

    public RecordValueAnimatorArgs$Arg1(ValueAnimator<A1> valueAnimator, RecordValueAnimatorArgs$Arg1$Op<A1, T> recordValueAnimatorArgs$Arg1$Op, RecordValueAnimatorArgs$Arg1$Up<A1, T> recordValueAnimatorArgs$Arg1$Up) {
        this.a1 = valueAnimator;
        this.op = recordValueAnimatorArgs$Arg1$Op;
        this.up = recordValueAnimatorArgs$Arg1$Up;
    }

    @Override
    public T value() {
        return this.op.construct(this.a1.value());
    }

    @Override
    public T target() {
        return this.op.construct(this.a1.target());
    }

    @Override
    public void set(T t, long l) {
        this.up.update(t, object -> this.a1.setTo(object, l));
    }

    @Override
    public void setTarget(T t) {
        this.up.update(t, arg_0 -> this.a1.setTarget(arg_0));
    }
}

