/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.config.v3;

import dev.isxander.yacl3.config.v3.ReadonlyConfigEntry;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public abstract class AbstractReadonlyConfigEntry<T>
implements ReadonlyConfigEntry<T> {
    private final String fieldName;
    private Function<T, T> getModifier;

    public AbstractReadonlyConfigEntry(String string) {
        this.fieldName = string;
        this.getModifier = UnaryOperator.identity();
    }

    @Override
    public T get() {
        return this.getModifier.apply(this.innerGet());
    }

    @Override
    public String fieldName() {
        return this.fieldName;
    }

    @Override
    public ReadonlyConfigEntry<T> modifyGet(UnaryOperator<T> unaryOperator) {
        this.getModifier = this.getModifier.andThen(unaryOperator);
        return this;
    }

    protected abstract T innerGet();
}

