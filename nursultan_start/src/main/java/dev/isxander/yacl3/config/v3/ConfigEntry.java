/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  dev.isxander.yacl3.api.Binding
 */
package dev.isxander.yacl3.config.v3;

import dev.isxander.yacl3.api.Binding;
import dev.isxander.yacl3.config.v3.ReadonlyConfigEntry;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public interface ConfigEntry<T>
extends ReadonlyConfigEntry<T> {
    public void set(T var1);

    public T defaultValue();

    @Override
    public ConfigEntry<T> modifyGet(UnaryOperator<T> var1);

    public ConfigEntry<T> modifySet(UnaryOperator<T> var1);

    @Override
    default public ConfigEntry<T> onGet(Consumer<T> consumer) {
        return this.modifyGet(object -> {
            consumer.accept(object);
            return object;
        });
    }

    default public Binding<T> asBinding() {
        return Binding.generic(this.defaultValue(), this::get, this::set);
    }

    default public ConfigEntry<T> onSet(Consumer<T> consumer) {
        return this.modifySet(object -> {
            consumer.accept(object);
            return object;
        });
    }
}

