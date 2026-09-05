/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11209 {
    private static double[] R;
    private static double[] U;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;
    public static Object y_0;

    public long L() {
        return (Long)this.N_2;
    }

    public double M() {
        return (double)((Long)this.N_1).longValue() / R[1];
    }

    private static void P() {
        y_0 = U[3];
    }

    private static void T() {
        R = new double[5];
        class11209.R[0] = Double.longBitsToDouble(0L);
        class11209.R[1] = Double.longBitsToDouble(4696837146684686336L);
        class11209.R[2] = Double.longBitsToDouble(4696837146684686336L);
        class11209.R[3] = Double.longBitsToDouble(0L);
        class11209.R[4] = Double.longBitsToDouble(4696837146684686336L);
        U = new double[4];
        class11209.U[0] = Double.longBitsToDouble(0L);
        class11209.U[1] = Double.longBitsToDouble(4696837146684686336L);
        class11209.U[2] = Double.longBitsToDouble(0L);
        class11209.U[3] = Double.longBitsToDouble(4696837146684686336L);
    }

    public class11209(String string, long l) {
        this.m();
        this.N_2 = Long.MAX_VALUE;
        this.N_3 = Long.MIN_VALUE;
        this.N_0 = string;
        this.N(l);
    }

    static {
        class11209.T();
        class11209.P();
    }

    public double B() {
        return (Long)this.N_5 == 0L ? R[3] : (double)((Long)this.N_2).longValue() / R[4];
    }

    public long Z() {
        return (Long)this.N_5;
    }

    public long i() {
        return (Long)this.N_1;
    }

    private void m() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0L;
            this.N_2 = 0L;
            this.N_3 = 0L;
            this.N_4 = U[2];
            this.N_5 = 0L;
        }
    }

    public double U() {
        return (Double)this.N_4;
    }

    public long z() {
        return (Long)this.N_3;
    }

    public void u() {
        this.N_1 = 0L;
        this.N_2 = Long.MAX_VALUE;
        this.N_3 = Long.MIN_VALUE;
        this.N_4 = R[0];
        this.N_5 = 0L;
    }

    public double y() {
        return (Double)this.N_4 / R[2];
    }

    public String N() {
        return (String)this.N_0;
    }

    public void N(long l) {
        if (l < 0L) {
            return;
        }
        this.N_1 = l;
        if (l < (Long)this.N_2) {
            this.N_2 = l;
        }
        if (l > (Long)this.N_3) {
            this.N_3 = l;
        }
        this.N_5 = (Long)this.N_5 + 1L;
        this.N_4 = (Double)this.N_4 + ((double)l - (Double)this.N_4) / (double)((Long)this.N_5).longValue();
    }

    public double R() {
        return (Long)this.N_5 == 0L ? U[0] : (double)((Long)this.N_3).longValue() / U[1];
    }
}

