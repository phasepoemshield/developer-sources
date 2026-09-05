/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04995
 *  minecraft.class07468
 */
package minecraft;

import minecraft.class04995;
import minecraft.class07468;

public class class07461
extends class07468 {
    private final double L;
    private final double u;

    public class07461(String string, double d, double d2, double d3) {
        super(string, d);
        this.L = d2;
        this.u = d3;
        if (d2 > d3) {
            throw new IllegalArgumentException("Minimum value cannot be bigger than maximum value!");
        }
        if (d < d2) {
            throw new IllegalArgumentException("Default value cannot be lower than minimum value!");
        }
        if (d > d3) {
            throw new IllegalArgumentException("Default value cannot be bigger than maximum value!");
        }
    }

    public double i() {
        return this.u;
    }

    public double u() {
        return this.L;
    }

    public double N(double d) {
        if (Double.isNaN(d)) {
            return this.L;
        }
        return class04995.N((double)d, (double)this.L, (double)this.u);
    }
}

