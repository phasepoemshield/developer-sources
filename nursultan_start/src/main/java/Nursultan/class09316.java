/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 */
package Nursultan;

import Nursultan.class11784;

public class class09316
extends class11784 {
    private static double[] z;
    public static Object y_0;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public boolean L_init;

    public class09316 L(double d) {
        this.U();
        this.L_2 = d;
        return this;
    }

    public double L() {
        this.U();
        return (Double)this.L_3;
    }

    public float M() {
        this.U();
        return ((Float)this.L_1).floatValue();
    }

    public class09316() {
        this.U();
    }

    static {
        class09316.W();
        class09316.E();
        y_0 = new class09316();
    }

    public float i() {
        this.U();
        return ((Float)this.L_0).floatValue();
    }

    private void U() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = Float.valueOf(0.0f);
            this.L_1 = Float.valueOf(0.0f);
            this.L_2 = z[0];
            this.L_3 = z[1];
            this.L_4 = z[2];
        }
    }

    public double u() {
        this.U();
        return (Double)this.L_4;
    }

    public class09316 y(float f) {
        this.U();
        this.L_1 = Float.valueOf(f);
        return this;
    }

    public class09316 y(double d) {
        this.U();
        this.L_3 = d;
        return this;
    }

    private static void E() {
    }

    public class09316 N(float f) {
        this.U();
        this.L_0 = Float.valueOf(f);
        return this;
    }

    public class09316 N(double d) {
        this.U();
        this.L_4 = d;
        return this;
    }

    public static class09316 N(float f, float f2, double d, double d2, double d3) {
        ((class09316)((Object)class09316.y_0)).L_0 = Float.valueOf(f);
        ((class09316)((Object)class09316.y_0)).L_1 = Float.valueOf(f2);
        ((class09316)((Object)class09316.y_0)).L_2 = d;
        ((class09316)((Object)class09316.y_0)).L_3 = d2;
        ((class09316)((Object)class09316.y_0)).L_4 = d3;
        return (class09316)((Object)y_0);
    }

    private static void W() {
        z = new double[3];
        class09316.z[0] = Double.longBitsToDouble(0L);
        class09316.z[1] = Double.longBitsToDouble(0L);
        class09316.z[2] = Double.longBitsToDouble(0L);
    }

    public double R() {
        this.U();
        return (Double)this.L_2;
    }
}

