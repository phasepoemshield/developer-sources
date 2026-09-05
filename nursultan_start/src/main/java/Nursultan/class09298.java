/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09263
 *  Nursultan.class11940
 *  Nursultan.class11951
 */
package Nursultan;

import Nursultan.class09263;
import Nursultan.class11940;
import Nursultan.class11951;

public class class09298
implements class11951<class09263> {
    private static double[] u;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;

    public double L() {
        return (Double)this.N_2;
    }

    private void M() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = u[0];
            this.N_3 = u[1];
            this.N_4 = u[2];
        }
    }

    public class09298(String string, String string2, double d, double d2, double d3) {
        this.M();
        this.N_0 = string;
        this.N_1 = string2;
        this.N_2 = d;
        this.N_3 = d2;
        this.N_4 = d3;
    }

    public class09298() {
        this.M();
    }

    static {
        class09298.R();
    }

    public String i() {
        return (String)this.N_1;
    }

    public String u() {
        return (String)this.N_0;
    }

    public double y() {
        return (Double)this.N_4;
    }

    public void y(class11940 class119402) {
        this.N_0 = class119402.P();
        this.N_1 = class119402.P();
        this.N_2 = class119402.i();
        this.N_3 = class119402.i();
        this.N_4 = class119402.i();
    }

    public double N() {
        return (Double)this.N_3;
    }

    public void N(class09263 class092632) {
        class092632.N(this);
    }

    public void N(class11940 class119402) {
        class119402.N((String)this.N_0);
        class119402.N((String)this.N_1);
        class119402.N(((Double)this.N_2).doubleValue());
        class119402.N(((Double)this.N_3).doubleValue());
        class119402.N(((Double)this.N_4).doubleValue());
    }

    private static void R() {
        u = new double[3];
        class09298.u[0] = Double.longBitsToDouble(0L);
        class09298.u[1] = Double.longBitsToDouble(0L);
        class09298.u[2] = Double.longBitsToDouble(0L);
    }
}

