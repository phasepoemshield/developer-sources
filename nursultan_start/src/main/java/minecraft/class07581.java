/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06338;

public final class class07581<T>
extends Record {
    private final int ticks;
    private final T value;

    public class07581(int n, T t) {
        this.ticks = n;
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07581.class, "ticks;value", "ticks", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07581.class, "ticks;value", "ticks", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07581.class, "ticks;value", "ticks", "value"}, this);
    }

    public T y() {
        return this.value;
    }

    public int N() {
        return this.ticks;
    }

    public static <T> Codec<class07581<T>> N(Codec<T> codec) {
        return RecordCodecBuilder.create(instance -> instance.group((App)class06338.T.fieldOf("ticks").forGetter(class07581::N), (App)codec.fieldOf("value").forGetter(class07581::y)).apply((Applicative)instance, class07581::new));
    }
}

