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

public class class09307
extends Record {
    public int size;
    public int type;
    public String name;

    public String L() {
        return this.name;
    }

    class09307(String string, int n, int n2) {
        this.name = string;
        this.type = n;
        this.size = n2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09307.class, "name;type;size", "name", "type", "size"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09307.class, "name;type;size", "name", "type", "size"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09307.class, "name;type;size", "name", "type", "size"}, this);
    }

    public int y() {
        return this.size;
    }

    public int N() {
        return this.type;
    }
}

