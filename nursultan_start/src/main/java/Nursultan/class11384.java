/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11784
 */
package Nursultan;

import Nursultan.class11784;

public class class11384
extends class11784 {
    private static double[] B;
    public Object y_0;
    public Object y_1;
    public boolean y_init;
    public static Object L_0;

    public double L() {
        this.R();
        return (Double)this.y_1;
    }

    private static void M() {
        B = new double[2];
        class11384.B[0] = Double.longBitsToDouble(0L);
        class11384.B[1] = Double.longBitsToDouble(0L);
    }

    public class11384() {
        this.R();
    }

    static {
        class11384.M();
        class11384.Z();
        L_0 = new class11384();
    }

    private static void Z() {
    }

    public double u() {
        this.R();
        return (Double)this.y_0;
    }

    public class11384 y(double d) {
        this.R();
        this.y_1 = d;
        return this;
    }

    public class11384 N(double d) {
        this.R();
        this.y_0 = d;
        return this;
    }

    public static class11384 N(double d, double d2) {
        ((class11384)((Object)class11384.L_0)).y_0 = d;
        ((class11384)((Object)class11384.L_0)).y_1 = d2;
        return (class11384)((Object)L_0);
    }

    private void R() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_0 = B[0];
            this.y_1 = B[1];
        }
    }
}

