/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import minecraft.class03213;
import minecraft.class03230;
import org.jspecify.annotations.Nullable;

public final class class03205<T extends class03230>
extends Record {
    private final T fastest;
    private final T slowest;
    private final @Nullable T secondSlowest;
    private final int count;
    private final Map<Integer, Double> percentilesNanos;
    private final Duration totalDuration;

    public @Nullable T L() {
        return this.secondSlowest;
    }

    public class03205(T t, T t2, @Nullable T t3, int n, Map<Integer, Double> map, Duration duration) {
        this.fastest = t;
        this.slowest = t2;
        this.secondSlowest = t3;
        this.count = n;
        this.percentilesNanos = map;
        this.totalDuration = duration;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03205.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "fastest", "slowest", "secondSlowest", "count", "percentilesNanos", "totalDuration"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03205.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "fastest", "slowest", "secondSlowest", "count", "percentilesNanos", "totalDuration"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03205.class, "fastest;slowest;secondSlowest;count;percentilesNanos;totalDuration", "fastest", "slowest", "secondSlowest", "count", "percentilesNanos", "totalDuration"}, this);
    }

    public Map<Integer, Double> i() {
        return this.percentilesNanos;
    }

    public int u() {
        return this.count;
    }

    public T y() {
        return this.slowest;
    }

    public static <T extends class03230> Optional<class03205<T>> N(List<T> list) {
        if (list.isEmpty()) {
            return Optional.empty();
        }
        List list2 = list.stream().sorted(Comparator.comparing(class03230::N)).toList();
        Duration duration = list2.stream().map(class03230::N).reduce(Duration::plus).orElse(Duration.ZERO);
        class03230 class032303 = (class03230)list2.getFirst();
        class03230 class032304 = (class03230)list2.getLast();
        class03230 class032305 = list2.size() > 1 ? (class03230)list2.get(list2.size() - 2) : null;
        int n = list2.size();
        Map<Integer, Double> var7 = class03213.N(list2.stream().mapToLong(class032302 -> class032302.N().toNanos()).toArray());
        return Optional.of(new class03205<class03230>(class032303, class032304, class032305, n, var7, duration));
    }

    public T N() {
        return this.fastest;
    }

    public Duration R() {
        return this.totalDuration;
    }
}

