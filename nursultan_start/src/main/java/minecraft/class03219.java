/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import minecraft.class03234;
import org.jspecify.annotations.Nullable;

public final class class03219
extends Record {
    private final Duration duration;
    private final @Nullable String path;
    private final long bytes;

    public long L() {
        return this.bytes;
    }

    public class03219(Duration duration, @Nullable String string, long l) {
        this.duration = duration;
        this.path = string;
        this.bytes = l;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03219.class, "duration;path;bytes", "duration", "path", "bytes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03219.class, "duration;path;bytes", "duration", "path", "bytes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03219.class, "duration;path;bytes", "duration", "path", "bytes"}, this);
    }

    public @Nullable String y() {
        return this.path;
    }

    public Duration N() {
        return this.duration;
    }

    public static class03234 N(Duration duration, List<class03219> list) {
        long l = list.stream().mapToLong(class032192 -> class032192.bytes).sum();
        return new class03234(l, (double)l / (double)duration.getSeconds(), list.size(), (double)list.size() / (double)duration.getSeconds(), list.stream().map(class03219::N).reduce(Duration.ZERO, Duration::plus), list.stream().filter(class032192 -> class032192.path != null).collect(Collectors.groupingBy(class032192 -> class032192.path, Collectors.summingLong(class032192 -> class032192.bytes))).entrySet().stream().sorted(Map.Entry.comparingByValue().reversed()).map(entry -> Pair.of((Object)((String)entry.getKey()), (Object)((Long)entry.getValue()))).limit(10L).toList());
    }
}

