/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Comparators
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  com.mojang.serialization.codecs.RecordCodecBuilder$Instance
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00610
 *  minecraft.class07581
 */
package minecraft;

import com.google.common.collect.Comparators;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import minecraft.class00610;
import minecraft.class07581;
import minecraft.class07586;
import minecraft.class07592;

public final class class07606<T>
extends Record {
    private final List<class07581<T>> keyframes;
    private final class07586 easingType;

    public class07606(List<class07581<T>> list, class07586 class075862) {
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Track has no keyframes");
        }
        this.keyframes = list;
        this.easingType = class075862;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07606.class, "keyframes;easingType", "keyframes", "easingType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07606.class, "keyframes;easingType", "keyframes", "easingType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07606.class, "keyframes;easingType", "keyframes", "easingType"}, this);
    }

    public class07586 y() {
        return this.easingType;
    }

    public static <T> MapCodec<class07606<T>> N(Codec<T> codec) {
        return RecordCodecBuilder.mapCodec(arg_0 -> class07606.N(class07581.N(codec).listOf().validate(class07606::N), arg_0));
    }

    private static /* synthetic */ App N(Codec codec, RecordCodecBuilder.Instance instance) {
        return instance.group((App)codec.fieldOf("keyframes").forGetter(class07606::N), (App)class07586.y.optionalFieldOf("ease", (Object)class07586.u).forGetter(class07606::y)).apply((Applicative)instance, class07606::new);
    }

    public class07592<T> N(Optional<Integer> optional, class00610<T> class006102) {
        return new class07592<T>(this, optional, class006102);
    }

    static <T> DataResult<List<class07581<T>>> N(List<class07581<T>> list) {
        if (list.isEmpty()) {
            return DataResult.error(() -> "Keyframes must not be empty");
        }
        if (!Comparators.isInOrder(list, Comparator.comparingInt(class07581::N))) {
            return DataResult.error(() -> "Keyframes must be ordered by ticks field");
        }
        if (list.size() > 1) {
            int n = 0;
            int n2 = ((class07581)list.getLast()).N();
            for (class07581 class075812 : list) {
                if (class075812.N() == n2) {
                    if (++n > 2) {
                        return DataResult.error(() -> "More than 2 keyframes on same tick: " + class075812.N());
                    }
                } else {
                    n = 0;
                }
                n2 = class075812.N();
            }
        }
        return DataResult.success(list);
    }

    public List<class07581<T>> N() {
        return this.keyframes;
    }

    public static DataResult<class07606<?>> N(class07606<?> class076062, int n) {
        for (class07581<?> class075812 : class076062.N()) {
            int n2 = class075812.N();
            if (n2 >= 0 && n2 <= n) continue;
            return DataResult.error(() -> "Keyframe at tick " + class075812.N() + " must be in range [0; " + n + "]");
        }
        return DataResult.success(class076062);
    }
}

