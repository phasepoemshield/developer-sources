/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10401
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11160
 *  Nursultan.class11281
 *  Nursultan.class11315
 *  Nursultan.class11322
 *  Nursultan.class11373
 *  Nursultan.class11380
 *  Nursultan.class11382
 *  Nursultan.class11385
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11785
 *  Nursultan.class11786
 *  Nursultan.class11791
 *  Nursultan.class11793
 *  Nursultan.class11809
 *  Nursultan.class11817
 *  Nursultan.class11892
 *  Nursultan.class11895
 *  Nursultan.class11899
 *  Nursultan.class11907
 *  Nursultan.class11915
 *  minecraft.class00734
 *  minecraft.class02484
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class04474
 *  minecraft.class04477
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class06145
 *  minecraft.class06202
 *  minecraft.class06543
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06889
 *  minecraft.class07042
 *  minecraft.class07049
 *  minecraft.class07050
 *  minecraft.class07089
 *  minecraft.class07438
 *  minecraft.class08036
 *  minecraft.class08172
 */
package Nursultan;

import Nursultan.TargetEsp;
import Nursultan.class10401;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11160;
import Nursultan.class11281;
import Nursultan.class11315;
import Nursultan.class11322;
import Nursultan.class11373;
import Nursultan.class11380;
import Nursultan.class11382;
import Nursultan.class11385;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11785;
import Nursultan.class11786;
import Nursultan.class11791;
import Nursultan.class11793;
import Nursultan.class11809;
import Nursultan.class11817;
import Nursultan.class11892;
import Nursultan.class11895;
import Nursultan.class11899;
import Nursultan.class11907;
import Nursultan.class11915;
import java.util.Iterator;
import java.util.List;
import minecraft.class00734;
import minecraft.class02484;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class04477;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06145;
import minecraft.class06202;
import minecraft.class06543;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06889;
import minecraft.class07042;
import minecraft.class07049;
import minecraft.class07050;
import minecraft.class07089;
import minecraft.class07438;
import minecraft.class08036;
import minecraft.class08172;

