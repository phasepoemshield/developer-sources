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

public class class11471
extends Record {
    public int start;
    public int end;

    class11471(int n, int n2) {
        this.start = n;
        this.end = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11471.class, "start;end", "start", "end"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11471.class, "start;end", "start", "end"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11471.class, "start;end", "start", "end"}, this);
    }

    public int y() {
        return this.start;
    }

    public int N() {
        return this.end;
    }
}

