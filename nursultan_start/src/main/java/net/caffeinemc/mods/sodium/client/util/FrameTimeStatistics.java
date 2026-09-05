/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.LongComparator
 *  it.unimi.dsi.fastutil.longs.LongComparators
 *  it.unimi.dsi.fastutil.longs.LongHeaps
 *  it.unimi.dsi.fastutil.objects.Reference2LongArrayMap
 */
package net.caffeinemc.mods.sodium.client.util;

import it.unimi.dsi.fastutil.longs.LongComparator;
import it.unimi.dsi.fastutil.longs.LongComparators;
import it.unimi.dsi.fastutil.longs.LongHeaps;
import it.unimi.dsi.fastutil.objects.Reference2LongArrayMap;
import java.util.Arrays;
import java.util.Comparator;
import net.caffeinemc.mods.sodium.client.util.FrameTimeStatistics$Percentile;

public final class FrameTimeStatistics {
    private static final int SAMPLE_COUNT = 1000;
    private static final FrameTimeStatistics$Percentile[] PERCENTILES = new FrameTimeStatistics$Percentile[]{new FrameTimeStatistics$Percentile("p50", 200, 0.5f), new FrameTimeStatistics$Percentile("p98", Integer.MAX_VALUE, 0.98f), new FrameTimeStatistics$Percentile("p99.5", Integer.MAX_VALUE, 0.995f)};
    private static final FrameTimeStatistics$Percentile[] CALCULATION_ORDER = FrameTimeStatistics.computeCalculationOrder();
    public static final FrameTimeStatistics INSTANCE = new FrameTimeStatistics();
    private static final LongComparator HEAP_COMPARATOR = LongComparators.OPPOSITE_COMPARATOR;
    private final long[] samples = new long[1000];
    private int writeIndex = 0;
    private int sampleSize = 0;
    private long[] heap;
    private volatile Reference2LongArrayMap<FrameTimeStatistics$Percentile> cached;

    private FrameTimeStatistics() {
    }

    public Reference2LongArrayMap<FrameTimeStatistics$Percentile> get() {
        if (this.cached == null) {
            this.cached = this.compute();
        }
        return this.cached;
    }

    private Reference2LongArrayMap<FrameTimeStatistics$Percentile> compute() {
        int n = this.sampleSize;
        if (n <= 0) {
            return null;
        }
        if (this.heap == null) {
            this.heap = new long[1000];
        }
        long[] lArray = this.heap;
        Reference2LongArrayMap reference2LongArrayMap = new Reference2LongArrayMap(PERCENTILES.length);
        for (FrameTimeStatistics$Percentile frameTimeStatistics$Percentile : PERCENTILES) {
            reference2LongArrayMap.put((Object)frameTimeStatistics$Percentile, -1L);
        }
        int n2 = 0;
        int n3 = 0;
        for (FrameTimeStatistics$Percentile frameTimeStatistics$Percentile : CALCULATION_ORDER) {
            int n4 = Math.min(frameTimeStatistics$Percentile.window(), n);
            if (n4 > n2) {
                this.copyMostRecentSamples(lArray, n2, n4 - n2);
                LongHeaps.makeHeap((long[])lArray, (int)n4, (LongComparator)HEAP_COMPARATOR);
                n2 = n4;
                n3 = n4;
            }
            n3 = FrameTimeStatistics.popDownTo(lArray, n3, n4 - FrameTimeStatistics.rankFromTop(frameTimeStatistics$Percentile.p(), n4));
            reference2LongArrayMap.put((Object)frameTimeStatistics$Percentile, lArray[0]);
        }
        return reference2LongArrayMap;
    }

    public void logSample(long l) {
        this.samples[this.writeIndex] = l;
        this.writeIndex = (this.writeIndex + 1) % 1000;
        if (this.sampleSize < 1000) {
            ++this.sampleSize;
        }
    }

    public void invalidate() {
        this.cached = null;
    }

    private static int rankFromTop(double d, int n) {
        int n2 = (int)Math.floor((1.0 - d) * (double)n);
        if (n2 < 0) {
            return 0;
        }
        if (n2 >= n) {
            return n - 1;
        }
        return n2;
    }

    private void copyMostRecentSamples(long[] lArray, int n, int n2) {
        if (n2 <= 0) {
            return;
        }
        int n3 = Math.floorMod(this.writeIndex - n - n2, 1000);
        int n4 = Math.min(n2, 1000 - n3);
        System.arraycopy(this.samples, n3, lArray, n, n4);
        if (n4 < n2) {
            System.arraycopy(this.samples, 0, lArray, n + n4, n2 - n4);
        }
    }

    private static FrameTimeStatistics$Percentile[] computeCalculationOrder() {
        FrameTimeStatistics$Percentile[] frameTimeStatistics$PercentileArray = Arrays.copyOf(PERCENTILES, PERCENTILES.length);
        Comparator<FrameTimeStatistics$Percentile> comparator = Comparator.comparingInt(FrameTimeStatistics$Percentile::window).thenComparing(FrameTimeStatistics$Percentile::p, Comparator.reverseOrder());
        Arrays.sort(frameTimeStatistics$PercentileArray, comparator);
        return frameTimeStatistics$PercentileArray;
    }

    private static int popDownTo(long[] lArray, int n, int n2) {
        while (n > n2) {
            lArray[0] = lArray[--n];
            if (n <= 0) continue;
            LongHeaps.downHeap((long[])lArray, (int)n, (int)0, (LongComparator)HEAP_COMPARATOR);
        }
        return n;
    }
}

