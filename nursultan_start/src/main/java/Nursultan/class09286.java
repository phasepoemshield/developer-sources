/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11940
 *  Nursultan.class11951
 */
package Nursultan;

import Nursultan.class09263;
import Nursultan.class11940;
import Nursultan.class11951;

public class class09286
implements class11951<class09263> {
    private static double[] Z;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    public double L() {
        return (Double)this.N_4;
    }

    private static void M() {
        Z = new double[3];
        class09286.Z[0] = Double.longBitsToDouble(0L);
        class09286.Z[1] = Double.longBitsToDouble(0L);
        class09286.Z[2] = Double.longBitsToDouble(0L);
    }

    public class09286() {
        this.z();
    }

    public class09286(String string, int n, double d, double d2, double d3, int n2) {
        this.z();
        this.N_0 = string;
        this.N_1 = n;
        this.N_2 = d;
        this.N_3 = d2;
        this.N_4 = d3;
        this.N_5 = n2;
    }

    static {
        class09286.M();
    }

    public String i() {
        return (String)this.N_0;
    }

    private void z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
            this.N_2 = Z[0];
            this.N_3 = Z[1];
            this.N_4 = Z[2];
            this.N_5 = 0;
        }
    }

    public double u() {
        return (Double)this.N_2;
    }

    public int y() {
        return (Integer)this.N_1;
    }

    public void y(class11940 class119402) {
        this.N_0 = class119402.P();
        this.N_1 = class119402.R();
        this.N_2 = class119402.i();
        this.N_3 = class119402.i();
        this.N_4 = class119402.i();
        this.N_5 = class119402.R();
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }

    public double N() {
        return (Double)this.N_3;
    }

    public void N(class11940 class119402) {
        class119402.N((String)this.N_0);
        class119402.y(((Integer)this.N_1).intValue());
        class119402.N(((Double)this.N_2).doubleValue());
        class119402.N(((Double)this.N_3).doubleValue());
        class119402.N(((Double)this.N_4).doubleValue());
        class119402.y(((Integer)this.N_5).intValue());
    }

    public int R() {
        return (Integer)this.N_5;
    }
}

