/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.ListBuilder
 *  minecraft.class01278
 */
package Nursultan;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.ListBuilder;
import java.util.function.UnaryOperator;
import minecraft.class01278;

public class class09455<T>
implements ListBuilder<T> {
    private final ListBuilder<T> y;
    final /* synthetic */ class01278 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09455(class01278 class012782, ListBuilder listBuilder) {
        this.N = class012782;
        this.y = listBuilder;
    }

    public ListBuilder<T> add(T t) {
        this.y.add(t);
        return this;
    }

    public ListBuilder<T> add(DataResult<T> dataResult) {
        this.y.add(dataResult);
        return this;
    }

    public <E> ListBuilder<T> add(E e, Encoder<E> encoder) {
        this.y.add(encoder.encodeStart(this.ops(), e));
        return this;
    }

    public <E> ListBuilder<T> addAll(Iterable<E> iterable, Encoder<E> encoder) {
        iterable.forEach(object -> this.y.add(encoder.encode(object, this.ops(), this.ops().empty())));
        return this;
    }

    public DataResult<T> build(T t) {
        return this.y.build(t);
    }

    public DataResult<T> build(DataResult<T> dataResult) {
        return this.y.build(dataResult);
    }

    public DynamicOps<T> ops() {
        return this.N;
    }

    public ListBuilder<T> withErrorsFrom(DataResult<?> dataResult) {
        this.y.withErrorsFrom(dataResult);
        return this;
    }

    public ListBuilder<T> mapError(UnaryOperator<String> unaryOperator) {
        this.y.mapError(unaryOperator);
        return this;
    }
}

