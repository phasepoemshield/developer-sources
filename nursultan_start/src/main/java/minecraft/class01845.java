/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class07209
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class07209;

final class class01845
extends Record {
    private final class07209 location;
    private final long fitness;

    class01845(class07209 class072092, long l) {
        this.location = class072092;
        this.fitness = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01845.class, "location;fitness", "location", "fitness"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01845.class, "location;fitness", "location", "fitness"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01845.class, "location;fitness", "location", "fitness"}, this);
    }

    public long y() {
        return this.fitness;
    }

    public class07209 N() {
        return this.location;
    }
}

