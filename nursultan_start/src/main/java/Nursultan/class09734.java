/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09735;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class09734
extends Record {
    private final class09735 fieldType;
    private final double baseSize;
    private final double pxRange;
    private final int initialPageSize;
    private final int maxPageSize;
    private final double weight;

    public double L() {
        return this.baseSize;
    }

    public double M() {
        return this.weight;
    }

    public class09734(class09735 class097352, double d, double d2, int n, int n2, double d3) {
        if (class097352 == null) {
            throw new IllegalArgumentException("fieldType");
        }
        if (d <= 0.0) {
            throw new IllegalArgumentException("baseSize must be > 0");
        }
        if (d2 <= 0.0) {
            throw new IllegalArgumentException("pxRange must be > 0");
        }
        if (n <= 0) {
            throw new IllegalArgumentException("initialPageSize must be > 0");
        }
        if (n2 < n) {
            throw new IllegalArgumentException("maxPageSize must be >= initialPageSize");
        }
        if (!(Double.isNaN(d3) || Double.isFinite(d3) && d3 > 0.0)) {
            throw new IllegalArgumentException("weight must be NaN (font default) or finite and > 0");
        }
        this.fieldType = class097352;
        this.baseSize = d;
        this.pxRange = d2;
        this.initialPageSize = n;
        this.maxPageSize = n2;
        this.weight = d3;
    }

    public class09734(class09735 class097352, double d, double d2, int n, int n2) {
        this(class097352, d, d2, n, n2, Double.NaN);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09734.class, "fieldType;baseSize;pxRange;initialPageSize;maxPageSize;weight", "fieldType", "baseSize", "pxRange", "initialPageSize", "maxPageSize", "weight"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09734.class, "fieldType;baseSize;pxRange;initialPageSize;maxPageSize;weight", "fieldType", "baseSize", "pxRange", "initialPageSize", "maxPageSize", "weight"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09734.class, "fieldType;baseSize;pxRange;initialPageSize;maxPageSize;weight", "fieldType", "baseSize", "pxRange", "initialPageSize", "maxPageSize", "weight"}, this);
    }

    public int i() {
        return this.initialPageSize;
    }

    public double u() {
        return this.pxRange;
    }

    public class09735 y() {
        return this.fieldType;
    }

    public class09734 N(double d) {
        return new class09734(this.fieldType, this.baseSize, this.pxRange, this.initialPageSize, this.maxPageSize, d);
    }

    public static class09734 N() {
        return new class09734(class09735.MTSDF, 40.0, 6.0, 1024, 8192);
    }

    public int R() {
        return this.maxPageSize;
    }
}

