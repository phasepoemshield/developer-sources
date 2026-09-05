/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06338
 *  minecraft.class07529
 *  minecraft.class07536
 *  org.slf4j.Logger
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Function;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class06338;
import minecraft.class07529;
import minecraft.class07536;
import org.slf4j.Logger;

public final class class04523<T>
extends Record {
    private final T value;
    private final int weight;
    private static final Logger L = LogUtils.getLogger();

    public class04523(T t, int n) {
        if (n < 0) {
            throw (IllegalArgumentException)class07536.y((Throwable)new IllegalArgumentException("Weight should be >= 0"));
        }
        if (n == 0 && class07529.ND) {
            L.warn("Found 0 weight, make sure this is intentional!");
        }
        this.value = t;
        this.weight = n;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04523.class, "value;weight", "value", "weight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04523.class, "value;weight", "value", "weight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04523.class, "value;weight", "value", "weight"}, this);
    }

    public int y() {
        return this.weight;
    }

    public T N() {
        return this.value;
    }

    public static <E> Codec<class04523<E>> N(MapCodec<E> mapCodec) {
        return RecordCodecBuilder.create(instance -> instance.group((App)mapCodec.forGetter(class04523::N), (App)class06338.T.fieldOf("weight").forGetter(class04523::y)).apply((Applicative)instance, class04523::new));
    }

    public static <B extends ByteBuf, T> class02362<B, class04523<T>> N(class02362<B, T> class023622) {
        return class02362.N(class023622, class04523::N, (class02362)class02389.B, class04523::y, class04523::new);
    }

    public static <E> Codec<class04523<E>> N(Codec<E> codec) {
        return class04523.N(codec.fieldOf("data"));
    }

    public <U> class04523<U> N(Function<T, U> function) {
        return new class04523<U>(function.apply(this.N()), this.weight);
    }
}

