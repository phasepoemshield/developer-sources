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

public final class class04272
extends Record {
    private final int numberOfTries;
    private final boolean haltOnFailure;
    private static final class04272 L = new class04272(1, true);

    public boolean L() {
        return this.numberOfTries != 1;
    }

    public class04272(int n, boolean bl) {
        this.numberOfTries = n;
        this.haltOnFailure = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class04272.class, "numberOfTries;haltOnFailure", "numberOfTries", "haltOnFailure"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class04272.class, "numberOfTries;haltOnFailure", "numberOfTries", "haltOnFailure"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class04272.class, "numberOfTries;haltOnFailure", "numberOfTries", "haltOnFailure"}, this);
    }

    public boolean i() {
        return this.haltOnFailure;
    }

    public int u() {
        return this.numberOfTries;
    }

    public boolean y() {
        return this.numberOfTries < 1;
    }

    public boolean N(int n, int n2) {
        boolean bl = n != n2;
        return (this.y() || n < this.numberOfTries) && (!bl || !this.haltOnFailure);
    }

    public static class04272 N() {
        return L;
    }
}

