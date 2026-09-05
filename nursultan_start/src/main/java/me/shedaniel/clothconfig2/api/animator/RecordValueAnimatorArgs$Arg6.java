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
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg6$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg6$Up;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

public class RecordValueAnimatorArgs$Arg6<A1, A2, A3, A4, A5, A6, T>
implements RecordValueAnimator.Arg<T> {
    private final ValueAnimator<A1> a1;
    private final ValueAnimator<A2> a2;
    private final ValueAnimator<A3> a3;
    private final ValueAnimator<A4> a4;
    private final ValueAnimator<A5> a5;
    private final ValueAnimator<A6> a6;
    private final RecordValueAnimatorArgs$Arg6$Op<A1, A2, A3, A4, A5, A6, T> op;
    private final RecordValueAnimatorArgs$Arg6$Up<A1, A2, A3, A4, A5, A6, T> up;

    public List<ValueAnimator<?>> dependencies() {
        return ImmutableList.builder().add(this.a1).add(this.a2).add(this.a3).add(this.a4).add(this.a5).add(this.a6).build();
    }

    public RecordValueAnimatorArgs$Arg6(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, RecordValueAnimatorArgs$Arg6$Op<A1, A2, A3, A4, A5, A6, T> recordValueAnimatorArgs$Arg6$Op, RecordValueAnimatorArgs$Arg6$Up<A1, A2, A3, A4, A5, A6, T> recordValueAnimatorArgs$Arg6$Up) {
        this.a1 = valueAnimator;
        this.a2 = valueAnimator2;
        this.a3 = valueAnimator3;
        this.a4 = valueAnimator4;
        this.a5 = valueAnimator5;
        this.a6 = valueAnimator6;
        this.op = recordValueAnimatorArgs$Arg6$Op;
        this.up = recordValueAnimatorArgs$Arg6$Up;
    }

    public T value() {
        return this.op.construct(this.a1.value(), this.a2.value(), this.a3.value(), this.a4.value(), this.a5.value(), this.a6.value());
    }

    public T target() {
        return this.op.construct(this.a1.target(), this.a2.target(), this.a3.target(), this.a4.target(), this.a5.target(), this.a6.target());
    }

    public void set(T t, long l) {
        this.up.update(t, object -> this.a1.setTo(object, l), object -> this.a2.setTo(object, l), object -> this.a3.setTo(object, l), object -> this.a4.setTo(object, l), object -> this.a5.setTo(object, l), object -> this.a6.setTo(object, l));
    }

    public void setTarget(T t) {
        this.up.update(t, this.a1::setTarget, this.a2::setTarget, this.a3::setTarget, this.a4::setTarget, this.a5::setTarget, this.a6::setTarget);
    }
}

