/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00392;

public class class11432
extends Record {
    public String keyLower;
    public class00392 replacement;

    class11432(String string, class00392 class003922) {
        this.keyLower = string;
        this.replacement = class003922;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class11432.class, "keyLower;replacement", "keyLower", "replacement"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class11432.class, "keyLower;replacement", "keyLower", "replacement"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class11432.class, "keyLower;replacement", "keyLower", "replacement"}, this);
    }

    public class00392 y() {
        return this.replacement;
    }

    public String N() {
        return this.keyLower;
    }
}

