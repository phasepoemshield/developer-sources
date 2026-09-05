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

final class class03765<T>
extends Record
implements class03782<T> {
    private final class03552<T> tag;

    public class03552<T> L() {
        return this.tag;
    }

    class03765(class03552<T> class035522) {
        this.tag = class035522;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03765.class, "tag", "tag"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03765.class, "tag", "tag"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03765.class, "tag", "tag"}, this);
    }

    @Override
    public String y() {
        return "#" + String.valueOf(this.tag.B().y());
    }

    @Override
    public boolean test(class03556<T> class035562) {
        return this.tag.N(class035562);
    }

    @Override
    public Either<class03529<T>, class03552<T>> N() {
        return Either.right(this.tag);
    }

    @Override
    public <E> Optional<class03782<E>> N(class05946<? extends class00751<E>> class059462) {
        return this.tag.B().u(class059462) ? Optional.of(this) : Optional.empty();
    }
}

