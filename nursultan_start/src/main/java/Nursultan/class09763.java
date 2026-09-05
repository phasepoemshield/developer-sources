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

public final class class09763
extends Record {
    public final long timestampMs;
    public final String location;
    public final Class<? extends Throwable> cls;
    public final String message;

    public Class<? extends Throwable> L() {
        return this.cls;
    }

    public class09763(long l, String string, Class<? extends Throwable> clazz, String string2) {
        this.timestampMs = l;
        this.location = string;
        this.cls = clazz;
        this.message = string2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09763.class, "timestampMs;location;cls;message", "timestampMs", "location", "cls", "message"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09763.class, "timestampMs;location;cls;message", "timestampMs", "location", "cls", "message"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09763.class, "timestampMs;location;cls;message", "timestampMs", "location", "cls", "message"}, this);
    }

    public String u() {
        return this.message;
    }

    public String y() {
        return this.location;
    }

    public long N() {
        return this.timestampMs;
    }
}

