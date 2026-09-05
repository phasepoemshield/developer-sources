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

public class class10917
extends Record {
    public String command;
    public int tick;

    class10917(String string, int n) {
        this.command = string;
        this.tick = n;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class10917.class, "command;tick", "command", "tick"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class10917.class, "command;tick", "command", "tick"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class10917.class, "command;tick", "command", "tick"}, this);
    }

    public int y() {
        return this.tick;
    }

    public String N() {
        return this.command;
    }
}

