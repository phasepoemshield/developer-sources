/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01830
 *  minecraft.class01837
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class03894
 *  minecraft.class03909
 *  minecraft.class03912
 */
package Nursultan;

import minecraft.class01830;
import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;

public class class09531
implements class01830,
class03894 {
    public final class03877 N;
    public final double[] y;
    final /* synthetic */ class01837 L;

    public class09531(class01837 class018372, class03877 class038772) {
        this.L = class018372;
        this.N = class038772;
        this.y = new double[class018372.Z * class018372.Z * class018372.z];
        class018372.M.add(this);
    }

    public class03909 i() {
        return class03909.field_36566;
    }

    public class03877 u() {
        return this.N;
    }

    public double N(class03875 class038752) {
        if (class038752 != this.L) {
            return this.N.N(class038752);
        }
        if (!this.L.U) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
        }
        int n = this.L.m;
        int n2 = this.L.P;
        int n3 = this.L.s;
        if (n >= 0 && n2 >= 0 && n3 >= 0 && n < this.L.Z && n2 < this.L.z && n3 < this.L.Z) {
            return this.y[((this.L.z - 1 - n2) * this.L.Z + n) * this.L.Z + n3];
        }
        return this.N.N(class038752);
    }

    public void N(double[] dArray, class03912 class039122) {
        class039122.N(dArray, (class03877)this);
    }
}

