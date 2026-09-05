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

public final class class09916
extends Record {
    private final float x;
    private final float y;
    private final float width;
    private final float height;

    public float L() {
        return this.y;
    }

    public class09916(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09916.class, "x;y;width;height", "x", "y", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09916.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09916.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public float i() {
        return this.height;
    }

    public float u() {
        return this.width;
    }

    public float y() {
        return this.x;
    }

    public boolean N() {
        return this.width <= 0.0f || this.height <= 0.0f;
    }
}

