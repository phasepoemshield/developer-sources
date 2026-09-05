/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11322
 *  Nursultan.class11360
 *  Nursultan.class11393
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11524
 *  Nursultan.class11534
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11892
 *  Nursultan.class11895
 *  minecraft.class00500
 *  minecraft.class00608
 *  minecraft.class00734
 *  minecraft.class00869
 *  minecraft.class00891
 *  minecraft.class01338
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06183
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class06918
 *  minecraft.class07041
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07064
 *  minecraft.class07078
 *  minecraft.class07082
 *  minecraft.class07113
 *  minecraft.class07209
 *  minecraft.class07290
 *  minecraft.class08036
 *  minecraft.class08092
 */
package Nursultan;

import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11360;
import Nursultan.class11393;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11524;
import Nursultan.class11534;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11892;
import Nursultan.class11895;
import minecraft.class00500;
import minecraft.class00608;
import minecraft.class00734;
import minecraft.class00869;
import minecraft.class00891;
import minecraft.class01338;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06183;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class06918;
import minecraft.class07041;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07064;
import minecraft.class07078;
import minecraft.class07082;
import minecraft.class07113;
import minecraft.class07209;
import minecraft.class07290;
import minecraft.class08036;
import minecraft.class08092;

@class11080(L="AutoExplosion", y=class11072.COMBAT, N=class11106.FIGHTING)
public class AutoExplosion
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;

    private void L(class07209 class072092, class11499 class114992) {
        this.b();
        if (!this.N(class072092)) {
            return;
        }
        class11534.y((class11499)class114992);
        class06183 class061832 = this.N(class072092, class114992);
        if (class061832 == null || class061832.N() != class07113.field_1332) {
            return;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_6079().N(class06570.ln)) {
            this.N(class061832, class07050.field_5810);
            this.L_2 = new class00734(class072092.method_10084()).M(0.5);
            return;
        }
        class11281.N((int)class11281.R((class06581)class06570.ln)).ifPresent(n -> {
            this.b();
            class11322.u((int)n);
            this.N(class061832);
            this.L_2 = new class00734(class072092.method_10084()).M(0.5);
            if (((Boolean)((class11507)this.u_4).i()).booleanValue()) {
                class11322.i();
            }
        });
    }

    private void P() {
        this.b();
        class11499 class114992 = class11505.N();
        for (class07049 class070493 : ((class03448)((class06202)this.y_0).T_3).method_8333((class07049)((class04453)((class06202)this.y_0).T_4), (class00734)this.L_2, class070492 -> class070492.method_5864() == class07078.S)) {
            class11499 class114993 = class11505.N((class11499)class114992, (class06889)class11895.N((class07049)class070493, (boolean)true, (double)((class04453)((class06202)this.y_0).T_4).method_55755()));
            class11499 class114994 = class114992.N(class114993).N(true).u(true);
            if (class11892.N((class11499)class114994, (double)((class04453)((class06202)this.y_0).T_4).method_55755(), (class07049)class070493)) continue;
            ((class03443)((class06202)this.y_0).T_2).N((class08036)((class04453)((class06202)this.y_0).T_4), class070493);
            ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
            class11534.y((class11499)class114994);
            this.L_2 = null;
            break;
        }
    }

    public AutoExplosion() {
        this.b();
        this.u_0 = new class11535("crystals", true);
        this.u_1 = new class11535("anchor", true);
        this.u_2 = class11524.y((class11512)this, (String)"triggers", (class11535[])new class11535[]{(class11535)this.u_0, (class11535)this.u_1});
        this.u_3 = class11524.N((class11512)this, (String)"any-item-click", (boolean)false);
        this.u_4 = class11524.N((class11512)this, (String)"reset-slot", (boolean)false);
    }

    private void b() {
    }

    private int n() {
        int n = ((class04453)((class06202)this.y_0).T_4).method_31548().N();
        if (this.N(((class04453)((class06202)this.y_0).T_4).method_31548().method_5438(n))) {
            return n;
        }
        int n2 = class11281.y(this::N);
        return class11281.y((int)n2) ? class11281.y(class065842 -> !class065842.N(class06570.Mu)) : n2;
    }

    private void y(class07209 class072092, class11499 class114992) {
        this.b();
        if (((Boolean)((class03448)((class06202)this.y_0).T_3).method_75728().N(class00608.O, class072092)).booleanValue()) {
            return;
        }
        class00500 class005002 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092);
        if (class005002.i() != class00869.TE) {
            return;
        }
        int n = (Integer)class005002.L((class08092)class01338.u);
        if (((class04453)((class06202)this.y_0).T_4).method_6079().N(class06570.Mu) && n < 4) {
            return;
        }
        class11534.y((class11499)class114992);
        class06183 class061832 = this.N(class072092, class114992);
        if (class061832 == null || class061832.N() != class07113.field_1332) {
            return;
        }
        int n2 = this.n();
        if (class11281.y((int)n2)) {
            return;
        }
        if (n == 0) {
            int n3 = class11281.R((class06581)class06570.Mu);
            if (class11281.y((int)n3)) {
                return;
            }
            class11322.u((int)n3);
            this.N(class061832);
        }
        class11322.u((int)n2);
        this.N(class061832);
        if (((Boolean)((class11507)this.u_4).i()).booleanValue()) {
            class11322.i();
        }
    }

    private boolean N(class07209 class072092) {
        class00500 class005002 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092);
        if (!class005002.N(class00869.LV) && !class005002.N(class00869.q)) {
            return false;
        }
        class07209 class072093 = class072092.method_10084();
        if (!((class03448)((class06202)this.y_0).T_3).R(class072093)) {
            return false;
        }
        double d = class072093.method_10263();
        double d2 = class072093.method_10264();
        double d3 = class072093.method_10260();
        return ((class03448)((class06202)this.y_0).T_3).N_70(null, new class00734(d, d2, d3, d + 1.0, d2 + 2.0, d3 + 1.0)).isEmpty();
    }

    @class11782
    public void N(class11360 class113602) {
        this.b();
        class00891 class008912 = class113602.N().i();
        if (((class11535)this.u_0).U() && class008912 == class00869.LV) {
            this.L_0 = class113602.y();
            this.L_1 = class11505.L();
        } else if (((class11535)this.u_1).U() && class008912 == class00869.TE) {
            this.L_3 = class113602.y();
            this.L_4 = class11505.L();
        }
    }

    @class11782
    public void N(class11393 class113932) {
        this.b();
        class07209 class072092 = class113932.L().u();
        class00891 class008912 = ((class03448)((class06202)this.y_0).T_3).method_8320(class072092).i();
        class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_5998(class113932.u());
        if (((class11535)this.u_0).U() && (class008912 == class00869.LV || class008912 == class00869.q)) {
            if (class065842.N(class06570.ln) && this.N(class072092)) {
                this.L_2 = new class00734(class072092.method_10084()).M(0.5);
            } else if (((Boolean)((class11507)this.u_3).i()).booleanValue()) {
                this.L_0 = class072092;
                this.L_1 = class11505.L();
            }
        } else if (((class11535)this.u_1).U() && class008912 == class00869.TE && (class065842.N(class06570.Mu) || ((Boolean)((class11507)this.u_3).i()).booleanValue())) {
            this.L_3 = class072092;
            this.L_4 = class11505.L();
        }
    }

    @class11782
    public void N(class10992 class109922) {
        this.b();
        if ((class07209)this.L_0 != null && (class11499)this.L_1 != null) {
            this.L((class07209)this.L_0, (class11499)this.L_1);
            this.L_0 = null;
            this.L_1 = null;
        } else if ((class00734)this.L_2 != null) {
            this.P();
        } else if ((class07209)this.L_3 != null && (class11499)this.L_4 != null) {
            this.y((class07209)this.L_3, (class11499)this.L_4);
            this.L_3 = null;
            this.L_4 = null;
        }
    }

    private boolean N(class06584 class065842) {
        return !class065842.N(class06570.Mu) && !(class065842.B() instanceof class06918);
    }

    private class06183 N(class07209 class072092, class11499 class114992) {
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        class06889 class068893 = class068892.i(class114992.U().L(((class04453)((class06202)this.y_0).T_4).method_55754()));
        return ((class03448)((class06202)this.y_0).T_3).method_8320(class072092).R((class07290)((class03448)((class06202)this.y_0).T_3), class072092).method_1092(class068892, class068893, class072092);
    }

    private void N(class06183 class061832) {
        this.N(class061832, class07050.field_5808);
    }

    private void N(class06183 class061832, class07050 class070502) {
        class07082 class070822 = ((class03443)((class06202)this.y_0).T_2).N((class04453)((class06202)this.y_0).T_4, class070502, class061832);
        if (class070822 instanceof class07041 && ((class07041)class070822).i() == class07064.field_52427) {
            ((class04453)((class06202)this.y_0).T_4).method_6104(class070502);
        }
    }
}

