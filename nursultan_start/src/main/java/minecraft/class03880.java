/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class03876;
import minecraft.class03877;
import minecraft.class03912;

interface class03880
extends class03877 {
    public class03876 u();

    @Override
    default public double y() {
        return this.u().N() * 4.0;
    }

    @Override
    default public double N() {
        return -this.y();
    }

    default public double N(double d, double d2, double d3) {
        return this.u().N(d * 0.25, d2 * 0.25, d3 * 0.25) * 4.0;
    }

    @Override
    default public void N(double[] dArray, class03912 class039122) {
        class039122.N(dArray, this);
    }
}

