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

public class class09091
extends Record {
    public float maxX;
    public int glTextureId;
    public float minY;
    public float u0;
    public float maxY;
    public float minX;
    public float v0;
    public float u1;
    public float v1;
    public float advance;

    public float L() {
        return this.u0;
    }

    public int M() {
        return this.glTextureId;
    }

    public class09091(int n, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9) {
        this.glTextureId = n;
        this.u0 = f;
        this.v0 = f2;
        this.u1 = f3;
        this.v1 = f4;
        this.minX = f5;
        this.maxX = f6;
        this.minY = f7;
        this.maxY = f8;
        this.advance = f9;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09091.class, "glTextureId;u0;v0;u1;v1;minX;maxX;minY;maxY;advance", "glTextureId", "u0", "v0", "u1", "v1", "minX", "maxX", "minY", "maxY", "advance"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09091.class, "glTextureId;u0;v0;u1;v1;minX;maxX;minY;maxY;advance", "glTextureId", "u0", "v0", "u1", "v1", "minX", "maxX", "minY", "maxY", "advance"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09091.class, "glTextureId;u0;v0;u1;v1;minX;maxX;minY;maxY;advance", "glTextureId", "u0", "v0", "u1", "v1", "minX", "maxX", "minY", "maxY", "advance"}, this);
    }

    public float B() {
        return this.advance;
    }

    public float Z() {
        return this.maxY;
    }

    public float i() {
        return this.v1;
    }

    public float z() {
        return this.v0;
    }

    public float u() {
        return this.minY;
    }

    public float y() {
        return this.minX;
    }

    public float N() {
        return this.u1;
    }

    public float R() {
        return this.maxX;
    }
}

