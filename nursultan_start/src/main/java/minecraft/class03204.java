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
import java.util.Map;

public final class class03204
extends Record {
    private final Map<String, Double> allocationsPerSecondByThread;

    public class03204(Map<String, Double> map) {
        this.allocationsPerSecondByThread = map;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03204.class, "allocationsPerSecondByThread", "allocationsPerSecondByThread"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03204.class, "allocationsPerSecondByThread", "allocationsPerSecondByThread"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03204.class, "allocationsPerSecondByThread", "allocationsPerSecondByThread"}, this);
    }

    public Map<String, Double> N() {
        return this.allocationsPerSecondByThread;
    }
}

