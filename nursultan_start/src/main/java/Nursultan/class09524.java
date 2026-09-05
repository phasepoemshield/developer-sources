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
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import minecraft.class01830;
import minecraft.class01837;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;
import org.jspecify.annotations.Nullable;

public class class09524
implements class01830,
class03894 {
    private final class03877 y;
    private long L;
    private long M;
    private double B;
    private double @Nullable [] Z;
    final /* synthetic */ class01837 N;

    public class09524(class01837 class018372, class03877 class038772) {
        this.N = class018372;
        this.y = class038772;
    }

    public class03909 i() {
        return class03909.field_36565;
    }

    public class03877 u() {
        return this.y;
    }

    public double N(class03875 class038752) {
        double d;
        if (class038752 != this.N) {
            return this.y.N(class038752);
        }
        if (this.Z != null && this.M == this.N.b) {
            return this.Z[this.N.j];
        }
        if (this.L == this.N.T) {
            return this.B;
        }
        this.L = this.N.T;
        this.B = d = this.y.N(class038752);
        return d;
    }

    public void N(double[] dArray, class03912 class039122) {
        if (this.Z != null && this.M == this.N.b) {
            System.arraycopy(this.Z, 0, dArray, 0, dArray.length);
            return;
        }
        this.u().N(dArray, class039122);
        if (this.Z != null && this.Z.length == dArray.length) {
            System.arraycopy(dArray, 0, this.Z, 0, dArray.length);
        } else {
            this.Z = (double[])dArray.clone();
        }
        this.M = this.N.b;
    }
}

