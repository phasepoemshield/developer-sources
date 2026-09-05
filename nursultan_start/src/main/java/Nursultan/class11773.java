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

public class class11773
extends Record {
    public float planeWidth;
    public float planeHeight;
    public float v0;
    public float v1;
    public float u0;
    public float u1;

    public float L() {
        return this.planeWidth;
    }

    public class11773(float f, float f2, float f3, float f4, float f5, float f6) {
        this.u0 = f;
        this.v0 = f2;
        this.u1 = f3;
        this.v1 = f4;
        this.planeWidth = f5;
        this.planeHeight = f6;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11773.class, "u0;v0;u1;v1;planeWidth;planeHeight", "u0", "v0", "u1", "v1", "planeWidth", "planeHeight"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11773.class, "u0;v0;u1;v1;planeWidth;planeHeight", "u0", "v0", "u1", "v1", "planeWidth", "planeHeight"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11773.class, "u0;v0;u1;v1;planeWidth;planeHeight", "u0", "v0", "u1", "v1", "planeWidth", "planeHeight"}, this);
    }

    public float i() {
        return this.u0;
    }

    public float u() {
        return this.planeHeight;
    }

    public float y() {
        return this.v0;
    }

    public float N() {
        return this.v1;
    }

    public float R() {
        return this.u1;
    }
}

