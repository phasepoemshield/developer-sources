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

public final class class08192
extends Record {
    private final long creationTime;
    private final long accumulatedElapsedTime;

    public class08192(long l) {
        this(l, 0L);
    }

    public class08192(long l, long l2) {
        this.creationTime = l;
        this.accumulatedElapsedTime = l2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08192.class, "creationTime;accumulatedElapsedTime", "creationTime", "accumulatedElapsedTime"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08192.class, "creationTime;accumulatedElapsedTime", "creationTime", "accumulatedElapsedTime"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08192.class, "creationTime;accumulatedElapsedTime", "creationTime", "accumulatedElapsedTime"}, this);
    }

    public long y() {
        return this.accumulatedElapsedTime;
    }

    public double y(long l) {
        return (double)this.N(l) / 1000.0;
    }

    public long N() {
        return this.creationTime;
    }

    public long N(long l) {
        long l2 = l - this.creationTime;
        return this.accumulatedElapsedTime + l2;
    }
}

