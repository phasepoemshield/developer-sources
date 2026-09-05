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

public final class class03027
extends Record {
    private final double alpha;
    private final double blendingOffset;

    public class03027(double d, double d2) {
        this.alpha = d;
        this.blendingOffset = d2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03027.class, "alpha;blendingOffset", "alpha", "blendingOffset"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03027.class, "alpha;blendingOffset", "alpha", "blendingOffset"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03027.class, "alpha;blendingOffset", "alpha", "blendingOffset"}, this);
    }

    public double y() {
        return this.blendingOffset;
    }

    public double N() {
        return this.alpha;
    }
}

