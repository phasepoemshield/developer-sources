/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.SplittableRandom;
import java.util.concurrent.ThreadLocalRandom;

public class class09166 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public class09166() {
        this.R();
        this.N_0 = this.B();
    }

    private SplittableRandom B() {
        long l = System.nanoTime() ^ ThreadLocalRandom.current().nextLong() ^ (long)System.identityHashCode(this) << 32;
        return new SplittableRandom(this.N(l));
    }

    public void y() {
        this.N_0 = this.B();
        this.N_1 = Float.valueOf(0.0f);
        this.N_2 = Float.valueOf(0.0f);
    }

    public float y(float f, float f2) {
        if (f2 <= f) {
            return f;
        }
        double d = (((SplittableRandom)this.N_0).nextDouble() + ((SplittableRandom)this.N_0).nextDouble()) * 0.5;
        return f + (f2 - f) * (float)d;
    }

    public float N(boolean bl, float f) {
        float f2 = (bl ? ((Float)this.N_1).floatValue() : ((Float)this.N_2).floatValue()) * this.N(0.52f, 0.76f) + this.y(-f, f) * this.N(0.24f, 0.48f);
        f2 = Math.max(-f, Math.min(f, f2));
        if (bl) {
            this.N_1 = Float.valueOf(f2);
        } else {
            this.N_2 = Float.valueOf(f2);
        }
        return f2;
    }

    public boolean N(float f) {
        return ((SplittableRandom)this.N_0).nextDouble() < (double)Math.max(0.0f, Math.min(1.0f, f));
    }

    public float N(float f, float f2) {
        if (f2 <= f) {
            return f;
        }
        return f + (f2 - f) * (float)((SplittableRandom)this.N_0).nextDouble();
    }

    private long N(long l) {
        l ^= l >>> 33;
        l *= -49064778989728563L;
        l ^= l >>> 33;
        l *= -4265267296055464877L;
        l ^= l >>> 33;
        return l;
    }

    public int N() {
        return ((SplittableRandom)this.N_0).nextBoolean() ? 1 : -1;
    }

    public int N(int n, int n2) {
        if (n2 <= n) {
            return n;
        }
        return ((SplittableRandom)this.N_0).nextInt(n, n2 + 1);
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
        }
    }
}

