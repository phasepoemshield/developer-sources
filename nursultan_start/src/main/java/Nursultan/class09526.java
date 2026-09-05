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
 *  minecraft.class04995
 */
package Nursultan;

import minecraft.class01830;
import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;
import minecraft.class04995;

public class class09526
implements class01830,
class03894 {
    public double[][] N;
    public double[][] y;
    private final class03877 M;
    private double B;
    private double Z;
    private double z;
    private double U;
    private double E;
    private double W;
    private double m;
    private double P;
    private double s;
    private double T;
    private double b;
    private double j;
    private double v;
    private double n;
    private double t;
    final /* synthetic */ class01837 L;

    public void L(double d) {
        this.t = class04995.u((double)d, (double)this.v, (double)this.n);
    }

    public class09526(class01837 class018372, class03877 class038772) {
        this.L = class018372;
        this.M = class038772;
        this.N = this.y(class018372.y, class018372.N);
        this.y = this.y(class018372.y, class018372.N);
        class018372.R.add(this);
    }

    public class03909 i() {
        return class03909.field_36562;
    }

    public class03877 u() {
        return this.M;
    }

    private double[][] y(int n, int n2) {
        int n3 = n2 + 1;
        int n4 = n + 1;
        double[][] dArray = new double[n3][n4];
        for (int i = 0; i < n3; ++i) {
            dArray[i] = new double[n4];
        }
        return dArray;
    }

    public void y(double d) {
        this.v = class04995.u((double)d, (double)this.s, (double)this.T);
        this.n = class04995.u((double)d, (double)this.b, (double)this.j);
    }

    public void N(int n, int n2) {
        this.B = this.N[n2][n];
        this.Z = this.N[n2 + 1][n];
        this.z = this.y[n2][n];
        this.U = this.y[n2 + 1][n];
        this.E = this.N[n2][n + 1];
        this.W = this.N[n2 + 1][n + 1];
        this.m = this.y[n2][n + 1];
        this.P = this.y[n2 + 1][n + 1];
    }

    public void N(double[] dArray, class03912 class039122) {
        if (this.L.E) {
            class039122.N(dArray, (class03877)this);
            return;
        }
        this.u().N(dArray, class039122);
    }

    public double N(class03875 class038752) {
        if (class038752 != this.L) {
            return this.M.N(class038752);
        }
        if (!this.L.U) {
            throw new IllegalStateException("Trying to sample interpolator outside the interpolation loop");
        }
        if (this.L.E) {
            return class04995.N((double)((double)this.L.m / (double)this.L.Z), (double)((double)this.L.P / (double)this.L.z), (double)((double)this.L.s / (double)this.L.Z), (double)this.B, (double)this.z, (double)this.E, (double)this.m, (double)this.Z, (double)this.U, (double)this.W, (double)this.P);
        }
        return this.t;
    }

    public void N(double d) {
        this.s = class04995.u((double)d, (double)this.B, (double)this.E);
        this.T = class04995.u((double)d, (double)this.z, (double)this.m);
        this.b = class04995.u((double)d, (double)this.Z, (double)this.W);
        this.j = class04995.u((double)d, (double)this.U, (double)this.P);
    }

    public void W() {
        double[][] dArray = this.N;
        this.N = this.y;
        this.y = dArray;
    }
}

