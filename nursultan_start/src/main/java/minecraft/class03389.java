/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.UUID;
import minecraft.class03404;

final class class03389
extends Record {
    private final UUID sender;
    private final class03404 entry;

    class03389(UUID uUID, class03404 class034042) {
        this.sender = uUID;
        this.entry = class034042;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03389.class, "sender;entry", "sender", "entry"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03389.class, "sender;entry", "sender", "entry"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03389.class, "sender;entry", "sender", "entry"}, this);
    }

    public class03404 y() {
        return this.entry;
    }

    public UUID N() {
        return this.sender;
    }

    public boolean N(class03389 class033892) {
        return class033892.sender.equals(this.sender);
    }
}

