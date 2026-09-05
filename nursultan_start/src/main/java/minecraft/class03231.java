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

public final class class03231
extends Record {
    final long temperature;
    final long humidity;
    final long continentalness;
    final long erosion;
    final long depth;
    final long weirdness;

    public long L() {
        return this.humidity;
    }

    public long M() {
        return this.weirdness;
    }

    public class03231(long l, long l2, long l3, long l4, long l5, long l6) {
        this.temperature = l;
        this.humidity = l2;
        this.continentalness = l3;
        this.erosion = l4;
        this.depth = l5;
        this.weirdness = l6;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03231.class, "temperature;humidity;continentalness;erosion;depth;weirdness", "temperature", "humidity", "continentalness", "erosion", "depth", "weirdness"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03231.class, "temperature;humidity;continentalness;erosion;depth;weirdness", "temperature", "humidity", "continentalness", "erosion", "depth", "weirdness"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03231.class, "temperature;humidity;continentalness;erosion;depth;weirdness", "temperature", "humidity", "continentalness", "erosion", "depth", "weirdness"}, this);
    }

    public long i() {
        return this.erosion;
    }

    public long u() {
        return this.continentalness;
    }

    public long y() {
        return this.temperature;
    }

    protected long[] N() {
        return new long[]{this.temperature, this.humidity, this.continentalness, this.erosion, this.depth, this.weirdness, 0L};
    }

    public long R() {
        return this.depth;
    }
}