@class11080(L="TriggerBot", y=class11072.COMBAT, N=class11106.FIGHTING)
public class TriggerBot
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;
    public Object L_6;
    public boolean L_init;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object i_0;
    public Object i_1;
    public Object i_2;
    public Object i_3;
    public Object i_4;
    public Object i_5;
    public Object i_6;
    public Object i_7;
    public Object R_0;
    public Object R_1;
    public Object R_2;
    public Object R_3;
    public Object R_4;
    public Object R_5;
    public Object R_6;
    public Object R_7;
    public Object M_0;
    public Object M_1;
    public Object M_2;
    public boolean M_init;
    public static Object B_0;
    public static Object B_1;

    private boolean L(class07049 class070492) {
        this.T();
        if (!this.n()) {
            return false;
        }
        if (!((Boolean)this.M_0).booleanValue()) {
            return false;
        }
        class11915 class119152 = class11899.N((int)1);
        if (((class04453)((class06202)this.y_0).T_4).field_6017 > 1.0 && (class119152.u().R() && ((class04453)((class06202)this.y_0).T_4).field_6017 > 1.5 || class119152.u().L())) {
            return false;
        }
        return this.N(class119152, class070492, class11895.N((class07049)class070492), ((class04453)((class06202)this.y_0).T_4).method_55755());
    }

    private void T() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_0 = 0;
            this.L_1 = 0;
            this.L_2 = 0;
            this.L_3 = 0;
            this.L_4 = 0;
            this.L_5 = 0;
            this.L_6 = false;
        }
        if (!this.M_init) {
            this.M_init = true;
            this.M_0 = false;
            this.M_1 = 0;
            this.M_2 = false;
        }
    }

    private void Q() {
        for (class04477 class044772 : ((class03448)((class06202)this.y_0).T_3).method_18456()) {
            if (!(class044772 instanceof class10401)) continue;
            class11907.N((class10401)((class10401)class044772), (boolean)true);
        }
    }

    public TriggerBot() {
        this.T();
        this.u_0 = new class11785("invisible", false);
        this.u_1 = new class11786("naked", true);
        this.u_2 = new class11793("bot", true);
        this.u_3 = new class11809(class11791.B().and(class11791.N()).and(class11791.u().negate()).and((class11786)this.u_1).and((class11793)this.u_2).and((class11785)this.u_0), "players", true);
        this.i_0 = new class11809(class11791.L().and(class11791.N()).and(class11791.R().negate()), "animals", true);
        this.i_1 = new class11809(class11791.U().and(class11791.N()).and(class11791.R().negate()), "monsters", true);
        this.i_2 = new class11809(class11791.R().and(class11791.N()), "villagers", true);
        this.i_3 = class11524.y((class11512)this, (String)"targets", (class11535[])new class11809[]{(class11809)this.u_3, (class11809)this.i_0, (class11809)this.i_1, (class11809)this.i_2});
        this.i_4 = (class11523)class11524.y((class11512)this, (String)"target-condition", (class11535[])new class11817[]{(class11785)this.u_0, (class11786)this.u_1, (class11793)this.u_2}).N(class115362 -> {
            this.T();
            return ((class11809)this.u_3).U();
        });
        this.i_5 = class11524.y((class11512)this, (String)"do-not-attack", (class11535[])new class11160[]{class11160.u((boolean)false), class11160.N((boolean)false), class11160.L((boolean)false), class11160.y((boolean)false), class11160.R((boolean)false), class11160.i((boolean)false)});
        this.i_6 = new class11535("critical-disabled", true);
        this.i_7 = new class11535("critical-always", false);
        this.R_0 = new class11535("critical-only-space", false);
        this.R_1 = class11524.N((class11512)this, (String)"critical-hit", (class11535[])new class11535[]{(class11535)this.i_6, (class11535)this.i_7, (class11535)this.R_0});
        this.R_2 = new class11535("disable", true);
        this.R_3 = new class11535("default", false);
        this.R_4 = new class11535("fast", false);
        this.R_5 = (class11517)class11524.N((class11512)this, (String)"reset-sprint", (class11535[])new class11535[]{(class11535)this.R_2, (class11535)this.R_3, (class11535)this.R_4}).N(class115362 -> {
            this.T();
            return !((class11535)this.i_6).U();
        });
        this.R_6 = class11524.N((class11512)this, (String)"shield-break", (boolean)true);
        this.R_7 = class11524.N((class11512)this, (String)"auto-mace", (boolean)true);
    }

    static {
        TriggerBot.l();
    }

    private void s() {
        class07089 class070892 = class11892.N((class07049)((class04453)((class06202)this.y_0).T_4), (double)((class04453)((class06202)this.y_0).T_4).method_55755(), (boolean)true, this::y);
        if (!(class070892 instanceof class06145)) {
            return;
        }
        class06145 class061452 = (class06145)class070892;
        class07049 class070492 = class061452.L();
        if (!this.y(class070492) || !this.N(class070492)) {
            return;
        }
        this.N(class070492, null);
    }

    private boolean n() {
        this.T();
        if (((class04453)((class06202)this.y_0).T_4).method_6047().L(class02484.c)) {
            return false;
        }
        if (((class11535)this.i_6).U()) {
            return false;
        }
        if (((class11535)this.R_0).U()) {
            return ((class04474)((class04453)((class06202)this.y_0).T_4).L_1).field_54155.i() || !((class04453)((class06202)this.y_0).T_4).method_24828();
        }
        return true;
    }

    private static void l() {
        B_0 = 10;
        B_1 = 2;
    }

    public boolean m() {
        this.T();
        Iterator iterator = ((List)((class11523)this.i_5).i()).iterator();
        while (iterator.hasNext()) {
            if (!((class11160)iterator.next()).test((class06202)this.y_0)) continue;
            return true;
        }
        return false;
    }

    private void t() {
        for (class04477 class044772 : ((class03448)((class06202)this.y_0).T_3).method_18456()) {
            if (!(class044772 instanceof class10401)) continue;
            class11907.y((class10401)((class10401)class044772));
        }
    }

    private boolean v() {
        this.T();
        if (((class04453)((class06202)this.y_0).T_4).method_6047().N(class06570.Gm)) {
            return true;
        }
        if (((class04453)((class06202)this.y_0).T_4).field_6017 < 1.0) {
            return false;
        }
        return (Boolean)((class11507)this.R_7).i() != false && class11281.N((int)class11281.R((class06581)class06570.Gm)).isPresent();
    }

    private void u(int n) {
        this.T();
        if (n == (Integer)this.L_1) {
            this.L_2 = (Integer)this.L_2 + 1;
        } else {
            this.L_1 = n;
            this.L_2 = 0;
        }
        if ((Integer)this.L_2 >= 2) {
            this.L_0 = Math.max(0, n - 10 + 1);
            this.L_1 = 0;
            this.L_2 = 0;
        } else {
            this.L_0 = 0;
        }
    }

    private boolean y(class07049 class070492) {
        this.T();
        if (class070492 == null) {
            return false;
        }
        if (!class07042.B.test(class070492)) {
            return false;
        }
        Iterator iterator = ((List)((class11523)this.i_3).i()).iterator();
        while (iterator.hasNext()) {
            if (!((class11809)iterator.next()).test(class070492)) continue;
            return true;
        }
        return false;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(class08172 class081722) {
        class06543 class065432 = ((class04453)((class06202)this.y_0).T_4).method_76693();
        this.Q();
        try {
            class07089 class070892 = class11892.N((class07049)((class04453)((class06202)this.y_0).T_4), (float)((Float)((class04453)((class06202)this.y_0).T_4).R_1).floatValue(), (float)((Float)((class04453)((class06202)this.y_0).T_4).R_2).floatValue(), (double)class065432.y((class07049)((class04453)((class06202)this.y_0).T_4)), (boolean)false, this::y);
            if (!(class070892 instanceof class06145)) {
                return;
            }
            class06145 class061452 = (class06145)class070892;
            class07049 class070492 = class061452.L();
            if (!this.y(class070492) || !this.N(class070492)) {
                return;
            }
            if (!class065432.N((class07438)((class04453)((class06202)this.y_0).T_4), class061452.y())) {
                return;
            }
            if (!class11892.N((class06889)((class04453)((class06202)this.y_0).T_4).method_33571(), (class06889)class061452.y(), (class05849)class05849.field_17558, (class05835)class05835.field_1348)) {
                return;
            }
            this.N(class070492, class081722);
        }
        finally {
            this.t();
        }
    }

    @class11782
    public void N(class11373 class113732) {
        this.T();
        if (!((Boolean)((class11507)this.R_7).i()).booleanValue() || !((Boolean)this.M_2).booleanValue()) {
            return;
        }
        this.M_2 = false;
        class11322.i();
    }

    private boolean N(class11915 class119152, class07049 class070492, class06889 class068892, double d) {
        this.T();
        if (((class04453)((class06202)this.y_0).T_4).method_6047().N(class06570.Gm) && class119152.i() < 1.0) {
            return true;
        }
        if (class119152.i() < 1.0) {
            return false;
        }
        if (((Boolean)((class04453)((class06202)this.y_0).T_4).R_6).booleanValue()) {
            this.L_3 = 1;
        }
        this.L_4 = 3;
        class07438 class074382 = class119152.u().i();
        class06889 class068894 = class074382.method_33571();
        if (!class11892.N((class06889)class068894, (class06889)class068892, (class05849)class05849.field_17558, (class05835)class05835.field_1348)) {
            return false;
        }
        class00734 class007342 = class074382.method_5829().L(class119152.u().N()).M(0.1);
        if (((class03448)((class06202)this.y_0).T_3).u(class007342)) {
            return false;
        }
        double d2 = class070492.method_23317() - class070492.field_6014;
        double d3 = class070492.method_23318() - class070492.field_6036;
        double d4 = class070492.method_23321() - class070492.field_5969;
        return class070492.method_5829().u(d2, d3, d4).y(class068894, class068892.y(d2, d3, d4)).map(class068893 -> class068893.R(class068894) < d).orElse(true);
    }

    @class11782(y=class11777.AFTER_ALL)
    public void N(class11385 class113852) {
        this.T();
        if ((Integer)this.L_3 > 0) {
            this.L_3 = (Integer)this.L_3 - 1;
            class113852.B(false);
        }
        if ((Integer)this.L_4 > 0) {
            this.L_4 = (Integer)this.L_4 - 1;
            class113852.M(false);
        }
    }

    @class11782(y=class11777.BEFORE)
    public void N(class11380 class113802) {
        this.T();
        if ((class04453)((class06202)this.y_0).T_4 == null || this.m()) {
            return;
        }
        if ((Integer)this.M_1 > 0) {
            this.M_1 = (Integer)this.M_1 - 1;
        }
        this.M_0 = this.v();
        class08172 class081722 = (class08172)((class04453)((class06202)this.y_0).T_4).method_6047().method_58694(class02484.c);
        if (class081722 != null) {
            this.N(class081722);
        } else {
            this.s();
        }
    }

    @class11782
    public void N(class11382 class113822) {
        this.T();
        if (!((Boolean)((class11507)this.R_7).i()).booleanValue() || ((class04453)((class06202)this.y_0).T_4).field_6017 < 1.0) {
            return;
        }
        int n = class11281.R((class06581)class06570.Gm);
        if (class11281.y((int)n)) {
            return;
        }
        class11322.N((int)n);
        this.M_2 = true;
    }

    private boolean N(class07049 class070492) {
        boolean bl;
        class07438 class074382;
        this.T();
        if (((Boolean)this.L_6).booleanValue() && class070492 instanceof class07438 && class11907.N((class07438)(class074382 = (class07438)class070492), (class07049)((class04453)((class06202)this.y_0).T_4))) {
            return true;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_75202(((class04453)((class06202)this.y_0).T_4).method_6047(), 0)) {
            return false;
        }
        if (class11315.N((int)this.Y())) {
            return false;
        }
        boolean bl2 = class11315.y();
        if (this.n() && bl2 && !((Boolean)this.M_0).booleanValue()) {
            if (((class04453)((class06202)this.y_0).T_4).field_6017 == 0.0) {
                return false;
            }
            if (!((class11535)this.R_2).U()) {
                class11915 class119152 = class11899.N((int)1);
                if (this.N(class119152)) {
                    if (((class11535)this.R_4).U()) {
                        this.L_4 = 1;
                        ((class04453)((class06202)this.y_0).T_4).method_5728(false);
                    } else {
                        this.L_3 = 1;
                    }
                }
                if (((Boolean)((class04453)((class06202)this.y_0).T_4).R_6).booleanValue()) {
                    return false;
                }
            }
        }
        if (class11315.N((boolean)this.n()) && bl2) {
            return false;
        }
        boolean bl3 = bl = (Boolean)this.M_0 != false && ((class04453)((class06202)this.y_0).T_4).field_6017 > (double)1.3f && (Integer)this.M_1 <= 0;
        if (!bl && class11315.L()) {
            return false;
        }
        return !this.L(class070492);
    }

    private void N(class07049 class070492, class08172 class081722) {
        this.T();
        int n = class11315.N();
        if (((Boolean)this.L_6).booleanValue()) {
            class07438 class074382;
            this.L_6 = false;
            if (class070492 instanceof class07438 && class11907.N((class07438)(class074382 = (class07438)class070492), (class07049)((class04453)((class06202)this.y_0).T_4))) {
                class11907.y((class07438)class074382);
                return;
            }
        }
        if (((class04453)((class06202)this.y_0).T_4).method_6039()) {
            ((class03443)((class06202)this.y_0).T_2).y((class08036)((class04453)((class06202)this.y_0).T_4));
        }
        boolean bl = ((class04453)((class06202)this.y_0).T_4).method_6047().N(class06570.Gm);
        if (class081722 != null) {
            if (((class03443)((class06202)this.y_0).T_2).Z()) {
                return;
            }
            ((class03443)((class06202)this.y_0).T_2).N(class081722);
        } else {
            ((class03443)((class06202)this.y_0).T_2).N((class08036)((class04453)((class06202)this.y_0).T_4), class070492);
        }
        ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
        this.L_5 = (Integer)this.L_5 + 1;
        if (class070492 instanceof class07438) {
            TargetEsp.N((class07438)class070492, 15);
            if (((Boolean)((class11507)this.R_6).i()).booleanValue()) {
                this.L_6 = true;
            }
        }
        if (bl) {
            this.M_1 = 20;
        }
        this.u(n);
    }

    public boolean N(class11915 class119152) {
        return (Boolean)((class04453)((class06202)this.y_0).T_4).R_6 != false && !class11315.N((int)(this.Y() - 1)) && class119152.i() > 0.0 && !class11315.N((float)1.5f);
    }

    private int Y() {
        this.T();
        return 10 + (Integer)this.L_0;
    }
}

