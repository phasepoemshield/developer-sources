/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09054
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package Nursultan;

import Nursultan.class09054;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public class class09200
extends Record {
    public class09054 type;
    public String entryKey;

    class09200(String string, class09054 class090542) {
        this.entryKey = string;
        this.type = class090542;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09200.class, "entryKey;type", "entryKey", "type"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09200.class, "entryKey;type", "entryKey", "type"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09200.class, "entryKey;type", "entryKey", "type"}, this);
    }

    public class09054 y() {
        return this.type;
    }

    public String N() {
        return this.entryKey;
    }
}

