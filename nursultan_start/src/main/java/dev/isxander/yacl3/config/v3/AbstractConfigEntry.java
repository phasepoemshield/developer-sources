/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v3;

import dev.isxander.yacl3.config.v3.AbstractReadonlyConfigEntry;
import dev.isxander.yacl3.config.v3.ConfigEntry;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public abstract class AbstractConfigEntry<T>
extends AbstractReadonlyConfigEntry<T>
implements ConfigEntry<T> {
    private T value;
    private final T defaultValue;
    private Function<T, T> setModifier;

    public AbstractConfigEntry(String string, T t) {
        super(string);
        this.value = t;
        this.defaultValue = t;
        this.setModifier = UnaryOperator.identity();
    }

    @Override
    public void set(T t) {
        this.value = this.setModifier.apply(t);
    }

    @Override
    public T defaultValue() {
        return this.defaultValue;
    }

    @Override
    public ConfigEntry<T> modifyGet(UnaryOperator<T> unaryOperator) {
        super.modifyGet(unaryOperator);
        return this;
    }

    @Override
    public ConfigEntry<T> modifySet(UnaryOperator<T> unaryOperator) {
        this.setModifier = this.setModifier.andThen(unaryOperator);
        return this;
    }

    @Override
    protected T innerGet() {
        return this.value;
    }
}

