/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09693
 *  Nursultan.class09819
 *  Nursultan.class11934
 */
package Nursultan;

import Nursultan.class09693;
import Nursultan.class09819;
import Nursultan.class11857;
import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import Nursultan.class11934;
import java.time.Duration;

public class class11865
implements class09819 {
    private static double[] Z;
    public Object N_0;
    public Object N_1;
    public Object N_2;

    private static void L() {
        Z = new double[2];
        class11865.Z[0] = Double.longBitsToDouble(0L);
        class11865.Z[1] = Double.longBitsToDouble(0x3FF0000000000000L);
    }

    boolean M() {
        return (String)this.N_2 != null;
    }

    public class11865() {
        this.u();
        this.N_0 = new class11934(class11903.FORWARDS);
    }

    static {
        class11865.L();
    }

    float i() {
        return class09693.N((float)((class11934)this.N_0).E().floatValue());
    }

    private void u() {
    }

    String y() {
        return (String)this.N_2;
    }

    public boolean N(float f) {
        ((class11934)this.N_0).N();
        if ((String)this.N_2 != null && !((class11934)this.N_0).M()) {
            this.N_2 = null;
        }
        return true;
    }

    public boolean N() {
        return (String)this.N_2 != null || ((class11934)this.N_0).M();
    }

    void N(String string) {
        if ((String)this.N_1 == null) {
            this.N_1 = string;
            return;
        }
        if (((String)this.N_1).equals(string)) {
            return;
        }
        this.N_2 = (String)this.N_1;
        this.N_1 = string;
        ((class11934)this.N_0).N(Z[0], Duration.ZERO, (class11887)class11905.u_4);
        ((class11934)this.N_0).N(Z[1], (Duration)class11857.y_2, (class11887)class11905.u_4);
    }
}

