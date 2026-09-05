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
 *  Nursultan.class11366
 *  Nursultan.class11385
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11896
 *  Nursultan.class11907
 *  Nursultan.class11919
 *  Nursultan.class11933
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  minecraft.class02484
 *  minecraft.class04453
 *  minecraft.class04474
 *  minecraft.class06202
 *  minecraft.class06570
 *  minecraft.class06584
 *  minecraft.class07050
 *  minecraft.class07085
 *  minecraft.class07510
 */
package Nursultan;

import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11281;
import Nursultan.class11322;
import Nursultan.class11366;
import Nursultan.class11385;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11896;
import Nursultan.class11907;
import Nursultan.class11919;
import Nursultan.class11933;
import Nursultan.class11938;
import Nursultan.class12002;
import minecraft.class02484;
import minecraft.class04453;
import minecraft.class04474;
import minecraft.class06202;
import minecraft.class06570;
import minecraft.class06584;
import minecraft.class07050;
import minecraft.class07085;
import minecraft.class07510;

@class11080(L="ElytraHelper", y=class11072.MISC, N=class11106.HELPER)
public class ElytraHelper
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
    public Object u_5;
    public boolean u_init;

    private void P() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_1 = 0;
            this.u_2 = false;
            this.u_3 = false;
            this.u_4 = false;
            this.u_5 = false;
        }
    }

    public ElytraHelper() {
        this.P();
        this.L_0 = class11524.N((class11512)this, (String)"swap-key", (class12002)class12002.UNKNOWN);
        this.L_1 = class11524.N((class11512)this, (String)"firework-key", (class12002)class12002.UNKNOWN);
        this.L_2 = new class11535("disabled", true);
        this.L_3 = new class11535("only-space", false);
        this.L_4 = new class11535("always", false);
        this.u_0 = class11524.N((class11512)this, (String)"auto-launch", (class11535[])new class11535[]{(class11535)this.L_2, (class11535)this.L_3, (class11535)this.L_4});
    }

    public boolean m() {
        this.P();
        return class11938.j().y() < (Integer)this.u_1;
    }

    private void v() {
        boolean bl;
        class06584 class065842 = ((class04453)((class06202)this.y_0).T_4).method_6118(class07085.field_6174);
        boolean bl2 = class065842.B() == class06570.sT;
        boolean bl3 = bl = !class065842.R();
        if (bl2) {
            class11896.N((class11933)class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_2).ifPresent(class112972 -> this.y(class112972.y()));
            return;
        }
        if (bl) {
            class11896.N((class11933)class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_0).ifPresent(class112972 -> this.y(class112972.y()));
            return;
        }
        class11896.N((class11933)class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_2).ifPresentOrElse(class112972 -> this.y(class112972.y()), () -> class11896.N((class11933)class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_0).ifPresent(class112972 -> this.y(class112972.y())));
    }

    private void y(int n, int n2) {
        class11938.Z().y(4, () -> class11938.m().N(0, n, n2, class07510.field_7791).y());
    }

    public void y() {
        this.P();
        this.u_5 = false;
        this.u_3 = false;
        this.u_2 = false;
        super.y();
    }

    private void y(int n) {
        if (class11281.u((int)n)) {
            class11322.N((int)n);
            class11907.N((class07050)class07050.field_5808);
            class11322.i();
            return;
        }
        int n2 = class11933.staticFields_0d3a21382a7b83848bd4500e6adef3cae_2.N();
        int n3 = class11281.L((int)n);
        class11938.m().N(0, n3, 0, class07510.field_7791).N(0, n2, 0, class07510.field_7791).N(0, n3, 0, class07510.field_7791).y();
    }

    @class11782
    public void N(class11385 class113852) {
        this.P();
        class11535 class115352 = (class11535)((class11517)this.u_0).i();
        if (class115352 == (class11535)this.L_2 || ((class04453)((class06202)this.y_0).T_4).method_6128() || ((class04453)((class06202)this.y_0).T_4).method_31549().y || !class11281.u(class065842 -> class065842.L(class02484.K)) || ((class04453)((class06202)this.y_0).T_4).fields_17fa3311b0e9d3e9b883d09222919bf5a_1 != 0) {
            return;
        }
        if (class115352 == (class11535)this.L_3) {
            if (((Boolean)((class04453)((class06202)this.y_0).T_4).R_3).booleanValue() || !((Boolean)this.u_4).booleanValue()) {
                return;
            }
            class113852.i(false);
            return;
        }
        if (((Boolean)((class04453)((class06202)this.y_0).T_4).R_3).booleanValue()) {
            class113852.i(true);
            return;
        }
        this.u_5 = (Boolean)this.u_5 == false;
        class113852.i(((Boolean)this.u_5).booleanValue());
    }

    @class11782
    public void N(class11366 class113662) {
        if (class11938.m().u()) {
            class113662.N();
        }
    }

    @class11782
    public void N(class10992 class109922) {
        this.P();
        this.u_4 = ((class04474)((class04453)((class06202)this.y_0).T_4).L_1).field_54155.i();
        if (((Boolean)this.u_2).booleanValue() && !class11938.m().u()) {
            this.G();
            this.u_2 = false;
        }
        if (((Boolean)this.u_3).booleanValue() && !class11938.m().u()) {
            this.v();
            this.u_3 = false;
        }
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.P();
        if (((class11527)this.L_0).N((class11389)class114002)) {
            this.u_3 = true;
        }
        if (((class11527)this.L_1).N((class11389)class114002)) {
            this.u_2 = true;
        }
    }

    public void N(int n) {
        this.P();
        this.u_1 = class11938.j().y() + n;
    }

    private void G() {
        if (this.m()) {
            return;
        }
        class11919.N(() -> this.N(10), this::y);
    }
}

