/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapDecoder
 *  com.mojang.serialization.MapEncoder
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
package minecraft;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapDecoder;
import com.mojang.serialization.MapEncoder;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;

class class01754<T>
extends MapCodec<T> {
    private final Collection<MapCodec<? extends T>> N;
    private final Function<T, ? extends MapEncoder<? extends T>> y;

    public class01754(Collection<MapCodec<? extends T>> collection, Function<T, ? extends MapEncoder<? extends T>> function) {
        this.N = collection;
        this.y = function;
    }

    public String toString() {
        return "FuzzyCodec[" + String.valueOf(this.N) + "]";
    }

    public <S> DataResult<T> decode(DynamicOps<S> dynamicOps, MapLike<S> mapLike) {
        Iterator<MapCodec<T>> iterator = this.N.iterator();
        while (iterator.hasNext()) {
            DataResult dataResult = ((MapDecoder)iterator.next()).decode(dynamicOps, mapLike);
            if (!dataResult.result().isPresent()) continue;
            return dataResult;
        }
        return DataResult.error(() -> "No matching codec found");
    }

    public <S> RecordBuilder<S> encode(T t, DynamicOps<S> dynamicOps, RecordBuilder<S> recordBuilder) {
        return this.y.apply(t).encode(t, dynamicOps, recordBuilder);
    }

    public <S> Stream<S> keys(DynamicOps<S> dynamicOps) {
        return this.N.stream().flatMap(mapCodec -> mapCodec.keys(dynamicOps)).distinct();
    }
}

