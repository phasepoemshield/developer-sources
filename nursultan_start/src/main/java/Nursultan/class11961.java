/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11951;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.Supplier;

public class class11961
extends Record {
    public int since;
    public Supplier<? extends class11951<?>> supplier;
    public int untilExclusive;

    public int L() {
        return this.untilExclusive;
    }

    class11961(Supplier<? extends class11951<?>> supplier, int n, int n2) {
        this.supplier = supplier;
        this.since = n;
        this.untilExclusive = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11961.class, "supplier;since;untilExclusive", "supplier", "since", "untilExclusive"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11961.class, "supplier;since;untilExclusive", "supplier", "since", "untilExclusive"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11961.class, "supplier;since;untilExclusive", "supplier", "since", "untilExclusive"}, this);
    }

    public int y() {
        return this.since;
    }

    boolean y(int n) {
        return n >= this.since && n < this.untilExclusive;
    }

    public Supplier<? extends class11951<?>> N() {
        return this.supplier;
    }
}

