/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.gui.widgets;

class VoiceActivationSlider$SlidingMaxSmooth {
    private final double[] values = new double[15];
    private int n;
    private int p;
    private static final double SMOOTHING_PER_SEC = 25.0;
    private double smoothed;
    private long lastNs = -1L;

    VoiceActivationSlider$SlidingMaxSmooth() {
    }

    public void reset() {
        this.n = 0;
        this.p = 0;
        this.smoothed = 0.0;
        this.lastNs = -1L;
    }

    public double max() {
        if (this.n == 0) {
            return 0.0;
        }
        int n = Math.min(this.n, this.values.length);
        double d = this.values[0];
        for (int i = 1; i < n; ++i) {
            if (!(this.values[i] > d)) continue;
            d = this.values[i];
        }
        return d;
    }

    public void add(double d) {
        if (this.n < this.values.length) {
            ++this.n;
        }
        this.values[this.p] = d;
        this.p = (this.p + 1) % this.values.length;
    }

    public double smoothMax() {
        long l = System.nanoTime();
        double d = this.max();
        if (this.lastNs < 0L) {
            this.lastNs = l;
            this.smoothed = d;
            return this.smoothed;
        }
        double d2 = (double)(l - this.lastNs) / 1.0E9;
        this.lastNs = l;
        double d3 = d2 * 25.0;
        if (d3 > 1.0) {
            d3 = 1.0;
        }
        if (d3 < 0.0) {
            d3 = 0.0;
        }
        this.smoothed += (d - this.smoothed) * d3;
        return this.smoothed;
    }
}

