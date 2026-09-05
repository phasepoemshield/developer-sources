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

public class class11867
extends Record {
    public float v0;
    public float u0;
    public int index;
    public float v1;
    public float u1;
    public static Object y_0;

    public boolean L() {
        return this.index >= 0;
    }

    public class11867(int n, float f, float f2, float f3, float f4) {
        this.index = n;
        this.u0 = f;
        this.v0 = f2;
        this.u1 = f3;
        this.v1 = f4;
    }

    static {
        class11867.B();
        y_0 = new class11867(-1, 0.0f, 0.0f, 0.0f, 0.0f);
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11867.class, "index;u0;v0;u1;v1", "index", "u0", "v0", "u1", "v1"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11867.class, "index;u0;v0;u1;v1", "index", "u0", "v0", "u1", "v1"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11867.class, "index;u0;v0;u1;v1", "index", "u0", "v0", "u1", "v1"}, this);
    }

    private static void B() {
    }

    public float i() {
        return this.v1;
    }

    public int u() {
        return this.index;
    }

    public float y() {
        return this.u0;
    }

    public float N() {
        return this.v0;
    }

    public float R() {
        return this.u1;
    }
}

