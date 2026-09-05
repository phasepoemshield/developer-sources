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

public class class09143
extends Record {
    public float multiplier;
    public float envelope;
    public boolean active;

    public boolean L() {
        return this.active;
    }

    public class09143(boolean bl, float f, float f2) {
        this.active = bl;
        this.multiplier = f;
        this.envelope = f2;
    }

    public boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class09143.class, "active;multiplier;envelope", "active", "multiplier", "envelope"}, this, object);
    }

    public String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class09143.class, "active;multiplier;envelope", "active", "multiplier", "envelope"}, this);
    }

    public int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class09143.class, "active;multiplier;envelope", "active", "multiplier", "envelope"}, this);
    }

    public float u() {
        return this.envelope;
    }

    public static class09143 y() {
        return new class09143(false, 1.0f, 0.0f);
    }

    public float N() {
        return this.multiplier;
    }
}

