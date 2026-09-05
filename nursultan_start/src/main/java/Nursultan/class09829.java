/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09874;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09829
extends Record {
    private final class09874 path;
    private final String name;

    class09829(class09874 class098742, String string) {
        this.path = class098742;
        this.name = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09829.class, "path;name", "path", "name"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09829.class, "path;name", "path", "name"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09829.class, "path;name", "path", "name"}, this);
    }

    public String y() {
        return this.name;
    }

    public class09874 N() {
        return this.path;
    }
}

