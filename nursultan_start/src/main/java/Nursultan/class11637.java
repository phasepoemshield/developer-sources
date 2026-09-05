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

public class class11637
extends Record {
    public byte[] rgbaPixels;
    public String failureReason;
    public byte[] alphaMask;
    public int width;
    public String normalizedRef;
    public int height;

    public byte[] L() {
        return this.alphaMask;
    }

    private class11637(String string, int n, int n2, byte[] byArray, byte[] byArray2, String string2) {
        this.normalizedRef = string;
        this.width = n;
        this.height = n2;
        this.rgbaPixels = byArray;
        this.alphaMask = byArray2;
        this.failureReason = string2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11637.class, "normalizedRef;width;height;rgbaPixels;alphaMask;failureReason", "normalizedRef", "width", "height", "rgbaPixels", "alphaMask", "failureReason"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11637.class, "normalizedRef;width;height;rgbaPixels;alphaMask;failureReason", "normalizedRef", "width", "height", "rgbaPixels", "alphaMask", "failureReason"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11637.class, "normalizedRef;width;height;rgbaPixels;alphaMask;failureReason", "normalizedRef", "width", "height", "rgbaPixels", "alphaMask", "failureReason"}, this);
    }

    public int i() {
        return this.height;
    }

    public byte[] u() {
        return this.rgbaPixels;
    }

    public String y() {
        return this.failureReason;
    }

    static class11637 N(String string, String string2) {
        return new class11637(string, 0, 0, null, null, string2);
    }

    static class11637 N(String string, int n, int n2, byte[] byArray, byte[] byArray2) {
        return new class11637(string, n, n2, byArray, byArray2, null);
    }

    public String N() {
        return this.normalizedRef;
    }

    public int R() {
        return this.width;
    }
}

