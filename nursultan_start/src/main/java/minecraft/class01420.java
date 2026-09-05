/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  io.netty.buffer.ByteBuf
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00522
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class08092
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00522;
import minecraft.class01426;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class08092;

final class class01420
extends Record
implements class01426 {
    private final Optional<String> minValue;
    private final Optional<String> maxValue;
    public static final Codec<class01420> N = RecordCodecBuilder.create(instance -> instance.group((App)Codec.STRING.optionalFieldOf("min").forGetter(class01420::N), (App)Codec.STRING.optionalFieldOf("max").forGetter(class01420::y)).apply(instance, class01420::new));
    public static final class02362<ByteBuf, class01420> y = class02362.N((class02362)class02389.N((class02362)class02389.s), class01420::N, (class02362)class02389.N((class02362)class02389.s), class01420::y, class01420::new);

    private class01420(Optional<String> optional, Optional<String> optional2) {
        this.minValue = optional;
        this.maxValue = optional2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01420.class, "minValue;maxValue", "minValue", "maxValue"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01420.class, "minValue;maxValue", "minValue", "maxValue"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01420.class, "minValue;maxValue", "minValue", "maxValue"}, this);
    }

    public Optional<String> y() {
        return this.maxValue;
    }

    public Optional<String> N() {
        return this.minValue;
    }

    @Override
    public <T extends Comparable<T>> boolean N(class00522<?, ?> class005222, class08092<T> class080922) {
        Optional optional;
        Comparable comparable = class005222.L(class080922);
        if (this.minValue.isPresent() && ((optional = class080922.y(this.minValue.get())).isEmpty() || comparable.compareTo((Comparable)optional.get()) < 0)) {
            return false;
        }
        return !this.maxValue.isPresent() || !(optional = class080922.y(this.maxValue.get())).isEmpty() && comparable.compareTo((Comparable)optional.get()) <= 0;
    }
}

