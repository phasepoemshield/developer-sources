/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09749
extends Record {
    private final float min;
    private final float def;
    private final float max;

    public float L() {
        return this.max;
    }

    public class09749(float f, float f2, float f3) {
        this.min = f;
        this.def = f2;
        this.max = f3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09749.class, "min;def;max", "min", "def", "max"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09749.class, "min;def;max", "min", "def", "max"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09749.class, "min;def;max", "min", "def", "max"}, this);
    }

    public float y() {
        return this.def;
    }

    public float N() {
        return this.min;
    }
}

