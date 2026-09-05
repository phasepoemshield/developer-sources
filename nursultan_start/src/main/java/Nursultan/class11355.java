/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 */
package Nursultan;

import Nursultan.class11784;

public class class11355
extends class11784 {
    private static double[] m;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;
    public static Object L_0;

    public boolean L() {
        this.z();
        return (Boolean)this.y_6;
    }

    public class11355 L(double d) {
        this.z();
        this.y_0 = d;
        return this;
    }

    public class11355 L(boolean bl) {
        this.z();
        this.y_6 = bl;
        return this;
    }

    public float M() {
        this.z();
        return ((Float)this.y_3).floatValue();
    }

    private static void P() {
    }

    public class11355() {
        this.z();
    }

    static {
        class11355.U();
        class11355.P();
        L_0 = new class11355();
    }

    public double B() {
        this.z();
        return (Double)this.y_0;
    }

    public float Z() {
        this.z();
        return ((Float)this.y_4).floatValue();
    }

    public double i() {
        this.z();
        return (Double)this.y_1;
    }

    private static void U() {
        m = new double[3];
        class11355.m[0] = Double.longBitsToDouble(0L);
        class11355.m[1] = Double.longBitsToDouble(0L);
        class11355.m[2] = Double.longBitsToDouble(0L);
    }

    private void z() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = m[0];
            this.y_1 = m[1];
            this.y_2 = m[2];
            this.y_3 = Float.valueOf(0.0f);
            this.y_4 = Float.valueOf(0.0f);
            this.y_5 = false;
            this.y_6 = false;
        }
    }

    public double u() {
        this.z();
        return (Double)this.y_2;
    }

    public class11355 y(boolean bl) {
        this.z();
        this.y_5 = bl;
        return this;
    }

    public class11355 y(float f) {
        this.z();
        this.y_4 = Float.valueOf(f);
        return this;
    }

    public class11355 y(double d) {
        this.z();
        this.y_1 = d;
        return this;
    }

    public class11355 N(double d) {
        this.z();
        this.y_2 = d;
        return this;
    }

    public static class11355 N(double d, double d2, double d3, float f, float f2, boolean bl, boolean bl2) {
        ((class11355)((Object)class11355.L_0)).y_0 = d;
        ((class11355)((Object)class11355.L_0)).y_1 = d2;
        ((class11355)((Object)class11355.L_0)).y_2 = d3;
        ((class11355)((Object)class11355.L_0)).y_3 = Float.valueOf(f);
        ((class11355)((Object)class11355.L_0)).y_4 = Float.valueOf(f2);
        ((class11355)((Object)class11355.L_0)).y_5 = bl;
        ((class11355)((Object)class11355.L_0)).y_6 = bl2;
        return (class11355)((Object)L_0);
    }

    public class11355 N(float f) {
        this.z();
        this.y_3 = Float.valueOf(f);
        return this;
    }

    public boolean R() {
        this.z();
        return (Boolean)this.y_5;
    }
}

