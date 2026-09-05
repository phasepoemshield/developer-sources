/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02082
 *  minecraft.class03529
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class02082;
import minecraft.class03529;

final class class04147<T>
extends Record {
    private final class02082<T> value;
    private final Optional<class03529<T>> holder;

    class04147(class02082<T> class020822, Optional<class03529<T>> optional) {
        this.value = class020822;
        this.holder = optional;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04147.class, "value;holder", "value", "holder"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04147.class, "value;holder", "value", "holder"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04147.class, "value;holder", "value", "holder"}, this);
    }

    public Optional<class03529<T>> y() {
        return this.holder;
    }

    public class02082<T> N() {
        return this.value;
    }
}

