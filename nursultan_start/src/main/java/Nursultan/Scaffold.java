/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10992
 *  Nursultan.class11003
 *  Nursultan.class11006
 *  Nursultan.class11022
 *  Nursultan.class11024
 *  Nursultan.class11027
 *  Nursultan.class11053
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11385
 *  Nursultan.class11494
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11525
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11807
 *  minecraft.class04453
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class10992;
import Nursultan.class11003;
import Nursultan.class11006;
import Nursultan.class11022;
import Nursultan.class11024;
import Nursultan.class11027;
import Nursultan.class11053;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11385;
import Nursultan.class11494;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11525;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11807;
import minecraft.class04453;
import minecraft.class06202;

@class11080(L="Scaffold", y=class11072.PLAYER, N=class11106.BASE)
public class Scaffold
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public Object L_4;
    public Object L_5;

    public boolean P() {
        this.b();
        return (Boolean)((class11507)this.L_4).i();
    }

    public Scaffold() {
        this.b();
        this.L_0 = new class11022(this, "telly", false);
        this.L_1 = class11524.N((class11512)this, (String)"mode", (class11535[])new class11053[]{new class11027(this, "grim", true), new class11003(this, "basic", false), (class11022)this.L_0});
        this.L_2 = (class11507)class11524.N((class11512)this, (String)"auto-jump", (boolean)true).N(class115362 -> {
            this.b();
            return ((class11022)this.L_0).U();
        });
        this.L_3 = class11524.N((class11512)this, (String)"safe-walk", (class11535[])new class11807[]{new class11024(this, "sneak", true), new class11006(this, "none", false)});
        this.L_4 = class11524.N((class11512)this, (String)"save-y", (boolean)true);
        this.L_5 = class11524.N((class11512)this, (String)"delay", (class11494)new class11494(0.0f, 6.0f), (class11494)new class11494(0.0f, 3.0f), (float)1.0f);
    }

    public boolean Z() {
        this.b();
        return ((class11053)((class11517)this.L_1).i()).i();
    }

    public boolean i() {
        this.b();
        if ((class04453)((class06202)this.y_0).T_4 == null) {
            return super.i();
        }
        return ((class11053)((class11517)this.L_1).i()).M();
    }

    private void b() {
    }

    public class11494 m() {
        this.b();
        return (class11494)((class11525)this.L_5).i();
    }

    private boolean y(class11385 class113852) {
        this.b();
        if (!((class11022)this.L_0).U() || !((Boolean)((class11507)this.L_2).i()).booleanValue() || class113852.R()) {
            return false;
        }
        if (!(class113852.i() || class113852.M() || class113852.u() || class113852.Z())) {
            return false;
        }
        if (((class04453)((class06202)this.y_0).T_4).method_24828()) {
            class113852.i(true);
        }
        return true;
    }

    @class11782
    public void N(class11385 class113852) {
        this.b();
        if (this.y(class113852)) {
            return;
        }
        ((class11807)((class11517)this.L_3).i()).y((Object)class113852);
    }

    @class11782
    public void N(class10992 class109922) {
        this.b();
        ((class11053)((class11517)this.L_1).i()).L();
    }
}

