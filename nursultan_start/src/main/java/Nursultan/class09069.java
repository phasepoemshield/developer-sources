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

public class class09069
extends Record {
    public int count;
    public boolean normalized;
    public int glType;
    public int divisor;

    public boolean L() {
        return this.normalized;
    }

    public int M() {
        return this.divisor;
    }

    public class09069(int n, int n2, boolean bl, int n3) {
        this.count = n;
        this.glType = n2;
        this.normalized = bl;
        this.divisor = n3;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09069.class, "count;glType;normalized;divisor", "count", "glType", "normalized", "divisor"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09069.class, "count;glType;normalized;divisor", "count", "glType", "normalized", "divisor"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09069.class, "count;glType;normalized;divisor", "count", "glType", "normalized", "divisor"}, this);
    }

    public int i() {
        return this.glType;
    }

    public int u() {
        return this.count;
    }

    public static class09069 y(int n) {
        return new class09069(n, 5124, false, 0);
    }

    public static class09069 y() {
        return new class09069(4, 5121, true, 0);
    }

    public static class09069 N(int n) {
        return new class09069(n, 5126, false, 0);
    }

    public int N() {
        return this.count * (switch (this.glType) {
            case 5120, 5121 -> 1;
            case 5122, 5123 -> 2;
            case 5124, 5125, 5126 -> 4;
            default -> throw new IllegalArgumentException("Unsupported GL type: " + this.glType);
        });
    }

    public class09069 R() {
        return new class09069(this.count, this.glType, this.normalized, 1);
    }
}

