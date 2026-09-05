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

public class class11975
implements class11951<class09276> {
    private static double[] i;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public double L() {
        return (Double)this.N_0;
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = i[0];
            this.N_1 = i[1];
            this.N_2 = i[2];
        }
    }

    public class11975() {
        this.M();
    }

    public class11975(double d, double d2, double d3) {
        this.M();
        this.N_0 = d;
        this.N_1 = d2;
        this.N_2 = d3;
    }

    static {
        class11975.i();
    }

    private static void i() {
        i = new double[3];
        class11975.i[0] = Double.longBitsToDouble(0L);
        class11975.i[1] = Double.longBitsToDouble(0L);
        class11975.i[2] = Double.longBitsToDouble(0L);
    }

    @Override
    public void y(class11940 class119402) {
        this.N_0 = class119402.i();
        this.N_1 = class119402.i();
        this.N_2 = class119402.i();
    }

    public double y() {
        return (Double)this.N_2;
    }

    public double N() {
        return (Double)this.N_1;
    }

    @Override
    public void N(class11940 class119402) {
        class119402.N((Double)this.N_0);
        class119402.N((Double)this.N_1);
        class119402.N((Double)this.N_2);
    }

    @Override
    public void N(class09276 class092762) {
        class092762.N(this);
    }
}

