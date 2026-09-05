/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class07463
 *  minecraft.class07471
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class07463;
import minecraft.class07471;

final class class07073
extends Record {
    private final class01894 id;
    private final double amount;
    private final class07463 operation;

    public class07463 L() {
        return this.operation;
    }

    class07073(class01894 class018942, double d, class07463 class074632) {
        this.id = class018942;
        this.amount = d;
        this.operation = class074632;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class07073.class, "id;amount;operation", "id", "amount", "operation"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class07073.class, "id;amount;operation", "id", "amount", "operation"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class07073.class, "id;amount;operation", "id", "amount", "operation"}, this);
    }

    public double y() {
        return this.amount;
    }

    public class01894 N() {
        return this.id;
    }

    public class07471 N(int n) {
        return new class07471(this.id, this.amount * (double)(n + 1), this.operation);
    }
}

