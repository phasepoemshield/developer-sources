/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.HashMultiset
 *  com.google.common.collect.Multiset
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class08938
 *  minecraft.class08940
 */
package minecraft;

import com.google.common.collect.HashMultiset;
import com.google.common.collect.Multiset;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import minecraft.class00372;
import minecraft.class08938;
import minecraft.class08940;

public final class class00336<P extends class00372<T>, T>
extends Record {
    private final MapCodec<class08938<P, T>> switchCodec;

    public class00336(MapCodec<class08938<P, T>> mapCodec) {
        this.switchCodec = mapCodec;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00336.class, "switchCodec", "switchCodec"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00336.class, "switchCodec", "switchCodec"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00336.class, "switchCodec", "switchCodec"}, this);
    }

    private static /* synthetic */ String N(Multiset multiset) {
        return "Duplicate case conditions: " + multiset.entrySet().stream().filter(entry -> entry.getCount() > 1).map(entry -> entry.getElement().toString()).collect(Collectors.joining(", "));
    }

    public static <T> MapCodec<List<class08940<T>>> N(Codec<T> codec) {
        return class08940.N(codec).listOf().validate(class00336::N).fieldOf("cases");
    }

    private static <T> DataResult<List<class08940<T>>> N(List<class08940<T>> list) {
        if (list.isEmpty()) {
            return DataResult.error(() -> "Empty case list");
        }
        HashMultiset hashMultiset = HashMultiset.create();
        for (class08940<T> class089402 : list) {
            hashMultiset.addAll((Collection)class089402.N());
        }
        if (hashMultiset.size() != hashMultiset.entrySet().size()) {
            return DataResult.error(() -> class00336.N((Multiset)hashMultiset));
        }
        return DataResult.success(list);
    }

    public static <P extends class00372<T>, T> class00336<P, T> N(MapCodec<P> mapCodec, Codec<T> codec) {
        MapCodec mapCodec2 = RecordCodecBuilder.mapCodec(instance -> instance.group((App)mapCodec.forGetter(class08938::N), (App)class00336.N(codec).forGetter(class08938::y)).apply((Applicative)instance, class08938::new));
        return new class00336<P, T>(mapCodec2);
    }

    public MapCodec<class08938<P, T>> N() {
        return this.switchCodec;
    }
}

