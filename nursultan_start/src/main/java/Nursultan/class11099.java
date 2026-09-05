/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00381;

public class class11099
extends Record {
    public long time;
    public class00381<?> packet;

    class11099(class00381<?> class003812, long l) {
        this.packet = class003812;
        this.time = l;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11099.class, "packet;time", "packet", "time"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11099.class, "packet;time", "packet", "time"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11099.class, "packet;time", "packet", "time"}, this);
    }

    public class00381<?> y() {
        return this.packet;
    }

    public long N() {
        return this.time;
    }
}

