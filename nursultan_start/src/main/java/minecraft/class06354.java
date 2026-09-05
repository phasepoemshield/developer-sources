/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Stream;

class class06354<V>
extends MapCodec<V> {
    final /* synthetic */ String N;
    final /* synthetic */ String y;
    final /* synthetic */ Codec L;
    final /* synthetic */ Function u;
    final /* synthetic */ Function i;

    class06354(String string, String string2, Codec codec, Function function, Function function2) {
        this.N = string;
        this.y = string2;
        this.L = codec;
        this.u = function;
        this.i = function2;
    }

    public <T> DataResult<V> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        Object object = mapLike.get(this.N);
        if (object == null) {
            return DataResult.error(() -> "Missing \"" + this.N + "\" in: " + String.valueOf(mapLike));
        }
        return this.L.decode(dynamicOps, object).flatMap(pair -> {
            Object object = Objects.requireNonNullElseGet(mapLike.get(this.y), () -> ((DynamicOps)dynamicOps).emptyMap());
            return ((Codec)this.u.apply(pair.getFirst())).decode(dynamicOps, object).map(Pair::getFirst);
        });
    }

    public <T> RecordBuilder<T> encode(V v, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        Object r = this.i.apply(v);
        recordBuilder.add(this.N, this.L.encodeStart(dynamicOps, r));
        DataResult<T> dataResult = this.N((Codec)this.u.apply(r), v, dynamicOps);
        if (dataResult.result().isEmpty() || !Objects.equals(dataResult.result().get(), dynamicOps.emptyMap())) {
            recordBuilder.add(this.y, dataResult);
        }
        return recordBuilder;
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return Stream.of(dynamicOps.createString(this.N), dynamicOps.createString(this.y));
    }

    private <T, V2 extends V> DataResult<T> N(Codec<V2> codec, V v, DynamicOps<T> dynamicOps) {
        return codec.encodeStart(dynamicOps, v);
    }
}

