/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.util.List;

public final class class03234
extends Record {
    private final long totalBytes;
    private final double bytesPerSecond;
    private final long counts;
    private final double countsPerSecond;
    private final Duration timeSpentInIO;
    private final List<Pair<String, Long>> topTenContributorsByTotalBytes;

    public long L() {
        return this.counts;
    }

    public class03234(long l, double d, long l2, double d2, Duration duration, List<Pair<String, Long>> list) {
        this.totalBytes = l;
        this.bytesPerSecond = d;
        this.counts = l2;
        this.countsPerSecond = d2;
        this.timeSpentInIO = duration;
        this.topTenContributorsByTotalBytes = list;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03234.class, "totalBytes;bytesPerSecond;counts;countsPerSecond;timeSpentInIO;topTenContributorsByTotalBytes", "totalBytes", "bytesPerSecond", "counts", "countsPerSecond", "timeSpentInIO", "topTenContributorsByTotalBytes"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03234.class, "totalBytes;bytesPerSecond;counts;countsPerSecond;timeSpentInIO;topTenContributorsByTotalBytes", "totalBytes", "bytesPerSecond", "counts", "countsPerSecond", "timeSpentInIO", "topTenContributorsByTotalBytes"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03234.class, "totalBytes;bytesPerSecond;counts;countsPerSecond;timeSpentInIO;topTenContributorsByTotalBytes", "totalBytes", "bytesPerSecond", "counts", "countsPerSecond", "timeSpentInIO", "topTenContributorsByTotalBytes"}, this);
    }

    public Duration i() {
        return this.timeSpentInIO;
    }

    public double u() {
        return this.countsPerSecond;
    }

    public double y() {
        return this.bytesPerSecond;
    }

    public long N() {
        return this.totalBytes;
    }

    public List<Pair<String, Long>> R() {
        return this.topTenContributorsByTotalBytes;
    }
}

