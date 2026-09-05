/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterables
 *  com.mojang.datafixers.kinds.App
 *  com.mojang.datafixers.kinds.Applicative
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.codecs.RecordCodecBuilder
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00836
 */
package minecraft;

import com.google.common.collect.Iterables;
import com.mojang.datafixers.kinds.App;
import com.mojang.datafixers.kinds.Applicative;
import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class00836;
import minecraft.class02638;
import minecraft.class02646;

public final class class02648<T, P extends Predicate<T>>
extends Record
implements Predicate<Iterable<T>> {
    private final Optional<class02638<T, P>> contains;
    private final Optional<class02646<T, P>> counts;
    private final Optional<class00836> size;

    public Optional<class00836> L() {
        return this.size;
    }

    public class02648(Optional<class02638<T, P>> optional, Optional<class02646<T, P>> optional2, Optional<class00836> optional3) {
        this.contains = optional;
        this.counts = optional2;
        this.size = optional3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02648.class, "contains;counts;size", "contains", "counts", "size"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02648.class, "contains;counts;size", "contains", "counts", "size"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02648.class, "contains;counts;size", "contains", "counts", "size"}, this);
    }

    public Optional<class02646<T, P>> y() {
        return this.counts;
    }

    @Override
    public boolean test(Iterable<T> iterable) {
        if (this.contains.isPresent() && !this.contains.get().test(iterable)) {
            return false;
        }
        if (this.counts.isPresent() && !this.counts.get().test(iterable)) {
            return false;
        }
        return !this.size.isPresent() || this.size.get().u(Iterables.size(iterable));
    }

    public static <T, P extends Predicate<T>> Codec<class02648<T, P>> N(Codec<P> codec) {
        return RecordCodecBuilder.create(instance -> instance.group((App)class02638.N(codec).optionalFieldOf("contains").forGetter(class02648::N), (App)class02646.N(codec).optionalFieldOf("count").forGetter(class02648::y), (App)class00836.u.optionalFieldOf("size").forGetter(class02648::L)).apply((Applicative)instance, class02648::new));
    }

    public Optional<class02638<T, P>> N() {
        return this.contains;
    }
}

