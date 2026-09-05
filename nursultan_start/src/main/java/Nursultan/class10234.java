/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class06909
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class06909;

public final class class10234
extends Record {
    private final class06909 row;
    private final int column;
    private final int page;

    public int L() {
        return this.page;
    }

    public class10234(class06909 class069092, int n, int n2) {
        this.row = class069092;
        this.column = n;
        this.page = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10234.class, "row;column;page", "row", "column", "page"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10234.class, "row;column;page", "row", "column", "page"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10234.class, "row;column;page", "row", "column", "page"}, this);
    }

    public int y() {
        return this.column;
    }

    public class06909 N() {
        return this.row;
    }
}

