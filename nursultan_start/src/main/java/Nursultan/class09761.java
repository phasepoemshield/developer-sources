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

public final class class09761
extends Record {
    private final byte[] pixels;
    private final int width;
    private final int height;
    private final int channels;
    private final double planeL;
    private final double planeB;
    private final double planeR;
    private final double planeT;
    private final double advance;

    public int L() {
        return this.width;
    }

    public double M() {
        return this.planeB;
    }

    public class09761(byte[] byArray, int n, int n2, int n3, double d, double d2, double d3, double d4, double d5) {
        this.pixels = byArray;
        this.width = n;
        this.height = n2;
        this.channels = n3;
        this.planeL = d;
        this.planeB = d2;
        this.planeR = d3;
        this.planeT = d4;
        this.advance = d5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09761.class, "pixels;width;height;channels;planeL;planeB;planeR;planeT;advance", "pixels", "width", "height", "channels", "planeL", "planeB", "planeR", "planeT", "advance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09761.class, "pixels;width;height;channels;planeL;planeB;planeR;planeT;advance", "pixels", "width", "height", "channels", "planeL", "planeB", "planeR", "planeT", "advance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09761.class, "pixels;width;height;channels;planeL;planeB;planeR;planeT;advance", "pixels", "width", "height", "channels", "planeL", "planeB", "planeR", "planeT", "advance"}, this);
    }

    public double B() {
        return this.planeR;
    }

    public double Z() {
        return this.planeT;
    }

    public int i() {
        return this.channels;
    }

    public double z() {
        return this.advance;
    }

    public int u() {
        return this.height;
    }

    public byte[] y() {
        return this.pixels;
    }

    public boolean N() {
        return this.width == 0 || this.height == 0;
    }

    public double R() {
        return this.planeL;
    }
}

