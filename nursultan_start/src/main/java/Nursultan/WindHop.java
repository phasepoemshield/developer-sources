/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10890
 *  Nursultan.class10908
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11281
 *  Nursultan.class11297
 *  Nursultan.class11322
 *  Nursultan.class11328
 *  Nursultan.class11385
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11499
 *  Nursultan.class11505
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11522
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11534
 *  Nursultan.class11782
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  minecraft.class03443
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07510
 *  minecraft.class07843
 */
package Nursultan;

import Nursultan.class10890;
import Nursultan.class10908;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11297;
import Nursultan.class11322;
import Nursultan.class11328;
import Nursultan.class11385;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11499;
import Nursultan.class11505;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11522;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11534;
import Nursultan.class11782;
import Nursultan.class11938;
import Nursultan.class12002;
import java.util.ArrayDeque;
import java.util.Deque;
import minecraft.class03443;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07510;
import minecraft.class07843;

@class11080(L="WindHop", y=class11072.MOVEMENT, N=class11106.TOOLS)
public class WindHop
extends class11067 {
    public Object L_0;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public Object u_6;
    public Object u_7;
    public boolean u_init;
    public static Object i_0;
    public static Object i_1;
    public static Object i_2;
    public static Object i_3;
    public static Object i_4;

    public WindHop() {
        this.m();
        this.u_0 = class11524.N((class11512)this, (String)"auto-jump", (boolean)true);
        this.u_1 = class11524.N((class11512)this, (String)"jump-key", (class12002)class12002.UNKNOWN);
        this.u_2 = class11524.N((class11512)this, (String)"combo-key", (class12002)class12002.UNKNOWN);
        this.u_3 = class11328.N((class06581)class06570.Gz);
        this.u_4 = class11328.N((class06581)class06570.nz);
        this.u_5 = new ArrayDeque();
    }

    static {
        WindHop.v();
    }

    public boolean i() {
        this.m();
        ((Deque)this.u_5).clear();
        this.L_0 = null;
        this.u_6 = false;
        this.u_7 = false;
        class11322.i();
        return true;
    }

    private void n() {
        this.m();
        class10890 class108902 = (class10890)((Deque)this.u_5).poll();
        if (class108902 == null) {
            return;
        }
        this.N(class108902);
    }

    private void m() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_6 = false;
            this.u_7 = false;
        }
    }

    private static void v() {
        i_0 = 90;
        i_1 = -90;
        i_2 = 5;
        i_3 = 10;
        i_4 = 2;
    }

    private void N(class10890 class108902) {
        this.m();
        class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_6079();
        if (class108902.y().test((Object)class065842) && !((class04453)((class06202)this.y_0).T_4).method_7357().N(class065842)) {
            this.L_0 = new class10908(-1, -1, class07050.field_5810, class108902.L(), class108902.N(), class108902.u());
            return;
        }
        class11297 class112972 = class11281.N((class11328)class108902.y());
        if (class112972 == null || ((class04453)((class06202)this.y_0).T_4).method_7357().N(class112972.N())) {
            ((Deque)this.u_5).clear();
            this.u_7 = false;
            return;
        }
        int n = class112972.y();
        if (class11281.u((int)n)) {
            this.L_0 = new class10908(n, -1, class07050.field_5808, class108902.L(), class108902.N(), class108902.u());
            return;
        }
        int n2 = ((class04453)((class06202)this.y_0).T_4).method_31548().M();
        class11938.m().N(0, n, n2, class07510.field_7791).y(class062022 -> {
            this.m();
            this.L_0 = new class10908(n2, n, class07050.field_5808, class108902.L(), class108902.N(), class108902.u());
        }).y();
    }

    private void N(class07050 class070502) {
        ((class03443)((class06202)this.y_0).T_2).N((class03448)((class06202)this.y_0).T_3, n -> new class07843(class070502, n, ((class04453)((class06202)this.y_0).T_4).method_36454(), ((class04453)((class06202)this.y_0).T_4).method_36455()));
        ((class04453)((class06202)this.y_0).T_4).method_6104(class070502);
    }

    @class11782
    public void N(class10992 class109922) {
        int n;
        this.m();
        if ((class10908)this.L_0 == null) {
            return;
        }
        class11534.N((class11499)new class11499(class11505.N().y(), (float)((class10908)this.L_0).N()).N(class11522.staticFields_05ffa7eec8dd73e94b3c68970de658457_0).u(true));
        if (Math.abs(((class04453)((class06202)this.y_0).T_4).method_36455() - (float)((class10908)this.L_0).N()) > 5.0f) {
            return;
        }
        if (((class10908)this.L_0).y()) {
            class11938.Z().N(() -> {
                this.m();
                this.u_6 = true;
            });
        }
        if ((n = ((class10908)this.L_0).i()) != -1) {
            class11322.N((int)n);
        }
        this.N(((class10908)this.L_0).L());
        int n2 = ((class10908)this.L_0).u();
        class11938.Z().y(4, () -> {
            class11322.i();
            if (n2 != -1 && n != -1) {
                class11938.m().N(0, n2, n, class07510.field_7791).y();
            }
        });
        int n3 = ((class10908)this.L_0).R();
        this.L_0 = null;
        if (((Deque)this.u_5).isEmpty()) {
            this.u_7 = false;
        } else {
            class11938.Z().y(Math.max(1, n3), this::n);
        }
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.m();
        if ((class04453)((class06202)this.y_0).T_4 == null || (class03448)((class06202)this.y_0).T_3 == null) {
            return;
        }
        if ((class10908)this.L_0 != null || !((Deque)this.u_5).isEmpty()) {
            return;
        }
        if (((class11527)this.u_1).N((class11389)class114002)) {
            ((Deque)this.u_5).add(new class10890((class11328)this.u_3, 90, true, 0));
            class11938.Z().N(this::n);
            return;
        }
        if (((class11527)this.u_2).N((class11389)class114002)) {
            this.u_7 = true;
            ((Deque)this.u_5).add(new class10890((class11328)this.u_3, 90, true, 10));
            ((Deque)this.u_5).add(new class10890((class11328)this.u_4, -90, false, 1));
            ((Deque)this.u_5).add(new class10890((class11328)this.u_3, -90, false, 0));
            class11938.Z().N(this::n);
        }
    }

    @class11782
    public void N(class11385 class113852) {
        this.m();
        if (((Boolean)this.u_7).booleanValue()) {
            class113852.B(false);
            class113852.u(false);
            class113852.L(false);
            class113852.R(false);
            class113852.M(false);
            class113852.y(false);
        }
        if (!((Boolean)this.u_6).booleanValue()) {
            return;
        }
        if (((Boolean)((class11507)this.u_0).i()).booleanValue()) {
            class113852.i(true);
            this.u_6 = false;
        }
    }
}

