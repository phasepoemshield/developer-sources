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

public class class10885
extends Record {
    public String access;
    public String refresh;

    public class10885(String string, String string2) {
        this.access = string;
        this.refresh = string2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10885.class, "access;refresh", "access", "refresh"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10885.class, "access;refresh", "access", "refresh"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10885.class, "access;refresh", "access", "refresh"}, this);
    }

    public String y() {
        return this.refresh;
    }

    public String N() {
        return this.access;
    }
}

