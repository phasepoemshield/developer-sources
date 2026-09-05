/*
 * Decompiled with CFR 0.152.
 */
package me.flashyreese.mods.sodiumextra.client;

import java.util.ArrayDeque;
import java.util.Comparator;
import java.util.Deque;
import java.util.List;
import java.util.Objects;
import me.flashyreese.mods.sodiumextra.client.FrameCounter$FrameSample;

public class FrameCounter {
    private static final FrameCounter INSTANCE = new FrameCounter();
    private final Deque<FrameCounter$FrameSample> samples = new ArrayDeque<FrameCounter$FrameSample>();
    private final long smoothWindow;
    private final long windowNanos;
    private final long updateIntervalNanos;
    private long lastFrameTime = -1L;
    private long lastUpdateTime = 0L;
    private double cachedSmoothFps = 0.0;
    private double cachedAverageFps = 0.0;
    private double cachedOnePercentLowFps = 0.0;
    private double cachedPointOnePercentLowFps = 0.0;

    public FrameCounter() {
        this.smoothWindow = 500000000L;
        this.windowNanos = 5000000000L;
        this.updateIntervalNanos = 500000000L;
    }

    public static FrameCounter getInstance() {
        return INSTANCE;
    }

    public synchronized void onFrame() {
        long l;
        long l2 = System.nanoTime();
        if (this.lastFrameTime != -1L) {
            l = l2 - this.lastFrameTime;
            this.samples.addLast(new FrameCounter$FrameSample(l2, l));
        }
        this.lastFrameTime = l2;
        while (!this.samples.isEmpty()) {
            long l3 = l2 - this.samples.peekFirst().timestamp;
            Objects.requireNonNull(this);
            if (l3 <= 5000000000L) break;
            this.samples.removeFirst();
        }
        Objects.requireNonNull(this);
        if (l2 - this.lastUpdateTime >= 500000000L) {
            this.lastUpdateTime = l2;
            if (!this.samples.isEmpty()) {
                l = this.samples.stream().mapToLong(frameCounter$FrameSample -> frameCounter$FrameSample.deltaNanos).sum();
                this.cachedAverageFps = (double)((long)this.samples.size() * 1000000000L) / (double)l;
                this.cachedOnePercentLowFps = this.computePercentileLow(1.0);
                this.cachedPointOnePercentLowFps = this.computePercentileLow(0.1);
                this.cachedSmoothFps = this.computeSmoothFpsFromRecentFrames(l2);
            } else {
                this.cachedSmoothFps = 0.0;
                this.cachedPointOnePercentLowFps = 0.0;
                this.cachedOnePercentLowFps = 0.0;
                this.cachedAverageFps = 0.0;
            }
        }
    }

    private double computeSmoothFpsFromRecentFrames(long l) {
        List list = this.samples.stream().filter(frameCounter$FrameSample -> {
            long l2 = l - frameCounter$FrameSample.timestamp;
            Objects.requireNonNull(this);
            return l2 <= 500000000L;
        }).map(frameCounter$FrameSample -> frameCounter$FrameSample.deltaNanos).toList();
        if (list.isEmpty()) {
            return 0.0;
        }
        double d = list.stream().mapToLong(Long::longValue).average().orElse(0.0);
        return 1.0E9 / d;
    }

    public synchronized int getSmoothFps() {
        return (int)Math.round(this.cachedSmoothFps);
    }

    public synchronized int getAverageFps() {
        return (int)Math.round(this.cachedAverageFps);
    }

    public synchronized int getOnePercentLowFps() {
        return (int)Math.round(this.cachedOnePercentLowFps);
    }

    public synchronized int getPointOnePercentLowFps() {
        return (int)Math.round(this.cachedPointOnePercentLowFps);
    }

    private double computePercentileLow(double d) {
        if (this.samples.isEmpty()) {
            return 0.0;
        }
        List list = this.samples.stream().map(frameCounter$FrameSample -> frameCounter$FrameSample.deltaNanos).sorted(Comparator.reverseOrder()).toList();
        int n = Math.max(1, (int)Math.ceil((double)list.size() * (d / 100.0)));
        long l = 0L;
        for (int i = 0; i < n; ++i) {
            l += ((Long)list.get(i)).longValue();
        }
        double d2 = (double)l / (double)n;
        return 1.0E9 / d2;
    }
}

