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

final class class09739
extends Record {
    private final int type;
    private final double[] c;

    class09739(int n, double[] dArray) {
        this.type = n;
        this.c = dArray;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09739.class, "type;c", "type", "c"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09739.class, "type;c", "type", "c"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09739.class, "type;c", "type", "c"}, this);
    }

    public double[] y() {
        return this.c;
    }

    public int N() {
        return this.type;
    }
}

