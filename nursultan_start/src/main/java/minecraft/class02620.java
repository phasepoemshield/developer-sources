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
 *  minecraft.class00836
 */
package minecraft;

import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Predicate;
import minecraft.class00836;

public final class class02620<T, P extends Predicate<T>>
extends Record {
    private final P test;
    private final class00836 count;

    public class02620(P p, class00836 class008362) {
        this.test = p;
        this.count = class008362;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02620.class, "test;count", "test", "count"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02620.class, "test;count", "test", "count"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02620.class, "test;count", "test", "count"}, this);
    }

    public class00836 y() {
        return this.count;
    }

    public P N() {
        return this.test;
    }

    public static <T, P extends Predicate<T>> Codec<class02620<T, P>> N(Codec<P> codec) {
        return RecordCodecBuilder.create(instance -> instance.group((App)codec.fieldOf("test").forGetter(class02620::N), (App)class00836.u.fieldOf("count").forGetter(class02620::y)).apply((Applicative)instance, class02620::new));
    }

    public boolean N(Iterable<T> iterable) {
        int n = 0;
        for (T t : iterable) {
            if (!this.test.test(t)) continue;
            ++n;
        }
        return this.count.u(n);
    }
}

