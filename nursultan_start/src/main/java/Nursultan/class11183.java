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

public class class11183
extends Record {
    public int internalFormat;
    public int format;
    public int type;

    public int L() {
        return this.format;
    }

    public class11183(int n, int n2, int n3) {
        this.internalFormat = n;
        this.format = n2;
        this.type = n3;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11183.class, "internalFormat;format;type", "internalFormat", "format", "type"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11183.class, "internalFormat;format;type", "internalFormat", "format", "type"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11183.class, "internalFormat;format;type", "internalFormat", "format", "type"}, this);
    }

    public int y() {
        return this.internalFormat;
    }

    public int N() {
        return this.type;
    }
}

