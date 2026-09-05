/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 */
package Nursultan;

import minecraft.class06889;

public class class11232 {
    private static double[] R;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;

    public class11232(class06889 class068892, class06889 class068893, float f, int n) {
        this.u();
        this.y_0 = class068892;
        this.y_1 = class068893;
        this.N_0 = Float.valueOf(f);
        this.N_1 = n;
        double d = Math.random() - R[0];
        double d2 = R[1] + Math.random() * R[2];
        double d3 = Math.random() - R[3];
        this.y_2 = new class06889(d, d2, d3).L(R[4]);
        this.y_4 = new class06889(Math.random() - R[5], Math.random() - R[6], Math.random() - R[7]).u();
    }

    static {
        class11232.i();
    }

    private static void i() {
        R = new double[8];
        class11232.R[0] = Double.longBitsToDouble(4602678819172646912L);
        class11232.R[1] = Double.longBitsToDouble(4590429028186199163L);
        class11232.R[2] = Double.longBitsToDouble(4602678819172646912L);
        class11232.R[3] = Double.longBitsToDouble(4602678819172646912L);
        class11232.R[4] = Double.longBitsToDouble(4596373779694328218L);
        class11232.R[5] = Double.longBitsToDouble(4602678819172646912L);
        class11232.R[6] = Double.longBitsToDouble(4602678819172646912L);
        class11232.R[7] = Double.longBitsToDouble(4602678819172646912L);
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = 0;
            this.N_2 = 0;
            this.N_3 = 0;
        }
    }

    public void y() {
        this.N_2 = (Integer)this.N_2 + 1;
        this.y_1 = (class06889)this.y_0;
        int n = 5;
        if ((Integer)this.N_2 % n == 0 || (class06889)this.y_3 == null) {
            this.y_3 = ((class06889)this.y_4).u().B((class06889)this.y_2).L((double)Math.min((float)((Integer)this.N_2).intValue() / 15.0f, 1.0f)).i((class06889)this.y_0);
            this.N_3 = (Integer)this.N_2 + n;
        }
        this.y_0 = ((class06889)this.y_0).N((class06889)this.y_3, (double)(1.0f / (float)((Integer)this.N_3 - (Integer)this.N_2)));
    }

    public boolean N() {
        return (Integer)this.N_2 > (Integer)this.N_1;
    }
}

