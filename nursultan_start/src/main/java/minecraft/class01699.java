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

public final class class01699
extends Record {
    private final float x;
    private final float y;
    private final float z;
    public final float u;
    public final float v;
    public static final float L = 16.0f;

    public float L() {
        return this.z / 16.0f;
    }

    public float M() {
        return this.u;
    }

    public class01699(float f, float f2, float f3, float f4, float f5) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.u = f4;
        this.v = f5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01699.class, "x;y;z;u;v", "x", "y", "z", "u", "v"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01699.class, "x;y;z;u;v", "x", "y", "z", "u", "v"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01699.class, "x;y;z;u;v", "x", "y", "z", "u", "v"}, this);
    }

    public float B() {
        return this.v;
    }

    public float i() {
        return this.y;
    }

    public float u() {
        return this.x;
    }

    public float y() {
        return this.y / 16.0f;
    }

    public float N() {
        return this.x / 16.0f;
    }

    public class01699 N(float f, float f2) {
        return new class01699(this.x, this.y, this.z, f, f2);
    }

    public float R() {
        return this.z;
    }
}

