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
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;
import minecraft.class03210;
import minecraft.class03214;

public final class class03225
extends Record {
    private final Instant timestamp;
    private final long heapUsed;
    private final class03210 timing;

    public class03210 L() {
        return this.timing;
    }

    public class03225(Instant instant, long l, class03210 class032102) {
        this.timestamp = instant;
        this.heapUsed = l;
        this.timing = class032102;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03225.class, "timestamp;heapUsed;timing", "timestamp", "heapUsed", "timing"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03225.class, "timestamp;heapUsed;timing", "timestamp", "heapUsed", "timing"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03225.class, "timestamp;heapUsed;timing", "timestamp", "heapUsed", "timing"}, this);
    }

    public long y() {
        return this.heapUsed;
    }

    private static double N(List<class03225> list) {
        long l = 0L;
        Map<class03210, List<class03225>> map = list.stream().collect(Collectors.groupingBy(class032252 -> class032252.timing));
        List<class03225> list2 = map.get((Object)class03210.field_34443);
        List<class03225> list3 = map.get((Object)class03210.field_34444);
        for (int i = 1; i < list2.size(); ++i) {
            class03225 class032253 = list2.get(i);
            class03225 class032254 = list3.get(i - 1);
            l += class032253.heapUsed - class032254.heapUsed;
        }
        Duration duration = Duration.between(list.get((int)1).timestamp, list.get((int)(list.size() - 1)).timestamp);
        return (double)l / (double)duration.getSeconds();
    }

    public static class03225 N(RecordedEvent recordedEvent) {
        return new class03225(recordedEvent.getStartTime(), recordedEvent.getLong("heapUsed"), recordedEvent.getString("when").equalsIgnoreCase("before gc") ? class03210.field_34443 : class03210.field_34444);
    }

    public Instant N() {
        return this.timestamp;
    }

    public static class03214 N(Duration duration, List<class03225> list, Duration duration2, int n) {
        return new class03214(duration, duration2, n, class03225.N(list));
    }
}

