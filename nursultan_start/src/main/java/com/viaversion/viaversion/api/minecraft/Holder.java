/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.IdHolder
 *  com.viaversion.viaversion.api.minecraft.ValueHolder
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction
 */
package com.viaversion.viaversion.api.minecraft;

import com.viaversion.viaversion.api.minecraft.IdHolder;
import com.viaversion.viaversion.api.minecraft.ValueHolder;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntFunction;
import java.util.function.Function;
import java.util.function.Supplier;

public interface Holder<T> {
    public boolean hasId();

    public Holder<T> updateId(Int2IntFunction var1, Supplier<Holder<T>> var2);

    default public Holder<T> updateId(Int2IntFunction rewriteFunction) {
        return this.updateId(rewriteFunction, null);
    }

    public T value();

    public static <T> Holder<T> of(int id) {
        return new IdHolder(id);
    }

    public static <T> Holder<T> of(T value) {
        return new ValueHolder(value);
    }

    public boolean isDirect();

    public int id();

    public Holder<T> updateValue(Function<T, T> var1);
}

