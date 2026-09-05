/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class04995;

public class class05016 {
    private double N;
    private double y;
    private double L;

    public double N(double d, double d2) {
        this.N += d;
        double d3 = this.N - this.y;
        double d4 = class04995.u(0.5, this.L, d3);
        double d5 = Math.signum(d3);
        if (d5 * d3 > d5 * this.L) {
            d3 = d4;
        }
        this.L = d4;
        this.y += d3 * d2;
        return d3 * d2;
    }

    public void N() {
        this.N = 0.0;
        this.y = 0.0;
        this.L = 0.0;
    }
}

