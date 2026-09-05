/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableMap$Builder
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.Lifecycle
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.codecs.BaseMapCodec
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.impl.dimension;

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
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public record FailSoftMapCodec<K, V>(Codec<K> keyCodec, Codec<V> elementCodec) implements Codec<Map<K, V>>,
BaseMapCodec<K, V>
{
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"FailSoftMapCodec");

    public String toString() {
        return "FailSoftMapCodec[" + String.valueOf(this.keyCodec) + " -> " + String.valueOf(this.elementCodec) + "]";
    }

    public <T> DataResult<Pair<Map<K, V>, T>> decode(DynamicOps<T> dynamicOps, T t) {
        return dynamicOps.getMap(t).setLifecycle(Lifecycle.stable()).flatMap(mapLike -> this.decode(dynamicOps, (MapLike)mapLike)).map(map -> Pair.of((Object)map, (Object)t));
    }

    public <T> DataResult<Map<K, V>> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        mapLike.entries().forEach(pair -> {
            try {
                DataResult dataResult = this.keyCodec().parse(dynamicOps, pair.getFirst());
                DataResult dataResult2 = this.elementCodec().parse(dynamicOps, pair.getSecond());
                Optional optional = dataResult.result();
                Optional optional2 = dataResult2.result();
                if (optional.isEmpty()) {
                    LOGGER.error("Failed to decode key {} from {}  {}", new Object[]{dataResult, pair, dataResult.resultOrPartial()});
                }
                if (optional2.isEmpty()) {
                    LOGGER.error("Failed to decode value {} from {}  {}", new Object[]{dataResult, pair, dataResult2.resultOrPartial()});
                }
                if (optional.isPresent() && optional2.isPresent()) {
                    builder.put(optional.get(), optional2.get());
                }
            }
            catch (Throwable throwable) {
                LOGGER.error("Decoding {}", pair, (Object)throwable);
            }
        });
        ImmutableMap immutableMap = builder.build();
        return DataResult.success((Object)immutableMap);
    }

    public <T> DataResult<T> encode(Map<K, V> map, DynamicOps<T> dynamicOps, T t) {
        return this.encode(map, dynamicOps, dynamicOps.mapBuilder()).build(t);
    }
}

