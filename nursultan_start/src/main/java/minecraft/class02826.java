/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class06068
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Function;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class06068;

public final class class02826<T>
extends Record {
    private final T raw;
    private final Optional<T> filtered;

    public class02826(T t, Optional<T> optional) {
        this.raw = t;
        this.filtered = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02826.class, "raw;filtered", "raw", "filtered"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02826.class, "raw;filtered", "raw", "filtered"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02826.class, "raw;filtered", "raw", "filtered"}, this);
    }

    public Optional<T> y() {
        return this.filtered;
    }

    public <U> Optional<class02826<U>> y(Function<T, Optional<U>> function) {
        Optional<U> optional = function.apply(this.raw);
        if (optional.isEmpty()) {
            return Optional.empty();
        }
        if (this.filtered.isPresent()) {
            Optional<U> optional2 = function.apply(this.filtered.get());
            if (optional2.isEmpty()) {
                return Optional.empty();
            }
            return Optional.of(new class02826<U>(optional.get(), optional2));
        }
        return Optional.of(new class02826<U>(optional.get(), Optional.empty()));
    }

    public static <B extends ByteBuf, T> class02362<B, class02826<T>> N(class02362<B, T> class023622) {
        return class02362.N(class023622, class02826::N, (class02362)class023622.N_33(class02389::N), class02826::y, class02826::new);
    }

    public T N() {
        return this.raw;
    }

    public static <T> Codec<class02826<T>> N(Codec<T> codec) {
        Codec codec2 = RecordCodecBuilder.create(instance -> instance.group((App)codec.fieldOf("raw").forGetter(class02826::N), (App)codec.optionalFieldOf("filtered").forGetter(class02826::y)).apply((Applicative)instance, class02826::new));
        Codec codec3 = codec.xmap(class02826::N, class02826::N);
        return Codec.withAlternative((Codec)codec2, (Codec)codec3);
    }

    public <U> class02826<U> N(Function<T, U> function) {
        return new class02826<U>(function.apply(this.raw), this.filtered.map(function));
    }

    public T N(boolean bl) {
        if (bl) {
            return this.filtered.orElse(this.raw);
        }
        return this.raw;
    }

    public static class02826<String> N(class06068 class060682) {
        return new class02826<String>(class060682.u(), class060682.L() ? Optional.of(class060682.y()) : Optional.empty());
    }

    public static <T> class02826<T> N(T t) {
        return new class02826<T>(t, Optional.empty());
    }
}

