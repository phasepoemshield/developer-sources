/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.MoreObjects
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.google.common.base.MoreObjects;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.time.Instant;
import java.util.List;
import java.util.TreeMap;
import java.util.stream.Collectors;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordedThread;
import minecraft.class03204;

public final class class03203
extends Record {
    private final Instant timestamp;
    private final String threadName;
    private final long totalBytes;
    private static final String u = "unknown";

    public long L() {
        return this.totalBytes;
    }

    public class03203(Instant instant, String string, long l) {
        this.timestamp = instant;
        this.threadName = string;
        this.totalBytes = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03203.class, "timestamp;threadName;totalBytes", "timestamp", "threadName", "totalBytes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03203.class, "timestamp;threadName;totalBytes", "timestamp", "threadName", "totalBytes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03203.class, "timestamp;threadName;totalBytes", "timestamp", "threadName", "totalBytes"}, this);
    }

    public String y() {
        return this.threadName;
    }

    public static class03203 N(RecordedEvent recordedEvent) {
        RecordedThread recordedThread = recordedEvent.getThread("thread");
        String string = recordedThread == null ? u : (String)MoreObjects.firstNonNull((Object)recordedThread.getJavaName(), (Object)u);
        return new class03203(recordedEvent.getStartTime(), string, recordedEvent.getLong("allocated"));
    }

    public static class03204 N(List<class03203> list2) {
        TreeMap<String, Double> treeMap = new TreeMap<String, Double>();
        list2.stream().collect(Collectors.groupingBy(class032032 -> class032032.threadName)).forEach((string, list) -> {
            if (list.size() < 2) {
                return;
            }
            class03203 class032032 = (class03203)((Object)((Object)list.get(0)));
            class03203 class032033 = (class03203)((Object)((Object)list.get(list.size() - 1)));
            long l = Duration.between(class032032.timestamp, class032033.timestamp).getSeconds();
            long l2 = class032033.totalBytes - class032032.totalBytes;
            treeMap.put((String)string, (double)l2 / (double)l);
        });
        return new class03204(treeMap);
    }

    public Instant N() {
        return this.timestamp;
    }
}

