/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Either
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00751
 *  minecraft.class03530
 *  minecraft.class03556
 *  minecraft.class05946
 */
package minecraft;

import com.mojang.datafixers.util.Either;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00751;
import minecraft.class03530;
import minecraft.class03556;
import minecraft.class04428;
import minecraft.class05946;

final class class04427<T>
extends Record
implements class04428<T> {
    private final class03530<T> key;

    public class03530<T> L() {
        return this.key;
    }

    class04427(class03530<T> class035302) {
        this.key = class035302;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04427.class, "key", "key"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04427.class, "key", "key"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04427.class, "key", "key"}, this);
    }

    @Override
    public String y() {
        return "#" + String.valueOf(this.key.y());
    }

    @Override
    public boolean test(class03556<T> class035562) {
        return class035562.N(this.key);
    }

    @Override
    public Either<class05946<T>, class03530<T>> N() {
        return Either.right(this.key);
    }

    @Override
    public <E> Optional<class04428<E>> N(class05946<? extends class00751<E>> class059462) {
        return this.key.i(class059462).map(class04427::new);
    }
}

