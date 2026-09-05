/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07581
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07581;
import minecraft.class07586;
import minecraft.class07606;

final class class07599<T>
extends Record {
    final class07586 easing;
    final T fromValue;
    final int fromTicks;
    final T toValue;
    final int toTicks;

    public int L() {
        return this.fromTicks;
    }

    public class07599(class07606<T> class076062, class07581<T> class075812, int n, class07581<T> class075813, int n2) {
        this(class076062.y(), class075812.y(), n, class075813.y(), n2);
    }

    class07599(class07586 class075862, T t, int n, T t2, int n2) {
        this.easing = class075862;
        this.fromValue = t;
        this.fromTicks = n;
        this.toValue = t2;
        this.toTicks = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07599.class, "easing;fromValue;fromTicks;toValue;toTicks", "easing", "fromValue", "fromTicks", "toValue", "toTicks"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07599.class, "easing;fromValue;fromTicks;toValue;toTicks", "easing", "fromValue", "fromTicks", "toValue", "toTicks"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07599.class, "easing;fromValue;fromTicks;toValue;toTicks", "easing", "fromValue", "fromTicks", "toValue", "toTicks"}, this);
    }

    public int i() {
        return this.toTicks;
    }

    public T u() {
        return this.toValue;
    }

    public T y() {
        return this.fromValue;
    }

    public class07586 N() {
        return this.easing;
    }
}

