/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10296
 *  com.mojang.serialization.Codec
 *  minecraft.class01818
 *  minecraft.class06069
 */
package minecraft;

import Nursultan.class10296;
import com.mojang.serialization.Codec;
import minecraft.class01818;
import minecraft.class04019;
import minecraft.class04037;
import minecraft.class04043;
import minecraft.class04053;
import minecraft.class06069;

public class class04042
implements class06069 {
    private static final float L = 5.9604645E-8f;
    private static final double u = (double)1.110223E-16f;
    public static final Codec<class04042> y = class04053.N.xmap(class040532 -> new class04042((class04053)class040532), class040422 -> class040422.i);
    private class04053 i;
    private final class04019 R = new class04019(this);

    public void L(int n) {
        for (int i = 0; i < n; ++i) {
            this.i.N();
        }
    }

    public class01818 L() {
        return new class10296(this.i.N(), this.i.N());
    }

    public int M() {
        return (int)this.i.N();
    }

    public class04042(long l) {
        this.i = new class04053(class04043.L(l));
    }

    public class04042(class04037 class040372) {
        this.i = new class04053(class040372);
    }

    public class04042(long l, long l2) {
        this.i = new class04053(l, l2);
    }

    private class04042(class04053 class040532) {
        this.i = class040532;
    }

    public long B() {
        return this.i.N();
    }

    public boolean Z() {
        return (this.i.N() & 1L) != 0L;
    }

    public double U() {
        return (double)this.N(53) * (double)1.110223E-16f;
    }

    public float z() {
        return (float)this.N(24) * 5.9604645E-8f;
    }

    public class06069 y() {
        return new class04042(this.i.N(), this.i.N());
    }

    public int y(int n) {
        if (n <= 0) {
            throw new IllegalArgumentException("Bound must be positive");
        }
        long l = Integer.toUnsignedLong(this.M());
        long l2 = l * (long)n;
        long l3 = l2 & 0xFFFFFFFFL;
        if (l3 < (long)n) {
            int n2 = Integer.remainderUnsigned(~n + 1, n);
            while (l3 < (long)n2) {
                l = Integer.toUnsignedLong(this.M());
                l2 = l * (long)n;
                l3 = l2 & 0xFFFFFFFFL;
            }
        }
        long l4 = l2 >> 32;
        return (int)l4;
    }

    public double E() {
        return this.R.y();
    }

    public void N(long l) {
        this.i = new class04053(class04043.L(l));
        this.R.N();
    }

    private long N(int n) {
        return this.i.N() >>> 64 - n;
    }
}

