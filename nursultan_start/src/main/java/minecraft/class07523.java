/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class02131
 *  minecraft.class02154
 *  minecraft.class03289
 *  minecraft.class03696
 *  minecraft.class04293
 *  minecraft.class04383
 *  minecraft.class04782
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class04911
 *  minecraft.class04995
 *  minecraft.class05298
 *  minecraft.class05300
 *  minecraft.class06069
 *  minecraft.class06113
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07072
 *  minecraft.class07078
 *  minecraft.class07079
 *  minecraft.class07086
 *  minecraft.class07209
 *  minecraft.class07284
 *  minecraft.class07299
 *  minecraft.class07438
 *  minecraft.class07952
 *  minecraft.class08024
 *  minecraft.class08036
 *  minecraft.class08299
 *  minecraft.class08329
 */
package minecraft;

import minecraft.class00500;
import minecraft.class02131;
import minecraft.class02154;
import minecraft.class03289;
import minecraft.class03696;
import minecraft.class04293;
import minecraft.class04383;
import minecraft.class04782;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class04911;
import minecraft.class04995;
import minecraft.class05298;
import minecraft.class05300;
import minecraft.class06069;
import minecraft.class06113;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07072;
import minecraft.class07078;
import minecraft.class07079;
import minecraft.class07086;
import minecraft.class07209;
import minecraft.class07284;
import minecraft.class07299;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07519;
import minecraft.class07521;
import minecraft.class07535;
import minecraft.class07542;
import minecraft.class07547;
import minecraft.class07952;
import minecraft.class08024;
import minecraft.class08036;
import minecraft.class08299;
import minecraft.class08329;

public class class07523
extends class07079
implements class07542 {
    private static final class02131<Boolean> N = class03289.N(class07523.class, (class04383)class02154.U);
    private static final byte y = 1;
    private int L = 1;

    public boolean M() {
        return (Boolean)this.field_6011.N(N);
    }

    public boolean method_70986() {
        return true;
    }

    public void method_5693(class04293 class042932) {
        super.method_5693(class042932);
        class042932.N(N, (Object)false);
    }

    public class04911 method_5634() {
        return class04911.field_15251;
    }

    public boolean method_64397(class04782 class047822, class07072 class070722, float f) {
        if (class07523.N(class070722)) {
            super.method_64397(class047822, class070722, 1000.0f);
            return true;
        }
        if (this.method_5679(class047822, class070722)) {
            return false;
        }
        return super.method_64397(class047822, class070722, f);
    }

    public void method_5623(double d, boolean bl, class00500 class005002, class07209 class072092) {
    }

    public void method_5652(class08329 class083292) {
        super.method_5652(class083292);
        class083292.N("ExplosionPower", (byte)this.L);
    }

    public void method_5749(class08299 class082992) {
        super.method_5749(class082992);
        this.L = class082992.N("ExplosionPower", (byte)1);
    }

    public class07523(class07078<? extends class07523> class070782, class07299 class072992) {
        super(class070782, class072992);
        this.J = 5;
        this.q = new class07547(this, false, () -> false);
    }

    public int B() {
        return this.L;
    }

    public static class05300 Z() {
        return class07079.H().N(class05298.n, 10.0).N(class05298.P, 100.0).N(class05298.z, 8.0).N(class05298.m, 0.06);
    }

    protected class04891 s() {
        return class04909.Eh;
    }

    public static void N(class07079 class070792) {
        if (class070792.T() == null) {
            class06889 class068892 = class070792.method_18798();
            class070792.method_36456(-((float)class04995.u((double)class068892.M, (double)class068892.Z)) * 57.295776f);
            class070792.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(class070792.method_36454());
        } else {
            class07438 class074382 = class070792.T();
            double d = 64.0;
            if (class074382.method_5858((class07049)class070792) < 4096.0) {
                double d2 = class074382.method_23317() - class070792.method_23317();
                double d3 = class074382.method_23321() - class070792.method_23321();
                class070792.method_36456(-((float)class04995.u((double)d2, (double)d3)) * 57.295776f);
                class070792.fields_4212a028292fd3c078969e3ee4c71d9e8_0 = Float.valueOf(class070792.method_36454());
            }
        }
    }

    public static boolean N(class07078<class07523> class070782, class07284 class072842, class06113 class061132, class07209 class072092, class06069 class060692) {
        return class072842.y() != class07086.field_5801 && class060692.y(20) == 0 && class07523.y(class070782, (class07284)class072842, (class06113)class061132, (class07209)class072092, (class06069)class060692);
    }

    public void N(boolean bl) {
        this.field_6011.N(N, (Object)bl);
    }

    private static boolean N(class07072 class070722) {
        return class070722.L() instanceof class08024 && class070722.u() instanceof class08036;
    }

    protected void l_() {
        this.e.N(5, new class07535(this));
        this.e.N(7, new class07519(this));
        this.e.N(7, new class07521(this));
        this.H.N(1, (class07473)new class07952((class07079)this, class08036.class, 10, true, false, (class074382, class047822) -> Math.abs(class074382.method_23318() - this.method_23318()) <= 4.0));
    }

    public int n_() {
        return 1;
    }

    public double p_() {
        return 16.0;
    }

    public double q_() {
        return 10.0;
    }

    public boolean method_5679(class04782 class047822, class07072 class070722) {
        return this.method_5655() && !class070722.N(class03696.u) || !class07523.N(class070722) && super.method_5679(class047822, class070722);
    }

    public class04891 method_6002() {
        return class04909.Er;
    }

    public float method_6107() {
        return 5.0f;
    }

    public void method_6091(class06889 class068892) {
        this.method_70670(class068892, 0.02f);
    }

    public boolean method_6101() {
        return false;
    }

    public class04891 method_6011(class07072 class070722) {
        return class04909.WN;
    }
}

