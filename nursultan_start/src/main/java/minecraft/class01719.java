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
import java.util.stream.Stream;

class class01719<T>
extends MapCodec<T> {
    private final String N;
    private final MapCodec<T> y;
    private final MapCodec<T> L;

    public class01719(String string, MapCodec<T> mapCodec, MapCodec<T> mapCodec2) {
        this.N = string;
        this.y = mapCodec;
        this.L = mapCodec2;
    }

    public <O> DataResult<T> decode(DynamicOps<O> dynamicOps, MapLike<O> mapLike) {
        if (mapLike.get(this.N) != null) {
            return this.y.decode(dynamicOps, mapLike);
        }
        return this.L.decode(dynamicOps, mapLike);
    }

    public <O> RecordBuilder<O> encode(T t, DynamicOps<O> dynamicOps, RecordBuilder<O> recordBuilder) {
        return this.L.encode(t, dynamicOps, recordBuilder);
    }

    public <T1> Stream<T1> keys(DynamicOps<T1> dynamicOps) {
        return Stream.concat(this.y.keys(dynamicOps), this.L.keys(dynamicOps)).distinct();
    }
}

