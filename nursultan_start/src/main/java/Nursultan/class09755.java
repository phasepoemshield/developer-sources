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

public final class class09755
extends Record {
    private final float[] pixels;
    private final int width;
    private final int height;
    private final int channels;
    private final double advance;

    public int L() {
        return this.height;
    }

    public class09755(float[] fArray, int n, int n2, int n3, double d) {
        this.pixels = fArray;
        this.width = n;
        this.height = n2;
        this.channels = n3;
        this.advance = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09755.class, "pixels;width;height;channels;advance", "pixels", "width", "height", "channels", "advance"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09755.class, "pixels;width;height;channels;advance", "pixels", "width", "height", "channels", "advance"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09755.class, "pixels;width;height;channels;advance", "pixels", "width", "height", "channels", "advance"}, this);
    }

    public double i() {
        return this.advance;
    }

    public int u() {
        return this.channels;
    }

    public int y() {
        return this.width;
    }

    public float N(int n, int n2, int n3) {
        return this.pixels[(n2 * this.width + n) * this.channels + n3];
    }

    public float[] N() {
        return this.pixels;
    }
}

