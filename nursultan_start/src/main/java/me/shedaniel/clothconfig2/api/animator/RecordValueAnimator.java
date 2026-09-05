/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg17
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg18
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg18$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg18$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg19
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg19$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg19$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg2
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg2$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg2$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg20
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg20$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg20$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg3
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg3$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg3$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg4
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg4$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg4$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg5
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg5$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg5$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg6
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg6$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg6$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg7
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg7$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg7$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg8
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg8$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg8$Up
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg9
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg9$Op
 *  me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg9$Up
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.List;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimator$Arg;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg1;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg1$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg1$Up;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg10;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg10$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg10$Up;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg11;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg11$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg11$Up;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg12;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg12$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg12$Up;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg13;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg13$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg13$Up;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg14;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg14$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg14$Up;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg15;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg15$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg15$Up;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg16;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg16$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg16$Up;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg17$Op;
import me.shedaniel.clothconfig2.api.animator.RecordValueAnimatorArgs$Arg17$Up;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

final class RecordValueAnimator<T, A extends RecordValueAnimator$Arg<T>>
implements ValueAnimator<T> {
    private final A arg;
    private final List<ValueAnimator<?>> dependencies;

    RecordValueAnimator(A a) {
        this.arg = a;
        this.dependencies = a.dependencies();
    }

    public T value() {
        return this.arg.value();
    }

    public T target() {
        return this.arg.target();
    }

    public void update(double d) {
        for (ValueAnimator<?> valueAnimator : this.dependencies) {
            valueAnimator.update(d);
        }
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T> RecordValueAnimator<T, RecordValueAnimatorArgs$Arg15<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, ValueAnimator<A14> valueAnimator14, ValueAnimator<A15> valueAnimator15, RecordValueAnimatorArgs$Arg15$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T> recordValueAnimatorArgs$Arg15$Op, RecordValueAnimatorArgs$Arg15$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T> recordValueAnimatorArgs$Arg15$Up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs$Arg15<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T>>(new RecordValueAnimatorArgs$Arg15<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, T>(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14, valueAnimator15, recordValueAnimatorArgs$Arg15$Op, recordValueAnimatorArgs$Arg15$Up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T> RecordValueAnimator<T, RecordValueAnimatorArgs$Arg14<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, ValueAnimator<A14> valueAnimator14, RecordValueAnimatorArgs$Arg14$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T> recordValueAnimatorArgs$Arg14$Op, RecordValueAnimatorArgs$Arg14$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T> recordValueAnimatorArgs$Arg14$Up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs$Arg14<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T>>(new RecordValueAnimatorArgs$Arg14<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, T>(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14, recordValueAnimatorArgs$Arg14$Op, recordValueAnimatorArgs$Arg14$Up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T> RecordValueAnimator<T, RecordValueAnimatorArgs$Arg13<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, RecordValueAnimatorArgs$Arg13$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T> recordValueAnimatorArgs$Arg13$Op, RecordValueAnimatorArgs$Arg13$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T> recordValueAnimatorArgs$Arg13$Up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs$Arg13<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T>>(new RecordValueAnimatorArgs$Arg13<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, T>(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, recordValueAnimatorArgs$Arg13$Op, recordValueAnimatorArgs$Arg13$Up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T> RecordValueAnimator<T, RecordValueAnimatorArgs$Arg12<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, RecordValueAnimatorArgs$Arg12$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T> recordValueAnimatorArgs$Arg12$Op, RecordValueAnimatorArgs$Arg12$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T> recordValueAnimatorArgs$Arg12$Up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs$Arg12<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T>>(new RecordValueAnimatorArgs$Arg12<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, T>(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, recordValueAnimatorArgs$Arg12$Op, recordValueAnimatorArgs$Arg12$Up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T> RecordValueAnimator<T, RecordValueAnimatorArgs$Arg10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, RecordValueAnimatorArgs$Arg10$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T> recordValueAnimatorArgs$Arg10$Op, RecordValueAnimatorArgs$Arg10$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T> recordValueAnimatorArgs$Arg10$Up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs$Arg10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T>>(new RecordValueAnimatorArgs$Arg10<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, T>(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, recordValueAnimatorArgs$Arg10$Op, recordValueAnimatorArgs$Arg10$Up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T> RecordValueAnimator<T, RecordValueAnimatorArgs$Arg11<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, RecordValueAnimatorArgs$Arg11$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T> recordValueAnimatorArgs$Arg11$Op, RecordValueAnimatorArgs$Arg11$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T> recordValueAnimatorArgs$Arg11$Up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs$Arg11<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T>>(new RecordValueAnimatorArgs$Arg11<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, T>(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, recordValueAnimatorArgs$Arg11$Op, recordValueAnimatorArgs$Arg11$Up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg20<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, ValueAnimator<A14> valueAnimator14, ValueAnimator<A15> valueAnimator15, ValueAnimator<A16> valueAnimator16, ValueAnimator<A17> valueAnimator17, ValueAnimator<A18> valueAnimator18, ValueAnimator<A19> valueAnimator19, ValueAnimator<A20> valueAnimator20, RecordValueAnimatorArgs.Arg20.Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, T> op, RecordValueAnimatorArgs.Arg20.Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, A20, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg20>(new RecordValueAnimatorArgs.Arg20(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14, valueAnimator15, valueAnimator16, valueAnimator17, valueAnimator18, valueAnimator19, valueAnimator20, op, up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg19<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, ValueAnimator<A14> valueAnimator14, ValueAnimator<A15> valueAnimator15, ValueAnimator<A16> valueAnimator16, ValueAnimator<A17> valueAnimator17, ValueAnimator<A18> valueAnimator18, ValueAnimator<A19> valueAnimator19, RecordValueAnimatorArgs.Arg19.Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, T> op, RecordValueAnimatorArgs.Arg19.Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, A19, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg19>(new RecordValueAnimatorArgs.Arg19(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14, valueAnimator15, valueAnimator16, valueAnimator17, valueAnimator18, valueAnimator19, op, up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg18<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, ValueAnimator<A14> valueAnimator14, ValueAnimator<A15> valueAnimator15, ValueAnimator<A16> valueAnimator16, ValueAnimator<A17> valueAnimator17, ValueAnimator<A18> valueAnimator18, RecordValueAnimatorArgs.Arg18.Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, T> op, RecordValueAnimatorArgs.Arg18.Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, A18, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg18>(new RecordValueAnimatorArgs.Arg18(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14, valueAnimator15, valueAnimator16, valueAnimator17, valueAnimator18, op, up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg17<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, ValueAnimator<A14> valueAnimator14, ValueAnimator<A15> valueAnimator15, ValueAnimator<A16> valueAnimator16, ValueAnimator<A17> valueAnimator17, RecordValueAnimatorArgs.Arg17.Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, T> op, RecordValueAnimatorArgs.Arg17.Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, A17, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg17>(new RecordValueAnimatorArgs.Arg17(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14, valueAnimator15, valueAnimator16, valueAnimator17, op, up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, T> RecordValueAnimator<T, RecordValueAnimatorArgs$Arg16<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, ValueAnimator<A10> valueAnimator10, ValueAnimator<A11> valueAnimator11, ValueAnimator<A12> valueAnimator12, ValueAnimator<A13> valueAnimator13, ValueAnimator<A14> valueAnimator14, ValueAnimator<A15> valueAnimator15, ValueAnimator<A16> valueAnimator16, RecordValueAnimatorArgs$Arg16$Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, T> recordValueAnimatorArgs$Arg16$Op, RecordValueAnimatorArgs$Arg16$Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, T> recordValueAnimatorArgs$Arg16$Up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs$Arg16<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, T>>(new RecordValueAnimatorArgs$Arg16<A1, A2, A3, A4, A5, A6, A7, A8, A9, A10, A11, A12, A13, A14, A15, A16, T>(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, valueAnimator10, valueAnimator11, valueAnimator12, valueAnimator13, valueAnimator14, valueAnimator15, valueAnimator16, recordValueAnimatorArgs$Arg16$Op, recordValueAnimatorArgs$Arg16$Up));
    }

    public static <A1, A2, A3, A4, A5, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg5<A1, A2, A3, A4, A5, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, RecordValueAnimatorArgs.Arg5.Op<A1, A2, A3, A4, A5, T> op, RecordValueAnimatorArgs.Arg5.Up<A1, A2, A3, A4, A5, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg5>(new RecordValueAnimatorArgs.Arg5(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, op, up));
    }

    public static <A1, A2, A3, A4, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg4<A1, A2, A3, A4, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, RecordValueAnimatorArgs.Arg4.Op<A1, A2, A3, A4, T> op, RecordValueAnimatorArgs.Arg4.Up<A1, A2, A3, A4, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg4>(new RecordValueAnimatorArgs.Arg4(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, op, up));
    }

    public static <A1, A2, A3, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg3<A1, A2, A3, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, RecordValueAnimatorArgs.Arg3.Op<A1, A2, A3, T> op, RecordValueAnimatorArgs.Arg3.Up<A1, A2, A3, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg3>(new RecordValueAnimatorArgs.Arg3(valueAnimator, valueAnimator2, valueAnimator3, op, up));
    }

    public static <A1, A2, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg2<A1, A2, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, RecordValueAnimatorArgs.Arg2.Op<A1, A2, T> op, RecordValueAnimatorArgs.Arg2.Up<A1, A2, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg2>(new RecordValueAnimatorArgs.Arg2(valueAnimator, valueAnimator2, op, up));
    }

    public static <A1, T> RecordValueAnimator<T, RecordValueAnimatorArgs$Arg1<A1, T>> of(ValueAnimator<A1> valueAnimator, RecordValueAnimatorArgs$Arg1$Op<A1, T> recordValueAnimatorArgs$Arg1$Op, RecordValueAnimatorArgs$Arg1$Up<A1, T> recordValueAnimatorArgs$Arg1$Up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs$Arg1<A1, T>>(new RecordValueAnimatorArgs$Arg1<A1, T>(valueAnimator, recordValueAnimatorArgs$Arg1$Op, recordValueAnimatorArgs$Arg1$Up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, A9, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg9<A1, A2, A3, A4, A5, A6, A7, A8, A9, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, ValueAnimator<A9> valueAnimator9, RecordValueAnimatorArgs.Arg9.Op<A1, A2, A3, A4, A5, A6, A7, A8, A9, T> op, RecordValueAnimatorArgs.Arg9.Up<A1, A2, A3, A4, A5, A6, A7, A8, A9, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg9>(new RecordValueAnimatorArgs.Arg9(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, valueAnimator9, op, up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, A8, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg8<A1, A2, A3, A4, A5, A6, A7, A8, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, ValueAnimator<A8> valueAnimator8, RecordValueAnimatorArgs.Arg8.Op<A1, A2, A3, A4, A5, A6, A7, A8, T> op, RecordValueAnimatorArgs.Arg8.Up<A1, A2, A3, A4, A5, A6, A7, A8, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg8>(new RecordValueAnimatorArgs.Arg8(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, valueAnimator8, op, up));
    }

    public static <A1, A2, A3, A4, A5, A6, A7, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg7<A1, A2, A3, A4, A5, A6, A7, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, ValueAnimator<A7> valueAnimator7, RecordValueAnimatorArgs.Arg7.Op<A1, A2, A3, A4, A5, A6, A7, T> op, RecordValueAnimatorArgs.Arg7.Up<A1, A2, A3, A4, A5, A6, A7, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg7>(new RecordValueAnimatorArgs.Arg7(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, valueAnimator7, op, up));
    }

    public static <A1, A2, A3, A4, A5, A6, T> RecordValueAnimator<T, RecordValueAnimatorArgs.Arg6<A1, A2, A3, A4, A5, A6, T>> of(ValueAnimator<A1> valueAnimator, ValueAnimator<A2> valueAnimator2, ValueAnimator<A3> valueAnimator3, ValueAnimator<A4> valueAnimator4, ValueAnimator<A5> valueAnimator5, ValueAnimator<A6> valueAnimator6, RecordValueAnimatorArgs.Arg6.Op<A1, A2, A3, A4, A5, A6, T> op, RecordValueAnimatorArgs.Arg6.Up<A1, A2, A3, A4, A5, A6, T> up) {
        return new RecordValueAnimator<T, RecordValueAnimatorArgs.Arg6>(new RecordValueAnimatorArgs.Arg6(valueAnimator, valueAnimator2, valueAnimator3, valueAnimator4, valueAnimator5, valueAnimator6, op, up));
    }

    public ValueAnimator<T> setTarget(T t) {
        return null;
    }

    public ValueAnimator<T> setTo(T t, long l) {
        this.arg.set(t, l);
        return this;
    }
}

