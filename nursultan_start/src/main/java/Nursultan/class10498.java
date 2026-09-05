/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00753
 *  minecraft.class07209
 */
package Nursultan;

import minecraft.class00753;
import minecraft.class07209;

public class class10498 {
    private final class07209 N;
    private final double y;

    public class10498(class07209 class072092, double d) {
        this.N = class072092;
        this.y = d;
    }

    public double N(class07209 class072092) {
        double d = this.N.method_10262((class00753)class072092);
        if (d == 0.0) {
            return Double.POSITIVE_INFINITY;
        }
        return this.y / Math.sqrt(d);
    }
}

