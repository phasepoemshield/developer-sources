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
import java.time.Duration;

public final class class03214
extends Record {
    private final Duration duration;
    private final Duration gcTotalDuration;
    private final int totalGCs;
    private final double allocationRateBytesPerSecond;

    public Duration L() {
        return this.gcTotalDuration;
    }

    public class03214(Duration duration, Duration duration2, int n, double d) {
        this.duration = duration;
        this.gcTotalDuration = duration2;
        this.totalGCs = n;
        this.allocationRateBytesPerSecond = d;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03214.class, "duration;gcTotalDuration;totalGCs;allocationRateBytesPerSecond", "duration", "gcTotalDuration", "totalGCs", "allocationRateBytesPerSecond"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03214.class, "duration;gcTotalDuration;totalGCs;allocationRateBytesPerSecond", "duration", "gcTotalDuration", "totalGCs", "allocationRateBytesPerSecond"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03214.class, "duration;gcTotalDuration;totalGCs;allocationRateBytesPerSecond", "duration", "gcTotalDuration", "totalGCs", "allocationRateBytesPerSecond"}, this);
    }

    public double i() {
        return this.allocationRateBytesPerSecond;
    }

    public int u() {
        return this.totalGCs;
    }

    public Duration y() {
        return this.duration;
    }

    public float N() {
        return (float)this.gcTotalDuration.toMillis() / (float)this.duration.toMillis();
    }
}

