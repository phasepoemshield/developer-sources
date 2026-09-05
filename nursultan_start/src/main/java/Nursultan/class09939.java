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

public class class09939
extends Record {
    public String owner;
    public String name;

    class09939(String string, String string2) {
        this.owner = string;
        this.name = string2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09939.class, "owner;name", "owner", "name"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09939.class, "owner;name", "owner", "name"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09939.class, "owner;name", "owner", "name"}, this);
    }

    public String y() {
        return this.name;
    }

    public String N() {
        return this.owner;
    }
}

