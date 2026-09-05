/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10891
 *  Nursultan.class10927
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11322
 *  Nursultan.class11328
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11499
 *  Nursultan.class11504
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11522
 *  Nursultan.class11523
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11534
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11799
 *  Nursultan.class11892
 *  Nursultan.class11907
 *  Nursultan.class11910
 *  Nursultan.class11929
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class03556
 *  minecraft.class04453
 *  minecraft.class04995
 *  minecraft.class05835
 *  minecraft.class05849
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class06889
 *  minecraft.class07047
 *  minecraft.class07050
 *  minecraft.class07055
 *  minecraft.class07084
 *  minecraft.class07482
 *  minecraft.class07510
 *  minecraft.class07843
 */
package Nursultan;

import Nursultan.class10891;
import Nursultan.class10927;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11328;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11499;
import Nursultan.class11504;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11522;
import Nursultan.class11523;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11534;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11799;
import Nursultan.class11892;
import Nursultan.class11907;
import Nursultan.class11910;
import Nursultan.class11929;
import Nursultan.class11938;
import Nursultan.class12002;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class03556;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05835;
import minecraft.class05849;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class06889;
import minecraft.class07047;
import minecraft.class07050;
import minecraft.class07055;
import minecraft.class07084;
import minecraft.class07482;
import minecraft.class07510;
import minecraft.class07843;

