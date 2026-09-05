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

public class class11627
extends Record {
    public int height;
    public int width;
    public byte[] rgbaPixels;

    public int L() {
        return this.width;
    }

    class11627(int n, int n2, byte[] byArray) {
        this.width = n;
        this.height = n2;
        this.rgbaPixels = byArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11627.class, "width;height;rgbaPixels", "width", "height", "rgbaPixels"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11627.class, "width;height;rgbaPixels", "width", "height", "rgbaPixels"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11627.class, "width;height;rgbaPixels", "width", "height", "rgbaPixels"}, this);
    }

    public byte[] y() {
        return this.rgbaPixels;
    }

    public int N() {
        return this.height;
    }
}

