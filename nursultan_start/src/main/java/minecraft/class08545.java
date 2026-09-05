/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class06953
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06953;

public final class class08545<T>
extends Record {
    private final T model;
    private final class06953 asset;

    public class08545(T t, class01894 class018942) {
        this(t, new class06953(class018942));
    }

    public class08545(T t, class06953 class069532) {
        this.model = t;
        this.asset = class069532;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08545.class, "model;asset", "model", "asset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08545.class, "model;asset", "model", "asset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08545.class, "model;asset", "model", "asset"}, this);
    }

    public class06953 y() {
        return this.asset;
    }

    public T N() {
        return this.model;
    }

    public static <T> MapCodec<class08545<T>> N(Codec<T> codec, T t) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)codec.optionalFieldOf("model", t).forGetter(class08545::N), (App)class06953.y.forGetter(class08545::y)).apply((Applicative)instance, class08545::new));
    }

    public static <T> class02362<class04247, class08545<T>> N(class02362<? super class04247, T> class023622) {
        return class02362.N(class023622, class08545::N, (class02362)class06953.L, class08545::y, class08545::new);
    }
}

