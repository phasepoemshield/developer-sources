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
import java.util.stream.Stream;

class SpecialCodecs$2
extends MapCodec<Boolean> {
    final /* synthetic */ String val$key;

    SpecialCodecs$2(String string) {
        this.val$key = string;
    }

    public <T> DataResult<Boolean> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        return DataResult.success((Object)(mapLike.get(this.val$key) != null ? 1 : 0));
    }

    public <T> RecordBuilder<T> encode(Boolean bl, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        return recordBuilder;
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return Stream.empty();
    }
}

