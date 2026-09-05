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

public class class11282
extends Record {
    public int from;
    public int to;

    public class11282(int n, int n2) {
        this.from = n;
        this.to = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11282.class, "from;to", "from", "to"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11282.class, "from;to", "from", "to"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11282.class, "from;to", "from", "to"}, this);
    }

    public int y() {
        return this.from;
    }

    public int N() {
        return this.to;
    }
}

