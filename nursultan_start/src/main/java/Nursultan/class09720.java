/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09724;
import Nursultan.class09726;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09720
extends Record
implements class09724 {
    private final class09726 newPage;
    private final class09726 oldPage;
    private final int width;
    private final int height;
    private final int[] cp;
    private final int[] x;
    private final int[] y;
    private final int[] w;
    private final int[] h;
    private final int count;

    public int L() {
        return this.width;
    }

    public int[] M() {
        return this.y;
    }

    class09720(class09726 class097262, class09726 class097263, int n, int n2, int[] nArray, int[] nArray2, int[] nArray3, int[] nArray4, int[] nArray5, int n3) {
        this.newPage = class097262;
        this.oldPage = class097263;
        this.width = n;
        this.height = n2;
        this.cp = nArray;
        this.x = nArray2;
        this.y = nArray3;
        this.w = nArray4;
        this.h = nArray5;
        this.count = n3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09720.class, "newPage;oldPage;width;height;cp;x;y;w;h;count", "newPage", "oldPage", "width", "height", "cp", "x", "y", "w", "h", "count"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09720.class, "newPage;oldPage;width;height;cp;x;y;w;h;count", "newPage", "oldPage", "width", "height", "cp", "x", "y", "w", "h", "count"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09720.class, "newPage;oldPage;width;height;cp;x;y;w;h;count", "newPage", "oldPage", "width", "height", "cp", "x", "y", "w", "h", "count"}, this);
    }

    public int[] B() {
        return this.w;
    }

    public int[] Z() {
        return this.h;
    }

    public int[] i() {
        return this.cp;
    }

    public int z() {
        return this.count;
    }

    public int u() {
        return this.height;
    }

    public class09726 y() {
        return this.oldPage;
    }

    public class09726 N() {
        return this.newPage;
    }

    public int[] R() {
        return this.x;
    }
}

