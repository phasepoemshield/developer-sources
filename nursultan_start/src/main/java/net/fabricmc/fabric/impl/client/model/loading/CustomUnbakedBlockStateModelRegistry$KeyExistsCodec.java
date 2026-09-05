/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.model.loading;

import com.mojang.datafixers.util.Either;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.stream.Stream;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
class CustomUnbakedBlockStateModelRegistry$KeyExistsCodec<E, N>
extends MapCodec<Either<E, N>> {
    private final String key;
    private final MapCodec<E> exists;
    private final MapCodec<N> notExists;

    CustomUnbakedBlockStateModelRegistry$KeyExistsCodec(String string, MapCodec<E> mapCodec, MapCodec<N> mapCodec2) {
        this.key = string;
        this.exists = mapCodec;
        this.notExists = mapCodec2;
    }

    public String toString() {
        return "KeyExistsCodec[" + this.key + " " + String.valueOf(this.exists) + " " + String.valueOf(this.notExists) + "]";
    }

    public <T> DataResult<Either<E, N>> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        if (mapLike.get(this.key) != null) {
            return this.exists.decode(dynamicOps, mapLike).map(Either::left);
        }
        return this.notExists.decode(dynamicOps, mapLike).map(Either::right);
    }

    public <T> RecordBuilder<T> encode(Either<E, N> either, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        return (RecordBuilder)either.map(object -> this.exists.encode(object, dynamicOps, recordBuilder), object -> this.notExists.encode(object, dynamicOps, recordBuilder));
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return Stream.concat(this.exists.keys(dynamicOps), this.notExists.keys(dynamicOps));
    }
}

