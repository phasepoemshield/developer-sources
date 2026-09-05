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

final class class09714
extends Record {
    private final int[] start;
    private final int[] end;
    private final int[] cls;

    public int[] L() {
        return this.cls;
    }

    class09714(int[] nArray, int[] nArray2, int[] nArray3) {
        this.start = nArray;
        this.end = nArray2;
        this.cls = nArray3;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09714.class, "start;end;cls", "start", "end", "cls"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09714.class, "start;end;cls", "start", "end", "cls"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09714.class, "start;end;cls", "start", "end", "cls"}, this);
    }

    public int[] y() {
        return this.end;
    }

    public int[] N() {
        return this.start;
    }

    int N(int n) {
        int n2 = 0;
        int n3 = this.start.length - 1;
        while (n2 <= n3) {
            int n4 = n2 + n3 >>> 1;
            if (n < this.start[n4]) {
                n3 = n4 - 1;
                continue;
            }
            if (n > this.end[n4]) {
                n2 = n4 + 1;
                continue;
            }
            return this.cls[n4];
        }
        return 0;
    }
}

