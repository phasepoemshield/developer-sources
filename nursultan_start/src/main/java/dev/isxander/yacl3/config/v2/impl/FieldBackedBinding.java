/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 */
package dev.isxander.yacl3.config.v2.impl;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.config.v2.api.FieldAccess;
import dev.isxander.yacl3.config.v2.api.ReadOnlyFieldAccess;

public record FieldBackedBinding<T>(FieldAccess<T> field, ReadOnlyFieldAccess<T> defaultField) implements Binding<T>
{
    public T getValue() {
        return this.field.get();
    }

    public T defaultValue() {
        return this.defaultField.get();
    }

    public void setValue(T t) {
        this.field.set(t);
    }
}

