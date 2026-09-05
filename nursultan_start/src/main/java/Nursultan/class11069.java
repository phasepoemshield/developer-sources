/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class09123
 *  Nursultan.class09127
 *  Nursultan.class09146
 *  Nursultan.class09152
 *  Nursultan.class09160
 *  Nursultan.class09170
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11534
 *  Nursultan.class11799
 *  Nursultan.class11908
 *  minecraft.class00734
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class05862
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07113
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class09123;
import Nursultan.class09127;
import Nursultan.class09146;
import Nursultan.class09152;
import Nursultan.class09160;
import Nursultan.class09170;
import Nursultan.class11063;
import Nursultan.class11064;
import Nursultan.class11076;
import Nursultan.class11079;
import Nursultan.class11087;
import Nursultan.class11095;
import Nursultan.class11097;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11534;
import Nursultan.class11799;
import Nursultan.class11908;
import minecraft.class00734;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class05862;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07113;
import minecraft.class07438;

public class class11069
extends class11079 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public boolean L_init;

    private void P() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = 0;
        }
        if (!this.N_init) {
            this.N_init = true;
            this.N_4 = 0;
        }
    }

    public class11069(AttackAura attackAura, String string) {
        super(attackAura, string);
        this.P();
        this.L_2 = new class11087();
        this.L_3 = new class11095();
        this.N_0 = new class09146();
        this.N_1 = new class09152();
        this.N_2 = new class09127();
        this.N_3 = new class11076();
        this.N_4 = Integer.MIN_VALUE;
    }

    @Override
    public void u(class07438 class074382) {
        this.P();
        super.u(class074382);
        this.L_1 = (Integer)this.L_1 + 1;
        ((AttackAura)this.y_1).y(class11908.N((int)0, (int)2));
        class11087.N_0 = (class06202)this.y_0;
        ((class11087)this.L_2).N((float)((AttackAura)this.y_1).m());
    }

    @Override
    public boolean y() {
        class00734 class007342 = ((class04453)((class06202)this.y_0).T_4).method_5829().u(0.0, (double)0.1f, 0.0);
        class00734 class007343 = ((class04453)((class06202)this.y_0).T_4).method_5829().u(0.0, -0.5, 0.0);
        boolean bl = ((class03448)((class06202)this.y_0).T_3).method_8600((class07049)((class04453)((class06202)this.y_0).T_4), class007342).iterator().hasNext();
        boolean bl2 = ((class03448)((class06202)this.y_0).T_3).method_8600((class07049)((class04453)((class06202)this.y_0).T_4), class007343).iterator().hasNext();
        if (bl && bl2 && this.N() == 13) {
            return false;
        }
        return super.y();
    }

    static boolean y(class07438 class074382, class11499 class114992, float f) {
        class06202 class062022 = (class06202)class11087.N_0;
        if ((class04453)class062022.T_4 == null || (class03448)class062022.T_3 == null || class074382 == null || class114992 == null || f <= 0.0f) {
            return false;
        }
        class06889 class068892 = ((class04453)class062022.T_4).method_33571();
        class06889 class068893 = ((class04453)class062022.T_4).method_5631(class114992.R(), class114992.y());
        class06889 class068894 = class068892.i(class068893.L((double)f));
        class00734 class007342 = new class00734(class068892, class068892).y(class068893.L((double)f)).M(1.0);
        class07049 class070493 = null;
        double d = f * f;
        for (class07049 class070494 : ((class03448)class062022.T_3).method_8333((class07049)((class04453)class062022.T_4), class007342, class070492 -> !class070492.method_7325() && class070492.method_5863())) {
            class06889 class068895;
            class00734 class007343 = class070494 == class074382 ? class11064.u(class070494) : class11064.L(class070494).M(Math.max(1.0E-4, (double)class070494.method_5871()));
            class06889 class068896 = class068895 = class007343.u(class068892) ? class068892 : (class06889)class007343.y(class068892, class068894).orElse(null);
            if (class068895 == null) continue;
            double d2 = class068892.M(class068895);
            if (class070493 != null && d2 >= d) continue;
            class070493 = class070494;
            d = d2;
        }
        class06183 class061832 = ((class03448)class062022.T_3).N(new class05862(class068892, class068894, class05849.field_17558, class05835.field_1348, (class07049)((class04453)class062022.T_4)));
        boolean bl = class061832 != null && class061832.N() == class07113.field_1332 && class068892.M(class061832.y()) <= d;
        return !bl && class070493 == class074382;
    }

    @Override
    public class11499 N(class07438 class074382, boolean bl, double d) {
        this.P();
        class11087.N_0 = (class06202)this.y_0;
        ((class11087)this.L_2).N((float)d, bl, true);
        if ((class04453)((class06202)this.y_0).T_4 == null || class074382 == null) {
            class11499 class114992 = class11505.L();
            this.N(class114992);
            return class114992;
        }
        class11499 class114993 = class11505.N();
        if (((Integer)this.N_4).intValue() != class074382.method_5628()) {
            this.N_4 = class074382.method_5628();
            ((class11095)this.L_3).N();
            ((class09146)this.N_0).N();
            ((class09152)this.N_1).N(class114993);
            ((class09127)this.N_2).N(class114993);
            ((class11076)this.N_3).N();
            ((class11087)this.L_2).y_4 = System.currentTimeMillis();
        }
        boolean bl2 = ((class11087)this.L_2).N();
        boolean bl3 = ((class11063)((class11087)this.L_2).y_0).N((class11087)this.L_2, class074382);
        boolean bl4 = (class03443)((class06202)this.y_0).T_2 != null && ((class11799)((class03443)((class06202)this.y_0).T_2)).N() < 2;
        class11097 class110972 = ((class11095)this.L_3).N((class11087)this.L_2, class074382, class114993, new class11499(((class04453)((class06202)this.y_0).T_4).field_5982, ((class04453)((class06202)this.y_0).T_4).field_6004), bl2, bl4, bl3);
        class09160 class091602 = ((class09146)this.N_0).N((class11087)this.L_2, class114993, class110972, bl2, bl4, bl3);
        class11499 class114994 = new class11499(class110972.y().y() + class091602.y(), class110972.y().R() + class091602.R());
        class09123 class091232 = ((class09152)this.N_1).N((class11087)this.L_2, class074382, class114993, class114994, class091602.u(), class091602.N(), class091602.i(), class110972.N(), class110972.z() && !class110972.R() && !class091602.L());
        return ((class09127)this.N_2).N((class11087)this.L_2, class074382, class114993, class091232.y(), class091232.N(), class091232.L(), bl2 && bl3, bl4, class091602.i(), class110972.N(), class110972.z(), class110972.M() || class110972.R() || class091602.L()).L().N(true).u(true);
    }

    @Override
    public void N(class07438 class074382) {
        this.y_2 = this.u();
        class11499 class114992 = this.y(class074382, false, ((AttackAura)this.y_1).d());
        if (this.L(class074382) && !this.N(class074382, class114992)) {
            this.u(class074382);
        }
        class11534.y((class11499)class114992.y(((AttackAura)this.y_1).b()));
    }

    @Override
    public int N() {
        this.P();
        return super.N() + ((Integer)this.L_1 % 4 == 0 ? 3 : 0);
    }

    static class06889 N(class07438 class074382, class11499 class114992, float f) {
        class06202 class062022 = (class06202)class11087.N_0;
        if ((class04453)class062022.T_4 == null || class074382 == null) {
            return null;
        }
        class00734 class007342 = class11064.L((class07049)class074382);
        double d = (class007342.N + class007342.u) * 0.5;
        double d2 = (class007342.L + class007342.R) * 0.5;
        double d3 = Math.max(0.015, class007342.y() * 0.18);
        double d4 = Math.max(0.015, class007342.u() * 0.18);
        double d5 = class007342.N + d3;
        double d6 = class007342.u - d3;
        double d7 = class007342.L + d4;
        double d8 = class007342.R - d4;
        class06889 class068892 = class11064.N((class07049)class074382);
        double d9 = class04995.u((double)0.28, (double)class007342.y, (double)class007342.i);
        double d10 = class04995.u((double)0.18, (double)class007342.y, (double)class007342.i);
        double d11 = class04995.u((double)0.38, (double)class007342.y, (double)class007342.i);
        double d12 = class04995.u((double)0.46, (double)class007342.y, (double)class007342.i);
        class06889[] class06889Array = new class06889[]{new class06889(d, d9, d2), new class06889(class04995.N((double)class068892.M, (double)d5, (double)d6), class04995.N((double)class068892.B, (double)d10, (double)d11), class04995.N((double)class068892.Z, (double)d7, (double)d8)), new class06889(d5, d9, d2), new class06889(d6, d9, d2), new class06889(d, d9, d7), new class06889(d, d9, d8), new class06889(d, d10, d2), new class06889(d, d11, d2), new class06889(d, d12, d2)};
        class06889 class068893 = class06889Array[0];
        double d13 = Double.MAX_VALUE;
        class06889 class068894 = ((class04453)class062022.T_4).method_33571();
        for (class06889 class068895 : class06889Array) {
            double d14;
            double d15;
            double d16;
            double d17;
            class11499 class114993 = class09170.N((class06889)class068895);
            if (!class11069.y(class074382, class114993, f) || !((d17 = (d16 = (double)Math.abs(class09170.N((float)class114992.y(), (float)class114993.y()))) * 0.86 + (d15 = (double)Math.abs(class114992.R() - class114993.R())) * 4.2 + (d14 = Math.max(0.0, class068895.B - d11) * 3.8) + class068894.M(class068895) * 0.01) < d13)) continue;
            class068893 = class068895;
            d13 = d17;
        }
        return class068893;
    }

    @Override
    public class06889 N(class07438 class074382, double d) {
        this.P();
        class11087.N_0 = (class06202)this.y_0;
        ((class11087)this.L_2).N((float)d, false, false);
        if ((class04453)((class06202)this.y_0).T_4 == null || class074382 == null) {
            return class074382 == null ? class06889.L : class074382.method_33571();
        }
        class11499 class114992 = class11505.N();
        boolean bl = ((class11087)this.L_2).N(class074382, class114992);
        boolean bl2 = ((class11087)this.L_2).N();
        boolean bl3 = ((class11063)((class11087)this.L_2).y_0).N((class11087)this.L_2, class074382);
        return ((class11076)this.N_3).N(class11064.u((class07049)class074382), class074382, bl, bl2, bl3);
    }

    @Override
    public boolean N(class07438 class074382, class11499 class114992) {
        this.P();
        if (super.N(class074382, class114992)) {
            this.L_0 = 0;
            return true;
        }
        int n = (Integer)this.L_0 + 1;
        this.L_0 = n;
        return n < (((class11799)((class03443)((class06202)this.y_0).T_2)).N() < 15 ? 3 : 4);
    }

    private void N(class11499 class114992) {
        this.P();
        this.N_4 = Integer.MIN_VALUE;
        ((class11095)this.L_3).N();
        ((class09146)this.N_0).N();
        ((class09152)this.N_1).N(class114992);
        ((class09127)this.N_2).N(class114992);
        ((class11076)this.N_3).N();
        ((class11087)this.L_2).y_4 = System.currentTimeMillis();
    }
}

