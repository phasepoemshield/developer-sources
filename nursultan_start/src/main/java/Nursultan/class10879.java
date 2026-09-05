/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06584
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BiPredicate;
import java.util.function.Function;
import minecraft.class06584;

public class class10879<T>
extends Record {
    public Function<class06584, T> getter;
    public BiPredicate<T, T> equals;
    public String name;

    public Function<class06584, T> L() {
        return this.getter;
    }

    class10879(String string, Function<class06584, T> function, BiPredicate<T, T> biPredicate) {
        this.name = string;
        this.getter = function;
        this.equals = biPredicate;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10879.class, "name;getter;equals", "name", "getter", "equals"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10879.class, "name;getter;equals", "name", "getter", "equals"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10879.class, "name;getter;equals", "name", "getter", "equals"}, this);
    }

    public String y() {
        return this.name;
    }

    public boolean N(class06584 class065842, class06584 class065843) {
        T t = this.getter.apply(class065842);
        T t2 = this.getter.apply(class065843);
        if (t == null && t2 == null) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return this.equals.test(t, t2);
    }

    public BiPredicate<T, T> N() {
        return this.equals;
    }
}

