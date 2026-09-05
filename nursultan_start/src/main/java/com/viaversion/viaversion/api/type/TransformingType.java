/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.codec.Ops
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type;

import com.viaversion.viaversion.api.minecraft.codec.Ops;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;
import java.util.function.Function;

public class TransformingType<F, T>
extends Type<T> {
    private final Type<F> from;
    private final Function<F, T> mapFunction;
    private final Function<T, F> reverseFunction;

    protected TransformingType(Type<F> from, Class<T> outputClass, Function<F, T> mapFunction, Function<T, F> reverseFunction) {
        super(from.getTypeName(), outputClass);
        this.from = from;
        this.mapFunction = mapFunction;
        this.reverseFunction = reverseFunction;
    }

    public static <F, T> Type<T> of(Type<F> from, Class<T> outputClass, Function<F, T> mapFunction, Function<T, F> reverseFunction) {
        return new TransformingType<F, T>(from, outputClass, mapFunction, reverseFunction);
    }

    @Override
    public void write(ByteBuf buffer, T value) {
        this.from.write(buffer, this.reverseFunction.apply(value));
    }

    @Override
    public void write(Ops ops, T value) {
        this.from.write(ops, this.reverseFunction.apply(value));
    }

    @Override
    public T read(ByteBuf buffer) {
        return this.mapFunction.apply(this.from.read(buffer));
    }
}

