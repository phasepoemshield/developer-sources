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
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg15$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg15$Up;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

public class RecordValueAnimatorArgs$Arg15<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T>
implements RecordValueAnimator$Arg<T> {
    private final ValueAnimator<A1> a1;
    private final ValueAnimator<A2> a2;
    private final ValueAnimator<A3> a3;
    private final ValueAnimator<A4> a4;
    private final ValueAnimator<A5> a5;
    private final ValueAnimator<A6> a6;
    private final ValueAnimator<A7> a7;
    private final ValueAnimator<A8> a8;
    private final ValueAnimator<A9> a9;
    private final ValueAnimator<A10> a10;
    private final ValueAnimator<A11> a11;
    private final ValueAnimator<A12> a12;
    private final ValueAnimator<A13> a13;
    private final ValueAnimator<A14> a14;
    private final ValueAnimator<A15> a15;
    private final RecordValueAnimatorArgs$Arg15$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T> op;
    private final RecordValueAnimatorArgs$Arg15$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T> up;

    @Override
    public List<ValueAnimator<?>> dependencies() {
        return ImmutableList.builder().add(this.a1).add(this.a2).add(this.a3).add(this.a4).add(this.a5).add(this.a6).add(this.a7).add(this.a8).add(this.a9).add(this.a10).add(this.a11).add(this.a12).add(this.a13).add(this.a14).add(this.a15).build();
    }

    public RecordValueAnimatorArgs$Arg15(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, ValueAnimator<A14> valueAnimator14, ValueAnimator<A15> valueAnimator15, RecordValueAnimatorArgs$Arg15$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T> recordValueAnimatorArgs$Arg15$Op, RecordValueAnimatorArgs$Arg15$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T> recordValueAnimatorArgs$Arg15$Up) {
        this.a1 = valueAnimator;
        this.a2 = valueAnimator2;
        this.a3 = valueAnimator3;
        this.a4 = valueAnimator4;
        this.a5 = valueAnimator5;
        this.a6 = valueAnimator6;
        this.a7 = valueAnimator7;
        this.a8 = valueAnimator8;
        this.a9 = valueAnimator9;
        this.a10 = valueAnimator10;
        this.a11 = valueAnimator11;
        this.a12 = valueAnimator12;
        this.a13 = valueAnimator13;
        this.a14 = valueAnimator14;
        this.a15 = valueAnimator15;
        this.op = recordValueAnimatorArgs$Arg15$Op;
        this.up = recordValueAnimatorArgs$Arg15$Up;
    }

    @Override
    public T value() {
        return this.op.construct(this.a1.value(), this.a2.value(), this.a3.value(), this.a4.value(), this.a5.value(), this.a6.value(), this.a7.value(), this.a8.value(), this.a9.value(), this.a10.value(), this.a11.value(), this.a12.value(), this.a13.value(), this.a14.value(), this.a15.value());
    }

    @Override
    public T target() {
        return this.op.construct(this.a1.target(), this.a2.target(), this.a3.target(), this.a4.target(), this.a5.target(), this.a6.target(), this.a7.target(), this.a8.target(), this.a9.target(), this.a10.target(), this.a11.target(), this.a12.target(), this.a13.target(), this.a14.target(), this.a15.target());
    }

    @Override
    public void set(T t, long l) {
        this.up.update(t, object -> this.a1.setTo(object, l), object -> this.a2.setTo(object, l), object -> this.a3.setTo(object, l), object -> this.a4.setTo(object, l), object -> this.a5.setTo(object, l), object -> this.a6.setTo(object, l), object -> this.a7.setTo(object, l), object -> this.a8.setTo(object, l), object -> this.a9.setTo(object, l), object -> this.a10.setTo(object, l), object -> this.a11.setTo(object, l), object -> this.a12.setTo(object, l), object -> this.a13.setTo(object, l), object -> this.a14.setTo(object, l), object -> this.a15.setTo(object, l));
    }

    @Override
    public void setTarget(T t) {
        this.up.update(t, arg_0 -> this.a1.setTarget(arg_0), arg_0 -> this.a2.setTarget(arg_0), arg_0 -> this.a3.setTarget(arg_0), arg_0 -> this.a4.setTarget(arg_0), arg_0 -> this.a5.setTarget(arg_0), arg_0 -> this.a6.setTarget(arg_0), arg_0 -> this.a7.setTarget(arg_0), arg_0 -> this.a8.setTarget(arg_0), arg_0 -> this.a9.setTarget(arg_0), arg_0 -> this.a10.setTarget(arg_0), arg_0 -> this.a11.setTarget(arg_0), arg_0 -> this.a12.setTarget(arg_0), arg_0 -> this.a13.setTarget(arg_0), arg_0 -> this.a14.setTarget(arg_0), arg_0 -> this.a15.setTarget(arg_0));
    }
}

