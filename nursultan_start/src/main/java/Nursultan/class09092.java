/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntList
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import it.unimi.dsi.fastutil.ints.IntList;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09092
extends Record {
    public int fromInclusive;
    public int toInclusive;

    public class09092(int n, int n2) {
        if (!Character.isValidCodePoint(n)) {
            throw new IllegalArgumentException("Invalid fromInclusive code point: " + n);
        }
        if (!Character.isValidCodePoint(n2)) {
            throw new IllegalArgumentException("Invalid toInclusive code point: " + n2);
        }
        if (n > n2) {
            throw new IllegalArgumentException("fromInclusive must be <= toInclusive");
        }
        this.fromInclusive = n;
        this.toInclusive = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09092.class, "fromInclusive;toInclusive", "fromInclusive", "toInclusive"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09092.class, "fromInclusive;toInclusive", "fromInclusive", "toInclusive"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09092.class, "fromInclusive;toInclusive", "fromInclusive", "toInclusive"}, this);
    }

    public int y() {
        return this.toInclusive;
    }

    public static class09092 N(int n, int n2) {
        return new class09092(n, n2);
    }

    public int N() {
        return this.fromInclusive;
    }

    public void N(IntList intList) {
        for (int i = this.fromInclusive; i <= this.toInclusive; ++i) {
            intList.add(i);
        }
    }

    public static class09092 N(int n) {
        return new class09092(n, n);
    }
}

