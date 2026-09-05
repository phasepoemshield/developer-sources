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

public class class11132
extends Record {
    public int hash;
    public String seller;

    class11132(String string, int n) {
        this.seller = string;
        this.hash = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11132.class, "seller;hash", "seller", "hash"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11132.class, "seller;hash", "seller", "hash"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11132.class, "seller;hash", "seller", "hash"}, this);
    }

    public int y() {
        return this.hash;
    }

    public String N() {
        return this.seller;
    }
}

