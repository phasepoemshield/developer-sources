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
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class02489;

public final class class02501<T>
extends Record {
    private final List<T> value;
    private final class02489 operation;

    public class02501(List<T> list, class02489 class024892) {
        this.value = list;
        this.operation = class024892;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02501.class, "value;operation", "value", "operation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02501.class, "value;operation", "value", "operation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02501.class, "value;operation", "value", "operation"}, this);
    }

    public class02489 y() {
        return this.operation;
    }

    public List<T> N(List<T> list) {
        return this.operation.N(list, this.value);
    }

    public List<T> N() {
        return this.value;
    }

    public static <T> Codec<class02501<T>> N(Codec<T> codec, int n) {
        return RecordCodecBuilder.create(instance -> instance.group((App)codec.sizeLimitedListOf(n).fieldOf("values").forGetter(class025012 -> class025012.value), (App)class02489.N(n).forGetter(class025012 -> class025012.operation)).apply((Applicative)instance, class02501::new));
    }
}

