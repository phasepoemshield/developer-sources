/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00381
 *  minecraft.class01636
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.function.BooleanSupplier;
import minecraft.class00381;
import minecraft.class01636;

final class class01884
extends Record {
    final class00381<? extends class01636> packet;
    private final BooleanSupplier sendCondition;
    private final long expirationTime;

    public long L() {
        return this.expirationTime;
    }

    class01884(class00381<? extends class01636> class003812, BooleanSupplier booleanSupplier, long l) {
        this.packet = class003812;
        this.sendCondition = booleanSupplier;
        this.expirationTime = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01884.class, "packet;sendCondition;expirationTime", "packet", "sendCondition", "expirationTime"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01884.class, "packet;sendCondition;expirationTime", "packet", "sendCondition", "expirationTime"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01884.class, "packet;sendCondition;expirationTime", "packet", "sendCondition", "expirationTime"}, this);
    }

    public BooleanSupplier y() {
        return this.sendCondition;
    }

    public class00381<? extends class01636> N() {
        return this.packet;
    }
}

