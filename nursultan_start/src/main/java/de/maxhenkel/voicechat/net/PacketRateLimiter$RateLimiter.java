/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.net;

class PacketRateLimiter$RateLimiter {
    private final int threshold;
    private final long timePerTokenNanos;
    private long lastLeakNanos;
    private long amount;

    public PacketRateLimiter$RateLimiter(int n, long l) {
        this.threshold = n;
        this.timePerTokenNanos = l * 1000000L / (long)n;
        this.lastLeakNanos = System.nanoTime();
        this.amount = 0L;
    }

    public boolean tryAcquire() {
        long l = System.nanoTime();
        long l2 = l - this.lastLeakNanos;
        long l3 = l2 / this.timePerTokenNanos;
        if (l3 > 0L) {
            this.amount -= l3;
            if (this.amount < 0L) {
                this.amount = 0L;
            }
            this.lastLeakNanos += l3 * this.timePerTokenNanos;
        }
        if (this.amount >= (long)this.threshold) {
            return false;
        }
        ++this.amount;
        return true;
    }
}