@class11080(L="AutoPotion", y=class11072.PLAYER, N=class11106.AUTO)
public class AutoPotion
extends class11067 {
    public static Object L_0;
    public static Object L_1;
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
    public boolean i_init;
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
    public Object M_3;
    public boolean M_init;

    private void P() {
        this.n();
        if (!((Boolean)this.M_0).booleanValue() && class11281.y((int)((Integer)this.i_3))) {
            return;
        }
        if (class11938.j().y() - (Integer)this.i_5 < 1) {
            return;
        }
        this.G();
        if (((class11535)this.i_0).U()) {
            this.N(false);
        }
    }

    private void Q() {
        this.n();
        if (class11281.y((int)((Integer)this.i_3))) {
            return;
        }
        class11938.m().N(0, ((Integer)this.i_4).intValue(), ((Integer)this.i_3).intValue(), class07510.field_7791).y();
        this.i_4 = -1;
        this.i_3 = -1;
    }

    public AutoPotion() {
        this.n();
        this.R_0 = new class10891("speed-potion", true, class044532 -> !class044532.method_6059(class07047.N), class065842 -> class065842.N(class06570.lO) && this.N((class06584)class065842, (class03556<class07084>)class07047.N));
        this.R_1 = new class10891("strength-potion", true, class044532 -> !class044532.method_6059(class07047.i), class065842 -> class065842.N(class06570.lO) && this.N((class06584)class065842, (class03556<class07084>)class07047.i));
        this.R_2 = new class10891("fire-resistance-potion", true, class044532 -> !class044532.method_6059(class07047.E), class065842 -> class065842.N(class06570.lO) && this.N((class06584)class065842, (class03556<class07084>)class07047.E));
        this.R_3 = new class10891("healing-potion", false, class044532 -> {
            this.n();
            return (Boolean)this.M_2 != false || class044532.method_6032() < ((Float)((class11504)this.R_5).i()).floatValue();
        }, class065842 -> class065842.N(class06570.lO) && this.N((class06584)class065842, (class03556<class07084>)class07047.R));
        this.R_4 = class11524.y((class11512)this, (String)"potions", (class11535[])new class10891[]{(class10891)this.R_1, (class10891)this.R_0, (class10891)this.R_2, (class10891)this.R_3});
        this.R_5 = (class11504)class11524.N((class11512)this, (String)"heal-health", (float)10.0f, (float)0.0f, (float)20.0f, (float)0.5f).N(class115362 -> {
            this.n();
            return ((class10891)this.R_3).U();
        });
        this.R_6 = (class11527)class11524.N((class11512)this, (String)"heal-key", (class12002)class12002.UNKNOWN).N(class115362 -> {
            this.n();
            return ((class10891)this.R_3).U();
        });
        this.R_7 = new class11535("single", true);
        this.u_0 = new class11535("multi", false);
        this.u_1 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11535[]{(class11535)this.R_7, (class11535)this.u_0});
        this.u_2 = class11524.N((class11512)this, (String)"hotbar-only", (boolean)false);
        this.u_3 = new class11535("only-in-pvp", false);
        this.i_0 = new class11535("disable-after-throw", false);
        this.i_1 = new class11535("exclude-donate-potions", true);
        this.i_2 = class11524.y((class11512)this, (String)"addons", (class11535[])new class11535[]{(class11535)this.u_3, (class11535)this.i_0, (class11535)this.i_1});
        this.i_3 = -1;
        this.i_4 = -1;
        this.i_5 = -1;
    }

    static {
        AutoPotion.m();
    }

    private void b() {
        this.n();
        class11534.N((class11499)((class10927)this.M_3).y());
        if (class11938.j().y() - ((class10927)this.M_3).L() < 1 || ((class04453)((class06202)this.y_0).T_4).method_36455() < 80.0f) {
            return;
        }
        if (!((class11328)((class10927)this.M_3).N().N_1).test((Object)((class06584)((class04453)((class06202)this.y_0).T_4).method_31548().u().get(((class10927)this.M_3).u())))) {
            this.Y();
            return;
        }
        this.N(((class10927)this.M_3).u(), ((class10927)this.M_3).y(), ((class10927)this.M_3).N());
        this.M_3 = null;
    }

    private void n() {
        if (!this.i_init) {
            this.i_init = true;
            this.i_3 = 0;
            this.i_4 = 0;
            this.i_5 = 0;
        }
        if (!this.M_init) {
            this.M_init = true;
            this.M_0 = false;
            this.M_1 = false;
            this.M_2 = false;
        }
    }

    private boolean l() {
        this.n();
        if (((class11535)this.u_3).U() && !class11907.u()) {
            return true;
        }
        if (((class11799)((class03443)((class06202)this.y_0).T_2)).N() < 3) {
            return true;
        }
        if (class11910.B() && ((class04453)((class06202)this.y_0).T_4).field_6012 < 110) {
            return true;
        }
        return ((class04453)((class06202)this.y_0).T_4).method_6115();
    }

    private static void m() {
        L_0 = 1;
        L_1 = 1;
    }

    private boolean v() {
        this.n();
        return (Boolean)((class11507)this.u_2).i() == false;
    }

    private void y(int n, class11499 class114992, class10891 class108912) {
        this.n();
        this.M_1 = true;
        boolean bl = class11281.y((int)((Integer)this.i_3));
        int n2 = bl ? ((class04453)((class06202)this.y_0).T_4).method_31548().M() : ((Integer)this.i_3).intValue();
        class11938.m().N(0, n, n2, class07510.field_7791).y(class062022 -> {
            this.n();
            if (bl) {
                this.i_4 = n;
                this.i_3 = n2;
            }
            this.M_3 = new class10927(n2, class114992, class108912, class11938.j().y());
            this.M_1 = false;
        }).y();
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.n();
        if (((class10891)this.R_3).U() && ((class11527)this.R_6).N((class11389)class114002)) {
            this.M_2 = true;
        }
    }

    private void N(int n2, class11499 class114992, class10891 class108912) {
        this.n();
        class11322.N((int)n2);
        ((class03443)((class06202)this.y_0).T_2).N((class03448)((class06202)this.y_0).T_3, n -> new class07843(class07050.field_5808, n, class114992.y(), class114992.R()));
        ((class04453)((class06202)this.y_0).T_4).method_6104(class07050.field_5808);
        class108912.N(10);
        if (class108912 == (class10891)this.R_3) {
            this.M_2 = false;
        }
        this.M_0 = true;
        this.i_5 = class11938.j().y();
    }

    @class11782(y=class11777.AFTER)
    public void N(class10992 class109922) {
        this.n();
        if (((Boolean)this.M_1).booleanValue()) {
            return;
        }
        if ((class07482)((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_3 != ((class04453)((class06202)this.y_0).T_4).fields_07fa3311b0e9d3e9b883d09222919bf5a_2 || class11938.m().u()) {
            return;
        }
        if ((class10927)this.M_3 != null) {
            if (this.l()) {
                this.Y();
            } else {
                this.b();
            }
            return;
        }
        if (this.l()) {
            this.P();
            return;
        }
        class06889 class068892 = ((class04453)((class06202)this.y_0).T_4).method_73189();
        if (class11892.N((class06889)class068892, (class06889)class068892.y(0.0, -1.0, 0.0), (class05849)class05849.field_17558, (class05835)class05835.field_1348)) {
            this.P();
            return;
        }
        boolean bl = false;
        for (class10891 class108912 : (List)((class11523)this.R_4).i()) {
            int n;
            if (class108912.N() || !((Predicate)class108912.N_0).test((class04453)((class06202)this.y_0).T_4)) continue;
            int n2 = class11281.y((class11328)((class11328)class108912.N_1));
            int n3 = n = class11281.y((int)n2) && this.v() ? class11281.R((class11328)((class11328)class108912.N_1)) : -1;
            if (class11281.y((int)n2) && class11281.y((int)n)) continue;
            class11499 class114992 = new class11499(((class04453)((class06202)this.y_0).T_4).method_36454() + class04995.m((double)((class04453)((class06202)this.y_0).T_4).field_6012) * 17.0f, 90.0f).N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0);
            class11534.N((class11499)class114992);
            if (((class04453)((class06202)this.y_0).T_4).method_36455() < 80.0f) {
                return;
            }
            if (class11281.y((int)n2)) {
                this.y(n, class114992, class108912);
                return;
            }
            this.N(n2, class114992, class108912);
            bl = true;
            if (!((class11535)this.R_7).U()) continue;
            return;
        }
        if (!bl) {
            this.P();
        }
    }

    @SafeVarargs
    private boolean N(class06584 class065842, class03556<class07084> ... class03556Array) {
        this.n();
        if (!((class11535)this.i_1).U()) {
            return class11929.N((class06584)class065842, class03556Array);
        }
        Iterable var3 = class11929.B((class06584)class065842).N();
        if (!var3.iterator().hasNext()) {
            return false;
        }
        for (class07055 class070552 : var3) {
            if (!Arrays.stream(class03556Array).noneMatch(class035562 -> class070552.L().N(class035562))) continue;
            return false;
        }
        return true;
    }

    private void G() {
        this.n();
        if (((Boolean)this.M_0).booleanValue()) {
            class11322.i();
            this.M_0 = false;
        }
        this.Q();
    }

    private void Y() {
        this.n();
        this.M_3 = null;
        this.G();
    }
}

