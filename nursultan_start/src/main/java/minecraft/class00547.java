/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02897
 *  minecraft.class08051
 */
package minecraft;

import minecraft.class00381;
import minecraft.class02897;
import minecraft.class08051;

public abstract class class00547
implements class00381<class08051> {
    private static final int z = 1;
    private static final int U = 2;
    protected final double N;
    protected final double y;
    protected final double L;
    protected final float u;
    protected final float i;
    protected final boolean R;
    protected final boolean M;
    protected final boolean B;
    protected final boolean Z;

    public double L(double d) {
        return this.B ? this.L : d;
    }

    public boolean L() {
        return this.B;
    }

    protected class00547(double d, double d2, double d3, float f, float f2, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        this.N = d;
        this.y = d2;
        this.L = d3;
        this.u = f;
        this.i = f2;
        this.R = bl;
        this.M = bl2;
        this.B = bl3;
        this.Z = bl4;
    }

    public boolean u() {
        return this.Z;
    }

    public float y(float f) {
        return this.Z ? this.i : f;
    }

    public double y(double d) {
        return this.B ? this.y : d;
    }

    static boolean y(int n) {
        return (n & 2) != 0;
    }

    public boolean y() {
        return this.M;
    }

    public float N(float f) {
        return this.Z ? this.u : f;
    }

    public boolean N() {
        return this.R;
    }

    static boolean N(int n) {
        return (n & 1) != 0;
    }

    public void method_65081(class08051 class080512) {
        class080512.method_12063(this);
    }

    public double N(double d) {
        return this.B ? this.N : d;
    }

    static int N(boolean bl, boolean bl2) {
        int n = 0;
        if (bl) {
            n |= 1;
        }
        if (bl2) {
            n |= 2;
        }
        return n;
    }

    public abstract class02897<? extends class00547> method_65080();
}

