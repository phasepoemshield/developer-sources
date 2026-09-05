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

public class class11137
extends Record {
    public int slot;
    public int syncId;

    class11137(int n, int n2) {
        this.syncId = n;
        this.slot = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11137.class, "syncId;slot", "syncId", "slot"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11137.class, "syncId;slot", "syncId", "slot"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11137.class, "syncId;slot", "syncId", "slot"}, this);
    }

    public int y() {
        return this.syncId;
    }

    public int N() {
        return this.slot;
    }
}

