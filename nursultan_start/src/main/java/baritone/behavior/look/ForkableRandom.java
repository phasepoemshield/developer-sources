/*
 * Decompiled with CFR 0.152.
 */
package baritone.behavior.look;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.LongSupplier;

public final class ForkableRandom {
    private static final double DOUBLE_UNIT = (double)1.110223E-16f;
    private final long[] s;

    private ForkableRandom(long[] lArray) {
        this.s = lArray;
    }

    public ForkableRandom(long l) {
        AtomicLong atomicLong = new AtomicLong(l);
        LongSupplier longSupplier = () -> {
            long l = atomicLong.addAndGet(-7046029254386353131L);
            l = (l ^ l >>> 30) * -4658895280553007687L;
            l = (l ^ l >>> 27) * -7723592293110705685L;
            return l ^ l >>> 31;
        };
        this.s = new long[]{longSupplier.getAsLong(), longSupplier.getAsLong(), longSupplier.getAsLong(), longSupplier.getAsLong()};
    }

    public ForkableRandom() {
        this(System.nanoTime() ^ System.currentTimeMillis());
    }

    public long next() {
        long l = ForkableRandom.rotl(this.s[0] + this.s[3], 23) + this.s[0];
        long l2 = this.s[1] << 17;
        this.s[2] = this.s[2] ^ this.s[0];
        this.s[3] = this.s[3] ^ this.s[1];
        this.s[1] = this.s[1] ^ this.s[2];
        this.s[0] = this.s[0] ^ this.s[3];
        this.s[2] = this.s[2] ^ l2;
        this.s[3] = ForkableRandom.rotl(this.s[3], 45);
        return l;
    }

    public double nextDouble() {
        return (double)(this.next() >>> 11) * (double)1.110223E-16f;
    }

    public ForkableRandom fork() {
        return new ForkableRandom(Arrays.copyOf(this.s, 4));
    }

    private static long rotl(long l, int n) {
        return l << n | l >>> 64 - n;
    }
}

