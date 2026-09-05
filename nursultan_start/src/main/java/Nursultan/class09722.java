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

final class class09722
extends Record {
    private final int x;
    private final int y;
    private final int width;
    private final int height;
    private final int paddedWidth;
    private final int paddedHeight;

    public int L() {
        return this.width;
    }

    int M() {
        return this.y + this.height;
    }

    class09722(int n, int n2, int n3, int n4, int n5, int n6) {
        this.x = n;
        this.y = n2;
        this.width = n3;
        this.height = n4;
        this.paddedWidth = n5;
        this.paddedHeight = n6;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09722.class, "x;y;width;height;paddedWidth;paddedHeight", "x", "y", "width", "height", "paddedWidth", "paddedHeight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09722.class, "x;y;width;height;paddedWidth;paddedHeight", "x", "y", "width", "height", "paddedWidth", "paddedHeight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09722.class, "x;y;width;height;paddedWidth;paddedHeight", "x", "y", "width", "height", "paddedWidth", "paddedHeight"}, this);
    }

    int B() {
        return this.y + this.paddedHeight;
    }

    public int i() {
        return this.paddedWidth;
    }

    public int u() {
        return this.height;
    }

    public int y() {
        return this.y;
    }

    public int N() {
        return this.x;
    }

    public int R() {
        return this.paddedHeight;
    }
}

