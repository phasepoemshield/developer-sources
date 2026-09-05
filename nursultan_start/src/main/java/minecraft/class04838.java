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

public final class class04838
extends Record {
    private final float x;
    private final float y;
    private final float z;
    private final float xRot;
    private final float yRot;
    private final float zRot;
    private final float xScale;
    private final float yScale;
    private final float zScale;
    public static final class04838 N = class04838.N(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);

    public class04838 L(float f, float f2, float f3) {
        return new class04838(this.x + f, this.y + f2, this.z + f3, this.xRot, this.yRot, this.zRot, this.xScale, this.yScale, this.zScale);
    }

    public float L() {
        return this.z;
    }

    public float M() {
        return this.xScale;
    }

    public class04838(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.x = f;
        this.y = f2;
        this.z = f3;
        this.xRot = f4;
        this.yRot = f5;
        this.zRot = f6;
        this.xScale = f7;
        this.yScale = f8;
        this.zScale = f9;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04838.class, "x;y;z;xRot;yRot;zRot;xScale;yScale;zScale", "x", "y", "z", "xRot", "yRot", "zRot", "xScale", "yScale", "zScale"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04838.class, "x;y;z;xRot;yRot;zRot;xScale;yScale;zScale", "x", "y", "z", "xRot", "yRot", "zRot", "xScale", "yScale", "zScale"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04838.class, "x;y;z;xRot;yRot;zRot;xScale;yScale;zScale", "x", "y", "z", "xRot", "yRot", "zRot", "xScale", "yScale", "zScale"}, this);
    }

    public float B() {
        return this.yScale;
    }

    public float Z() {
        return this.zScale;
    }

    public float i() {
        return this.yRot;
    }

    public float u() {
        return this.xRot;
    }

    public class04838 u(float f, float f2, float f3) {
        return new class04838(this.x * f, this.y * f2, this.z * f3, this.xRot, this.yRot, this.zRot, this.xScale * f, this.yScale * f2, this.zScale * f3);
    }

    public static class04838 y(float f, float f2, float f3) {
        return class04838.N(0.0f, 0.0f, 0.0f, f, f2, f3);
    }

    public class04838 y(float f) {
        if (f == 1.0f) {
            return this;
        }
        return this.u(f, f, f);
    }

    public float y() {
        return this.y;
    }

    public class04838 N(float f) {
        return new class04838(this.x, this.y, this.z, this.xRot, this.yRot, this.zRot, f, f, f);
    }

    public static class04838 N(float f, float f2, float f3, float f4, float f5, float f6) {
        return new class04838(f, f2, f3, f4, f5, f6, 1.0f, 1.0f, 1.0f);
    }

    public static class04838 N(float f, float f2, float f3) {
        return class04838.N(f, f2, f3, 0.0f, 0.0f, 0.0f);
    }

    public float N() {
        return this.x;
    }

    public float R() {
        return this.zRot;
    }
}

