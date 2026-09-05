/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11795;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11803
extends Record {
    public class11795 factory;
    public String packagePrefix;

    class11803(String string, class11795 class117952) {
        this.packagePrefix = string;
        this.factory = class117952;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11803.class, "packagePrefix;factory", "packagePrefix", "factory"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11803.class, "packagePrefix;factory", "packagePrefix", "factory"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11803.class, "packagePrefix;factory", "packagePrefix", "factory"}, this);
    }

    public String y() {
        return this.packagePrefix;
    }

    public class11795 N() {
        return this.factory;
    }
}

