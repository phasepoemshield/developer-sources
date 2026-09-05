/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00494
 */
package Nursultan;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00494;

public final class class09409
extends Record {
    private final class00494 first;
    private final class00494 second;

    public class09409(class00494 class004942, class00494 class004943) {
        this.first = class004942;
        this.second = class004943;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public boolean equals(Object object) {
        if (!(object instanceof class09409)) return false;
        class09409 class094092 = (class09409)((Object)object);
        if (this.first != class094092.first) return false;
        if (this.second != class094092.second) return false;
        return true;
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09409.class, "first;second", "first", "second"}, this);
    }

    public int hashCode() {
        return System.identityHashCode(this.first) * 31 + System.identityHashCode(this.second);
    }

    public class00494 y() {
        return this.second;
    }

    public class00494 N() {
        return this.first;
    }
}

