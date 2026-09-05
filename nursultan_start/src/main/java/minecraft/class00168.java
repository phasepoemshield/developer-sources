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

public final class class00168
extends Record {
    private final double x0;
    private final double y0;
    private final double z0;
    private final double x1;
    private final double y1;
    private final double z1;
    private final float offsetX;
    private final float offsetY;
    private final float offsetZ;
    private final float red;
    private final float green;
    private final float blue;

    public double L() {
        return this.z0;
    }

    public float M() {
        return this.offsetX;
    }

    public class00168(double d, double d2, double d3, double d4, double d5, double d6, float f, float f2, float f3) {
        this(d, d2, d3, d4, d5, d6, 0.0f, 0.0f, 0.0f, f, f2, f3);
    }

    public class00168(double d, double d2, double d3, double d4, double d5, double d6, float f, float f2, float f3, float f4, float f5, float f6) {
        this.x0 = d;
        this.y0 = d2;
        this.z0 = d3;
        this.x1 = d4;
        this.y1 = d5;
        this.z1 = d6;
        this.offsetX = f;
        this.offsetY = f2;
        this.offsetZ = f3;
        this.red = f4;
        this.green = f5;
        this.blue = f6;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00168.class, "x0;y0;z0;x1;y1;z1;offsetX;offsetY;offsetZ;red;green;blue", "x0", "y0", "z0", "x1", "y1", "z1", "offsetX", "offsetY", "offsetZ", "red", "green", "blue"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00168.class, "x0;y0;z0;x1;y1;z1;offsetX;offsetY;offsetZ;red;green;blue", "x0", "y0", "z0", "x1", "y1", "z1", "offsetX", "offsetY", "offsetZ", "red", "green", "blue"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00168.class, "x0;y0;z0;x1;y1;z1;offsetX;offsetY;offsetZ;red;green;blue", "x0", "y0", "z0", "x1", "y1", "z1", "offsetX", "offsetY", "offsetZ", "red", "green", "blue"}, this);
    }

    public float B() {
        return this.offsetY;
    }

    public float Z() {
        return this.offsetZ;
    }

    public double i() {
        return this.y1;
    }

    public float U() {
        return this.green;
    }

    public float z() {
        return this.red;
    }

    public double u() {
        return this.x1;
    }

    public double y() {
        return this.y0;
    }

    public float E() {
        return this.blue;
    }

    public double N() {
        return this.x0;
    }

    public double R() {
        return this.z1;
    }
}

