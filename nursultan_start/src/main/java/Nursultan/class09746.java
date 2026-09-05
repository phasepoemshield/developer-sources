/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09761;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09746
extends Record {
    private final long fontHash;
    private final int fieldType;
    private final double baseSize;
    private final double pxRange;
    private final double weight;
    private final int channels;
    private final int[] cp;
    private final class09761[] cells;

    public double L() {
        return this.baseSize;
    }

    public int[] M() {
        return this.cp;
    }

    class09746(long l, int n, double d, double d2, double d3, int n2, int[] nArray, class09761[] class09761Array) {
        this.fontHash = l;
        this.fieldType = n;
        this.baseSize = d;
        this.pxRange = d2;
        this.weight = d3;
        this.channels = n2;
        this.cp = nArray;
        this.cells = class09761Array;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09746.class, "fontHash;fieldType;baseSize;pxRange;weight;channels;cp;cells", "fontHash", "fieldType", "baseSize", "pxRange", "weight", "channels", "cp", "cells"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09746.class, "fontHash;fieldType;baseSize;pxRange;weight;channels;cp;cells", "fontHash", "fieldType", "baseSize", "pxRange", "weight", "channels", "cp", "cells"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09746.class, "fontHash;fieldType;baseSize;pxRange;weight;channels;cp;cells", "fontHash", "fieldType", "baseSize", "pxRange", "weight", "channels", "cp", "cells"}, this);
    }

    public class09761[] B() {
        return this.cells;
    }

    public double i() {
        return this.weight;
    }

    public double u() {
        return this.pxRange;
    }

    public int y() {
        return this.fieldType;
    }

    public long N() {
        return this.fontHash;
    }

    public int R() {
        return this.channels;
    }
}

