/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.util.internal.ThreadLocalRandom
 *  minecraft.class01818
 *  minecraft.class01833
 *  minecraft.class03633
 *  minecraft.class04043
 */
package minecraft;

import io.netty.util.internal.ThreadLocalRandom;
import minecraft.class01818;
import minecraft.class01833;
import minecraft.class03633;
import minecraft.class04043;
import minecraft.class06075;

public interface class06069 {
    @Deprecated
    public static final double N = 2.297;

    public class01818 L();

    default public void L(int n) {
        for (int i = 0; i < n; ++i) {
            this.M();
        }
    }

    public int M();

    public long B();

    public boolean Z();

    @Deprecated
    public static class06069 i() {
        return new class03633(class04043.N());
    }

    public double U();

    public float z();

    public static class06069 u() {
        return class06069.y(class04043.N());
    }

    default public int y(int n, int n2) {
        if (n >= n2) {
            throw new IllegalArgumentException("bound - origin is non positive");
        }
        return n + this.y(n2 - n);
    }

    public class06069 y();

    public static class06069 y(long l) {
        return new class06075(l);
    }

    public int y(int var1);

    public double E();

    public void N(long var1);

    default public int N(int n, int n2) {
        return this.y(n2 - n + 1) + n;
    }

    default public double N(double d, double d2) {
        return d + d2 * (this.U() - this.U());
    }

    default public float N(float f, float f2) {
        return f + f2 * (this.z() - this.z());
    }

    public static class06069 R() {
        return new class01833(ThreadLocalRandom.current().nextLong());
    }
}

