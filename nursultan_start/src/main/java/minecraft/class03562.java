/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.ImmutableList$Builder
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00780
 *  minecraft.class01835
 *  minecraft.class01894
 *  minecraft.class03221
 *  minecraft.class05946
 */
package minecraft;

import com.google.common.collect.ImmutableList;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00780;
import minecraft.class01835;
import minecraft.class01894;
import minecraft.class03221;
import minecraft.class03581;
import minecraft.class03586;
import minecraft.class03612;
import minecraft.class05946;

public final class class03562
extends Record {
    private final class01894 id;
    final class03581 provider;
    public static final class03562 y = new class03562(class01894.y((String)"nether"), new class03586());
    public static final class03562 L = new class03562(class01894.y((String)"overworld"), new class03612());
    static final Map<class01894, class03562> u = Stream.of(y, L).collect(Collectors.toMap(class03562::y, class035622 -> class035622));
    public static final Codec<class03562> i = class01894.N.flatXmap(class018942 -> Optional.ofNullable(u.get(class018942)).map(DataResult::success).orElseGet(() -> DataResult.error(() -> "Unknown preset: " + String.valueOf(class018942))), class035622 -> DataResult.success((Object)class035622.id));

    public class03581 L() {
        return this.provider;
    }

    public class03562(class01894 class018942, class03581 class035812) {
        this.id = class018942;
        this.provider = class035812;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03562.class, "id;provider", "id", "provider"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03562.class, "id;provider", "id", "provider"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03562.class, "id;provider", "id", "provider"}, this);
    }

    public class01894 y() {
        return this.id;
    }

    static <T> class03221<T> N(Function<class05946<class00780>, T> function) {
        ImmutableList.Builder builder = ImmutableList.builder();
        new class01835().N((T pair) -> builder.add((Object)pair.mapSecond(function)));
        return new class03221((List)builder.build());
    }

    public Stream<class05946<class00780>> N() {
        return this.provider.N(class059462 -> class059462).N().stream().map(Pair::getSecond).distinct();
    }
}

