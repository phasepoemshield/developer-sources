/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class06889
 *  minecraft.class07209
 *  org.joml.Vector3d
 */
package Nursultan;

import minecraft.class00734;
import minecraft.class06889;
import minecraft.class07209;
import org.joml.Vector3d;

public class class11884 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;

    public void L(double d) {
        this.N_1 = d;
    }

    public static class11884 L() {
        return new class11884(0.0, 0.0, 0.0, 0.0, 0.0, 0.0);
    }

    public void M(double d) {
        this.N_5 = d;
    }

    public double M() {
        return (Double)this.N_1;
    }

    public class11884(double d, double d2, double d3, double d4, double d5, double d6) {
        this.E();
        this.N_0 = Math.min(d, d4);
        this.N_1 = Math.min(d2, d5);
        this.N_2 = Math.min(d3, d6);
        this.N_3 = Math.max(d, d4);
        this.N_4 = Math.max(d2, d5);
        this.N_5 = Math.max(d3, d6);
    }

    public class11884 i(double d) {
        return this.y(d, d, d);
    }

    public double i() {
        return (Double)this.N_0;
    }

    public double u() {
        return (Double)this.N_5;
    }

    public void u(double d) {
        this.N_3 = d;
    }

    public class11884 y(double d, double d2, double d3) {
        double d4 = (Double)this.N_0 - d;
        double d5 = (Double)this.N_1 - d2;
        double d6 = (Double)this.N_2 - d3;
        double d7 = (Double)this.N_3 + d;
        double d8 = (Double)this.N_4 + d2;
        double d9 = (Double)this.N_5 + d3;
        return this.N(d4, d5, d6, d7, d8, d9);
    }

    public double y() {
        return (Double)this.N_4;
    }

    public void y(double d) {
        this.N_4 = d;
    }

    public class11884 y(class07209 class072092) {
        this.N(class072092.method_10263());
        this.L(class072092.method_10264());
        this.R(class072092.method_10260());
        this.u(class072092.method_10263() + 1);
        this.y(class072092.method_10264() + 1);
        this.M(class072092.method_10260() + 1);
        return this;
    }

    private void E() {
        this.N_0 = 0.0;
        this.N_1 = 0.0;
        this.N_2 = 0.0;
        this.N_3 = 0.0;
        this.N_4 = 0.0;
        this.N_5 = 0.0;
    }

    public class11884 N(Vector3d vector3d) {
        return this.N(vector3d.x, vector3d.y, vector3d.z);
    }

    public class11884 N(double d, double d2, double d3, double d4, double d5, double d6) {
        this.N(d);
        this.L(d2);
        this.R(d3);
        this.u(d4);
        this.y(d5);
        this.M(d6);
        return this;
    }

    public static class11884 N(class07209 class072092) {
        return new class11884(class072092.method_10263(), class072092.method_10264(), class072092.method_10260(), class072092.method_10263() + 1, class072092.method_10264() + 1, class072092.method_10260() + 1);
    }

    public static class11884 N(class00734 class007342) {
        return new class11884(class007342.N, class007342.y, class007342.L, class007342.u, class007342.i, class007342.R);
    }

    public class11884 N(class06889 class068892) {
        return this.N(class068892.M, class068892.B, class068892.Z);
    }

    public static class11884 N(class11884 class118842) {
        return new class11884((Double)class118842.N_0, (Double)class118842.N_1, (Double)class118842.N_2, (Double)class118842.N_3, (Double)class118842.N_4, (Double)class118842.N_5);
    }

    public double N() {
        return (Double)this.N_3;
    }

    public void N(double d) {
        this.N_0 = d;
    }

    public class11884 N(double d, double d2, double d3) {
        double d4 = (Double)this.N_0;
        double d5 = (Double)this.N_1;
        double d6 = (Double)this.N_2;
        double d7 = (Double)this.N_3;
        double d8 = (Double)this.N_4;
        double d9 = (Double)this.N_5;
        if (d < 0.0) {
            d4 += d;
        } else if (d > 0.0) {
            d7 += d;
        }
        if (d2 < 0.0) {
            d5 += d2;
        } else if (d2 > 0.0) {
            d8 += d2;
        }
        if (d3 < 0.0) {
            d6 += d3;
        } else if (d3 > 0.0) {
            d9 += d3;
        }
        return this.N(d4, d5, d6, d7, d8, d9);
    }

    public void R(double d) {
        this.N_2 = d;
    }

    public double R() {
        return (Double)this.N_2;
    }
}

