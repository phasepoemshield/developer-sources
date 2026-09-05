/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec$ResultFunction
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import java.util.function.Function;

class class06356<E>
implements Codec.ResultFunction<E> {
    final /* synthetic */ Function N;
    final /* synthetic */ Function y;

    class06356(Function function, Function function2) {
        this.N = function;
        this.y = function2;
    }

    public String toString() {
        return "WithLifecycle[" + String.valueOf(this.N) + " " + String.valueOf(this.y) + "]";
    }

    public <T> DataResult<Pair<E, T>> apply(DynamicOps<T> dynamicOps, T t, DataResult<Pair<E, T>> dataResult) {
        return dataResult.result().map(pair -> dataResult.setLifecycle((Lifecycle)this.N.apply(pair.getFirst()))).orElse(dataResult);
    }

    public <T> DataResult<T> coApply(DynamicOps<T> dynamicOps, E e, DataResult<T> dataResult) {
        return dataResult.setLifecycle((Lifecycle)this.y.apply(e));
    }
}

