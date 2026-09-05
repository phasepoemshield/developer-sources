/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00836
 *  minecraft.class01205
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04907
 *  minecraft.class04922
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;
import minecraft.class00836;
import minecraft.class01205;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04907;
import minecraft.class04922;

final class class01419<T>
extends Record {
    private final class04922<T> type;
    private final class03556<T> value;
    private final class00836 range;
    private final Supplier<class04907<T>> stat;
    public static final Codec<class01419<?>> N = class04206.G.T().dispatch(class01419::N, class01419::N);

    public class00836 L() {
        return this.range;
    }

    public class01419(class04922<T> class049222, class03556<T> class035562, class00836 class008362) {
        this(class049222, class035562, class008362, (Supplier<class04907<T>>)Suppliers.memoize(() -> class049222.y(class035562.N())));
    }

    private class01419(class04922<T> class049222, class03556<T> class035562, class00836 class008362, Supplier<class04907<T>> supplier) {
        this.type = class049222;
        this.value = class035562;
        this.range = class008362;
        this.stat = supplier;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01419.class, "type;value;range;stat", "type", "value", "range", "stat"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01419.class, "type;value;range;stat", "type", "value", "range", "stat"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01419.class, "type;value;range;stat", "type", "value", "range", "stat"}, this);
    }

    public Supplier<class04907<T>> u() {
        return this.stat;
    }

    public class03556<T> y() {
        return this.value;
    }

    public class04922<T> N() {
        return this.type;
    }

    private static <T> MapCodec<class01419<T>> N(class04922<T> class049222) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)class049222.y().b().fieldOf("stat").forGetter(class01419::y), (App)class00836.u.optionalFieldOf("value", (Object)class00836.L).forGetter(class01419::L)).apply((Applicative)instance, (class035562, class008362) -> new class01419(class049222, class035562, (class00836)class008362)));
    }

    public boolean N(class01205 class012052) {
        return this.range.u(class012052.N(this.stat.get()));
    }
}

