/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10903
 *  Nursultan.class11067
 *  Nursultan.class11072
 *  Nursultan.class11080
 *  Nursultan.class11106
 *  Nursultan.class11385
 *  Nursultan.class11512
 *  Nursultan.class11517
 *  Nursultan.class11524
 *  Nursultan.class11535
 *  Nursultan.class11777
 *  Nursultan.class11782
 *  Nursultan.class11902
 *  Nursultan.class11938
 *  Nursultan.class12000
 *  Nursultan.class12001
 *  Nursultan.class12024
 *  Nursultan.class12029
 *  Nursultan.class12032
 *  Nursultan.class12034
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class06202
 */
package Nursultan;

import Nursultan.class10903;
import Nursultan.class11067;
import Nursultan.class11072;
import Nursultan.class11080;
import Nursultan.class11106;
import Nursultan.class11385;
import Nursultan.class11512;
import Nursultan.class11517;
import Nursultan.class11524;
import Nursultan.class11535;
import Nursultan.class11777;
import Nursultan.class11782;
import Nursultan.class11902;
import Nursultan.class11938;
import Nursultan.class12000;
import Nursultan.class12001;
import Nursultan.class12024;
import Nursultan.class12029;
import Nursultan.class12032;
import Nursultan.class12034;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class06202;

@class11080(L="ScreenWalk", y=class11072.MOVEMENT, N=class11106.BASE)
public class ScreenWalk
extends class11067 {
    public Object L_0;

    private void P() {
    }

    public ScreenWalk() {
        this.P();
        this.L_0 = (class11517)class11524.N((class11512)this, (String)"mode", (class11535[])new class10903[]{new class10903("ft", false, (class12001)new class12024()), new class10903("matrix", false, (class12001)new class12032()), new class10903("hw", false, (class12001)new class12000()), new class10903("spooky", false, (class12001)new class12034()), new class10903("vanilla", true, (class12001)class12029.y_0)}).N_6((class115362, class109032) -> this.N((class10903)class109032));
    }

    public boolean Z() {
        this.P();
        class11938.m().N((class12001)((class10903)((class11517)this.L_0).i()).N_0);
        return super.Z();
    }

    public boolean i() {
        class11938.m().N((class12001)class12029.y_0);
        return super.i();
    }

    private void N(class10903 class109032) {
        if (this.U()) {
            class11938.m().N((class12001)class109032.N_0);
        }
    }

    @class11782(y=class11777.BEFORE)
    public void N(class11385 class113852) {
        if ((class05096)((class06202)this.y_0).v_3 == null || class11902.y()) {
            return;
        }
        class113852.B(class11902.N((int)((class05630)((class06202)this.y_0).i_7).n.N.y()));
        class113852.u(class11902.N((int)((class05630)((class06202)this.y_0).i_7).G.N.y()));
        class113852.R(class11902.N((int)((class05630)((class06202)this.y_0).i_7).l.N.y()));
        class113852.L(class11902.N((int)((class05630)((class06202)this.y_0).i_7).t.N.y()));
        class113852.i(class11902.N((int)((class05630)((class06202)this.y_0).i_7).d.N.y()));
        class113852.M(class11902.N((int)((class05630)((class06202)this.y_0).i_7).k.N.y()));
    }
}

