/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.TargetInfoHud
 *  Nursultan.class09693
 *  Nursultan.class09819
 *  Nursultan.class11887
 *  Nursultan.class11903
 *  Nursultan.class11905
 *  Nursultan.class11934
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.TargetInfoHud;
import Nursultan.class09693;
import Nursultan.class09819;
import Nursultan.class11887;
import Nursultan.class11903;
import Nursultan.class11905;
import Nursultan.class11934;
import java.time.Duration;
import minecraft.class07438;

public class class11745
implements class09819 {
    private static double[] L;
    private static String[] B;
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public Object N_5;
    public boolean N_init;

    boolean L() {
        return this.m() && ((String)this.N_3).length() != ((String)this.N_2).length();
    }

    boolean M(int n) {
        return this.m() && ((String)this.N_3).length() == ((String)this.N_2).length() && ((String)this.N_3).charAt(n) != ((String)this.N_2).charAt(n);
    }

    public class11745() {
        this.u();
        this.N_0 = new class11934(class11903.FORWARDS);
        this.N_2 = B[0];
        this.N_5 = 1;
    }

    static {
        class11745.Z();
        class11745.i();
    }

    private static void Z() {
        L = new double[3];
        class11745.L[0] = Double.longBitsToDouble(0L);
        class11745.L[1] = Double.longBitsToDouble(0L);
        class11745.L[2] = Double.longBitsToDouble(0x3FF0000000000000L);
    }

    private static void i() {
        B = new String[1];
        class11745.B[0] = "";
    }

    private boolean m() {
        return (String)this.N_3 != null;
    }

    int U() {
        return (Integer)this.N_5;
    }

    String z() {
        return (String)this.N_2;
    }

    private void u() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_4 = Float.valueOf(0.0f);
            this.N_5 = 0;
        }
    }

    float E() {
        return class09693.N((float)((class11934)this.N_0).E().floatValue());
    }

    public boolean N() {
        return (String)this.N_3 != null || ((class11934)this.N_0).M();
    }

    public boolean N(float f) {
        ((class11934)this.N_0).N();
        if ((String)this.N_3 != null && !((class11934)this.N_0).M()) {
            this.N_3 = null;
        }
        return true;
    }

    void N(class07438 class074382, String string, float f) {
        if ((class07438)this.N_1 != class074382) {
            this.N_1 = class074382;
            this.N_2 = string;
            this.N_3 = null;
            this.N_4 = Float.valueOf(f);
            ((class11934)this.N_0).N(L[0], Duration.ZERO, (class11887)class11905.u_4);
            return;
        }
        if (((String)this.N_2).equals(string)) {
            this.N_4 = Float.valueOf(f);
            return;
        }
        this.N_5 = f < ((Float)this.N_4).floatValue() ? 1 : -1;
        this.N_3 = (String)this.N_2;
        this.N_2 = string;
        this.N_4 = Float.valueOf(f);
        ((class11934)this.N_0).N(L[1], Duration.ZERO, (class11887)class11905.u_4);
        ((class11934)this.N_0).N(L[2], (Duration)TargetInfoHud.U_2, (class11887)class11905.u_4);
    }

    String W() {
        return (String)this.N_3;
    }
}

