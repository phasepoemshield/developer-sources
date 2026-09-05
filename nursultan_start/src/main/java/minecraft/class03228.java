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
import java.time.Instant;
import jdk.jfr.consumer.RecordedEvent;

public final class class03228
extends Record {
    private final Instant timestamp;
    private final Duration currentAverage;

    public class03228(Instant instant, Duration duration) {
        this.timestamp = instant;
        this.currentAverage = duration;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03228.class, "timestamp;currentAverage", "timestamp", "currentAverage"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03228.class, "timestamp;currentAverage", "timestamp", "currentAverage"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03228.class, "timestamp;currentAverage", "timestamp", "currentAverage"}, this);
    }

    public Duration y() {
        return this.currentAverage;
    }

    public Instant N() {
        return this.timestamp;
    }

    public static class03228 N(RecordedEvent recordedEvent) {
        return new class03228(recordedEvent.getStartTime(), recordedEvent.getDuration("averageTickDuration"));
    }
}

