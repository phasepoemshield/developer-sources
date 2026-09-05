/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DataResult$Error
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.codecs.BaseMapCodec
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.Lifecycle;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.codecs.BaseMapCodec;
import java.util.Map;
import java.util.Optional;

public record class06330<K, V>(Codec<K> keyCodec, Codec<V> elementCodec) implements Codec<Map<K, V>>,
BaseMapCodec<K, V>
{
    public String toString() {
        return "StrictUnboundedMapCodec[" + String.valueOf(this.keyCodec) + " -> " + String.valueOf(this.elementCodec) + "]";
    }

    public <T> DataResult<Map<K, V>> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        for (Pair pair : mapLike.entries().toList()) {
            String string;
            DataResult dataResult;
            DataResult dataResult2 = this.keyCodec().parse(dynamicOps, pair.getFirst());
            DataResult dataResult3 = dataResult2.apply2stable(Pair::of, dataResult = this.elementCodec().parse(dynamicOps, pair.getSecond()));
            Optional optional = dataResult3.error();
            if (optional.isPresent()) {
                string = ((DataResult.Error)optional.get()).message();
                return DataResult.error(() -> {
                    if (dataResult2.result().isPresent()) {
                        return "Map entry '" + String.valueOf(dataResult2.result().get()) + "' : " + string;
                    }
                    return string;
                });
            }
            if (dataResult3.result().isPresent()) {
                string = (Pair)dataResult3.result().get();
                builder.put(string.getFirst(), string.getSecond());
                continue;
            }
            return DataResult.error(() -> "Empty or invalid map contents are not allowed");
        }
        ImmutableMap immutableMap = builder.build();
        return DataResult.success((Object)immutableMap);
    }

    public <T> DataResult<Pair<Map<K, V>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        return dynamicOps.getMap(t).setLifecycle(Lifecycle.stable()).flatMap(mapLike -> this.decode(dynamicOps, (Object)mapLike)).map(map -> Pair.of((Object)map, (Object)t));
    }

    public <T> DataResult<T> encode(Map<K, V> map, DynamicOps<T> dynamicOps, T t) {
        return this.encode(map, dynamicOps, dynamicOps.mapBuilder()).build(t);
    }
}

