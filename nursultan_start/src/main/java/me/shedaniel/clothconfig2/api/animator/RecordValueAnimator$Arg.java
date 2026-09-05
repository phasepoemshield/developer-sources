/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ValueAnimator
 */
package me.shedaniel.clothconfig2.api.animator;

import java.util.List;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;

public interface RecordValueAnimator$Arg<T> {
    public List<ValueAnimator<?>> dependencies();

    public T value();

    public T target();

    public void set(T var1, long var2);

    public void setTarget(T var1);
}

