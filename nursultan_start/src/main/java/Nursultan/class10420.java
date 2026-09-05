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

public final class class10420
extends Record
implements class04489 {
    private final String name;

    public class10420(String string) {
        this.name = string;
    }

    public String get() {
        return this.name;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10420.class, "name", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10420.class, "name", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10420.class, "name", "name"}, this);
    }

    public String N() {
        return this.name;
    }
}

