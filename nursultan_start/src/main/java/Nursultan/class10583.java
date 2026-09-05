/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03556
 *  minecraft.class06510
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03556;
import minecraft.class06510;

public final class class10583<T>
extends Record {
    public final class03556<T> from;
    public final class06510 ingredient;
    public final class03556<T> to;

    public class03556<T> L() {
        return this.to;
    }

    public class10583(class03556<T> class035562, class06510 class065102, class03556<T> class035563) {
        this.from = class035562;
        this.ingredient = class065102;
        this.to = class035563;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10583.class, "from;ingredient;to", "from", "ingredient", "to"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10583.class, "from;ingredient;to", "from", "ingredient", "to"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10583.class, "from;ingredient;to", "from", "ingredient", "to"}, this);
    }

    public class06510 y() {
        return this.ingredient;
    }

    public class03556<T> N() {
        return this.from;
    }
}

