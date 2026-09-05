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

public class class11625
extends Record {
    public float maxY;
    public float maxX;
    public float minX;
    public float minY;

    public float L() {
        return this.minX;
    }

    public class11625(float f, float f2, float f3, float f4) {
        this.minX = f;
        this.minY = f2;
        this.maxX = f3;
        this.maxY = f4;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11625.class, "minX;minY;maxX;maxY", "minX", "minY", "maxX", "maxY"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11625.class, "minX;minY;maxX;maxY", "minX", "minY", "maxX", "maxY"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11625.class, "minX;minY;maxX;maxY", "minX", "minY", "maxX", "maxY"}, this);
    }

    public float i() {
        return this.maxX - this.minX;
    }

    public float u() {
        return this.minY;
    }

    public float y() {
        return this.maxX;
    }

    public float N() {
        return this.maxY;
    }

    public class11625 N(class11625 class116252) {
        float f = Math.max(this.minX, class116252.minX);
        float f2 = Math.max(this.minY, class116252.minY);
        float f3 = Math.min(this.maxX, class116252.maxX);
        float f4 = Math.min(this.maxY, class116252.maxY);
        if (f3 - f <= 0.0f || f4 - f2 <= 0.0f) {
            return null;
        }
        return new class11625(f, f2, f3, f4);
    }

    public float R() {
        return this.maxY - this.minY;
    }
}

