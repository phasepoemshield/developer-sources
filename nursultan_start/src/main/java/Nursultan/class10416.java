/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class04489
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class04489;

public final class class10416
extends Record
implements class04489 {
    private final String name;
    private final int index;

    public class10416(String string, int n) {
        this.name = string;
        this.index = n;
    }

    public String get() {
        return "." + this.name + "[" + this.index + "]";
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10416.class, "name;index", "name", "index"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10416.class, "name;index", "name", "index"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10416.class, "name;index", "name", "index"}, this);
    }

    public int y() {
        return this.index;
    }

    public String N() {
        return this.name;
    }
}

