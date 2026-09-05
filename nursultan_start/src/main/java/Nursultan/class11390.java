/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11390 {
    private static double[] L;
    public Object N_0;
    public boolean N_init;
    public static Object y_0;

    public class11390() {
        this.R();
    }

    static {
        class11390.i();
        class11390.u();
        y_0 = new class11390();
    }

    private static void i() {
        L = new double[1];
        class11390.L[0] = Double.longBitsToDouble(0L);
    }

    private static void u() {
    }

    public static class11390 y(double d) {
        ((class11390)class11390.y_0).N_0 = d;
        return (class11390)y_0;
    }

    public double N() {
        return (Double)this.N_0;
    }

    public class11390 N(double d) {
        this.N_0 = d;
        return this;
    }

    private void R() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = L[0];
        }
    }
}

