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
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import minecraft.class02487;
import minecraft.class02500;

public final class class02470<T extends class02500>
extends Record {
    private final class02487<T> type;
    private final T predicate;

    public class02470(class02487<T> class024872, T t) {
        this.type = class024872;
        this.predicate = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02470.class, "type;predicate", "type", "predicate"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02470.class, "type;predicate", "type", "predicate"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02470.class, "type;predicate", "type", "predicate"}, this);
    }

    public T y() {
        return this.predicate;
    }

    public class02487<T> N() {
        return this.type;
    }

    static <T extends class02500> MapCodec<class02470<T>> N(class02487<T> class024872, Codec<T> codec) {
        return RecordCodecBuilder.mapCodec(instance -> instance.group((App)codec.fieldOf("value").forGetter(class02470::y)).apply((Applicative)instance, class025002 -> new class02470<class02500>(class024872, (class02500)class025002)));
    }

    public static <T extends class02500> class02470<T> N(Map.Entry<class02487<?>, T> entry) {
        return new class02470<class02500>(entry.getKey(), (class02500)entry.getValue());
    }
}

