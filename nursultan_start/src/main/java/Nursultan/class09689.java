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

public final class class09689
extends Record {
    private final float u0;
    private final float v0;
    private final float u1;
    private final float v1;
    public static final class09689 N = new class09689(0.0f, 0.0f, 1.0f, 1.0f);

    public float L() {
        return this.v0;
    }

    public class09689(float f, float f2, float f3, float f4) {
        this.u0 = f;
        this.v0 = f2;
        this.u1 = f3;
        this.v1 = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09689.class, "u0;v0;u1;v1", "u0", "v0", "u1", "v1"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09689.class, "u0;v0;u1;v1", "u0", "v0", "u1", "v1"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09689.class, "u0;v0;u1;v1", "u0", "v0", "u1", "v1"}, this);
    }

    public float i() {
        return this.v1;
    }

    public float u() {
        return this.u1;
    }

    public float y() {
        return this.u0;
    }

    public boolean N() {
        return this.u0 == 0.0f && this.v0 == 0.0f && this.u1 == 1.0f && this.v1 == 1.0f;
    }
}

