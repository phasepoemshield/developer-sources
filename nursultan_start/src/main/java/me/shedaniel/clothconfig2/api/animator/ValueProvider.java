/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.animator.ConstantValueProvider
 */
package me.shedaniel.clothconfig2.api.animator;

import me.shedaniel.clothconfig2.api.animator.ConstantValueProvider;

public interface ValueProvider<T> {
    public T value();

    public T target();

    public void update(double var1);

    public static <T> ValueProvider<T> constant(T t) {
        return new ConstantValueProvider(t);
    }

    public void completeImmediately();
}

