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

public class class11724
extends Record {
    public int height;
    public byte[] pixels;
    public int width;

    public int L() {
        return this.height;
    }

    class11724(int n, int n2, byte[] byArray) {
        this.width = n;
        this.height = n2;
        this.pixels = byArray;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11724.class, "width;height;pixels", "width", "height", "pixels"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11724.class, "width;height;pixels", "width", "height", "pixels"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11724.class, "width;height;pixels", "width", "height", "pixels"}, this);
    }

    public byte[] y() {
        return this.pixels;
    }

    public int N() {
        return this.width;
    }
}

