/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 *  org.apache.commons.lang3.Validate
 */
package dev.isxander.yacl3.impl;

import dev.isxander.yacl3.api.Binding;
import org.apache.commons.lang3.Validate;

public class NotNullBinding<T>
implements Binding<T> {
    private final Binding<T> binding;

    public NotNullBinding(Binding<T> binding) {
        this.binding = binding;
    }

    public T getValue() {
        return (T)Validate.notNull((Object)this.binding.getValue(), (String)"Binding's value must not be null, please use Optionals if you want null behaviour.", (Object[])new Object[0]);
    }

    public T defaultValue() {
        return (T)Validate.notNull((Object)this.binding.defaultValue(), (String)"Binding's default value must not be null, please use Optionals if you want null behaviour.", (Object[])new Object[0]);
    }

    public void setValue(T t) {
        Validate.notNull(t, (String)"Binding's value must not be set to null, please use Optionals if you want null behaviour.", (Object[])new Object[0]);
        this.binding.setValue(t);
    }
}

