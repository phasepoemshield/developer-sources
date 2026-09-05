/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.RecordBuilder
 */
package dev.isxander.yacl3.config.v3;

import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.RecordBuilder;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public interface ReadonlyConfigEntry<T> {
    public T get();

    public <R> boolean decode(R var1, DynamicOps<R> var2);

    public <R> RecordBuilder<R> encode(DynamicOps<R> var1, RecordBuilder<R> var2);

    public String fieldName();

    public ReadonlyConfigEntry<T> modifyGet(UnaryOperator<T> var1);

    default public ReadonlyConfigEntry<T> onGet(Consumer<T> consumer) {
        return this.modifyGet(object -> {
            consumer.accept(object);
            return object;
        });
    }
}

