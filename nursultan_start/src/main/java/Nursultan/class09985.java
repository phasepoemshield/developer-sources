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

public final class class09985
extends Record {
    private final float left;
    private final float right;
    private final float top;
    private final float bottom;
    public static final class09985 N = class09985.N(0.0f);

    public float L() {
        return this.left;
    }

    public class09985(float f, float f2, float f3, float f4) {
        this.left = f;
        this.right = f2;
        this.top = f3;
        this.bottom = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09985.class, "left;right;top;bottom", "left", "right", "top", "bottom"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09985.class, "left;right;top;bottom", "left", "right", "top", "bottom"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09985.class, "left;right;top;bottom", "left", "right", "top", "bottom"}, this);
    }

    public float i() {
        return this.top;
    }

    public float u() {
        return this.right;
    }

    public float y() {
        return Math.max(0.0f, this.top) + Math.max(0.0f, this.bottom);
    }

    public static class09985 N(float f, float f2, float f3, float f4) {
        return new class09985(Math.max(0.0f, f), Math.max(0.0f, f2), Math.max(0.0f, f3), Math.max(0.0f, f4));
    }

    public static class09985 N(float f, float f2) {
        float f3 = Math.max(0.0f, f);
        float f4 = Math.max(0.0f, f2);
        return new class09985(f3, f3, f4, f4);
    }

    public float N() {
        return Math.max(0.0f, this.left) + Math.max(0.0f, this.right);
    }

    public static class09985 N(float f) {
        float f2 = Math.max(0.0f, f);
        return new class09985(f2, f2, f2, f2);
    }

    public float R() {
        return this.bottom;
    }
}

