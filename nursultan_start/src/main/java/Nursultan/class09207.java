/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11290
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11290;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09207
extends Record {
    public class11290 preset;
    public boolean last;

    public class09207(class11290 class112902, boolean bl) {
        this.preset = class112902;
        this.last = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09207.class, "preset;last", "preset", "last"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09207.class, "preset;last", "preset", "last"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09207.class, "preset;last", "preset", "last"}, this);
    }

    public boolean y() {
        return this.last;
    }

    public class11290 N() {
        return this.preset;
    }
}

