/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09724;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09750
extends Record
implements class09724 {
    private final int cp;
    private final float planeL;
    private final float planeB;
    private final float planeR;
    private final float planeT;
    private final float advance;
    private final int x;
    private final int y;
    private final int w;
    private final int h;
    private final int page;

    public float L() {
        return this.planeB;
    }

    public int M() {
        return this.x;
    }

    class09750(int n, float f, float f2, float f3, float f4, float f5, int n2, int n3, int n4, int n5, int n6) {
        this.cp = n;
        this.planeL = f;
        this.planeB = f2;
        this.planeR = f3;
        this.planeT = f4;
        this.advance = f5;
        this.x = n2;
        this.y = n3;
        this.w = n4;
        this.h = n5;
        this.page = n6;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09750.class, "cp;planeL;planeB;planeR;planeT;advance;x;y;w;h;page", "cp", "planeL", "planeB", "planeR", "planeT", "advance", "x", "y", "w", "h", "page"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09750.class, "cp;planeL;planeB;planeR;planeT;advance;x;y;w;h;page", "cp", "planeL", "planeB", "planeR", "planeT", "advance", "x", "y", "w", "h", "page"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09750.class, "cp;planeL;planeB;planeR;planeT;advance;x;y;w;h;page", "cp", "planeL", "planeB", "planeR", "planeT", "advance", "x", "y", "w", "h", "page"}, this);
    }

    public int B() {
        return this.y;
    }

    public int Z() {
        return this.w;
    }

    public float i() {
        return this.planeT;
    }

    public int U() {
        return this.page;
    }

    public int z() {
        return this.h;
    }

    public float u() {
        return this.planeR;
    }

    public float y() {
        return this.planeL;
    }

    public int N() {
        return this.cp;
    }

    public float R() {
        return this.advance;
    }
}

