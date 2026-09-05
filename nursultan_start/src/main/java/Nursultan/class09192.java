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

public class class09192
extends Record {
    public int days;
    public String entryKey;

    class09192(String string, int n) {
        this.entryKey = string;
        this.days = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09192.class, "entryKey;days", "entryKey", "days"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09192.class, "entryKey;days", "entryKey", "days"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09192.class, "entryKey;days", "entryKey", "days"}, this);
    }

    public int y() {
        return this.days;
    }

    public String N() {
        return this.entryKey;
    }
}

