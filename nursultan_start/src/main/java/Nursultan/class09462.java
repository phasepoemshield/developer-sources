/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10536
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.DynamicOps
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.MapLike
 *  com.mojang.serialization.RecordBuilder
 *  minecraft.class01289
 *  minecraft.class04206
 *  minecraft.class05378
 *  org.apache.commons.lang3.mutable.MutableObject
 *  org.slf4j.Logger
 */
package Nursultan;

import Nursultan.class10536;
import com.google.common.collect.ImmutableList;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.DynamicOps;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.MapLike;
import com.mojang.serialization.RecordBuilder;
import java.util.Collection;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;
import minecraft.class01289;
import minecraft.class04206;
import minecraft.class05378;
import org.apache.commons.lang3.mutable.MutableObject;
import org.slf4j.Logger;

public class class09462<E>
extends MapCodec<class01289<E>> {
    final /* synthetic */ Collection N;
    final /* synthetic */ Collection y;
    final /* synthetic */ MutableObject L;

    public class09462(Collection collection, Collection collection2, MutableObject mutableObject) {
        this.N = collection;
        this.y = collection2;
        this.L = mutableObject;
    }

    public <T> DataResult<class01289<E>> decode(DynamicOps<T> dynamicOps, MapLike<T> mapLike) {
        MutableObject mutableObject = new MutableObject((Object)DataResult.success((Object)ImmutableList.builder()));
        mapLike.entries().forEach(pair -> {
            DataResult dataResult = class04206.k.T().parse(dynamicOps, pair.getFirst()).flatMap(class053782 -> this.N((class05378)class053782, dynamicOps, (Object)pair.getSecond()));
            mutableObject.setValue((Object)((DataResult)mutableObject.get()).apply2(ImmutableList.Builder::add, dataResult));
        });
        ImmutableList immutableList = ((DataResult)mutableObject.get()).resultOrPartial(arg_0 -> ((Logger)class01289.N).error(arg_0)).map(ImmutableList.Builder::build).orElseGet(ImmutableList::of);
        return DataResult.success((Object)new class01289(this.N, this.y, immutableList, (Supplier)this.L));
    }

    public <T> Stream<T> keys(DynamicOps<T> dynamicOps) {
        return this.N.stream().flatMap(class053782 -> class053782.N().map(codec -> class04206.k.y(class053782)).stream()).map(class018942 -> dynamicOps.createString(class018942.toString()));
    }

    private <T, U> DataResult<class10536<U>> N(class05378<U> class053782, DynamicOps<T> dynamicOps, T t) {
        return class053782.N().map(DataResult::success).orElseGet(() -> DataResult.error(() -> "No codec for memory: " + String.valueOf(class053782))).flatMap(codec -> codec.parse(dynamicOps, t)).map(class014912 -> new class10536(class053782, Optional.of(class014912)));
    }

    public <T> RecordBuilder<T> encode(class01289<E> class012892, DynamicOps<T> dynamicOps, RecordBuilder<T> recordBuilder) {
        class012892.N().forEach(class105362 -> class105362.N(dynamicOps, recordBuilder));
        return recordBuilder;
    }
}

