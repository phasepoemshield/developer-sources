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

import Nursultan.class10869;
import minecraft.class00389;
import minecraft.class00494;
import minecraft.class04995;
import minecraft.class07003;
import minecraft.class08057;
import minecraft.class08067;
import minecraft.class08072;

public class class10871
implements class08067 {
    private final double y;
    private final double L;
    private final long u;
    private final long i;
    private final double R;
    private long M;
    private double B;
    private double Z;
    final /* synthetic */ class08057 N;

    public double L(float f) {
        return class04995.N((double)(this.N.B() - class04995.u((double)f, (double)this.z(), (double)this.N()) / 2.0), (double)(-this.N.U), (double)this.N.U);
    }

    public long L() {
        return this.M;
    }

    public void M() {
    }

    public class10871(class08057 class080572, double d, double d2, long l, long l2) {
        double d3;
        this.N = class080572;
        this.y = d;
        this.L = d2;
        this.R = l;
        this.M = l;
        this.i = l2;
        this.u = this.i + l;
        this.B = d3 = this.U();
        this.Z = d3;
    }

    public class08067 B() {
        --this.M;
        this.Z = this.B;
        this.B = this.U();
        if (this.M <= 0L) {
            this.N.method_80();
            return new class10869(this.N, this.L);
        }
        return this;
    }

    public class00494 Z() {
        return class00389.N((class00494)class00389.L, (class00494)class00389.N((double)Math.floor(this.N(0.0f)), (double)Double.NEGATIVE_INFINITY, (double)Math.floor(this.L(0.0f)), (double)Math.ceil(this.y(0.0f)), (double)Double.POSITIVE_INFINITY, (double)Math.ceil(this.u(0.0f))), (class07003)class07003.i);
    }

    public class08072 i() {
        return this.L < this.y ? class08072.field_12756 : class08072.field_12754;
    }

    private double U() {
        double d = (this.R - (double)this.M) / this.R;
        return d < 1.0 ? class04995.u((double)d, (double)this.y, (double)this.L) : this.L;
    }

    public double z() {
        return this.Z;
    }

    public double u(float f) {
        return class04995.N((double)(this.N.B() + class04995.u((double)f, (double)this.z(), (double)this.N()) / 2.0), (double)(-this.N.U), (double)this.N.U);
    }

    public double u() {
        return this.L;
    }

    public double y(float f) {
        return class04995.N((double)(this.N.M() + class04995.u((double)f, (double)this.z(), (double)this.N()) / 2.0), (double)(-this.N.U), (double)this.N.U);
    }

    public double y() {
        return Math.abs(this.y - this.L) / (double)(this.u - this.i);
    }

    public double N(float f) {
        return class04995.N((double)(this.N.M() - class04995.u((double)f, (double)this.z(), (double)this.N()) / 2.0), (double)(-this.N.U), (double)this.N.U);
    }

    public double N() {
        return this.B;
    }

    public void R() {
    }
}

