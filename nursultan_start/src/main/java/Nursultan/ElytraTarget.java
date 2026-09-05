/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10901
 *  Nursultan.class10905
 *  Nursultan.class10913
 *  Nursultan.class10921
 *  Nursultan.class10924
 *  Nursultan.class10992
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11389
 *  Nursultan.class11400
 *  Nursultan.class11499
 *  Nursultan.class11504
 *  Nursultan.class11505
 *  Nursultan.class11507
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11527
 *  Nursultan.class11535
 *  Nursultan.class11782
 *  Nursultan.class11810
 *  Nursultan.class11820
 *  Nursultan.class11895
 *  Nursultan.class11908
 *  Nursultan.class11919
 *  Nursultan.class11938
 *  Nursultan.class12002
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07438
 */
package Nursultan;

import Nursultan.class10901;
import Nursultan.class10905;
import Nursultan.class10913;
import Nursultan.class10921;
import Nursultan.class10924;
import Nursultan.class10992;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11389;
import Nursultan.class11400;
import Nursultan.class11499;
import Nursultan.class11504;
import Nursultan.class11505;
import Nursultan.class11507;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11527;
import Nursultan.class11535;
import Nursultan.class11782;
import Nursultan.class11810;
import Nursultan.class11820;
import Nursultan.class11895;
import Nursultan.class11908;
import Nursultan.class11919;
import Nursultan.class11938;
import Nursultan.class12002;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07438;

@class11080(L="ElytraTarget", y=class11072.MOVEMENT, N=class11106.BASE)
public class ElytraTarget
extends class11067 {
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object u_0;
    public Object u_1;
    public Object u_2;
    public Object u_3;
    public Object u_4;
    public Object u_5;
    public boolean u_init;

    public ElytraTarget() {
        this.m();
        this.L_0 = class11524.N((class11512)this, (String)"chase-distance", (float)50.0f, (float)10.0f, (float)200.0f, (float)5.0f);
        this.L_1 = class11524.N((class11512)this, (String)"overtake", (boolean)true);
        this.L_2 = (class11504)class11524.N((class11512)this, (String)"overtake-distance", (float)5.0f, (float)0.0f, (float)6.0f, (float)1.0f).N(class115362 -> {
            this.m();
            return (Boolean)((class11507)this.L_1).i();
        });
        this.u_0 = new class10921(this, "timing-firework-use", false);
        this.u_1 = new class10901(this, "bind-firework-use", false);
        this.u_2 = class11524.N((class11512)this, (String)"firework-use", (class11535[])new class10905[]{new class10913(this, "none-firework-use", true), new class10924(this, "auto-firework-use", false), (class10901)this.u_1, (class10921)this.u_0});
        this.u_3 = (class11504)class11524.N((class11512)this, (String)"delay-ticks", (float)20.0f, (float)2.0f, (float)60.0f, (float)1.0f).N(class115362 -> {
            this.m();
            return ((class10921)this.u_0).U();
        });
        this.u_4 = (class11527)class11524.N((class11512)this, (String)"manual-hotkey", (class12002)class12002.UNKNOWN).N(class115362 -> {
            this.m();
            return ((class10901)this.u_1).U();
        });
    }

    private void m() {
        if (!this.u_init) {
            this.u_init = true;
            this.u_5 = false;
        }
    }

    public void y() {
        this.m();
        this.u_5 = false;
        super.y();
    }

    @class11782
    public void N(class11810 class118102) {
        this.m();
        if (!class11919.N()) {
            return;
        }
        class118102.N(((Float)((class11504)this.L_0).i()).floatValue());
    }

    @class11782
    public void N(class10992 class109922) {
        this.m();
        if (!class11938.u().C().s()) {
            return;
        }
        ((class10905)((class11517)this.u_2).i()).y((Object)class109922);
    }

    @class11782
    public void N(class11820 class118202) {
        this.m();
        if (!class11919.N()) {
            return;
        }
        class07438 class074382 = class118202.y();
        class11499 class114992 = class11505.N((class11499)class11505.N(), (class06889)class11895.N((class07049)class074382));
        if (!class118202.L() && class074382.method_6128() && ((Boolean)((class11507)this.L_1).i()).booleanValue()) {
            class06889 class068892 = class074382.method_73189();
            class06889 class068893 = class074382.method_5720().u().L((double)((Float)((class11504)this.L_2).i()).floatValue()).i(class068892);
            class074382.method_5814(class068893.M, class068893.B, class068893.Z);
            class114992 = class11505.N((class11499)class11505.N(), (class06889)class11895.N((class07049)class074382));
            class074382.method_5814(class068892.M, class068892.B, class068892.Z);
        }
        class118202.N(class11505.N().N(class114992.y() + class11908.y((float)-1.0f, (float)1.0f), class114992.R() + class11908.y((float)-1.0f, (float)1.0f)).N(true));
    }

    @class11782(u=true)
    public void N(class11400 class114002) {
        this.m();
        if (!((class11527)this.u_4).N((class11389)class114002) || !((class04453)((class06202)this.y_0).T_4).method_6128()) {
            return;
        }
        this.u_5 = true;
    }
}

