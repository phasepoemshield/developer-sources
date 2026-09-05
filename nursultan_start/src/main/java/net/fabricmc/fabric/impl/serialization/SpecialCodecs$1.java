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
package net.fabricmc.fabric.impl.serialization;

import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.stream.Stream;

class SpecialCodecs$1
extends MapCodec<Collection<String>> {
    SpecialCodecs$1() {
    }

    public <T> DataResult<Collection<String>> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        return DataResult.success((Object)mapLike.entries().map(pair -> (String)dynamicOps.getStringValue(pair.getFirst()).getOrThrow()).toList());
    }

    public <T> RecordBuilder<T> encode(Collection<String> collection, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        return recordBuilder;
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return Stream.empty();
    }
}

