/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.function.Function;
import java.util.stream.Stream;

class class06328<E>
extends MapCodec<E> {
    final /* synthetic */ Function N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    class06328(Function function) {
        this.N = function;
    }

    public String toString() {
        return "ContextRetrievalCodec[" + String.valueOf(this.N) + "]";
    }

    public <T> DataResult<E> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        return (DataResult)this.N.apply(dynamicOps);
    }

    public <T> RecordBuilder<T> encode(E e, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        return recordBuilder;
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return Stream.empty();
    }
}

