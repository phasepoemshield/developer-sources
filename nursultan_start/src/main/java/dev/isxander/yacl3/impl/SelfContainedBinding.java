/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Binding;

public class SelfContainedBinding<T>
implements Binding<T> {
    private T value;
    private final T defaultValue;

    public SelfContainedBinding(T t, T t2) {
        this.value = t;
        this.defaultValue = t2;
    }

    public SelfContainedBinding(T t) {
        this(t, t);
    }

    public T getValue() {
        return this.value;
    }

    public T defaultValue() {
        return this.defaultValue;
    }

    public void setValue(T t) {
        this.value = t;
    }
}

