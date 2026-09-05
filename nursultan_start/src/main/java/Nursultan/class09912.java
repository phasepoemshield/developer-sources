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

public final class class09912
extends Record {
    private final float x;
    private final float y;
    private final float width;
    private final float height;
    private final int targetWidth;
    private final int targetHeight;
    private final float uiScale;

    public float L() {
        return this.width;
    }

    public float M() {
        return this.uiScale;
    }

    public class09912(float f, float f2, float f3, float f4, int n, int n2, float f5) {
        this.x = f;
        this.y = f2;
        this.width = f3;
        this.height = f4;
        this.targetWidth = n;
        this.targetHeight = n2;
        this.uiScale = f5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09912.class, "x;y;width;height;targetWidth;targetHeight;uiScale", "x", "y", "width", "height", "targetWidth", "targetHeight", "uiScale"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09912.class, "x;y;width;height;targetWidth;targetHeight;uiScale", "x", "y", "width", "height", "targetWidth", "targetHeight", "uiScale"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09912.class, "x;y;width;height;targetWidth;targetHeight;uiScale", "x", "y", "width", "height", "targetWidth", "targetHeight", "uiScale"}, this);
    }

    public int i() {
        return this.targetWidth;
    }

    public float u() {
        return this.height;
    }

    public float y() {
        return this.y;
    }

    public float N() {
        return this.x;
    }

    public int R() {
        return this.targetHeight;
    }
}

