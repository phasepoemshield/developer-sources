/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01830
 *  minecraft.class03875
 *  minecraft.class03877
 *  minecraft.class03894
 *  minecraft.class03909
 *  minecraft.class03912
 *  minecraft.class07321
 */
package Nursultan;

import minecraft.class01830;
import minecraft.class03875;
import minecraft.class03877;
import minecraft.class03894;
import minecraft.class03909;
import minecraft.class03912;
import minecraft.class07321;

public class class09530
implements class01830,
class03894 {
    private final class03877 N;
    private long y = class07321.L;
    private double L;

    public class09530(class03877 class038772) {
        this.N = class038772;
    }

    public class03909 i() {
        return class03909.field_36564;
    }

    public class03877 u() {
        return this.N;
    }

    public double N(class03875 class038752) {
        double d;
        int n;
        int n2 = class038752.y();
        long l = class07321.u((int)n2, (int)(n = class038752.u()));
        if (this.y == l) {
            return this.L;
        }
        this.y = l;
        this.L = d = this.N.N(class038752);
        return d;
    }

    public void N(double[] dArray, class03912 class039122) {
        this.N.N(dArray, class039122);
    }
}

