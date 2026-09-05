/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class08092;

public final class class08084<T extends Comparable<T>>
extends Record {
    private final class08092<T> property;
    private final T value;

    public class08084(class08092<T> class080922, T t) {
        if (!class080922.N().contains(t)) {
            throw new IllegalArgumentException("Value " + String.valueOf(t) + " does not belong to property " + String.valueOf(class080922));
        }
        this.property = class080922;
        this.value = t;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08084.class, "property;value", "property", "value"}, this, object);
    }

    public String toString() {
        return this.property.R() + "=" + this.property.y(this.value);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08084.class, "property;value", "property", "value"}, this);
    }

    public T y() {
        return this.value;
    }

    public class08092<T> N() {
        return this.property;
    }
}

