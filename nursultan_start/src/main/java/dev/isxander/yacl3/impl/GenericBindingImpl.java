/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Binding;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class GenericBindingImpl<T>
implements Binding<T> {
    private final T def;
    private final Supplier<T> getter;
    private final Consumer<T> setter;

    public GenericBindingImpl(T t, Supplier<T> supplier, Consumer<T> consumer) {
        this.def = t;
        this.getter = supplier;
        this.setter = consumer;
    }

    public T getValue() {
        return this.getter.get();
    }

    public T defaultValue() {
        return this.def;
    }

    public void setValue(T t) {
        this.setter.accept(t);
    }
}

