/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09276
 */
package Nursultan;

import Nursultan.class09276;
import Nursultan.class11940;
import Nursultan.class11951;

public class class11987
implements class11951<class09276> {
    private static double[] L;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    public int L() {
        return (Integer)this.N_3;
    }

    public class11987() {
        this.i();
    }

    public class11987(double d, double d2, double d3, int n) {
        this.i();
        this.N_0 = d;
        this.N_1 = d2;
        this.N_2 = d3;
        this.N_3 = n;
    }

    static {
        class11987.Z();
    }

    private static void Z() {
        L = new double[3];
        class11987.L[0] = Double.longBitsToDouble(0L);
        class11987.L[1] = Double.longBitsToDouble(0L);
        class11987.L[2] = Double.longBitsToDouble(0L);
    }

    private void i() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = L[0];
            this.N_1 = L[1];
            this.N_2 = L[2];
            this.N_3 = 0;
        }
    }

    public double u() {
        return (Double)this.N_1;
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = class119402.i();
        this.N_1 = class119402.i();
        this.N_2 = class119402.i();
        this.N_3 = class119402.R();
    }

    public double y() {
        return (Double)this.N_0;
    }

    public double N() {
        return (Double)this.N_2;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N((Double)this.N_0);
        class119402.N((Double)this.N_1);
        class119402.N((Double)this.N_2);
        class119402.y((Integer)this.N_3);
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }
}

