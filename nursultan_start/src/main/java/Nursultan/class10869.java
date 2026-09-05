/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00389
 *  minecraft.class00494
 *  minecraft.class04995
 *  minecraft.class07003
 *  minecraft.class08057
 *  minecraft.class08067
 *  minecraft.class08072
 */
package Nursultan;

import minecraft.class00389;
import minecraft.class00494;
import minecraft.class04995;
import minecraft.class07003;
import minecraft.class08057;
import minecraft.class08067;
import minecraft.class08072;

public class class10869
implements class08067 {
    private final double y;
    private double L;
    private double u;
    private double i;
    private double R;
    private class00494 M;
    final /* synthetic */ class08057 N;

    public double L(float f) {
        return this.u;
    }

    public long L() {
        return 0L;
    }

    public void M() {
        this.z();
    }

    public class10869(class08057 class080572, double d) {
        this.N = class080572;
        this.y = d;
        this.z();
    }

    public class08067 B() {
        return this;
    }

    public class00494 Z() {
        return this.M;
    }

    public class08072 i() {
        return class08072.field_12753;
    }

    private void z() {
        this.L = class04995.N((double)(this.N.M() - this.y / 2.0), (double)(-this.N.U), (double)this.N.U);
        this.u = class04995.N((double)(this.N.B() - this.y / 2.0), (double)(-this.N.U), (double)this.N.U);
        this.i = class04995.N((double)(this.N.M() + this.y / 2.0), (double)(-this.N.U), (double)this.N.U);
        this.R = class04995.N((double)(this.N.B() + this.y / 2.0), (double)(-this.N.U), (double)this.N.U);
        this.M = class00389.N((class00494)class00389.L, (class00494)class00389.N((double)Math.floor(this.N(0.0f)), (double)Double.NEGATIVE_INFINITY, (double)Math.floor(this.L(0.0f)), (double)Math.ceil(this.y(0.0f)), (double)Double.POSITIVE_INFINITY, (double)Math.ceil(this.u(0.0f))), (class07003)class07003.i);
    }

    public double u(float f) {
        return this.R;
    }

    public double u() {
        return this.y;
    }

    public double y() {
        return 0.0;
    }

    public double y(float f) {
        return this.i;
    }

    public double N() {
        return this.y;
    }

    public double N(float f) {
        return this.L;
    }

    public void R() {
        this.z();
    }
}

