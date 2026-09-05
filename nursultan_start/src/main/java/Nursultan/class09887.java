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

final class class09887
extends Record {
    private final float minX;
    private final float minY;
    private final float maxX;
    private final float maxY;

    public float L() {
        return this.minY;
    }

    class09887(float f, float f2, float f3, float f4) {
        this.minX = f;
        this.minY = f2;
        this.maxX = f3;
        this.maxY = f4;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09887.class, "minX;minY;maxX;maxY", "minX", "minY", "maxX", "maxY"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09887.class, "minX;minY;maxX;maxY", "minX", "minY", "maxX", "maxY"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09887.class, "minX;minY;maxX;maxY", "minX", "minY", "maxX", "maxY"}, this);
    }

    public float i() {
        return this.maxY;
    }

    public float u() {
        return this.maxX;
    }

    public float y() {
        return this.minX;
    }

    boolean N() {
        return this.maxX > this.minX && this.maxY > this.minY;
    }
}

