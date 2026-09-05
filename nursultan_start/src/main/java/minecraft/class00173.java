/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.ListBuilder
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.ListBuilder;
import java.util.function.UnaryOperator;

abstract class class00173<T, B>
implements ListBuilder<T> {
    private final DynamicOps<T> y;
    protected DataResult<B> N = DataResult.success(this.N(), (Lifecycle)Lifecycle.stable());

    protected class00173(DynamicOps<T> dynamicOps) {
        this.y = dynamicOps;
    }

    public ListBuilder<T> add(DataResult<T> dataResult) {
        this.N = this.N.apply2stable(this::N, dataResult);
        return this;
    }

    public ListBuilder<T> add(T t) {
        this.N = this.N.map(object2 -> this.N(object2, t));
        return this;
    }

    protected abstract DataResult<T> y(B var1, T var2);

    public DataResult<T> build(T t) {
        DataResult dataResult = this.N.flatMap(object2 -> this.y(object2, t));
        this.N = DataResult.success(this.N(), (Lifecycle)Lifecycle.stable());
        return dataResult;
    }

    protected abstract B N(B var1, T var2);

    protected abstract B N();

    public DynamicOps<T> ops() {
        return this.y;
    }

    public ListBuilder<T> withErrorsFrom(DataResult<?> dataResult) {
        this.N = this.N.flatMap(object -> dataResult.map(object2 -> object));
        return this;
    }

    public ListBuilder<T> mapError(UnaryOperator<String> unaryOperator) {
        this.N = this.N.mapError(unaryOperator);
        return this;
    }
}

