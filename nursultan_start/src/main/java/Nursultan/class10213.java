/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class02042
 *  minecraft.class03530
 *  minecraft.class03535
 *  minecraft.class03556
 *  minecraft.class05946
 */
package Nursultan;

import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02042;
import minecraft.class03530;
import minecraft.class03535;
import minecraft.class03556;
import minecraft.class05946;

public final class class10213<T>
extends Record
implements class03556<T> {
    private final T value;

    public Stream<class03530<T>> L() {
        return Stream.of(new class03530[0]);
    }

    public class10213(T t) {
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10213.class, "value", "value"}, this, object);
    }

    public String toString() {
        return "Direct{" + String.valueOf(this.value) + "}";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10213.class, "value", "value"}, this);
    }

    public Optional<class05946<T>> i() {
        return Optional.empty();
    }

    public Either<class05946<T>, T> u() {
        return Either.right(this.value);
    }

    public boolean y() {
        return true;
    }

    public boolean N(class05946<T> class059462) {
        return false;
    }

    public boolean N(class02042<T> class020422) {
        return true;
    }

    public boolean N(class01894 class018942) {
        return false;
    }

    public T N() {
        return this.value;
    }

    public boolean N(Predicate<class05946<T>> predicate) {
        return false;
    }

    public boolean N(class03556<T> class035562) {
        return this.value.equals(class035562.N());
    }

    public boolean N(class03530<T> class035302) {
        return false;
    }

    public class03535 R() {
        return class03535.field_36447;
    }
}

