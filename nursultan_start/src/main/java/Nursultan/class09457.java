/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Encoder
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.RecordBuilder
 *  minecraft.class01278
 */
package Nursultan;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Encoder;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.RecordBuilder;
import java.util.function.UnaryOperator;
import minecraft.class01278;

public class class09457<T>
implements RecordBuilder<T> {
    private final RecordBuilder<T> y;
    final /* synthetic */ class01278 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09457(class01278 class012782, RecordBuilder recordBuilder) {
        this.N = class012782;
        this.y = recordBuilder;
    }

    public RecordBuilder<T> add(DataResult<T> dataResult, DataResult<T> dataResult2) {
        this.y.add(dataResult, dataResult2);
        return this;
    }

    public RecordBuilder<T> add(String string, T t) {
        this.y.add(string, t);
        return this;
    }

    public RecordBuilder<T> add(String string, DataResult<T> dataResult) {
        this.y.add(string, dataResult);
        return this;
    }

    public <E> RecordBuilder<T> add(String string, E e, Encoder<E> encoder) {
        return this.y.add(string, encoder.encodeStart(this.ops(), e));
    }

    public RecordBuilder<T> add(T t, DataResult<T> dataResult) {
        this.y.add(t, dataResult);
        return this;
    }

    public RecordBuilder<T> add(T t, T t2) {
        this.y.add(t, t2);
        return this;
    }

    public DataResult<T> build(DataResult<T> dataResult) {
        return this.y.build(dataResult);
    }

    public DataResult<T> build(T t) {
        return this.y.build(t);
    }

    public DynamicOps<T> ops() {
        return this.N;
    }

    public RecordBuilder<T> withErrorsFrom(DataResult<?> dataResult) {
        this.y.withErrorsFrom(dataResult);
        return this;
    }

    public RecordBuilder<T> setLifecycle(Lifecycle lifecycle) {
        this.y.setLifecycle(lifecycle);
        return this;
    }

    public RecordBuilder<T> mapError(UnaryOperator<String> unaryOperator) {
        this.y.mapError(unaryOperator);
        return this;
    }
}

