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

public final class class09764
extends Record {
    public final String location;
    public final Class<? extends Throwable> cls;

    public class09764(String string, Class<? extends Throwable> clazz) {
        this.location = string;
        this.cls = clazz;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09764.class, "location;cls", "location", "cls"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09764.class, "location;cls", "location", "cls"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09764.class, "location;cls", "location", "cls"}, this);
    }

    public Class<? extends Throwable> y() {
        return this.cls;
    }

    public String N() {
        return this.location;
    }
}

