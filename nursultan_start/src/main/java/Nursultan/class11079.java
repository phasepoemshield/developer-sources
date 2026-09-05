/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.AttackAura
 *  Nursultan.class11281
 *  Nursultan.class11315
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11507
 *  Nursultan.class11534
 *  Nursultan.class11535
 *  Nursultan.class11820
 *  Nursultan.class11891
 *  Nursultan.class11892
 *  Nursultan.class11899
 *  Nursultan.class11907
 *  Nursultan.class11915
 *  Nursultan.class11938
 *  minecraft.class00734
 *  minecraft.class02484
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04474
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class06202
 *  minecraft.class06543
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08172
 */
package Nursultan;

import Nursultan.AttackAura;
import Nursultan.class11281;
import Nursultan.class11315;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11507;
import Nursultan.class11534;
import Nursultan.class11535;
import Nursultan.class11820;
import Nursultan.class11891;
import Nursultan.class11892;
import Nursultan.class11899;
import Nursultan.class11907;
import Nursultan.class11915;
import Nursultan.class11938;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06543;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08172;

public abstract class class11079
extends class11535 {
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public Object y_5;
    public Object y_6;
    public boolean y_init;

    public boolean L() {
        return class11938.u().p().U();
    }

    public boolean L(class07438 class074382) {
        boolean bl;
        this.W();
        if (((AttackAura)this.y_1).T()) {
            return false;
        }
        if (((Boolean)this.y_3).booleanValue() && class11907.N((class07438)class074382, (class07049)((class04453)((class06202)this.y_0).T_4))) {
            return true;
        }
        if (class11315.N((int)this.N())) {
            return false;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_75202(((class04453)((class06202)this.y_0).T_4).method_6047(), 0)) {
            return false;
        }
        double d = ((AttackAura)this.y_1).m();
        class06889 class068892 = this.N(class074382, d);
        if (!this.N(class074382, class068892, d)) {
            return false;
        }
        if (!(((class04453)((class06202)this.y_0).T_4).method_24828() || class11315.N((int)(this.N() - 4)) || class11315.N((float)4.5f) || this.y() && !(class11899.N((int)2).i() > 0.0))) {
            ((AttackAura)this.y_1).j();
        }
        boolean bl2 = bl = class11315.y() || (Boolean)((class11507)((AttackAura)this.y_1).Z_3).i() == false && ((class04453)((class06202)this.y_0).T_4).method_6059(class07047.Y);
        if (this.y() && bl && !((Boolean)this.y_2).booleanValue()) {
            if (this.N(class11899.N((int)1))) {
                ((AttackAura)this.y_1).L(1);
            }
            if (((Boolean)((class04453)((class06202)this.y_0).T_4).R_6).booleanValue()) {
                return false;
            }
        }
        if (!((Boolean)this.y_2 != false && ((class04453)((class06202)this.y_0).T_4).field_6017 > (double)1.3f && (Integer)this.y_4 <= 0) && class11315.N((float)0.5f)) {
            return false;
        }
        if (this.y(class074382, class068892, d)) {
            return false;
        }
        if (this.y() && (((class04453)((class06202)this.y_0).T_4).field_6017 == 0.0 || !((AttackAura)this.y_1).n() && class11891.N()) && bl) {
            return false;
        }
        if (!((class04453)((class06202)this.y_0).T_4).method_24828()) {
            ((AttackAura)this.y_1).j();
        }
        return ((AttackAura)this.y_1).G();
    }

    public class11079(AttackAura attackAura, String string, boolean bl) {
        super(string, bl);
        this.W();
        this.y_0 = class06202.Nq();
        this.y_1 = attackAura;
    }

    public class11079(AttackAura attackAura, String string) {
        this(attackAura, string, false);
    }

    public boolean u() {
        this.W();
        if (((class04453)((class06202)this.y_0).T_4).method_6047().N(class06570.Gm)) {
            return true;
        }
        if (((class04453)((class06202)this.y_0).T_4).field_6017 < 1.0) {
            return false;
        }
        return (Boolean)((class11507)((AttackAura)this.y_1).i_4).i() != false && class11281.N((int)class11281.R((class06581)class06570.Gm)).isPresent();
    }

    public void u(class07438 class074382) {
        this.W();
        if (((Boolean)this.y_3).booleanValue()) {
            this.y_3 = false;
            if (class11907.N((class07438)class074382, (class07049)((class04453)((class06202)this.y_0).T_4))) {
                class11907.y((class07438)class074382);
                this.y_5 = 5;
                return;
            }
        }
        if (((class04453)((class06202)this.y_0).T_4).method_6039()) {
            ((class03443)((class06202)this.y_0).T_2).y((class08036)((class04453)((class06202)this.y_0).T_4));
        }
        ((AttackAura)this.y_1).N(10);
        class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_6047();
        class08172 class081722 = (class08172)class065842.method_58694(class02484.c);
        if (class081722 != null) {
            if (((class03443)((class06202)this.y_0).T_2).Z()) {
                return;
            }
            ((class03443)((class06202)this.y_0).T_2).N(class081722);
            ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
            ((AttackAura)this.y_1).t();
        } else {
            ((class03443)((class06202)this.y_0).T_2).N((class08036)((class04453)((class06202)this.y_0).T_4), (class07049)class074382);
            ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
        }
        if (((Boolean)((class11507)((AttackAura)this.y_1).i_3).i()).booleanValue() && (Integer)this.y_5 <= 0 && class11907.N((class07438)class074382, (class07049)((class04453)((class06202)this.y_0).T_4))) {
            this.y_3 = true;
        }
        if (class065842.N(class06570.Gm)) {
            this.y_4 = 20;
        }
    }

    public boolean y(class07438 class074382) {
        this.W();
        return (Boolean)((class11507)((AttackAura)this.y_1).i_3).i() == false || (Boolean)this.y_3 == false;
    }

    public boolean y(class11915 class119152) {
        this.W();
        if (((class04453)((class06202)this.y_0).T_4).field_6017 <= 1.0) {
            return false;
        }
        return class119152.u().R() && ((class04453)((class06202)this.y_0).T_4).field_6017 > 1.5 || class119152.u().L();
    }

    public boolean y() {
        this.W();
        if (((class04453)((class06202)this.y_0).T_4).method_6047().L(class02484.c)) {
            return false;
        }
        if (((class11535)((AttackAura)this.y_1).B_3).U()) {
            return false;
        }
        if (((class11535)((AttackAura)this.y_1).Z_1).U()) {
            return ((class04474)((class04453)((class06202)this.y_0).T_4).L_1).field_54155.i() || !((class04453)((class06202)this.y_0).T_4).method_24828();
        }
        return true;
    }

    public boolean y(class07438 class074382, class06889 class068892, double d) {
        this.W();
        if (!this.y() || !((Boolean)this.y_2).booleanValue()) {
            this.y_6 = 0;
            return false;
        }
        class11915 class119152 = class11899.N((int)1);
        if (this.y(class119152)) {
            this.y_6 = 0;
            return false;
        }
        if (!this.N(class119152, class074382, class068892, d)) {
            this.y_6 = 0;
            return false;
        }
        int n = (Integer)this.y_6 + 1;
        this.y_6 = n;
        if (n >= 10) {
            this.y_6 = 0;
            return false;
        }
        return true;
    }

    public class11499 y(class07438 class074382, boolean bl, double d) {
        class11499 class114992 = this.N(class074382, bl, d);
        class11820 class118202 = class11820.N((class07438)class074382, (class11499)class114992, (boolean)bl);
        class11938.L().L((Object)class118202);
        return class118202.N();
    }

    public abstract class06889 N(class07438 var1, double var2);

    public int N() {
        return 10;
    }

    public boolean N(class11915 class119152, class07438 class074382, class06889 class068892, double d) {
        this.W();
        double d2 = 2.0;
        double d3 = (class074382.method_23317() - class074382.field_6014) * d2;
        double d4 = (class074382.method_23318() - class074382.field_6036) * d2;
        double d5 = (class074382.method_23321() - class074382.field_5969) * d2;
        double d6 = class074382.method_23318() - ((class04453)((class06202)this.y_0).T_4).method_23318();
        if (d6 > 0.0 && d6 <= 1.5 && d4 < 0.0) {
            return false;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_6047().N(class06570.Gm) && class119152.i() < 1.0) {
            return true;
        }
        if (class119152.i() < 1.0) {
            return false;
        }
        if (((Boolean)((class04453)((class06202)this.y_0).T_4).R_6).booleanValue() && this.y(class11899.N((int)2))) {
            ((AttackAura)this.y_1).L(1);
            ((AttackAura)this.y_1).y(1);
        }
        class07438 class074383 = class119152.u().i();
        class06889 class068894 = class074383.method_33571();
        class06889 class068895 = class068892.y(d3, d4, d5);
        if (!((AttackAura)this.y_1).l() && !class11892.N((class06889)class068894, (class06889)class068895, (class05849)class05849.field_17558, (class05835)class05835.field_1348)) {
            return false;
        }
        class00734 class007342 = class074383.method_5829().L(class119152.u().N()).M(0.1);
        if (((class03448)((class06202)this.y_0).T_3).u(class007342)) {
            return false;
        }
        return class074382.method_5829().u(d3, d4, d5).y(class068894, class068895).map(class068893 -> class068893.R(class068894) < d).orElse(false);
    }

    public boolean N(class11915 class119152) {
        this.W();
        return (Boolean)((class04453)((class06202)this.y_0).T_4).R_6 != false && !class11315.N((int)(this.N() - 1)) && class119152.i() > 0.0 && !class11315.N((float)1.5f);
    }

    public boolean N(class07438 class074382, class06889 class068892, double d) {
        this.W();
        class06889 class068893 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        class06889 class068894 = class11505.N((class06889)class068892).U().L(d).i(class068893);
        return !class11892.N((class06889)class068893, (class06889)class068894, (class07049)class074382);
    }

    public void N(class07438 class074382) {
        class11499 class114992;
        this.W();
        if ((Integer)this.y_4 > 0) {
            this.y_4 = (Integer)this.y_4 - 1;
        }
        if ((Integer)this.y_5 > 0) {
            this.y_5 = (Integer)this.y_5 - 1;
        }
        this.y_2 = this.u();
        if (((Boolean)this.y_2).booleanValue() && (Integer)this.y_5 <= 0 && class11907.N((class07438)class074382, (class07049)((class04453)((class06202)this.y_0).T_4))) {
            this.y_3 = true;
        }
        if (this.L(class074382)) {
            class114992 = this.y(class074382, true, ((AttackAura)this.y_1).m());
            if (!this.N(class074382, class114992)) {
                this.u(class074382);
            }
        } else {
            class114992 = this.y(class074382, false, ((AttackAura)this.y_1).d());
        }
        class11534.y((class11499)class114992.y(((AttackAura)this.y_1).b()));
    }

    public abstract class11499 N(class07438 var1, boolean var2, double var3);

    public boolean N(class07438 class074382, class11499 class114992) {
        this.W();
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_33571();
        class06889 class068893 = class114992.U().L(((AttackAura)this.y_1).m()).i(class068892);
        class06889 class068894 = class11892.y((class06889)class068892, (class06889)class068893, (class07049)class074382).orElse(null);
        if (class068894 == null) {
            return true;
        }
        class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_6047();
        if (class065842.L(class02484.c)) {
            return false;
        }
        class06543 class065432 = (class06543)class065842.method_58694(class02484.I);
        return class065432 != null && !class065432.N((class07438)((class04453)((class06202)this.y_0).T_4), class068894);
    }

    private void W() {
        if (!this.y_init) {
            this.y_init = true;
            this.y_2 = false;
            this.y_3 = false;
            this.y_4 = 0;
            this.y_5 = 0;
            this.y_6 = 0;
        }
    }
}

