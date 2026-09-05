/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class03529
 *  minecraft.class03552
 *  minecraft.class03556
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class03529;
import minecraft.class03552;
import minecraft.class03556;
import minecraft.class03782;
import minecraft.class05946;

final class class03775<T>
extends Record
implements class03782<T> {
    private final class03529<T> value;

    public class03529<T> L() {
        return this.value;
    }

    class03775(class03529<T> class035292) {
        this.value = class035292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03775.class, "value", "value"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03775.class, "value", "value"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03775.class, "value", "value"}, this);
    }

    @Override
    public String y() {
        return this.value.B().N().toString();
    }

    @Override
    public boolean test(class03556<T> class035562) {
        return class035562.equals(this.value);
    }

    @Override
    public Either<class03529<T>, class03552<T>> N() {
        return Either.left(this.value);
    }

    @Override
    public <E> Optional<class03782<E>> N(class05946<? extends class00751<E>> class059462) {
        return this.value.B().L(class059462) ? Optional.of(this) : Optional.empty();
    }
}

