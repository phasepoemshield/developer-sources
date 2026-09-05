/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11499
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class11499;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class11096
extends Record {
    public class11499 rotation;
    public boolean overshooting;

    public class11096(class11499 class114992, boolean bl) {
        this.rotation = class114992;
        this.overshooting = bl;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11096.class, "rotation;overshooting", "rotation", "overshooting"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11096.class, "rotation;overshooting", "rotation", "overshooting"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11096.class, "rotation;overshooting", "rotation", "overshooting"}, this);
    }

    public class11499 y() {
        return this.rotation;
    }

    public boolean N() {
        return this.overshooting;
    }
}

