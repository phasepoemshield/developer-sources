/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00405
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00405;

public class class11468
extends Record {
    public class00405 style;
    public String text;

    class11468(String string, class00405 class004052) {
        this.text = string;
        this.style = class004052;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11468.class, "text;style", "text", "style"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11468.class, "text;style", "text", "style"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11468.class, "text;style", "text", "style"}, this);
    }

    public class00405 y() {
        return this.style;
    }

    public String N() {
        return this.text;
    }
}

