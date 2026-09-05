/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09799;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

final class class09811
extends Record {
    private final class09799 root;

    class09811(class09799 class097992) {
        this.root = class097992;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09811.class, "root", "root"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09811.class, "root", "root"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09811.class, "root", "root"}, this);
    }

    public class09799 N() {
        return this.root;
    }
}

