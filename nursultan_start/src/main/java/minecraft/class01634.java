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

final class class01634
extends Record {
    final int count;
    final int age;
    static final class01634 L = new class01634(0, Integer.MAX_VALUE);

    private class01634(int n, int n2) {
        this.count = n;
        this.age = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01634.class, "count;age", "count", "age"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01634.class, "count;age", "count", "age"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01634.class, "count;age", "count", "age"}, this);
    }

    public int y() {
        return this.age;
    }

    public int N() {
        return this.count;
    }

    public class01634 N(int n) {
        if (n == this.age) {
            return new class01634(this.count + 1, n);
        }
        if (n < this.age) {
            return new class01634(1, n);
        }
        return this;
    }
}

