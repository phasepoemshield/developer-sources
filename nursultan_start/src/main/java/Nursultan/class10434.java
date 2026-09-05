/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04522
 */
package Nursultan;

import minecraft.class04522;

public class class10434
implements class04522 {
    private final float N;
    private double y = Double.MIN_VALUE;

    public class10434(float f) {
        this.N = f;
    }

    public boolean method_34792(double d) {
        boolean bl = this.y == Double.MIN_VALUE || d <= this.y ? false : (d - this.y) / this.y >= (double)this.N;
        this.y = d;
        return bl;
    }
}

