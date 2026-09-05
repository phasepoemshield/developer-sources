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

public final class class09849
extends Record {
    private final float x;
    private final float y;
    private final float width;
    private final float height;

    public float L() {
        return this.x + this.width * 0.5f;
    }

    public float M() {
        return this.width;
    }

    public class09849(float f, float f2, float f3, float f4) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09849.class, "x;y;width;height", "x", "y", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09849.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09849.class, "x;y;width;height", "x", "y", "width", "height"}, this);
    }

    public float B() {
        return this.height;
    }

    public float i() {
        return this.x;
    }

    public float u() {
        return this.y + this.height * 0.5f;
    }

    public float y() {
        return this.y + this.height;
    }

    public float N() {
        return this.x + this.width;
    }

    public float R() {
        return this.y;
    }
}

