/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01215
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01215;

public final class class09443
extends Record {
    final class01215 entry;
    private final String source;

    public class09443(class01215 class012152, String string) {
        this.entry = class012152;
        this.source = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09443.class, "entry;source", "entry", "source"}, this, object);
    }

    public String toString() {
        return String.valueOf(this.entry) + " (from " + this.source + ")";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09443.class, "entry;source", "entry", "source"}, this);
    }

    public String y() {
        return this.source;
    }

    public class01215 N() {
        return this.entry;
    }
}

